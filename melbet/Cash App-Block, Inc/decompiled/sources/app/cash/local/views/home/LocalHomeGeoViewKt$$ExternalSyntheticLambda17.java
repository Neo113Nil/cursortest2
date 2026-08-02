package app.cash.local.views.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.internal.LocalMapKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrl;
import com.squareup.cash.afterpayapplet.views.retro.OrderSelectionRetroSectionKt;
import com.squareup.cash.borrow.views.BulletinInfoOverlayKt;
import com.squareup.cash.borrow.views.LimitHubProgressSectionKt;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.PaycheckCircles;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalHomeGeoViewKt$$ExternalSyntheticLambda17 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda17(List list, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        switch (i2) {
            case 12:
                SellerCardSize sellerCardSize = SellerCardSize.XSmall;
                SellerCardShape sellerCardShape = SellerCardShape.Circle;
                break;
            default:
                PaycheckCircles.Placement[] placementArr = PaycheckCircles.Placement.$VALUES;
                break;
        }
        this.f$1 = list;
        this.f$0 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        List list = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                LocalHomeGeoViewKt.LocalHomeGeoPreviewMap(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.LocalExpandingDiscountSections(Updater.updateChangedFlags(7), (Composer) obj, modifier, list);
                break;
            case 2:
                ((Integer) obj2).getClass();
                LocalMapKt.LocalNumberedList(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            case 3:
                ((Integer) obj2).getClass();
                OrderSelectionRetroSectionKt.BulletPoints(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            case 4:
                ((Integer) obj2).getClass();
                BulletinInfoOverlayKt.BulletinInfoOverlayBullets(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            case 5:
                ((Integer) obj2).getClass();
                BulletinInfoOverlayKt.BulletinInfoOverlayBullets(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            case 6:
                ((Integer) obj2).getClass();
                LimitHubProgressSectionKt.HorizontalProgressBar(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            case 7:
                PaycheckCircles.Placement[] placementArr = PaycheckCircles.Placement.$VALUES;
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaycheckCircles(Updater.updateChangedFlags(385), (Composer) obj, modifier, list);
                break;
            case 8:
                ((Integer) obj2).getClass();
                ErrorKt.TransactionDetailsSection(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            case 9:
                ((Integer) obj2).getClass();
                AlphaKt.RecipientsInformation(Updater.updateChangedFlags(7), (Composer) obj, modifier, list);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ViewPropertyAnimatorListenerAdapter.HistoricalScoreGraph(Updater.updateChangedFlags(49), (Composer) obj, modifier, list);
                break;
            case 11:
                ((Integer) obj2).getClass();
                zzrl.TextAndSpaceElements(Updater.updateChangedFlags(1), (Composer) obj, modifier, list);
                break;
            default:
                SellerCardSize sellerCardSize = SellerCardSize.XSmall;
                SellerCardShape sellerCardShape = SellerCardShape.Circle;
                ((Integer) obj2).getClass();
                SellerCardKt.OverlappingSellerCards(Updater.updateChangedFlags(3457), (Composer) obj, modifier, list);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda17(Modifier modifier, List list, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = list;
    }

    public /* synthetic */ LocalHomeGeoViewKt$$ExternalSyntheticLambda17(List list, Modifier modifier, int i, int i2, boolean z) {
        this.$r8$classId = i2;
        this.f$1 = list;
        this.f$0 = modifier;
    }
}
