package com.plaid.internal;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.plaid.link.R;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: com.plaid.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0334y2 extends FrameLayout {
    public final Lazy a;
    public final P5 b;
    public final Lazy c;
    public final Lazy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334y2(Context context) {
        super(context, null, 0);
        context.getClass();
        this.a = LazyKt.lazy(new C0307v2(this));
        P5 p5 = new P5(context);
        this.b = p5;
        this.c = LazyKt.lazy(new C0325x2(this));
        this.d = LazyKt.lazy(new C0316w2(this));
        if ((getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        View.inflate(context, R.layout.plaid_link_embedded_view, this);
        ((FrameLayout) findViewById(R.id.embedded_webview_container)).addView(p5);
    }

    public final ProgressBar getProgressBar$link_sdk_release() {
        Object value = this.a.getValue();
        value.getClass();
        return (ProgressBar) value;
    }

    public final View getRetryButton$link_sdk_release() {
        Object value = this.d.getValue();
        value.getClass();
        return (View) value;
    }

    public final View getRetryContainer$link_sdk_release() {
        Object value = this.c.getValue();
        value.getClass();
        return (View) value;
    }

    public final P5 getWebView$link_sdk_release() {
        return this.b;
    }
}
