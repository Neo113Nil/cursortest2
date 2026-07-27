package androidx.versionedparcelable;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.icecatchpuzzle.puzzleicecatch.MainActivity;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DeltaSignalControllerExceptionQ9Pcm3xM4vi6ec751145512476237113 extends WebViewClient {
    public final /* synthetic */ MainActivity ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public DeltaSignalControllerExceptionQ9Pcm3xM4vi6ec751145512476237113(MainActivity mainActivity) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = mainActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MainActivity mainActivity = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        CrimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488 crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488 = mainActivity.GoldenVectorTokenTranspilerLl4tongY1X2lje9BiG49744242518178;
        if (((Boolean) crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488.getValue()).booleanValue()) {
            return;
        }
        FrameLayout frameLayout = mainActivity.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216;
        if (webView == (frameLayout != null ? frameLayout.getChildAt(0) : null)) {
            crimsonRouteProxyParserYwog3BCfcwfHwK4ku572237178265488.setValue(Boolean.TRUE);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        if (uri.startsWith("http")) {
            return false;
        }
        try {
            webView.getContext().startActivity(Intent.parseUri(uri, 1));
        } catch (Throwable unused) {
        }
        return true;
    }
}
