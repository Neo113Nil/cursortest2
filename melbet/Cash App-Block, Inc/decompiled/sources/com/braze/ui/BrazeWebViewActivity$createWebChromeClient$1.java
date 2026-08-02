package com.braze.ui;

import android.graphics.Bitmap;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/braze/ui/BrazeWebViewActivity$createWebChromeClient$1", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "cm", "Landroid/webkit/ConsoleMessage;", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BrazeWebViewActivity$createWebChromeClient$1 extends WebChromeClient {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
        int lineNumber = consoleMessage.lineNumber();
        String sourceId = consoleMessage.sourceId();
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        String message = consoleMessage.message();
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Braze WebView Activity log. Line: ", lineNumber, ". SourceId: ", sourceId, ". Log Level: ");
        m.append(messageLevel);
        m.append(". Message: ");
        m.append(message);
        return m.toString();
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage cm) {
        cm.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeWebViewActivity$createWebChromeClient$1$$ExternalSyntheticLambda0(cm, 0), 7, (Object) null);
        return true;
    }
}
