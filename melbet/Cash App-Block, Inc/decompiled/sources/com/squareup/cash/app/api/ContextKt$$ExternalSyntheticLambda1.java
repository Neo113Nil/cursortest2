package com.squareup.cash.app.api;

import android.view.View;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.datastore.core.SimpleActor;
import androidx.room.util.DBUtil__DBUtilKt;
import app.cash.arcade.values.BooleanState;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.db.Local_tab_content;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.R;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.db.AfterpayAppletMerchantSheetQueries$getForToken$2;
import com.squareup.cash.afterpayapplet.db.AfterpayAppletQueries$forKey$2;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletInfoSheetViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.agents.applets.presenters.Agent;
import com.squareup.cash.agents.applets.presenters.AgentsState;
import com.squareup.cash.agents.applets.presenters.RealAgentsAppletTileRepository;
import com.squareup.cash.agents.applets.viewmodels.AgentsAppletTileViewModel;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.amountslider.CappedKeypadListener;
import com.squareup.cash.amountslider.FullscreenAmountPickerKt$WhenMappings;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.appmessages.db.CardMessageQueries$cardMessagesByPriority$2;
import com.squareup.cash.appmessages.db.SheetMessageQueries$messageByToken$2;
import com.squareup.cash.appmessages.db.TooltipMessageQueries$tooltipMessagesForPlacement$2;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.list.ListOrderedStandardItemsScope;
import com.squareup.cash.arcade.components.timeline.RenderedRow;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.treehouse.ChildrenList;
import com.squareup.cash.arcade.treehouse.ToggleBinding;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.offers.db.OffersHomeQueries$ForIdQuery;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.amount.AmountModel;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.TooltipMessage;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;
import okio.AsyncTimeout;

