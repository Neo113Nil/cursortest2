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
    final v f15480a;

    /* renamed from: b, reason: collision with root package name */
    final String f15481b;

    /* renamed from: c, reason: collision with root package name */
    final u f15482c;

    /* renamed from: d, reason: collision with root package name */
    final ae f15483d;

    /* renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f15484e;

    /* renamed from: f, reason: collision with root package name */
    private volatile d f15485f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        v f15486a;

        /* renamed from: b, reason: collision with root package name */
        String f15487b;

        /* renamed from: c, reason: collision with root package name */
        u.a f15488c;

        /* renamed from: d, reason: collision with root package name */
        ae f15489d;

        /* renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f15490e;

        public a() {
            this.f15490e = Collections.EMPTY_MAP;
            this.f15487b = "GET";
            this.f15488c = new u.a();
        }

        private a b(String str, String str2) {
            this.f15488c.a(str, str2);
            return this;
        }

        private a c() {
            return a("HEAD", (ae) null);
        }

        private a d() {
            return a("DELETE", com.anythink.core.common.n.b.a.c.f15040e);
        }

        public final a a(v vVar) {
            if (vVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f15486a = vVar;
            return this;
        }

        private a c(ae aeVar) {
            return a("PUT", aeVar);
        }

        public final a b(String str) {
            this.f15488c.b(str);
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
            if (this.f15486a != null) {
                return new ad(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a(ad adVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f15490e = map;
            this.f15486a = adVar.f15480a;
            this.f15487b = adVar.f15481b;
            this.f15489d = adVar.f15483d;
            this.f15490e = adVar.f15484e.isEmpty() ? map : new LinkedHashMap<>(adVar.f15484e);
            this.f15488c = adVar.f15482c.b();
        }

        private a a(URL url) {
            if (url != null) {
                return a(v.d(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        public final a a(String str, String str2) {
            this.f15488c.d(str, str2);
            return this;
        }

        public final a a(u uVar) {
            this.f15488c = uVar.b();
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
                    throw new IllegalArgumentException(D.y.o("method ", str, " must not have a request body."));
                }
                if (aeVar == null && com.anythink.core.common.n.b.a.c.f.b(str)) {
                    throw new IllegalArgumentException(D.y.o("method ", str, " must have a request body."));
                }
                this.f15487b = str;
                this.f15489d = aeVar;
                return this;
            }
            throw new NullPointerException("method == null");
        }

        private <T> a a(Class<? super T> cls, T t6) {
            if (t6 == null) {
                this.f15490e.remove(cls);
                return this;
            }
            if (this.f15490e.isEmpty()) {
                this.f15490e = new LinkedHashMap();
            }
            this.f15490e.put(cls, cls.cast(t6));
            return this;
        }

        private a a(Object obj) {
            if (obj == null) {
                this.f15490e.remove(Object.class);
                return this;
            }
            if (this.f15490e.isEmpty()) {
                this.f15490e = new LinkedHashMap();
            }
            this.f15490e.put(Object.class, Object.class.cast(obj));
            return this;
        }
    }

    public ad(a aVar) {
        this.f15480a = aVar.f15486a;
        this.f15481b = aVar.f15487b;
        this.f15482c = aVar.f15488c.a();
        this.f15483d = aVar.f15489d;
        this.f15484e = com.anythink.core.common.n.b.a.c.a(aVar.f15490e);
    }

    private Object h() {
        return Object.class.cast(this.f15484e.get(Object.class));
    }

    public final v a() {
        return this.f15480a;
    }

    public final String b() {
        return this.f15481b;
    }

    public final u c() {
        return this.f15482c;
    }

    public final ae d() {
        return this.f15483d;
    }

    public final a e() {
        return new a(this);
    }

    public final d f() {
        d dVar = this.f15485f;
        if (dVar != null) {
            return dVar;
        }
        d a9 = d.a(this.f15482c);
        this.f15485f = a9;
        return a9;
    }

    public final boolean g() {
        return this.f15480a.c();
    }

    public final String toString() {
        return "Request{method=" + this.f15481b + ", url=" + this.f15480a + ", tags=" + this.f15484e + '}';
    }

    public final String a(String str) {
        return this.f15482c.a(str);
    }

    public final List<String> b(String str) {
        return this.f15482c.b(str);
    }

    private <T> T a(Class<? extends T> cls) {
        return cls.cast(this.f15484e.get(cls));
    }
}
