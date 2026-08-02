package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class ShimmerBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState cornerRadius;
    public Modifier modifier;
    public final ShimmerBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShimmerBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.value = this;
        this.cornerRadius = Updater.mutableStateOf$default(new Dp(RecyclerView.DECELERATION_RATE));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1509612419);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            KeypadKt.MooncakeShimmerBox(null, null, Expect_jvmKt.rememberComposableLambda(-1314421862, new BankingDialogKt$$ExternalSyntheticLambda8(this, 10), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 25);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
