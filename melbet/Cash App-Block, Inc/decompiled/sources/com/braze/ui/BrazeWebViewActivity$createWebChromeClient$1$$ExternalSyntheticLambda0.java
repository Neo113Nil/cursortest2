package com.braze.ui;

import android.webkit.ConsoleMessage;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ConsoleMessage f$0;

    public /* synthetic */ BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0(ConsoleMessage consoleMessage, int i) {
        this.$r8$classId = i;
        this.f$0 = consoleMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String onConsoleMessage$lambda$0;
        String onConsoleMessage$lambda$02;
        int i = this.$r8$classId;
        ConsoleMessage consoleMessage = this.f$0;
        switch (i) {
            case 0:
                onConsoleMessage$lambda$0 = BrazeWebViewActivity$createWebChromeClient$1.onConsoleMessage$lambda$0(consoleMessage);
                return onConsoleMessage$lambda$0;
            default:
                onConsoleMessage$lambda$02 = InAppMessageHtmlBaseView$messageWebView$6.onConsoleMessage$lambda$0(consoleMessage);
                return onConsoleMessage$lambda$02;
        }
    }
}
