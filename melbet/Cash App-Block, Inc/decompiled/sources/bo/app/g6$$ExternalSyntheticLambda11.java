package bo.app;

import android.nfc.NfcAdapter;
import android.os.Build;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$3;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.primitives.FulfillmentConfigurationsKt;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.sqldelight.Query;
import com.braze.Braze;
import com.squareup.cash.db2.entities.PaymentQueries;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.money.views.ToolbarNestedScrollExpander;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewEvent;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewEvent;
import com.squareup.cash.profile.viewmodels.SponsoredFamilyMember;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.wallet.presenters.CardSchemePresenter;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.scannerview.ScannerView;
import com.squareup.scannerview.Step;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class g6$$ExternalSyntheticLambda11 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ g6$$ExternalSyntheticLambda11(String str, Function1 function1, boolean z) {
        this.$r8$classId = 10;
        this.f$0 = z;
        this.f$2 = function1;
        this.f$1 = str;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [app.cash.sqldelight.paging3.QueryPagingSourceKt$toInt$1] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String isEphemeralEventKey$lambda$1;
        int i = this.$r8$classId;
        Continuation continuation = null;
        boolean z = this.f$0;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                break;
            case 1:
                MutableState mutableState = (MutableState) obj;
                FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) ((State) obj2).getValue();
                if (fulfillmentConfiguration != null) {
                    break;
                } else {
                    FulfillmentConfigurations fulfillmentConfigurations = (FulfillmentConfigurations) mutableState.getValue();
                    if (fulfillmentConfigurations != null) {
                        FulfillmentConfiguration fulfillmentConfiguration2 = fulfillmentConfigurations.scheduled;
                        if (!z || FulfillmentConfigurationKt.getSchedulingMode(FulfillmentConfigurationsKt.getCurrentConfiguration(fulfillmentConfigurations)) != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_ASAP || Intrinsics.areEqual(fulfillmentConfiguration2, FulfillmentConfiguration.Unspecified.INSTANCE)) {
                            break;
                        }
                    }
                }
                break;
            case 2:
                break;
            case 3:
                isEphemeralEventKey$lambda$1 = Braze.isEphemeralEventKey$lambda$1((String) obj2, (Set) obj, z);
                break;
            case 4:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
                if (z) {
                    Function0 function0 = (Function0) CollectionsKt__MutableCollectionsKt.removeLastOrNull(snapshotStateList);
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    Function0 function02 = (Function0) CollectionsKt__MutableCollectionsKt.removeLastOrNull(snapshotStateList2);
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
                break;
            case 5:
                Function1 function1 = (Function1) obj2;
                PayerCustomerRowModel payerCustomerRowModel = (PayerCustomerRowModel) obj;
                if (z) {
                    function1.invoke(payerCustomerRowModel.customerToken);
                }
                break;
            case 6:
                NfcAdapter nfcAdapter = (NfcAdapter) obj;
                String str = Build.MODEL;
                break;
            case 7:
                break;
            case 8:
                ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) obj2;
                break;
            case 9:
                Function1 function12 = (Function1) obj2;
                TouchRecorder touchRecorder = (TouchRecorder) obj;
                if (z) {
                    function12.invoke(CollectionsKt.toList(touchRecorder.lastGesture));
                }
                break;
            case 10:
                Function1 function13 = (Function1) obj;
                String str2 = (String) obj2;
                if (!z) {
                    function13.invoke(new PrepurchaseCashCardPlanningViewEvent.SelectLocale(str2));
                }
                break;
            case 11:
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) obj2;
                PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.ExpandableItem expandableItem = (PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.ExpandableItem) obj;
                if (z) {
                    snapshotStateSet.remove(expandableItem);
                } else {
                    snapshotStateSet.add(expandableItem);
                }
                break;
            case 12:
                Function1 function14 = (Function1) obj2;
                SponsoredFamilyMember sponsoredFamilyMember = (SponsoredFamilyMember) obj;
                if (z) {
                    function14.invoke(new ChannelListViewEvent.SponsoredAccountClicked(sponsoredFamilyMember, !sponsoredFamilyMember.notificationsTurnedOn));
                }
                break;
            case 13:
                ((Function1) obj2).invoke(new EnableAliasSheetViewEvent.AliasChecked((Alias) obj, z));
                break;
            case 14:
                final Query query = (Query) obj2;
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) obj;
                PaymentQueries paymentQueries = (PaymentQueries) markwonConfiguration.spansFactory;
                CoroutineContext coroutineContext = (CoroutineContext) markwonConfiguration.linkResolver;
                SliderDefaults$$ExternalSyntheticLambda0 sliderDefaults$$ExternalSyntheticLambda0 = new SliderDefaults$$ExternalSyntheticLambda0(markwonConfiguration, z, 10);
                paymentQueries.getClass();
                CartBannerViewKt$$ExternalSyntheticLambda2 cartBannerViewKt$$ExternalSyntheticLambda2 = new CartBannerViewKt$$ExternalSyntheticLambda2(sliderDefaults$$ExternalSyntheticLambda0, 13);
                final xg$$ExternalSyntheticLambda9 xg__externalsyntheticlambda9 = new xg$$ExternalSyntheticLambda9(query, 4);
                break;
            case 15:
                JobKt.launch$default((CoroutineScope) obj2, null, null, new RealBadger2$scheduleBadgeClearingWork$3((CardSchemePresenter) obj, z, continuation, 9), 3);
                break;
            default:
                ((ScannerView) obj2).textSetter.setText(((Step) obj).text, z, true);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g6$$ExternalSyntheticLambda11(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = z;
    }

    public /* synthetic */ g6$$ExternalSyntheticLambda11(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = z;
        this.f$2 = obj2;
    }

    public /* synthetic */ g6$$ExternalSyntheticLambda11(LocalBrandLocationCartPresenter localBrandLocationCartPresenter, boolean z, State state, MutableState mutableState) {
        this.$r8$classId = 1;
        this.f$0 = z;
        this.f$1 = state;
        this.f$2 = mutableState;
    }

    public /* synthetic */ g6$$ExternalSyntheticLambda11(boolean z, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = obj;
        this.f$2 = obj2;
    }
}
