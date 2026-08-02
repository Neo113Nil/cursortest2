package com.squareup.cash.borrow.views;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.core.content.ContextCompat$Api28Impl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.views.brand.profile.LocalBrandLocationMenuCarouselViewKt$LocalBrandLocationMenuCarouselView$1$1$1$1;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.menus.LocalMenuCardKt;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewModel;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.payments.viewmodels.StablecoinWithdrawalOptionRow;
import com.squareup.cash.payments.views.composer.ErrorKt;
import com.squareup.cash.profile.viewmodels.Accessory;
import com.squareup.cash.profile.viewmodels.Channel;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.work.viewmodels.TaxFormItemViewModel;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts$$Lambda$2;

/* loaded from: classes5.dex */
public final class BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3 implements Function4 {
    public final /* synthetic */ ArrayList $items;
    public final /* synthetic */ Function1 $onEvent$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$3(ArrayList arrayList, Function1 function1, int i) {
        this.$r8$classId = i;
        this.$items = arrayList;
        this.$onEvent$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.$r8$classId;
        int i10 = 17;
        String str = null;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        ArrayList arrayList = this.$items;
        Function1 function1 = this.$onEvent$inlined;
        int i11 = 6;
        switch (i9) {
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
                    BorrowHomeViewModel.Tile tile = (BorrowHomeViewModel.Tile) arrayList.get(intValue);
                    gapComposer.startReplaceGroup(-760874084);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    if (tile instanceof BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel) {
                        gapComposer.startReplaceGroup(-1388106079);
                        BorrowHomeKt.CreditLimitAndBorrowButtonTile((BorrowHomeViewModel.Tile.CreditLimitAndBorrowButtonTileModel) tile, function1, null, gapComposer, 0);
                        gapComposer.end(false);
                    } else if (tile instanceof BorrowHomeViewModel.Tile.BulletinTileModel) {
                        gapComposer.startReplaceGroup(-1387982637);
                        BorrowHomeKt.BulletinTile((BorrowHomeViewModel.Tile.BulletinTileModel) tile, function1, null, gapComposer, 0);
                        gapComposer.end(false);
                    } else if (tile instanceof BorrowHomeViewModel.Tile.LoanHistoryTileModel) {
                        gapComposer.startReplaceGroup(-1387873424);
                        BorrowHomeKt.LoanHistoryTile((BorrowHomeViewModel.Tile.LoanHistoryTileModel) tile, function1, null, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        if (!(tile instanceof BorrowHomeViewModel.Tile.PaymentTimelineTileModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 509410018, false);
                        }
                        gapComposer.startReplaceGroup(-1387757236);
                        PaymentTimelineTileKt.PaymentTimelineTile((BorrowHomeViewModel.Tile.PaymentTimelineTileModel) tile, function1, null, gapComposer, 0);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
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
                    LocalBrandLocationMenuCarouselContentModel.Entry entry = (LocalBrandLocationMenuCarouselContentModel.Entry) arrayList.get(intValue3);
                    gapComposer2.startReplaceGroup(-2023711470);
                    Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion, 168.0f);
                    entry.getClass();
                    LocalImage localImage = entry.image;
                    if (localImage == null) {
                        gapComposer2.startReplaceGroup(-2023559479);
                    } else {
                        gapComposer2.startReplaceGroup(211818552);
                        str = LocalViewsKt.getThemedUrl(localImage, gapComposer2);
                    }
                    gapComposer2.end(false);
                    String str2 = str;
                    String str3 = entry.label;
                    MenuItemAvailability menuItemAvailability = entry.availability;
                    String str4 = entry.discountText;
                    boolean z = entry.isPreorder;
                    boolean changed = gapComposer2.changed(entry.token);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj5 = rememberedValue;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        obj5 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj5;
                    boolean changed2 = ((((i2 & 112) ^ 48) > 32 && gapComposer2.changed(intValue3)) || (i2 & 48) == 32) | gapComposer2.changed(function1) | gapComposer2.changedInstance(entry);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    Object obj6 = rememberedValue2;
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        AbstractSignatureParts$$Lambda$2 abstractSignatureParts$$Lambda$2 = new AbstractSignatureParts$$Lambda$2(function1, entry, intValue3, 1);
                        gapComposer2.updateRememberedValue(abstractSignatureParts$$Lambda$2);
                        obj6 = abstractSignatureParts$$Lambda$2;
                    }
                    LocalMenuCardKt.LocalMenuCard(m290width3ABfNKs, null, this.$onEvent$inlined, str2, LocalBrandLocationMenuCarouselViewKt$LocalBrandLocationMenuCarouselView$1$1$1$1.INSTANCE, str3, menuItemAvailability, str4, z, null, mutableInteractionSourceImpl, (Function0) obj6, gapComposer2, 6, 512);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((GapComposer) composer3).changed(lazyGridItemScopeImpl) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    AfterpaySearchViewModel.CategoryTileViewModel categoryTileViewModel = (AfterpaySearchViewModel.CategoryTileViewModel) arrayList.get(intValue5);
                    gapComposer3.startReplaceGroup(-68225831);
                    Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(companion, 1.0f), "AfterpayCategoryTile");
                    boolean changed3 = gapComposer3.changed(function1) | gapComposer3.changedInstance(categoryTileViewModel);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    Object obj7 = rememberedValue3;
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        CardModelView$1$3$4$2 cardModelView$1$3$4$2 = new CardModelView$1$3$4$2(i11, function1, categoryTileViewModel);
                        gapComposer3.updateRememberedValue(cardModelView$1$3$4$2);
                        obj7 = cardModelView$1$3$4$2;
                    }
                    CameraGraph$OperatingMode.AfterpayCategoryTile(testTag, categoryTileViewModel, (Function0) obj7, gapComposer3, 6);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                int intValue7 = ((Number) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    i4 = intValue8 | (((GapComposer) composer4).changed(lazyItemScopeImpl3) ? 4 : 2);
                } else {
                    i4 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i4 |= ((GapComposer) composer4).changed(intValue7) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    StablecoinDepositOptionsViewModel.NetworkRow networkRow = (StablecoinDepositOptionsViewModel.NetworkRow) arrayList.get(intValue7);
                    gapComposer4.startReplaceGroup(-32178106);
                    SendStablecoinViewKt.NetworkRowItem(networkRow, function1, gapComposer4, 0);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                LazyItemScopeImpl lazyItemScopeImpl4 = (LazyItemScopeImpl) obj;
                int intValue9 = ((Number) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    i5 = intValue10 | (((GapComposer) composer5).changed(lazyItemScopeImpl4) ? 4 : 2);
                } else {
                    i5 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    i5 |= ((GapComposer) composer5).changed(intValue9) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                    StablecoinWithdrawalOptionRow stablecoinWithdrawalOptionRow = (StablecoinWithdrawalOptionRow) arrayList.get(intValue9);
                    gapComposer5.startReplaceGroup(-666553575);
                    ErrorKt.WithdrawalOptionRow(stablecoinWithdrawalOptionRow, function1, gapComposer5, 0);
                    gapComposer5.end(false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                LazyItemScopeImpl lazyItemScopeImpl5 = (LazyItemScopeImpl) obj;
                int intValue11 = ((Number) obj2).intValue();
                Composer composer6 = (Composer) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    i6 = intValue12 | (((GapComposer) composer6).changed(lazyItemScopeImpl5) ? 4 : 2);
                } else {
                    i6 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    i6 |= ((GapComposer) composer6).changed(intValue11) ? 32 : 16;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
                    Channel channel = (Channel) arrayList.get(intValue11);
                    gapComposer6.startReplaceGroup(-1852997391);
                    Accessory accessory = channel.accessory;
                    Accessory.Toggle toggle = accessory instanceof Accessory.Toggle ? (Accessory.Toggle) accessory : null;
                    if (toggle != null) {
                        gapComposer6.startReplaceGroup(-1852929533);
                        ChannelListViewKt.ToggleCellItem(function1, channel, toggle, gapComposer6, 0);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-1852851320);
                        ChannelListViewKt.AddButtonCellItem(function1, channel, gapComposer6, 0);
                        gapComposer6.end(false);
                    }
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LazyGridItemScopeImpl lazyGridItemScopeImpl2 = (LazyGridItemScopeImpl) obj;
                int intValue13 = ((Number) obj2).intValue();
                Composer composer7 = (Composer) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    i7 = intValue14 | (((GapComposer) composer7).changed(lazyGridItemScopeImpl2) ? 4 : 2);
                } else {
                    i7 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    i7 |= ((GapComposer) composer7).changed(intValue13) ? 32 : 16;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(i7 & 1, (i7 & 147) != 146)) {
                    String str5 = (String) arrayList.get(intValue13);
                    gapComposer7.startReplaceGroup(-672092525);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 10.0f, 1);
                    boolean changed4 = gapComposer7.changed(function1);
                    Object rememberedValue4 = gapComposer7.rememberedValue();
                    if (changed4 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(17, function1);
                        gapComposer7.updateRememberedValue(rememberedValue4);
                    }
                    ContextCompat$Api28Impl.Emoji(6, gapComposer7, m300paddingVpY3zN4$default, str5, (Function1) rememberedValue4);
                    gapComposer7.end(false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LazyItemScopeImpl lazyItemScopeImpl6 = (LazyItemScopeImpl) obj;
                int intValue15 = ((Number) obj2).intValue();
                Composer composer8 = (Composer) obj3;
                int intValue16 = ((Number) obj4).intValue();
                if ((intValue16 & 6) == 0) {
                    i8 = intValue16 | (((GapComposer) composer8).changed(lazyItemScopeImpl6) ? 4 : 2);
                } else {
                    i8 = intValue16;
                }
                if ((intValue16 & 48) == 0) {
                    i8 |= ((GapComposer) composer8).changed(intValue15) ? 32 : 16;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
                    TaxFormItemViewModel taxFormItemViewModel = (TaxFormItemViewModel) arrayList.get(intValue15);
                    gapComposer8.startReplaceGroup(-693328413);
                    CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1850753793, new DateInputKt$DateInputTextField$3(taxFormItemViewModel, i10), gapComposer8);
                    boolean changed5 = gapComposer8.changed(function1) | gapComposer8.changedInstance(taxFormItemViewModel);
                    Object rememberedValue5 = gapComposer8.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new KClassImpl$Data$$Lambda$22(1, function1, taxFormItemViewModel);
                        gapComposer8.updateRememberedValue(rememberedValue5);
                    }
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue5, false, false, null, null, 0L, push, null, gapComposer8, 805306374, 1530);
                    gapComposer8.end(false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
