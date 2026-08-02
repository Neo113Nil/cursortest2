package defpackage;

import android.location.Location;
import com.yandex.go.captcha.api.AuthChallengeResult;
import com.yandex.go.scooters.insurance.model.ScootersDisableInsuranceResult;
import com.yandex.messaging.core.net.entities.proto.ErrorInfo;
import com.yandex.messaging.core.net.entities.proto.WhoamiResponse;
import com.yandex.messaging.internal.authorized.sync.WhoamiLoader$WhoamiException;
import defpackage.oyr;
import java.util.List;
import kotlin.Result;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.network.api.AuthChallengeCheckResult;
import ru.yandex.taxi.network.api.RedirectCheckResult;

/* loaded from: classes15.dex */
public final class si3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j18 b;

    public /* synthetic */ si3(j18 j18Var, int i) {
        this.a = i;
        this.b = j18Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        AuthChallengeCheckResult authChallengeCheckResult;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        j18 j18Var = this.b;
        switch (i) {
            case 0:
                int i2 = ri3.a[((AuthChallengeResult) obj).ordinal()];
                if (i2 == 1) {
                    authChallengeCheckResult = AuthChallengeCheckResult.Success;
                } else if (i2 == 2) {
                    authChallengeCheckResult = AuthChallengeCheckResult.Dismissed;
                } else if (i2 != 3) {
                    w511.b();
                    break;
                } else {
                    authChallengeCheckResult = AuthChallengeCheckResult.AlreadyDone;
                }
                j18Var.resumeWith(authChallengeCheckResult);
                break;
            case 1:
                j18Var.resumeWith(((Boolean) obj).booleanValue() ? RedirectCheckResult.Success : RedirectCheckResult.Dismissed);
                break;
            case 2:
                j18Var.resumeWith(obj);
                break;
            case 3:
                TaxiMapView taxiMapView = (TaxiMapView) obj;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(taxiMapView);
                    break;
                }
                break;
            case 4:
                ucm ucmVar = (ucm) obj;
                if (!(j18Var.t() instanceof a28)) {
                    j18Var.resumeWith(ucmVar);
                    break;
                }
                break;
            case 5:
                Location location = (Location) obj;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(location);
                    break;
                }
                break;
            case 6:
                Location location2 = (Location) obj;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(location2);
                    break;
                }
                break;
            case 7:
                j18Var.resumeWith((List) obj);
                break;
            case 8:
                j18Var.resumeWith((a0l0) obj);
                break;
            case 9:
                j18Var.resumeWith((Location) obj);
                break;
            case 10:
                j18Var.resumeWith(null);
                break;
            case 11:
                j18Var.resumeWith(Boolean.valueOf(!(((Result) obj).getValue() instanceof Result.Failure)));
                break;
            case 12:
                j18Var.resumeWith((ScootersDisableInsuranceResult) obj);
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                j18Var.resumeWith(bool);
                break;
            case 14:
                j18Var.resumeWith((m6a0) obj);
                break;
            case 15:
                j18Var.resumeWith(zy11Var);
                break;
            case 16:
                j18Var.resumeWith(zy11Var);
                break;
            case 17:
                WhoamiResponse whoamiResponse = (WhoamiResponse) obj;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(whoamiResponse);
                    break;
                }
                break;
            case 18:
                WhoamiResponse whoamiResponse2 = (WhoamiResponse) obj;
                if (j18Var.t() instanceof mf60) {
                    ErrorInfo errorInfo = whoamiResponse2.errorInfo;
                    final String message = errorInfo != null ? errorInfo.getMessage() : null;
                    if (message == null) {
                        message = "";
                    }
                    if (!c051.d.contains(message)) {
                        j18Var.resumeWith(new Result.Failure(new WhoamiLoader$WhoamiException(oyr.i(whoamiResponse2.getStatus(), "whoami failed with status "))));
                        break;
                    } else {
                        j18Var.resumeWith(new Result.Failure(new Exception(message) { // from class: com.yandex.messaging.internal.authorized.sync.WhoamiLoader$ForbiddenException
                            private final String code;

                            {
                                super(oyr.p("whoami forbidden with code '", message, "'"));
                                this.code = message;
                            }
                        }));
                        break;
                    }
                }
                break;
            default:
                j18Var.resumeWith(zy11Var);
                break;
        }
        return zy11Var;
    }
}
