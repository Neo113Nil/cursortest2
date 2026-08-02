package com.yandex.passport.internal.ui.bouncer.roundabout.items;

import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.g4i;
import defpackage.qvc;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qvc b;

    public /* synthetic */ a(qvc qvcVar, int i) {
        this.a = i;
        this.b = qvcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                TextView textView = (TextView) obj;
                textView.getClass();
                ViewGroup.LayoutParams a = this.b.a(-2, -2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a;
                layoutParams.width = -1;
                layoutParams.height = -2;
                textView.setLayoutParams(a);
                textView.setMinHeight((int) (56 * g4i.a.density));
                break;
            default:
                WebView webView = (WebView) obj;
                webView.getClass();
                ViewGroup.LayoutParams a2 = this.b.a(-2, -2);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) a2;
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                webView.setLayoutParams(a2);
                webView.getSettings().setJavaScriptEnabled(true);
                break;
        }
        return Unit.a;
    }
}
