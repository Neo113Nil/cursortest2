package com.anythink.basead.webtemplet.adformat.splash;

import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.adformat.WTCommonJSBridgePlugin;

/* loaded from: classes.dex */
public class WTSplashJSBridgePlugin extends WTCommonJSBridgePlugin {

    /* renamed from: c, reason: collision with root package name */
    private final String f12262c = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private a f12263d;

    @Override // com.anythink.basead.webtemplet.adformat.WTCommonJSBridgePlugin, com.anythink.basead.webtemplet.d
    public void initialize(WTWebView wTWebView) {
        super.initialize(wTWebView);
        try {
            if (wTWebView.getJsCommunicationObject() == null || !(wTWebView.getJsCommunicationObject() instanceof a)) {
                return;
            }
            this.f12263d = (a) wTWebView.getJsCommunicationObject();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
