package com.anythink.expressad.atsignalcommon.windvane;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: f, reason: collision with root package name */
    protected Context f18077f;

    /* renamed from: g, reason: collision with root package name */
    protected Object f18078g;

    /* renamed from: h, reason: collision with root package name */
    protected WindVaneWebView f18079h;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f18077f = context;
        this.f18079h = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f18078g = obj;
        this.f18079h = windVaneWebView;
    }
}
