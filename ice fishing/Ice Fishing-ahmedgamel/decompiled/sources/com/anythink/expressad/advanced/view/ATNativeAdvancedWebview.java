package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.expressad.advanced.a.d;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes.dex */
public class ATNativeAdvancedWebview extends WindVaneWebView {

    /* renamed from: d, reason: collision with root package name */
    private static final String f17921d = "ATNativeAdvancedWebview";

    /* renamed from: e, reason: collision with root package name */
    private d f17922e;

    public ATNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f17922e == null) {
                this.f17922e = new d(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f17922e, intentFilter);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void unregisterNetWorkReceiver() {
        try {
            d dVar = this.f17922e;
            if (dVar != null) {
                dVar.a();
                getContext().unregisterReceiver(this.f17922e);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
