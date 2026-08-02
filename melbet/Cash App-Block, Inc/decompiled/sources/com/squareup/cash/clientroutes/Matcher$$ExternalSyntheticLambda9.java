package com.squareup.cash.clientroutes;

import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.local.primitives.BrandCollectionDataKt;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.CacheNetworkResponse;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientroutes.AccountRequirement;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.db.StorageLinkQueries$getActiveLink$2;
import com.squareup.cash.db.StorageLinkQueries$selectById$2;
import com.squareup.cash.tabprovider.api.TabInfoState;
import com.squareup.protos.cash.aegis.sync_values.FamilyAccount;
import com.squareup.protos.cash.aegis.sync_values.UiFamilyAccount;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.common.SyncCustomer;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.common.SyncPayment;
import com.squareup.protos.franklin.ui.PersonalInfoCTABanner;
import com.squareup.protos.franklin.ui.UiAccess;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class Matcher$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Matcher$$ExternalSyntheticLambda9(RealProfileAliasRepository realProfileAliasRepository) {
        this.$r8$classId = 26;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BrandCollectionDataKt brandCollectionDataKt;
        UiCustomer uiCustomer;
        UiPayment uiPayment;
        UiPayment uiPayment2;
        int i = 4;
        int i2 = 1;
        switch (this.$r8$classId) {
            case 0:
                Uri uri = (Uri) obj;
                uri.getClass();
                ClientRouteSpec clientRouteSpec = ClientRouteSpec.cashInReview;
                ClientRouteSpec viewInvesting = zzjo.getViewInvesting();
                Matcher matcher = Matcher.treehouseAppLinkClientRoute;
                Map matchWithAllParameters = TransactorKt.matchWithAllParameters(uri, "^/dl/view/investing/?$", false, viewInvesting.getParameterNames());
                AccountRequirement accountRequirement = TransactorKt.accountRequirement(uri, viewInvesting);
                String matchAccountIdentifier = TransactorKt.matchAccountIdentifier(uri, accountRequirement);
                if (accountRequirement.getValue() == AccountRequirement.Value.REQUIRED && matchAccountIdentifier == null) {
                    return null;
                }
                ClientRouteSpec copy$default = ClientRouteSpec.copy$default(viewInvesting, accountRequirement, TransactorKt.authentication(uri, viewInvesting), viewInvesting.isDeprecated());
                List list = ClientRoute.ViewInvesting.deepLinkSpecs;
                List<DeepLinkSpec> deepLinkSpecs = CacheNetworkResponse.getDeepLinkSpecs();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deepLinkSpecs, 10));
                for (DeepLinkSpec deepLinkSpec : deepLinkSpecs) {
                    arrayList.add(new DeepLinkSpec(deepLinkSpec.getName(), deepLinkSpec.getPathFormat(), copy$default));
                }
                if (matchWithAllParameters != null) {
                    return new ClientRoute.ViewInvesting(copy$default, arrayList, matchAccountIdentifier);
                }
                return null;
            case 1:
                FamilyAccount familyAccount = ((UiFamilyAccount) obj).family_account;
                if (familyAccount == null || (brandCollectionDataKt = familyAccount.f1246type) == null) {
                    return null;
                }
                return zzkn.access$getDependent(brandCollectionDataKt);
            case 2:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("component_migration");
                return Unit.INSTANCE;
            case 3:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("component_migration");
                return Unit.INSTANCE;
            case 4:
                SyncEntity syncEntity = (SyncEntity) obj;
                syncEntity.getClass();
                SyncCustomer syncCustomer = syncEntity.customer;
                if (syncCustomer == null || (uiCustomer = syncCustomer.customer) == null) {
                    return null;
                }
                return uiCustomer.id;
            case 5:
                SyncEntity syncEntity2 = (SyncEntity) obj;
                syncEntity2.getClass();
                SyncPayment syncPayment = syncEntity2.payment;
                if (syncPayment == null || (uiPayment = syncPayment.payment) == null) {
                    return null;
                }
                return uiPayment.token;
            case 6:
                SyncEntity syncEntity3 = (SyncEntity) obj;
                syncEntity3.getClass();
                SyncPayment syncPayment2 = syncEntity3.payment;
                if (syncPayment2 == null || (uiPayment2 = syncPayment2.payment) == null) {
                    return null;
                }
                return uiPayment2.token;
            case 7:
                return Recorder$$ExternalSyntheticOutline2.m("LTA_", (String) obj);
            case 8:
                SyncEntity syncEntity4 = (SyncEntity) obj;
                syncEntity4.getClass();
                SyncInvestmentHolding syncInvestmentHolding = syncEntity4.investment_holding;
                if (syncInvestmentHolding != null) {
                    return syncInvestmentHolding.investment_entity_token;
                }
                return null;
            case 9:
                return Recorder$$ExternalSyntheticOutline2.m("H_", (String) obj);
            case 10:
                return (String) obj;
            case 11:
                obj.getClass();
                return obj;
            case 12:
                obj.getClass();
                return obj;
            case 13:
                obj.getClass();
                return obj;
            case 14:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl);
            case 15:
                Pair pair = (Pair) obj;
                pair.getClass();
                Boolean bool = (Boolean) pair.second;
                bool.booleanValue();
                return bool;
            case 16:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), new SvgDecoder$$ExternalSyntheticLambda0(i2)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, null, 4), new Matcher$$ExternalSyntheticLambda9(17)));
            case 17:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 19:
                NavigationModel.Ready.FullScreenLocation fullScreenLocation = (NavigationModel.Ready.FullScreenLocation) obj;
                fullScreenLocation.getClass();
                return fullScreenLocation.showTabs ? "tabs" : fullScreenLocation.stateKey;
            case 20:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return new ContentTransform(EnterTransitionImpl.None, ExitTransitionImpl.None, RecyclerView.DECELERATION_RATE, i);
            case 21:
                NavigationModel.Ready.OverlayLocation overlayLocation = (NavigationModel.Ready.OverlayLocation) obj;
                if (overlayLocation != null) {
                    return overlayLocation.stateKey;
                }
                return null;
            case 22:
                TabInfoState tabInfoState = (TabInfoState) obj;
                tabInfoState.getClass();
                if (Intrinsics.areEqual(tabInfoState, TabInfoState.NotReady.INSTANCE)) {
                    return null;
                }
                if (Intrinsics.areEqual(tabInfoState, TabInfoState.Onboarding.INSTANCE)) {
                    return EmptyList.INSTANCE;
                }
                if (tabInfoState instanceof TabInfoState.Ready) {
                    return ((TabInfoState.Ready) tabInfoState).getTabs();
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 23:
                UiAccess uiAccess = (UiAccess) obj;
                uiAccess.getClass();
                Boolean bool2 = uiAccess.has_passcode;
                bool2.getClass();
                boolean booleanValue = bool2.booleanValue();
                Boolean bool3 = uiAccess.require_passcode_confirmation;
                bool3.getClass();
                boolean booleanValue2 = bool3.booleanValue();
                Boolean bool4 = uiAccess.app_lock_activated;
                return new PasscodeSettings.Loaded(booleanValue, booleanValue2, bool4 != null ? bool4.booleanValue() : false);
            case 24:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return blockersData;
            case 25:
                ((PersonalInfoCTABanner) obj).getClass();
                return 1L;
            case 26:
                ProfileAlias profileAlias = (ProfileAlias) obj;
                profileAlias.getClass();
                return RealProfileAliasRepository.toProfileAlias(profileAlias);
            case 27:
                StorageLinkQueries$getActiveLink$2 storageLinkQueries$getActiveLink$2 = StorageLinkQueries$getActiveLink$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                return storageLinkQueries$getActiveLink$2.invoke(androidCursor.getString(0), androidCursor.getLong(1), androidCursor.getLong(2), androidCursor.getLong(3));
            case 28:
                StorageLinkQueries$selectById$2 storageLinkQueries$selectById$2 = StorageLinkQueries$selectById$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string2 = androidCursor2.getString(0);
                Long l = androidCursor2.getLong(1);
                Long m = re$$ExternalSyntheticOutline0.m(l, androidCursor2, 2);
                Long l2 = androidCursor2.getLong(3);
                l2.getClass();
                return storageLinkQueries$selectById$2.invoke(string2, l, m, l2);
            default:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
        }
    }

    public /* synthetic */ Matcher$$ExternalSyntheticLambda9(int i) {
        this.$r8$classId = i;
    }
}
