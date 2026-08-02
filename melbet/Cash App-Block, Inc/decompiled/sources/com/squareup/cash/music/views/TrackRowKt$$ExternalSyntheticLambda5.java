package com.squareup.cash.music.views;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.room.Room;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import app.cash.local.views.wallet.LocalHomeViewKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.signature.SignaturesKt$Signature$1$1;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.views.FamilyHomeViewKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.custom.order.CustomOrderGraphPriceModel;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderPriceWidgetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.custom.order.CustomOrderPriceWidgetKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.custom.order.DragWidgetState;
import com.squareup.cash.investing.components.custom.order.GraphState;
import com.squareup.cash.investing.components.custom.order.PriceWidgetState;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class TrackRowKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ float f$3;

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(Function1 function1, RealSheetState realSheetState, MusicViewModel musicViewModel, float f) {
        this.f$1 = function1;
        this.f$0 = realSheetState;
        this.f$2 = musicViewModel;
        this.f$3 = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        float f = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TrackRowKt.TrackRow((Modifier) obj4, (Function1) obj5, (Track) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                MenuSelectorOption menuSelectorOption = (MenuSelectorOption) obj4;
                List list = (List) obj5;
                Function0 function0 = (Function0) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalMenuSelectorKt.LocalMenuSelector(AlphaKt.alpha(SizeKt.fillMaxWidth(companion, 1.0f), f), menuSelectorOption, list, f > 0.1f, function0, false, gapComposer, 0, 32);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.m1335SegmentedTabContentuFdPcIQ((List) obj4, this.f$3, (Function1) obj5, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                LocalHomeViewModel.TabContent tabContent = (LocalHomeViewModel.TabContent) obj4;
                Function1 function1 = (Function1) obj5;
                Function1 function12 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z = tabContent.segmentedTabsEnabled;
                    float f2 = this.f$3;
                    if (z) {
                        gapComposer2.startReplaceGroup(66833582);
                        LocalHomeViewKt.m1335SegmentedTabContentuFdPcIQ(tabContent.widgets, f2, function1, function12, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(67100833);
                        List list2 = tabContent.widgets;
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        LocalHomeViewKt.m1337WalletWidgetList_UE9MAk(null, list2, f2, colors.surface.money.background, function1, gapComposer2, 0, 1);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 4:
                SignatureState signatureState = (SignatureState) obj4;
                StampState stampState = (StampState) obj3;
                Function1 function13 = (Function1) obj5;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(companion, 16.0f), 52.0f), RoundedCornerShapeKt.CircleShape);
                    Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier rotate = RotateKt.rotate(ImageKt.m177backgroundbw27NRU(clip, colors2.component.button.prominent.background.f160default, ColorKt.RectangleShape), f);
                    Icons icons = Icons.Next24;
                    String stringResource = Room.stringResource(gapComposer3, R.string.accessibility_done);
                    boolean changedInstance = gapComposer3.changedInstance(signatureState) | gapComposer3.changedInstance(stampState) | gapComposer3.changed(function13);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CardStudioViewKt$$ExternalSyntheticLambda3(signatureState, stampState, function13);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue, rotate, false, null, gapComposer3, 6, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                FamilyHomeViewKt.m3535FamilyHomeHeader6a0pyJM((FamilyHomeViewModel) obj3, (Function1) obj5, this.f$3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                CustomOrderGraphKt.CurrentPriceLine((TextGeometricTransformKt) obj5, this.f$3, (Function0) obj3, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(3073));
                break;
            case 7:
                PriceWidgetState priceWidgetState = (PriceWidgetState) obj4;
                GraphState graphState = (GraphState) obj3;
                Function1 function14 = (Function1) obj5;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    DragWidgetState dragWidgetState = (DragWidgetState) priceWidgetState.dragWidgetState$delegate.getValue();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopCenter), 1.0f);
                    boolean changed = gapComposer4.changed(priceWidgetState);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CustomOrderPriceWidgetKt$$ExternalSyntheticLambda0(priceWidgetState, 1);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    Modifier onSizeChanged = RulerKt.onSizeChanged(fillMaxWidth, (Function1) rememberedValue2);
                    boolean changedInstance2 = gapComposer4.changedInstance(graphState) | gapComposer4.changed(priceWidgetState);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CustomOrderPriceWidgetKt$$ExternalSyntheticLambda1(graphState, priceWidgetState, 1);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    Modifier offset = OffsetKt.offset(onSizeChanged, (Function1) rememberedValue3);
                    boolean changed2 = gapComposer4.changed(f);
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new PulsingState$$ExternalSyntheticLambda0(f, 9);
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    Modifier offset2 = OffsetKt.offset(offset, (Function1) rememberedValue4);
                    CustomOrderGraphPriceModel customOrderGraphPriceModel = (CustomOrderGraphPriceModel) graphState.priceModel$delegate.getValue();
                    List list3 = customOrderGraphPriceModel != null ? customOrderGraphPriceModel.ticks : null;
                    boolean changed3 = gapComposer4.changed(function14) | gapComposer4.changed(priceWidgetState) | gapComposer4.changedInstance(graphState);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new SignaturesKt$Signature$1$1(3, function14, priceWidgetState, graphState);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(offset2, list3, (PointerInputEventHandler) rememberedValue5);
                    boolean changed4 = gapComposer4.changed(function14) | gapComposer4.changedInstance(graphState);
                    Object rememberedValue6 = gapComposer4.rememberedValue();
                    if (changed4 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new IntentLauncher$$ExternalSyntheticLambda0(10, function14, graphState);
                        gapComposer4.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function02 = (Function0) rememberedValue6;
                    boolean changedInstance3 = gapComposer4.changedInstance(graphState);
                    Object rememberedValue7 = gapComposer4.rememberedValue();
                    if (changedInstance3 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new CustomOrderGraphKt$$ExternalSyntheticLambda1(graphState, 2);
                        gapComposer4.updateRememberedValue(rememberedValue7);
                    }
                    Function0 function03 = (Function0) rememberedValue7;
                    boolean changedInstance4 = gapComposer4.changedInstance(graphState);
                    Object rememberedValue8 = gapComposer4.rememberedValue();
                    if (changedInstance4 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new CustomOrderGraphKt$$ExternalSyntheticLambda1(graphState, 1);
                        gapComposer4.updateRememberedValue(rememberedValue8);
                    }
                    Function0 function04 = (Function0) rememberedValue8;
                    boolean changed5 = gapComposer4.changed(function14);
                    Object rememberedValue9 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new InvestingNewsKt$$ExternalSyntheticLambda0(12, function14);
                        gapComposer4.updateRememberedValue(rememberedValue9);
                    }
                    CustomOrderKt.CustomOrderDragWidget(dragWidgetState, function02, function03, function04, pointerInput, (Function0) rememberedValue9, gapComposer4, 0, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            default:
                Function1 function15 = (Function1) obj5;
                RealSheetState realSheetState = (RealSheetState) obj4;
                MusicViewModel musicViewModel = (MusicViewModel) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean changed6 = gapComposer5.changed(function15);
                    Object rememberedValue10 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new MusicViewKt$$ExternalSyntheticLambda0(14, function15);
                        gapComposer5.updateRememberedValue(rememberedValue10);
                    }
                    SheetKt.Sheet((Function0) rememberedValue10, null, realSheetState, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1173659689, new MusicViewKt$$ExternalSyntheticLambda4(musicViewModel, function15, f), gapComposer5), gapComposer5, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(float f, SignatureState signatureState, StampState stampState, Function1 function1) {
        this.f$3 = f;
        this.f$0 = signatureState;
        this.f$2 = stampState;
        this.f$1 = function1;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(Modifier modifier, Function1 function1, Track track, float f, int i) {
        this.f$0 = modifier;
        this.f$1 = function1;
        this.f$2 = track;
        this.f$3 = f;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(TextGeometricTransformKt textGeometricTransformKt, float f, Function0 function0, Modifier modifier, int i) {
        this.f$1 = textGeometricTransformKt;
        this.f$3 = f;
        this.f$2 = function0;
        this.f$0 = modifier;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(LocalHomeViewModel.TabContent tabContent, float f, Function1 function1, Function1 function12) {
        this.f$0 = tabContent;
        this.f$3 = f;
        this.f$1 = function1;
        this.f$2 = function12;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(FamilyHomeViewModel familyHomeViewModel, Function1 function1, float f, Modifier modifier, int i) {
        this.f$2 = familyHomeViewModel;
        this.f$1 = function1;
        this.f$3 = f;
        this.f$0 = modifier;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(PriceWidgetState priceWidgetState, GraphState graphState, float f, Function1 function1) {
        this.f$0 = priceWidgetState;
        this.f$2 = graphState;
        this.f$3 = f;
        this.f$1 = function1;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(List list, float f, Function1 function1, Function1 function12, int i) {
        this.f$0 = list;
        this.f$3 = f;
        this.f$1 = function1;
        this.f$2 = function12;
    }

    public /* synthetic */ TrackRowKt$$ExternalSyntheticLambda5(float f, MenuSelectorOption menuSelectorOption, List list, Function0 function0) {
        this.f$3 = f;
        this.f$0 = menuSelectorOption;
        this.f$1 = list;
        this.f$2 = function0;
    }
}
