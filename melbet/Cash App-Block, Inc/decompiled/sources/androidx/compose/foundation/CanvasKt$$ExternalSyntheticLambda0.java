package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.earningstracker.views.NetEarningsInfoSheetViewKt;
import com.squareup.cash.merchant.views.MerchantProfileViewKt;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.profile.views.personal.RatePlanSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class CanvasKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CanvasKt$$ExternalSyntheticLambda0(Modifier modifier, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = function1;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                num.intValue();
                CanvasKt.Canvas(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            case 1:
                num.getClass();
                BitcoinInvoiceEntryViewKt.BitcoinDisplayCurrencySymbolInfoView(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            case 2:
                num.getClass();
                AmountBlockerViewKt.ArcadeFilesetUploadLoadingDialog(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            case 3:
                num.getClass();
                NetEarningsInfoSheetViewKt.NetEarningsInfoSheet(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            case 4:
                num.getClass();
                MerchantProfileViewKt.MerchantProfileFailed(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            case 5:
                num.getClass();
                QuickPayViewKt.ContactSync(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
            default:
                num.getClass();
                RatePlanSectionKt.PersonalInfoConfirmation(Updater.updateChangedFlags(this.f$2 | 1), composer, this.f$0, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CanvasKt$$ExternalSyntheticLambda0(Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = function1;
        this.f$0 = modifier;
        this.f$2 = i;
    }
}
