package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: f, reason: collision with root package name */
    protected Context f18864f;

    /* renamed from: g, reason: collision with root package name */
    protected Object f18865g;

    /* renamed from: h, reason: collision with root package name */
    protected WindVaneWebView f18866h;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f18864f = context;
        this.f18866h = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f18865g = obj;
        this.f18866h = windVaneWebView;
    }
}
