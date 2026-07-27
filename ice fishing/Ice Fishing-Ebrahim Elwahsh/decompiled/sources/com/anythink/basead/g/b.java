package com.anythink.basead.g;

import com.anythink.core.common.a.b;
import com.anythink.core.common.u.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9126a = "b";

    /* renamed from: b, reason: collision with root package name */
    private Map<String, AbstractC0041b> f9127b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f9128a = new b(0);

        private a() {
        }
    }

    /* renamed from: com.anythink.basead.g.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0041b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private Map<String, Object> f9129a;

        /* renamed from: b, reason: collision with root package name */
        private int f9130b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f9131c = false;

        public AbstractC0041b() {
        }

        public abstract void a();

        public abstract void a(com.anythink.basead.d.f fVar);

        public abstract void a(j jVar);

        public abstract void a(boolean z8);

        public abstract void b();

        public abstract void b(j jVar);

        public abstract void c();

        public void d() {
            if (this.f9131c) {
                return;
            }
            this.f9131c = true;
            Map<String, Object> map = this.f9129a;
            if (map != null) {
                map.put(b.C0073b.f12265a, Integer.valueOf(this.f9130b));
            }
        }

        public final int e() {
            return this.f9130b;
        }

        public final void a(int i) {
            this.f9130b = i;
        }

        public AbstractC0041b(Map<String, Object> map, final String str) {
            this.f9129a = map;
            com.anythink.core.common.u.a.a().a(str, new a.InterfaceC0098a() { // from class: com.anythink.basead.g.b.b.1
                @Override // com.anythink.core.common.u.a.InterfaceC0098a
                public final void a(String str2) {
                    if (!str.equals(str2) || AbstractC0041b.this.f9131c) {
                        return;
                    }
                    AbstractC0041b.this.a(3);
                    AbstractC0041b.this.d();
                }
            });
        }
    }

    public /* synthetic */ b(byte b9) {
        this();
    }

    public static b a() {
        return a.f9128a;
    }

    public final void b(String str) {
        this.f9127b.remove(str);
    }

    private b() {
        this.f9127b = new HashMap(2);
    }

    public final void a(String str, AbstractC0041b abstractC0041b) {
        this.f9127b.put(str, abstractC0041b);
    }

    public final AbstractC0041b a(String str) {
        return this.f9127b.get(str);
    }
}
