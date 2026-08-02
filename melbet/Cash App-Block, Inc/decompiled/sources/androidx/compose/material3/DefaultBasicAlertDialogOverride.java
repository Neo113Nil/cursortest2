package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.window.DialogProperties;
import com.fillr.featuretoggle.UnleashContext;
import com.squareup.cash.presenters.AliasFormatter;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class DefaultBasicAlertDialogOverride {
    public static final DefaultBasicAlertDialogOverride INSTANCE = new DefaultBasicAlertDialogOverride();

    public final void BasicAlertDialog(UnleashContext unleashContext, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1565826668);
        int i2 = (gapComposer.changed(unleashContext) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            AliasFormatter.Dialog((Function0) unleashContext.userId, (DialogProperties) unleashContext.remoteAddress, Expect_jvmKt.rememberComposableLambda(1163527043, new DateInputKt$DateInputTextField$3(unleashContext, i3), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda0(this, unleashContext, i, 21);
        }
    }
}
