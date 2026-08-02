package ru.yandex.tankerapp.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import defpackage.ba20;
import defpackage.csa0;
import defpackage.da20;
import defpackage.e3a0;
import defpackage.hay;
import defpackage.hcx;
import defpackage.jqr;
import defpackage.k3a0;
import defpackage.ksi0;
import defpackage.l40;
import defpackage.ma91;
import defpackage.n3a0;
import defpackage.nzc0;
import defpackage.o3a0;
import defpackage.pzt0;
import defpackage.r3a0;
import defpackage.tls;
import defpackage.wrr;
import java.util.Map;
import kotlin.Result;
import kotlinx.coroutines.flow.e;
import ru.yandex.tankerapp.domain.error.PaymentKitPluginError;
import ru.yandex.tankerapp.models.dto.PaymentKitConfiguration;
import ru.yandex.tankerapp.models.results.PaymentKitBindCardResult;
import ru.yandex.tankerapp.models.results.PaymentKitChallengeResult;
import ru.yandex.tankerapp.models.results.PaymentKitDataResult;
import ru.yandex.tankerapp.models.results.PaymentKitPaymentResult;
import ru.yandex.tankerapp.models.results.PaymentKitResult;
import ru.yandex.tankerapp.models.results.PaymentKitSelectMethodResult;
import ru.yandex.tankerapp.models.results.PaymentKitStatusResult;

/* loaded from: classes5.dex */
public final class b implements nzc0 {
    public boolean A;
    public pzt0 B;
    public l40 C;
    public da20 D;
    public final Context a;
    public final csa0 b;
    public final r3a0 c;
    public final e3a0 w;
    public final k3a0 x;
    public String y;
    public ksi0 z;

