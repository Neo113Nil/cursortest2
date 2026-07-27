package androidx.versionedparcelable;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Message;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.icecatchpuzzle.puzzleicecatch.MainActivity;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class WhiteFieldConstructorEncoderGxVIv5stSbYc2LSHyg98558419473819 extends WebChromeClient {
    public final /* synthetic */ MainActivity ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public WhiteFieldConstructorEncoderGxVIv5stSbYc2LSHyg98558419473819(MainActivity mainActivity) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = mainActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        webView.getClass();
        MainActivity mainActivity = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        WebView webView2 = new WebView(mainActivity);
        int i = MainActivity.MysticCacheMiddlewareWorkerK74IVCqnn6Bp9c5lOi26227906401854;
        mainActivity.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(webView2, false);
        webView2.getSettings().setUserAgentString(webView.getSettings().getUserAgentString());
        FrameLayout frameLayout = mainActivity.KryptonFlowJSONControllerMMV4nnkiUvsQudoSQI12761857557216;
        if (frameLayout != null) {
            frameLayout.addView(webView2);
        }
        Object obj = message != null ? message.obj : null;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport == null) {
            return false;
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.getClass();
        MainActivity mainActivity = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (BlazePulseExecutorVectorX9T7zrg3lwf2GjPHIy93052600711395.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(mainActivity, "android.permission.CAMERA") == 0) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            mainActivity.LunarNodeSerializationAsyncGqWKwJIpkuU32gfKfa39621176469764 = permissionRequest;
            mainActivity.ZenithPathConstructorPrefixQEI28Ir4W3yzE2EuDo23499830707914.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927("android.permission.CAMERA");
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.MysticCacheParserHashmapNCNANojYkqCJuUmK2O16057626810798.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(i);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent;
        MainActivity mainActivity = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        ValueCallback valueCallback2 = mainActivity.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        mainActivity.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390 = valueCallback;
        if (fileChooserParams != null) {
            try {
                createIntent = fileChooserParams.createIntent();
            } catch (ActivityNotFoundException unused) {
                ValueCallback valueCallback3 = mainActivity.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(null);
                }
                mainActivity.LunarNodeAsyncCompressionXhW6Mr3UFps5CRaeph11269602575390 = null;
                return false;
            }
        } else {
            createIntent = null;
        }
        if (createIntent == null) {
            return true;
        }
        mainActivity.HeliosRuntimeSchedulerResourceVlNZWtcxQsT7tCIuM638868795906382.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(createIntent);
        return true;
    }
}
