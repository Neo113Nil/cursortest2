package com.squareup.cash.investing.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.platform.AbstractComposeView;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InvestingHomeDisclosuresView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState disclosureText$delegate;
    public Function1 onLinkClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingHomeDisclosuresView(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.disclosureText$delegate = Updater.mutableStateOf$default(null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        InvestingHomeDisclosuresView$$ExternalSyntheticLambda0 investingHomeDisclosuresView$$ExternalSyntheticLambda0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1920810128);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String str = (String) this.disclosureText$delegate.getValue();
            if (str == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    investingHomeDisclosuresView$$ExternalSyntheticLambda0 = new InvestingHomeDisclosuresView$$ExternalSyntheticLambda0(this, i, 0);
                    endRestartGroup.block = investingHomeDisclosuresView$$ExternalSyntheticLambda0;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(573863845, new SkipPaymentView$$ExternalSyntheticLambda1(12, str, this), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            investingHomeDisclosuresView$$ExternalSyntheticLambda0 = new InvestingHomeDisclosuresView$$ExternalSyntheticLambda0(this, i, 1);
            endRestartGroup.block = investingHomeDisclosuresView$$ExternalSyntheticLambda0;
        }
    }

    public final void setOnLinkClickListener(Function1<? super String, Unit> function1) {
        this.onLinkClick = function1;
    }
}
