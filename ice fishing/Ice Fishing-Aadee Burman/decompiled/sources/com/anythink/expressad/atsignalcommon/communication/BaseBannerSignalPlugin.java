package com.anythink.expressad.atsignalcommon.communication;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;

/* loaded from: classes.dex */
public class BaseBannerSignalPlugin extends j {

    /* renamed from: a, reason: collision with root package name */
    protected c f18019a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18020b = "BaseBannerSignalPlugin";

    public void click(Object obj, String str) {
    }

    public void getFileInfo(Object obj, String str) {
    }

    public void getNetstat(Object obj, String str) {
    }

    public void handlerH5Exception(Object obj, String str) {
    }

    public void increaseOfferFrequence(Object obj, String str) {
    }

    public void init(Object obj, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.expressad.atsignalcommon.windvane.j
    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof c) {
                this.f18019a = (c) context;
            } else {
                if (windVaneWebView.getObject() == null || !(windVaneWebView.getObject() instanceof c)) {
                    return;
                }
                this.f18019a = (c) windVaneWebView.getObject();
            }
        } catch (Throwable unused) {
        }
    }

    public void install(Object obj, String str) {
    }

    public void onSignalCommunication(Object obj, String str) {
    }

    public void openURL(Object obj, String str) {
    }

    public void readyStatus(Object obj, String str) {
    }

    public void reportUrls(Object obj, String str) {
    }

    public void resetCountdown(Object obj, String str) {
    }

    public void sendImpressions(Object obj, String str) {
    }

    public void toggleCloseBtn(Object obj, String str) {
    }

    public void triggerCloseBtn(Object obj, String str) {
    }
}
