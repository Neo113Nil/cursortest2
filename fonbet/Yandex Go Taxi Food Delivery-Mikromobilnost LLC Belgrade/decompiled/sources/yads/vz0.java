package yads;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* loaded from: classes7.dex */
public final class vz0 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        consoleMessage.message();
        consoleMessage.sourceId();
        consoleMessage.lineNumber();
        return true;
    }
}
