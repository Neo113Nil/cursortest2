package android.content.Context;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterDatabaseSolarQuantum5799 implements FrostHunterPackageManagerAlphaThunderSpeed8996 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterDatabaseSolarQuantum5799(FrostHunterMagnetometerInfernoDragon1607 frostHunterMagnetometerInfernoDragon1607) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
    }

    @Override // android.content.Context.FrostHunterFaceDetectionSparkStormDelta3844
    public final void FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                final WebView webView = (WebView) obj;
                webView.getClass();
                webView.setDownloadListener(new DownloadListener(this) { // from class: android.content.Context.FrostHunterBarrierStormEclipse4128
                    @Override // android.webkit.DownloadListener
                    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        str.getClass();
                        WebView webView2 = webView;
                        webView2.getClass();
                        webView2.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    }
                });
                break;
            case 1:
                WebView webView2 = (WebView) obj;
                webView2.getClass();
                webView2.setLayerType(2, null);
                break;
            default:
                WebView webView3 = (WebView) obj;
                webView3.getClass();
                webView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                break;
        }
    }
}
