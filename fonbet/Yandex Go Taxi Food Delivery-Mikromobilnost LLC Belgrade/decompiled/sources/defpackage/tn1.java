package defpackage;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.about.internal.presentation.a;
import com.ybsdk.feature.about.internal.presentation.b;
import com.ybsdk.feature.autotopup.internal.presentation.instruction.AutoTopupInstructionFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import ru.yandex.taxi.address.c;
import ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalView;
import ru.yandex.taxi.widget.ButtonsView;

/* loaded from: classes5.dex */
public final /* synthetic */ class tn1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tn1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 verticalsView$lambda$0;
        zy11 createButton$lambda$0;
        boolean h;
        zy11 onCreate$lambda$2;
        zy11 onCreate$lambda$22;
        zy11 onCreate$lambda$5;
        zy11 onCreate$lambda$52;
        int i = this.a;
        c530 c530Var = c530.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                m3u0 m3u0Var = (m3u0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    oeb1.c(btsVar, m4m0.b(ljs0.q(tra1.b(an91.o(c530.a, 0.0f, 0.0f, 1.0f, 0.0f, 11), ((Number) m3u0Var.getValue()).floatValue()), 1.0f).k(ljs0.b), ((el51) btsVar.m(gl51.a)).n(), qke.q));
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                a.c((b) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                e6 e6Var = (e6) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    jeb1.f(e6Var.a, an91.o(c530.a, 64.0f, 16.0f, 64.0f, 0.0f, 8), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 432, 0, 16248);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                mh0 mh0Var = (mh0) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    vh0 vh0Var = mh0Var.h;
                    String str = vh0Var != null ? vh0Var.a : null;
                    if (str == null) {
                        btsVar3.e0(720619352);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(720619353);
                        jeb1.f(str, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 0, 0, 16382);
                        btsVar3.t(false);
                    }
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 4:
                qh0 qh0Var = (qh0) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    vh0 vh0Var2 = qh0Var.d;
                    String str2 = vh0Var2 != null ? vh0Var2.a : null;
                    if (str2 == null) {
                        btsVar4.e0(-547467451);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-547467450);
                        jeb1.f(str2, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).g.b, btsVar4, 0, 0, 16382);
                        btsVar4.t(false);
                    }
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 5:
                k7k0 k7k0Var = (k7k0) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    jeb1.f(k7k0Var.a, null, AppColor$Palette.TextMinor, uh6.E(13), 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar5, 3456, 0, 32754);
                    oeb1.c(btsVar5, ljs0.e(c530Var, 1.0f));
                    l9e.c(k7k0Var.b, AppColor$Palette.Text, btsVar5, 48);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 6:
                j7k0 j7k0Var = (j7k0) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    l9e.c(j7k0Var.a, AppColor$Palette.Error, btsVar6, 48);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 7:
                hw0 hw0Var = (hw0) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ymb1.e(hw0Var.c, an91.o(c530.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), ((el51) btsVar7.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar7, 48, 0, 65528);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 8:
                ow0 ow0Var = (ow0) obj2;
                ((z5s) ((h0w) ((lw0) obj3).e).c).a(ow0Var.b, new y41(ow0Var.a, (String) obj));
                return zy11Var;
            case 9:
                ix0 ix0Var = (ix0) obj3;
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    ov0 ov0Var = ix0Var.a;
                    sya1.a(ov0Var.d, null, null, ov0Var.b, btsVar8, 0, 6);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 10:
                ((iy0) ((c) obj3).Dg()).onPositionMapToCurrentLocation((mo21) obj, ((Boolean) obj2).booleanValue());
                return zy11Var;
            case 11:
                x61 x61Var = (x61) obj3;
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Object Q = btsVar9.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar9.o0(Q);
                    }
                    f530 a = fnq0.a(c530Var, (tls) Q);
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar9, 0);
                    int hashCode = Long.hashCode(btsVar9.T);
                    r1b0 o = btsVar9.o();
                    f530 d = androidx.compose.ui.b.d(btsVar9, a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar9.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar9.i0();
                    if (btsVar9.S) {
                        btsVar9.n(slsVar);
                    } else {
                        btsVar9.r0();
                    }
                    qje.W(btsVar9, d.f, a2);
                    qje.W(btsVar9, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar9.S || !jl40.l(btsVar9.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar9, hashCode, wlsVar);
                    }
                    qje.W(btsVar9, d.d, d);
                    if (x61Var.e) {
                        btsVar9.e0(-1848689162);
                        zgb1.a(x61Var.d, null, 8388611, false, null, null, false, null, btsVar9, 384, 250);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-1848590179);
                        btsVar9.t(false);
                    }
                    String str3 = x61Var.c;
                    if (str3 == null) {
                        btsVar9.e0(-1848550376);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-1848550375);
                        cib1.d(str3, null, x61Var.f, null, 1, 2, btsVar9, 221184, 10);
                        btsVar9.t(false);
                    }
                    if (x61Var.e) {
                        btsVar9.e0(-1848152707);
                        btsVar9.t(false);
                    } else {
                        btsVar9.e0(-1848251690);
                        zgb1.a(x61Var.d, null, 8388611, false, null, null, false, null, btsVar9, 384, 250);
                        btsVar9.t(false);
                    }
                    btsVar9.t(true);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
            case 12:
                verticalsView$lambda$0 = AltSelectModalView.verticalsView$lambda$0((AltSelectModalView) obj3, ((Integer) obj).intValue(), (ob31) obj2);
                return verticalsView$lambda$0;
            case 13:
                createButton$lambda$0 = AlternativeSourceModalView.createButton$lambda$0((AlternativeSourceModalView) obj3, (nqs0) obj, (wrs0) obj2);
                return createButton$lambda$0;
            case 14:
                zii0 h2 = fia1.h((RectF) obj);
                zii0 h3 = fia1.h((RectF) obj2);
                switch (((s2u0) obj3).a) {
                    case 11:
                        h = h2.h(h3);
                        break;
                    default:
                        h = h3.a(h2.c());
                        break;
                }
                return Boolean.valueOf(h);
            case 15:
                ((Integer) obj2).getClass();
                ua3.a((ru.yandex.taxi.logistics.sdk.ui.component.icon.b) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 16:
                onCreate$lambda$2 = AutoTopupInstructionFragment.onCreate$lambda$2((AutoTopupInstructionFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$2;
            case 17:
                onCreate$lambda$22 = AutoTopupRegularFragment.onCreate$lambda$2((AutoTopupRegularFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$22;
            case 18:
                onCreate$lambda$5 = AutoTopupSetupFragment.onCreate$lambda$5((AutoTopupSetupFragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$5;
            case 19:
                onCreate$lambda$52 = AutoTopupSetupV2Fragment.onCreate$lambda$5((AutoTopupSetupV2Fragment) obj3, (String) obj, (Bundle) obj2);
                return onCreate$lambda$52;
            case 20:
                xr4 xr4Var = (xr4) obj3;
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (btsVar10.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    xr4Var.a(new rr4(null, null), btsVar10, 6);
                } else {
                    btsVar10.Y();
                }
                return zy11Var;
            case 21:
                Long l = (Long) obj;
                l.getClass();
                ((com.yandex.messaging.internal.view.timeline.c) obj3).m0((String) obj2, l);
                return zy11Var;
            case 22:
                Long l2 = (Long) obj2;
                if (alq0.a((zkq0) obj3, l2.longValue())) {
                    return l2;
                }
                return null;
            case 23:
                ((Integer) obj2).getClass();
                jp5.c((jh00) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ((com.ybsdk.feature.pin.internal.domain.biometric.a) obj3).c.g.a.a("biometric.authentication_callback", x4e.t(2, AuthSdkActivity.RESPONSE_TYPE_CODE, String.valueOf(((Integer) obj).intValue()), Constants.KEY_MESSAGE, (String) obj2));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                oab1.a((wg6) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                acb1.a((qt6) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                txc txcVar = (txc) obj3;
                View inflate = ((LayoutInflater) obj).inflate(zrh0.popup_modal_buttons_item, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new u57(new jy20((ButtonsView) inflate, i2), txcVar);
                }
                ny61.t("rootView");
                return null;
            case 28:
                txc txcVar2 = (txc) obj3;
                View inflate2 = ((LayoutInflater) obj).inflate(zkh0.modal_default_buttons_item, (ViewGroup) obj2, false);
                if (inflate2 != null) {
                    return new y57(new jy20((ButtonsView) inflate2, r7 ? 1 : 0), txcVar2);
                }
                ny61.t("rootView");
                return null;
            default:
                ((dr7) obj3).r(new kx7((List) obj, (String) obj2, i2));
                return zy11Var;
        }
    }

    public /* synthetic */ tn1(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
