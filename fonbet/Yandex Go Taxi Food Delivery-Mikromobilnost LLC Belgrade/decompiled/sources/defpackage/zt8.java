package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes4.dex */
public final class zt8 implements au8 {
    public final WebViewState a;

    public zt8(WebViewState webViewState) {
        this.a = webViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt8) && this.a == ((zt8) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WebState(state=" + this.a + Extension.C_BRAKE;
    }
}
