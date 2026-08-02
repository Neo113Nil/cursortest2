package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;

/* loaded from: classes4.dex */
public final class x03 implements View.OnTouchListener {
    public final GestureDetector a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ddu c;

    public x03(Context context) {
        context.getClass();
        this.a = new GestureDetector(context, new bf3(5, this));
    }

    public final void a() {
        switch (this.b) {
            case 0:
                BindCardActivity bindCardActivity = (BindCardActivity) this.c;
                ConstraintLayout constraintLayout = ((mhk) bindCardActivity.D()).e;
                constraintLayout.getClass();
                ddu.L(bindCardActivity, false, constraintLayout);
                break;
            case 1:
                PaymentActivity paymentActivity = (PaymentActivity) this.c;
                ConstraintLayout constraintLayout2 = ((nhk) paymentActivity.D()).g;
                constraintLayout2.getClass();
                ddu.L(paymentActivity, false, constraintLayout2);
                break;
            default:
                PreselectActivity preselectActivity = (PreselectActivity) this.c;
                ConstraintLayout constraintLayout3 = ((ohk) preselectActivity.D()).f;
                constraintLayout3.getClass();
                ddu.L(preselectActivity, false, constraintLayout3);
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getClass();
        motionEvent.getClass();
        return this.a.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x03(PaymentActivity paymentActivity, Context context) {
        this(context);
        this.b = 1;
        this.c = paymentActivity;
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x03(BindCardActivity bindCardActivity, Context context) {
        this(context);
        this.b = 0;
        this.c = bindCardActivity;
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x03(PreselectActivity preselectActivity, Context context) {
        this(context);
        this.b = 2;
        this.c = preselectActivity;
        context.getClass();
    }
}
