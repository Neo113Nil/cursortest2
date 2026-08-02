package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class tx5 extends yx5 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final sls c;
    public final tls d;

    public tx5(z22 z22Var, haj hajVar, gaj gajVar) {
        this.b = z22Var;
        this.c = hajVar;
        this.d = gajVar;
    }

    @Override // defpackage.yx5
    public final void a(int i, CharSequence charSequence) {
        int i2 = this.a;
        sls slsVar = this.c;
        Object obj = this.b;
        switch (i2) {
            case 0:
                sv90 sv90Var = qv90.a;
                String obj2 = charSequence.toString();
                sv90Var.getClass();
                wj00 i3 = vfc.i(0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка формирования подписи: " + obj2 + ", error_code = " + i, CRLReasonCodeExtension.REASON, obj2);
                i3.j(i, "error_code");
                ((y22) ((rwo) obj)).a(y891.c("biometry_signature_error", i3));
                ((l95) slsVar).invoke();
                break;
            default:
                ((a) ((z22) obj)).a(new pz5(charSequence.toString(), i));
                ((haj) slsVar).invoke();
                break;
        }
    }

    @Override // defpackage.yx5
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qv90.a.getClass();
                ((y22) ((rwo) obj)).a(sv90.f("AuthenticationFailed"));
                break;
            default:
                ((a) ((z22) obj)).a(new oz5("AuthenticationFailed"));
                break;
        }
    }

    @Override // defpackage.yx5
    public final void c(zx5 zx5Var) {
        int i = this.a;
        tls tlsVar = this.d;
        switch (i) {
            case 0:
                ay5 ay5Var = zx5Var.a;
                if (ay5Var != null) {
                    ((q) tlsVar).invoke(ay5Var);
                    break;
                }
                break;
            default:
                ay5 ay5Var2 = zx5Var.a;
                if (ay5Var2 != null) {
                    ((gaj) tlsVar).invoke(ay5Var2);
                    break;
                }
                break;
        }
    }

    public tx5(rwo rwoVar, l95 l95Var, q qVar) {
        this.b = rwoVar;
        this.c = l95Var;
        this.d = qVar;
    }
}
