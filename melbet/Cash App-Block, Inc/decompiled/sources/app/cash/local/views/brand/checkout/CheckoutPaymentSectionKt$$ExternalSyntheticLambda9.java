package app.cash.local.views.brand.checkout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class CheckoutPaymentSectionKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ CheckoutPaymentSectionKt$$ExternalSyntheticLambda9(String str, String str2, boolean z, Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = z;
        this.f$3 = function0;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.PaymentMethodHeader(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AfterpayCardKt.SecondaryLabelRow(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
