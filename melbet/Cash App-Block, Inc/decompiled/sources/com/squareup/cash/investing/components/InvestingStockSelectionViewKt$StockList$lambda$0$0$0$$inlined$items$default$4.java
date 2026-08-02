package com.squareup.cash.investing.components;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSecurityTileContentModel;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.card.InsightBarChartSelectionState;
import com.squareup.cash.moneybot.views.message.ChatMessageUiKt;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerScreenKt;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkedAccount;
import com.stripe.android.financialconnections.presentation.Async;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import net.idrnd.face.iad.capture.internal.m4;

/* loaded from: classes6.dex */
public final class InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4 implements Function4 {
    public final /* synthetic */ Object $imageLoader$inlined;
    public final /* synthetic */ List $items;
    public final /* synthetic */ Object $model$inlined;
    public final /* synthetic */ Function1 $onEvent$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(List list, Serializable serializable, Function1 function1, Object obj, int i) {
        this.$r8$classId = i;
        this.$items = list;
        this.$model$inlined = serializable;
        this.$onEvent$inlined = function1;
        this.$imageLoader$inlined = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.$r8$classId;
        final int i8 = 5;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = Composer.Companion.Empty;
        final Function1 function1 = this.$onEvent$inlined;
        Object obj6 = this.$model$inlined;
        List list = this.$items;
        Object obj7 = this.$imageLoader$inlined;
        final int i9 = 4;
        final int i10 = 0;
        final int i11 = 1;
        switch (i7) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    final InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel = (InvestingStockSelectionViewModel.SearchResultItemModel) ((ArrayList) list).get(intValue);
                    gapComposer.startReplaceGroup(321697545);
                    boolean z = ((InvestingStockSelectionViewModel.Loaded) obj6) instanceof InvestingStockSelectionViewModel.Loaded.MultiSelect;
                    RealImageLoader realImageLoader = (RealImageLoader) obj7;
                    boolean changed = gapComposer.changed(function1) | gapComposer.changed(searchResultItemModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj5) {
                        rememberedValue = new Function0() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i12 = i10;
                                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel2 = searchResultItemModel;
                                Function1 function12 = function1;
                                switch (i12) {
                                    case 0:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 1:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 2:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel2.entityToken, searchResultItemModel2.symbol));
                                        break;
                                    case 3:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 4:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    default:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel2.entityToken, searchResultItemModel2.symbol));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    boolean changed2 = gapComposer.changed(function1) | gapComposer.changed(searchResultItemModel);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj5) {
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i12 = i11;
                                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel2 = searchResultItemModel;
                                Function1 function12 = function1;
                                switch (i12) {
                                    case 0:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 1:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 2:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel2.entityToken, searchResultItemModel2.symbol));
                                        break;
                                    case 3:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 4:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    default:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel2.entityToken, searchResultItemModel2.symbol));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function02 = (Function0) rememberedValue2;
                    boolean changed3 = gapComposer.changed(function1) | gapComposer.changed(searchResultItemModel);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == obj5) {
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i12 = r3;
                                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel2 = searchResultItemModel;
                                Function1 function12 = function1;
                                switch (i12) {
                                    case 0:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 1:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 2:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel2.entityToken, searchResultItemModel2.symbol));
                                        break;
                                    case 3:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    case 4:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel2.entityToken));
                                        break;
                                    default:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel2.entityToken, searchResultItemModel2.symbol));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    ArcadeBordersKt.SearchResultItem(searchResultItemModel, z, realImageLoader, function0, function02, (Function0) rememberedValue3, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    SchedulingTime schedulingTime = (SchedulingTime) list.get(intValue3);
                    gapComposer2.startReplaceGroup(511511667);
                    boolean areEqual = Intrinsics.areEqual((String) obj6, schedulingTime.scheduling_day_time_token);
                    boolean changed4 = gapComposer2.changed(function1) | gapComposer2.changedInstance(schedulingTime);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    if (changed4 || rememberedValue4 == obj5) {
                        rememberedValue4 = new CardModelView$1$3$4$2(i8, function1, schedulingTime);
                        gapComposer2.updateRememberedValue(rememberedValue4);
                    }
                    FulfillmentRadioCellKt.SchedulingTimeRow(schedulingTime, areEqual, (Function0) rememberedValue4, gapComposer2, 0);
                    if (intValue3 < CollectionsKt__CollectionsKt.getLastIndex((List) obj7)) {
                        gapComposer2.startReplaceGroup(511751916);
                        ModalKt.HorizontalDivider(6, 0, gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(511844172);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((GapComposer) composer3).changed(lazyItemScopeImpl3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    final InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel2 = (InvestingStockSelectionViewModel.SearchResultItemModel) list.get(intValue5);
                    gapComposer3.startReplaceGroup(-134625743);
                    boolean z2 = ((InvestingStockSelectionViewModel.Loaded) obj6) instanceof InvestingStockSelectionViewModel.Loaded.MultiSelect;
                    RealImageLoader realImageLoader2 = (RealImageLoader) obj7;
                    boolean changed5 = gapComposer3.changed(function1) | gapComposer3.changed(searchResultItemModel2);
                    Object rememberedValue5 = gapComposer3.rememberedValue();
                    if (changed5 || rememberedValue5 == obj5) {
                        final int i12 = 3;
                        rememberedValue5 = new Function0() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i122 = i12;
                                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel22 = searchResultItemModel2;
                                Function1 function12 = function1;
                                switch (i122) {
                                    case 0:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 1:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 2:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel22.entityToken, searchResultItemModel22.symbol));
                                        break;
                                    case 3:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 4:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    default:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel22.entityToken, searchResultItemModel22.symbol));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function03 = (Function0) rememberedValue5;
                    boolean changed6 = gapComposer3.changed(function1) | gapComposer3.changed(searchResultItemModel2);
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    if (changed6 || rememberedValue6 == obj5) {
                        rememberedValue6 = new Function0() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i122 = i9;
                                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel22 = searchResultItemModel2;
                                Function1 function12 = function1;
                                switch (i122) {
                                    case 0:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 1:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 2:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel22.entityToken, searchResultItemModel22.symbol));
                                        break;
                                    case 3:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 4:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    default:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel22.entityToken, searchResultItemModel22.symbol));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function04 = (Function0) rememberedValue6;
                    boolean changed7 = gapComposer3.changed(function1) | gapComposer3.changed(searchResultItemModel2);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed7 || rememberedValue7 == obj5) {
                        rememberedValue7 = new Function0() { // from class: com.squareup.cash.investing.components.InvestingStockSelectionViewKt$StockList$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i122 = i8;
                                InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel22 = searchResultItemModel2;
                                Function1 function12 = function1;
                                switch (i122) {
                                    case 0:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 1:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 2:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel22.entityToken, searchResultItemModel22.symbol));
                                        break;
                                    case 3:
                                        function12.invoke(new InvestingStockSelectionViewEvent.ViewStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    case 4:
                                        function12.invoke(new InvestingStockSelectionViewEvent.SelectStockClicked(searchResultItemModel22.entityToken));
                                        break;
                                    default:
                                        function12.invoke(new InvestingStockSelectionViewEvent.MultiSelectStockClicked(searchResultItemModel22.entityToken, searchResultItemModel22.symbol));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue7);
                    }
                    ArcadeBordersKt.SearchResultItem(searchResultItemModel2, z2, realImageLoader2, function03, function04, (Function0) rememberedValue7, gapComposer3, 0);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                LazyItemScopeImpl lazyItemScopeImpl4 = (LazyItemScopeImpl) obj;
                int intValue7 = ((Number) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((GapComposer) composer4).changed(lazyItemScopeImpl4) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((GapComposer) composer4).changed(intValue7) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    InvestingSecurityTileContentModel investingSecurityTileContentModel = (InvestingSecurityTileContentModel) ((ArrayList) list).get(intValue7);
                    gapComposer4.startReplaceGroup(378864757);
                    m4.InvestingSecurityCarouselCard(investingSecurityTileContentModel, (ArrayList) obj6, this.$onEvent$inlined, (RealImageLoader) obj7, gapComposer4, 8);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                LazyItemScopeImpl lazyItemScopeImpl5 = (LazyItemScopeImpl) obj;
                int intValue9 = ((Number) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int intValue10 = ((Number) obj4).intValue();
                MoneybotChatViewModel.Content.Chat chat = (MoneybotChatViewModel.Content.Chat) obj6;
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((GapComposer) composer5).changed(lazyItemScopeImpl5) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((GapComposer) composer5).changed(intValue9) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                    MessageViewModel messageViewModel = (MessageViewModel) list.get(intValue9);
                    gapComposer5.startReplaceGroup(-1304351603);
                    MessageViewModel messageViewModel2 = (MessageViewModel) CollectionsKt.getOrNull(intValue9 - 1, chat.messages);
                    if ((messageViewModel instanceof MessageViewModel.QuickActionsBarViewModel) && (messageViewModel2 instanceof MessageViewModel.MoneybotMessageViewModel)) {
                        gapComposer5.startReplaceGroup(-1304033792);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-1304116438);
                        ((DefaultSizes) gapComposer5.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion, 16.0f));
                        gapComposer5.end(false);
                    }
                    String stableKey = RuntimeHelpersKt.stableKey(messageViewModel, intValue9);
                    Map map = (Map) obj7;
                    Object obj8 = map.get(stableKey);
                    if (obj8 == null) {
                        obj8 = new InsightBarChartSelectionState();
                        map.put(stableKey, obj8);
                    }
                    ChatMessageUiKt.ChatMessageUi(null, messageViewModel, (messageViewModel instanceof MessageViewModel.UserMessageViewModel) && ((MessageViewModel.UserMessageViewModel) messageViewModel).isPending, chat.showRawMarkdown, this.$onEvent$inlined, (InsightBarChartSelectionState) obj8, gapComposer5, 0);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScopeImpl lazyItemScopeImpl6 = (LazyItemScopeImpl) obj;
                int intValue11 = ((Number) obj2).intValue();
                Composer composer6 = (Composer) obj3;
                int intValue12 = ((Number) obj4).intValue();
                Async async = (Async) obj7;
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((GapComposer) composer6).changed(lazyItemScopeImpl6) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((GapComposer) composer6).changed(intValue11) ? 32 : 16;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                    LinkedAccount linkedAccount = (LinkedAccount) list.get(intValue11);
                    gapComposer6.startReplaceGroup(1907664815);
                    boolean contains = ((LinkAccountPickerState.Payload) obj6).selectedAccountIds.contains(linkedAccount.account.id);
                    boolean changed8 = gapComposer6.changed(async) | gapComposer6.changed(function1);
                    Object rememberedValue8 = gapComposer6.rememberedValue();
                    if (changed8 || rememberedValue8 == obj5) {
                        rememberedValue8 = new OverridingUtil.AnonymousClass7(13, async, function1);
                        gapComposer6.updateRememberedValue(rememberedValue8);
                    }
                    LinkAccountPickerScreenKt.NetworkedAccountItem(linkedAccount, (Function1) rememberedValue8, contains, gapComposer6, 0);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingStockSelectionViewKt$StockList$lambda$0$0$0$$inlined$items$default$4(List list, Object obj, Object obj2, Function1 function1, int i) {
        this.$r8$classId = i;
        this.$items = list;
        this.$model$inlined = obj;
        this.$imageLoader$inlined = obj2;
        this.$onEvent$inlined = function1;
    }
}
