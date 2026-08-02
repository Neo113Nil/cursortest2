package defpackage;

import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.SurfaceView;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.semantics.f;
import com.yandex.plus.pay.ui.tarifficator.api.PlusTarifficatorPaymentConfiguration$PreferredMode;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.DeeplinkAllowedHosts;
import com.ybsdk.screens.initial.deeplink.a;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.g;
import java.util.Map;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.requirements.ui.selector.RequirementOptionsSelectWithHeaderView;

/* loaded from: classes3.dex */
public final /* synthetic */ class xz3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xz3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g render$lambda$38;
        stz0 renderToolbar$lambda$18;
        iii iiiVar;
        u8j0 t8j0Var;
        zy11 prepare$lambda$0;
        zii0 b;
        stz0 _init_$lambda$2;
        int i = this.a;
        boolean z = true;
        zy11 zy11Var = zy11.a;
        boolean z2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                render$lambda$38 = AutoTopupSetupFragment.render$lambda$38((fu3) obj2, z2, (g) obj);
                return render$lambda$38;
            case 1:
                sfd sfdVar = (sfd) obj2;
                sfdVar.a.h(z2);
                sfdVar.b.g(z2);
                return new se4((bfy) obj, sfdVar);
            case 2:
                tq01 tq01Var = (tq01) obj2;
                Object obj3 = tq01Var.b().get(ItemType.MIDDLE_NAME);
                vqj0 vqj0Var = obj3 instanceof vqj0 ? (vqj0) obj3 : null;
                if (vqj0Var != null) {
                    tq01Var = tq01Var.e(vqj0.c(vqj0Var, "", false, null, null, false, 32739));
                }
                Object obj4 = tq01Var.b().get(ItemType.MIDDLE_NAME_RADIO_BUTTON);
                wqj0 wqj0Var = obj4 instanceof wqj0 ? (wqj0) obj4 : null;
                return wqj0Var == null ? tq01Var : tq01Var.e(wqj0.c(wqj0Var, z2));
            case 3:
                renderToolbar$lambda$18 = CardActivationFragment.renderToolbar$lambda$18((Text) obj2, z2, (stz0) obj);
                return renderToolbar$lambda$18;
            case 4:
                ((isd) obj).X0(z2, (dw1) obj2);
                return zy11Var;
            case 5:
                a aVar = (a) obj2;
                Uri uri = (Uri) obj;
                if (!z2) {
                    b bVar = aVar.f;
                    bVar.getClass();
                    if (!kotlin.collections.a.G(((DeeplinkAllowedHosts) bVar.d(a0h.a).getData()).getHosts(), uri.getHost())) {
                        trp0 trp0Var = trp0.a;
                        trp0.e(new zqp0(uri.toString(), e6b1.e(uri).name()));
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                wti wtiVar = (wti) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wtiVar.e.a();
                wtiVar.c.a(booleanValue);
                if (booleanValue && !z2 && (iiiVar = wtiVar.d) != null) {
                    ((pep0) wtiVar.f).f(iiiVar, zy11Var, hxx.a);
                }
                return zy11Var;
            case 7:
                msl mslVar = (msl) obj;
                msl mslVar2 = (msl) ((com.ybsdk.feature.status.screen.internal.ui.a) obj2).X();
                if (z2) {
                    u8j0 u8j0Var = mslVar.d;
                    t8j0Var = u8j0Var != null ? u8j0Var.c() : new t8j0();
                } else {
                    t8j0Var = new t8j0();
                }
                return msl.a(mslVar2, t8j0Var, false, 55);
            case 8:
                return ((sjj0) obj2).a(z2);
            case 9:
                return new lkt((RequirementOptionsSelectWithHeaderView) obj, (gym) obj2, z2);
            case 10:
                u5t0 u5t0Var = (u5t0) obj2;
                ivr ivrVar = (ivr) obj;
                if (!z2 && ((FocusStateImpl) ivrVar).a() && u5t0Var != null) {
                    ((wqh) u5t0Var).b();
                }
                return zy11Var;
            case 11:
                d360 d360Var = (d360) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                if (z2) {
                    f.p(mnq0Var, 0);
                    StringBuilder sb = new StringBuilder();
                    CharSequence charSequence = d360Var.b;
                    if (charSequence != null) {
                        sb.append(charSequence);
                    }
                    CharSequence charSequence2 = d360Var.c;
                    if (charSequence2 != null) {
                        sb.append(Extension.FIX_SPACE);
                        sb.append(charSequence2);
                    }
                    f.l(mnq0Var, sb.toString());
                }
                return zy11Var;
            case 12:
                Map map = (Map) obj2;
                vnd0 vnd0Var = (vnd0) obj;
                vnd0Var.a = z2 ? PlusTarifficatorPaymentConfiguration$PreferredMode.SILENT : PlusTarifficatorPaymentConfiguration$PreferredMode.DEFAULT;
                if (map == null) {
                    map = kotlin.collections.b.f();
                }
                vnd0Var.b = map;
                return zy11Var;
            case 13:
                prepare$lambda$0 = PopupDialogModalView.prepare$lambda$0((PopupDialogModalView) obj2, z2, (sls) obj);
                return prepare$lambda$0;
            case 14:
                Rect rect = (Rect) obj2;
                qam qamVar = (qam) obj;
                if (z2) {
                    if (rect != null) {
                        b = (rect.width() <= 0 || rect.height() <= 0) ? keg0.b(qamVar.c(), qamVar) : new zii0(rect.left, rect.top, rect.right, rect.bottom);
                    } else {
                        b = keg0.b(qamVar.c(), qamVar);
                    }
                    float w0 = qamVar.w0(keg0.d);
                    float w02 = qamVar.w0(keg0.e);
                    qam.t0(qamVar, keg0.a, 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                    qam.g0(qamVar, ldc.l, b.e(), b.d(), (Float.floatToRawIntBits(w0) << 32) | (Float.floatToRawIntBits(w0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), null, 112);
                    float f = b.c;
                    float f2 = b.a;
                    float f3 = b.d;
                    float f4 = b.b;
                    float min = Math.min(f - f2, f3 - f4) * 0.2f;
                    jb2 a = nb2.a();
                    float f5 = f4 + w0;
                    float f6 = f5 + min;
                    Path path = a.a;
                    a.m(f2, f6);
                    a.l(f2, f5);
                    float f7 = 2.0f * w0;
                    float f8 = f2 + f7;
                    float f9 = f4 + f7;
                    if (a.b == null) {
                        a.b = new RectF();
                    }
                    a.b.set(f2, f4, f8, f9);
                    path.arcTo(a.b, 180.0f, 90.0f, false);
                    float f10 = f2 + w0;
                    float f11 = f10 + min;
                    a.l(f11, f4);
                    float f12 = f - w0;
                    float f13 = f12 - min;
                    a.m(f13, f4);
                    a.l(f12, f4);
                    float f14 = f - f7;
                    if (a.b == null) {
                        a.b = new RectF();
                    }
                    a.b.set(f14, f4, f, f9);
                    path.arcTo(a.b, -90.0f, 90.0f, false);
                    a.l(f, f6);
                    float f15 = f3 - w0;
                    float f16 = f15 - min;
                    a.m(f, f16);
                    a.l(f, f15);
                    float f17 = f3 - f7;
                    if (a.b == null) {
                        a.b = new RectF();
                    }
                    a.b.set(f14, f17, f, f3);
                    path.arcTo(a.b, 0.0f, 90.0f, false);
                    a.l(f13, f3);
                    a.m(f11, f3);
                    a.l(f10, f3);
                    if (a.b == null) {
                        a.b = new RectF();
                    }
                    a.b.set(f2, f17, f8, f3);
                    path.arcTo(a.b, 90.0f, 90.0f, false);
                    a.l(f2, f16);
                    qam.Y(qamVar, a, keg0.b, new jvu0(1, 0, 26, w02, 0.0f), 52);
                } else {
                    qam.t0(qamVar, keg0.a, 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                }
                return zy11Var;
            case 15:
                tls tlsVar = (tls) obj2;
                if (z2) {
                    tlsVar.invoke(udg0.a);
                }
                return zy11Var;
            case 16:
                _init_$lambda$2 = ToolbarView._init_$lambda$2((TypedArray) obj2, z2, (stz0) obj);
                return _init_$lambda$2;
            default:
                zxc0 zxc0Var = (zxc0) obj2;
                SurfaceView surfaceView = (SurfaceView) obj;
                if (zxc0Var != null) {
                    zxc0Var.setVideoSurfaceView(surfaceView);
                }
                if (z2) {
                    surfaceView.animate().alpha(1.0f).setDuration(100L).start();
                } else {
                    surfaceView.setAlpha(0.0f);
                }
                return zy11Var;
        }
    }

    public /* synthetic */ xz3(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
