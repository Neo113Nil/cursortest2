package defpackage;

import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.models.Address;
import com.yandex.go.summary.navigation.e;
import com.yandex.go.taxi.summary.verticalsummary.router.d;
import com.yandex.payment.sdk.ui.view.EmailView;
import java.util.concurrent.ScheduledFuture;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class urm implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ urm(kdn kdnVar) {
        this.a = 23;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onFocusChanged$lambda$0;
        wj00 a;
        int i = this.a;
        boolean z = true;
        wj00 wj00Var = null;
        int i2 = 3;
        int i3 = 9;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                qwd qwdVar = yrm.a;
                return zy11Var;
            case 1:
                f.d((mnq0) obj);
                return zy11Var;
            case 2:
                f.n((mnq0) obj, 1);
                return zy11Var;
            case 3:
                lhd lhdVar = (lhd) obj;
                switch (lhdVar.a) {
                    case 0:
                        ((z880) ((e) lhdVar.b).g0.get()).a();
                        return zy11Var;
                    case 1:
                        pw1 pw1Var = (pw1) lhdVar.b;
                        pw1Var.r(new qu(i3));
                        ((ogu0) pw1Var.E).invoke();
                        return zy11Var;
                    case 2:
                        rwo0 rwo0Var = (rwo0) lhdVar.b;
                        rwo0Var.r(new qu(i3));
                        ((rk6) rwo0Var.F).invoke();
                        return zy11Var;
                    case 3:
                        yn5 yn5Var = (yn5) lhdVar.b;
                        yn5Var.r(new qu(i3));
                        ((n7l0) yn5Var.F).invoke();
                        return zy11Var;
                    case 4:
                        uva uvaVar = (uva) lhdVar.b;
                        uvaVar.r(new qu(i3));
                        ((gas0) uvaVar.F).invoke();
                        return zy11Var;
                    case 5:
                        rwo0 rwo0Var2 = (rwo0) lhdVar.b;
                        rwo0Var2.r(new qu(i3));
                        ((pv01) rwo0Var2.F).invoke();
                        return zy11Var;
                    default:
                        ((d) lhdVar.b).P.a();
                        return zy11Var;
                }
            case 4:
                f.d((mnq0) obj);
                return zy11Var;
            case 5:
                return ((te7) obj).c;
            case 6:
                return ((zzs) obj).toString();
            case 7:
                return ((Address) obj).D1();
            case 8:
                ((q1n) obj).a.r(new urm(i3));
                return zy11Var;
            case 9:
                ovm ovmVar = (ovm) obj;
                switch (ovmVar.a) {
                    case 0:
                        ((pvm) ovmVar.b).r(new urm(i2));
                    default:
                        return zy11Var;
                }
            case 10:
                return ((b5n) obj).a;
            case 11:
                return ((b5n) obj).a;
            case 12:
                return ((b5n) obj).a;
            case 13:
                return ((b5n) obj).a;
            case 14:
                return ((b5n) obj).a;
            case 15:
                f.d((mnq0) obj);
                return zy11Var;
            case 16:
                return zy11Var;
            case 17:
                return an91.o((f530) obj, 0.0f, 8.0f, 0.0f, 16.0f, 5);
            case 18:
                return new i(k.e(null, 3), k.f(null, 3));
            case 19:
                ((t7n) obj).u();
                return zy11Var;
            case 20:
                ((t7n) obj).a();
                return zy11Var;
            case 21:
                ((t7n) obj).u();
                return zy11Var;
            case 22:
                c1y c1yVar = (c1y) obj;
                k28 k28Var = c1yVar.a;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (k28Var.c() >> 32))) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(Float.intBitsToFloat((int) (k28Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f));
                i28 q = k28Var.b.q();
                Canvas canvas = t72.a;
                Canvas canvas2 = ((s72) q).a;
                int saveLayer = canvas2.saveLayer(null, null);
                c1yVar.a();
                float w0 = c1yVar.w0(9.0f);
                long j = ldc.m;
                qam.z(c1yVar, j, w0, floatToRawIntBits, 0.0f, null, 7, 56);
                qam.z(c1yVar, j, c1yVar.w0(9.0f), floatToRawIntBits2, 0.0f, null, 7, 56);
                canvas2.restoreToCount(saveLayer);
                return zy11Var;
            case 23:
                return kdn.a((lea0) obj);
            case 24:
                ScheduledFuture scheduledFuture = (ScheduledFuture) obj;
                if (!scheduledFuture.isDone() && !scheduledFuture.isCancelled()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                srn srnVar = (srn) obj;
                switch (srnVar.a) {
                    case 0:
                        ((sls) srnVar.b).invoke();
                        return zy11Var;
                    default:
                        ((ivl0) srnVar.b).invoke(Boolean.TRUE);
                        return zy11Var;
                }
            case 26:
                onFocusChanged$lambda$0 = EmailView.onFocusChanged$lambda$0(((Boolean) obj).booleanValue());
                return onFocusChanged$lambda$0;
            case 27:
                return new pbv((String) obj, (ccv) null, rev.p, (dcv) null, (vfv) null, 58);
            case 28:
                wj00 b = ((y3x) obj).b();
                String p = b.p("payment_method");
                y3x d = b.d("payload");
                if (d != null && (a = d.a()) != null) {
                    wj00Var = a;
                }
                return new kyn(p, wj00Var);
            default:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.c(listItemComponent, 3);
                return listItemComponent;
        }
    }

    public /* synthetic */ urm(int i) {
        this.a = i;
    }
}
