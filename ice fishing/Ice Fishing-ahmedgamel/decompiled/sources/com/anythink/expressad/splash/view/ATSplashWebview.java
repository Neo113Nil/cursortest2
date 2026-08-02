package com.anythink.expressad.splash.view;

import android.content.Context;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes.dex */
public class ATSplashWebview extends WindVaneWebView {

    /* renamed from: d, reason: collision with root package name */
    private static final String f21541d = "ATSplashWebview";

    /* renamed from: e, reason: collision with root package name */
    private String f21542e;

    public ATSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
    }

    public String getRequestId() {
        return this.f21542e;
    }

    public void setRequestId(String str) {
        this.f21542e = str;
    }
}
