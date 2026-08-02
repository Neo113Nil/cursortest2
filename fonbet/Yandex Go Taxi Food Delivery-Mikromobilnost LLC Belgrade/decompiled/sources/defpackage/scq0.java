package defpackage;

import android.view.View;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.view.card.CvnInputViewImpl;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class scq0 extends rcq0 {
    public static final /* synthetic */ int Z = 0;
    public final CvnInputViewImpl V;
    public final /* synthetic */ xcq0 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scq0(xcq0 xcq0Var, View view, CvnInputViewImpl cvnInputViewImpl) {
        super(xcq0Var, view, 0);
        this.W = xcq0Var;
        this.V = cvnInputViewImpl;
        cvnInputViewImpl.setOnFocusChangeListener(new fwb(1));
        cvnInputViewImpl.setOnReadyListener(new a5p0(7, this, xcq0Var));
    }

    @Override // defpackage.rcq0
    public final void W(int i) {
        super.W(i);
        int i2 = X(i) ? 0 : 8;
        CvnInputViewImpl cvnInputViewImpl = this.V;
        cvnInputViewImpl.setVisibility(i2);
        boolean X = X(i);
        xcq0 xcq0Var = this.W;
        if (X) {
            ((y22) xcq0Var.x).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Показ поля ввода CVV", "input_shown_cvv"));
        }
        cvnInputViewImpl.setCardPaymentSystem(((PaymentMethod.Card) l7b1.a((vcq0) xcq0Var.y.get(i))).getSystem());
        boolean X2 = X(F());
        if (F() == -1 || !X2) {
            cvnInputViewImpl.reset();
        } else if (X2 && xcq0Var.z) {
            xcq0Var.z = false;
            cvnInputViewImpl.focusInput();
        }
    }
}
