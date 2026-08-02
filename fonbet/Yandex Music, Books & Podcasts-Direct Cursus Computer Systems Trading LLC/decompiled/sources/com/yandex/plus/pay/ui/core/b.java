package com.yandex.plus.pay.ui.core;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFormatException;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.api.h0;
import com.yandex.passport.api.i0;
import com.yandex.passport.api.j0;
import com.yandex.passport.api.w1;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.common.network.r;
import com.yandex.passport.data.models.w;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.entities.k;
import com.yandex.passport.internal.entities.v;
import com.yandex.passport.internal.properties.d0;
import com.yandex.passport.internal.properties.f0;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.m0;
import com.yandex.passport.internal.sso.d;
import com.yandex.passport.internal.sso.e;
import com.yandex.passport.internal.sso.g;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.logout.j;
import com.yandex.passport.internal.ui.challenge.logout.n;
import com.yandex.passport.internal.ui.challenge.logout.p;
import com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity;
import com.yandex.passport.internal.ui.challenge.webview.i;
import com.yandex.passport.internal.ui.sloth.authsdk.e0;
import com.yandex.passport.internal.ui.sloth.authsdk.o;
import com.yandex.passport.internal.ui.sloth.authsdk.x;
import com.yandex.passport.internal.ui.sloth.authsdk.y;
import com.yandex.passport.internal.ui.sloth.screen.h;
import com.yandex.passport.sloth.b1;
import com.yandex.passport.sloth.data.m;
import com.yandex.passport.sloth.ui.c1;
import com.yandex.passport.sloth.ui.e1;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.c;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.f;
import defpackage.agr;
import defpackage.al3;
import defpackage.aqi;
import defpackage.asa;
import defpackage.b6e;
import defpackage.bfu;
import defpackage.cxb;
import defpackage.dzf;
import defpackage.e5b;
import defpackage.ern;
import defpackage.fd1;
import defpackage.fd3;
import defpackage.fxf;
import defpackage.gld;
import defpackage.gq5;
import defpackage.gs6;
import defpackage.hn5;
import defpackage.hq5;
import defpackage.hr2;
import defpackage.hvp;
import defpackage.i5f;
import defpackage.i95;
import defpackage.ild;
import defpackage.iw5;
import defpackage.j95;
import defpackage.jvp;
import defpackage.k32;
import defpackage.kac;
import defpackage.kfu;
import defpackage.kjn;
import defpackage.kwd;
import defpackage.l3o;
import defpackage.mf3;
import defpackage.n0d;
import defpackage.ngg;
import defpackage.nyf;
import defpackage.o3o;
import defpackage.o57;
import defpackage.oq5;
import defpackage.pjc;
import defpackage.q0k;
import defpackage.qh;
import defpackage.qld;
import defpackage.quj;
import defpackage.r7o;
import defpackage.rjp;
import defpackage.rpg;
import defpackage.rvf;
import defpackage.rvr;
import defpackage.ssd;
import defpackage.szf;
import defpackage.t7o;
import defpackage.u0v;
import defpackage.vq2;
import defpackage.vu0;
import defpackage.wn5;
import defpackage.wzv;
import defpackage.x3f;
import defpackage.xmn;
import defpackage.xq0;
import defpackage.xv7;
import defpackage.yci;
import defpackage.z7o;
import defpackage.zk3;
import defpackage.zyr;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class b {
    public static Context a;

    public static boolean A(Context context, IReporterYandex iReporterYandex) {
        context.getClass();
        iReporterYandex.getClass();
        g gVar = new g(context, null, null);
        String packageName = context.getPackageName();
        packageName.getClass();
        d c = gVar.c(packageName, new e(iReporterYandex, 1));
        if (c == null) {
            return false;
        }
        return c.a(gVar.d, new e(iReporterYandex, 2));
    }

    public static final boolean B(com.yandex.passport.common.core.b bVar) {
        bVar.getClass();
        return bVar == com.yandex.passport.common.core.b.d || bVar == com.yandex.passport.common.core.b.f;
    }

    public static final zyr C(com.yandex.passport.common.ui.a aVar) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        return ordinal != 0 ? ordinal != 1 ? new zyr(0, 0, 0, rvr.t) : new zyr(0, 0, 0, new r(2)) : new zyr(0, 0, 0, new r(1));
    }

    public static final void D(com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.d dVar, c cVar) {
        f fVar;
        SpannedString valueOf;
        dVar.getClass();
        int ordinal = cVar.a().ordinal();
        if (ordinal == 0) {
            fVar = new f(R.style.AcquisitionSdk_TextAppearance_Check_S_Title, R.style.AcquisitionSdk_TextAppearance_Check_S_Subtitle);
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            fVar = new f(R.style.AcquisitionSdk_Yango_TextAppearance_Title5, R.style.AcquisitionSdk_Yango_TextAppearance_Caption);
        }
        if (cVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.b) {
            valueOf = SpannedString.valueOf(((com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.b) cVar).c);
        } else {
            if (!(cVar instanceof com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a)) {
                b6e.s();
                return;
            }
            com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a aVar = (com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.a) cVar;
            com.yandex.plus.core.strings.a aVar2 = aVar.b;
            String str = aVar.d;
            String str2 = aVar.c;
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) str2).append((CharSequence) str);
                Context context = dVar.getView().getContext();
                context.getClass();
                append.setSpan(new ForegroundColorSpan(context.getColor(R.color.acquisition_sdk_semantic_control_content_accent)), 0, str2.length(), 33);
                valueOf = SpannedString.valueOf(append);
            } else {
                if (ordinal2 != 1) {
                    b6e.s();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                valueOf = SpannedString.valueOf(sb);
            }
        }
        String title = cVar.getTitle();
        TextView titleTextView = dVar.getTitleTextView();
        titleTextView.setText(SpannedString.valueOf(title));
        titleTextView.setTextAppearance(fVar.a);
        TextView subtitleTextView = dVar.getSubtitleTextView();
        subtitleTextView.setText(valueOf);
        subtitleTextView.setTextAppearance(fVar.b);
    }

    public static long E(int i, int i2) {
        int i3 = (i2 & 2) != 0 ? 0 : 1;
        int i4 = (i2 & 8) != 0 ? 0 : 1;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        return com.yandex.passport.common.time.a.a((i3 * 744) + (i4 * 24) + i, 0, 0);
    }

    public static final qh F(j0 j0Var) {
        j0Var.getClass();
        if (j0Var.equals(h0.c)) {
            return com.yandex.plus.core.network.api.utils.a.a(-1, new Bundle());
        }
        if (j0Var.equals(h0.a)) {
            return com.yandex.plus.core.network.api.utils.a.b(0);
        }
        if (j0Var.equals(h0.b)) {
            return com.yandex.plus.core.network.api.utils.a.b(6);
        }
        if (j0Var instanceof i0) {
            return com.yandex.plus.core.network.api.utils.a.a(13, cxb.K(new Pair(Constants.KEY_EXCEPTION, ((i0) j0Var).a)));
        }
        b6e.s();
        return null;
    }

    public static final com.yandex.passport.common.ui.a G(y1 y1Var) {
        y1Var.getClass();
        int ordinal = y1Var.ordinal();
        if (ordinal == 0) {
            return com.yandex.passport.common.ui.a.a;
        }
        if (ordinal == 1) {
            return com.yandex.passport.common.ui.a.b;
        }
        if (ordinal == 2) {
            return com.yandex.passport.common.ui.a.a;
        }
        if (ordinal == 3) {
            return com.yandex.passport.common.ui.a.c;
        }
        b6e.s();
        return null;
    }

    public static final d0 H(d0 d0Var) {
        z1 z1Var;
        d0Var.getClass();
        y1 y1Var = y1.a;
        k kVar = d0Var.a;
        kVar.getClass();
        y1 y1Var2 = d0Var.b;
        y1Var2.getClass();
        z1 z1Var2 = d0Var.c;
        String str = d0Var.d;
        str.getClass();
        String str2 = d0Var.e;
        k s = com.yandex.passport.internal.ui.a.s(kVar);
        if (z1Var2 != null) {
            com.yandex.passport.api.impl.b b = com.yandex.passport.api.impl.b.b(z1Var2.a);
            b.getClass();
            z1Var = new z1(b, z1Var2.b);
        } else {
            z1Var = null;
        }
        return new d0(s, y1Var2, z1Var, str, str2);
    }

    public static final y1 I(com.yandex.passport.common.ui.a aVar) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return y1.a;
        }
        if (ordinal == 1) {
            return y1.b;
        }
        if (ordinal == 2) {
            return y1.d;
        }
        b6e.s();
        return null;
    }

    public static final z1 J(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        return new z1(com.yandex.plus.core.network.api.utils.a.P(fVar.a), fVar.b);
    }

    public static final com.yandex.passport.common.core.f K(z1 z1Var) {
        z1Var.getClass();
        return L(z1Var);
    }

    public static final com.yandex.passport.common.core.f L(z1 z1Var) {
        z1Var.getClass();
        return new com.yandex.passport.common.core.f(com.yandex.plus.core.network.api.utils.a.K(z1Var.a), z1Var.b);
    }

    public static final void a(final o oVar, final Function1 function1, hq5 hq5Var, final int i) {
        oq5 oq5Var;
        oVar.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-3579543);
        int i2 = (oq5Var2.f(oVar) ? 4 : 2) | i | (oq5Var2.h(function1) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            x viewModelFactory = oVar.getViewModelFactory();
            oq5Var2.a0(1729797275);
            kfu a2 = rpg.a(oq5Var2);
            if (a2 == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(e0.class), a2, null, viewModelFactory, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var2);
            oq5Var2.p(false);
            final e0 e0Var = (e0) R;
            aqi Q = szf.Q(e0Var.l, oq5Var2);
            Object obj = ((y) Q.getValue()).a;
            Object obj2 = gq5.a;
            if (obj == null) {
                oq5Var2.Z(736361019);
            } else {
                oq5Var2.Z(736361020);
                boolean h = ((i2 & 112) == 32) | oq5Var2.h(obj);
                Object K = oq5Var2.K();
                if (h || K == obj2) {
                    K = new com.yandex.passport.internal.storage.a(function1, obj, null, 16);
                    oq5Var2.k0(K);
                }
                gld.w(oq5Var2, obj, (Function2) K);
            }
            oq5Var2.p(false);
            Throwable th = ((y) Q.getValue()).b;
            if (th != null) {
                oq5Var2.Z(736475844);
                boolean h2 = oq5Var2.h(e0Var);
                Object K2 = oq5Var2.K();
                if (h2 || K2 == obj2) {
                    K2 = new com.yandex.passport.internal.common.e(28, e0Var);
                    oq5Var2.k0(K2);
                }
                com.yandex.passport.internal.ui.common.screen.e.a(th, true, false, (Function0) K2, oq5Var2, 48, 4);
                oq5Var2.p(false);
                xmn r = oq5Var2.r();
                if (r != null) {
                    final int i3 = 0;
                    r.d = new Function2(oVar, function1, i, i3) { // from class: com.yandex.passport.internal.ui.sloth.authsdk.q
                        public final /* synthetic */ int a;
                        public final /* synthetic */ o b;
                        public final /* synthetic */ Function1 c;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i4 = this.a;
                            hq5 hq5Var2 = (hq5) obj3;
                            ((Integer) obj4).getClass();
                            switch (i4) {
                                case 0:
                                    com.yandex.plus.pay.ui.core.b.a(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                                default:
                                    com.yandex.plus.pay.ui.core.b.a(this.b, this.c, hq5Var2, rvf.R(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            oq5Var2.Z(736475843);
            oq5Var2.p(false);
            m slothParams = oVar.getSlothParams();
            com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = oVar.getSlothScreenComponentBuilder();
            boolean h3 = oq5Var2.h(e0Var);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == obj2) {
                final int i4 = 0;
                K3 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.authsdk.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i4) {
                            case 0:
                                b1 b1Var = (b1) obj3;
                                b1Var.getClass();
                                e0Var.a(new c0(b1Var));
                                break;
                            case 1:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj3;
                                h0Var.getClass();
                                e0Var.a(new a0(h0Var));
                                break;
                            default:
                                e1 e1Var = (e1) obj3;
                                e1Var.getClass();
                                e0Var.a(new b0(e1Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K3);
            }
            Function1 function12 = (Function1) K3;
            boolean h4 = oq5Var2.h(e0Var);
            Object K4 = oq5Var2.K();
            if (h4 || K4 == obj2) {
                final int i5 = 1;
                K4 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.authsdk.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i5) {
                            case 0:
                                b1 b1Var = (b1) obj3;
                                b1Var.getClass();
                                e0Var.a(new c0(b1Var));
                                break;
                            case 1:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj3;
                                h0Var.getClass();
                                e0Var.a(new a0(h0Var));
                                break;
                            default:
                                e1 e1Var = (e1) obj3;
                                e1Var.getClass();
                                e0Var.a(new b0(e1Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K4);
            }
            Function1 function13 = (Function1) K4;
            boolean h5 = oq5Var2.h(e0Var);
            Object K5 = oq5Var2.K();
            if (h5 || K5 == obj2) {
                final int i6 = 2;
                K5 = new Function1() { // from class: com.yandex.passport.internal.ui.sloth.authsdk.r
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i6) {
                            case 0:
                                b1 b1Var = (b1) obj3;
                                b1Var.getClass();
                                e0Var.a(new c0(b1Var));
                                break;
                            case 1:
                                com.yandex.passport.sloth.h0 h0Var = (com.yandex.passport.sloth.h0) obj3;
                                h0Var.getClass();
                                e0Var.a(new a0(h0Var));
                                break;
                            default:
                                e1 e1Var = (e1) obj3;
                                e1Var.getClass();
                                e0Var.a(new b0(e1Var));
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K5);
            }
            g(slothParams, slothScreenComponentBuilder, function12, function13, (Function1) K5, null, oq5Var2, 0, 32);
            oq5Var = oq5Var2;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i7 = 1;
            r2.d = new Function2(oVar, function1, i, i7) { // from class: com.yandex.passport.internal.ui.sloth.authsdk.q
                public final /* synthetic */ int a;
                public final /* synthetic */ o b;
                public final /* synthetic */ Function1 c;

                {
                    this.a = i7;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int i42 = this.a;
                    hq5 hq5Var2 = (hq5) obj3;
                    ((Integer) obj4).getClass();
                    switch (i42) {
                        case 0:
                            com.yandex.plus.pay.ui.core.b.a(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                        default:
                            com.yandex.plus.pay.ui.core.b.a(this.b, this.c, hq5Var2, rvf.R(1));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(pjc pjcVar, Function2 function2, hq5 hq5Var, int i) {
        pjc pjcVar2;
        pjcVar.getClass();
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1549519712);
        if ((((oq5Var.h(pjcVar) ? 4 : 2) | i | (oq5Var.h(function2) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            pjcVar2 = pjcVar;
        } else {
            nyf lifecycle = ((dzf) oq5Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            aqi o0 = szf.o0(function2, oq5Var);
            boolean h = oq5Var.h(lifecycle) | oq5Var.h(pjcVar) | oq5Var.f(o0);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                pjcVar2 = pjcVar;
                K = new wzv(lifecycle, pjcVar2, o0, null, 16);
                oq5Var.k0(K);
            } else {
                pjcVar2 = pjcVar;
            }
            gld.y(pjcVar2, lifecycle, (Function2) K, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(pjcVar2, function2, i, 22);
        }
    }

    public static final void c(final j jVar, final Function1 function1, final Function1 function12, final Function1 function13, hq5 hq5Var, final int i) {
        Function1 function14;
        jVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1398203472);
        int i2 = 2;
        int i3 = i | (oq5Var.f(jVar) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.h(function12) ? 256 : 128) | (oq5Var.h(function13) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function14 = function12;
        } else {
            com.yandex.passport.internal.ui.challenge.logout.m viewModelFactory = jVar.getViewModelFactory();
            oq5Var.a0(1729797275);
            kfu a2 = rpg.a(oq5Var);
            if (a2 == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(p.class), a2, null, viewModelFactory, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
            oq5Var.p(false);
            p pVar = (p) R;
            aqi Q = szf.Q(pVar.l, oq5Var);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Boolean bool = ((n) Q.getValue()).c;
            Object obj = gq5.a;
            if (bool != null) {
                oq5Var.Z(-1286347901);
                Boolean bool2 = ((n) Q.getValue()).c;
                boolean f = ((i3 & 112) == 32) | oq5Var.f(Q);
                Object K = oq5Var.K();
                if (f || K == obj) {
                    K = new n0d(function1, Q, null, i2);
                    oq5Var.k0(K);
                }
                gld.w(oq5Var, bool2, (Function2) K);
            } else {
                oq5Var.Z(-1287326478);
            }
            oq5Var.p(false);
            Throwable th = ((n) Q.getValue()).b;
            if (th != null) {
                if (th instanceof Exception) {
                    function13.invoke(th);
                } else {
                    function13.invoke(new RuntimeException(th));
                }
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i4 = 0;
                    r.d = new Function2(jVar, function1, function12, function13, i, i4) { // from class: com.yandex.passport.internal.ui.challenge.logout.k
                        public final /* synthetic */ int a;
                        public final /* synthetic */ j b;
                        public final /* synthetic */ Function1 c;
                        public final /* synthetic */ Function1 d;
                        public final /* synthetic */ Function1 e;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int R2 = rvf.R(1);
                                    com.yandex.plus.pay.ui.core.b.c(this.b, this.c, this.d, this.e, (hq5) obj2, R2);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int R3 = rvf.R(1);
                                    com.yandex.plus.pay.ui.core.b.c(this.b, this.c, this.d, this.e, (hq5) obj2, R3);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            function14 = function12;
            i iVar = ((n) Q.getValue()).d;
            o0 eventReporter = jVar.getEventReporter();
            com.yandex.passport.internal.ui.common.web.d webUrlChecker = jVar.getWebUrlChecker();
            com.yandex.passport.common.ui.progress.g progressProperties = jVar.getProgressProperties();
            boolean z = (i3 & 896) == 256;
            Object K2 = oq5Var.K();
            if (z || K2 == obj) {
                K2 = new k32(11, function14);
                oq5Var.k0(K2);
            }
            Function1 function15 = (Function1) K2;
            boolean h = oq5Var.h(pVar);
            Object K3 = oq5Var.K();
            if (h || K3 == obj) {
                K3 = new com.yandex.passport.common.util.e(3, pVar);
                oq5Var.k0(K3);
            }
            Function1 function16 = (Function1) K3;
            boolean h2 = oq5Var.h(context);
            Object K4 = oq5Var.K();
            if (h2 || K4 == obj) {
                K4 = new kwd(context, 4);
                oq5Var.k0(K4);
            }
            Function1 function17 = (Function1) K4;
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.plus.core.locale.b.b(iVar, eventReporter, webUrlChecker, progressProperties, function15, function16, function17, true, oq5Var, 12582912, 0);
            oq5Var = oq5Var;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i5 = 1;
            final Function1 function18 = function14;
            r2.d = new Function2(jVar, function1, function18, function13, i, i5) { // from class: com.yandex.passport.internal.ui.challenge.logout.k
                public final /* synthetic */ int a;
                public final /* synthetic */ j b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function1 e;

                {
                    this.a = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int R2 = rvf.R(1);
                            com.yandex.plus.pay.ui.core.b.c(this.b, this.c, this.d, this.e, (hq5) obj2, R2);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int R3 = rvf.R(1);
                            com.yandex.plus.pay.ui.core.b.c(this.b, this.c, this.d, this.e, (hq5) obj2, R3);
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(Function0 function0, yci yciVar, boolean z, zk3 zk3Var, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(835216206);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(zk3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            qld.n(function0, androidx.compose.foundation.layout.d.e(yciVar, 56), z, ((hvp) oq5Var.j(jvp.a)).c, zk3Var, null, null, wn5Var, oq5Var, (i2 & 910) | ((i2 << 3) & 57344) | ((i2 << 15) & 1879048192));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(function0, yciVar, z, zk3Var, wn5Var, i, 11);
        }
    }

    public static final void e(int i, int i2, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        int i3;
        Function0 function02;
        yci yciVar2;
        boolean z2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1123616879);
        int i4 = 16;
        int i5 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
        } else {
            i3 = i5 | (oq5Var.g(z) ? 2048 : 1024);
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            function02 = function0;
            z2 = z;
        } else {
            if (i6 != 0) {
                z = true;
            }
            boolean z3 = z;
            q0k q0kVar = al3.a;
            agr agrVar = j95.a;
            int i7 = i3 >> 3;
            function02 = function0;
            d(function02, yciVar, z3, al3.a(((i95) oq5Var.j(agrVar)).c, ((i95) oq5Var.j(agrVar)).d, oq5Var), ild.C(1925681300, new mf3(str, i4), oq5Var), oq5Var, (i7 & 14) | 24624 | (i7 & 896));
            yciVar2 = yciVar;
            z2 = z3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iw5(function02, yciVar2, z2, str, i, i2);
        }
    }

    public static final void f(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        boolean z2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1259411551);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | 3072;
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
        } else {
            q0k q0kVar = al3.a;
            agr agrVar = j95.a;
            d(function0, yciVar, true, al3.a(((i95) oq5Var.j(agrVar)).h, ((i95) oq5Var.j(agrVar)).i, oq5Var), ild.C(-1827701598, new mf3(str, 15), oq5Var), oq5Var, ((i2 >> 3) & 14) | 25008);
            z2 = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd3(function0, yciVar, z2, str, i, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (r6 == r1) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(m mVar, com.yandex.passport.internal.ui.sloth.screen.e eVar, Function1 function1, Function1 function12, Function1 function13, Map map, hq5 hq5Var, int i, int i2) {
        Map map2;
        int i3;
        Map map3;
        kjn kjnVar;
        Map map4;
        mVar.getClass();
        eVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2024605599);
        int i4 = (oq5Var.h(mVar) ? 4 : 2) | i | (oq5Var.f(eVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= oq5Var.h(function1) ? 256 : 128;
        }
        int i5 = i4 | (oq5Var.h(function12) ? 2048 : 1024) | (oq5Var.h(function13) ? 16384 : RemoteCameraConfig.Notification.ID);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            map2 = map;
        } else {
            map2 = map;
            i3 = i5 | (oq5Var.h(map2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            map4 = map2;
        } else {
            if (i6 != 0) {
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                map3 = e5bVar;
            } else {
                map3 = map2;
            }
            boolean f = ((i3 & 112) == 32) | oq5Var.f(mVar) | oq5Var.f(map3) | ((57344 & i3) == 16384);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (f || K == kjnVar2) {
                K = eVar.setSlothParams(mVar).setSlothHeaders(map3).setOnSlothUiWish(function13).build();
                oq5Var.k0(K);
            }
            com.yandex.passport.internal.ui.sloth.screen.f fVar = (com.yandex.passport.internal.ui.sloth.screen.f) K;
            h viewModelFactory = fVar.getViewModelFactory();
            oq5Var.a0(1729797275);
            kfu a2 = rpg.a(oq5Var);
            if (a2 == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            bfu R = ngg.R(ern.a(com.yandex.passport.internal.ui.sloth.screen.i.class), a2, null, viewModelFactory, a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var);
            oq5Var.p(false);
            com.yandex.passport.internal.ui.sloth.screen.i iVar = (com.yandex.passport.internal.ui.sloth.screen.i) R;
            Continuation continuation = null;
            c1.b(fVar, null, oq5Var, 0, 2);
            boolean h = oq5Var.h(iVar) | ((i3 & 896) == 256);
            Object K2 = oq5Var.K();
            if (h) {
                kjnVar = kjnVar2;
            } else {
                kjnVar = kjnVar2;
            }
            K2 = new com.yandex.passport.internal.ui.sloth.screen.g(iVar, function1, continuation, 0);
            oq5Var.k0(K2);
            gld.w(oq5Var, iVar, (Function2) K2);
            boolean h2 = oq5Var.h(iVar) | ((i3 & 7168) == 2048);
            Object K3 = oq5Var.K();
            if (h2 || K3 == kjnVar) {
                K3 = new com.yandex.passport.internal.ui.sloth.screen.g(iVar, function12, continuation, 1);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, iVar, (Function2) K3);
            map4 = map3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1(mVar, eVar, function1, function12, function13, map4, i, i2, 19);
        }
    }

    public static final void h(ValueAnimator valueAnimator, Function1 function1) {
        valueAnimator.getClass();
        valueAnimator.addUpdateListener(new hr2(21, function1));
    }

    public static final void i(View view) {
        long X;
        view.getClass();
        asa asaVar = new asa();
        new rjp(view, new o57(1, asaVar, asa.class, "accumulate", "accumulate(Lcom/lightside/animations/AnimationActor;)V", 0, 11)).b(0.0f, 1.0f);
        X = fxf.X((r2 & 8) != 0 ? 0 : 1, (r2 & 16) == 0 ? 200 : 0);
        asaVar.setDuration(X);
        asaVar.start();
    }

    public static final ObjectAnimator j(View view) {
        view.getClass();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setProperty(View.ALPHA);
        return objectAnimator;
    }

    public static Intent k(Context context, l lVar) {
        context.getClass();
        lVar.getClass();
        Bundle[] bundleArr = {lVar.t()};
        Bundle bundle = new Bundle();
        bundle.putAll(bundleArr[0]);
        return vq2.A(context, BouncerActivity.class, bundle);
    }

    public static Intent l(Context context, com.yandex.passport.internal.properties.r rVar) {
        context.getClass();
        rVar.getClass();
        Bundle[] bundleArr = {cxb.K(new Pair("passport-delete-account-properties", rVar))};
        Bundle bundle = new Bundle();
        bundle.putAll(bundleArr[0]);
        return vq2.A(context, DeleteForeverActivity.class, bundle);
    }

    public static Intent m(Context context, String str) {
        context.getClass();
        str.getClass();
        Intent addFlags = new Intent(context, (Class<?>) VpnChallengeActivity.class).putExtra("vpn.challenge.url", str).addFlags(SQLiteDatabase.OPEN_SHAREDCACHE).addFlags(SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        addFlags.getClass();
        return addFlags;
    }

    public static Intent n(List list, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("version", "5.21");
        bundle.putInt("client_id", i);
        bundle.putBoolean("revoke", true);
        bundle.putString("scope", TextUtils.join(StringUtils.COMMA, list));
        Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
        intent.setPackage("com.vkontakte.android");
        intent.putExtras(bundle);
        return intent;
    }

    public static final List o(ArrayList arrayList, List list) {
        list.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.size() == arrayList.size() ? arrayList2 : list;
    }

    public static final Object p(hn5 hn5Var, String str, Function1 function1) {
        try {
            r7o r7oVar = z7o.b;
            Bundle extras = hn5Var.getIntent().getExtras();
            if (extras != null) {
                return function1.invoke(extras);
            }
            throw new IllegalArgumentException(str.concat(" is missing in Intent"));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }

    public static final String q(l3o l3oVar) {
        l3oVar.getClass();
        try {
            o3o o3oVar = l3oVar.g;
            String D = o3oVar != null ? o3oVar.D() : null;
            l3oVar.close();
            if (D != null) {
                return D;
            }
            kac.f("empty response body");
            return null;
        } finally {
        }
    }

    public static z1 r(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
        z1 z1Var = (z1) bundle.getParcelable("passport-uid");
        if (z1Var != null) {
            return z1Var;
        }
        throw new ParcelFormatException("Invalid parcelable " + z1.class.getSimpleName() + " in the bundle");
    }

    public static final com.yandex.passport.common.core.g s(int i, String str) {
        str.getClass();
        i5f r = quj.r(x3f.d, new com.yandex.passport.internal.storage.d(18));
        return com.yandex.passport.data.mapper.a.a(w.a((w) r.b(w.Companion.serializer(), str), str, null, com.yandex.passport.common.time.a.c(0, i, 0, 11)));
    }

    public static l t(com.yandex.passport.api.limited.a aVar) {
        aVar.getClass();
        String f = aVar.f();
        k s = com.yandex.passport.internal.ui.a.s(aVar.getFilter());
        y1 theme = aVar.getTheme();
        com.yandex.passport.internal.e C = aVar.C();
        com.yandex.passport.internal.e eVar = C != null ? new com.yandex.passport.internal.e(C.a, C.b, C.c, C.d, C.e, C.f) : null;
        z1 T = aVar.T();
        z1 D = T != null ? com.yandex.passport.internal.ui.a.D(T) : null;
        boolean l = aVar.l();
        boolean J = aVar.J();
        w1 W = aVar.W();
        String m = aVar.m();
        f0 X = aVar.X();
        X.getClass();
        z1 d = X.d();
        f0 f0Var = new f0(d != null ? com.yandex.passport.internal.ui.a.D(d) : null, X.getMessage());
        k0 A = com.yandex.plus.core.locale.b.A(aVar.j());
        com.yandex.passport.internal.properties.h k = aVar.k();
        com.yandex.passport.internal.properties.h M = k != null ? com.yandex.plus.core.network.api.utils.a.M(k) : null;
        String e = aVar.e();
        Map h = aVar.h();
        v n = aVar.n();
        v vVar = n != null ? new v(n) : null;
        m0 O = aVar.O();
        return new l(f, false, null, s, theme, eVar, D, l, J, W, m, false, null, f0Var, A, M, e, h, vVar, O != null ? com.yandex.plus.core.network.api.utils.a.N(O) : null, aVar.i(), aVar.o(), aVar.d(), aVar.Q(), aVar.g(), aVar.p(), aVar.I(), 201340934);
    }

    public static final Context u() {
        Application application;
        Context context = a;
        if (context != null) {
            return context;
        }
        try {
            Object invoke = Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            invoke.getClass();
            application = (Application) invoke;
        } catch (Throwable th) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error getting appCtx from reflection", th);
            }
            application = null;
        }
        if (application != null) {
            a = application;
            return application;
        }
        xq0.q("Unable to get appCtx");
        return null;
    }

    public static Bundle v(Exception exc) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.KEY_EXCEPTION, exc);
        return bundle;
    }

    public static com.yandex.passport.internal.credentials.f w(com.yandex.passport.internal.properties.x xVar, com.yandex.passport.common.core.b bVar) {
        xVar.getClass();
        bVar.getClass();
        com.yandex.passport.internal.credentials.f fVar = (com.yandex.passport.internal.credentials.f) xVar.B.get(bVar);
        if (fVar != null) {
            return fVar;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return new com.yandex.passport.internal.credentials.f("ixnjS4SWsp6DD8fshySJ/ClWdh38gE/8EyyCvNaD+qEPmlANxFG2IvCpi9PDzl/E", "iU22SNiVvsrSCJG7hy2Or80ApPky0d92/7+fYSB60nZjmc18fduySNaiLpXlwdwk");
        }
        if (ordinal == 1) {
            return new com.yandex.passport.internal.credentials.f("0Bq1GdKTvs3bW5K4hyTZqKLDqiRQCxIOYPkslQWQTF+xkOoYmSo2leSvphu6RUu7", "jUy+StjEtZ7aCsfuhymO+zwotxbOaHjQps9n68SHQf/9qsHcz/t0nEVCGsXb5FCX");
        }
        if (ordinal == 2) {
            return new com.yandex.passport.internal.credentials.f("30iwH9LBts7aWsa+h3jW+Pw2Nhffr9+OKE6kZUd3myxUewFcIBLQ/nPv9h9McIAP", "3xG+HNSdvpjXXMe4h3/W+5IuRDGIssyuQYxU9exB1baFb1Y+JYPq4PI56ipR46e8");
        }
        if (ordinal == 3) {
            return new com.yandex.passport.internal.credentials.f("jR7jHtedspuBDcWwhyzXr+A3fH9NCkmIYIZDJhzdjkmVJOK45TpuMjtfPn/sK7Rj", "iU/iStTH5JjVXca5hyXZrRCSbGY5saNhDO+KLyv3DFmc3Lp/dhXLbW+/NPRoElOo");
        }
        if (ordinal == 4) {
            return new com.yandex.passport.internal.credentials.f("ixnjS4SWsp6DD8fshySJ/ClWdh38gE/8EyyCvNaD+qEPmlANxFG2IvCpi9PDzl/E", "iU22SNiVvsrSCJG7hy2Or80ApPky0d92/7+fYSB60nZjmc18fduySNaiLpXlwdwk");
        }
        kac.j(bVar, "Unknown environment ");
        return null;
    }

    public static final String x(String str, JSONObject jSONObject) {
        String string;
        jSONObject.getClass();
        if (!jSONObject.has(str) || jSONObject.isNull(str) || (string = jSONObject.getString(str)) == null || string.length() == 0) {
            return null;
        }
        return string;
    }

    public static boolean y(Context context, IReporterYandex iReporterYandex) {
        context.getClass();
        iReporterYandex.getClass();
        g gVar = new g(context, null, null);
        String packageName = context.getPackageName();
        packageName.getClass();
        d c = gVar.c(packageName, new e(iReporterYandex, 0));
        return (c == null || c.f == null) ? false : true;
    }

    public static final boolean z(com.yandex.passport.common.ui.a aVar, hq5 hq5Var) {
        aVar.getClass();
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(1192521027);
            oq5Var.p(false);
            return false;
        }
        if (ordinal == 1) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(1192551742);
            oq5Var2.p(false);
            return true;
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.Z(1839585378);
        boolean B = xv7.B(oq5Var3);
        oq5Var3.p(false);
        return B;
    }
}
