package com.squareup.cash.bitcoin.views.dependents;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaet;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class BitcoinDependentWelcomeScreenView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinDependentWelcomeScreenView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(BitcoinDependentWelcomeViewModel bitcoinDependentWelcomeViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1619658687);
        int i2 = (gapComposer.changedInstance(bitcoinDependentWelcomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            zzaet.BitcoinWelcomeScreenContent(bitcoinDependentWelcomeViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0((Object) this, (Object) bitcoinDependentWelcomeViewModel, function1, i, 16);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BitcoinDependentWelcomeViewModel) obj, function1, gapComposer, 0);
    }
}
