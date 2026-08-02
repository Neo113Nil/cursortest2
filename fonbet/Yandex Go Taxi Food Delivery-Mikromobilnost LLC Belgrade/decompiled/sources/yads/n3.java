package yads;

import android.content.Context;
import android.webkit.WebSettings;

/* loaded from: classes7.dex */
public final class n3 extends mo {
    public n3(Context context) {
        super(context, null);
        setBackgroundColor(-1);
        setInitialScale(1);
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        setDisplayZoomControls(false);
        setScrollbarFadingEnabled(true);
        setDrawingCacheEnabled(true);
        setWebChromeClient(new k3(context));
        setWebViewClient(new l3(context));
    }
}
