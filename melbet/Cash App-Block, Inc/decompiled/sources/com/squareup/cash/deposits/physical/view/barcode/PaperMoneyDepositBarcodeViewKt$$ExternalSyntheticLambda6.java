package com.squareup.cash.deposits.physical.view.barcode;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.fillr.s;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaperMoneyDepositBarcodeViewModel.Ready f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda6(PaperMoneyDepositBarcodeViewModel.Ready ready, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = ready;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier.Companion companion;
        GapComposer gapComposer;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        PaperMoneyDepositBarcodeViewModel.Ready ready = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str = ready.success.barcode_screen_fee_text;
                    if (str == null) {
                        gapComposer2.startReplaceGroup(-545512357);
                        gapComposer2.end(false);
                        gapComposer = gapComposer2;
                        companion = companion2;
                    } else {
                        gapComposer2.startReplaceGroup(-545512356);
                        String stringResource = Room.stringResource(gapComposer2, R.string.barcode_fee_information_content_description);
                        boolean changed = gapComposer2.changed(function1);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(1, function1);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        companion = companion2;
                        zzacp.m2014InlineIconTextQqsJerU(str, Icons.InformationOutline16.painter(gapComposer2), ImageKt.m183clickableoSLSa3U$default(companion2, false, stringResource, null, (Function0) rememberedValue, 13), Strings.getColors(gapComposer2).semantic.text.prominent, null, Strings.getTypography(gapComposer2).labelMedium, Strings.getColors(gapComposer2).semantic.text.prominent, null, 0, 0, 0, 3, false, RecyclerView.DECELERATION_RATE, gapComposer2, Painter.$stable << 3, 0, 30608);
                        gapComposer = gapComposer2;
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                    String str2 = ready.success.subtitle_text;
                    if (str2 == null) {
                        gapComposer.startReplaceGroup(-544763676);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-544763675);
                        Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3836, 0L, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                s.BarcodeFooter(ready, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                s.LoadedBarcodeContent(ready, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PaperMoneyDepositBarcodeViewKt$$ExternalSyntheticLambda6(PaperMoneyDepositBarcodeViewModel.Ready ready, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = ready;
        this.f$1 = function1;
    }
}
