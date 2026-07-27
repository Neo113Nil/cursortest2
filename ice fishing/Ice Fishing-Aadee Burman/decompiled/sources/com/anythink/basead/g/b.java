package com.anythink.basead.g;

import com.anythink.core.common.a.b;
import com.anythink.core.common.u.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8969a = "b";

    /* renamed from: b, reason: collision with root package name */
    private Map<String, AbstractC0042b> f8970b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f8971a = new b(0);

        private a() {
        }
    }

    /* renamed from: com.anythink.basead.g.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0042b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, Object> f8972a;

        /* renamed from: b, reason: collision with root package name */
        private int f8973b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f8974c = false;

        public AbstractC0042b() {
        }

        public abstract void a();

        public abstract void a(com.anythink.basead.d.f fVar);

        public abstract void a(j jVar);

        public abstract void a(boolean z3);

        public abstract void b();

        public abstract void b(j jVar);

        public abstract void c();

        public void d() {
            if (this.f8974c) {
                return;
            }
            this.f8974c = true;
            Map<String, Object> map = this.f8972a;
            if (map != null) {
                map.put(b.C0074b.f12108a, Integer.valueOf(this.f8973b));
            }
        }

        public final int e() {
            return this.f8973b;
        }

        public final void a(int i) {
            this.f8973b = i;
        }

        public AbstractC0042b(Map<String, Object> map, final String str) {
            this.f8972a = map;
            com.anythink.core.common.u.a.a().a(str, new a.InterfaceC0099a() { // from class: com.anythink.basead.g.b.b.1
                @Override // com.anythink.core.common.u.a.InterfaceC0099a
                public final void a(String str2) {
                    if (!str.equals(str2) || AbstractC0042b.this.f8974c) {
                        return;
                    }
                    AbstractC0042b.this.a(3);
                    AbstractC0042b.this.d();
                }
            });
        }
    }

    public /* synthetic */ b(byte b9) {
        this();
    }

    public static b a() {
        return a.f8971a;
    }

    public final void b(String str) {
        this.f8970b.remove(str);
    }

    private b() {
        this.f8970b = new HashMap(2);
    }

    public final void a(String str, AbstractC0042b abstractC0042b) {
        this.f8970b.put(str, abstractC0042b);
    }

    public final AbstractC0042b a(String str) {
        return this.f8970b.get(str);
    }
}
