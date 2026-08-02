package defpackage;

import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.NetworkServiceError;
import io.appmetrica.analytics.rtm.internal.Constants;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class vhj implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rwo b;

    public /* synthetic */ vhj(rwo rwoVar, int i) {
        this.a = i;
        this.b = rwoVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        rwo rwoVar = this.b;
        switch (i) {
            case 0:
                tyj0 tyj0Var = (tyj0) obj;
                YSError ySError = tyj0Var.b;
                if (tyj0Var.b()) {
                    sv90 sv90Var = qv90.a;
                    c.b(ySError);
                    String message = ySError.getMessage();
                    sv90Var.getClass();
                    ((y22) rwoVar).a(y891.c("error_while_polling", vfc.i(0, Constants.KEY_MESSAGE, message, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Ошибка при поллинге дайхарда: ".concat(message))));
                }
                if (!tyj0Var.c()) {
                    c.b(ySError);
                    if (!(ySError instanceof NetworkServiceError) || !((NetworkServiceError) ySError).i()) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                tyj0 b = new qdh().b((y3x) obj);
                if (!b.c()) {
                    if (b.b()) {
                        sv90 sv90Var2 = qv90.a;
                        YSError ySError2 = b.b;
                        c.b(ySError2);
                        String message2 = ySError2.getMessage();
                        sv90Var2.getClass();
                        ((y22) rwoVar).a(y891.c("serialize_error", vfc.i(0, CRLReasonCodeExtension.REASON, message2, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Не получилось преобразовать пейлоад в json")));
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                try {
                    break;
                } catch (Exception e) {
                    sv90 sv90Var3 = qv90.a;
                    String message3 = e.getMessage();
                    if (message3 == null) {
                        message3 = e.toString();
                    }
                    sv90Var3.getClass();
                    wj00 wj00Var = new wj00(0);
                    wj00Var.k(CRLReasonCodeExtension.REASON, message3);
                    wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Не получилось распарсить пейлоад из json");
                    ((y22) rwoVar).a(y891.c("deserialize_error", wj00Var));
                    return null;
                }
        }
        return null;
    }
}
