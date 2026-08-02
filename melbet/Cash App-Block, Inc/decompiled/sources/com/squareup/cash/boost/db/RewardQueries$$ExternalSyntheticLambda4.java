package com.squareup.cash.boost.db;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.applets.presenters.RealBorrowAppletRepository;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.applets.viewmodels.BorrowEntryPointModel;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.core.states.AppletTileInstallationState;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class RewardQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RewardQueries$$ExternalSyntheticLambda4() {
        this.$r8$classId = 10;
        RewardMerchantQueries$merchantNameForRewardToken$2 rewardMerchantQueries$merchantNameForRewardToken$2 = RewardMerchantQueries$merchantNameForRewardToken$2.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("reward");
                return Unit.INSTANCE;
            case 1:
                return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj));
            case 2:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                return Strings.backwardLoadingTransition(animatedContentTransitionScopeImpl);
            case 3:
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2 = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl2.getClass();
                return Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl2);
            case 4:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(90, 0, null, 6), 2));
            case 5:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 7:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("activeRewardOverride");
                return Unit.INSTANCE;
            case 8:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 9:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("orderedRewardToken");
                return Unit.INSTANCE;
            case 10:
                RewardMerchantQueries$merchantNameForRewardToken$2 rewardMerchantQueries$merchantNameForRewardToken$2 = RewardMerchantQueries$merchantNameForRewardToken$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                return rewardMerchantQueries$merchantNameForRewardToken$2.invoke(androidCursor.getString(0));
            case 11:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 12:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("rewardMerchant");
                return Unit.INSTANCE;
            case 13:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 14:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 15:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("rewardSelection");
                return Unit.INSTANCE;
            case 16:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("rewardSelection");
                return Unit.INSTANCE;
            case 17:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 18:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("rewardSelection");
                return Unit.INSTANCE;
            case 19:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("rewardSlot");
                return Unit.INSTANCE;
            case 20:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("selectableReward");
                return Unit.INSTANCE;
            case 21:
                Function1 function110 = (Function1) obj;
                function110.getClass();
                function110.invoke("selectedReward");
                return Unit.INSTANCE;
            case 22:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 23:
                BorrowData.AppletData.EntryPointData entryPointData = (BorrowData.AppletData.EntryPointData) obj;
                if (entryPointData == null) {
                    return AppletAvailabilityState.LOADING;
                }
                zzjj zzjjVar = entryPointData.entry_point_v2;
                if (!(zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) && (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2)) {
                    BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint = ((BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) zzjjVar).value;
                    if (tileEntryPoint.full_width_tile == null && tileEntryPoint.half_width_tile == null) {
                        return AppletAvailabilityState.UNAVAILABLE;
                    }
                    return AppletAvailabilityState.AVAILABLE;
                }
                return AppletAvailabilityState.UNAVAILABLE;
            case 24:
                BorrowData.AppletData.EntryPointData entryPointData2 = (BorrowData.AppletData.EntryPointData) obj;
                if (entryPointData2 == null) {
                    return null;
                }
                zzjj zzjjVar2 = entryPointData2.entry_point_v2;
                if ((zzjjVar2 instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) || !(zzjjVar2 instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2)) {
                    return null;
                }
                BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint2 = ((BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) zzjjVar2).value;
                BorrowData.AppletData.EntryPointData.TileEntryPoint.FullWidthTile fullWidthTile = tileEntryPoint2.full_width_tile;
                String str = tileEntryPoint2.client_route;
                BorrowData.AppletData.EntryPointData.TileEntryPoint.HalfWidthTile halfWidthTile = tileEntryPoint2.half_width_tile;
                if (fullWidthTile != null) {
                    str.getClass();
                    return new BorrowEntryPointModel.Installed(str, fullWidthTile);
                }
                if (halfWidthTile == null) {
                    return null;
                }
                str.getClass();
                return new BorrowEntryPointModel.Uninstalled(str, halfWidthTile);
            case 25:
                BorrowAppletTileModel borrowAppletTileModel = (BorrowAppletTileModel) obj;
                borrowAppletTileModel.getClass();
                if (borrowAppletTileModel instanceof BorrowAppletTileModel.Loading) {
                    return AppletTileInstallationState.Loading.INSTANCE;
                }
                if (borrowAppletTileModel instanceof BorrowAppletTileModel.Installed) {
                    return AppletTileInstallationState.Installed.INSTANCE;
                }
                if (borrowAppletTileModel instanceof BorrowAppletTileModel.Uninstalled) {
                    return AppletTileInstallationState.Uninstalled.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 26:
                BorrowAppletCreditLimitAndBorrowButtonTile borrowAppletCreditLimitAndBorrowButtonTile = (BorrowAppletCreditLimitAndBorrowButtonTile) obj;
                borrowAppletCreditLimitAndBorrowButtonTile.getClass();
                return borrowAppletCreditLimitAndBorrowButtonTile.tiles;
            case 27:
                BorrowAppletBulletinsTile borrowAppletBulletinsTile = (BorrowAppletBulletinsTile) obj;
                borrowAppletBulletinsTile.getClass();
                return borrowAppletBulletinsTile.tiles;
            case 28:
                BorrowAppletPaymentTimelineTile borrowAppletPaymentTimelineTile = (BorrowAppletPaymentTimelineTile) obj;
                borrowAppletPaymentTimelineTile.getClass();
                return borrowAppletPaymentTimelineTile.tiles;
            default:
                BorrowAppletLoanHistoryTile borrowAppletLoanHistoryTile = (BorrowAppletLoanHistoryTile) obj;
                borrowAppletLoanHistoryTile.getClass();
                return borrowAppletLoanHistoryTile.tiles;
        }
    }

    public /* synthetic */ RewardQueries$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    public /* synthetic */ RewardQueries$$ExternalSyntheticLambda4(RealBorrowAppletRepository realBorrowAppletRepository) {
        this.$r8$classId = 24;
    }
}
