package defpackage;

import android.view.View;
import com.yandex.go.payments.cards.ui.ConfirmPaymentMethodViewImpl;
import java.util.function.Supplier;

/* loaded from: classes13.dex */
public final /* synthetic */ class s3e implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmPaymentMethodViewImpl b;

    public /* synthetic */ s3e(ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl, int i) {
        this.a = i;
        this.b = confirmPaymentMethodViewImpl;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        View findFocus;
        View findFocus2;
        int i = this.a;
        ConfirmPaymentMethodViewImpl confirmPaymentMethodViewImpl = this.b;
        switch (i) {
            case 0:
                findFocus = confirmPaymentMethodViewImpl.findFocus();
                return findFocus;
            default:
                findFocus2 = confirmPaymentMethodViewImpl.findFocus();
                return findFocus2;
        }
    }
}
