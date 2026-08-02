package defpackage;

import com.yandex.go.chargers.misc.authorization.ChargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$2;
import com.yandex.go.chargers.misc.authorization.ChargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3;
import com.yandex.go.drive.delegates.UnknownAuthFailureException;
import com.yandex.go.drive.delegates.a;
import com.yandex.go.scooters.domain.ScootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$2;
import com.yandex.go.scooters.domain.ScootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3;
import com.yandex.go.yb.domain.c;
import kotlin.Result;
import ru.yandex.taxi.am.AuthCancellationException;
import ru.yandex.taxi.scooters.domain.model.ScootersAuthorizationException;

/* loaded from: classes12.dex */
public final class un9 implements nk3 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ un9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.nk3
    public final void b(Throwable th) {
        int i = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ChargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3 chargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3 = (ChargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3) obj;
                if (th == null) {
                    th = new RuntimeException("Attempt to login is failed");
                }
                chargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3.invoke(th);
                break;
            case 1:
                j18 j18Var = (j18) obj;
                if (!(j18Var.t() instanceof a28)) {
                    if (!(th instanceof AuthCancellationException)) {
                        jst.e.h(null, "Fail to auth portal account for drive", th);
                        if (th == null) {
                            th = new UnknownAuthFailureException();
                        }
                        j18Var.resumeWith(new Result.Failure(th));
                        break;
                    } else {
                        j18Var.b(null);
                        break;
                    }
                }
                break;
            case 2:
                ((c) this.c).x.b();
                lg51 lg51Var = (lg51) obj;
                if (th == null) {
                    th = new Exception("unknown error");
                }
                lg51Var.d(th);
                break;
            default:
                ScootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3 scootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3 = (ScootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3) obj;
                if (!(th instanceof AuthCancellationException)) {
                    scootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3.invoke(new ScootersAuthorizationException());
                    break;
                } else {
                    scootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$3.invoke(th);
                    break;
                }
        }
    }

    @Override // defpackage.nk3
    public final void onSuccess() {
        int i = this.b;
        Object obj = this.d;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ChargersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$2) obj2).invoke(zy11Var);
                break;
            case 1:
                j18 j18Var = (j18) obj;
                ((a) obj2).b(new uem(j18Var, 0), new si3(j18Var, 4));
                break;
            case 2:
                ((c) obj2).x.b();
                ((lg51) obj).f();
                break;
            default:
                ((ScootersAuthorizationInteractor$authIfNeeded$$inlined$suspendCallbackApi$2) obj2).invoke(zy11Var);
                break;
        }
    }
}
