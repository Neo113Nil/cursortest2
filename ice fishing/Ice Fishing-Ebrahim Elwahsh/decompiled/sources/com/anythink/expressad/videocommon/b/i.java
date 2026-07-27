package com.anythink.expressad.videocommon.b;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.videocommon.b.h;
import com.anythink.expressad.videocommon.b.j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22452a = "ending_page_source";

    /* renamed from: b, reason: collision with root package name */
    public static final String f22453b = "ending_page_save_time";

    /* renamed from: c, reason: collision with root package name */
    private static final String f22454c = "H5DownLoadManager";

    /* renamed from: f, reason: collision with root package name */
    private static volatile i f22455f;

    /* renamed from: d, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f22456d;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentMap<String, com.anythink.expressad.videocommon.b.d> f22457e;

    /* renamed from: g, reason: collision with root package name */
    private n f22458g;

    /* renamed from: h, reason: collision with root package name */
    private j f22459h;
    private boolean i = false;

    public interface a {
        void a(String str);

        void a(String str, String str2);
    }

    public interface b extends a {
    }

    public interface c {
        void a();

        void a(String str);

        void a(String str, String str2);
    }

    public interface d extends a {
    }

    private i() {
        try {
            this.f22458g = n.a();
            this.f22459h = j.a.f22468a;
            this.f22456d = new CopyOnWriteArrayList<>();
            this.f22457e = new ConcurrentHashMap();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private String c(String str) {
        j jVar = this.f22459h;
        return jVar != null ? jVar.b(str) : str;
    }

    private void d(String str) {
        c(str, null);
    }

    private static String e(String str) {
        try {
            Object b9 = x.b(com.anythink.expressad.foundation.b.a.c().e(), f22452a.concat(String.valueOf(str)), "");
            if (b9 == null || !(b9 instanceof String)) {
                return null;
            }
            String str2 = (String) b9;
            if (y.b(str2)) {
                return str2;
            }
            return null;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static long f(String str) {
        try {
            Object b9 = x.b(com.anythink.expressad.foundation.b.a.c().e(), f22453b.concat(String.valueOf(str)), 0L);
            if (b9 != null && (b9 instanceof Long)) {
                return ((Long) b9).longValue();
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return 0L;
    }

    private static void g(String str) {
        try {
            x.a(com.anythink.expressad.foundation.b.a.c().e(), f22453b.concat(String.valueOf(str)), Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void h(String str) {
        b(str, (a) null);
    }

    public static i a() {
        if (f22455f == null) {
            synchronized (i.class) {
                try {
                    if (f22455f == null) {
                        f22455f = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22455f;
    }

    private void b(String str, d dVar) {
        try {
            String a9 = this.f22458g.a(str);
            try {
                if (!TextUtils.isEmpty(this.f22458g.b(str))) {
                    if (dVar != null) {
                        dVar.a(str);
                    }
                } else if (!this.f22457e.containsKey(a9)) {
                    com.anythink.expressad.videocommon.b.d dVar2 = new com.anythink.expressad.videocommon.b.d(this.f22457e, this.f22458g, dVar, str, a9);
                    this.f22457e.put(a9, dVar2);
                    g.a(str, a9, dVar2);
                } else {
                    com.anythink.expressad.videocommon.b.d dVar3 = this.f22457e.get(a9);
                    if (dVar3 != null) {
                        dVar3.a(dVar);
                    }
                }
            } catch (Exception e6) {
                e = e6;
                if (dVar != null) {
                    dVar.a(str, "downloadzip failed");
                }
                if (com.anythink.expressad.a.f17776a) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    private void c(final String str, final a aVar) {
        try {
            if (this.f22456d.contains(str)) {
                return;
            }
            this.f22456d.add(str);
            h.a.f22451a.a(new com.anythink.expressad.foundation.g.h.a() { // from class: com.anythink.expressad.videocommon.b.i.1
                @Override // com.anythink.expressad.foundation.g.h.a
                public final void a() {
                    if (TextUtils.isEmpty(i.this.f22459h.c(str))) {
                        g.a(str, i.this.f22459h.a(str), new c() { // from class: com.anythink.expressad.videocommon.b.i.1.1
                            @Override // com.anythink.expressad.videocommon.b.i.c
                            public final void a() {
                            }

                            @Override // com.anythink.expressad.videocommon.b.i.c
                            public final void a(String str2, String str3) {
                                try {
                                    i.this.f22456d.remove(str3);
                                    if (TextUtils.isEmpty(str2)) {
                                        return;
                                    }
                                    if (i.this.f22459h.a(str3, str2)) {
                                        a aVar2 = aVar;
                                        if (aVar2 != null) {
                                            aVar2.a(str3);
                                            return;
                                        }
                                        return;
                                    }
                                    a aVar3 = aVar;
                                    if (aVar3 != null) {
                                        aVar3.a(str3, "save file failed");
                                    }
                                } catch (Exception e6) {
                                    if (com.anythink.expressad.a.f17776a) {
                                        e6.printStackTrace();
                                    }
                                    a aVar4 = aVar;
                                    if (aVar4 != null) {
                                        aVar4.a(str3, e6.getMessage());
                                    }
                                }
                            }

                            @Override // com.anythink.expressad.videocommon.b.i.c
                            public final void a(String str2) {
                                try {
                                    i.this.f22456d.remove(str);
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    a aVar2 = aVar;
                                    if (aVar2 != null) {
                                        aVar2.a(str, str2);
                                    }
                                } catch (Exception e6) {
                                    if (com.anythink.expressad.a.f17776a) {
                                        e6.printStackTrace();
                                    }
                                    AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                    a aVar3 = aVar;
                                    if (aVar3 != null) {
                                        aVar3.a(str, str2);
                                    }
                                }
                            }
                        });
                        return;
                    }
                    i.this.f22456d.remove(str);
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.a(str);
                    }
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.h.a
                public final void c() {
                }
            });
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f17776a) {
                th.printStackTrace();
            }
        }
    }

    public final String a(String str) {
        n nVar = this.f22458g;
        if (nVar != null) {
            return nVar.b(str);
        }
        return null;
    }

    public final void a(String str, a aVar) {
        c(str, aVar);
    }

    private static void a(String str, String str2) {
        try {
            x.a(com.anythink.expressad.foundation.b.a.c().e(), f22452a.concat(String.valueOf(str2)), str);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void a(String str, d dVar) {
        try {
            String a9 = this.f22458g.a(str);
            try {
                if (!TextUtils.isEmpty(this.f22458g.b(str))) {
                    if (dVar != null) {
                        dVar.a(str);
                    }
                } else {
                    if (this.f22457e.containsKey(a9)) {
                        com.anythink.expressad.videocommon.b.d dVar2 = this.f22457e.get(a9);
                        if (dVar2 != null) {
                            dVar2.a(dVar);
                            return;
                        }
                        return;
                    }
                    com.anythink.expressad.videocommon.b.d dVar3 = new com.anythink.expressad.videocommon.b.d(this.f22457e, this.f22458g, dVar, str, a9);
                    this.f22457e.put(a9, dVar3);
                    g.a(str, a9, dVar3);
                }
            } catch (Exception e6) {
                e = e6;
                if (dVar != null) {
                    dVar.a(str, "downloadzip failed");
                }
                if (com.anythink.expressad.a.f17776a) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str, a aVar) {
        try {
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            if (URLUtil.isValidUrl(str)) {
            }
            if (aVar == null) {
                aVar.a(str, "The URL does not contain a path ");
                return;
            }
            return;
        }
        String path = Uri.parse(str).getPath();
        if (!TextUtils.isEmpty(path)) {
            if (path.toLowerCase().endsWith(".zip")) {
                a(str, (d) aVar);
                return;
            } else {
                c(str, aVar);
                return;
            }
        }
        if (aVar == null) {
        }
    }

    public final String b(String str) {
        try {
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            if (URLUtil.isValidUrl(str)) {
            }
            return str;
        }
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
            if (path.toLowerCase().endsWith(".zip")) {
                return a(str);
            }
            j jVar = this.f22459h;
            if (jVar != null) {
                return jVar.b(str);
            }
        }
        return str;
    }
}
