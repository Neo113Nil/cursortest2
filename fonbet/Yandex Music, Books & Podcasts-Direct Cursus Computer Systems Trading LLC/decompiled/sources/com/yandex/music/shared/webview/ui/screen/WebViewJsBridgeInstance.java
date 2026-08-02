package com.yandex.music.shared.webview.ui.screen;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.mfv;
import defpackage.rjp;
import defpackage.tfv;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/yandex/music/shared/webview/ui/screen/WebViewJsBridgeInstance;", "", "", Constants.KEY_VALUE, "", "postMessage", "(Ljava/lang/String;)V", "url", "executeDeeplink", "rjp", "shared-webview-ui"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class WebViewJsBridgeInstance {
    public final rjp a;

    public WebViewJsBridgeInstance(rjp rjpVar) {
        this.a = rjpVar;
    }

    @JavascriptInterface
    @Keep
    public final void executeDeeplink(@NotNull String url) {
        url.getClass();
        rjp rjpVar = this.a;
        mfv mfvVar = (mfv) rjpVar.a;
        Context context = (Context) rjpVar.b;
        mfvVar.getClass();
        context.getClass();
        tfv tfvVar = mfvVar.a;
        Uri parse = Uri.parse(url);
        parse.getClass();
        tfvVar.K(context, parse);
    }

    @JavascriptInterface
    @Keep
    public final void postMessage(@NotNull String value) {
        value.getClass();
    }
}
