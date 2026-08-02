package com.squareup.cash.graphics.backend.gl;

import android.nfc.NfcAdapter;
import android.opengl.Matrix;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.broadway.navigation.Navigator;
import app.cash.molecule.PlatformKt;
import com.fidesmo.sec.delivery.models.DeliveryUpdate;
import com.google.mlkit.vision.text.zzc;
import com.squareup.address.typeahead.backend.api.AddressState;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageNavigateToSettings;
import com.squareup.cash.family.familyhub.backend.api.ControlType;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentActivityEmbeddedSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewEvent;
import com.squareup.cash.family.familyhub.viewmodels.FamilyListItem;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsSection;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactMethod;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewEvent;
import com.squareup.cash.favorites.viewmodels.FavoriteAddedViewModel;
import com.squareup.cash.favorites.viewmodels.FavoriteAvatar;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.fidesmo.views.ScanningStarLayout;
import com.squareup.cash.formview.components.arcade.ArcadeFormAddressView;
import com.squareup.cash.formview.components.arcade.ArcadeSelectableRow;
import com.squareup.cash.formview.components.arcade.SelectableRowViewModel;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.graphics.backend.math.Matrix4;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.disclosure.DisclosureSectionProvider;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import io.noties.markwon.MarkwonConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class GLSceneScope$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ GLSceneScope$$ExternalSyntheticLambda4(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Matrix4 times = ((Matrix4) obj2).times((Matrix4) obj);
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                Matrix.invertM(fArr, 0, times.matrix, 0);
                Matrix4 matrix4 = new Matrix4();
                Matrix.transposeM(matrix4.matrix, 0, fArr, 0);
                break;
            case 1:
                ((Function1) obj2).invoke(((DependentActivityEmbeddedSectionViewModel) obj).action);
                break;
            case 2:
                FamilyListItem.Loaded loaded = (FamilyListItem.Loaded) obj;
                ((Function1) obj2).invoke(new FamilyHomeViewEvent.TapListItem(loaded.url, loaded.analyticalIdentifier));
                break;
            case 3:
                ((Function1) obj2).invoke(new FamilyHomeViewEvent.TapMultiplePendingRequests(((FamilyPendingRequestsSection.MultiplePendingRequests) ((FamilyPendingRequestsSection) obj)).row.tapUrl));
                break;
            case 4:
                ((Function1) obj2).invoke((FamilyHomeViewEvent) obj);
                break;
            case 5:
                ((Function1) obj2).invoke(new SponsorResourcesViewEvent.TapRow(((SponsorResourcesRowViewModel) obj).url));
                break;
            case 6:
                ((Function1) obj2).invoke(((ContactMethod) obj).clickEvent);
                break;
            case 7:
                String str = (String) obj;
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) ((DisclosureSectionProvider) obj2).router;
                markwonConfiguration.getClass();
                ((Analytics) markwonConfiguration.theme).track(new SponsoredAccountManageNavigateToSettings(PlatformKt.activeAccountTokenOrNull((SessionManager) markwonConfiguration.syntaxHighlight), str), null);
                ((Navigator) markwonConfiguration.spansFactory).goTo(new DependentControlScreen.ManagedAccount(ControlType.CASH_CARD, str));
                break;
            case 8:
                Function1 function1 = (Function1) obj;
                if (((FavoriteAddedViewModel) obj2).showViewFavorites) {
                    function1.invoke(FavoriteAddedViewEvent.ViewFavoritesClicked.INSTANCE);
                } else {
                    function1.invoke(FavoriteAddedViewEvent.CloseClicked.INSTANCE);
                }
                break;
            case 9:
                ((Function1) obj2).invoke(((FavoriteAvatar) obj).recipient);
                break;
            case 10:
                NfcAdapter nfcAdapter = (NfcAdapter) obj;
                String str2 = Build.MODEL;
                break;
            case 11:
                Function2<Map<String, String>, byte[], Unit> handler = ((DeliveryUpdate.NeedsEncryptedUserInteraction) ((DeliveryUpdate) obj2)).getHandler();
                zzc zzcVar = RealFidesmoClient.FidesmoRequirementId.Companion;
                RealFidesmoClient.FidesmoOptionAnswer[] fidesmoOptionAnswerArr = RealFidesmoClient.FidesmoOptionAnswer.$VALUES;
                handler.invoke(MapsKt__MapsJVMKt.mapOf(new Pair("retry", "0")), (byte[]) obj);
                break;
            case 12:
                ((Function1) obj2).invoke(Boolean.valueOf(((ScanningStarLayout) obj).placeInstructionBlockAtTop));
                break;
            case 13:
                Function1 function12 = (Function1) obj2;
                if (((Number) ((State) obj).getValue()).floatValue() >= 1.0f) {
                    function12.invoke(FidesmoProvisioningViewEvent.Close.INSTANCE);
                }
                break;
            case 14:
                ScanningStarPlacement scanningStarPlacement = (ScanningStarPlacement) obj2;
                MutableState mutableState = (MutableState) obj;
                if (scanningStarPlacement != null) {
                    mutableState.setValue(scanningStarPlacement);
                }
                break;
            case 15:
                StateFlowImpl stateFlowImpl = ((ArcadeFormAddressView) obj2).validated;
                Boolean valueOf = Boolean.valueOf(((AddressState) obj) instanceof AddressState.Valid);
                stateFlowImpl.getClass();
                stateFlowImpl.updateState(null, valueOf);
                break;
            case 16:
                BlockerAction blockerAction = ((FormBlocker.Element.CallToActionElement) obj).button_action;
                blockerAction.getClass();
                ((Function1) obj2).invoke(new FormViewEvent.BlockerActionViewEvent.FormButtonClicked(blockerAction));
                break;
            case 17:
                Function1 function13 = (Function1) obj;
                Iterator<T> it = ((FormBlocker.Element.MerchantTransactionElement) obj2).actions.iterator();
                while (it.hasNext()) {
                    function13.invoke(new FormViewEvent.BlockerActionViewEvent.FormDetailRowClicked((BlockerAction) it.next()));
                }
                break;
            case 18:
                String str3 = (String) obj2;
                MutableState mutableState2 = (MutableState) obj;
                List list = (List) mutableState2.getValue();
                mutableState2.setValue(list.contains(str3) ? CollectionsKt.minus(list, str3) : CollectionsKt.plus((Collection) list, (Object) str3));
                break;
            case 19:
                ((ArcadeSelectableRow) obj2).onEvent.invoke(((SelectableRowViewModel.Action) obj).getEvent());
                break;
            case 20:
                ((Function1) obj).invoke(((GenericBaseViewModel.ButtonViewModel) obj2).event);
                break;
            case 21:
                Function1 function14 = (Function1) obj;
                GenericTreeElementsViewEvent genericTreeElementsViewEvent = ((GenericBaseViewModel.IconButtonViewModel) obj2).event;
                if (genericTreeElementsViewEvent != null) {
                    function14.invoke(genericTreeElementsViewEvent);
                }
                break;
            case 22:
                Function1 function15 = (Function1) obj;
                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = ((GenericComponentViewModel.CompactInfoViewModel) obj2).viewAnalyticsEvent;
                if (viewAnalyticsEvent != null) {
                    function15.invoke(viewAnalyticsEvent);
                }
                break;
            case 23:
                Function1 function16 = (Function1) obj;
                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent2 = ((GenericComponentViewModel.FullWidthViewModel) obj2).viewAnalyticsEvent;
                if (viewAnalyticsEvent2 != null) {
                    function16.invoke(viewAnalyticsEvent2);
                }
                break;
            case 24:
                Function1 function17 = (Function1) obj;
                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent3 = ((GenericComponentViewModel.TwoColumnViewModel) obj2).viewAnalyticsEvent;
                if (viewAnalyticsEvent3 != null) {
                    function17.invoke(viewAnalyticsEvent3);
                }
                break;
            case 25:
                Function1 function18 = (Function1) obj;
                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent4 = ((GenericComponentViewModel.ValueUnitViewModel) obj2).viewAnalyticsEvent;
                if (viewAnalyticsEvent4 != null) {
                    function18.invoke(viewAnalyticsEvent4);
                }
                break;
            case 26:
                Function1 function19 = (Function1) obj;
                GenericTreeElementsViewEvent genericTreeElementsViewEvent2 = ((GenericComponentViewModel.CellActivityViewModel) obj2).event;
                if (genericTreeElementsViewEvent2 != null) {
                    function19.invoke(genericTreeElementsViewEvent2);
                }
                break;
            case 27:
                Function1 function110 = (Function1) obj;
                GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent5 = ((GenericComponentViewModel.SectionHeaderViewModel) obj2).viewAnalyticsEvent;
                if (viewAnalyticsEvent5 != null) {
                    function110.invoke(viewAnalyticsEvent5);
                }
                break;
            case 28:
                GlobalSearchViewModel.Item item = (GlobalSearchViewModel.Item) obj2;
                GlobalSearchFeedKt$$ExternalSyntheticLambda5 globalSearchFeedKt$$ExternalSyntheticLambda5 = (GlobalSearchFeedKt$$ExternalSyntheticLambda5) obj;
                String str4 = item.actionUrl;
                if (str4 != null) {
                    globalSearchFeedKt$$ExternalSyntheticLambda5.invoke(new GlobalSearchViewEvent.RowSectionEvent.RowClicked(item, str4));
                }
                break;
            default:
                ((Function1) obj2).invoke(new GrowToolsManagerViewEvent.DialogDismissTapped(((GrowToolsManagerViewModel.Loaded.Dialog) obj).isError));
                break;
        }
        return Unit.INSTANCE;
    }
}
