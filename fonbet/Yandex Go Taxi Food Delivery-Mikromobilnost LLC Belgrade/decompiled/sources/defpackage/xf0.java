package defpackage;

import android.text.Editable;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class xf0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf0 b;

    public /* synthetic */ xf0(yf0 yf0Var, int i) {
        this.a = i;
        this.b = yf0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        yf0 yf0Var = this.b;
        switch (i) {
            case 0:
                tf0 tf0Var = yf0Var.c;
                tf0Var.D = (Editable) obj;
                tf0Var.Mg();
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    tf0 tf0Var2 = yf0Var.c;
                    tf0Var2.B.n(tf0Var2.Lg().a, tf0Var2.x.c, SharedPaymentAnalytics$Button.NAME);
                    break;
                }
                break;
            case 2:
                tf0 tf0Var3 = yf0Var.c;
                tf0Var3.E = (Editable) obj;
                tf0Var3.Mg();
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    tf0 tf0Var4 = yf0Var.c;
                    tf0Var4.B.n(tf0Var4.Lg().a, tf0Var4.x.c, SharedPaymentAnalytics$Button.PHONE);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
