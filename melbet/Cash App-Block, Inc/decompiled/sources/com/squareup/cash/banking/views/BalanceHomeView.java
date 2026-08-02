package com.squareup.cash.banking.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.banking.viewmodels.BalanceHomeViewModel;
import com.squareup.cash.ui.SecureScreen;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class BalanceHomeView extends ComposeUiView implements SecureScreen {
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceHomeView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
    }

    public final void Content(BalanceHomeViewModel balanceHomeViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1149820243);
        int i2 = (gapComposer.changedInstance(balanceHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (balanceHomeViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(this.imageLoader), Expect_jvmKt.rememberComposableLambda(-1629941229, new BalanceHomeView$$ExternalSyntheticLambda0(balanceHomeViewModel, function1, i3), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(this, balanceHomeViewModel, function1, i, 9);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((BalanceHomeViewModel) obj, function1, gapComposer, 0);
    }
}