/* loaded from: classes5.dex */
public final /* synthetic */ class ContextKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ContextKt$$ExternalSyntheticLambda1(LocalTabContentQueries localTabContentQueries, char c) {
        this.$r8$classId = 18;
        CardMessageQueries$cardMessagesByPriority$2 cardMessageQueries$cardMessagesByPriority$2 = CardMessageQueries$cardMessagesByPriority$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r12v14, types: [com.squareup.cash.db.WireAdapter] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r3v7, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.squareup.cash.db.WireAdapter] */
    /* JADX WARN: Type inference failed for: r4v16, types: [com.squareup.cash.db.WireAdapter] */
    /* JADX WARN: Type inference failed for: r5v5, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.squareup.cash.db.WireAdapter] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 5;
        int i3 = 4;
        int i4 = 0;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((CoroutineScope) obj).getClass();
                return (VariantSandboxedComponent) ((StateFlow) obj2).getValue();
            case 1:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                return AfterpayAppletMerchantSheetQueries$getForToken$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m1431m(androidCursor, 0), androidCursor.getLong(1), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor, 2, ((Local_tab_content.Adapter) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).responseAdapter));
            case 2:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 3:
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                return AfterpayAppletQueries$forKey$2.INSTANCE.invoke(re$$ExternalSyntheticOutline0.m(androidCursor2, 0), androidCursor2.getLong(1), BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor2, 2, ((BlockersConfig.Adapter) ((LocalTabContentQueries) obj2).local_tab_contentAdapter).target_balance_amountAdapter));
            case 4:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindLong(0, Long.valueOf(((OffersHomeQueries$ForIdQuery) obj2).id));
                return Unit.INSTANCE;
            case 5:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((AfterpayAppletHomePresenter) obj2, 15);
            case 6:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((LocalPosCheckInPresenter) obj2, 16);
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                coroutineScope.getClass();
                JobKt.launch$default(coroutineScope, null, null, new AmountPickerCondensedView.AnonymousClass14((LocalHomePresenter) obj2, r10, i2), 3);
                return Unit.INSTANCE;
            case 8:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj;
                listOrderedStandardItemsScope.getClass();
                for (AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList.NumberedItem numberedItem : ((AfterpayAppletInfoSheetViewModel.TextContentItem.NumberedList) obj2).items) {
                    ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new ButtonBinding$$ExternalSyntheticLambda2(numberedItem, i3), true, 407719625);
                    String str = numberedItem.subtitle;
                    listOrderedStandardItemsScope.item(composableLambdaImpl, str != null ? new ComposableLambdaImpl(new ToastKt$$ExternalSyntheticLambda1(str, 12), true, -32024237) : null);
                }
                return Unit.INSTANCE;
            case 9:
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                lazyListMeasuredItem.getClass();
                return Boolean.valueOf(lazyListMeasuredItem.key.equals(((AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RecentlyViewedCarouselViewModel) obj2).title));
            case 10:
                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) obj;
                lazyListMeasuredItem2.getClass();
                return Boolean.valueOf(lazyListMeasuredItem2.key.equals(((AfterpaySearchViewModel.CategoryTilesSectionViewModel) obj2).id));
            case 11:
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) obj;
                lazyListMeasuredItem3.getClass();
                return Boolean.valueOf(lazyListMeasuredItem3.key.equals(((AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.SectionViewModel) obj2).id));
            case 12:
                LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) obj;
                lazyListMeasuredItem4.getClass();
                return Boolean.valueOf(lazyListMeasuredItem4.key.equals(((AfterpaySearchViewModel.BodyViewModel.ResultsViewModel.RowViewModel) obj2).id));
            case 13:
                RealAgentsAppletTileRepository realAgentsAppletTileRepository = (RealAgentsAppletTileRepository) obj2;
                AgentsState agentsState = (AgentsState) obj;
                agentsState.getClass();
                String str2 = realAgentsAppletTileRepository.appletTitle;
                if (agentsState.equals(AgentsState.Loading.INSTANCE)) {
                    return new AgentsAppletTileViewModel.Loading(str2);
                }
                if (!(agentsState instanceof AgentsState.Installed)) {
                    if (agentsState instanceof AgentsState.Failure) {
                        return new AgentsAppletTileViewModel.Failure(str2, ((AgentsState.Failure) agentsState).cause);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ArrayList arrayList = ((AgentsState.Installed) agentsState).agents;
                if (arrayList.isEmpty()) {
                    return new AgentsAppletTileViewModel.Uninstalled(str2, realAgentsAppletTileRepository.appletSubtitle);
                }
                String str3 = realAgentsAppletTileRepository.noActivityText;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Agent) it.next()).avatar);
                }
                return new AgentsAppletTileViewModel.Installed(str2, str3, arrayList2);
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                AmountModel model = ((AmountDisplayState) obj2).getModel();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, DBUtil__DBUtilKt.toDisplayString(model.numberDigits, model.config.contentLabelBuilder$amountview()));
                SemanticsPropertiesKt.m949setLiveRegionhR3wRGc(semanticsPropertyReceiver, 0);
                return Unit.INSTANCE;
            case 15:
                AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj2;
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                String accessibilityLabel = item.getAccessibilityLabel();
                if (accessibilityLabel == null) {
                    accessibilityLabel = item.getLabel();
                }
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, accessibilityLabel);
                return Unit.INSTANCE;
            case 16:
                CappedKeypadListener cappedKeypadListener = (CappedKeypadListener) obj2;
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    cappedKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    cappedKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    cappedKeypadListener.onDecimal();
                }
                return Unit.INSTANCE;
            case 17:
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj2;
                AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = (AnimatedContentTransitionScopeImpl) obj;
                animatedContentTransitionScopeImpl.getClass();
                AmountPickerViewModel.Loading loading = amountPickerViewModel instanceof AmountPickerViewModel.Loading ? (AmountPickerViewModel.Loading) amountPickerViewModel : null;
                AmountPickerViewModel.Loading.AnimationDirection animationDirection = loading != null ? loading.animationDirection : null;
                int i5 = animationDirection == null ? -1 : FullscreenAmountPickerKt$WhenMappings.$EnumSwitchMapping$0[animationDirection.ordinal()];
                if (i5 == -1 || i5 == 1) {
                    return Strings.forwardLoadingTransition(animatedContentTransitionScopeImpl);
                }
                if (i5 == 2) {
                    return Strings.backwardLoadingTransition(animatedContentTransitionScopeImpl);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 18:
                CardMessageQueries$cardMessagesByPriority$2 cardMessageQueries$cardMessagesByPriority$2 = CardMessageQueries$cardMessagesByPriority$2.INSTANCE;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor3, 0);
                String string2 = androidCursor3.getString(1);
                Boolean bool = androidCursor3.getBoolean(2);
                bool.getClass();
                String string3 = androidCursor3.getString(3);
                CardMessage.Placement placement = string3 != null ? (CardMessage.Placement) ((EnumColumnAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).interceptors).decode(string3) : null;
                ?? bytes = androidCursor3.getBytes(4);
                Image image = bytes != 0 ? (Image) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).mappers).decode(bytes) : null;
                String string4 = androidCursor3.getString(5);
                String string5 = androidCursor3.getString(6);
                ?? bytes2 = androidCursor3.getBytes(7);
                AppMessageAction appMessageAction = bytes2 != 0 ? (AppMessageAction) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).keyers).decode(bytes2) : null;
                ?? bytes3 = androidCursor3.getBytes(8);
                Animation animation = bytes3 != 0 ? (Animation) ((WireAdapter) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyFetcherFactories).decode(bytes3) : null;
                ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).getClass();
                Long l = androidCursor3.getLong(9);
                l.getClass();
                Integer valueOf = Integer.valueOf((int) l.longValue());
                Long l2 = androidCursor3.getLong(10);
                r10 = l2 != null ? (Instant) ((AsyncTimeout.Companion) ((ComponentRegistry.Builder) localTabContentQueries.local_tab_contentAdapter).lazyDecoderFactories).decode(Long.valueOf(l2.longValue())) : null;
                boolean booleanValue = bool.booleanValue();
                int intValue = valueOf.intValue();
                m1431m.getClass();
                return new com.squareup.cash.appmessages.db.CardMessage(m1431m, string2, booleanValue, placement, image, string4, string5, appMessageAction, animation, intValue, r10);
            case 19:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 20:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 21:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                Iterator it2 = ((LinkedHashSet) obj2).iterator();
                while (it2.hasNext()) {
                    androidStatement5.bindString(i4, (String) it2.next());
                    i4++;
                }
                return Unit.INSTANCE;
            case 22:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 23:
                SheetMessageQueries$messageByToken$2 sheetMessageQueries$messageByToken$2 = SheetMessageQueries$messageByToken$2.INSTANCE;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor4 = (AndroidCursor) obj;
                String m1431m2 = re$$ExternalSyntheticOutline0.m1431m(androidCursor4, 0);
                String string6 = androidCursor4.getString(1);
                Boolean bool2 = androidCursor4.getBoolean(2);
                bool2.getClass();
                Object m = BalanceFeedKt$$ExternalSyntheticOutline0.m(androidCursor4, 3, (WireAdapter) ((GrpcMethod) localTabContentQueries2.local_tab_contentAdapter).path);
                GrpcMethod grpcMethod = (GrpcMethod) localTabContentQueries2.local_tab_contentAdapter;
                AsyncTimeout.Companion companion = (AsyncTimeout.Companion) grpcMethod.requestAdapter;
                Long l3 = androidCursor4.getLong(4);
                l3.getClass();
                Object decode = companion.decode(l3);
                String string7 = androidCursor4.getString(5);
                Long l4 = androidCursor4.getLong(6);
                l4.getClass();
                Integer valueOf2 = Integer.valueOf((int) l4.longValue());
                Long l5 = androidCursor4.getLong(7);
                return sheetMessageQueries$messageByToken$2.invoke(m1431m2, string6, bool2, m, decode, string7, valueOf2, l5 != null ? (Instant) ((AsyncTimeout.Companion) grpcMethod.responseAdapter).decode(Long.valueOf(l5.longValue())) : null);
            case 24:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, (String) ((RewardQueries.ForIdsQuery) obj2).token);
                return Unit.INSTANCE;
            case 25:
                TooltipMessageQueries$tooltipMessagesForPlacement$2 tooltipMessageQueries$tooltipMessagesForPlacement$2 = TooltipMessageQueries$tooltipMessagesForPlacement$2.INSTANCE;
                LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) obj2;
                AndroidCursor androidCursor5 = (AndroidCursor) obj;
                String m1431m3 = re$$ExternalSyntheticOutline0.m1431m(androidCursor5, 0);
                String string8 = androidCursor5.getString(1);
                Boolean bool3 = androidCursor5.getBoolean(2);
                bool3.getClass();
                String string9 = androidCursor5.getString(3);
                Placement placement2 = string9 != null ? (Placement) ((EnumColumnAdapter) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).scope).decode(string9) : null;
                String string10 = androidCursor5.getString(4);
                TooltipMessage.ArrowPosition arrowPosition = string10 != null ? (TooltipMessage.ArrowPosition) ((EnumColumnAdapter) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).consumeMessage).decode(string10) : null;
                ?? bytes4 = androidCursor5.getBytes(5);
                AppMessageAction appMessageAction2 = bytes4 != 0 ? (AppMessageAction) ((WireAdapter) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).messageQueue).decode(bytes4) : null;
                ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).getClass();
                Long l6 = androidCursor5.getLong(6);
                l6.getClass();
                Integer valueOf3 = Integer.valueOf((int) l6.longValue());
                Long l7 = androidCursor5.getLong(7);
                return tooltipMessageQueries$tooltipMessagesForPlacement$2.invoke(m1431m3, string8, bool3, placement2, arrowPosition, appMessageAction2, valueOf3, l7 != null ? (Instant) ((AsyncTimeout.Companion) ((SimpleActor) localTabContentQueries3.local_tab_contentAdapter).remainingMessages).decode(Long.valueOf(l7.longValue())) : null);
            case 26:
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                ((SearchBarKeyboardState) obj2).setOpen(focusStateImpl.isFocused());
                return Unit.INSTANCE;
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                CollectionItemInfo collectionItemInfo = LazyListLayoutInfoKt.toCollectionItemInfo((RenderedRow.Collapsed) obj2);
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.CollectionItemInfo;
                KProperty kProperty = SemanticsPropertiesKt.$$delegatedProperties[25];
                semanticsPropertyReceiver3.set(semanticsPropertyKey, collectionItemInfo);
                return Unit.INSTANCE;
            case 28:
                ToggleBinding toggleBinding = (ToggleBinding) obj2;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = toggleBinding.state$delegate;
                BooleanState booleanState = new BooleanState(booleanValue2, ((BooleanState) parcelableSnapshotMutableState.getValue()).userEditCount + 1);
                parcelableSnapshotMutableState.setValue(booleanState);
                Function1 function1 = (Function1) ((ParcelableSnapshotMutableState) toggleBinding.onChange$delegate).getValue();
                if (function1 != null) {
                    function1.invoke(booleanState);
                }
                return Unit.INSTANCE;
            default:
                View view = (View) obj;
                view.getClass();
                return Boolean.valueOf(Intrinsics.areEqual((String) view.getTag(R.id.treehouseSlotTag), ((ChildrenList) obj2).slotTag));
        }
    }

    public /* synthetic */ ContextKt$$ExternalSyntheticLambda1(LocalTabContentQueries localTabContentQueries, byte b) {
        this.$r8$classId = 3;
        AfterpayAppletQueries$forKey$2 afterpayAppletQueries$forKey$2 = AfterpayAppletQueries$forKey$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ ContextKt$$ExternalSyntheticLambda1(LocalTabContentQueries localTabContentQueries) {
        this.$r8$classId = 1;
        AfterpayAppletMerchantSheetQueries$getForToken$2 afterpayAppletMerchantSheetQueries$getForToken$2 = AfterpayAppletMerchantSheetQueries$getForToken$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ ContextKt$$ExternalSyntheticLambda1(LocalTabContentQueries localTabContentQueries, int i) {
        this.$r8$classId = 23;
        SheetMessageQueries$messageByToken$2 sheetMessageQueries$messageByToken$2 = SheetMessageQueries$messageByToken$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ ContextKt$$ExternalSyntheticLambda1(LocalTabContentQueries localTabContentQueries, short s) {
        this.$r8$classId = 25;
        TooltipMessageQueries$tooltipMessagesForPlacement$2 tooltipMessageQueries$tooltipMessagesForPlacement$2 = TooltipMessageQueries$tooltipMessagesForPlacement$2.INSTANCE;
        this.f$0 = localTabContentQueries;
    }

    public /* synthetic */ ContextKt$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
