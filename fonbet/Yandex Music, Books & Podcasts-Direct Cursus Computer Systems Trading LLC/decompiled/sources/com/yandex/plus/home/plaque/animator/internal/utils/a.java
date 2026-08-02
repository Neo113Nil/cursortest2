package com.yandex.plus.home.plaque.animator.internal.utils;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.core.graphql.fragment.ai;
import com.yandex.plus.core.graphql.fragment.ak;
import com.yandex.plus.core.graphql.fragment.bd;
import com.yandex.plus.core.graphql.fragment.bh;
import com.yandex.plus.core.graphql.fragment.bj;
import com.yandex.plus.core.graphql.fragment.bk;
import com.yandex.plus.core.graphql.fragment.bl;
import com.yandex.plus.core.graphql.fragment.cd;
import com.yandex.plus.core.graphql.fragment.ce;
import com.yandex.plus.core.graphql.fragment.ck;
import com.yandex.plus.core.graphql.fragment.cl;
import com.yandex.plus.core.graphql.fragment.dd;
import com.yandex.plus.core.graphql.fragment.de;
import com.yandex.plus.core.graphql.fragment.dh;
import com.yandex.plus.core.graphql.fragment.dj;
import com.yandex.plus.core.graphql.fragment.dl;
import com.yandex.plus.core.graphql.fragment.e8;
import com.yandex.plus.core.graphql.fragment.ed;
import com.yandex.plus.core.graphql.fragment.eh;
import com.yandex.plus.core.graphql.fragment.ek;
import com.yandex.plus.core.graphql.fragment.ep;
import com.yandex.plus.core.graphql.fragment.fd;
import com.yandex.plus.core.graphql.fragment.fh;
import com.yandex.plus.core.graphql.fragment.fj;
import com.yandex.plus.core.graphql.fragment.fk;
import com.yandex.plus.core.graphql.fragment.fp;
import com.yandex.plus.core.graphql.fragment.gd;
import com.yandex.plus.core.graphql.fragment.ge;
import com.yandex.plus.core.graphql.fragment.gf;
import com.yandex.plus.core.graphql.fragment.gh;
import com.yandex.plus.core.graphql.fragment.gi;
import com.yandex.plus.core.graphql.fragment.gk;
import com.yandex.plus.core.graphql.fragment.gp;
import com.yandex.plus.core.graphql.fragment.hg;
import com.yandex.plus.core.graphql.fragment.hh;
import com.yandex.plus.core.graphql.fragment.hi;
import com.yandex.plus.core.graphql.fragment.hp;
import com.yandex.plus.core.graphql.fragment.i8;
import com.yandex.plus.core.graphql.fragment.ie;
import com.yandex.plus.core.graphql.fragment.ih;
import com.yandex.plus.core.graphql.fragment.jg;
import com.yandex.plus.core.graphql.fragment.jh;
import com.yandex.plus.core.graphql.fragment.jj;
import com.yandex.plus.core.graphql.fragment.kf;
import com.yandex.plus.core.graphql.fragment.kh;
import com.yandex.plus.core.graphql.fragment.kj;
import com.yandex.plus.core.graphql.fragment.lg;
import com.yandex.plus.core.graphql.fragment.lj;
import com.yandex.plus.core.graphql.fragment.me;
import com.yandex.plus.core.graphql.fragment.mj;
import com.yandex.plus.core.graphql.fragment.nj;
import com.yandex.plus.core.graphql.fragment.od;
import com.yandex.plus.core.graphql.fragment.og;
import com.yandex.plus.core.graphql.fragment.op;
import com.yandex.plus.core.graphql.fragment.pi;
import com.yandex.plus.core.graphql.fragment.pp;
import com.yandex.plus.core.graphql.fragment.qd;
import com.yandex.plus.core.graphql.fragment.qe;
import com.yandex.plus.core.graphql.fragment.re;
import com.yandex.plus.core.graphql.fragment.rf;
import com.yandex.plus.core.graphql.fragment.se;
import com.yandex.plus.core.graphql.fragment.tc;
import com.yandex.plus.core.graphql.fragment.te;
import com.yandex.plus.core.graphql.fragment.th;
import com.yandex.plus.core.graphql.fragment.tj;
import com.yandex.plus.core.graphql.fragment.tn;
import com.yandex.plus.core.graphql.fragment.ud;
import com.yandex.plus.core.graphql.fragment.ue;
import com.yandex.plus.core.graphql.fragment.ug;
import com.yandex.plus.core.graphql.fragment.uh;
import com.yandex.plus.core.graphql.fragment.uj;
import com.yandex.plus.core.graphql.fragment.vc;
import com.yandex.plus.core.graphql.fragment.ve;
import com.yandex.plus.core.graphql.fragment.vi;
import com.yandex.plus.core.graphql.fragment.vj;
import com.yandex.plus.core.graphql.fragment.vn;
import com.yandex.plus.core.graphql.fragment.wc;
import com.yandex.plus.core.graphql.fragment.wd;
import com.yandex.plus.core.graphql.fragment.we;
import com.yandex.plus.core.graphql.fragment.wk;
import com.yandex.plus.core.graphql.fragment.wn;
import com.yandex.plus.core.graphql.fragment.xc;
import com.yandex.plus.core.graphql.fragment.xd;
import com.yandex.plus.core.graphql.fragment.xe;
import com.yandex.plus.core.graphql.fragment.xf;
import com.yandex.plus.core.graphql.fragment.xg;
import com.yandex.plus.core.graphql.fragment.xh;
import com.yandex.plus.core.graphql.fragment.xi;
import com.yandex.plus.core.graphql.fragment.xj;
import com.yandex.plus.core.graphql.fragment.xn;
import com.yandex.plus.core.graphql.fragment.yc;
import com.yandex.plus.core.graphql.fragment.yd;
import com.yandex.plus.core.graphql.fragment.yh;
import com.yandex.plus.core.graphql.fragment.yj;
import com.yandex.plus.core.graphql.fragment.zc;
import com.yandex.plus.core.graphql.fragment.zh;
import com.yandex.plus.core.graphql.fragment.zj;
import com.yandex.plus.core.graphql.fragment.zk;
import com.yandex.plus.core.graphql.type.c0;
import com.yandex.plus.core.graphql.type.c1;
import com.yandex.plus.core.graphql.type.d1;
import com.yandex.plus.core.graphql.type.t;
import com.yandex.plus.core.graphql.type.u;
import com.yandex.plus.core.graphql.type.z0;
import com.yandex.plus.home.plaque.repository.api.model.e;
import com.yandex.plus.home.plaque.repository.api.model.f;
import com.yandex.plus.home.plaque.repository.api.model.g;
import com.yandex.plus.home.plaque.repository.api.model.h;
import com.yandex.plus.home.plaque.repository.api.model.i;
import com.yandex.plus.home.plaque.repository.api.model.j;
import com.yandex.plus.home.plaque.repository.api.model.k;
import com.yandex.plus.home.plaque.repository.api.model.l;
import com.yandex.plus.home.plaque.repository.api.model.m;
import com.yandex.plus.home.plaque.repository.api.model.n;
import com.yandex.plus.home.plaque.repository.api.model.o;
import com.yandex.plus.home.plaque.repository.api.model.p;
import com.yandex.plus.home.plaque.repository.api.model.r;
import com.yandex.plus.home.plaque.repository.api.model.s;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.a1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.b2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.b3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.b6;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.c4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.d0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.d5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.e2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.e3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.f4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.g1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.h2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.h3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.h5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.i2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.i4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.i5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.j1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.k0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.k1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.k3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.l0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.l4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.m2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.m5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.n0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.n3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.o0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.o1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.o4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.p2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.p4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.p5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.q2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.q3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.r0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.r1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.s0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.s1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.s5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.t0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.t1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.t3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.u2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.v;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.v4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.v5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.x;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.x2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.x4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.y2;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.y4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.y5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.z3;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.z4;
import com.yandex.plus.home.repository.api.model.user.d;
import com.yandex.plus.pay.common.api.network.c;
import com.yandex.plus.pay.inapp.google.common.internal.operation.b;
import com.yandex.plus.pay.inapp.google.internal.a;
import defpackage.b6e;
import defpackage.b6x;
import defpackage.c5b;
import defpackage.c7;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.gm5;
import defpackage.hld;
import defpackage.jyr;
import defpackage.l8x;
import defpackage.msa;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.pz2;
import defpackage.qgg;
import defpackage.qz2;
import defpackage.r7o;
import defpackage.rdb;
import defpackage.rj7;
import defpackage.rxw;
import defpackage.ssa;
import defpackage.t7o;
import defpackage.tah;
import defpackage.twh;
import defpackage.u75;
import defpackage.uop;
import defpackage.uz2;
import defpackage.v75;
import defpackage.wop;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import defpackage.zvd;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a implements b {
    public static s1 A(c0 c0Var) {
        int ordinal = c0Var.ordinal();
        if (ordinal == 0) {
            return s1.a;
        }
        if (ordinal == 1) {
            return s1.b;
        }
        if (ordinal == 2) {
            return s1.c;
        }
        if (ordinal == 3) {
            return s1.d;
        }
        if (ordinal == 4) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static t1 B(wc wcVar) {
        rf rfVar = wcVar.b;
        if (rfVar != null) {
            return new r1(A(rfVar.b.b.a), rfVar.a);
        }
        me meVar = wcVar.c;
        if (meVar != null) {
            return new o1(A(meVar.b.b.a), meVar.a);
        }
        return null;
    }

    public static p4 C(uh uhVar) {
        ArrayList arrayList = uhVar.b;
        int i = uhVar.a;
        HashMap hashMap = new HashMap(arrayList.size());
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            hashMap.put(Integer.valueOf(i2), ((th) obj).b);
            i2 = i3;
        }
        kh khVar = (kh) hashMap.get(Integer.valueOf(i));
        if (khVar != null) {
            return c(khVar, hashMap, uop.b(Integer.valueOf(i)));
        }
        return null;
    }

    public static y4 D(ie ieVar) {
        int ordinal = ieVar.a.ordinal();
        if (ordinal == 0) {
            Integer num = ieVar.b;
            if (num != null) {
                return new v4(num.intValue());
            }
            return null;
        }
        if (ordinal == 1) {
            return x4.INSTANCE;
        }
        if (ordinal == 2) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static z4 E(pi piVar) {
        return new z4(D(piVar.a.b), D(piVar.b.b), D(piVar.c.b), D(piVar.d.b));
    }

    public static i5 F(zc zcVar) {
        tc tcVar = zcVar.d;
        d0 v = tcVar != null ? v(tcVar.b) : null;
        kf kfVar = zcVar.f.b;
        w0 x = x(kfVar.a.b);
        ArrayList arrayList = kfVar.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x u = u(((gf) it.next()).b);
            if (u != null) {
                arrayList2.add(u);
            }
        }
        t0 t0Var = new t0(x, arrayList2, E(kfVar.c.b), null, null, null, o0.INSTANCE);
        yc ycVar = zcVar.g;
        return new i5("ROOT", v, ycVar != null ? t(ycVar.b) : null, t0Var, CollectionsKt.O(zcVar.c), h5.b);
    }

    public static final void a(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, String str) {
        aVar.r("Failed to decode body. ".concat(str));
    }

    public static final void b(com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, zvd zvdVar) {
        Charset charset = c.b;
        aVar.r("-- HEADERS --");
        if (zvdVar.size() == 0) {
            aVar.r("(no headers)");
            return;
        }
        int size = zvdVar.size();
        for (int i = 0; i < size; i++) {
            aVar.r(zvdVar.g(i) + ": " + zvdVar.q(i));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static p4 c(kh khVar, HashMap hashMap, Set set) {
        i2 h2Var;
        q2 p2Var;
        kh khVar2;
        kh khVar3;
        switch (khVar.a) {
            case ARG_CHECKING:
                dh dhVar = khVar.b;
                if (dhVar != null) {
                    com.yandex.plus.core.graphql.type.a aVar = dhVar.a;
                    String str = dhVar.b;
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        return new b3(str);
                    }
                    if (ordinal == 1) {
                        return new w3(str);
                    }
                    if (ordinal == 2) {
                        return new i4(str);
                    }
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                }
                return null;
            case BOOLEAN:
                eh ehVar = khVar.c;
                if (ehVar != null) {
                    return new e3(ehVar.a);
                }
                return null;
            case COMPARISON:
                fh fhVar = khVar.f;
                if (fhVar != null) {
                    Integer num = fhVar.c;
                    String str2 = fhVar.b;
                    if (num != null) {
                        h2Var = new e2(num.intValue());
                    } else {
                        Double d = fhVar.d;
                        if (d != null) {
                            h2Var = new b2(d.doubleValue());
                        } else {
                            String str3 = fhVar.e;
                            h2Var = str3 != null ? new h2(str3) : null;
                        }
                    }
                    if (h2Var != null) {
                        int ordinal2 = fhVar.a.ordinal();
                        if (ordinal2 == 0) {
                            return new k3(str2, h2Var);
                        }
                        if (ordinal2 == 1) {
                            return new n3(str2, h2Var);
                        }
                        if (ordinal2 == 2) {
                            return new q3(str2, h2Var);
                        }
                        if (ordinal2 == 3) {
                            return new z3(str2, h2Var);
                        }
                        if (ordinal2 == 4) {
                            return new c4(str2, h2Var);
                        }
                        if (ordinal2 != 5) {
                            b6e.s();
                            return null;
                        }
                    }
                }
                return null;
            case CONTAINS:
                gh ghVar = khVar.g;
                if (ghVar != null) {
                    Integer num2 = ghVar.b;
                    if (num2 != null) {
                        p2Var = new m2(num2.intValue());
                    } else {
                        String str4 = ghVar.c;
                        p2Var = str4 != null ? new p2(str4) : null;
                    }
                    if (p2Var != null) {
                        return new h3(ghVar.a, p2Var);
                    }
                }
                return null;
            case IN_SET:
                hh hhVar = khVar.h;
                if (hhVar != null) {
                    List list = hhVar.b;
                    List list2 = hhVar.c;
                    y2 u2Var = list != null ? new u2(CollectionsKt.A0(list)) : list2 != null ? new x2(CollectionsKt.A0(list2)) : null;
                    if (u2Var != null) {
                        return new t3(hhVar.a, u2Var);
                    }
                }
                return null;
            case NOT:
                ih ihVar = khVar.d;
                if (ihVar != null) {
                    int i = ihVar.a;
                    p4 c = (set.contains(Integer.valueOf(i)) || (khVar2 = (kh) hashMap.get(Integer.valueOf(i))) == null) ? null : c(khVar2, hashMap, wop.j(set, Integer.valueOf(i)));
                    if (c != null) {
                        return new f4(c);
                    }
                }
                return null;
            case UNIFYING:
                jh jhVar = khVar.e;
                if (jhVar != null) {
                    ArrayList arrayList = jhVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        p4 c2 = (set.contains(Integer.valueOf(intValue)) || (khVar3 = (kh) hashMap.get(Integer.valueOf(intValue))) == null) ? null : c(khVar3, hashMap, wop.j(set, Integer.valueOf(intValue)));
                        if (c2 != null) {
                            arrayList2.add(c2);
                        }
                    }
                    if (arrayList2.size() == arrayList.size()) {
                        int ordinal3 = jhVar.a.ordinal();
                        if (ordinal3 == 0) {
                            return new l4(arrayList2);
                        }
                        if (ordinal3 == 1) {
                            return new o4(arrayList2);
                        }
                        if (ordinal3 != 2) {
                            b6e.s();
                            return null;
                        }
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static Drawable e(View view) {
        if (view.getBackground() != null) {
            return view.getBackground();
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() != 1) {
            return null;
        }
        if (!(viewGroup.getChildCount() > 0)) {
            wvs.h("Sequence is empty.");
            return null;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            return e(childAt);
        }
        rj7.m();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.plus.pay.common.api.model.a f(Context context, boolean z) {
        Object t7oVar;
        Integer valueOf;
        context.getClass();
        String string = context.getString(R.string.pay_sdk_platform_header_value);
        string.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = "Android".toLowerCase(locale);
        lowerCase2.getClass();
        if (lowerCase.equals(lowerCase2)) {
            return com.yandex.plus.pay.common.api.model.a.ANDROID;
        }
        String lowerCase3 = "AndroidTV".toLowerCase(locale);
        lowerCase3.getClass();
        if (lowerCase.equals(lowerCase3)) {
            return com.yandex.plus.pay.common.api.model.a.ANDROID_TV;
        }
        if (z) {
            return com.yandex.plus.pay.common.api.model.a.ANDROID;
        }
        try {
            r7o r7oVar = z7o.b;
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
            valueOf = uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            t7oVar = com.yandex.plus.pay.common.api.model.a.ANDROID;
            if (z7o.a(t7oVar) != null) {
                t7oVar = com.yandex.plus.pay.common.api.model.a.ANDROID;
            }
            return (com.yandex.plus.pay.common.api.model.a) t7oVar;
        }
        if (valueOf.intValue() == 4) {
            t7oVar = com.yandex.plus.pay.common.api.model.a.ANDROID_TV;
            if (z7o.a(t7oVar) != null) {
            }
            return (com.yandex.plus.pay.common.api.model.a) t7oVar;
        }
        t7oVar = com.yandex.plus.pay.common.api.model.a.ANDROID;
        if (z7o.a(t7oVar) != null) {
        }
        return (com.yandex.plus.pay.common.api.model.a) t7oVar;
    }

    public static /* synthetic */ com.yandex.plus.pay.common.api.model.a h(a aVar, Context context) {
        aVar.getClass();
        return f(context, false);
    }

    public static r i(i2 i2Var) {
        if (i2Var instanceof e2) {
            return new o(Integer.valueOf(((e2) i2Var).a));
        }
        if (i2Var instanceof b2) {
            return new o(Double.valueOf(((b2) i2Var).a));
        }
        if (i2Var instanceof h2) {
            return new p(((h2) i2Var).a);
        }
        b6e.s();
        return null;
    }

    public static com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.a j(Uri uri) {
        Object obj = null;
        if (!Intrinsics.d(uri.getScheme(), "plus-checkout") || !Intrinsics.d(uri.getHost(), "co-action")) {
            return null;
        }
        rdb rdbVar = com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.a.d;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                break;
            }
            Object next = c7Var.next();
            if (((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.a) next).a.equals(uri.getPath())) {
                obj = next;
                break;
            }
        }
        return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.a) obj;
    }

    public static c1 k(com.yandex.plus.pay.repository.api.model.mailingads.a aVar) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return c1.ALLOW;
        }
        if (ordinal == 1) {
            return c1.REFUSE;
        }
        b6e.s();
        return null;
    }

    public static s l(p4 p4Var) {
        HashSet hashSet;
        r pVar;
        if (p4Var instanceof e3) {
            return new g(((e3) p4Var).a);
        }
        if (p4Var instanceof b3) {
            return new i(((b3) p4Var).a, h.a, new n(true));
        }
        if (p4Var instanceof h3) {
            h3 h3Var = (h3) p4Var;
            String str = h3Var.a;
            q2 q2Var = h3Var.b;
            if (q2Var instanceof m2) {
                pVar = new o(Integer.valueOf(((m2) q2Var).a));
            } else {
                if (!(q2Var instanceof p2)) {
                    b6e.s();
                    return null;
                }
                pVar = new p(((p2) q2Var).a);
            }
            return new j(str, pVar);
        }
        if (p4Var instanceof k3) {
            k3 k3Var = (k3) p4Var;
            return new i(k3Var.a, h.a, i(k3Var.b));
        }
        if (p4Var instanceof n3) {
            n3 n3Var = (n3) p4Var;
            return new i(n3Var.a, h.b, i(n3Var.b));
        }
        if (p4Var instanceof q3) {
            q3 q3Var = (q3) p4Var;
            return new i(q3Var.a, h.c, i(q3Var.b));
        }
        if (p4Var instanceof z3) {
            z3 z3Var = (z3) p4Var;
            return new i(z3Var.a, h.d, i(z3Var.b));
        }
        if (p4Var instanceof c4) {
            c4 c4Var = (c4) p4Var;
            return new i(c4Var.a, h.e, i(c4Var.b));
        }
        if (p4Var instanceof t3) {
            t3 t3Var = (t3) p4Var;
            String str2 = t3Var.a;
            y2 y2Var = t3Var.b;
            if (y2Var instanceof u2) {
                Set set = ((u2) y2Var).a;
                hashSet = new HashSet(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    hashSet.add(new o((Number) it.next()));
                }
            } else {
                if (!(y2Var instanceof x2)) {
                    b6e.s();
                    return null;
                }
                Set set2 = ((x2) y2Var).a;
                hashSet = new HashSet(set2.size());
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    hashSet.add(new p((String) it2.next()));
                }
            }
            return new k(str2, hashSet);
        }
        if (p4Var instanceof w3) {
            return new m(new l(((w3) p4Var).a));
        }
        if (p4Var instanceof i4) {
            return new l(((i4) p4Var).a);
        }
        if (p4Var instanceof f4) {
            return new m(l(((f4) p4Var).a));
        }
        if (p4Var instanceof l4) {
            List list = ((l4) p4Var).a;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(l((p4) it3.next()));
            }
            return new e(arrayList);
        }
        if (!(p4Var instanceof o4)) {
            if (p4Var == null) {
                return new g(true);
            }
            b6e.s();
            return null;
        }
        List list2 = ((o4) p4Var).a;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        Iterator it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(l((p4) it4.next()));
        }
        return new f(arrayList2);
    }

    public static com.yandex.plus.plaquesdk.plaque.api.models.display.m m(y4 y4Var) {
        if (y4Var instanceof v4) {
            return new com.yandex.plus.plaquesdk.plaque.api.models.display.k(new com.yandex.plus.core.android.extensions.e(Integer.valueOf(((v4) y4Var).a)));
        }
        if ((y4Var instanceof x4) || y4Var == null) {
            return com.yandex.plus.plaquesdk.plaque.api.models.display.l.a;
        }
        b6e.s();
        return null;
    }

    public static com.yandex.plus.plaquesdk.plaque.api.models.display.g n(x xVar) {
        if (xVar instanceof com.yandex.plus.home.plaque.repository.graphql.cache.dto.p) {
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.p pVar = (com.yandex.plus.home.plaque.repository.graphql.cache.dto.p) xVar;
            List list = pVar.a;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(q((com.yandex.plus.home.plaque.repository.graphql.cache.dto.l) it.next()));
            }
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.s sVar = pVar.b;
            PointF pointF = new PointF((float) sVar.a, (float) sVar.b);
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.s sVar2 = pVar.c;
            return new com.yandex.plus.plaquesdk.plaque.api.models.display.e(arrayList, pointF, new PointF((float) sVar2.a, (float) sVar2.b));
        }
        if (!(xVar instanceof v)) {
            if (Intrinsics.d(xVar, w.INSTANCE) || xVar == null) {
                return com.yandex.plus.plaquesdk.plaque.api.models.display.i.a;
            }
            b6e.s();
            return null;
        }
        v vVar = (v) xVar;
        List list2 = vVar.a;
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(q((com.yandex.plus.home.plaque.repository.graphql.cache.dto.l) it2.next()));
        }
        com.yandex.plus.home.plaque.repository.graphql.cache.dto.s sVar3 = vVar.b;
        return new com.yandex.plus.plaquesdk.plaque.api.models.display.f(arrayList2, new PointF((float) sVar3.a, (float) sVar3.b));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x000d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.yandex.plus.home.plaque.repository.graphql.cache.dto.i] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r13v22, types: [com.yandex.plus.core.graphql.type.u] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w1 o(xe xeVar) {
        ?? r3;
        Map map;
        nsa nsaVar;
        nsa nsaVar2;
        Integer num;
        Integer num2;
        List list;
        String str;
        Object d5Var;
        k0 k0Var;
        l0 l0Var;
        s0 s0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object v5Var;
        Object obj;
        l0 l0Var2;
        k0 k0Var2;
        ArrayList arrayList3 = xeVar.a;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            bk bkVar = ((ue) it.next()).b;
            String str2 = bkVar.a;
            vj vjVar = bkVar.b;
            List list2 = bkVar.c;
            d0 v = vjVar != null ? v(vjVar.b) : null;
            yj yjVar = bkVar.d;
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.i t = yjVar != null ? t(yjVar.b) : null;
            wk wkVar = bkVar.e.b;
            kf kfVar = wkVar.a.b;
            w0 x = x(kfVar.a.b);
            ArrayList arrayList5 = kfVar.b;
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                x u = u(((gf) it2.next()).b);
                if (u != null) {
                    arrayList6.add(u);
                }
            }
            z4 E = E(kfVar.c.b);
            Integer num3 = wkVar.b;
            t tVar = wkVar.c;
            if (tVar != null) {
                int ordinal = tVar.ordinal();
                if (ordinal == 0) {
                    k0Var2 = k0.a;
                } else if (ordinal == 1) {
                    k0Var2 = k0.b;
                } else if (ordinal == 2) {
                    k0Var2 = k0.c;
                } else {
                    if (ordinal != 3) {
                        b6e.s();
                        return null;
                    }
                    k0Var2 = null;
                }
                k0Var = k0Var2;
            } else {
                k0Var = null;
            }
            z0 z0Var = wkVar.d;
            if (z0Var != null) {
                int ordinal2 = z0Var.ordinal();
                if (ordinal2 == 0) {
                    l0Var2 = l0.a;
                } else if (ordinal2 == 1) {
                    l0Var2 = l0.b;
                } else if (ordinal2 == 2) {
                    l0Var2 = l0.c;
                } else {
                    if (ordinal2 != 3) {
                        b6e.s();
                        return null;
                    }
                    l0Var2 = null;
                }
                l0Var = l0Var2;
            } else {
                l0Var = null;
            }
            int ordinal3 = wkVar.f.ordinal();
            if (ordinal3 == 0) {
                s0Var = n0.INSTANCE;
            } else if (ordinal3 == 1) {
                s0Var = o0.INSTANCE;
            } else if (ordinal3 == 2) {
                Integer num4 = wkVar.e;
                s0Var = num4 != null ? new r0(num4.intValue()) : null;
            } else {
                if (ordinal3 != 3) {
                    b6e.s();
                    return null;
                }
                s0Var = null;
            }
            if (s0Var == null) {
                s0Var = o0.INSTANCE;
            }
            t0 t0Var = new t0(x, arrayList6, E, num3, k0Var, l0Var, s0Var);
            switch (bkVar.f) {
                case BALANCE:
                    List list3 = list2;
                    d0 d0Var = v;
                    tj tjVar = bkVar.h;
                    if (tjVar != null) {
                        gd gdVar = tjVar.b;
                        if (list3 == null) {
                            list3 = c5b.a;
                        }
                        List list4 = list3;
                        fd fdVar = gdVar.a;
                        if (fdVar != null) {
                            ArrayList<dd> arrayList7 = fdVar.a;
                            ArrayList arrayList8 = new ArrayList();
                            for (dd ddVar : arrayList7) {
                                k1 z = ddVar != null ? z(ddVar.b) : null;
                                if (z != null) {
                                    arrayList8.add(z);
                                }
                            }
                            arrayList = arrayList8;
                        } else {
                            arrayList = null;
                        }
                        ed edVar = gdVar.b;
                        if (edVar != null) {
                            ArrayList<bd> arrayList9 = edVar.a;
                            ArrayList arrayList10 = new ArrayList();
                            for (bd bdVar : arrayList9) {
                                k1 z2 = bdVar != null ? z(bdVar.b) : null;
                                if (z2 != null) {
                                    arrayList10.add(z2);
                                }
                            }
                            arrayList2 = arrayList10;
                        } else {
                            arrayList2 = null;
                        }
                        ArrayList<cd> arrayList11 = gdVar.c.a;
                        ArrayList arrayList12 = new ArrayList();
                        for (cd cdVar : arrayList11) {
                            k1 z3 = cdVar != null ? z(cdVar.b) : null;
                            if (z3 != null) {
                                arrayList12.add(z3);
                            }
                        }
                        obj = new m5(str2, d0Var, t, t0Var, arrayList, arrayList2, arrayList12, list4);
                        v5Var = obj;
                        if (v5Var == null) {
                            arrayList4.add(v5Var);
                        }
                    }
                    v5Var = null;
                    if (v5Var == null) {
                    }
                case BUTTON:
                    List list5 = list2;
                    d0 d0Var2 = v;
                    uj ujVar = bkVar.i;
                    if (ujVar != null) {
                        qd qdVar = ujVar.b;
                        if (list5 == null) {
                            list5 = c5b.a;
                        }
                        List list6 = list5;
                        ArrayList<od> arrayList13 = qdVar.a.a;
                        ArrayList arrayList14 = new ArrayList();
                        for (od odVar : arrayList13) {
                            k1 z4 = odVar != null ? z(odVar.b) : null;
                            if (z4 != null) {
                                arrayList14.add(z4);
                            }
                        }
                        obj = new p5(str2, d0Var2, t, t0Var, arrayList14, list6);
                        v5Var = obj;
                        if (v5Var == null) {
                        }
                    }
                    v5Var = null;
                    if (v5Var == null) {
                    }
                    break;
                case ICON:
                    d0 d0Var3 = v;
                    xj xjVar = bkVar.k;
                    if (xjVar != null) {
                        obj = new s5(str2, d0Var3, t, t0Var, xjVar.b.a);
                        v5Var = obj;
                        if (v5Var == null) {
                        }
                    }
                    v5Var = null;
                    if (v5Var == null) {
                    }
                    break;
                case SPACER:
                    v5Var = new v5(str2, v, t, t0Var);
                    if (v5Var == null) {
                    }
                    break;
                case SWITCH:
                    List list7 = list2;
                    d0 d0Var4 = v;
                    zj zjVar = bkVar.j;
                    if (zjVar != null) {
                        xi xiVar = zjVar.b;
                        if (list7 == null) {
                            list7 = c5b.a;
                        }
                        List list8 = list7;
                        ArrayList<vi> arrayList15 = xiVar.a.a;
                        ArrayList arrayList16 = new ArrayList();
                        for (vi viVar : arrayList15) {
                            k1 z5 = viVar != null ? z(viVar.b) : null;
                            if (z5 != null) {
                                arrayList16.add(z5);
                            }
                        }
                        obj = new y5(str2, d0Var4, t, t0Var, arrayList16, list8);
                        v5Var = obj;
                        if (v5Var == null) {
                        }
                    }
                    v5Var = null;
                    if (v5Var == null) {
                    }
                    break;
                case TEXT:
                    ak akVar = bkVar.g;
                    if (akVar != null) {
                        fj fjVar = akVar.b;
                        if (list2 == null) {
                            list2 = c5b.a;
                        }
                        List list9 = list2;
                        ArrayList<dj> arrayList17 = fjVar.a.a;
                        ArrayList arrayList18 = new ArrayList();
                        for (dj djVar : arrayList17) {
                            k1 z6 = djVar != null ? z(djVar.b) : null;
                            if (z6 != null) {
                                arrayList18.add(z6);
                            }
                        }
                        obj = new b6(str2, v, t, t0Var, arrayList18, list9, fjVar.b);
                        v5Var = obj;
                        if (v5Var == null) {
                        }
                    }
                    v5Var = null;
                    if (v5Var == null) {
                    }
                    break;
                case UNKNOWN__:
                    v5Var = null;
                    if (v5Var == null) {
                    }
                    break;
                default:
                    b6e.s();
                    break;
            }
            return null;
        }
        d0 d0Var5 = null;
        List list10 = xeVar.b;
        if (list10 != null) {
            r3 = new ArrayList();
            Iterator it3 = list10.iterator();
            while (it3.hasNext()) {
                gk gkVar = ((ve) it3.next()).b;
                ArrayList arrayList19 = gkVar.b;
                String str3 = gkVar.a;
                fk fkVar = gkVar.d;
                i8 i8Var = gkVar.c.b;
                ek ekVar = gkVar.e;
                ck ckVar = gkVar.f;
                hp hpVar = fkVar.b;
                gp gpVar = hpVar.b;
                if (gpVar != null) {
                    d5Var = new i5(str3, ckVar != null ? v(ckVar.b) : d0Var5, ekVar != null ? t(ekVar.b) : d0Var5, w(i8Var, d0Var5, gpVar.a), arrayList19, h5.a);
                } else {
                    fp fpVar = hpVar.c;
                    if (fpVar != null) {
                        d5Var = new i5(str3, ckVar != null ? v(ckVar.b) : null, ekVar != null ? t(ekVar.b) : null, w(i8Var, fpVar.a, null), arrayList19, h5.b);
                    } else {
                        ep epVar = hpVar.d;
                        d5Var = epVar != null ? new d5(str3, ckVar != null ? v(ckVar.b) : null, ekVar != null ? t(ekVar.b) : null, w(i8Var, epVar.a, epVar.b), arrayList19) : null;
                    }
                }
                if (d5Var != null) {
                    r3.add(d5Var);
                }
                d0Var5 = null;
            }
        } else {
            r3 = 0;
        }
        if (r3 == 0) {
            r3 = c5b.a;
        }
        ArrayList g0 = CollectionsKt.g0(arrayList4, (Iterable) r3);
        ArrayList arrayList20 = xeVar.c;
        ArrayList arrayList21 = new ArrayList(v75.o(arrayList20, 10));
        Iterator it4 = arrayList20.iterator();
        while (it4.hasNext()) {
            dl dlVar = ((we) it4.next()).b;
            String str4 = dlVar.a;
            kf kfVar2 = dlVar.d.b;
            w0 x2 = x(kfVar2.a.b);
            ArrayList arrayList22 = kfVar2.b;
            ArrayList arrayList23 = new ArrayList();
            Iterator it5 = arrayList22.iterator();
            while (it5.hasNext()) {
                x u2 = u(((gf) it5.next()).b);
                if (u2 != null) {
                    arrayList23.add(u2);
                }
            }
            t0 t0Var2 = new t0(x2, arrayList23, E(kfVar2.c.b), null, null, null, n0.INSTANCE);
            zk zkVar = dlVar.b;
            d0 v2 = zkVar != null ? v(zkVar.b) : null;
            cl clVar = dlVar.e;
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.i t2 = clVar != null ? t(clVar.b) : null;
            ArrayList arrayList24 = dlVar.c;
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar = t2;
            ArrayList arrayList25 = new ArrayList();
            Iterator it6 = arrayList24.iterator();
            while (it6.hasNext()) {
                jg jgVar = ((bl) it6.next()).b;
                int ordinal4 = jgVar.c.ordinal();
                if (ordinal4 == 0) {
                    str = jgVar.a;
                } else if (ordinal4 == 1) {
                    str = jgVar.b;
                } else {
                    if (ordinal4 != 2) {
                        b6e.s();
                        return null;
                    }
                    str = null;
                }
                if (str != null) {
                    arrayList25.add(str);
                }
            }
            arrayList21.add(new i5(str4, v2, iVar, t0Var2, arrayList25, h5.a));
        }
        ArrayList g02 = CollectionsKt.g0(g0, arrayList21);
        ArrayList arrayList26 = xeVar.d;
        ArrayList arrayList27 = new ArrayList(v75.o(arrayList26, 10));
        Iterator it7 = arrayList26.iterator();
        while (it7.hasNext()) {
            zc zcVar = ((se) it7.next()).b;
            String str5 = zcVar.a;
            xc xcVar = zcVar.i;
            i5 F = F(zcVar);
            vc vcVar = zcVar.h;
            if (vcVar == null || (list = vcVar.b.a) == null) {
                map = null;
            } else {
                List<xg> list11 = list;
                int a = tah.a(v75.o(list11, 10));
                if (a < 16) {
                    a = 16;
                }
                map = new LinkedHashMap(a);
                for (xg xgVar : list11) {
                    map.put(xgVar.a, xgVar.b);
                }
            }
            if (map == null) {
                map = e5b.a;
                map.getClass();
            }
            Map map2 = map;
            wc wcVar = zcVar.k;
            t1 B = wcVar != null ? B(wcVar) : null;
            Map map3 = zcVar.l;
            int i = zcVar.b;
            if (xcVar == null || (num2 = xcVar.a) == null) {
                nsaVar = null;
            } else {
                msa msaVar = nsa.b;
                nsaVar = new nsa(yd5.M(num2.intValue(), ssa.SECONDS));
            }
            if (xcVar == null || (num = xcVar.b) == null) {
                nsaVar2 = null;
            } else {
                msa msaVar2 = nsa.b;
                nsaVar2 = new nsa(yd5.M(num.intValue(), ssa.SECONDS));
            }
            arrayList27.add(new a0(str5, F, map2, B, map3, i, nsaVar, nsaVar2, zcVar.j, C(zcVar.e.b)));
        }
        ArrayList arrayList28 = xeVar.e;
        ArrayList arrayList29 = new ArrayList(v75.o(arrayList28, 10));
        Iterator it8 = arrayList28.iterator();
        while (it8.hasNext()) {
            arrayList29.add(s(((te) it8.next()).b));
        }
        ArrayList arrayList30 = xeVar.f;
        ArrayList arrayList31 = new ArrayList(v75.o(arrayList30, 10));
        Iterator it9 = arrayList30.iterator();
        while (it9.hasNext()) {
            arrayList31.add(s(((qe) it9.next()).b));
        }
        ArrayList arrayList32 = xeVar.g;
        ArrayList arrayList33 = new ArrayList(v75.o(arrayList32, 10));
        Iterator it10 = arrayList32.iterator();
        while (it10.hasNext()) {
            arrayList33.add(s(((re) it10.next()).b));
        }
        return new w1(g02, arrayList27, arrayList29, arrayList31, arrayList33);
    }

    public static com.yandex.plus.core.data.user.a p(com.yandex.plus.home.repository.api.model.user.b bVar) {
        String str = bVar.a;
        String str2 = bVar.b;
        d dVar = bVar.c;
        int i = dVar.a;
        com.yandex.plus.home.repository.api.model.user.c cVar = dVar.b;
        com.yandex.plus.core.data.family.c cVar2 = new com.yandex.plus.core.data.family.c(cVar.a, cVar.b, cVar.c);
        ArrayList<com.yandex.plus.home.repository.api.model.user.c> arrayList = dVar.c;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        for (com.yandex.plus.home.repository.api.model.user.c cVar3 : arrayList) {
            arrayList2.add(new com.yandex.plus.core.data.family.c(cVar3.a, cVar3.b, cVar3.c));
        }
        return new com.yandex.plus.core.data.user.a(str, str2, new com.yandex.plus.core.data.family.a(i, cVar2, arrayList2));
    }

    public static com.yandex.plus.plaquesdk.plaque.api.models.display.n q(com.yandex.plus.home.plaque.repository.graphql.cache.dto.l lVar) {
        String str = lVar.a;
        double d = lVar.c;
        Integer y = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1.y(str);
        if (y != null) {
            return new com.yandex.plus.plaquesdk.plaque.api.models.display.n(y.intValue(), (float) d);
        }
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
        String str2 = "Error with parse color=" + lVar.a;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, str2, null);
        return new com.yandex.plus.plaquesdk.plaque.api.models.display.n(0, (float) d);
    }

    public static String r(long j, twh twhVar) {
        String str;
        String str2;
        if (j >= 0) {
            str = j + "-byte";
        } else {
            str = "unknown length";
        }
        if (twhVar != null) {
            str2 = "'" + twhVar + '\'';
        } else {
            str2 = "unknown content-type";
        }
        return "(" + str + ' ' + str2 + " body)";
    }

    public static g0 s(zc zcVar) {
        Map map;
        List list;
        String str = zcVar.a;
        i5 F = F(zcVar);
        vc vcVar = zcVar.h;
        if (vcVar == null || (list = vcVar.b.a) == null) {
            map = null;
        } else {
            List<xg> list2 = list;
            int a = tah.a(v75.o(list2, 10));
            if (a < 16) {
                a = 16;
            }
            map = new LinkedHashMap(a);
            for (xg xgVar : list2) {
                map.put(xgVar.a, xgVar.b);
            }
        }
        if (map == null) {
            map = e5b.a;
            map.getClass();
        }
        wc wcVar = zcVar.k;
        return new g0(str, F, map, wcVar != null ? B(wcVar) : null, zcVar.l, zcVar.b, C(zcVar.e.b));
    }

    public static com.yandex.plus.home.plaque.repository.graphql.cache.dto.i t(xn xnVar) {
        tn tnVar = xnVar.b;
        if (tnVar != null) {
            return new com.yandex.plus.home.plaque.repository.graphql.cache.dto.d(tnVar.a);
        }
        vn vnVar = xnVar.c;
        if (vnVar == null) {
            if (xnVar.d != null) {
                return com.yandex.plus.home.plaque.repository.graphql.cache.dto.e.INSTANCE;
            }
            return null;
        }
        String str = vnVar.a;
        ArrayList O = CollectionsKt.O(vnVar.b);
        int a = tah.a(v75.o(O, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it = O.iterator();
        while (it.hasNext()) {
            wn wnVar = (wn) it.next();
            linkedHashMap.put(wnVar.a, wnVar.b);
        }
        return new com.yandex.plus.home.plaque.repository.graphql.cache.dto.h(str, linkedHashMap);
    }

    public static x u(yd ydVar) {
        int ordinal = ydVar.a.ordinal();
        if (ordinal == 0) {
            wd wdVar = ydVar.b;
            if (wdVar == null) {
                return null;
            }
            og ogVar = wdVar.b;
            ArrayList arrayList = ogVar.a;
            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ud udVar = ((lg) it.next()).b;
                arrayList2.add(new com.yandex.plus.home.plaque.repository.graphql.cache.dto.l(udVar.a, udVar.b, udVar.c));
            }
            bh bhVar = ogVar.b.b;
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.s sVar = new com.yandex.plus.home.plaque.repository.graphql.cache.dto.s(bhVar.a, bhVar.b);
            bh bhVar2 = ogVar.c.b;
            return new com.yandex.plus.home.plaque.repository.graphql.cache.dto.p(arrayList2, sVar, new com.yandex.plus.home.plaque.repository.graphql.cache.dto.s(bhVar2.a, bhVar2.b));
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return w.INSTANCE;
            }
            if (ordinal == 3) {
                return null;
            }
            b6e.s();
            return null;
        }
        xd xdVar = ydVar.c;
        if (xdVar == null) {
            return null;
        }
        hi hiVar = xdVar.b;
        ArrayList arrayList3 = hiVar.a;
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ud udVar2 = ((gi) it2.next()).b;
            arrayList4.add(new com.yandex.plus.home.plaque.repository.graphql.cache.dto.l(udVar2.a, udVar2.b, udVar2.c));
        }
        bh bhVar3 = hiVar.b.b;
        return new v(arrayList4, new com.yandex.plus.home.plaque.repository.graphql.cache.dto.s(bhVar3.a, bhVar3.b));
    }

    public static d0 v(ge geVar) {
        String str = geVar.a;
        List list = geVar.b;
        if (list == null) {
            list = c5b.a;
        }
        return new d0(str, list, geVar.c, geVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t0 w(i8 i8Var, u uVar, d1 d1Var) {
        k0 k0Var;
        int i;
        l0 l0Var;
        pp ppVar;
        s0 r0Var;
        s0 s0Var;
        l0 l0Var2;
        w0 x = x(i8Var.a.b);
        ArrayList arrayList = i8Var.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x u = u(((e8) it.next()).b);
            if (u != null) {
                arrayList2.add(u);
            }
        }
        z4 E = E(i8Var.c.b);
        int i2 = uVar == null ? -1 : com.yandex.plus.home.plaque.repository.graphql.h.a[uVar.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                k0Var = k0.a;
            } else if (i2 == 2) {
                k0Var = k0.b;
            } else if (i2 == 3) {
                k0Var = k0.c;
            } else if (i2 != 4) {
                b6e.s();
                return null;
            }
            i = d1Var != null ? -1 : com.yandex.plus.home.plaque.repository.graphql.h.b[d1Var.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    l0Var2 = l0.b;
                } else if (i == 2) {
                    l0Var2 = l0.c;
                } else if (i == 3) {
                    l0Var2 = l0.a;
                } else if (i != 4) {
                    b6e.s();
                    return null;
                }
                l0Var = l0Var2;
                ppVar = i8Var.d.b;
                if (ppVar.c != null || (s0Var = o0.INSTANCE) == null) {
                    if (ppVar.b == null) {
                        op opVar = ppVar.d;
                        r0Var = opVar != null ? new r0(opVar.a) : null;
                        if (r0Var == null) {
                            s0Var = o0.INSTANCE;
                        }
                        return new t0(x, arrayList2, E, null, k0Var, l0Var, r0Var);
                    }
                    s0Var = n0.INSTANCE;
                }
                r0Var = s0Var;
                return new t0(x, arrayList2, E, null, k0Var, l0Var, r0Var);
            }
            l0Var = null;
            ppVar = i8Var.d.b;
            if (ppVar.c != null) {
            }
            if (ppVar.b == null) {
            }
            r0Var = s0Var;
            return new t0(x, arrayList2, E, null, k0Var, l0Var, r0Var);
        }
        k0Var = null;
        if (d1Var != null) {
        }
        if (i != -1) {
        }
        l0Var = null;
        ppVar = i8Var.d.b;
        if (ppVar.c != null) {
        }
        if (ppVar.b == null) {
        }
        r0Var = s0Var;
        return new t0(x, arrayList2, E, null, k0Var, l0Var, r0Var);
    }

    public static w0 x(hg hgVar) {
        return new w0(hgVar.a, hgVar.b, hgVar.c, hgVar.d);
    }

    public static j1 y(bj bjVar) {
        return new j1(bjVar.a, bjVar.b, bjVar.c, bjVar.d, bjVar.e, bjVar.f, bjVar.g, bjVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.yandex.plus.home.plaque.repository.graphql.cache.dto.d1] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.yandex.plus.home.plaque.repository.graphql.cache.dto.g1] */
    public static k1 z(nj njVar) {
        com.yandex.plus.home.plaque.repository.graphql.cache.dto.d1 d1Var;
        j1 j1Var;
        xh xhVar;
        j1 j1Var2;
        yh yhVar;
        zh zhVar;
        mj mjVar = njVar.b;
        if (mjVar != null) {
            return y(mjVar.b);
        }
        lj ljVar = njVar.c;
        if (ljVar != null) {
            ug ugVar = ljVar.b;
            return new g1(ugVar.b, y(ugVar.a.b));
        }
        kj kjVar = njVar.d;
        if (kjVar != null) {
            xf xfVar = kjVar.b;
            d1Var = new com.yandex.plus.home.plaque.repository.graphql.cache.dto.d1(xfVar.a, xfVar.b, xfVar.c, xfVar.d, xfVar.e, xfVar.f);
        } else {
            d1Var = null;
        }
        if (d1Var != null) {
            return d1Var;
        }
        jj jjVar = njVar.e;
        if (jjVar == null) {
            return null;
        }
        de deVar = jjVar.b;
        String str = deVar.a;
        ArrayList<ce> arrayList = deVar.b;
        ArrayList arrayList2 = new ArrayList();
        for (ce ceVar : arrayList) {
            ai aiVar = ceVar != null ? ceVar.b : null;
            if (aiVar == null || (zhVar = aiVar.b) == null) {
                if (aiVar != null && (yhVar = aiVar.c) != null) {
                    ug ugVar2 = yhVar.b;
                    j1Var2 = new g1(ugVar2.b, y(ugVar2.a.b));
                } else if (aiVar == null || (xhVar = aiVar.d) == null) {
                    j1Var = null;
                } else {
                    xf xfVar2 = xhVar.b;
                    j1Var2 = new com.yandex.plus.home.plaque.repository.graphql.cache.dto.d1(xfVar2.a, xfVar2.b, xfVar2.c, xfVar2.d, xfVar2.e, xfVar2.f);
                }
                j1Var = j1Var2;
            } else {
                j1Var = y(zhVar.b);
            }
            if (j1Var != null) {
                arrayList2.add(j1Var);
            }
        }
        return new a1(str, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(pz2 pz2Var, cg6 cg6Var) {
        com.yandex.plus.pay.inapp.google.internal.operation.c cVar;
        int i;
        if (cg6Var instanceof com.yandex.plus.pay.inapp.google.internal.operation.c) {
            cVar = (com.yandex.plus.pay.inapp.google.internal.operation.c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cVar.l = 1;
                    gm5 j = hld.j();
                    final com.yandex.plus.pay.inapp.google.internal.a aVar = new com.yandex.plus.pay.inapp.google.internal.a(j);
                    final qz2 qz2Var = (qz2) pz2Var;
                    if (!qz2Var.d()) {
                        l8x.g("BillingClient", "Service disconnected.");
                        uz2 uz2Var = b6x.k;
                        qz2Var.y(2, 13, uz2Var);
                        aVar.b(uz2Var, null);
                    } else if (qz2Var.r) {
                        if (qz2.i(new Callable() { // from class: cnx
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                q1x q1xVar;
                                qz2 qz2Var2 = qz2.this;
                                a aVar2 = aVar;
                                qz2Var2.getClass();
                                try {
                                    synchronized (qz2Var2.a) {
                                        q1xVar = qz2Var2.h;
                                    }
                                    if (q1xVar == null) {
                                        qz2Var2.x(aVar2, b6x.k, 119, null);
                                        return null;
                                    }
                                    String packageName = qz2Var2.f.getPackageName();
                                    String str = qz2Var2.c;
                                    long longValue = qz2Var2.z.longValue();
                                    Bundle bundle = new Bundle();
                                    l8x.b(bundle, str, longValue);
                                    ((l1x) q1xVar).b1(packageName, bundle, new k3x(aVar2, qz2Var2.g, qz2Var2.k));
                                    return null;
                                } catch (DeadObjectException e) {
                                    qz2Var2.x(aVar2, b6x.k, 62, e);
                                    return null;
                                } catch (Exception e2) {
                                    qz2Var2.x(aVar2, b6x.i, 62, e2);
                                    return null;
                                }
                            }
                        }, 30000L, new rxw(qz2Var, aVar, false, 22), qz2Var.v(), qz2Var.m()) == null) {
                            uz2 j2 = qz2Var.j();
                            qz2Var.y(25, 13, j2);
                            aVar.b(j2, null);
                        }
                    } else {
                        l8x.g("BillingClient", "Current client doesn't support get billing config.");
                        uz2 uz2Var2 = b6x.r;
                        qz2Var.y(32, 13, uz2Var2);
                        aVar.b(uz2Var2, null);
                    }
                    obj = j.s(cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.inapp.google.internal.b bVar = (com.yandex.plus.pay.inapp.google.internal.b) obj;
                return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(bVar.b, com.yandex.plus.bdui.flex.ui.a.G(bVar.a));
            }
        }
        cVar = new com.yandex.plus.pay.inapp.google.internal.operation.c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        com.yandex.plus.pay.inapp.google.internal.b bVar2 = (com.yandex.plus.pay.inapp.google.internal.b) obj2;
        return new com.yandex.plus.pay.inapp.google.common.internal.operation.c(bVar2.b, com.yandex.plus.bdui.flex.ui.a.G(bVar2.a));
    }

    @Override // com.yandex.plus.pay.inapp.google.common.internal.operation.b
    public String getName() {
        return "getConfig()";
    }
}
