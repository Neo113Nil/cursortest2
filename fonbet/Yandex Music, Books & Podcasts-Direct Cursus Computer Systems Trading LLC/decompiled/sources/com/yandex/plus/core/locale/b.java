package com.yandex.plus.core.locale;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.LottieAnimationView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m1;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.n;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.o;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.q0;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.r2;
import com.yandex.passport.api.t2;
import com.yandex.passport.api.u2;
import com.yandex.passport.api.w0;
import com.yandex.passport.api.x;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.core.e;
import com.yandex.passport.common.core.g;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.common.network.r;
import com.yandex.passport.common.ui.progress.d;
import com.yandex.passport.common.ui.progress.j;
import com.yandex.passport.common.ui.progress.k;
import com.yandex.passport.common.ui.progress.m;
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.entities.p;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.social.esia.h;
import com.yandex.passport.internal.ui.bouncer.chooser.s;
import com.yandex.passport.internal.ui.bouncer.chooser.w;
import com.yandex.passport.internal.ui.bouncer.chooser.y;
import com.yandex.passport.internal.ui.challenge.logout.LogoutActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.d0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.e0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.f0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p1;
import com.yandex.passport.internal.ui.challenge.webview.i;
import com.yandex.passport.internal.ui.sloth.webcard.n0;
import com.yandex.passport.internal.ui.sloth.webcard.p0;
import com.yandex.passport.internal.ui.sloth.webcard.r0;
import com.yandex.passport.internal.ui.sloth.webcard.s0;
import com.yandex.passport.internal.util.c;
import defpackage.aqi;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.c5b;
import defpackage.cxb;
import defpackage.dzf;
import defpackage.ern;
import defpackage.ezf;
import defpackage.fs5;
import defpackage.ftr;
import defpackage.g4i;
import defpackage.gct;
import defpackage.gld;
import defpackage.gq5;
import defpackage.gs6;
import defpackage.hdu;
import defpackage.hq5;
import defpackage.i95;
import defpackage.ild;
import defpackage.j95;
import defpackage.jj4;
import defpackage.jzk;
import defpackage.kfu;
import defpackage.kjn;
import defpackage.lz6;
import defpackage.mkn;
import defpackage.mm6;
import defpackage.ngg;
import defpackage.nm6;
import defpackage.oq5;
import defpackage.pd;
import defpackage.qh;
import defpackage.qvc;
import defpackage.qxe;
import defpackage.r90;
import defpackage.rof;
import defpackage.rpg;
import defpackage.rvf;
import defpackage.sbi;
import defpackage.ss3;
import defpackage.ssd;
import defpackage.szf;
import defpackage.tlm;
import defpackage.ug3;
import defpackage.uz0;
import defpackage.v75;
import defpackage.vci;
import defpackage.vlv;
import defpackage.vnj;
import defpackage.vq2;
import defpackage.wn5;
import defpackage.x91;
import defpackage.xmn;
import defpackage.xpi;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y0q;
import defpackage.y20;
import defpackage.yci;
import defpackage.zcq;
import defpackage.zt3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class b {
    public static final k0 A(k0 k0Var) {
        k0Var.getClass();
        boolean z = k0Var.a;
        boolean z2 = k0Var.b;
        boolean z3 = k0Var.c;
        q0 q0Var = k0Var.d;
        boolean z4 = k0Var.e;
        String str = k0Var.g;
        String str2 = k0Var.f;
        String str3 = k0Var.h;
        String str4 = k0Var.i;
        boolean z5 = k0Var.j;
        boolean z6 = k0Var.k;
        String str5 = k0Var.l;
        com.yandex.passport.internal.properties.a aVar = k0Var.m;
        aVar.getClass();
        return new k0(z, z2, z3, q0Var, z4, str2, str, str3, str4, z5, z6, str5, new com.yandex.passport.internal.properties.a(aVar.a, aVar.b, aVar.c, aVar.d), z(k0Var.n), k0Var.o, k0Var.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5 A[LOOP:0: B:14:0x009f->B:16:0x00a5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final f B(l lVar) {
        z1 z1Var;
        String str;
        Date date;
        Date parse;
        Iterator it;
        lVar.getClass();
        z1 J = com.yandex.plus.pay.ui.core.b.J(lVar.b);
        String i = lVar.i();
        String j = lVar.j();
        g gVar = lVar.e;
        String str2 = gVar.j;
        boolean z = gVar.k;
        String str3 = gVar.i;
        String str4 = gVar.n;
        boolean z2 = !(str4 == null || str4.length() == 0);
        String str5 = gVar.n;
        boolean z3 = gVar.o;
        boolean z4 = lVar.d.a != null;
        com.yandex.passport.internal.stash.a aVar = lVar.f;
        Account account = lVar.g;
        n f = lVar.f();
        String k = lVar.k();
        boolean z5 = gVar.p;
        String str6 = gVar.r;
        String str7 = gVar.s;
        String str8 = gVar.t;
        SimpleDateFormat simpleDateFormat = c.a;
        if (str8 != null) {
            try {
                parse = c.a.parse(str8);
                z1Var = J;
                str = i;
            } catch (ParseException unused) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    z1Var = J;
                    str = i;
                    date = null;
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Failed to parse birthday ".concat(str8), 8);
                }
            }
            String str9 = gVar.w;
            List list = gVar.C;
            list.getClass();
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            for (it = list2.iterator(); it.hasNext(); it = it) {
                String str10 = ((e) it.next()).a;
                m1.a(str10);
                arrayList.add(new m1(str10));
            }
            return new f(z1Var, str, j, str2, z, str3, z2, str5, z3, z4, aVar, account, f, k, z5, str6, str7, parse, str9, new p(arrayList), gVar.y, gVar.z, gVar.A, gVar.B, !gVar.D, gVar.E, gVar.v0, gVar.w0);
        }
        z1Var = J;
        str = i;
        date = null;
        parse = date;
        String str92 = gVar.w;
        List list3 = gVar.C;
        list3.getClass();
        List list22 = list3;
        ArrayList arrayList2 = new ArrayList(v75.o(list22, 10));
        while (it.hasNext()) {
        }
        return new f(z1Var, str, j, str2, z, str3, z2, str5, z3, z4, aVar, account, f, k, z5, str6, str7, parse, str92, new p(arrayList2), gVar.y, gVar.z, gVar.A, gVar.B, !gVar.D, gVar.E, gVar.v0, gVar.w0);
    }

    public static final com.yandex.passport.common.ui.progress.g C(v vVar) {
        com.yandex.passport.common.ui.progress.c bVar;
        com.yandex.passport.common.ui.progress.n nVar;
        com.yandex.passport.common.ui.progress.f dVar;
        vVar.getClass();
        l2 d = vVar.d();
        d.getClass();
        if (d instanceof j2) {
            bVar = new com.yandex.passport.common.ui.progress.a(((j2) d).a);
        } else {
            if (!(d instanceof k2)) {
                b6e.s();
                return null;
            }
            bVar = new com.yandex.passport.common.ui.progress.b(((k2) d).a);
        }
        u2 g = vVar.g();
        g.getClass();
        if (g instanceof q2) {
            nVar = k.a;
        } else if (g instanceof p2) {
            p2 p2Var = (p2) g;
            nVar = new j(p2Var.a, p2Var.b);
        } else if (g instanceof r2) {
            nVar = com.yandex.passport.common.ui.progress.l.a;
        } else {
            if (!(g instanceof t2)) {
                b6e.s();
                return null;
            }
            nVar = m.a;
        }
        o2 e = vVar.e();
        e.getClass();
        if (e instanceof n2) {
            dVar = com.yandex.passport.common.ui.progress.e.a;
        } else {
            if (!(e instanceof m2)) {
                b6e.s();
                return null;
            }
            dVar = new d(((m2) e).a);
        }
        return new com.yandex.passport.common.ui.progress.g(bVar, nVar, dVar, vVar.f());
    }

    public static final void D(int i, View view) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = view.getWidth();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r30 & 8) != 0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final com.yandex.passport.internal.ui.bouncer.chooser.b bVar, final Function0 function0, final Function1 function1, String str, hq5 hq5Var, final int i, final int i2) {
        int i3;
        final String str2;
        oq5 oq5Var;
        int i4;
        jzk jzkVar = vnj.i;
        bVar.getClass();
        function0.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(500217520);
        int i5 = 4;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(bVar) : oq5Var2.h(bVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                str2 = str;
                if (oq5Var2.f(str2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                str2 = str;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            str2 = str;
        }
        if ((i3 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                if ((i2 & 8) != 0) {
                    str2 = ern.a(y.class).f();
                    if (str2 == null) {
                        str2 = "BouncerMasterChooserScreen";
                    }
                    i3 &= -7169;
                }
                int i6 = i3;
                final String str3 = str2;
                oq5Var2.q();
                s viewModelFactory = bVar.getViewModelFactory();
                oq5Var2.a0(1729797275);
                kfu a = rpg.a(oq5Var2);
                if (a == null) {
                    xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                bfu R = ngg.R(ern.a(y.class), a, str3, viewModelFactory, a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var2);
                oq5Var = oq5Var2;
                boolean z = false;
                oq5Var.p(false);
                y yVar = (y) R;
                Object[] objArr = (i6 & 112) == 32;
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (objArr != false || K == kjnVar) {
                    K = new gct(27, function0);
                    oq5Var.k0(K);
                }
                pd.c(0, 1, oq5Var, (Function0) K, false);
                aqi Q = szf.Q(yVar.l, oq5Var);
                com.yandex.passport.internal.ui.bouncer.model.j2 j2Var = ((w) Q.getValue()).c;
                if (j2Var == null) {
                    oq5Var.Z(-1555834439);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1555834438);
                    Unit unit = Unit.a;
                    boolean h = ((i6 & 896) == 256) | oq5Var.h(j2Var);
                    Object K2 = oq5Var.K();
                    if (h || K2 == kjnVar) {
                        K2 = new com.yandex.passport.internal.storage.a(function1, j2Var, null, i5);
                        oq5Var.k0(K2);
                    }
                    gld.w(oq5Var, unit, (Function2) K2);
                    z = false;
                    oq5Var.p(false);
                }
                Throwable th = ((w) Q.getValue()).d;
                if (th != null) {
                    oq5Var.Z(-1555723644);
                    com.yandex.passport.internal.ui.common.screen.e.a(th, true, !bVar.isWhiteLabel(), function0, oq5Var, ((i6 << 6) & 7168) | 48, 0);
                    oq5Var.p(z);
                    xmn r = oq5Var.r();
                    if (r != null) {
                        final int i7 = 0;
                        r.d = new Function2() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i7) {
                                    case 0:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    case 2:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                oq5Var.Z(-1555723645);
                oq5Var.p(z);
                com.yandex.passport.common.core.f fVar = ((w) Q.getValue()).b;
                vci vciVar = vci.a;
                if (fVar != null) {
                    oq5Var.Z(-1555446039);
                    boolean z2 = z;
                    com.yandex.passport.common.ui.progress.g progressProperties = bVar.getProgressProperties();
                    yci b = androidx.compose.foundation.a.b(vciVar, ((i95) oq5Var.j(j95.a)).n, jzkVar);
                    com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                    com.yandex.passport.internal.ui.a.i(b, progressProperties, false, oq5Var, 0, 4);
                    oq5Var.p(z2);
                    xmn r2 = oq5Var.r();
                    if (r2 != null) {
                        final int i8 = 1;
                        r2.d = new Function2() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i8) {
                                    case 0:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    case 2:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str3, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                boolean z3 = z;
                str2 = str3;
                oq5Var.Z(-1557233902);
                oq5Var.p(z3);
                List list = ((w) Q.getValue()).a;
                if (list != null) {
                    oq5Var.Z(-1555214314);
                    boolean h2 = oq5Var.h(yVar);
                    Object K3 = oq5Var.K();
                    if (h2 || K3 == kjnVar) {
                        K3 = new vlv(1, yVar, y.class, "onWish", "onWish(Lcom/yandex/passport/internal/ui/bouncer/chooser/BouncerMasterChooserViewModel$Wish;)V", 0, 24);
                        oq5Var.k0(K3);
                    }
                    com.yandex.passport.internal.ui.bouncer.chooser.e.b(bVar, list, function0, (Function1) K3, oq5Var, (i6 & 14) | ((i6 << 3) & 896));
                    oq5Var.p(z3);
                    xmn r3 = oq5Var.r();
                    if (r3 != null) {
                        final int i9 = 2;
                        r3.d = new Function2() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i9) {
                                    case 0:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str2, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    case 1:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str2, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    case 2:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str2, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).intValue();
                                        com.yandex.plus.core.locale.b.a(bVar, function0, function1, str2, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                oq5Var.Z(-1555214315);
                oq5Var.p(z3);
                ug3.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.c(vciVar, 1.0f), ((i95) oq5Var.j(j95.a)).n, jzkVar), oq5Var, z3 ? 1 : 0);
            } else {
                oq5Var2.S();
            }
        }
        final String str4 = str2;
        xmn r4 = oq5Var.r();
        if (r4 != null) {
            final int i10 = 3;
            r4.d = new Function2() { // from class: com.yandex.passport.internal.ui.bouncer.chooser.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i10) {
                        case 0:
                            ((Integer) obj2).intValue();
                            com.yandex.plus.core.locale.b.a(bVar, function0, function1, str4, (hq5) obj, rvf.R(i | 1), i2);
                            break;
                        case 1:
                            ((Integer) obj2).intValue();
                            com.yandex.plus.core.locale.b.a(bVar, function0, function1, str4, (hq5) obj, rvf.R(i | 1), i2);
                            break;
                        case 2:
                            ((Integer) obj2).intValue();
                            com.yandex.plus.core.locale.b.a(bVar, function0, function1, str4, (hq5) obj, rvf.R(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).intValue();
                            com.yandex.plus.core.locale.b.a(bVar, function0, function1, str4, (hq5) obj, rvf.R(i | 1), i2);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final i iVar, final o0 o0Var, final com.yandex.passport.internal.ui.common.web.d dVar, final com.yandex.passport.common.ui.progress.g gVar, final Function1 function1, final Function1 function12, final Function1 function13, boolean z, hq5 hq5Var, final int i, final int i2) {
        int i3;
        final com.yandex.passport.internal.ui.common.web.d dVar2;
        Function1 function14;
        Function1 function15;
        boolean z2;
        Object K;
        kjn kjnVar;
        Object K2;
        Object K3;
        aqi aqiVar;
        Object K4;
        int i4;
        int i5;
        boolean z3;
        aqi aqiVar2;
        xmn r;
        Function2 function2;
        o0Var.getClass();
        dVar.getClass();
        gVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(349057563);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(iVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(o0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            dVar2 = dVar;
            i3 |= oq5Var.h(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? oq5Var.f(gVar) : oq5Var.h(gVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function14 = function1;
            i3 |= oq5Var.h(function14) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function14 = function1;
        }
        if ((196608 & i) == 0) {
            function15 = function12;
            i3 |= oq5Var.h(function15) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function15 = function12;
        }
        if ((1572864 & i) == 0) {
            i3 |= oq5Var.h(function13) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            if ((i3 & 4793491) == 4793490 || !oq5Var.z()) {
                if (i6 != 0) {
                    z2 = false;
                }
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = tlm.f(gld.R(kotlin.coroutines.g.a, oq5Var), oq5Var);
                }
                mm6 mm6Var = ((fs5) K).a;
                K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = y0q.b(0, 0, null, 7);
                    oq5Var.k0(K2);
                }
                xpi xpiVar = (xpi) K2;
                K3 = oq5Var.K();
                if (K3 == kjnVar) {
                    K3 = szf.g0(null);
                    oq5Var.k0(K3);
                }
                aqiVar = (aqi) K3;
                K4 = oq5Var.K();
                if (K4 == kjnVar) {
                    K4 = szf.g0(Boolean.FALSE);
                    oq5Var.k0(K4);
                }
                aqi aqiVar3 = (aqi) K4;
                if (((String) aqiVar.getValue()) == null) {
                    oq5Var.Z(658746394);
                    String str = (String) aqiVar.getValue();
                    str.getClass();
                    boolean h = oq5Var.h(mm6Var) | oq5Var.h(xpiVar);
                    Object K5 = oq5Var.K();
                    if (h || K5 == kjnVar) {
                        K5 = new ftr(26, mm6Var, aqiVar, xpiVar);
                        oq5Var.k0(K5);
                    }
                    com.yandex.passport.internal.ui.challenge.webview.j.a(str, (Function0) K5, oq5Var, 0);
                    oq5Var.p(false);
                    r = oq5Var.r();
                    if (r != null) {
                        final int i7 = 0;
                        final Function1 function16 = function14;
                        final Function1 function17 = function15;
                        final boolean z4 = z2;
                        function2 = new Function2() { // from class: com.yandex.passport.internal.ui.challenge.webview.a
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (i7) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        com.yandex.plus.core.locale.b.b(iVar, o0Var, dVar2, gVar, function16, function17, function13, z4, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        com.yandex.plus.core.locale.b.b(iVar, o0Var, dVar2, gVar, function16, function17, function13, z4, (hq5) obj, rvf.R(i | 1), i2);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        r.d = function2;
                        return;
                    }
                    return;
                }
                oq5Var.Z(657332391);
                oq5Var.p(false);
                if (iVar != null) {
                    oq5Var.Z(659093160);
                    boolean z5 = ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
                    Object K6 = oq5Var.K();
                    if (z5 || K6 == kjnVar) {
                        z3 = false;
                        aqiVar2 = aqiVar3;
                        r90 r90Var = new r90(function1, function12, function13, aqiVar2, aqiVar);
                        oq5Var.k0(r90Var);
                        K6 = r90Var;
                    } else {
                        z3 = false;
                        aqiVar2 = aqiVar3;
                    }
                    i5 = 657332391;
                    i4 = i3;
                    com.yandex.plus.core.network.api.utils.a.c(iVar, o0Var, dVar, xpiVar, (Function1) K6, oq5Var, i3 & 1022);
                } else {
                    i4 = i3;
                    i5 = 657332391;
                    z3 = false;
                    aqiVar2 = aqiVar3;
                    oq5Var.Z(657332391);
                }
                oq5Var.p(z3);
                if (iVar == null || !((Boolean) aqiVar2.getValue()).booleanValue()) {
                    oq5Var.Z(659930439);
                    boolean z6 = (z2 && iVar == null) ? z3 : true;
                    com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                    com.yandex.passport.internal.ui.a.i(null, gVar, z6, oq5Var, (i4 >> 6) & 112, 1);
                    oq5Var = oq5Var;
                } else {
                    oq5Var.Z(i5);
                }
                oq5Var.p(z3);
            } else {
                oq5Var.S();
            }
            final boolean z7 = z2;
            r = oq5Var.r();
            if (r != null) {
                final int i8 = 1;
                function2 = new Function2() { // from class: com.yandex.passport.internal.ui.challenge.webview.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i8) {
                            case 0:
                                ((Integer) obj2).getClass();
                                com.yandex.plus.core.locale.b.b(iVar, o0Var, dVar, gVar, function1, function12, function13, z7, (hq5) obj, rvf.R(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                com.yandex.plus.core.locale.b.b(iVar, o0Var, dVar, gVar, function1, function12, function13, z7, (hq5) obj, rvf.R(i | 1), i2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                r.d = function2;
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 4793491) == 4793490) {
        }
        if (i6 != 0) {
        }
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        mm6 mm6Var2 = ((fs5) K).a;
        K2 = oq5Var.K();
        if (K2 == kjnVar) {
        }
        xpi xpiVar2 = (xpi) K2;
        K3 = oq5Var.K();
        if (K3 == kjnVar) {
        }
        aqiVar = (aqi) K3;
        K4 = oq5Var.K();
        if (K4 == kjnVar) {
        }
        aqi aqiVar32 = (aqi) K4;
        if (((String) aqiVar.getValue()) == null) {
        }
    }

    public static final void c(final com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p pVar, final boolean z, final Function1 function1, final Function1 function12, final Function0 function0, final Function0 function02, hq5 hq5Var, final int i) {
        boolean z2;
        pVar.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1603810033);
        int i2 = i | (oq5Var.f(pVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function12) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            zcq f = sbi.f(6, 2, oq5Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = tlm.f(gld.R(kotlin.coroutines.g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            d0 viewModelFactory = pVar.getViewModelFactory();
            oq5Var.a0(1729797275);
            kfu a = rpg.a(oq5Var);
            if (a == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(f0.class), a, null, viewModelFactory, a instanceof ssd ? ((ssd) a).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
            oq5Var = oq5Var;
            oq5Var.p(false);
            f0 f0Var = (f0) R;
            aqi Q = szf.Q(f0Var.l, oq5Var);
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K2);
            }
            aqi aqiVar = (aqi) K2;
            ss3 ss3Var = f0Var.m;
            boolean z3 = (i2 & 7168) == 2048;
            Object K3 = oq5Var.K();
            Continuation continuation = null;
            if (z3 || K3 == obj) {
                K3 = new lz6(function12, continuation, 3);
                oq5Var.k0(K3);
            }
            com.yandex.plus.pay.ui.core.b.b(ss3Var, (Function2) K3, oq5Var, 0);
            Throwable th = ((e0) Q.getValue()).b;
            if (th != null) {
                oq5Var.Z(1889371096);
                boolean h = oq5Var.h(th) | ((i2 & 896) == 256);
                Object K4 = oq5Var.K();
                if (h || K4 == obj) {
                    K4 = new h(function1, th, continuation, 1);
                    oq5Var.k0(K4);
                }
                gld.w(oq5Var, th, (Function2) K4);
                oq5Var.p(false);
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i3 = 0;
                    r.d = new Function2(pVar, z, function1, function12, function0, function02, i, i3) { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r
                        public final /* synthetic */ int a;
                        public final /* synthetic */ p b;
                        public final /* synthetic */ boolean c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ Function1 e;
                        public final /* synthetic */ Function0 f;
                        public final /* synthetic */ Function0 g;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int R2 = rvf.R(1);
                                    com.yandex.plus.core.locale.b.c(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj2, R2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int R3 = rvf.R(1);
                                    com.yandex.plus.core.locale.b.c(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj2, R3);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var.Z(1889371095);
            oq5Var.p(false);
            dzf dzfVar = (dzf) oq5Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h2 = ((i2 & 112) == 32) | oq5Var.h(dzfVar);
            Object K5 = oq5Var.K();
            if (h2 || K5 == obj) {
                K5 = new y20(dzfVar, z, aqiVar, 8);
                oq5Var.k0(K5);
            }
            gld.j(dzfVar, f, (Function1) K5, oq5Var);
            h0 h0Var = ((e0) Q.getValue()).a;
            if (h0Var == null || !((Boolean) aqiVar.getValue()).booleanValue()) {
                z2 = false;
                oq5Var.Z(1887178993);
            } else {
                oq5Var.Z(1890202361);
                boolean z4 = (i2 & 458752) == 131072;
                Object K6 = oq5Var.K();
                if (z4 || K6 == obj) {
                    K6 = new gct(28, function02);
                    oq5Var.k0(K6);
                }
                z2 = false;
                wn5 C = ild.C(1389187968, new x91(h0Var, pVar, mm6Var, f, function02, function12, function0, aqiVar, 7), oq5Var);
                oq5Var = oq5Var;
                p1.b((Function0) K6, null, f, C, oq5Var, 3072);
            }
            oq5Var.p(z2);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i4 = 1;
            r2.d = new Function2(pVar, z, function1, function12, function0, function02, i, i4) { // from class: com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r
                public final /* synthetic */ int a;
                public final /* synthetic */ p b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 g;

                {
                    this.a = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int R2 = rvf.R(1);
                            com.yandex.plus.core.locale.b.c(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj2, R2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int R3 = rvf.R(1);
                            com.yandex.plus.core.locale.b.c(this.b, this.c, this.d, this.e, this.f, this.g, (hq5) obj2, R3);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final z1 d(com.yandex.passport.api.h hVar, long j) {
        hVar.getClass();
        com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(hVar.d());
        a.getClass();
        return new z1(a, j);
    }

    public static final String e(Iterable iterable) {
        return CollectionsKt.X(iterable, ", ", "[", "]", new r(21), 24);
    }

    public static final Object f(mkn mknVar, com.yandex.passport.common.network.k kVar) {
        IOException iOException;
        if (com.yandex.passport.common.util.a.d(com.yandex.plus.pay.ui.core.b.u())) {
            iOException = new IOException();
            StackTraceElement[] stackTrace = iOException.getStackTrace();
            stackTrace.getClass();
            iOException.setStackTrace((StackTraceElement[]) uz0.k(1, iOException.getStackTrace().length, stackTrace));
        } else {
            iOException = null;
        }
        zt3 zt3Var = new zt3(1, qxe.b(kVar));
        zt3Var.s();
        mknVar.z(new com.yandex.passport.common.util.d(zt3Var, iOException));
        zt3Var.u(new com.yandex.passport.common.util.e(0, mknVar));
        Object q = zt3Var.q();
        nm6 nm6Var = nm6.a;
        return q;
    }

    public static final View g(hdu hduVar, Context context, boolean z, com.yandex.passport.common.ui.view.d dVar, float f, long j) {
        context.getClass();
        dVar.getClass();
        if (z) {
            dVar.a();
            return dVar;
        }
        boolean z2 = (context.getResources().getConfiguration().uiMode & 48) == 32;
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        locales.getClass();
        int i = Intrinsics.d(locales.isEmpty() ? null : locales.get(0).getLanguage(), new Locale("ru").getLanguage()) ? z2 ? R.raw.logo_yandex_animation_ru_dark : R.raw.logo_yandex_animation_ru_light : z2 ? R.raw.logo_yandex_animation_en_dark : R.raw.logo_yandex_animation_en_light;
        ViewParent parent = dVar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(dVar);
        }
        qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
        if (hduVar instanceof rof) {
            ((rof) hduVar).j(qvcVar);
        }
        qvcVar.setAlpha(f);
        qvcVar.addView(dVar);
        View view = (View) com.yandex.passport.common.ui.view.h.a.invoke(ezf.a0(qvcVar.getCtx(), 0), 0, 0);
        qvcVar.a.j(view);
        LottieAnimationViewBuilder lottieAnimationViewBuilder = (LottieAnimationViewBuilder) view;
        lottieAnimationViewBuilder.setVisibility(j > 0 ? 8 : 0);
        lottieAnimationViewBuilder.setRepeatCount(-1);
        lottieAnimationViewBuilder.setAnimation(i);
        int i2 = (int) (8 * g4i.a.density);
        lottieAnimationViewBuilder.setPadding(i2, i2, i2, i2);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
        lottieAnimationView.addAnimatorListener(new com.yandex.passport.common.ui.view.c(j, lottieAnimationView, dVar));
        return qvcVar;
    }

    public static Intent h(Context context, u uVar, com.yandex.passport.internal.ui.challenge.logout.d dVar) {
        context.getClass();
        uVar.getClass();
        dVar.getClass();
        Bundle[] bundleArr = {cxb.K(new Pair("passport-logout-properties", uVar)), cxb.K(new Pair("passport-logout-behaviour", dVar))};
        Bundle bundle = new Bundle();
        for (int i = 0; i < 2; i++) {
            bundle.putAll(bundleArr[i]);
        }
        return vq2.A(context, LogoutActivity.class, bundle);
    }

    public static final void i(Activity activity, Exception exc) {
        exc.getClass();
        Intent intent = new Intent();
        intent.putExtra(Constants.KEY_EXCEPTION, exc);
        activity.setResult(13, intent);
        activity.finish();
    }

    public static com.yandex.passport.internal.entities.m j(Bundle bundle) {
        com.yandex.passport.internal.entities.m mVar = null;
        mVar = null;
        mVar = null;
        if (bundle != null && bundle.containsKey("passport-login-result-environment") && bundle.containsKey("passport-login-result-uid")) {
            int i = bundle.getInt("passport-login-result-environment");
            long j = bundle.getLong("passport-login-result-uid");
            int i2 = bundle.getInt("passport-login-action");
            String string = bundle.getString("passport-login-additional-action");
            com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(i);
            a.getClass();
            mVar = new com.yandex.passport.internal.entities.m(new z1(a, j), w0.values()[i2], string != null ? string : null);
        }
        if (mVar != null) {
            return mVar;
        }
        if (bundle != null && bundle.containsKey("passport-result-url") && bundle.containsKey("passport-result-purpose")) {
            throw new t("PassportAuthorizationResult.OpenUrl");
        }
        throw new t("Error parsing LoginResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.passport.internal.sso.b k(int i, String str, String str2, long j) {
        com.yandex.passport.common.core.f fVar;
        long parseLong;
        com.yandex.passport.common.core.b bVar;
        if (str != null && str2 != null && i >= 0) {
            int R = StringsKt.R(str, ':', 0, false);
            if (R >= 1 && R != str.length() - 1) {
                String substring = str.substring(0, R);
                try {
                    parseLong = Long.parseLong(str.substring(R + 1));
                } catch (NumberFormatException unused) {
                }
                if (parseLong > 0) {
                    try {
                        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                        int parseInt = Integer.parseInt(substring);
                        aVar.getClass();
                        bVar = com.yandex.passport.common.core.a.b(parseInt);
                    } catch (Exception unused2) {
                        bVar = com.yandex.passport.common.core.b.c;
                    }
                    fVar = new com.yandex.passport.common.core.f(bVar, parseLong);
                    if (fVar != null) {
                        try {
                            return new com.yandex.passport.internal.sso.b(fVar, i, com.yandex.passport.internal.sso.a.valueOf(str2), j);
                        } catch (IllegalArgumentException unused3) {
                        }
                    }
                }
            }
            fVar = null;
            if (fVar != null) {
            }
        }
        return null;
    }

    public static com.yandex.passport.internal.ui.authsdk.l l(Activity activity, Bundle bundle) {
        com.yandex.passport.internal.entities.k l;
        String callingPackage = activity.getCallingPackage();
        String str = Intrinsics.d(callingPackage, activity.getPackageName()) ? null : callingPackage;
        com.yandex.passport.internal.properties.h0 h0Var = (com.yandex.passport.internal.properties.h0) bundle.getParcelable("turbo_app_auth_properties");
        if (h0Var != null) {
            String str2 = str == null ? h0Var.e : null;
            String str3 = h0Var.d;
            List list = h0Var.f;
            com.yandex.passport.internal.properties.k kVar = new com.yandex.passport.internal.properties.k();
            kVar.a = true;
            com.yandex.passport.api.impl.b bVar = h0Var.b;
            com.yandex.passport.internal.entities.j jVar = new com.yandex.passport.internal.entities.j();
            jVar.O(bVar);
            jVar.y(n.CHILDISH);
            kVar.b = com.yandex.passport.internal.ui.a.s(jVar.l());
            y1 y1Var = h0Var.a;
            y1Var.getClass();
            kVar.f = y1Var;
            kVar.h = h0Var.c;
            kVar.q = "passport/turboapp";
            com.yandex.passport.internal.properties.l a = kVar.a();
            z1 z1Var = h0Var.c;
            PackageManager packageManager = activity.getPackageManager();
            packageManager.getClass();
            return new com.yandex.passport.internal.ui.authsdk.l(str3, list, "token", a, true, z1Var, str, n(packageManager, str), str2);
        }
        String string = bundle.getString("com.yandex.auth.CLIENT_ID");
        if (string == null) {
            xq0.q("Required value was null.");
            return null;
        }
        List stringArrayList = bundle.getStringArrayList("com.yandex.auth.SCOPES");
        if (stringArrayList == null) {
            stringArrayList = c5b.a;
        }
        List list2 = stringArrayList;
        String string2 = bundle.getString("com.yandex.passport.RESPONSE_TYPE", "token");
        boolean z = bundle.getBoolean("com.yandex.auth.USE_TESTING_ENV", false);
        try {
            l = (com.yandex.passport.internal.entities.k) bundle.getParcelable("com.yandex.passport.ACCOUNTS_FILTER");
            if (l == null) {
                com.yandex.passport.api.impl.b bVar2 = z ? com.yandex.passport.api.impl.b.e : com.yandex.passport.api.impl.b.c;
                com.yandex.passport.internal.entities.j jVar2 = new com.yandex.passport.internal.entities.j();
                jVar2.O(bVar2);
                jVar2.y(n.CHILDISH);
                l = jVar2.l();
            }
        } catch (Exception unused) {
            com.yandex.passport.api.impl.b bVar3 = z ? com.yandex.passport.api.impl.b.e : com.yandex.passport.api.impl.b.c;
            com.yandex.passport.internal.entities.j jVar3 = new com.yandex.passport.internal.entities.j();
            jVar3.O(bVar3);
            jVar3.y(n.CHILDISH);
            l = jVar3.l();
        }
        y1 y1Var2 = y1.values()[bundle.getInt("com.yandex.passport.THEME", 0)];
        z1 z1Var2 = (z1) com.appsflyer.internal.k.h(bundle, com.yandex.passport.internal.util.p.class, "passport-uid");
        if (z1Var2 == null && bundle.containsKey("com.yandex.auth.UID_VALUE")) {
            long j = bundle.getLong("com.yandex.auth.UID_VALUE");
            if (j > 0) {
                z1Var2 = new z1(l.a, j);
            }
        }
        z1 z1Var3 = z1Var2;
        String string3 = bundle.getString("com.yandex.auth.LOGIN_HINT");
        boolean z2 = bundle.getBoolean("com.yandex.auth.FORCE_CONFIRM", false);
        string2.getClass();
        com.yandex.passport.internal.properties.k kVar2 = new com.yandex.passport.internal.properties.k();
        kVar2.a = true;
        kVar2.b = com.yandex.passport.internal.ui.a.s(l);
        y1Var2.getClass();
        kVar2.f = y1Var2;
        kVar2.l = string3;
        kVar2.h = z1Var3;
        kVar2.q = "passport/authsdk";
        com.yandex.passport.internal.properties.l a2 = kVar2.a();
        PackageManager packageManager2 = activity.getPackageManager();
        packageManager2.getClass();
        return new com.yandex.passport.internal.ui.authsdk.l(string, list2, string2, a2, z2, z1Var3, str, n(packageManager2, str), null);
    }

    public static final String m(a aVar) {
        aVar.getClass();
        String language = aVar.a().getLanguage();
        language.getClass();
        return language;
    }

    public static String n(PackageManager packageManager, String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArr = com.yandex.passport.internal.entities.s.c;
            byte[] b = com.yandex.plus.core.network.api.utils.a.q(packageManager, str).b();
            ArrayList arrayList = new ArrayList(b.length);
            for (byte b2 : b) {
                arrayList.add(String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
            }
            return CollectionsKt.X(arrayList, StringUtils.PROCESS_POSTFIX_DELIMITER, null, null, null, 62);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int o(boolean z) {
        if (z) {
            return 1;
        }
        if (!z) {
            return 0;
        }
        b6e.s();
        return 0;
    }

    public static final boolean p(o oVar) {
        oVar.getClass();
        int ordinal = oVar.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        if (ordinal == 3) {
            return true;
        }
        b6e.s();
        return false;
    }

    public static final boolean q(Throwable th) {
        if (th instanceof UnknownHostException) {
            return true;
        }
        IOException iOException = th instanceof IOException ? (IOException) th : null;
        return (iOException != null ? iOException.getCause() : null) instanceof UnknownHostException;
    }

    public static String r(com.yandex.passport.common.core.b bVar, String str) {
        bVar.getClass();
        return str + '_' + bVar.a;
    }

    public static String s(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length > 0) {
            String str2 = StringUtil.SPACE;
            if (length <= 8192) {
                if (length > 0) {
                    char[] cArr = new char[length];
                    for (int i2 = length - 1; -1 < i2; i2--) {
                        cArr[i2] = c;
                    }
                    str2 = new String(cArr);
                }
                return str2.concat(str);
            }
            String valueOf = String.valueOf(c);
            if (!TextUtils.isEmpty(valueOf)) {
                str2 = valueOf;
            }
            int length2 = str2.length();
            int length3 = i - str.length();
            if (length3 > 0) {
                if (length2 == 1 && length3 <= 8192) {
                    return s(str, i, str2.charAt(0));
                }
                if (length3 == length2) {
                    return str2.concat(str);
                }
                if (length3 < length2) {
                    return str2.substring(0, length3).concat(str);
                }
                char[] cArr2 = new char[length3];
                char[] charArray = str2.toCharArray();
                charArray.getClass();
                for (int i3 = 0; i3 < length3; i3++) {
                    cArr2[i3] = charArray[i3 % length2];
                }
                return new String(cArr2).concat(str);
            }
        }
        return str;
    }

    public static String t(int i, long j) {
        return s(String.valueOf(j), i, '0');
    }

    public static String u(Parcel parcel) {
        String readString = parcel.readString();
        if (readString != null) {
            return readString;
        }
        xq0.q("String is required here");
        return null;
    }

    public static final void v(BackendError backendError) {
        backendError.getClass();
        switch (com.yandex.passport.data.network.core.c.a[backendError.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                throw new com.yandex.passport.common.exception.a();
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                String backendError2 = backendError.toString();
                backendError2.getClass();
                throw new com.yandex.passport.data.exceptions.j(backendError2);
            case 11:
            case 12:
            case 13:
            case 14:
                throw new com.yandex.passport.data.exceptions.e("not correct service or brand");
            case 15:
                throw new com.yandex.passport.data.exceptions.h(backendError.toString());
            default:
                throw new com.yandex.passport.data.exceptions.a(backendError);
        }
    }

    public static final qh w(s0 s0Var) {
        s0Var.getClass();
        if (s0Var.equals(n0.c)) {
            return com.yandex.plus.core.network.api.utils.a.b(17121);
        }
        if (s0Var.equals(n0.b)) {
            return com.yandex.plus.core.network.api.utils.a.b(-1);
        }
        if (s0Var.equals(n0.a)) {
            return com.yandex.plus.core.network.api.utils.a.b(666);
        }
        if (s0Var instanceof com.yandex.passport.internal.ui.sloth.webcard.q0) {
            com.yandex.passport.internal.ui.sloth.webcard.q0 q0Var = (com.yandex.passport.internal.ui.sloth.webcard.q0) s0Var;
            return com.yandex.plus.core.network.api.utils.a.a(42, cxb.K(new Pair("passport-result-url", q0Var.a), new Pair("passport-result-purpose", q0Var.b)));
        }
        if (s0Var instanceof p0) {
            return com.yandex.plus.core.network.api.utils.a.a(13, cxb.K(new Pair(Constants.KEY_EXCEPTION, ((p0) s0Var).a)));
        }
        if (s0Var instanceof r0) {
            com.yandex.passport.common.core.f fVar = ((r0) s0Var).a;
            return com.yandex.plus.core.network.api.utils.a.a(392, cxb.K(new Pair("passport-result-environment", Integer.valueOf(fVar.a.a)), new Pair("passport-result-uid", Long.valueOf(fVar.b))));
        }
        if (s0Var instanceof com.yandex.passport.internal.ui.sloth.webcard.o0) {
            return com.yandex.plus.core.network.api.utils.a.a(43, cxb.K(new Pair("passport-result-url", ((com.yandex.passport.internal.ui.sloth.webcard.o0) s0Var).a)));
        }
        b6e.s();
        return null;
    }

    public static final String x(String str) {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = messageDigest.digest(bytes);
        digest.getClass();
        return xz0.I(digest, "", new r(22));
    }

    public static final com.yandex.passport.internal.properties.g y(com.yandex.passport.internal.properties.g gVar) {
        gVar.getClass();
        com.yandex.passport.internal.entities.k s = com.yandex.passport.internal.ui.a.s(gVar.e());
        y1 h = gVar.h();
        x f = gVar.f();
        String message = gVar.getMessage();
        boolean g = gVar.g();
        com.yandex.passport.internal.credentials.f d = gVar.d();
        return new com.yandex.passport.internal.properties.g(s, h, f, message, g, d != null ? new com.yandex.passport.internal.credentials.f(d.a, d.b) : null);
    }

    public static final v z(v vVar) {
        vVar.getClass();
        return new v(vVar.d(), vVar.g(), vVar.e(), vVar.f());
    }
}
