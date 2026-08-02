package com.anythink.core.common.s.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f17114a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.anythink.core.common.s.a.e$1, reason: invalid class name */
    public class AnonymousClass1 extends b {
        public AnonymousClass1(String str, a aVar) {
            super(str, aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f17117c.execute(this.f17118d);
            } finally {
                e.this.f17114a.remove(this.f17116b);
            }
        }
    }

    public interface a {
        void execute(AtomicBoolean atomicBoolean);
    }

    public static abstract class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final String f17116b;

        /* renamed from: c, reason: collision with root package name */
        final a f17117c;

        /* renamed from: d, reason: collision with root package name */
        AtomicBoolean f17118d = new AtomicBoolean();

        public b(String str, a aVar) {
            this.f17116b = str;
            this.f17117c = aVar;
        }
    }

    private b b(String str, a aVar) {
        return new AnonymousClass1(str, aVar);
    }

    public final boolean a() {
        return !this.f17114a.isEmpty();
    }

    public final boolean a(String str) {
        b bVar = this.f17114a.get(str);
        if (bVar == null) {
            return false;
        }
        bVar.f17118d.set(true);
        return true;
    }

    public final void a(String str, a aVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, aVar);
        this.f17114a.put(str, anonymousClass1);
        h.a().execute(anonymousClass1);
    }
}
