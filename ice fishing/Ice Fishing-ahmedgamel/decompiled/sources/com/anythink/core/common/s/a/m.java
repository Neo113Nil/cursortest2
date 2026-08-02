package com.anythink.core.common.s.a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f17162a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Object> f17163b = new ReferenceQueue<>();

    public static class a extends WeakReference<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final String f17164a;

        public a(String str, Object obj, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.f17164a = str;
        }
    }

    public final synchronized Object a(String str) {
        b();
        a aVar = this.f17162a.get(str);
        if (aVar == null) {
            return null;
        }
        return aVar.get();
    }

    public final synchronized void b(String str) {
        this.f17162a.remove(str);
    }

    private void b() {
        a aVar = (a) this.f17163b.poll();
        while (aVar != null) {
            a aVar2 = this.f17162a.get(aVar.f17164a);
            if (aVar2 != null && aVar2.get() == null) {
                this.f17162a.remove(aVar.f17164a);
            }
            aVar = (a) this.f17163b.poll();
        }
    }

    public final synchronized void a(String str, Object obj) {
        try {
            b();
            if (obj != null) {
                a aVar = this.f17162a.get(str);
                if (aVar != null) {
                    if (aVar.get() != obj) {
                    }
                }
                this.f17162a.put(str, new a(str, obj, this.f17163b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f17162a.clear();
        b();
    }
}
