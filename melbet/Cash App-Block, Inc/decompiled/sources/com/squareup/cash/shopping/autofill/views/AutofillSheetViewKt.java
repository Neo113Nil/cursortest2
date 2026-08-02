package com.squareup.cash.shopping.autofill.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.data.db.RealAppConfigManager$$ExternalSyntheticLambda2;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda2;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class AutofillSheetViewKt {
    public static final ComposableLambdaImpl lambda$1302010073 = new ComposableLambdaImpl(new RealAppConfigManager$$ExternalSyntheticLambda2(11), false, 1302010073);
    public static final ComposableLambdaImpl lambda$1932257925 = new ComposableLambdaImpl(new ShareSheetPresenter$$ExternalSyntheticLambda0(15), false, 1932257925);

    public static final void AutofillSheet(boolean z, AutofillViewModel autofillViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1308656408);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(autofillViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1045162349, new AutofillSheetViewKt$$ExternalSyntheticLambda0(autofillViewModel, z, function1, i3), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardLockViewKt$$ExternalSyntheticLambda2(z, autofillViewModel, function1, i, 20);
        }
    }
}
