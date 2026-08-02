package com.yandex.plus.home.api.prefetch;

import android.webkit.WebResourceResponse;
import com.yandex.passport.internal.report.we;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.aur;
import defpackage.btf;
import defpackage.cg6;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.kac;
import defpackage.nm6;
import defpackage.o3o;
import defpackage.osh;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rar;
import defpackage.su4;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.v24;
import defpackage.w8a;
import defpackage.wb8;
import defpackage.wis;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class l {
    public final PrefetchApi a;
    public final com.yandex.plus.home.e b;
    public final com.yandex.plus.home.featureflags.g c;
    public final tf6 d;
    public final jyr e;
    public final jyr f;
    public rar g;

    public l(PrefetchApi prefetchApi, com.yandex.plus.home.e eVar, com.yandex.plus.home.featureflags.g gVar, String str, tf6 tf6Var) {
        gVar.getClass();
        str.getClass();
        this.a = prefetchApi;
        this.b = eVar;
        this.c = gVar;
        this.d = tf6Var;
        this.e = btf.b(new w8a(str, 5));
        this.f = btf.b(new s(20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.io.InputStream] */
    public static final e a(l lVar, o3o o3oVar, String str) {
        ?? r8;
        Object obj;
        osh oshVar;
        Exception e;
        FileOutputStream fileOutputStream;
        Object obj2 = lVar.f().get(str);
        b bVar = obj2 instanceof b ? (b) obj2 : null;
        if (bVar == null) {
            wb8.h(f1d.g("Can't find loading state for given for file = ", str));
            return null;
        }
        lVar.f().put(str, new d(bVar.a));
        File file = new File((File) lVar.e.getValue(), str);
        try {
            try {
                r7o r7oVar = z7o.b;
                oshVar = new osh(file);
            } catch (Throwable th) {
                th = th;
                r8 = o3oVar;
            }
        } catch (Throwable th2) {
            r7o r7oVar2 = z7o.b;
            obj = new t7o(th2);
        }
        try {
            InputStream E0 = o3oVar.z().E0();
            try {
                fileOutputStream = oshVar.Y();
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = E0.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                oshVar.E(fileOutputStream);
                E0.close();
                obj = file;
                r7o r7oVar3 = z7o.b;
                boolean z = obj instanceof t7o;
                Object obj3 = obj;
                if (!z) {
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    String g = f1d.g("File saved successfully ", str);
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, g, null);
                    obj3 = new c((File) obj);
                }
                Throwable a = z7o.a(obj3);
                Object obj4 = obj3;
                if (a != null) {
                    com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                    String p = su4.p(a, ouj.u("File write failed fileName = ", str, ", exception = "));
                    jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar3, p, null);
                    obj4 = a.a;
                }
                e eVar = (e) obj4;
                lVar.f().put(str, eVar);
                return eVar;
            } catch (Exception e3) {
                e = e3;
                oshVar.D(fileOutputStream);
                throw e;
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r8 = 0;
            if (r8 != 0) {
                r8.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|8|(1:(1:(2:12|13)(2:15|16))(2:17|18))(3:30|31|(2:33|34))|19|20|21|(1:23)|24|(1:28)(2:26|27)))|43|6|7|8|(0)(0)|19|20|21|(0)|24|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0040, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        r6 = r12;
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0058, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l lVar, String str, String str2, cg6 cg6Var) {
        k kVar;
        Object obj;
        int i;
        lVar.getClass();
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i2 = kVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.n = i2 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                obj = kVar2.l;
                Object obj2 = nm6.a;
                i = kVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    kVar2.j = str;
                    kVar2.k = str2;
                    kVar2.n = 1;
                    obj = lVar.c(str2, kVar2);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = kVar2.k;
                    str = kVar2.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                String str3 = str2;
                Continuation continuation = null;
                if (obj instanceof t7o) {
                    obj = null;
                }
                Function2 v24Var = new v24((o3o) obj, str3, lVar, continuation, 21);
                kVar2.j = null;
                kVar2.k = null;
                kVar2.n = 2;
                Object e = lVar.e(str, str3, v24Var, kVar2);
                return e != obj2 ? obj2 : e;
            }
        }
        kVar = new k(lVar, cg6Var);
        k kVar22 = kVar;
        obj = kVar22.l;
        Object obj22 = nm6.a;
        i = kVar22.n;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        String str32 = str2;
        Continuation continuation2 = null;
        if (obj instanceof t7o) {
        }
        Function2 v24Var2 = new v24((o3o) obj, str32, lVar, continuation2, 21);
        kVar22.j = null;
        kVar22.k = null;
        kVar22.n = 2;
        Object e2 = lVar.e(str, str32, v24Var2, kVar22);
        if (e2 != obj22) {
        }
    }

    public static String d(String str) {
        return new Regex("[^\\w.]+").replace(str, "_");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        f fVar;
        Object obj;
        int i;
        Response response;
        o3o o3oVar;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.m = i2 - Integer.MIN_VALUE;
                obj = fVar.k;
                nm6 nm6Var = nm6.a;
                i = fVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    fVar.j = str;
                    fVar.m = 1;
                    obj = this.a.a(str, fVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = fVar.j;
                    qgg.h0(obj);
                }
                if (!((Response) obj).a.b()) {
                    obj = null;
                }
                response = (Response) obj;
                if (response == null && (o3oVar = (o3o) response.b) != null) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    String g = f1d.g("File successfully downloaded from url = ", str);
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, g, null);
                    return o3oVar;
                }
                String q = hrg.q("Downloading ", str, " failed");
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar2, q, null);
                kac.f(q);
                return null;
            }
        }
        fVar = new f(this, cg6Var);
        obj = fVar.k;
        nm6 nm6Var2 = nm6.a;
        i = fVar.m;
        if (i != 0) {
        }
        if (!((Response) obj).a.b()) {
        }
        response = (Response) obj;
        if (response == null) {
        }
        String q2 = hrg.q("Downloading ", str, " failed");
        com.yandex.plus.core.analytics.logging.b bVar22 = com.yandex.plus.core.analytics.logging.b.a;
        jyr jyrVar22 = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, bVar22, q2, null);
        kac.f(q2);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        if (r10.j0(r0) == r1) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, Function2 function2, cg6 cg6Var) {
        g gVar;
        int i;
        Function2 function22;
        c cVar;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.n = i2 - Integer.MIN_VALUE;
                Object obj = gVar.l;
                nm6 nm6Var = nm6.a;
                i = gVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    e eVar = (e) f().get(str);
                    if (eVar instanceof d) {
                        rar rarVar = ((d) eVar).a;
                        gVar.j = str;
                        gVar.k = (aur) function2;
                        gVar.n = 1;
                        function22 = function2;
                    } else {
                        if (eVar instanceof c) {
                            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                            String g = f1d.g("Found saved file for url = ", str2);
                            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, g, null);
                            return ((c) eVar).a;
                        }
                        if (eVar instanceof b) {
                            rar rarVar2 = ((b) eVar).a;
                            gVar.j = null;
                            gVar.k = null;
                            gVar.n = 3;
                            Object invoke = function2.invoke(rarVar2, gVar);
                            if (invoke != nm6Var) {
                                return invoke;
                            }
                        } else {
                            if (!Intrinsics.d(eVar, a.a)) {
                                return null;
                            }
                            gVar.j = null;
                            gVar.k = null;
                            gVar.n = 4;
                            Object invoke2 = function2.invoke(null, gVar);
                            if (invoke2 != nm6Var) {
                                return invoke2;
                            }
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    if (i == 3) {
                        qgg.h0(obj);
                        return obj;
                    }
                    if (i == 4) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Function2 function23 = (Function2) gVar.k;
                str = gVar.j;
                qgg.h0(obj);
                function22 = function23;
                Object obj2 = f().get(str);
                cVar = !(obj2 instanceof c) ? (c) obj2 : null;
                if (cVar == null) {
                    return cVar.a;
                }
                gVar.j = null;
                gVar.k = null;
                gVar.n = 2;
                Object invoke3 = function22.invoke(null, gVar);
                return invoke3 == nm6Var ? nm6Var : invoke3;
            }
        }
        gVar = new g(this, cg6Var);
        Object obj3 = gVar.l;
        nm6 nm6Var2 = nm6.a;
        i = gVar.n;
        if (i != 0) {
        }
        Object obj22 = f().get(str);
        if (!(obj22 instanceof c)) {
        }
        if (cVar == null) {
        }
    }

    public final Map f() {
        return (Map) this.f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, cg6 cg6Var) {
        h hVar;
        Object obj;
        int i;
        Throwable th;
        wis wisVar;
        File file;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                obj = hVar.j;
                Object obj2 = nm6.a;
                i = hVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean l = r1.l(((com.yandex.plus.home.featureflags.e) this.c).k);
                    if (l && this.g == null) {
                        h();
                        return null;
                    }
                    if (l) {
                        try {
                            r7o r7oVar = z7o.b;
                            String d = d(str);
                            if (f().keySet().contains(d)) {
                                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "Url found in prefetch.txt url = " + str, null);
                                try {
                                    Function2 weVar = new we(str, this, d, continuation, 29);
                                    hVar.l = 1;
                                    obj = e(d, str, weVar, hVar);
                                    if (obj == obj2) {
                                        return obj2;
                                    }
                                } catch (wis e) {
                                    e = e;
                                    wisVar = e;
                                    r7o r7oVar2 = z7o.b;
                                    obj = new t7o(wisVar);
                                    if (obj instanceof t7o) {
                                    }
                                    file = (File) obj;
                                    if (file != null) {
                                    }
                                } catch (CancellationException e2) {
                                    e = e2;
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    r7o r7oVar3 = z7o.b;
                                    obj = new t7o(th);
                                    if (obj instanceof t7o) {
                                    }
                                    file = (File) obj;
                                    if (file != null) {
                                    }
                                }
                            }
                        } catch (wis e3) {
                            e = e3;
                            wisVar = e;
                            r7o r7oVar22 = z7o.b;
                            obj = new t7o(wisVar);
                            if (obj instanceof t7o) {
                            }
                            file = (File) obj;
                            if (file != null) {
                            }
                        } catch (CancellationException e4) {
                            e = e4;
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            r7o r7oVar32 = z7o.b;
                            obj = new t7o(th);
                            if (obj instanceof t7o) {
                            }
                            file = (File) obj;
                            if (file != null) {
                            }
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    qgg.h0(obj);
                } catch (wis e5) {
                    wisVar = e5;
                    r7o r7oVar222 = z7o.b;
                    obj = new t7o(wisVar);
                    if (obj instanceof t7o) {
                    }
                    file = (File) obj;
                    if (file != null) {
                    }
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Throwable th4) {
                    th = th4;
                    r7o r7oVar322 = z7o.b;
                    obj = new t7o(th);
                    if (obj instanceof t7o) {
                    }
                    file = (File) obj;
                    if (file != null) {
                    }
                }
                r7o r7oVar4 = z7o.b;
                if (obj instanceof t7o) {
                    obj = null;
                }
                file = (File) obj;
                if (file != null) {
                    return null;
                }
                FileNameMap fileNameMap = URLConnection.getFileNameMap();
                fileNameMap.getClass();
                return new WebResourceResponse(fileNameMap.getContentTypeFor(file.getName()), null, new FileInputStream(file));
            }
        }
        hVar = new h(this, cg6Var);
        obj = hVar.j;
        Object obj22 = nm6.a;
        i = hVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r7o r7oVar42 = z7o.b;
        if (obj instanceof t7o) {
        }
        file = (File) obj;
        if (file != null) {
        }
    }

    public final void h() {
        boolean l = r1.l(((com.yandex.plus.home.featureflags.e) this.c).k);
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        Continuation continuation = null;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "loadPrefetch() prefetchEnabled = " + l, null);
        if (l) {
            this.g = x97.y(this.d, null, null, new j(this, continuation, 0), 3);
        }
    }
}
