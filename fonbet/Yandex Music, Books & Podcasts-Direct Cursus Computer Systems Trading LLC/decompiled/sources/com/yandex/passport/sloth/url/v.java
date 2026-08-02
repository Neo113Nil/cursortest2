package com.yandex.passport.sloth.url;

import android.net.Uri;
import android.os.Build;
import android.webkit.CookieManager;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.h0;
import com.yandex.passport.sloth.data.i0;
import com.yandex.passport.sloth.data.j0;
import com.yandex.passport.sloth.data.k0;
import com.yandex.passport.sloth.data.m0;
import com.yandex.passport.sloth.data.n0;
import com.yandex.passport.sloth.data.o0;
import com.yandex.passport.sloth.l0;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.x0;
import com.yandex.passport.sloth.z0;
import defpackage.aur;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.f9h;
import defpackage.jbb;
import defpackage.jhp;
import defpackage.kcc;
import defpackage.lcc;
import defpackage.lhc;
import defpackage.nm6;
import defpackage.o7t;
import defpackage.ouj;
import defpackage.p5b;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.w90;
import defpackage.wis;
import defpackage.wz0;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.z7o;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class v {
    public final com.yandex.passport.sloth.data.m a;
    public final com.yandex.passport.sloth.dependencies.i b;
    public final com.yandex.passport.common.ui.lang.b c;
    public final com.yandex.passport.internal.sloth.z d;
    public final com.yandex.passport.internal.sloth.j e;
    public final com.yandex.passport.sloth.v f;
    public final z0 g;
    public final com.yandex.passport.internal.sloth.g h;
    public final com.yandex.passport.internal.sloth.e i;
    public final com.yandex.passport.sloth.f j;
    public final com.yandex.passport.sloth.dependencies.d k;
    public final x l;
    public final a1 m;

    public v(com.yandex.passport.sloth.data.m mVar, com.yandex.passport.sloth.dependencies.i iVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.sloth.z zVar, com.yandex.passport.internal.sloth.j jVar, com.yandex.passport.sloth.v vVar, z0 z0Var, com.yandex.passport.internal.sloth.g gVar, com.yandex.passport.internal.sloth.e eVar, com.yandex.passport.sloth.f fVar, com.yandex.passport.sloth.dependencies.d dVar, x xVar, a1 a1Var) {
        mVar.getClass();
        iVar.getClass();
        bVar.getClass();
        zVar.getClass();
        jVar.getClass();
        vVar.getClass();
        z0Var.getClass();
        gVar.getClass();
        eVar.getClass();
        fVar.getClass();
        dVar.getClass();
        xVar.getClass();
        a1Var.getClass();
        this.a = mVar;
        this.b = iVar;
        this.c = bVar;
        this.d = zVar;
        this.e = jVar;
        this.f = vVar;
        this.g = z0Var;
        this.h = gVar;
        this.i = eVar;
        this.j = fVar;
        this.k = dVar;
        this.l = xVar;
        this.m = a1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(v vVar, Uri uri, com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        l lVar;
        int i;
        Object a;
        com.yandex.passport.common.url.b bVar;
        vVar.getClass();
        if (cg6Var instanceof l) {
            lVar = (l) cg6Var;
            int i2 = lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lVar.j;
                nm6 nm6Var = nm6.a;
                i = lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.dependencies.i iVar = vVar.b;
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String a2 = com.yandex.passport.common.url.a.a(uri);
                    lVar.l = 1;
                    a = ((com.yandex.passport.internal.sloth.w) iVar).a(lVar, fVar, a2);
                    if (a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (a instanceof t7o) {
                    a = null;
                }
                bVar = (com.yandex.passport.common.url.b) a;
                if (bVar == null) {
                    return bVar.a;
                }
                return null;
            }
        }
        lVar = new l(vVar, cg6Var);
        Object obj2 = lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (a instanceof t7o) {
        }
        bVar = (com.yandex.passport.common.url.b) a;
        if (bVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r6.c(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(v vVar, Uri uri, com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        m mVar;
        int i;
        Object b;
        com.yandex.passport.common.url.b bVar;
        vVar.getClass();
        if (cg6Var instanceof m) {
            mVar = (m) cg6Var;
            int i2 = mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = mVar.k;
                nm6 nm6Var = nm6.a;
                i = mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.dependencies.i iVar = vVar.b;
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String a = com.yandex.passport.common.url.a.a(uri);
                    if (fVar != null) {
                        mVar.j = fVar;
                        mVar.m = 1;
                        b = ((com.yandex.passport.internal.sloth.w) iVar).b(mVar, fVar, a);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    bVar = null;
                    if (bVar != null) {
                        return bVar.a;
                    }
                    return null;
                }
                fVar = mVar.j;
                qgg.h0(obj);
                b = ((z7o) obj).a;
                if (z7o.a(b) != null) {
                    String str = ((com.yandex.passport.common.url.b) b).a;
                    if (str != null) {
                        bVar = new com.yandex.passport.common.url.b(str);
                        if (bVar != null) {
                        }
                        return null;
                    }
                } else {
                    com.yandex.passport.sloth.v vVar2 = vVar.f;
                    com.yandex.passport.sloth.c0 c0Var = new com.yandex.passport.sloth.c0(fVar);
                    mVar.j = null;
                    mVar.m = 2;
                }
                bVar = null;
                if (bVar != null) {
                }
                return null;
            }
        }
        mVar = new m(vVar, cg6Var);
        Object obj2 = mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = mVar.m;
        if (i != 0) {
        }
        if (z7o.a(b) != null) {
        }
        bVar = null;
        if (bVar != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(v vVar, com.yandex.passport.sloth.data.y yVar, cg6 cg6Var) {
        n nVar;
        int i;
        Object c;
        vVar.getClass();
        if (cg6Var instanceof n) {
            nVar = (n) cg6Var;
            int i2 = nVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.m = i2 - Integer.MIN_VALUE;
                Object obj = nVar.k;
                nm6 nm6Var = nm6.a;
                i = nVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.dependencies.i iVar = vVar.b;
                    nVar.j = yVar;
                    nVar.m = 1;
                    c = ((com.yandex.passport.internal.sloth.w) iVar).c(yVar, nVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return "";
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yVar = nVar.j;
                    qgg.h0(obj);
                    c = ((z7o) obj).a;
                }
                if (z7o.a(c) != null) {
                    return ((com.yandex.passport.common.url.b) c).a;
                }
                com.yandex.passport.sloth.v vVar2 = vVar.f;
                com.yandex.passport.sloth.c0 c0Var = new com.yandex.passport.sloth.c0(yVar.f);
                nVar.j = null;
                nVar.m = 2;
                return vVar2.c(c0Var, nVar) == nm6Var ? nm6Var : "";
            }
        }
        nVar = new n(vVar, cg6Var);
        Object obj2 = nVar.k;
        nm6 nm6Var2 = nm6.a;
        i = nVar.m;
        if (i != 0) {
        }
        if (z7o.a(c) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(v vVar, Uri uri, com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        p pVar;
        int i;
        Object d;
        com.yandex.passport.common.core.f fVar2;
        Throwable a;
        vVar.getClass();
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i2 = pVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.m = i2 - Integer.MIN_VALUE;
                p pVar2 = pVar;
                Object obj = pVar2.k;
                nm6 nm6Var = nm6.a;
                i = pVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.sloth.dependencies.i iVar = vVar.b;
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) vVar.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String a2 = com.yandex.passport.common.url.a.a(uri);
                    com.yandex.passport.common.core.c cVar = com.yandex.passport.common.core.c.b;
                    pVar2.j = fVar;
                    pVar2.m = 1;
                    d = ((com.yandex.passport.internal.sloth.w) iVar).d(fVar, b, a2, cVar, pVar2);
                    if (d != nm6Var) {
                        fVar2 = fVar;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        qgg.h0(obj);
                        return "";
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar2 = pVar2.j;
                qgg.h0(obj);
                d = ((z7o) obj).a;
                a = z7o.a(d);
                if (a != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                boolean z = a instanceof l0;
                com.yandex.passport.sloth.v vVar2 = vVar.f;
                if (z) {
                    com.yandex.passport.sloth.c0 c0Var = new com.yandex.passport.sloth.c0(fVar2);
                    pVar2.j = null;
                    pVar2.m = 2;
                    if (vVar2.c(c0Var, pVar2) != nm6Var) {
                        return "";
                    }
                } else {
                    com.yandex.passport.sloth.a0 a0Var = new com.yandex.passport.sloth.a0(a, a.toString());
                    pVar2.j = null;
                    pVar2.m = 3;
                    if (vVar2.c(a0Var, pVar2) != nm6Var) {
                        return "";
                    }
                }
                return nm6Var;
            }
        }
        pVar = new p(vVar, cg6Var);
        p pVar22 = pVar;
        Object obj2 = pVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = pVar22.m;
        if (i != 0) {
        }
        a = z7o.a(d);
        if (a != null) {
        }
    }

    public static Uri.Builder n(Uri.Builder builder, com.yandex.passport.common.core.b bVar) {
        String authority = builder.build().getAuthority();
        if (authority != null) {
            int ordinal = bVar.ordinal();
            if (ordinal == 2) {
                return o(builder, authority, "-test");
            }
            if (ordinal == 4) {
                return o(builder, authority, "-rc");
            }
        }
        return builder;
    }

    public static final Uri.Builder o(Uri.Builder builder, String str, String str2) {
        if (!kotlin.text.c.v(str, "passport.", false)) {
            return builder;
        }
        Uri.Builder authority = builder.authority(kotlin.text.c.r(str, "passport.", ouj.k('.', "passport", str2), false));
        authority.getClass();
        return authority;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[LOOP:0: B:11:0x0092->B:13:0x0098, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, cg6 cg6Var) {
        b bVar;
        int i;
        Uri.Builder buildUpon;
        Uri.Builder builder;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.n = i2 - Integer.MIN_VALUE;
                Object obj = bVar.l;
                Object obj2 = nm6.a;
                i = bVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!kotlin.text.c.v(com.yandex.passport.common.url.b.k(str), "http", false)) {
                        Uri.Builder buildUpon2 = Uri.parse(str).buildUpon();
                        buildUpon2.getClass();
                        return buildUpon2;
                    }
                    Locale a = ((com.yandex.passport.internal.ui.lang.a) this.c).a();
                    buildUpon = Uri.parse(str).buildUpon();
                    int i3 = com.yandex.passport.common.ui.lang.a.a;
                    String language = a.getLanguage();
                    language.getClass();
                    buildUpon.appendQueryParameter("lang", language);
                    String country = a.getCountry();
                    country.getClass();
                    buildUpon.appendQueryParameter(CommonUrlParts.LOCALE, country);
                    bVar.j = buildUpon;
                    bVar.k = buildUpon;
                    bVar.n = 1;
                    obj = this.l.a(bVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                    builder = buildUpon;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    buildUpon = bVar.k;
                    builder = bVar.j;
                    qgg.h0(obj);
                }
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                builder.getClass();
                return builder;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.l;
        Object obj22 = nm6.a;
        i = bVar.n;
        if (i != 0) {
        }
        while (r7.hasNext()) {
        }
        builder.getClass();
        return builder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r12 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Uri uri, com.yandex.passport.common.core.f fVar, boolean z, com.yandex.passport.common.core.c cVar, cg6 cg6Var) {
        c cVar2;
        int i;
        Object r;
        Object k;
        Object r2;
        if (cg6Var instanceof c) {
            cVar2 = (c) cg6Var;
            int i2 = cVar2.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.p = i2 - Integer.MIN_VALUE;
                Object obj = cVar2.n;
                Object obj2 = nm6.a;
                i = cVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z) {
                        com.yandex.passport.common.url.b.Companion.getClass();
                        String a = com.yandex.passport.common.url.a.a(uri);
                        cVar2.j = uri;
                        cVar2.k = fVar;
                        cVar2.l = cVar;
                        cVar2.m = z;
                        cVar2.p = 1;
                        k = k(cVar2, fVar, a);
                    } else {
                        cVar2.j = null;
                        cVar2.k = null;
                        cVar2.l = null;
                        cVar2.m = z;
                        cVar2.p = 3;
                        r = r(uri, fVar, cVar, cVar2);
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        r2 = ((com.yandex.passport.common.url.b) obj).a;
                        return (String) r2;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    r = ((com.yandex.passport.common.url.b) obj).a;
                    return (String) r;
                }
                z = cVar2.m;
                cVar = cVar2.l;
                fVar = cVar2.k;
                uri = cVar2.j;
                qgg.h0(obj);
                com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
                k = bVar != null ? bVar.a : null;
                String str = (String) k;
                if (str != null) {
                    return str;
                }
                cVar2.j = null;
                cVar2.k = null;
                cVar2.l = null;
                cVar2.m = z;
                cVar2.p = 2;
                r2 = r(uri, fVar, cVar, cVar2);
            }
        }
        cVar2 = new c(this, cg6Var);
        Object obj3 = cVar2.n;
        Object obj22 = nm6.a;
        i = cVar2.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(o0 o0Var, cg6 cg6Var) {
        d dVar;
        com.yandex.passport.common.core.b bVar;
        v vVar;
        com.yandex.passport.common.core.b bVar2;
        v vVar2;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i = dVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.n = i - Integer.MIN_VALUE;
                Object obj = dVar.l;
                nm6 nm6Var = nm6.a;
                switch (dVar.n) {
                    case 0:
                        qgg.h0(obj);
                        boolean z = o0Var instanceof com.yandex.passport.sloth.data.e0;
                        com.yandex.passport.internal.sloth.j jVar = this.e;
                        com.yandex.passport.sloth.data.m mVar = this.a;
                        if (z) {
                            com.yandex.passport.common.core.b bVar3 = mVar.b;
                            String c = jVar.c(bVar3, new Long(((com.yandex.passport.sloth.data.e0) o0Var).c));
                            dVar.j = bVar3;
                            dVar.k = this;
                            dVar.n = 1;
                            Object e = e(c, dVar);
                            if (e != nm6Var) {
                                bVar2 = bVar3;
                                obj = e;
                                vVar2 = this;
                                vVar2.getClass();
                                return n((Uri.Builder) obj, bVar2);
                            }
                        } else if (o0Var instanceof i0) {
                            dVar.n = 2;
                            Object p = p((i0) o0Var, dVar);
                            if (p != nm6Var) {
                                return p;
                            }
                        } else if ((o0Var instanceof com.yandex.passport.sloth.data.f0) || (o0Var instanceof j0) || (o0Var instanceof com.yandex.passport.sloth.data.l0) || (o0Var instanceof com.yandex.passport.sloth.data.y) || (o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                            com.yandex.passport.common.core.b bVar4 = mVar.b;
                            String c2 = jVar.c(bVar4, null);
                            dVar.j = bVar4;
                            dVar.k = this;
                            dVar.n = 3;
                            obj = e(c2, dVar);
                            if (obj != nm6Var) {
                                bVar = bVar4;
                                vVar = this;
                                vVar.getClass();
                                return n((Uri.Builder) obj, bVar);
                            }
                        } else if (o0Var instanceof m0) {
                            com.yandex.passport.common.core.b bVar5 = mVar.b;
                            Long l = ((m0) o0Var).e;
                            long longValue = l != null ? l.longValue() : 0L;
                            jVar.getClass();
                            bVar5.getClass();
                            com.yandex.passport.internal.network.h hVar = (com.yandex.passport.internal.network.h) jVar.a;
                            hVar.getClass();
                            String str = hVar.l(bVar5, longValue).a;
                            dVar.n = 4;
                            Object e2 = e(str, dVar);
                            if (e2 != nm6Var) {
                                return e2;
                            }
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.u) {
                            String str2 = ((com.yandex.passport.sloth.data.u) o0Var).b;
                            dVar.n = 5;
                            Object e3 = e(str2, dVar);
                            if (e3 != nm6Var) {
                                return e3;
                            }
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.z) {
                            String str3 = ((com.yandex.passport.sloth.data.z) o0Var).b;
                            dVar.n = 6;
                            Object e4 = e(str3, dVar);
                            if (e4 != nm6Var) {
                                return e4;
                            }
                        } else {
                            if (o0Var instanceof com.yandex.passport.sloth.data.v) {
                                Uri.Builder buildUpon = Uri.parse(((com.yandex.passport.sloth.data.v) o0Var).b).buildUpon();
                                buildUpon.getClass();
                                return buildUpon;
                            }
                            if (o0Var instanceof com.yandex.passport.sloth.data.g0) {
                                Uri.Builder buildUpon2 = Uri.parse(((com.yandex.passport.sloth.data.g0) o0Var).d).buildUpon();
                                buildUpon2.getClass();
                                return buildUpon2;
                            }
                            if (o0Var instanceof n0) {
                                Uri.Builder buildUpon3 = Uri.parse(((n0) o0Var).b).buildUpon();
                                buildUpon3.getClass();
                                return buildUpon3;
                            }
                            if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                                Uri.Builder buildUpon4 = Uri.parse(((com.yandex.passport.sloth.data.w) o0Var).b).buildUpon();
                                buildUpon4.getClass();
                                return buildUpon4;
                            }
                            if (o0Var instanceof com.yandex.passport.sloth.data.t) {
                                String a = jVar.a(mVar.b, ((com.yandex.passport.sloth.data.t) o0Var).c);
                                dVar.n = 7;
                                Object e5 = e(a, dVar);
                                if (e5 != nm6Var) {
                                    return e5;
                                }
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.x) {
                                com.yandex.passport.common.core.b bVar6 = mVar.b;
                                String str4 = ((com.yandex.passport.sloth.data.x) o0Var).c;
                                jVar.getClass();
                                bVar6.getClass();
                                str4.getClass();
                                ((com.yandex.passport.internal.network.h) jVar.a).getClass();
                                String b = com.yandex.passport.common.url.b.b(String.format(com.yandex.passport.internal.network.h.h(bVar6), Arrays.copyOf(new Object[]{"ru"}, 1)).concat("/am/push/qrbezqrlogin"), new Pair("BrowserName", str4));
                                dVar.n = 8;
                                Object e6 = e(b, dVar);
                                if (e6 != nm6Var) {
                                    return e6;
                                }
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.d0) {
                                String str5 = ((com.yandex.passport.sloth.data.d0) o0Var).b;
                                dVar.n = 9;
                                Object e7 = e(str5, dVar);
                                if (e7 != nm6Var) {
                                    return e7;
                                }
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.c0) {
                                String e8 = jVar.e(mVar.b, ((com.yandex.passport.sloth.data.c0) o0Var).c);
                                dVar.n = 10;
                                Object e9 = e(e8, dVar);
                                if (e9 != nm6Var) {
                                    return e9;
                                }
                            } else if (o0Var instanceof k0) {
                                dVar.n = 11;
                                Object u = u((k0) o0Var, dVar);
                                if (u != nm6Var) {
                                    return u;
                                }
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.a0) {
                                String g = jVar.g(mVar.b);
                                dVar.n = 12;
                                Object e10 = e(g, dVar);
                                if (e10 != nm6Var) {
                                    return e10;
                                }
                            } else {
                                if (!(o0Var instanceof h0)) {
                                    b6e.s();
                                    return null;
                                }
                                String f = jVar.f(mVar.b, ((h0) o0Var).d);
                                dVar.n = 13;
                                Object e11 = e(f, dVar);
                                if (e11 != nm6Var) {
                                    return e11;
                                }
                            }
                        }
                        return nm6Var;
                    case 1:
                        vVar2 = dVar.k;
                        bVar2 = dVar.j;
                        qgg.h0(obj);
                        vVar2.getClass();
                        return n((Uri.Builder) obj, bVar2);
                    case 2:
                        qgg.h0(obj);
                        return obj;
                    case 3:
                        vVar = dVar.k;
                        bVar = dVar.j;
                        qgg.h0(obj);
                        vVar.getClass();
                        return n((Uri.Builder) obj, bVar);
                    case 4:
                        qgg.h0(obj);
                        return obj;
                    case 5:
                        qgg.h0(obj);
                        return obj;
                    case 6:
                        qgg.h0(obj);
                        return obj;
                    case 7:
                        qgg.h0(obj);
                        return obj;
                    case 8:
                        qgg.h0(obj);
                        return obj;
                    case 9:
                        qgg.h0(obj);
                        return obj;
                    case 10:
                        qgg.h0(obj);
                        return obj;
                    case 11:
                        qgg.h0(obj);
                        return obj;
                    case 12:
                        qgg.h0(obj);
                        return obj;
                    case 13:
                        qgg.h0(obj);
                        return obj;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.l;
        nm6 nm6Var2 = nm6.a;
        switch (dVar.n) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(com.yandex.passport.sloth.data.o oVar, String str, cg6 cg6Var) {
        e eVar;
        Object obj;
        nm6 nm6Var;
        int i;
        Pair[] pairArr;
        String str2;
        int i2;
        Object b;
        Pair[] pairArr2;
        String str3;
        int i3;
        Pair[] pairArr3;
        Pair[] pairArr4;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i4 = eVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.p = i4 - Integer.MIN_VALUE;
                obj = eVar.n;
                nm6Var = nm6.a;
                i = eVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    pairArr = new Pair[5];
                    pairArr[0] = new Pair("theme", com.yandex.passport.internal.ui.a.w(oVar));
                    pairArr[1] = new Pair("source", str);
                    pairArr[2] = new Pair("device_name", Build.MODEL);
                    eVar.j = pairArr;
                    eVar.k = pairArr;
                    str2 = "uuid";
                    eVar.l = "uuid";
                    i2 = 3;
                    eVar.m = 3;
                    eVar.p = 1;
                    b = this.d.b(eVar);
                    if (b != nm6Var) {
                        pairArr2 = pairArr;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = eVar.m;
                    str3 = eVar.l;
                    pairArr4 = eVar.k;
                    pairArr3 = eVar.j;
                    qgg.h0(obj);
                    pairArr4[i3] = new Pair(str3, obj);
                    pairArr3.getClass();
                    return xz0.r(pairArr3);
                }
                i2 = eVar.m;
                str2 = eVar.l;
                pairArr = eVar.k;
                pairArr2 = eVar.j;
                qgg.h0(obj);
                com.yandex.passport.common.value.b bVar = (com.yandex.passport.common.value.b) obj;
                b = bVar != null ? bVar.a : null;
                String str4 = (String) b;
                pairArr[i2] = new Pair(str2, str4 != null ? str4 : null);
                eVar.j = pairArr2;
                eVar.k = pairArr2;
                str3 = "connection_type";
                eVar.l = "connection_type";
                i3 = 4;
                eVar.m = 4;
                eVar.p = 2;
                obj = this.i.b(eVar);
                if (obj != nm6Var) {
                    pairArr3 = pairArr2;
                    pairArr4 = pairArr3;
                    pairArr4[i3] = new Pair(str3, obj);
                    pairArr3.getClass();
                    return xz0.r(pairArr3);
                }
                return nm6Var;
            }
        }
        eVar = new e(this, cg6Var);
        obj = eVar.n;
        nm6Var = nm6.a;
        i = eVar.p;
        if (i != 0) {
        }
        String str42 = (String) b;
        pairArr[i2] = new Pair(str2, str42 != null ? str42 : null);
        eVar.j = pairArr2;
        eVar.k = pairArr2;
        str3 = "connection_type";
        eVar.l = "connection_type";
        i3 = 4;
        eVar.m = 4;
        eVar.p = 2;
        obj = this.i.b(eVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e2 A[LOOP:0: B:12:0x00dc->B:14:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable i(o0 o0Var, cg6 cg6Var) {
        f fVar;
        int i;
        Uri.Builder builder;
        com.yandex.passport.sloth.data.m mVar;
        String str;
        String scheme;
        Uri.Builder builder2;
        kcc kccVar;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.n = i2 - Integer.MIN_VALUE;
                Object obj = fVar.l;
                nm6 nm6Var = nm6.a;
                i = fVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    fVar.j = o0Var;
                    fVar.n = 1;
                    obj = g(o0Var, fVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        builder2 = fVar.k;
                        qgg.h0(obj);
                        Sequence sequence = (Sequence) obj;
                        com.yandex.passport.internal.storage.d dVar = new com.yandex.passport.internal.storage.d(20);
                        sequence.getClass();
                        kccVar = new kcc(new lcc(new o7t(sequence, dVar), false, new com.yandex.passport.internal.storage.d(21)));
                        while (kccVar.hasNext()) {
                            Pair pair = (Pair) kccVar.next();
                            builder2.appendQueryParameter((String) pair.a, (String) pair.b);
                        }
                        Uri build = builder2.build();
                        com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(bVar, null, "Built Uri " + build, 10);
                        }
                        build.getClass();
                        return build;
                    }
                    o0Var = fVar.j;
                    qgg.h0(obj);
                }
                builder = (Uri.Builder) obj;
                mVar = this.a;
                if (!mVar.d.c || this.k.j) {
                    com.yandex.passport.sloth.f fVar2 = this.j;
                    ((CookieManager) fVar2.a.getValue()).removeAllCookies(null);
                    ((CookieManager) fVar2.a.getValue()).flush();
                    builder.build();
                    com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(bVar2, null, "Cookies was cleared", 10);
                    }
                }
                str = mVar.d.b;
                if (str != null && !StringsKt.U(str)) {
                    builder.appendQueryParameter("test-id", str);
                }
                scheme = builder.build().getScheme();
                if (scheme != null || !kotlin.text.c.v(scheme, "http", false)) {
                    Uri build2 = builder.build();
                    build2.getClass();
                    return build2;
                }
                fVar.j = null;
                fVar.k = builder;
                fVar.n = 2;
                Object j = j(o0Var, fVar);
                if (j != nm6Var) {
                    obj = j;
                    builder2 = builder;
                    Sequence sequence2 = (Sequence) obj;
                    com.yandex.passport.internal.storage.d dVar2 = new com.yandex.passport.internal.storage.d(20);
                    sequence2.getClass();
                    kccVar = new kcc(new lcc(new o7t(sequence2, dVar2), false, new com.yandex.passport.internal.storage.d(21)));
                    while (kccVar.hasNext()) {
                    }
                    Uri build3 = builder2.build();
                    com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    }
                    build3.getClass();
                    return build3;
                }
                return nm6Var;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj2 = fVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fVar.n;
        if (i != 0) {
        }
        builder = (Uri.Builder) obj2;
        mVar = this.a;
        if (!mVar.d.c) {
        }
        com.yandex.passport.sloth.f fVar22 = this.j;
        ((CookieManager) fVar22.a.getValue()).removeAllCookies(null);
        ((CookieManager) fVar22.a.getValue()).flush();
        builder.build();
        com.yandex.passport.common.logger.b bVar22 = com.yandex.passport.common.logger.b.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        str = mVar.d.b;
        if (str != null) {
            builder.appendQueryParameter("test-id", str);
        }
        scheme = builder.build().getScheme();
        if (scheme != null) {
        }
        Uri build22 = builder.build();
        build22.getClass();
        return build22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x018a, code lost:
    
        if (r13 == r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01aa, code lost:
    
        if (r13 == r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c6, code lost:
    
        if (r13 == r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01e1, code lost:
    
        if (r13 == r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0250, code lost:
    
        if (r13 == r1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f2, code lost:
    
        if (r13 == r1) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(o0 o0Var, cg6 cg6Var) {
        g gVar;
        o0 o0Var2;
        Sequence sequence;
        lhc i;
        com.yandex.passport.sloth.data.n nVar;
        Sequence sequence2;
        Sequence sequence3;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.n = i2 - Integer.MIN_VALUE;
                Object obj = gVar.l;
                Object obj2 = nm6.a;
                switch (gVar.n) {
                    case 0:
                        qgg.h0(obj);
                        if (o0Var instanceof com.yandex.passport.sloth.data.u) {
                            com.yandex.passport.sloth.data.o oVar = ((com.yandex.passport.sloth.data.u) o0Var).d;
                            gVar.j = o0Var;
                            gVar.k = o0Var;
                            gVar.n = 1;
                            obj = h(oVar, "account_upgrade", gVar);
                            if (obj != obj2) {
                                o0Var2 = o0Var;
                                i = jhp.i((Sequence) obj, xz0.r(new Pair[]{new Pair("nosocial", Boolean.TRUE), new Pair("force_required_upgrade", new Integer(com.yandex.plus.core.locale.b.o(((com.yandex.passport.sloth.data.u) o0Var).e)))}));
                                sequence = i;
                                o0Var = o0Var2;
                                if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                                    sequence2 = new wz0(6, new Pair(LegacyAccountType.STRING_LOGIN, ((com.yandex.passport.sloth.data.b0) o0Var).b));
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.e0) {
                                    com.yandex.passport.sloth.data.e0 e0Var = (com.yandex.passport.sloth.data.e0) o0Var;
                                    sequence2 = xz0.r(new Pair[]{new Pair("uid", Long.valueOf(e0Var.b.b)), new Pair("phone", e0Var.d), new Pair("editable", Boolean.valueOf(e0Var.e))});
                                } else if ((o0Var instanceof com.yandex.passport.sloth.data.y) || (o0Var instanceof com.yandex.passport.sloth.data.f0) || (o0Var instanceof i0)) {
                                    sequence2 = p5b.a;
                                } else if (o0Var instanceof j0) {
                                    j0 j0Var = (j0) o0Var;
                                    sequence2 = xz0.r(new Pair[]{new Pair("uid", Long.valueOf(j0Var.c.b)), new Pair(LegacyAccountType.STRING_LOGIN, j0Var.b), new Pair("editable", Boolean.valueOf(j0Var.d))});
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.l0) {
                                    com.yandex.passport.sloth.data.l0 l0Var = (com.yandex.passport.sloth.data.l0) o0Var;
                                    sequence2 = xz0.r(new Pair[]{new Pair("firstName", l0Var.d), new Pair("lastName", l0Var.e), new Pair("email", l0Var.c), new Pair("phone", l0Var.b)});
                                } else if (o0Var instanceof m0) {
                                    sequence2 = new wz0(6, new Pair("webview", ConstantDeviceInfo.APP_PLATFORM));
                                } else {
                                    if (!(o0Var instanceof k0) && !(o0Var instanceof com.yandex.passport.sloth.data.u) && !(o0Var instanceof com.yandex.passport.sloth.data.g0) && !(o0Var instanceof n0) && !(o0Var instanceof com.yandex.passport.sloth.data.v) && !(o0Var instanceof com.yandex.passport.sloth.data.w) && !(o0Var instanceof com.yandex.passport.sloth.data.x) && !(o0Var instanceof com.yandex.passport.sloth.data.z) && !(o0Var instanceof com.yandex.passport.sloth.data.d0) && !(o0Var instanceof com.yandex.passport.sloth.data.t) && !(o0Var instanceof com.yandex.passport.sloth.data.c0) && !(o0Var instanceof com.yandex.passport.sloth.data.a0) && !(o0Var instanceof h0)) {
                                        b6e.s();
                                        return null;
                                    }
                                    sequence2 = p5b.a;
                                }
                                if (!(o0Var instanceof com.yandex.passport.sloth.data.w) || (o0Var instanceof k0)) {
                                    sequence3 = p5b.a;
                                } else {
                                    sequence3 = new wz0(6, new Pair("mode", o0Var.a.a));
                                }
                                return jhp.i(sequence, jhp.i(sequence2, sequence3));
                            }
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.r) {
                            com.yandex.passport.sloth.data.r rVar = (com.yandex.passport.sloth.data.r) o0Var;
                            com.yandex.passport.sloth.data.o oVar2 = rVar.d().f;
                            String str = rVar.d().a;
                            gVar.j = o0Var;
                            gVar.k = o0Var;
                            gVar.n = 2;
                            obj = h(oVar2, str, gVar);
                            if (obj != obj2) {
                                o0Var2 = o0Var;
                                Sequence sequence4 = (Sequence) obj;
                                com.yandex.passport.sloth.dependencies.e d = ((com.yandex.passport.sloth.data.r) o0Var).d();
                                boolean z = d.b;
                                EnumSet enumSet = d.g;
                                Pair pair = new Pair("nosocial", Boolean.valueOf(!z));
                                Pair pair2 = new Pair("auth_type", CollectionsKt.X(CollectionsKt.O(enumSet), StringUtils.COMMA, null, null, new com.yandex.passport.internal.storage.d(23), 30));
                                z0 z0Var = this.g;
                                z0Var.getClass();
                                nVar = z0Var.a.a;
                                if (nVar == com.yandex.passport.sloth.data.n.Portal && enumSet.contains(com.yandex.passport.sloth.command.data.a1.b)) {
                                    nVar = com.yandex.passport.sloth.data.n.Neophonish;
                                }
                                i = jhp.i(sequence4, xz0.r(new Pair[]{pair, pair2, new Pair("reg_type", nVar), new Pair("noreturn", Integer.valueOf(com.yandex.plus.core.locale.b.o(d.c))), new Pair("enable_2fa", Boolean.valueOf(d.d)), new Pair("additional_action_request", d.e)}));
                                sequence = i;
                                o0Var = o0Var2;
                                if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                                }
                                if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                                }
                                sequence3 = p5b.a;
                                return jhp.i(sequence, jhp.i(sequence2, sequence3));
                            }
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.z) {
                            com.yandex.passport.sloth.data.o oVar3 = ((com.yandex.passport.sloth.data.z) o0Var).d;
                            gVar.j = o0Var;
                            gVar.k = null;
                            gVar.n = 3;
                            obj = h(oVar3, "bear", gVar);
                            break;
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.s) {
                            com.yandex.passport.sloth.data.o theme = ((com.yandex.passport.sloth.data.s) o0Var).getTheme();
                            gVar.j = o0Var;
                            gVar.k = null;
                            gVar.n = 4;
                            obj = h(theme, "webcard", gVar);
                            break;
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.v) {
                            com.yandex.passport.sloth.data.o oVar4 = ((com.yandex.passport.sloth.data.v) o0Var).d;
                            gVar.j = o0Var;
                            gVar.k = null;
                            gVar.n = 5;
                            obj = h(oVar4, "webcard", gVar);
                            break;
                        } else {
                            if (!(o0Var instanceof com.yandex.passport.sloth.data.y)) {
                                if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                                    sequence = p5b.a;
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.x) {
                                    sequence = p5b.a;
                                } else if (o0Var instanceof m0) {
                                    com.yandex.passport.sloth.data.o oVar5 = ((m0) o0Var).b;
                                    gVar.j = o0Var;
                                    gVar.k = o0Var;
                                    gVar.n = 7;
                                    obj = h(oVar5, "user_menu", gVar);
                                    if (obj != obj2) {
                                        o0Var2 = o0Var;
                                        LinkedHashMap linkedHashMap = ((m0) o0Var).c;
                                        linkedHashMap.getClass();
                                        i = jhp.i((Sequence) obj, new o7t(CollectionsKt.F(linkedHashMap.entrySet()), new com.yandex.passport.internal.storage.d(22)));
                                        sequence = i;
                                        o0Var = o0Var2;
                                    }
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.t) {
                                    com.yandex.passport.sloth.data.o oVar6 = ((com.yandex.passport.sloth.data.t) o0Var).d;
                                    gVar.j = o0Var;
                                    gVar.k = null;
                                    gVar.n = 8;
                                    obj = h(oVar6, "account_delete_forever", gVar);
                                    break;
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.d0) {
                                    sequence = p5b.a;
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.c0) {
                                    com.yandex.passport.sloth.data.o oVar7 = ((com.yandex.passport.sloth.data.c0) o0Var).d;
                                    gVar.j = o0Var;
                                    gVar.k = o0Var;
                                    gVar.n = 9;
                                    obj = h(oVar7, "managing_plus_devices", gVar);
                                    if (obj != obj2) {
                                        o0Var2 = o0Var;
                                        com.yandex.passport.sloth.data.c0 c0Var = (com.yandex.passport.sloth.data.c0) o0Var;
                                        i = jhp.i((Sequence) obj, xz0.r(new Pair[]{new Pair("service", c0Var.e), new Pair("brand", c0Var.f)}));
                                        sequence = i;
                                        o0Var = o0Var2;
                                    }
                                } else if (o0Var instanceof k0) {
                                    sequence = p5b.a;
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.a0) {
                                    com.yandex.passport.sloth.data.o oVar8 = ((com.yandex.passport.sloth.data.a0) o0Var).c;
                                    gVar.j = o0Var;
                                    gVar.k = o0Var;
                                    gVar.n = 10;
                                    obj = h(oVar8, "biometric_verification", gVar);
                                    if (obj != obj2) {
                                        o0Var2 = o0Var;
                                        i = jhp.i((Sequence) obj, new wz0(6, new Pair("biometric_session_id", ((com.yandex.passport.sloth.data.a0) o0Var).d)));
                                        sequence = i;
                                        o0Var = o0Var2;
                                    }
                                } else {
                                    if (!(o0Var instanceof h0)) {
                                        b6e.s();
                                        return null;
                                    }
                                    com.yandex.passport.sloth.data.o oVar9 = ((h0) o0Var).c;
                                    gVar.j = o0Var;
                                    gVar.k = null;
                                    gVar.n = 11;
                                    obj = h(oVar9, "register_webauthn", gVar);
                                    break;
                                }
                                if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                                }
                                if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                                }
                                sequence3 = p5b.a;
                                return jhp.i(sequence, jhp.i(sequence2, sequence3));
                            }
                            com.yandex.passport.sloth.data.o oVar10 = com.yandex.passport.sloth.data.o.a;
                            gVar.j = o0Var;
                            gVar.k = null;
                            gVar.n = 6;
                            obj = h(oVar10, "auth_sdk", gVar);
                            break;
                        }
                        return obj2;
                    case 1:
                        o0Var = gVar.k;
                        o0Var2 = gVar.j;
                        qgg.h0(obj);
                        i = jhp.i((Sequence) obj, xz0.r(new Pair[]{new Pair("nosocial", Boolean.TRUE), new Pair("force_required_upgrade", new Integer(com.yandex.plus.core.locale.b.o(((com.yandex.passport.sloth.data.u) o0Var).e)))}));
                        sequence = i;
                        o0Var = o0Var2;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 2:
                        o0Var = gVar.k;
                        o0Var2 = gVar.j;
                        qgg.h0(obj);
                        Sequence sequence42 = (Sequence) obj;
                        com.yandex.passport.sloth.dependencies.e d2 = ((com.yandex.passport.sloth.data.r) o0Var).d();
                        boolean z2 = d2.b;
                        EnumSet enumSet2 = d2.g;
                        Pair pair3 = new Pair("nosocial", Boolean.valueOf(!z2));
                        Pair pair22 = new Pair("auth_type", CollectionsKt.X(CollectionsKt.O(enumSet2), StringUtils.COMMA, null, null, new com.yandex.passport.internal.storage.d(23), 30));
                        z0 z0Var2 = this.g;
                        z0Var2.getClass();
                        nVar = z0Var2.a.a;
                        if (nVar == com.yandex.passport.sloth.data.n.Portal) {
                            nVar = com.yandex.passport.sloth.data.n.Neophonish;
                            break;
                        }
                        i = jhp.i(sequence42, xz0.r(new Pair[]{pair3, pair22, new Pair("reg_type", nVar), new Pair("noreturn", Integer.valueOf(com.yandex.plus.core.locale.b.o(d2.c))), new Pair("enable_2fa", Boolean.valueOf(d2.d)), new Pair("additional_action_request", d2.e)}));
                        sequence = i;
                        o0Var = o0Var2;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 3:
                        o0Var = gVar.j;
                        qgg.h0(obj);
                        sequence = (Sequence) obj;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 4:
                        o0Var = gVar.j;
                        qgg.h0(obj);
                        sequence = (Sequence) obj;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 5:
                        o0Var = gVar.j;
                        qgg.h0(obj);
                        sequence = (Sequence) obj;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 6:
                        o0Var = gVar.j;
                        qgg.h0(obj);
                        sequence = (Sequence) obj;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 7:
                        o0Var = gVar.k;
                        o0Var2 = gVar.j;
                        qgg.h0(obj);
                        LinkedHashMap linkedHashMap2 = ((m0) o0Var).c;
                        linkedHashMap2.getClass();
                        i = jhp.i((Sequence) obj, new o7t(CollectionsKt.F(linkedHashMap2.entrySet()), new com.yandex.passport.internal.storage.d(22)));
                        sequence = i;
                        o0Var = o0Var2;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 8:
                        o0Var = gVar.j;
                        qgg.h0(obj);
                        sequence = (Sequence) obj;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 9:
                        o0Var = gVar.k;
                        o0Var2 = gVar.j;
                        qgg.h0(obj);
                        com.yandex.passport.sloth.data.c0 c0Var2 = (com.yandex.passport.sloth.data.c0) o0Var;
                        i = jhp.i((Sequence) obj, xz0.r(new Pair[]{new Pair("service", c0Var2.e), new Pair("brand", c0Var2.f)}));
                        sequence = i;
                        o0Var = o0Var2;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 10:
                        o0Var = gVar.k;
                        o0Var2 = gVar.j;
                        qgg.h0(obj);
                        i = jhp.i((Sequence) obj, new wz0(6, new Pair("biometric_session_id", ((com.yandex.passport.sloth.data.a0) o0Var).d)));
                        sequence = i;
                        o0Var = o0Var2;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    case 11:
                        o0Var = gVar.j;
                        qgg.h0(obj);
                        sequence = (Sequence) obj;
                        if (!(o0Var instanceof com.yandex.passport.sloth.data.b0)) {
                        }
                        if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                        }
                        sequence3 = p5b.a;
                        return jhp.i(sequence, jhp.i(sequence2, sequence3));
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        gVar = new g(this, cg6Var);
        Object obj3 = gVar.l;
        Object obj22 = nm6.a;
        switch (gVar.n) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r6.f.c(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(cg6 cg6Var, com.yandex.passport.common.core.f fVar, String str) {
        h hVar;
        int i;
        Object a;
        Throwable a2;
        String str2;
        com.yandex.passport.common.url.b bVar;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.n = i2 - Integer.MIN_VALUE;
                Object obj = hVar.l;
                nm6 nm6Var = nm6.a;
                i = hVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    String h = com.yandex.passport.common.url.b.h(str);
                    hVar.j = fVar;
                    hVar.k = str;
                    hVar.n = 1;
                    a = this.h.a(hVar, fVar, h);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        str2 = "";
                        bVar = str2 == null ? new com.yandex.passport.common.url.b(str2) : null;
                        if (bVar != null) {
                            return bVar.a;
                        }
                        return null;
                    }
                    str = hVar.k;
                    fVar = hVar.j;
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                }
                a2 = z7o.a(a);
                if (a2 != null) {
                    List list = ((com.yandex.passport.sloth.dependencies.a) a).a;
                    this.j.getClass();
                    com.yandex.passport.sloth.f.a(str, list);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "url " + ((Object) com.yandex.passport.common.url.b.m(str)), 8);
                    }
                    bVar = new com.yandex.passport.common.url.b(str);
                    if (bVar != null) {
                    }
                } else if (a2 instanceof l0) {
                    com.yandex.passport.sloth.c0 c0Var = new com.yandex.passport.sloth.c0(fVar);
                    hVar.j = null;
                    hVar.k = null;
                    hVar.n = 2;
                } else {
                    str2 = null;
                    if (str2 == null) {
                    }
                    if (bVar != null) {
                    }
                }
            }
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.l;
        nm6 nm6Var2 = nm6.a;
        i = hVar.n;
        if (i != 0) {
        }
        a2 = z7o.a(a);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(com.yandex.passport.common.core.f fVar, String str, boolean z, Function1 function1, cg6 cg6Var) {
        i iVar;
        int i;
        Object k;
        Function1 function12;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.n = i2 - Integer.MIN_VALUE;
                Object obj = iVar.l;
                Object obj2 = nm6.a;
                i = iVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z) {
                        iVar.j = (aur) function1;
                        iVar.k = z;
                        iVar.n = 1;
                        k = k(iVar, fVar, str);
                        function12 = function1;
                    } else {
                        iVar.j = null;
                        iVar.k = z;
                        iVar.n = 3;
                        obj = function1.invoke(iVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    z = iVar.k;
                    Function1 function13 = (Function1) iVar.j;
                    qgg.h0(obj);
                    com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
                    if (bVar != null) {
                        k = bVar.a;
                        function12 = function13;
                    } else {
                        k = null;
                        function12 = function13;
                    }
                    String str2 = (String) k;
                    if (str2 != null) {
                        return str2;
                    }
                    iVar.j = null;
                    iVar.k = z;
                    iVar.n = 2;
                    obj = function12.invoke(iVar);
                } else if (i == 2) {
                    qgg.h0(obj);
                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) obj;
                    if (bVar2 != null) {
                        return bVar2.a;
                    }
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    com.yandex.passport.common.url.b bVar3 = (com.yandex.passport.common.url.b) obj;
                    if (bVar3 != null) {
                        return bVar3.a;
                    }
                }
                return null;
            }
        }
        iVar = new i(this, cg6Var);
        Object obj3 = iVar.l;
        Object obj22 = nm6.a;
        i = iVar.n;
        if (i != 0) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fe, code lost:
    
        if (r12 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        if (r8.b(r12, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
    
        if (r6 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(o0 o0Var, cg6 cg6Var) {
        j jVar;
        nm6 nm6Var;
        int i;
        o0 o0Var2;
        v vVar;
        Object b;
        Object v;
        o0 o0Var3;
        String str;
        Object emit;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.o = i2 - Integer.MIN_VALUE;
                Object obj = jVar.m;
                nm6Var = nm6.a;
                i = jVar.o;
                com.yandex.passport.sloth.v vVar2 = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    jVar.j = o0Var;
                    jVar.k = this;
                    jVar.o = 1;
                    obj = i(o0Var, jVar);
                    if (obj != nm6Var) {
                        o0Var2 = o0Var;
                        vVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        vVar = jVar.l;
                        Object obj2 = jVar.k;
                        o0 o0Var4 = jVar.j;
                        qgg.h0(obj);
                        obj = obj2;
                        o0Var2 = o0Var4;
                        jVar.j = o0Var2;
                        jVar.k = null;
                        jVar.l = null;
                        jVar.o = 3;
                        v = vVar.v((Uri) obj, o0Var2, jVar);
                        if (v != nm6Var) {
                            o0Var3 = o0Var2;
                            str = (String) v;
                            if (str == null) {
                            }
                        }
                        return nm6Var;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 5) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o0Var3 = jVar.j;
                    qgg.h0(obj);
                    com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj;
                    v = bVar != null ? bVar.a : null;
                    str = (String) v;
                    if (str == null) {
                        jVar.j = null;
                        jVar.k = null;
                        jVar.o = 4;
                        com.yandex.passport.sloth.data.k kVar = o0Var3.a;
                        kVar.getClass();
                        if (kVar == com.yandex.passport.sloth.data.k.AuthQrWithoutQr) {
                            emit = vVar2.d(new com.yandex.passport.sloth.w(str), jVar);
                            if (emit != nm6Var) {
                                emit = Unit.a;
                            }
                        } else {
                            vVar2.a.a(new com.yandex.passport.sloth.n0(16, r0.NAVIGATE_URL, dfi.n("url", x0.a(str))));
                            emit = vVar2.b.emit(new com.yandex.passport.common.url.b(str), jVar);
                            if (emit != nm6Var) {
                                emit = Unit.a;
                            }
                            if (emit != nm6Var) {
                                emit = Unit.a;
                            }
                        }
                    } else {
                        com.yandex.passport.sloth.o oVar = new com.yandex.passport.sloth.o(false, this.a.d.a);
                        jVar.j = null;
                        jVar.k = null;
                        jVar.o = 5;
                    }
                    return nm6Var;
                }
                vVar = (v) jVar.k;
                o0Var2 = jVar.j;
                qgg.h0(obj);
                jVar.j = o0Var2;
                jVar.k = obj;
                jVar.l = vVar;
                jVar.o = 2;
                b = vVar2.b(new com.yandex.passport.sloth.n(false), jVar);
                if (b != nm6Var) {
                    b = Unit.a;
                }
            }
        }
        jVar = new j(this, cg6Var);
        Object obj3 = jVar.m;
        nm6Var = nm6.a;
        i = jVar.o;
        com.yandex.passport.sloth.v vVar22 = this.f;
        if (i != 0) {
        }
        jVar.j = o0Var2;
        jVar.k = obj3;
        jVar.l = vVar;
        jVar.o = 2;
        b = vVar22.b(new com.yandex.passport.sloth.n(false), jVar);
        if (b != nm6Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0161, code lost:
    
        if (r11.f.c(r4, r0) == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(i0 i0Var, cg6 cg6Var) {
        k kVar;
        int i;
        com.yandex.passport.common.core.b bVar;
        i0 i0Var2;
        v vVar;
        Uri.Builder n;
        String str;
        com.yandex.passport.sloth.data.a aVar;
        Uri.Builder builder;
        com.yandex.passport.sloth.data.a aVar2;
        Throwable th;
        int i2;
        wis e;
        String uri;
        Object a;
        Object obj;
        Object t7oVar;
        Throwable a2;
        try {
            if (cg6Var instanceof k) {
                kVar = (k) cg6Var;
                int i3 = kVar.r;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kVar.r = i3 - Integer.MIN_VALUE;
                    Object obj2 = kVar.p;
                    nm6 nm6Var = nm6.a;
                    i = kVar.r;
                    if (i != 0) {
                        qgg.h0(obj2);
                        bVar = this.a.b;
                        String c = this.e.c(bVar, null);
                        kVar.j = i0Var;
                        kVar.k = bVar;
                        kVar.l = this;
                        kVar.r = 1;
                        obj2 = e(c, kVar);
                        if (obj2 != nm6Var) {
                            i0Var2 = i0Var;
                            vVar = this;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            n = (Uri.Builder) kVar.l;
                            qgg.h0(obj2);
                            new Uri.Builder();
                            return n;
                        }
                        i2 = kVar.o;
                        uri = kVar.n;
                        aVar2 = kVar.m;
                        builder = (Uri.Builder) kVar.l;
                        try {
                            qgg.h0(obj2);
                            obj = ((z7o) obj2).a;
                            qgg.h0(obj);
                            com.yandex.passport.sloth.f fVar = this.j;
                            List list = ((com.yandex.passport.sloth.dependencies.a) obj).a;
                            fVar.getClass();
                            com.yandex.passport.sloth.f.a(uri, list);
                            builder.appendQueryParameter("create_profile", PListParser.TAG_TRUE);
                            q(true, aVar2);
                            Object obj3 = Unit.a;
                            r7o r7oVar = z7o.b;
                            t7oVar = obj3;
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(e);
                            int i4 = i2;
                            n = builder;
                            a2 = z7o.a(t7oVar);
                            if (a2 != null) {
                            }
                            return n;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = new t7o(th);
                            int i42 = i2;
                            n = builder;
                            a2 = z7o.a(t7oVar);
                            if (a2 != null) {
                            }
                            return n;
                        }
                        int i422 = i2;
                        n = builder;
                        a2 = z7o.a(t7oVar);
                        if (a2 != null) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "An error occurred injecting cookies for profile creation: " + a2, 8);
                            }
                            q(false, aVar2);
                            com.yandex.passport.sloth.a0 a0Var = new com.yandex.passport.sloth.a0(a2, "registrationUrlBuilder");
                            kVar.j = null;
                            kVar.k = null;
                            kVar.l = n;
                            kVar.m = null;
                            kVar.n = null;
                            kVar.o = i422;
                            kVar.r = 3;
                        }
                        return n;
                    }
                    vVar = (v) kVar.l;
                    bVar = kVar.k;
                    i0Var2 = kVar.j;
                    qgg.h0(obj2);
                    vVar.getClass();
                    n = n((Uri.Builder) obj2, bVar);
                    str = i0Var2.e;
                    if (str != null) {
                        Uri parse = Uri.parse(str);
                        n.encodedPath(parse.getEncodedPath()).encodedQuery(parse.getEncodedQuery());
                    }
                    aVar = i0Var2.d;
                    if (aVar != null) {
                        try {
                            r7o r7oVar4 = z7o.b;
                            com.yandex.passport.common.url.a aVar3 = com.yandex.passport.common.url.b.Companion;
                            Uri build = n.build();
                            build.getClass();
                            aVar3.getClass();
                            uri = build.toString();
                            uri.getClass();
                            com.yandex.passport.internal.sloth.g gVar = this.h;
                            com.yandex.passport.common.core.f fVar2 = aVar.a;
                            String h = com.yandex.passport.common.url.b.h(uri);
                            kVar.j = null;
                            kVar.k = null;
                            kVar.l = n;
                            kVar.m = aVar;
                            kVar.n = uri;
                            kVar.o = 0;
                            kVar.r = 2;
                            a = gVar.a(kVar, fVar2, h);
                        } catch (wis e3) {
                            builder = n;
                            aVar2 = aVar;
                            e = e3;
                            i2 = 0;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(e);
                            int i4222 = i2;
                            n = builder;
                            a2 = z7o.a(t7oVar);
                            if (a2 != null) {
                            }
                            return n;
                        } catch (Throwable th3) {
                            builder = n;
                            aVar2 = aVar;
                            th = th3;
                            i2 = 0;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = new t7o(th);
                            int i42222 = i2;
                            n = builder;
                            a2 = z7o.a(t7oVar);
                            if (a2 != null) {
                            }
                            return n;
                        }
                        if (a != nm6Var) {
                            aVar2 = aVar;
                            obj = a;
                            builder = n;
                            i2 = 0;
                            qgg.h0(obj);
                            com.yandex.passport.sloth.f fVar3 = this.j;
                            List list2 = ((com.yandex.passport.sloth.dependencies.a) obj).a;
                            fVar3.getClass();
                            com.yandex.passport.sloth.f.a(uri, list2);
                            builder.appendQueryParameter("create_profile", PListParser.TAG_TRUE);
                            q(true, aVar2);
                            Object obj32 = Unit.a;
                            r7o r7oVar5 = z7o.b;
                            t7oVar = obj32;
                            int i422222 = i2;
                            n = builder;
                            a2 = z7o.a(t7oVar);
                            if (a2 != null) {
                            }
                        }
                        return nm6Var;
                    }
                    return n;
                }
            }
            if (i != 0) {
            }
            vVar.getClass();
            n = n((Uri.Builder) obj2, bVar);
            str = i0Var2.e;
            if (str != null) {
            }
            aVar = i0Var2.d;
            if (aVar != null) {
            }
            return n;
        } catch (CancellationException e4) {
            throw e4;
        }
        kVar = new k(this, cg6Var);
        Object obj22 = kVar.p;
        nm6 nm6Var2 = nm6.a;
        i = kVar.r;
    }

    public final void q(boolean z, com.yandex.passport.sloth.data.a aVar) {
        f9h f9hVar = new f9h();
        f9hVar.put("success", String.valueOf(z));
        com.yandex.passport.common.core.f fVar = aVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        f9hVar.put("uid", sb.toString());
        com.yandex.passport.common.core.f fVar2 = aVar.b;
        if (fVar2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fVar2.a.a);
            sb2.append(':');
            sb2.append(fVar2.b);
            f9hVar.put("muid", sb2.toString());
        }
        f9h b = f9hVar.b();
        a1 a1Var = this.m;
        a1Var.getClass();
        com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) a1Var.a;
        oVar.getClass();
        if (oVar.a()) {
            oVar.a.a("create_master_profile.cookie_injected", b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Uri uri, com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.c cVar, cg6 cg6Var) {
        o oVar;
        int i;
        Object d;
        com.yandex.passport.common.core.f fVar2;
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i2 = oVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.m = i2 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj = oVar2.k;
                nm6 nm6Var = nm6.a;
                i = oVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) this.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String a = com.yandex.passport.common.url.a.a(uri);
                    oVar2.j = fVar;
                    oVar2.m = 1;
                    d = ((com.yandex.passport.internal.sloth.w) this.b).d(fVar, b, a, cVar, oVar2);
                    if (d != nm6Var) {
                        fVar2 = fVar;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return "";
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar2 = oVar2.j;
                qgg.h0(obj);
                d = ((z7o) obj).a;
                if (z7o.a(d) != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                com.yandex.passport.sloth.c0 c0Var = new com.yandex.passport.sloth.c0(fVar2);
                oVar2.j = null;
                oVar2.m = 2;
                return this.f.c(c0Var, oVar2) == nm6Var ? nm6Var : "";
            }
        }
        oVar = new o(this, cg6Var);
        o oVar22 = oVar;
        Object obj2 = oVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = oVar22.m;
        if (i != 0) {
        }
        if (z7o.a(d) != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r9 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Uri uri, com.yandex.passport.common.core.f fVar, com.yandex.passport.common.core.c cVar, cg6 cg6Var) {
        q qVar;
        int i;
        Object d;
        Throwable a;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.l = i2 - Integer.MIN_VALUE;
                q qVar2 = qVar;
                Object obj = qVar2.j;
                nm6 nm6Var = nm6.a;
                i = qVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) this.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String a2 = com.yandex.passport.common.url.a.a(uri);
                    qVar2.l = 1;
                    d = ((com.yandex.passport.internal.sloth.w) this.b).d(fVar, b, a2, cVar, qVar2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return "";
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                }
                a = z7o.a(d);
                if (a != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                com.yandex.passport.sloth.a0 a0Var = new com.yandex.passport.sloth.a0(a, "invalid master token");
                qVar2.l = 2;
                return this.f.c(a0Var, qVar2) == nm6Var ? nm6Var : "";
            }
        }
        qVar = new q(this, cg6Var);
        q qVar22 = qVar;
        Object obj2 = qVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = qVar22.l;
        if (i != 0) {
        }
        a = z7o.a(d);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Uri uri, com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        r rVar;
        int i;
        Object d;
        Throwable a;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.m = i2 - Integer.MIN_VALUE;
                r rVar2 = rVar;
                Object obj = rVar2.k;
                nm6 nm6Var = nm6.a;
                i = rVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (fVar == null) {
                        com.yandex.passport.common.url.b.Companion.getClass();
                        return com.yandex.passport.common.url.b.b(com.yandex.passport.common.url.a.a(uri), new Pair("deauthorize", PListParser.TAG_TRUE));
                    }
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) this.c).b();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    String a2 = com.yandex.passport.common.url.a.a(uri);
                    com.yandex.passport.common.core.c cVar = com.yandex.passport.common.core.c.a;
                    rVar2.j = uri;
                    rVar2.m = 1;
                    d = ((com.yandex.passport.internal.sloth.w) this.b).d(fVar, b, a2, cVar, rVar2);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return "";
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = rVar2.j;
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                }
                a = z7o.a(d);
                if (a != null) {
                    return ((com.yandex.passport.common.url.b) d).a;
                }
                if (!(a instanceof IOException)) {
                    com.yandex.passport.common.url.b.Companion.getClass();
                    return com.yandex.passport.common.url.b.b(com.yandex.passport.common.url.a.a(uri), new Pair("deauthorize", PListParser.TAG_TRUE));
                }
                com.yandex.passport.sloth.m mVar = new com.yandex.passport.sloth.m(t75.c(new com.yandex.passport.sloth.k("lost_connection")));
                rVar2.j = null;
                rVar2.m = 2;
                return this.f.d(mVar, rVar2) == nm6Var ? nm6Var : "";
            }
        }
        rVar = new r(this, cg6Var);
        r rVar22 = rVar;
        Object obj2 = rVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = rVar22.m;
        if (i != 0) {
        }
        a = z7o.a(d);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b2, code lost:
    
        if (r17.f.c(r0, r4) == r5) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d A[Catch: CancellationException -> 0x0059, all -> 0x008b, wis -> 0x008e, TryCatch #6 {CancellationException -> 0x0059, blocks: (B:21:0x004f, B:23:0x0141, B:24:0x0151, B:44:0x006c, B:46:0x0104, B:49:0x011d, B:60:0x0082, B:62:0x00bd, B:63:0x00d4, B:65:0x00da, B:70:0x00ec, B:74:0x0154, B:75:0x015b, B:83:0x0094), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da A[Catch: CancellationException -> 0x0059, all -> 0x008b, wis -> 0x008e, TryCatch #6 {CancellationException -> 0x0059, blocks: (B:21:0x004f, B:23:0x0141, B:24:0x0151, B:44:0x006c, B:46:0x0104, B:49:0x011d, B:60:0x0082, B:62:0x00bd, B:63:0x00d4, B:65:0x00da, B:70:0x00ec, B:74:0x0154, B:75:0x015b, B:83:0x0094), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec A[Catch: CancellationException -> 0x0059, all -> 0x008b, wis -> 0x008e, TryCatch #6 {CancellationException -> 0x0059, blocks: (B:21:0x004f, B:23:0x0141, B:24:0x0151, B:44:0x006c, B:46:0x0104, B:49:0x011d, B:60:0x0082, B:62:0x00bd, B:63:0x00d4, B:65:0x00da, B:70:0x00ec, B:74:0x0154, B:75:0x015b, B:83:0x0094), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154 A[Catch: CancellationException -> 0x0059, all -> 0x008b, wis -> 0x008e, TryCatch #6 {CancellationException -> 0x0059, blocks: (B:21:0x004f, B:23:0x0141, B:24:0x0151, B:44:0x006c, B:46:0x0104, B:49:0x011d, B:60:0x0082, B:62:0x00bd, B:63:0x00d4, B:65:0x00da, B:70:0x00ec, B:74:0x0154, B:75:0x015b, B:83:0x0094), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.passport.sloth.url.v] */
    /* JADX WARN: Type inference failed for: r2v12, types: [t7o] */
    /* JADX WARN: Type inference failed for: r2v9, types: [t7o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(k0 k0Var, cg6 cg6Var) {
        s sVar;
        int i;
        k0 k0Var2;
        String str;
        Object obj;
        int i2;
        int i3;
        Iterator it;
        String str2;
        com.yandex.passport.common.core.f fVar;
        int i4;
        Uri.Builder appendQueryParameter;
        Uri.Builder builder;
        Uri.Builder builder2;
        Throwable a;
        com.yandex.passport.sloth.f fVar2 = this.j;
        try {
            if (cg6Var instanceof s) {
                sVar = (s) cg6Var;
                int i5 = sVar.r;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    sVar.r = i5 - Integer.MIN_VALUE;
                    Object obj2 = sVar.p;
                    nm6 nm6Var = nm6.a;
                    i = sVar.r;
                    com.yandex.passport.sloth.data.m mVar = this.a;
                    com.yandex.passport.internal.sloth.j jVar = this.e;
                    if (i != 0) {
                        qgg.h0(obj2);
                        try {
                            r7o r7oVar = z7o.b;
                            String d = jVar.d(mVar.b, k0Var.d);
                            com.yandex.passport.internal.sloth.g gVar = this.h;
                            com.yandex.passport.common.core.f fVar3 = k0Var.b;
                            String h = com.yandex.passport.common.url.b.h(d);
                            sVar.j = k0Var;
                            sVar.k = d;
                            sVar.n = 0;
                            sVar.o = 0;
                            sVar.r = 1;
                            Object a2 = gVar.a(sVar, fVar3, h);
                            if (a2 != nm6Var) {
                                str = d;
                                k0Var2 = k0Var;
                                obj = a2;
                                i2 = 0;
                                i3 = 0;
                            }
                        } catch (wis e) {
                            e = e;
                            k0Var2 = k0Var;
                            r7o r7oVar2 = z7o.b;
                            builder2 = new t7o(e);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            k0Var2 = k0Var;
                            r7o r7oVar3 = z7o.b;
                            builder2 = new t7o(th);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        }
                        return nm6Var;
                    }
                    if (i == 1) {
                        i2 = sVar.o;
                        int i6 = sVar.n;
                        str = sVar.k;
                        k0Var2 = sVar.j;
                        try {
                            qgg.h0(obj2);
                            obj = ((z7o) obj2).a;
                            i3 = i6;
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar22 = z7o.b;
                            builder2 = new t7o(e);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar32 = z7o.b;
                            builder2 = new t7o(th);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        }
                    } else if (i == 2) {
                        i2 = sVar.o;
                        i4 = sVar.n;
                        str2 = (String) sVar.m;
                        fVar = sVar.l;
                        k0 k0Var3 = sVar.j;
                        try {
                            qgg.h0(obj2);
                            k0Var2 = k0Var3;
                            appendQueryParameter = ((Uri.Builder) obj2).appendQueryParameter("uid", String.valueOf(fVar.b)).appendQueryParameter("yu", str2);
                        } catch (wis e3) {
                            e = e3;
                            k0Var2 = k0Var3;
                            r7o r7oVar222 = z7o.b;
                            builder2 = new t7o(e);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            k0Var2 = k0Var3;
                            r7o r7oVar322 = z7o.b;
                            builder2 = new t7o(th);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        }
                        if (k0Var2.e) {
                            r7o r7oVar4 = z7o.b;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        } else {
                            String b = jVar.b(mVar.b, k0Var2.d);
                            sVar.j = k0Var2;
                            sVar.k = null;
                            sVar.l = null;
                            sVar.m = appendQueryParameter;
                            sVar.n = i4;
                            sVar.o = i2;
                            sVar.r = 3;
                            Object e4 = e(b, sVar);
                            if (e4 == nm6Var) {
                                return nm6Var;
                            }
                            builder = appendQueryParameter;
                            obj2 = e4;
                            appendQueryParameter = ((Uri.Builder) obj2).appendQueryParameter("retpath", builder.build().toString());
                            r7o r7oVar42 = z7o.b;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj2);
                            return new Uri.Builder();
                        }
                        builder = (Uri.Builder) sVar.m;
                        k0 k0Var4 = sVar.j;
                        try {
                            qgg.h0(obj2);
                            k0Var2 = k0Var4;
                            appendQueryParameter = ((Uri.Builder) obj2).appendQueryParameter("retpath", builder.build().toString());
                            r7o r7oVar422 = z7o.b;
                        } catch (wis e5) {
                            e = e5;
                            k0Var2 = k0Var4;
                            r7o r7oVar2222 = z7o.b;
                            builder2 = new t7o(e);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            k0Var2 = k0Var4;
                            r7o r7oVar3222 = z7o.b;
                            builder2 = new t7o(th);
                            appendQueryParameter = builder2;
                            a = z7o.a(appendQueryParameter);
                            if (a == null) {
                            }
                        }
                        a = z7o.a(appendQueryParameter);
                        if (a == null) {
                            return appendQueryParameter;
                        }
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "A problem occured in switchMasterUrlBuilder: " + a, 8);
                        }
                        com.yandex.passport.sloth.c0 c0Var = new com.yandex.passport.sloth.c0(k0Var2.c);
                        sVar.j = null;
                        sVar.k = null;
                        sVar.l = null;
                        sVar.m = null;
                        sVar.n = 0;
                        sVar.r = 4;
                    }
                    qgg.h0(obj);
                    com.yandex.passport.sloth.dependencies.a aVar = (com.yandex.passport.sloth.dependencies.a) obj;
                    List list = aVar.a;
                    fVar2.getClass();
                    com.yandex.passport.sloth.f.a(str, list);
                    com.yandex.passport.common.core.f fVar4 = k0Var2.c;
                    it = aVar.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str2 = null;
                            break;
                        }
                        str2 = com.yandex.passport.sloth.f.b((String) it.next(), "yandexuid");
                        if (str2 != null) {
                            break;
                        }
                    }
                    if (str2 != null) {
                        throw new IllegalStateException("No yandexuid cookie found in provided cookies.");
                    }
                    sVar.j = k0Var2;
                    sVar.k = null;
                    sVar.l = fVar4;
                    sVar.m = str2;
                    sVar.n = i3;
                    sVar.o = i2;
                    sVar.r = 2;
                    obj2 = e(str, sVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    fVar = fVar4;
                    i4 = i3;
                    appendQueryParameter = ((Uri.Builder) obj2).appendQueryParameter("uid", String.valueOf(fVar.b)).appendQueryParameter("yu", str2);
                    if (k0Var2.e) {
                    }
                }
            }
            if (i != 0) {
            }
            qgg.h0(obj);
            com.yandex.passport.sloth.dependencies.a aVar2 = (com.yandex.passport.sloth.dependencies.a) obj;
            List list2 = aVar2.a;
            fVar2.getClass();
            com.yandex.passport.sloth.f.a(str, list2);
            com.yandex.passport.common.core.f fVar42 = k0Var2.c;
            it = aVar2.a.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            if (str2 != null) {
            }
        } catch (CancellationException e6) {
            throw e6;
        }
        sVar = new s(this, cg6Var);
        Object obj22 = sVar.p;
        nm6 nm6Var2 = nm6.a;
        i = sVar.r;
        com.yandex.passport.sloth.data.m mVar2 = this.a;
        com.yandex.passport.internal.sloth.j jVar2 = this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f0, code lost:
    
        if (r4 != r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0133, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0155, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x020d, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0233, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0301, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0405, code lost:
    
        if (r4 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0428, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0445, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0470, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x048d, code lost:
    
        if (r0 == r9) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03c6, code lost:
    
        if (r4 != r9) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0363, code lost:
    
        if (r4 != r9) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02e5, code lost:
    
        if (r4 != r9) goto L133;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Uri uri, o0 o0Var, cg6 cg6Var) {
        t tVar;
        int i;
        com.yandex.passport.common.core.f fVar;
        Uri uri2;
        o0 o0Var2;
        Object obj;
        v vVar;
        com.yandex.passport.common.core.f fVar2;
        Uri uri3;
        o0 o0Var3;
        Object obj2;
        v vVar2;
        Object t7oVar;
        Uri uri4;
        o0 o0Var4;
        Object obj3;
        com.yandex.passport.common.core.f fVar3;
        v vVar3;
        Object t7oVar2;
        Object obj4;
        Uri uri5;
        o0 o0Var5;
        com.yandex.passport.common.core.f fVar4;
        v vVar4;
        Object obj5;
        Object obj6;
        String str;
        Object obj7;
        Object obj8;
        String str2;
        Object obj9;
        String str3;
        String str4;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i2 = tVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.p = i2 - Integer.MIN_VALUE;
                t tVar2 = tVar;
                Object obj14 = tVar2.n;
                nm6 nm6Var = nm6.a;
                i = tVar2.p;
                ?? r4 = 0;
                Object obj15 = null;
                Object l = null;
                Object l2 = null;
                Object l3 = null;
                com.yandex.passport.sloth.dependencies.d dVar = this.k;
                switch (i) {
                    case 0:
                        qgg.h0(obj14);
                        if (o0Var instanceof com.yandex.passport.sloth.data.u) {
                            com.yandex.passport.common.core.f fVar5 = ((com.yandex.passport.sloth.data.u) o0Var).c;
                            boolean z = dVar.b;
                            com.yandex.passport.common.core.c cVar = com.yandex.passport.common.core.c.a;
                            tVar2.j = null;
                            tVar2.k = null;
                            tVar2.p = 1;
                            Object f = f(uri, fVar5, z, cVar, tVar2);
                            obj5 = f;
                            break;
                        } else if (o0Var instanceof com.yandex.passport.sloth.data.e0) {
                            com.yandex.passport.common.core.f fVar6 = ((com.yandex.passport.sloth.data.e0) o0Var).b;
                            boolean z2 = dVar.c;
                            com.yandex.passport.common.core.c cVar2 = com.yandex.passport.common.core.c.a;
                            tVar2.j = null;
                            tVar2.k = null;
                            tVar2.p = 2;
                            Object f2 = f(uri, fVar6, z2, cVar2, tVar2);
                            obj6 = f2;
                            break;
                        } else {
                            boolean z3 = o0Var instanceof com.yandex.passport.sloth.data.v;
                            com.yandex.passport.sloth.dependencies.i iVar = this.b;
                            if (z3) {
                                com.yandex.passport.common.core.f fVar7 = ((com.yandex.passport.sloth.data.v) o0Var).c;
                                com.yandex.passport.common.url.b.Companion.getClass();
                                String a = com.yandex.passport.common.url.a.a(uri);
                                tVar2.j = uri;
                                tVar2.k = o0Var;
                                tVar2.l = this;
                                tVar2.m = fVar7;
                                tVar2.p = 3;
                                com.yandex.passport.internal.sloth.w wVar = (com.yandex.passport.internal.sloth.w) iVar;
                                wVar.getClass();
                                try {
                                    r7o r7oVar = z7o.b;
                                    String uri6 = wVar.g.b(fVar7.b, a).toString();
                                    uri6.getClass();
                                    t7oVar2 = new com.yandex.passport.common.url.b(uri6);
                                } catch (wis e) {
                                    r7o r7oVar2 = z7o.b;
                                    t7oVar2 = new t7o(e);
                                } catch (CancellationException e2) {
                                    throw e2;
                                } catch (Throwable th) {
                                    r7o r7oVar3 = z7o.b;
                                    t7oVar2 = new t7o(th);
                                }
                                obj4 = t7oVar2;
                                if (obj4 != nm6Var) {
                                    uri5 = uri;
                                    o0Var5 = o0Var;
                                    fVar4 = fVar7;
                                    vVar4 = this;
                                    r7o r7oVar4 = z7o.b;
                                    if (obj4 instanceof t7o) {
                                        obj4 = null;
                                    }
                                    com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) obj4;
                                    str = bVar == null ? bVar.a : null;
                                    if (str == null) {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        str = com.yandex.passport.common.url.a.a(uri5);
                                    }
                                    String str5 = str;
                                    boolean z4 = dVar.d;
                                    u uVar = new u(this, uri5, o0Var5, r4, 0);
                                    tVar2.j = null;
                                    tVar2.k = null;
                                    tVar2.l = null;
                                    tVar2.m = null;
                                    tVar2.p = 4;
                                    Object l4 = vVar4.l(fVar4, str5, z4, uVar, tVar2);
                                    r4 = l4;
                                    break;
                                }
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.w) {
                                com.yandex.passport.common.core.f fVar8 = ((com.yandex.passport.sloth.data.w) o0Var).c;
                                com.yandex.passport.common.core.c cVar3 = com.yandex.passport.common.core.c.a;
                                tVar2.j = null;
                                tVar2.k = null;
                                tVar2.p = 5;
                                Object r = r(uri, fVar8, cVar3, tVar2);
                                obj7 = r;
                                break;
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.x) {
                                com.yandex.passport.common.core.f fVar9 = ((com.yandex.passport.sloth.data.x) o0Var).b;
                                if (fVar9 == null) {
                                    com.yandex.passport.common.url.b.Companion.getClass();
                                    return com.yandex.passport.common.url.a.a(uri);
                                }
                                boolean z5 = dVar.e;
                                com.yandex.passport.common.core.c cVar4 = com.yandex.passport.common.core.c.a;
                                tVar2.j = null;
                                tVar2.k = null;
                                tVar2.l = null;
                                tVar2.p = 6;
                                Object f3 = f(uri, fVar9, z5, cVar4, tVar2);
                                obj8 = f3;
                                break;
                            } else if (o0Var instanceof n0) {
                                com.yandex.passport.common.core.f fVar10 = ((n0) o0Var).c;
                                com.yandex.passport.common.url.b.Companion.getClass();
                                String a2 = com.yandex.passport.common.url.a.a(uri);
                                tVar2.j = uri;
                                tVar2.k = o0Var;
                                tVar2.l = this;
                                tVar2.m = fVar10;
                                tVar2.p = 7;
                                com.yandex.passport.internal.sloth.w wVar2 = (com.yandex.passport.internal.sloth.w) iVar;
                                wVar2.getClass();
                                try {
                                    r7o r7oVar5 = z7o.b;
                                    com.yandex.passport.internal.network.r rVar = wVar2.g;
                                    long j = fVar10.b;
                                    String uri7 = Uri.parse(a2).toString();
                                    uri7.getClass();
                                    String uri8 = rVar.a(j, uri7).toString();
                                    uri8.getClass();
                                    t7oVar = new com.yandex.passport.common.url.b(com.yandex.passport.common.url.b.l(uri8));
                                } catch (wis e3) {
                                    r7o r7oVar6 = z7o.b;
                                    t7oVar = new t7o(e3);
                                } catch (CancellationException e4) {
                                    throw e4;
                                } catch (Throwable th2) {
                                    r7o r7oVar7 = z7o.b;
                                    t7oVar = new t7o(th2);
                                }
                                if (t7oVar != nm6Var) {
                                    uri4 = uri;
                                    o0Var4 = o0Var;
                                    obj3 = t7oVar;
                                    fVar3 = fVar10;
                                    vVar3 = this;
                                    r7o r7oVar8 = z7o.b;
                                    if (obj3 instanceof t7o) {
                                        obj3 = null;
                                    }
                                    com.yandex.passport.common.url.b bVar2 = (com.yandex.passport.common.url.b) obj3;
                                    str2 = bVar2 == null ? bVar2.a : null;
                                    if (str2 == null) {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        str2 = com.yandex.passport.common.url.a.a(uri4);
                                    }
                                    String str6 = str2;
                                    boolean z6 = dVar.f;
                                    u uVar2 = new u(this, uri4, o0Var4, r4, 1);
                                    tVar2.j = null;
                                    tVar2.k = null;
                                    tVar2.l = null;
                                    tVar2.m = null;
                                    tVar2.p = 8;
                                    l3 = vVar3.l(fVar3, str6, z6, uVar2, tVar2);
                                    break;
                                }
                            } else if (o0Var instanceof m0) {
                                com.yandex.passport.common.core.f fVar11 = ((m0) o0Var).d;
                                tVar2.j = null;
                                tVar2.k = null;
                                tVar2.p = 9;
                                Object t = t(uri, fVar11, tVar2);
                                obj9 = t;
                                break;
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.g0) {
                                com.yandex.passport.sloth.data.g0 g0Var = (com.yandex.passport.sloth.data.g0) o0Var;
                                fVar2 = g0Var.e;
                                tVar2.j = uri;
                                tVar2.k = o0Var;
                                tVar2.l = this;
                                tVar2.m = fVar2;
                                tVar2.p = 10;
                                Object e5 = ((com.yandex.passport.internal.sloth.w) iVar).e(g0Var, tVar2);
                                if (e5 != nm6Var) {
                                    uri3 = uri;
                                    o0Var3 = o0Var;
                                    obj2 = e5;
                                    vVar2 = this;
                                    r7o r7oVar9 = z7o.b;
                                    if (obj2 instanceof t7o) {
                                        obj2 = null;
                                    }
                                    com.yandex.passport.common.url.b bVar3 = (com.yandex.passport.common.url.b) obj2;
                                    str3 = bVar3 == null ? bVar3.a : null;
                                    if (str3 == null) {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        str3 = com.yandex.passport.common.url.a.a(uri3);
                                    }
                                    boolean z7 = dVar.f;
                                    com.yandex.passport.common.core.f fVar12 = fVar2;
                                    jbb jbbVar = new jbb(this, o0Var3, uri3, (Continuation) null);
                                    tVar2.j = null;
                                    tVar2.k = null;
                                    tVar2.l = null;
                                    tVar2.m = null;
                                    tVar2.p = 11;
                                    l2 = vVar2.l(fVar12, str3, z7, jbbVar, tVar2);
                                    break;
                                }
                            } else if (o0Var instanceof com.yandex.passport.sloth.data.y) {
                                com.yandex.passport.sloth.data.y yVar = (com.yandex.passport.sloth.data.y) o0Var;
                                fVar = yVar.f;
                                tVar2.j = uri;
                                tVar2.k = o0Var;
                                tVar2.l = this;
                                tVar2.m = fVar;
                                tVar2.p = 12;
                                Object f4 = ((com.yandex.passport.internal.sloth.w) iVar).f(yVar, tVar2);
                                if (f4 != nm6Var) {
                                    uri2 = uri;
                                    o0Var2 = o0Var;
                                    obj = f4;
                                    vVar = this;
                                    r7o r7oVar10 = z7o.b;
                                    if (obj instanceof t7o) {
                                        obj = null;
                                    }
                                    com.yandex.passport.common.url.b bVar4 = (com.yandex.passport.common.url.b) obj;
                                    str4 = bVar4 == null ? bVar4.a : null;
                                    if (str4 == null) {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        str4 = com.yandex.passport.common.url.a.a(uri2);
                                    }
                                    boolean z8 = dVar.g;
                                    com.yandex.passport.common.core.f fVar13 = fVar;
                                    w90 w90Var = new w90(this, o0Var2, r4, 21);
                                    tVar2.j = null;
                                    tVar2.k = null;
                                    tVar2.l = null;
                                    tVar2.m = null;
                                    tVar2.p = 13;
                                    l = vVar.l(fVar13, str4, z8, w90Var, tVar2);
                                    break;
                                }
                            } else {
                                if ((o0Var instanceof com.yandex.passport.sloth.data.r) || (o0Var instanceof com.yandex.passport.sloth.data.z)) {
                                    com.yandex.passport.common.url.b.Companion.getClass();
                                    return com.yandex.passport.common.url.a.a(uri);
                                }
                                if (o0Var instanceof com.yandex.passport.sloth.data.t) {
                                    com.yandex.passport.common.core.f fVar14 = ((com.yandex.passport.sloth.data.t) o0Var).b;
                                    com.yandex.passport.common.url.b.Companion.getClass();
                                    String a3 = com.yandex.passport.common.url.a.a(uri);
                                    boolean z9 = dVar.i;
                                    u uVar3 = new u(this, uri, o0Var, r4, 2);
                                    tVar2.j = null;
                                    tVar2.k = null;
                                    tVar2.p = 14;
                                    Object l5 = l(fVar14, a3, z9, uVar3, tVar2);
                                    obj15 = l5;
                                    break;
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.d0) {
                                    com.yandex.passport.common.core.f fVar15 = ((com.yandex.passport.sloth.data.d0) o0Var).c;
                                    boolean z10 = dVar.h;
                                    com.yandex.passport.common.core.c cVar5 = com.yandex.passport.common.core.c.a;
                                    tVar2.j = null;
                                    tVar2.k = null;
                                    tVar2.p = 15;
                                    Object f5 = f(uri, fVar15, z10, cVar5, tVar2);
                                    obj10 = f5;
                                    break;
                                } else if (o0Var instanceof com.yandex.passport.sloth.data.c0) {
                                    com.yandex.passport.common.core.f fVar16 = ((com.yandex.passport.sloth.data.c0) o0Var).b;
                                    com.yandex.passport.common.core.c cVar6 = com.yandex.passport.common.core.c.b;
                                    tVar2.j = null;
                                    tVar2.k = null;
                                    tVar2.p = 16;
                                    Object s = s(uri, fVar16, cVar6, tVar2);
                                    obj11 = s;
                                    break;
                                } else {
                                    if (o0Var instanceof k0) {
                                        com.yandex.passport.common.url.b.Companion.getClass();
                                        return com.yandex.passport.common.url.a.a(uri);
                                    }
                                    if (o0Var instanceof com.yandex.passport.sloth.data.a0) {
                                        com.yandex.passport.common.core.f fVar17 = ((com.yandex.passport.sloth.data.a0) o0Var).b;
                                        com.yandex.passport.common.core.c cVar7 = com.yandex.passport.common.core.c.b;
                                        tVar2.j = null;
                                        tVar2.k = null;
                                        tVar2.p = 17;
                                        Object r2 = r(uri, fVar17, cVar7, tVar2);
                                        obj12 = r2;
                                        break;
                                    } else {
                                        if (!(o0Var instanceof h0)) {
                                            b6e.s();
                                            return null;
                                        }
                                        com.yandex.passport.common.core.f fVar18 = ((h0) o0Var).b;
                                        com.yandex.passport.common.core.c cVar8 = com.yandex.passport.common.core.c.a;
                                        tVar2.j = null;
                                        tVar2.k = null;
                                        tVar2.p = 18;
                                        Object r3 = r(uri, fVar18, cVar8, tVar2);
                                        obj13 = r3;
                                        break;
                                    }
                                }
                            }
                        }
                        return nm6Var;
                    case 1:
                        qgg.h0(obj14);
                        obj5 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj5;
                    case 2:
                        qgg.h0(obj14);
                        obj6 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj6;
                    case 3:
                        com.yandex.passport.common.core.f fVar19 = tVar2.m;
                        v vVar5 = tVar2.l;
                        o0 o0Var6 = tVar2.k;
                        Uri uri9 = tVar2.j;
                        qgg.h0(obj14);
                        obj4 = ((z7o) obj14).a;
                        fVar4 = fVar19;
                        uri5 = uri9;
                        vVar4 = vVar5;
                        o0Var5 = o0Var6;
                        r7o r7oVar42 = z7o.b;
                        if (obj4 instanceof t7o) {
                        }
                        com.yandex.passport.common.url.b bVar5 = (com.yandex.passport.common.url.b) obj4;
                        if (bVar5 == null) {
                        }
                        if (str == null) {
                        }
                        String str52 = str;
                        boolean z42 = dVar.d;
                        u uVar4 = new u(this, uri5, o0Var5, r4, 0);
                        tVar2.j = null;
                        tVar2.k = null;
                        tVar2.l = null;
                        tVar2.m = null;
                        tVar2.p = 4;
                        Object l42 = vVar4.l(fVar4, str52, z42, uVar4, tVar2);
                        r4 = l42;
                        break;
                    case 4:
                        qgg.h0(obj14);
                        com.yandex.passport.common.url.b bVar6 = (com.yandex.passport.common.url.b) obj14;
                        if (bVar6 != null) {
                            r4 = bVar6.a;
                        }
                        return (String) r4;
                    case 5:
                        qgg.h0(obj14);
                        obj7 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj7;
                    case 6:
                        qgg.h0(obj14);
                        obj8 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj8;
                    case 7:
                        com.yandex.passport.common.core.f fVar20 = tVar2.m;
                        v vVar6 = tVar2.l;
                        o0 o0Var7 = tVar2.k;
                        Uri uri10 = tVar2.j;
                        qgg.h0(obj14);
                        obj3 = ((z7o) obj14).a;
                        fVar3 = fVar20;
                        uri4 = uri10;
                        vVar3 = vVar6;
                        o0Var4 = o0Var7;
                        r7o r7oVar82 = z7o.b;
                        if (obj3 instanceof t7o) {
                        }
                        com.yandex.passport.common.url.b bVar22 = (com.yandex.passport.common.url.b) obj3;
                        if (bVar22 == null) {
                        }
                        if (str2 == null) {
                        }
                        String str62 = str2;
                        boolean z62 = dVar.f;
                        u uVar22 = new u(this, uri4, o0Var4, r4, 1);
                        tVar2.j = null;
                        tVar2.k = null;
                        tVar2.l = null;
                        tVar2.m = null;
                        tVar2.p = 8;
                        l3 = vVar3.l(fVar3, str62, z62, uVar22, tVar2);
                        break;
                    case 8:
                        qgg.h0(obj14);
                        com.yandex.passport.common.url.b bVar7 = (com.yandex.passport.common.url.b) obj14;
                        if (bVar7 != null) {
                            l3 = bVar7.a;
                        }
                        return (String) l3;
                    case 9:
                        qgg.h0(obj14);
                        obj9 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj9;
                    case 10:
                        com.yandex.passport.common.core.f fVar21 = tVar2.m;
                        v vVar7 = tVar2.l;
                        o0 o0Var8 = tVar2.k;
                        Uri uri11 = tVar2.j;
                        qgg.h0(obj14);
                        obj2 = ((z7o) obj14).a;
                        vVar2 = vVar7;
                        o0Var3 = o0Var8;
                        fVar2 = fVar21;
                        uri3 = uri11;
                        r7o r7oVar92 = z7o.b;
                        if (obj2 instanceof t7o) {
                        }
                        com.yandex.passport.common.url.b bVar32 = (com.yandex.passport.common.url.b) obj2;
                        if (bVar32 == null) {
                        }
                        if (str3 == null) {
                        }
                        boolean z72 = dVar.f;
                        com.yandex.passport.common.core.f fVar122 = fVar2;
                        jbb jbbVar2 = new jbb(this, o0Var3, uri3, (Continuation) null);
                        tVar2.j = null;
                        tVar2.k = null;
                        tVar2.l = null;
                        tVar2.m = null;
                        tVar2.p = 11;
                        l2 = vVar2.l(fVar122, str3, z72, jbbVar2, tVar2);
                        break;
                    case 11:
                        qgg.h0(obj14);
                        com.yandex.passport.common.url.b bVar8 = (com.yandex.passport.common.url.b) obj14;
                        if (bVar8 != null) {
                            l2 = bVar8.a;
                        }
                        return (String) l2;
                    case 12:
                        com.yandex.passport.common.core.f fVar22 = tVar2.m;
                        v vVar8 = tVar2.l;
                        o0 o0Var9 = tVar2.k;
                        Uri uri12 = tVar2.j;
                        qgg.h0(obj14);
                        obj = ((z7o) obj14).a;
                        vVar = vVar8;
                        o0Var2 = o0Var9;
                        fVar = fVar22;
                        uri2 = uri12;
                        r7o r7oVar102 = z7o.b;
                        if (obj instanceof t7o) {
                        }
                        com.yandex.passport.common.url.b bVar42 = (com.yandex.passport.common.url.b) obj;
                        if (bVar42 == null) {
                        }
                        if (str4 == null) {
                        }
                        boolean z82 = dVar.g;
                        com.yandex.passport.common.core.f fVar132 = fVar;
                        w90 w90Var2 = new w90(this, o0Var2, r4, 21);
                        tVar2.j = null;
                        tVar2.k = null;
                        tVar2.l = null;
                        tVar2.m = null;
                        tVar2.p = 13;
                        l = vVar.l(fVar132, str4, z82, w90Var2, tVar2);
                        break;
                    case 13:
                        qgg.h0(obj14);
                        com.yandex.passport.common.url.b bVar9 = (com.yandex.passport.common.url.b) obj14;
                        if (bVar9 != null) {
                            l = bVar9.a;
                        }
                        return (String) l;
                    case 14:
                        qgg.h0(obj14);
                        com.yandex.passport.common.url.b bVar10 = (com.yandex.passport.common.url.b) obj14;
                        if (bVar10 != null) {
                            obj15 = bVar10.a;
                        }
                        return (String) obj15;
                    case 15:
                        qgg.h0(obj14);
                        obj10 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj10;
                    case 16:
                        qgg.h0(obj14);
                        obj11 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj11;
                    case 17:
                        qgg.h0(obj14);
                        obj12 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj12;
                    case 18:
                        qgg.h0(obj14);
                        obj13 = ((com.yandex.passport.common.url.b) obj14).a;
                        return (String) obj13;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        tVar = new t(this, cg6Var);
        t tVar22 = tVar;
        Object obj142 = tVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = tVar22.p;
        ?? r42 = 0;
        Object obj152 = null;
        Object l6 = null;
        Object l22 = null;
        Object l32 = null;
        com.yandex.passport.sloth.dependencies.d dVar2 = this.k;
        switch (i) {
        }
    }
}
