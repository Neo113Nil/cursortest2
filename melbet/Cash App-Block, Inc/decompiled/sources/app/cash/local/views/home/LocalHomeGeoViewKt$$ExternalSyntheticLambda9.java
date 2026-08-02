package app.cash.local.views.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.family.safetyhub.views.MultiColorPageTitleKt;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.stripe.android.financialconnections.features.consent.ui.ConsentLogoHeaderKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda9(int i, int i2, List list) {
        this.$r8$classId = i2;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        List list = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LocalHomeGeoViewKt.PreloadLocalImages(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalHomeGeoViewKt.PreloadLocalImages(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
            case 2:
                int intValue = ((Integer) obj).intValue();
                ((LocalHomeViewModel.TabContent.Widget) obj2).getClass();
                break;
            case 3:
                ((Integer) obj2).getClass();
                BankingDialogKt.TransferRequirementsSection(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
            case 4:
                ((Integer) obj2).getClass();
                MultiColorPageTitleKt.MultiColorPageTitle(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
            case 5:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.SuccessGrid(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
            case 6:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.InfoCards(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
            case 7:
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((Item) list.get(0)).UI(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                TextCardKt.StackedContent(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
            case 9:
                Composer composer2 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    SellerCardSize sellerCardSize = SellerCardSize.XSmall;
                    SellerCardShape sellerCardShape = SellerCardShape.Circle;
                    SellerCardKt.OverlappingSellerCards(3456, gapComposer2, null, list);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ConsentLogoHeaderKt.BackgroundRow(Updater.updateChangedFlags(1), (Composer) obj, list);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda9(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }
}
