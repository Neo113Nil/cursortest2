package com.anythink.basead.webtemplet.adformat.intestitial;

import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.adformat.WTCommonJSBridgePlugin;

/* loaded from: classes.dex */
public class WTScreenJSBridgePlugin extends WTCommonJSBridgePlugin {

    /* renamed from: c, reason: collision with root package name */
    private final String f11473c = getClass().getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    private a f11474d;

    @Override // com.anythink.basead.webtemplet.adformat.WTCommonJSBridgePlugin, com.anythink.basead.webtemplet.d
    public void initialize(WTWebView wTWebView) {
        super.initialize(wTWebView);
        try {
            if (wTWebView.getJsCommunicationObject() == null || !(wTWebView.getJsCommunicationObject() instanceof a)) {
                return;
            }
            this.f11474d = (a) wTWebView.getJsCommunicationObject();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
