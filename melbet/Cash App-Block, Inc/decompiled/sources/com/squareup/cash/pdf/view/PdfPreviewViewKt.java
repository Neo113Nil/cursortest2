package com.squareup.cash.pdf.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class PdfPreviewViewKt {
    public static final ComposableLambdaImpl lambda$1443514694 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(17), false, 1443514694);

    /* renamed from: lambda$-314136325, reason: not valid java name */
    public static final ComposableLambdaImpl f563lambda$314136325 = new ComposableLambdaImpl(new ComposableSingletons$PdfPreviewViewKt$$ExternalSyntheticLambda1(0), false, -314136325);

    public static final void PdfPreview(PdfPreviewViewModel pdfPreviewViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(954138456);
        int i2 = (gapComposer.changedInstance(pdfPreviewViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1478437139, new PdfPreviewViewKt$$ExternalSyntheticLambda0(pdfPreviewViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(pdfPreviewViewModel, function1, modifier, i);
        }
    }
}
