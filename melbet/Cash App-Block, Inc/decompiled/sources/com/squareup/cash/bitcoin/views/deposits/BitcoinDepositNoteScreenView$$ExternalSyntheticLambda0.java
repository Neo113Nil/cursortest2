package com.squareup.cash.bitcoin.views.deposits;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.viewmodels.deposits.note.BitcoinDepositNoteViewModel;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinDepositNoteScreenView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BitcoinDepositNoteScreenView f$0;
    public final /* synthetic */ BitcoinDepositNoteViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ BitcoinDepositNoteScreenView$$ExternalSyntheticLambda0(BitcoinDepositNoteScreenView bitcoinDepositNoteScreenView, BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel, Function1 function1) {
        this.$r8$classId = 1;
        this.f$0 = bitcoinDepositNoteScreenView;
        this.f$1 = bitcoinDepositNoteViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel = this.f$1;
        BitcoinDepositNoteScreenView bitcoinDepositNoteScreenView = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                bitcoinDepositNoteScreenView.Content(bitcoinDepositNoteViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    KProperty[] kPropertyArr = FormView.$$delegatedProperties;
                    bitcoinDepositNoteScreenView.HandleFormViewEvents(bitcoinDepositNoteViewModel, function1, gapComposer, 512);
                    long j = MooncakeTheme.getColors(gapComposer).background;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                    bitcoinDepositNoteScreenView.Form(SizeKt.fillMaxSize(companion, 1.0f), new FormViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new FormBlocker.Element[]{new FormBlocker.Element("title", new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(Room.stringResource(gapComposer, R.string.bitcoin_deposit_note_prompt), null, FormBlocker.Element.TextElement.Size.LARGE, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null, 4, null), new FormBlocker.Element("title", new FormBlocker.Element.AbstractC0072Element.TextInputElement(new FormBlocker.Element.TextInputElement(CollectionsKt__CollectionsJVMKt.listOf(new FormBlocker.Element.TextInputElement.InputField(Room.stringResource(gapComposer, R.string.bitcoin_deposit_note_helper_text), bitcoinDepositNoteViewModel.note, null, null, CollectionsKt__CollectionsJVMKt.listOf(bitcoinDepositNoteViewModel.isEdit ? new FormBlocker.Element.TextInputElement.Validation("^.{0,21}$", null, null, 6, null) : new FormBlocker.Element.TextInputElement.Validation("^.{1,21}$", null, null, 6, null)), null, null, null, null, null, null, null, null, 8172, null)), null, null, 6, null)), null, 4, null)}), true, Room.stringResource(gapComposer, R.string.bitcoin_deposit_note_button), null, null, null, false, null, ColorModel.Bitcoin.INSTANCE, true, null, null, null, null, null, null, null, null, false, null, 1046568), gapComposer, 518);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                bitcoinDepositNoteScreenView.Content(bitcoinDepositNoteViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ BitcoinDepositNoteScreenView$$ExternalSyntheticLambda0(BitcoinDepositNoteScreenView bitcoinDepositNoteScreenView, BitcoinDepositNoteViewModel bitcoinDepositNoteViewModel, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = bitcoinDepositNoteScreenView;
        this.f$1 = bitcoinDepositNoteViewModel;
        this.f$2 = function1;
    }
}
