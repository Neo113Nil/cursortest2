package com.squareup.cash.boost.db;

import android.content.Context;
import android.graphics.Path;
import android.webkit.WebView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.compose.AsyncImagePainter;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.viewmodels.AnimationDirection;
import com.squareup.cash.blockers.viewmodels.EarnerUpsellBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.views.SavingsTransferOptionSelectionScreenKt$WhenMappings;
import com.squareup.cash.booklet.ui.RealBookletGridScope;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDetailsViewEvent;
import com.squareup.cash.buynowpaylater.views.AfterPayOrderHubInfoTileView;
import com.squareup.cash.buynowpaylater.views.AfterPayPurchaseDetailsView;
import com.squareup.cash.buynowpaylater.views.AfterPaySectionRowView;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter;
import com.squareup.cash.card.onboarding.CashtagDrawable;
import com.squareup.cash.card.onboarding.InteractiveCardView;
import com.squareup.cash.card.onboarding.StyledCardPerspectiveView;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.db2.contacts.Alias$Adapter;
import com.squareup.cash.graphics.views.TextureViewFpsTracker;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.payments.viewmodels.ScheduleCalendarDate;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.rewardly.common.RewardSlotState;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class RewardSlotQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ RewardSlotQueries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries, byte b) {
        this.$r8$classId = 15;
        UserRewardsDataQueries$userRewardsData$2 userRewardsDataQueries$userRewardsData$2 = UserRewardsDataQueries$userRewardsData$2.INSTANCE;
        this.f$1 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v18, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v26, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Icons icons;
        String str;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                RewardSlotQueries$slots$2 rewardSlotQueries$slots$2 = RewardSlotQueries$slots$2.INSTANCE;
                RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) obj2;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                Alias$Adapter alias$Adapter = (Alias$Adapter) rewardSlotQueries.rewardSlotAdapter;
                Reward$Adapter reward$Adapter = (Reward$Adapter) rewardSlotQueries.rewardAdapter;
                Enum m = NavAction$$ExternalSyntheticOutline0.m(androidCursor, 0, alias$Adapter.sync_stateAdapter);
                String string2 = androidCursor.getString(1);
                String string3 = androidCursor.getString(2);
                String string4 = androidCursor.getString(3);
                ?? bytes = androidCursor.getBytes(4);
                UiRewardAvatars uiRewardAvatars = bytes != 0 ? (UiRewardAvatars) ((WireAdapter) reward$Adapter.avatarsAdapter).decode(bytes) : null;
                String string5 = androidCursor.getString(5);
                String string6 = androidCursor.getString(6);
                ?? bytes2 = androidCursor.getBytes(7);
                List list = bytes2 != 0 ? (List) ((WireRepeatedAdapter) reward$Adapter.program_detail_rowsAdapter).decode(bytes2) : null;
                String string7 = androidCursor.getString(8);
                ?? bytes3 = androidCursor.getBytes(9);
                List list2 = bytes3 != 0 ? (List) ((WireRepeatedAdapter) reward$Adapter.boost_detail_rowsAdapter).decode(bytes3) : null;
                ?? bytes4 = androidCursor.getBytes(10);
                List list3 = bytes4 != 0 ? (List) ((WireRepeatedAdapter) reward$Adapter.boost_attributesAdapter).decode(bytes4) : null;
                String string8 = androidCursor.getString(11);
                Long l = androidCursor.getLong(12);
                Long l2 = androidCursor.getLong(13);
                String string9 = androidCursor.getString(14);
                ?? bytes5 = androidCursor.getBytes(15);
                UiRewardSelectionState uiRewardSelectionState = bytes5 != 0 ? (UiRewardSelectionState) ((WireAdapter) reward$Adapter.reward_selection_stateAdapter).decode(bytes5) : null;
                Boolean bool = androidCursor.getBoolean(16);
                String string10 = androidCursor.getString(17);
                String string11 = androidCursor.getString(18);
                String string12 = androidCursor.getString(19);
                Boolean bool2 = androidCursor.getBoolean(20);
                ?? bytes6 = androidCursor.getBytes(21);
                UiRewardProgramDetails.BottomUpsell bottomUpsell = bytes6 != 0 ? (UiRewardProgramDetails.BottomUpsell) ((WireAdapter) reward$Adapter.boost_detail_bottom_upsellAdapter).decode(bytes6) : null;
                Boolean bool3 = androidCursor.getBoolean(22);
                Boolean bool4 = androidCursor.getBoolean(23);
                ?? bytes7 = androidCursor.getBytes(24);
                Object[] objArr = {m, string2, string3, string4, uiRewardAvatars, string5, string6, list, string7, list2, list3, string8, l, l2, string9, uiRewardSelectionState, bool, string10, string11, string12, bool2, bottomUpsell, bool3, bool4, bytes7 != 0 ? (AppLinks) ((WireAdapter) reward$Adapter.app_linksAdapter).decode(bytes7) : null};
                if (objArr.length != 25) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 25 arguments");
                    return null;
                }
                RewardSlotState rewardSlotState = (RewardSlotState) objArr[0];
                String str2 = (String) objArr[1];
                String str3 = (String) objArr[2];
                String str4 = (String) objArr[3];
                UiRewardAvatars uiRewardAvatars2 = (UiRewardAvatars) objArr[4];
                String str5 = (String) objArr[5];
                String str6 = (String) objArr[6];
                List list4 = (List) objArr[7];
                String str7 = (String) objArr[8];
                List list5 = (List) objArr[9];
                List list6 = (List) objArr[10];
                String str8 = (String) objArr[11];
                Long l3 = (Long) objArr[12];
                Long l4 = (Long) objArr[13];
                String str9 = (String) objArr[14];
                UiRewardSelectionState uiRewardSelectionState2 = (UiRewardSelectionState) objArr[15];
                Boolean bool5 = (Boolean) objArr[16];
                String str10 = (String) objArr[17];
                String str11 = (String) objArr[18];
                String str12 = (String) objArr[19];
                Boolean bool6 = (Boolean) objArr[20];
                UiRewardProgramDetails.BottomUpsell bottomUpsell2 = (UiRewardProgramDetails.BottomUpsell) objArr[21];
                Boolean bool7 = (Boolean) objArr[22];
                Boolean bool8 = (Boolean) objArr[23];
                AppLinks appLinks = (AppLinks) objArr[24];
                rewardSlotState.getClass();
                return new Slots(rewardSlotState, str2, str3, str4, uiRewardAvatars2, str5, str6, list4, str7, list5, list6, str8, l3, l4, str9, uiRewardSelectionState2, bool5, str10, str11, str12, bool6, bottomUpsell2, bool7, bool8, appLinks);
            case 1:
                RealBookletGridScope realBookletGridScope = (RealBookletGridScope) obj;
                realBookletGridScope.getClass();
                for (EarnerUpsellBlockerViewModel.BookletTileContent.Grid.Item item : ((EarnerUpsellBlockerViewModel.BookletTileContent.Grid) ((EarnerUpsellBlockerViewModel.BookletTileContent) obj2)).items) {
                    Icon icon = item.icon;
                    if (icon == null || (str = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str);
                    }
                    realBookletGridScope.gridBlock(icons, item.title, item.body);
                }
                return Unit.INSTANCE;
            case 2:
                SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj2;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                SavingsTransferOptionSelectionViewModel.Loading loading = savingsTransferOptionSelectionViewModel instanceof SavingsTransferOptionSelectionViewModel.Loading ? (SavingsTransferOptionSelectionViewModel.Loading) savingsTransferOptionSelectionViewModel : null;
                AnimationDirection animationDirection = loading != null ? loading.animationDirection : null;
                int i3 = animationDirection == null ? -1 : SavingsTransferOptionSelectionScreenKt$WhenMappings.$EnumSwitchMapping$0[animationDirection.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    return Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl);
                }
                if (i3 == 2) {
                    return Strings.backwardLoadingTransition(animatedContentTransitionScopeImpl);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 3:
                WebView webView = (WebView) obj2;
                ((Context) obj).getClass();
                return webView;
            case 4:
                RealBoostRepository realBoostRepository = (RealBoostRepository) obj2;
                Slots slots = (Slots) obj;
                slots.getClass();
                String str13 = slots.token;
                return str13 != null ? realBoostRepository.boostProvider.getBoost(str13) : new AppLockMonitor$special$$inlined$map$2(null, 19);
            case 5:
                int i4 = BoostConfigQueries$get$2.$r8$clinit;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                Long l5 = androidCursor2.getLong(0);
                ?? bytes8 = androidCursor2.getBytes(1);
                return new BoostConfig(l5, bytes8 != 0 ? (GetBoostConfigResponse.BtcBoostUpsell) ((Local_tab_content.Adapter) localTabContentQueries.local_tab_contentAdapter).responseAdapter.decode(bytes8) : null);
            case 6:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, ((RewardMerchantQueries$RewardForMerchantTokenQuery) obj2).merchant_token);
                return Unit.INSTANCE;
            case 7:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, ((RewardMerchantQueries$RewardForMerchantTokenQuery) obj2).merchant_token);
                return Unit.INSTANCE;
            case 8:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, ((RewardMerchantQueries$RewardForMerchantTokenQuery) obj2).merchant_token);
                return Unit.INSTANCE;
            case 9:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, ((RewardQueries.ForIdQuery) obj2).token);
                return Unit.INSTANCE;
            case 10:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                Iterator it = ((Collection) ((RewardQueries.ForIdsQuery) obj2).token).iterator();
                while (it.hasNext()) {
                    androidStatement5.bindString(i2, (String) it.next());
                    i2++;
                }
                return Unit.INSTANCE;
            case 11:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, ((RewardQueries.ForIdQuery) obj2).token);
                return Unit.INSTANCE;
            case 12:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 13:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 14:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 15:
                UserRewardsDataQueries$userRewardsData$2 userRewardsDataQueries$userRewardsData$2 = UserRewardsDataQueries$userRewardsData$2.INSTANCE;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                Boolean bool9 = androidCursor3.getBoolean(0);
                bool9.getClass();
                Boolean bool10 = androidCursor3.getBoolean(1);
                bool10.getClass();
                ?? bytes9 = androidCursor3.getBytes(2);
                return userRewardsDataQueries$userRewardsData$2.invoke(bool9, bool10, bytes9 != 0 ? (Money) ((BlockersConfig.Adapter) localTabContentQueries2.local_tab_contentAdapter).target_balance_amountAdapter.decode(bytes9) : null);
            case 16:
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click.getClass();
                if (promotedAppletTileViewEvent$Click.equals(PromotedAppletTileViewEvent$Click.INSTANCE)) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, ((BorrowLimitHubViewModel) obj2).title);
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 18:
                AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) obj;
                error.getClass();
                Function1 function1 = ((PainterRequest) obj2).onError;
                if (function1 != null) {
                    function1.invoke(new RuntimeException("Error loading avatar: " + error));
                }
                return Unit.INSTANCE;
            case 19:
                Timeline.Event event = (Timeline.Event) obj;
                event.getClass();
                String str14 = event.tap_action_url;
                str14.getClass();
                ((BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3) obj2).invoke(str14);
                return Unit.INSTANCE;
            case 20:
                BorrowAppletLoanHistoryTile.Data.Loan loan = (BorrowAppletLoanHistoryTile.Data.Loan) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                LocalizedString localizedString = loan.primary_text;
                localizedString.getClass();
                String str15 = localizedString.translated_value;
                LocalizedString localizedString2 = loan.right_text;
                localizedString2.getClass();
                String str16 = localizedString2.translated_value;
                LocalizedString localizedString3 = loan.secondary_text;
                localizedString3.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, Boxes$$ExternalSyntheticOutline1.m$1(str15, ", ", str16, ", ", localizedString3.translated_value));
                return Unit.INSTANCE;
            case 21:
                String str17 = (String) obj;
                str17.getClass();
                ((AfterPayOrderHubInfoTileView) obj2).onUrlClicked.invoke(str17);
                return Unit.INSTANCE;
            case 22:
                String str18 = (String) obj;
                int i5 = AfterPayPurchaseDetailsView.$r8$clinit;
                str18.getClass();
                Ui.EventReceiver eventReceiver = ((AfterPayPurchaseDetailsView) obj2).eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new AfterPayOrderDetailsViewEvent.OpenUrl(str18));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            case 23:
                AfterPaySectionRowView afterPaySectionRowView = (AfterPaySectionRowView) obj2;
                int i6 = AfterPaySectionRowView.$r8$clinit;
                ((ContourLayout.LayoutSpec) obj).getClass();
                return new XInt(afterPaySectionRowView.m3816leftTENr5nQ(afterPaySectionRowView.detail) - afterPaySectionRowView.m3813getXdipTENr5nQ(8));
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, ((ScheduleCalendarDate) obj2).contentDescription);
                return Unit.INSTANCE;
            case 25:
                InteractiveCardView interactiveCardView = (InteractiveCardView) obj2;
                ((Context) obj).getClass();
                return interactiveCardView;
            case 26:
                StyledCardPerspectiveView styledCardPerspectiveView = (StyledCardPerspectiveView) obj2;
                ((Context) obj).getClass();
                return styledCardPerspectiveView;
            case 27:
                TextureViewFpsTracker textureViewFpsTracker = (TextureViewFpsTracker) obj2;
                float floatValue = ((Float) obj).floatValue();
                if (textureViewFpsTracker != null) {
                    ArrayList arrayList = textureViewFpsTracker.historicalFrames;
                    if (floatValue > RecyclerView.DECELERATION_RATE) {
                        long j = (long) (1000.0f / floatValue);
                        if (1 <= j && j < 100) {
                            arrayList.add(Long.valueOf(j));
                        }
                        if (arrayList.size() > 1000) {
                            arrayList.remove(0);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 28:
                ((CardStylePickerPresenter) obj2).cardStudioQueries.delete$2();
                return Unit.INSTANCE;
            default:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                AndroidPath androidPath = new AndroidPath((Path) ((CashtagDrawable) obj2).cashtagPath$delegate.getValue());
                GrpcMethod grpcMethod = layoutNodeDrawScope.canvasDrawScope.drawContext;
                long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                grpcMethod.getCanvas().save();
                try {
                    ((Extras.Key) grpcMethod.path).m1434clipPathmtrdDE(androidPath, 0);
                    layoutNodeDrawScope.drawContent();
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    throw th;
                }
        }
    }

    public /* synthetic */ RewardSlotQueries$$ExternalSyntheticLambda0(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 5;
        int i = BoostConfigQueries$get$2.$r8$clinit;
        this.f$1 = localTabContentQueries;
    }

    public /* synthetic */ RewardSlotQueries$$ExternalSyntheticLambda0(RewardSlotQueries rewardSlotQueries) {
        this.$r8$classId = 0;
        RewardSlotQueries$slots$2 rewardSlotQueries$slots$2 = RewardSlotQueries$slots$2.INSTANCE;
        this.f$1 = rewardSlotQueries;
    }

    public /* synthetic */ RewardSlotQueries$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
    }
}
