package com.anythink.core.common.n.b;

import com.anythink.core.common.n.b.u;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    final v f16267a;

    /* renamed from: b, reason: collision with root package name */
    final String f16268b;

    /* renamed from: c, reason: collision with root package name */
    final u f16269c;

    /* renamed from: d, reason: collision with root package name */
    final ae f16270d;

    /* renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f16271e;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f16272f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        v f16273a;

        /* renamed from: b, reason: collision with root package name */
        String f16274b;

        /* renamed from: c, reason: collision with root package name */
        u.a f16275c;

        /* renamed from: d, reason: collision with root package name */
        ae f16276d;

        /* renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f16277e;

        public a() {
            this.f16277e = Collections.EMPTY_MAP;
            this.f16274b = "GET";
            this.f16275c = new u.a();
        }

        private a b(String str, String str2) {
            this.f16275c.a(str, str2);
            return this;
        }

        private a c() {
            return a("HEAD", (ae) null);
        }

        private a d() {
            return a("DELETE", com.anythink.core.common.n.b.a.c.f15827e);
        }

        public final a a(v vVar) {
            if (vVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f16273a = vVar;
            return this;
        }

        private a c(ae aeVar) {
            return a("PUT", aeVar);
        }

        public final a b(String str) {
            this.f16275c.b(str);
            return this;
        }

        private a b(ae aeVar) {
            return a("DELETE", aeVar);
        }

        private a d(ae aeVar) {
            return a("PATCH", aeVar);
        }

        public final a a(String str) {
            String str2;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    str2 = "http:" + str.substring(3);
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    str2 = "https:" + str.substring(4);
                } else {
                    str2 = str;
                }
                return a(v.d(str2));
            }
            throw new NullPointerException("url == null");
        }

        public final ad b() {
            if (this.f16273a != null) {
                return new ad(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a(ad adVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f16277e = map;
            this.f16273a = adVar.f16267a;
            this.f16274b = adVar.f16268b;
            this.f16276d = adVar.f16270d;
            this.f16277e = adVar.f16271e.isEmpty() ? map : new LinkedHashMap<>(adVar.f16271e);
            this.f16275c = adVar.f16269c.b();
        }

        private a a(URL url) {
            if (url != null) {
                return a(v.d(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        public final a a(String str, String str2) {
            this.f16275c.d(str, str2);
            return this;
        }

        public final a a(u uVar) {
            this.f16275c = uVar.b();
            return this;
        }

        private a a(d dVar) {
            String dVar2 = dVar.toString();
            return dVar2.isEmpty() ? b("Cache-Control") : a("Cache-Control", dVar2);
        }

        public final a a() {
            return a("GET", (ae) null);
        }

        private a a(ae aeVar) {
            return a("POST", aeVar);
        }

        public final a a(String str, ae aeVar) {
            if (str != null) {
                if (str.length() == 0) {
                    throw new IllegalArgumentException("method.length() == 0");
                }
                if (aeVar != null && !com.anythink.core.common.n.b.a.c.f.c(str)) {
                    throw new IllegalArgumentException(D.x.l("method ", str, " must not have a request body."));
                }
                if (aeVar == null && com.anythink.core.common.n.b.a.c.f.b(str)) {
                    throw new IllegalArgumentException(D.x.l("method ", str, " must have a request body."));
                }
                this.f16274b = str;
                this.f16276d = aeVar;
                return this;
            }
            throw new NullPointerException("method == null");
        }

        private <T> a a(Class<? super T> cls, T t6) {
            if (t6 == null) {
                this.f16277e.remove(cls);
                return this;
            }
            if (this.f16277e.isEmpty()) {
                this.f16277e = new LinkedHashMap();
            }
            this.f16277e.put(cls, cls.cast(t6));
            return this;
        }

        private a a(Object obj) {
            if (obj == null) {
                this.f16277e.remove(Object.class);
                return this;
            }
            if (this.f16277e.isEmpty()) {
                this.f16277e = new LinkedHashMap();
            }
            this.f16277e.put(Object.class, Object.class.cast(obj));
            return this;
        }
    }

    public ad(a aVar) {
        this.f16267a = aVar.f16273a;
        this.f16268b = aVar.f16274b;
        this.f16269c = aVar.f16275c.a();
        this.f16270d = aVar.f16276d;
        this.f16271e = com.anythink.core.common.n.b.a.c.a(aVar.f16277e);
    }

    private Object h() {
        return Object.class.cast(this.f16271e.get(Object.class));
    }

    public final v a() {
        return this.f16267a;
    }

    public final String b() {
        return this.f16268b;
    }

    public final u c() {
        return this.f16269c;
    }

    public final ae d() {
        return this.f16270d;
    }

    public final a e() {
        return new a(this);
    }

    public final d f() {
        d dVar = this.f16272f;
        if (dVar != null) {
            return dVar;
        }
        d a9 = d.a(this.f16269c);
        this.f16272f = a9;
        return a9;
    }

    public final boolean g() {
        return this.f16267a.c();
    }

    public final String toString() {
        return "Request{method=" + this.f16268b + ", url=" + this.f16267a + ", tags=" + this.f16271e + '}';
    }

    public final String a(String str) {
        return this.f16269c.a(str);
    }

    public final List<String> b(String str) {
        return this.f16269c.b(str);
    }

    private <T> T a(Class<? extends T> cls) {
        return cls.cast(this.f16271e.get(cls));
    }
}
