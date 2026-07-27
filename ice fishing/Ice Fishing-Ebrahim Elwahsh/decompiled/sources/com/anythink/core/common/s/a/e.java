package com.anythink.core.common.s.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f16485a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.anythink.core.common.s.a.e$1, reason: invalid class name */
    public class AnonymousClass1 extends b {
        public AnonymousClass1(String str, a aVar) {
            super(str, aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f16488c.execute(this.f16489d);
            } finally {
                e.this.f16485a.remove(this.f16487b);
            }
        }
    }

    public interface a {
        void execute(AtomicBoolean atomicBoolean);
    }

    public static abstract class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final String f16487b;

        /* renamed from: c, reason: collision with root package name */
        final a f16488c;

        /* renamed from: d, reason: collision with root package name */
        AtomicBoolean f16489d = new AtomicBoolean();

        public b(String str, a aVar) {
            this.f16487b = str;
            this.f16488c = aVar;
        }
    }

    private b b(String str, a aVar) {
        return new AnonymousClass1(str, aVar);
    }

    public final boolean a() {
        return !this.f16485a.isEmpty();
    }

    public final boolean a(String str) {
        b bVar = this.f16485a.get(str);
        if (bVar == null) {
            return false;
        }
        bVar.f16489d.set(true);
        return true;
    }

    public final void a(String str, a aVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, aVar);
        this.f16485a.put(str, anonymousClass1);
        h.a().execute(anonymousClass1);
    }
}
