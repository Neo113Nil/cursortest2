package com.squareup.cash.blockers.web.views;

import android.webkit.WebView;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes4.dex */
public abstract class WebViewBlockerViewKt {
    public static final void WebViewBlocker(WebViewBlockerViewModel.LoadUrl loadUrl, WebView webView, Function1 function1, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1925556210);
        int i2 = (gapComposer.changedInstance(loadUrl) ? 4 : 2) | i | (gapComposer.changedInstance(webView) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2 | (gapComposer.changedInstance(function0) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-905707357, new VerifyCheckDepositKt$$ExternalSyntheticLambda14(loadUrl, function1, function0, webView), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(loadUrl, webView, function1, function0, modifier2, i, 22);
        }
    }
}
