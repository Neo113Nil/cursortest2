package app.cash.local.views.cart;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.offers.views.collection.OffersCollectionListingKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.taptopay.views.components.TapToPayButtonKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class CreateCartErrorBannerKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CreateCartErrorBannerKt$$ExternalSyntheticLambda3(Modifier modifier, Function1 function1, List list, int i) {
        this.$r8$classId = 6;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$1 = list;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                CartBannerViewKt.CreateCartErrorBanners(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AfterpayCardKt.TileCarouselContent(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                BenefitsHubViewKt.InsightsCarousel(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                zzaho.SpendingAnalysis(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                OffersCollectionListingKt.OffersCollectionListing(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                AlphaKt.BackgroundCarousel(this.f$3, updateChangedFlags, (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            case 6:
                ((Integer) obj2).getClass();
                BadgeNameKt.GroupedButtonsWidget(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
            default:
                ((Integer) obj2).getClass();
                TapToPayButtonKt.ScrollingCarousel(Updater.updateChangedFlags(this.f$3 | 1), (Composer) obj, this.f$0, this.f$1, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CreateCartErrorBannerKt$$ExternalSyntheticLambda3(Modifier modifier, List list, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = modifier;
        this.f$1 = list;
        this.f$2 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ CreateCartErrorBannerKt$$ExternalSyntheticLambda3(Modifier modifier, Function1 function1, List list, int i, int i2) {
        this.$r8$classId = 5;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$1 = list;
        this.f$3 = i;
    }

    public /* synthetic */ CreateCartErrorBannerKt$$ExternalSyntheticLambda3(List list, Modifier modifier, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = list;
        this.f$0 = modifier;
        this.f$2 = function1;
        this.f$3 = i;
    }

    public /* synthetic */ CreateCartErrorBannerKt$$ExternalSyntheticLambda3(List list, Function1 function1, Modifier modifier, int i) {
        this.$r8$classId = 2;
        this.f$1 = list;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = i;
    }
}
