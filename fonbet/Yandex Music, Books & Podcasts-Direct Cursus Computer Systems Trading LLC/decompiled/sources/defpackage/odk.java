package defpackage;

import android.os.Parcelable;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class odk extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ PaymentActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ odk(PaymentActivity paymentActivity, int i) {
        super(0);
        this.r = i;
        this.s = paymentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        PaymentActivity paymentActivity = this.s;
        switch (i) {
            case 0:
                int i2 = ddu.o;
                a6p a6pVar = new a6p(paymentActivity.l().c());
                jfu viewModelStore = paymentActivity.getViewModelStore();
                is6 defaultViewModelCreationExtras = paymentActivity.getDefaultViewModelCreationExtras();
                viewModelStore.getClass();
                defaultViewModelCreationExtras.getClass();
                bjt bjtVar = new bjt(viewModelStore, a6pVar, defaultViewModelCreationExtras);
                lm4 a = ern.a(u8q.class);
                String f = a.f();
                if (f != null) {
                    return (u8q) bjtVar.j(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
                }
                xq0.x("Local and anonymous classes can not be ViewModels");
                return null;
            case 1:
                return ((nhk) paymentActivity.D()).e;
            case 2:
                return ((nhk) paymentActivity.D()).f;
            default:
                p77 l = paymentActivity.l();
                Parcelable parcelableExtra = paymentActivity.getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN");
                parcelableExtra.getClass();
                return new q77(l.a, new j6e((ehk) parcelableExtra, (xwj) paymentActivity.getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.ORDER_INFO")));
        }
    }
}
