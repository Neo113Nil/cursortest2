package com.squareup.cash.pools.views;

import android.content.Context;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowSheetPosition;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.phoneplans.applets.presenters.RealPhonePlansAppletTileAvailabilityManager;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;
import squareup.cash.phoneplans.syncvalues.VersionedPhonePlanApplet;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDetailsViewKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        AppletTileInstallationState.Uninstalled uninstalled = AppletTileInstallationState.Uninstalled.INSTANCE;
        AppletTileInstallationState.Installed installed = AppletTileInstallationState.Installed.INSTANCE;
        switch (i) {
            case 0:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.inPlaceLoadingTransition(animatedContentTransitionScopeImpl);
            case 1:
                return Unit.INSTANCE;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 3:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 4:
                CoreFlowSheetPosition coreFlowSheetPosition = (CoreFlowSheetPosition) obj;
                coreFlowSheetPosition.getClass();
                return new CoreFlowRealSheetState(coreFlowSheetPosition, null, false, 14);
            case 5:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 7:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                ComposableLambdaImpl composableLambdaImpl = NearbyPayRequestViewKt.lambda$1778855481;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                snapshotStateList.add(composableLambdaImpl);
                snapshotStateList.add(NearbyPayRequestViewKt.lambda$493131426);
                return Unit.INSTANCE;
            case 8:
                NearbyPerson nearbyPerson = (NearbyPerson) obj;
                nearbyPerson.getClass();
                return nearbyPerson.customerToken;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, Constants.META_CLOSE);
                return Unit.INSTANCE;
            case 10:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                Context context = (Context) obj;
                context.getClass();
                return new CashLottieAnimationView(context);
            case 13:
                ((List) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("businessGrants");
                return Unit.INSTANCE;
            case 16:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("businessGrants");
                return Unit.INSTANCE;
            case 17:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("businessGrants");
                return Unit.INSTANCE;
            case 18:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                return (MobilePlanHome) MobilePlanHome.ADAPTER.decode(bArr);
            case 19:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.fadeAndScaleLoadingTransition(animatedContentTransitionScopeImpl2);
            case 20:
                WirelessProviderListViewModel.ProviderItem providerItem = (WirelessProviderListViewModel.ProviderItem) obj;
                providerItem.getClass();
                return providerItem.id;
            case 21:
                VersionedPhonePlanApplet versionedPhonePlanApplet = (VersionedPhonePlanApplet) obj;
                versionedPhonePlanApplet.getClass();
                return versionedPhonePlanApplet.phone_plan_applet_v1;
            case 22:
                VersionedPhonePlanApplet versionedPhonePlanApplet2 = (VersionedPhonePlanApplet) obj;
                versionedPhonePlanApplet2.getClass();
                return versionedPhonePlanApplet2.phone_plan_applet_v1;
            case 23:
                PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) obj;
                PhonePlanAppletV1.State state = phonePlanAppletV1 != null ? phonePlanAppletV1.state : null;
                switch (state == null ? -1 : RealPhonePlansAppletTileAvailabilityManager.WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
                    case -1:
                    case 1:
                        return AppletAvailabilityState.UNAVAILABLE;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return AppletAvailabilityState.AVAILABLE;
                }
            case 24:
                PhonePlansAppletTileModel phonePlansAppletTileModel = (PhonePlansAppletTileModel) obj;
                phonePlansAppletTileModel.getClass();
                if (phonePlansAppletTileModel instanceof PhonePlansAppletTileModel.Loading) {
                    return AppletTileInstallationState.Loading.INSTANCE;
                }
                if (phonePlansAppletTileModel instanceof PhonePlansAppletTileModel.Uninstalled) {
                    return uninstalled;
                }
                if (phonePlansAppletTileModel instanceof PhonePlansAppletTileModel.Installed) {
                    return installed;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 25:
                PoolsAppletTileModel poolsAppletTileModel = (PoolsAppletTileModel) obj;
                poolsAppletTileModel.getClass();
                if (poolsAppletTileModel instanceof PoolsAppletTileModel.Installed) {
                    return installed;
                }
                if (poolsAppletTileModel instanceof PoolsAppletTileModel.Uninstalled) {
                    return uninstalled;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver4, 0);
                return Unit.INSTANCE;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver5, new CollectionInfo(0, 0));
                return Unit.INSTANCE;
            case 28:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                int i2 = 1;
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(2000, 0, null, 6), 2).plus(EnterExitTransitionKt.slideInVertically$default(1, new SvgDecoder$$ExternalSyntheticLambda0(i2))), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(2000, 0, null, 6), 2).plus(EnterExitTransitionKt.slideOutVertically$default(1, new PoolsListViewKt$$ExternalSyntheticLambda6(i2))));
            default:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
