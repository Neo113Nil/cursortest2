package com.squareup.cash.banking.sections;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzade;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class MoreWaysToAddMoneySectionItemKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ BankingDialogKt$$ExternalSyntheticLambda5 f$0;
    public final /* synthetic */ Icons f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ MoreWaysToAddMoneySectionItemKt$$ExternalSyntheticLambda0(Icons icons, String str, BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda5, int i) {
        this.f$1 = icons;
        this.f$2 = str;
        this.f$0 = bankingDialogKt$$ExternalSyntheticLambda5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        String str = this.f$2;
        Icons icons = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), false, null, null, this.f$0, 15);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m183clickableoSLSa3U$default, 8.0f, RecyclerView.DECELERATION_RATE, 2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(1744650983, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 7), gapComposer), Expect_jvmKt.rememberComposableLambda(743595112, new TransfersViewKt$$ExternalSyntheticLambda5(str, 22), gapComposer), null, null, false, true, null, null, CellDefaultAccessory.Push.INSTANCE, 0L, gapComposer, 806879286, 3516);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zzade.AddMoneyOptionRow(icons, str, this.f$0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoreWaysToAddMoneySectionItemKt$$ExternalSyntheticLambda0(BankingDialogKt$$ExternalSyntheticLambda5 bankingDialogKt$$ExternalSyntheticLambda5, Icons icons, String str) {
        this.f$0 = bankingDialogKt$$ExternalSyntheticLambda5;
        this.f$1 = icons;
        this.f$2 = str;
    }
}
