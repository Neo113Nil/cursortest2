package defpackage;

import android.webkit.JavascriptInterface;
import com.yandex.go.payments.mbank.navigation.a;

/* loaded from: classes13.dex */
public final class zzz {
    public final a a;

    public zzz(a aVar) {
        this.a = aVar;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        this.a.invoke(str);
    }
}
