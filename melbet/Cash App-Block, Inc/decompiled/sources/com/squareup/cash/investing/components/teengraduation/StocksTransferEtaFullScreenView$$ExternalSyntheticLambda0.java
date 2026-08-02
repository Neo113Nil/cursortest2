package com.squareup.cash.investing.components.teengraduation;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewModel;
import com.squareup.cash.invitations.InviteErrorDialogKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final /* synthetic */ class StocksTransferEtaFullScreenView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ StocksTransferEtaFullScreenView f$0;
    public final /* synthetic */ StocksTransferEtaViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ StocksTransferEtaFullScreenView$$ExternalSyntheticLambda0(StocksTransferEtaFullScreenView stocksTransferEtaFullScreenView, StocksTransferEtaViewModel stocksTransferEtaViewModel, Function1 function1) {
        this.f$0 = stocksTransferEtaFullScreenView;
        this.f$1 = stocksTransferEtaViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        StocksTransferEtaViewModel stocksTransferEtaViewModel = this.f$1;
        StocksTransferEtaFullScreenView stocksTransferEtaFullScreenView = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    long j = MooncakeTheme.getColors(gapComposer).background;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    FormViewModel formViewModel = new FormViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new FormBlocker.Element[]{new FormBlocker.Element("icon", new FormBlocker.Element.AbstractC0072Element.LocalImageElement(new FormBlocker.Element.LocalImageElement(FormBlocker.Element.LocalImageElement.Icon.PENDING, null, null, 6, null)), null, 4, null), new FormBlocker.Element("title", new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(stocksTransferEtaViewModel.title, null, FormBlocker.Element.TextElement.Size.LARGE, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null, 4, null), new FormBlocker.Element("description", new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(stocksTransferEtaViewModel.description, null, FormBlocker.Element.TextElement.Size.MEDIUM, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null, 4, null)}), false, stocksTransferEtaViewModel.doneButtonLabel, null, null, null, false, null, ColorModel.CashGreen.INSTANCE, false, null, null, null, FormBlocker.Element.ButtonElement.Style.SECONDARY, null, null, null, null, false, null, 1038376);
                    KProperty[] kPropertyArr = FormView.$$delegatedProperties;
                    stocksTransferEtaFullScreenView.Form$1(m302paddingqDBjuR0$default, formViewModel, gapComposer, 518);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    NavigationIconType navigationIconType = NavigationIconType.BACK;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InviteErrorDialogKt$$ExternalSyntheticLambda0(17, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    KeypadKt.m3654ToolbarA_Dysh8(null, fillMaxWidth, navigationIconType, 0L, (Function0) rememberedValue, null, gapComposer, 24630, 364);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                stocksTransferEtaFullScreenView.Content(stocksTransferEtaViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ StocksTransferEtaFullScreenView$$ExternalSyntheticLambda0(StocksTransferEtaFullScreenView stocksTransferEtaFullScreenView, StocksTransferEtaViewModel stocksTransferEtaViewModel, Function1 function1, int i) {
        this.f$0 = stocksTransferEtaFullScreenView;
        this.f$1 = stocksTransferEtaViewModel;
        this.f$2 = function1;
    }
}