    public b(Context context, csa0 csa0Var) {
        r3a0 r3a0Var = new r3a0();
        this.a = context;
        this.b = csa0Var;
        this.c = r3a0Var;
        this.w = e3a0.a;
        this.x = k3a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, ba20 ba20Var) {
        Result.Failure failure;
        Object obj2;
        Object failure2;
        this.x.getClass();
        Object a = k3a0.a(obj);
        if (a instanceof Result.Failure) {
            a = null;
        }
        String str = (String) a;
        if (str != null) {
            try {
                obj2 = (PaymentKitConfiguration) hcx.a().c(PaymentKitConfiguration.class, str);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (!(obj2 instanceof Result.Failure)) {
                PaymentKitConfiguration paymentKitConfiguration = (PaymentKitConfiguration) obj2;
                try {
                    e3a0 e3a0Var = this.w;
                    Context context = this.a;
                    e3a0Var.getClass();
                    failure2 = e3a0.a(context, paymentKitConfiguration);
                } catch (Throwable th2) {
                    failure2 = new Result.Failure(th2);
                }
                if (!(failure2 instanceof Result.Failure)) {
                    e.H(this.c.a, new jqr(ru.yandex.tankerapp.utils.a.a(o3a0.g), new PaymentKitManagerImpl$observeSbpBankSelected$1(this, null), 3));
                    this.z = (ksi0) failure2;
                    ba20Var.success(null);
                }
                if (Result.a(failure2) != null) {
                    hay.e(ba20Var, PaymentKitPluginError.EmptyArgumentsError.a);
                }
            }
            if (Result.a(obj2) == null) {
                hay.e(ba20Var, PaymentKitPluginError.ParseArgumentsError.a);
                return;
            }
            return;
        }
        failure = new Result.Failure(PaymentKitPluginError.InvalidArgumentsError.a);
        obj2 = failure;
        if (!(obj2 instanceof Result.Failure)) {
        }
        if (Result.a(obj2) == null) {
        }
    }

    public final void b(ba20 ba20Var, tls tlsVar) {
        ksi0 ksi0Var = this.z;
        if (ksi0Var != null) {
            tlsVar.invoke(ksi0Var);
        } else {
            hay.e(ba20Var, PaymentKitPluginError.UninitializedError.a);
        }
    }

    public final void c(Map map) {
        da20 da20Var = this.D;
        if (da20Var != null) {
            da20Var.success(map);
        }
        this.D = null;
    }

    public final void d(l40 l40Var) {
        l40 l40Var2 = this.C;
        if (l40Var2 != null) {
            ((wrr) l40Var2).k(this);
        }
        this.C = l40Var;
        if (l40Var != null) {
            ((wrr) l40Var).a(this);
        }
    }

    public final void e(Intent intent, int i, da20 da20Var) {
        Activity activity;
        l40 l40Var = this.C;
        if (l40Var == null || (activity = (Activity) ((wrr) l40Var).b) == null) {
            hay.e(da20Var, PaymentKitPluginError.NoActivityError.a);
        } else {
            if (this.A) {
                hay.e(da20Var, PaymentKitPluginError.ActivityAlreadyStartedError.a);
                return;
            }
            this.D = da20Var;
            this.A = true;
            activity.startActivityForResult(intent, i);
        }
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        this.A = false;
        k3a0 k3a0Var = this.x;
        switch (i) {
            case 1001:
                PaymentKitError paymentKitError = intent != null ? (PaymentKitError) intent.getParcelableExtra("ERROR") : null;
                PaymentKitPaymentResult paymentKitPaymentResult = new PaymentKitPaymentResult(i2 == -1 ? PaymentKitStatusResult.Success : paymentKitError != null ? PaymentKitStatusResult.Failure : PaymentKitStatusResult.Cancel, paymentKitError, this.y);
                k3a0Var.getClass();
                c(k3a0.b(paymentKitPaymentResult));
                return true;
            case 1002:
                PaymentKitError paymentKitError2 = intent != null ? (PaymentKitError) intent.getParcelableExtra("ERROR") : null;
                PaymentKitResult paymentKitResult = new PaymentKitResult(i2 == -1 ? PaymentKitStatusResult.Success : paymentKitError2 != null ? PaymentKitStatusResult.Failure : PaymentKitStatusResult.Cancel, paymentKitError2);
                k3a0Var.getClass();
                c(k3a0.b(paymentKitResult));
                return true;
            case 1003:
                PaymentKitDataResult b = ma91.b(intent);
                PaymentKitStatusResult status = b.getStatus();
                PaymentKitError error = b.getError();
                BoundCard boundCard = (BoundCard) b.getData();
                PaymentKitBindCardResult paymentKitBindCardResult = new PaymentKitBindCardResult(boundCard != null ? boundCard.getCardId() : null, status, error);
                k3a0Var.getClass();
                c(k3a0.b(paymentKitBindCardResult));
                return true;
            case 1004:
                pzt0 pzt0Var = this.B;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                PaymentKitError paymentKitError3 = intent != null ? (PaymentKitError) intent.getParcelableExtra("ERROR") : null;
                PaymentKitResult paymentKitResult2 = new PaymentKitResult(i2 == -1 ? PaymentKitStatusResult.Success : paymentKitError3 != null ? PaymentKitStatusResult.Failure : PaymentKitStatusResult.Cancel, paymentKitError3);
                k3a0Var.getClass();
                c(k3a0.b(paymentKitResult2));
                return true;
            case 1005:
                PaymentKitDataResult b2 = ma91.b(intent);
                PaymentKitStatusResult status2 = b2.getStatus();
                PaymentKitError error2 = b2.getError();
                PaymentMethod paymentMethod = (PaymentMethod) b2.getData();
                PaymentKitSelectMethodResult paymentKitSelectMethodResult = new PaymentKitSelectMethodResult(status2, error2, paymentMethod != null ? n3a0.a(paymentMethod) : null);
                k3a0Var.getClass();
                c(k3a0.b(paymentKitSelectMethodResult));
                return true;
            case 1006:
                PaymentKitError paymentKitError4 = intent != null ? (PaymentKitError) intent.getParcelableExtra("ERROR") : null;
                PaymentKitChallengeResult paymentKitChallengeResult = new PaymentKitChallengeResult(i2 == -1 ? PaymentKitStatusResult.Success : paymentKitError4 != null ? PaymentKitStatusResult.Failure : PaymentKitStatusResult.Cancel, paymentKitError4);
                k3a0Var.getClass();
                c(k3a0.b(paymentKitChallengeResult));
                return true;
            default:
                this.D = null;
                return false;
        }
    }
}
