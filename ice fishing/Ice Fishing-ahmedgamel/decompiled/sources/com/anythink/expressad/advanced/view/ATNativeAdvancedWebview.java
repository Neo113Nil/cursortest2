package com.anythink.expressad.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.expressad.advanced.a.d;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;

/* loaded from: classes.dex */
public class ATNativeAdvancedWebview extends WindVaneWebView {

    /* renamed from: d, reason: collision with root package name */
    private static final String f18708d = "ATNativeAdvancedWebview";

    /* renamed from: e, reason: collision with root package name */
    private d f18709e;

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
            if (this.f18709e == null) {
                this.f18709e = new d(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f18709e, intentFilter);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void unregisterNetWorkReceiver() {
        try {
            d dVar = this.f18709e;
            if (dVar != null) {
                dVar.a();
                getContext().unregisterReceiver(this.f18709e);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
