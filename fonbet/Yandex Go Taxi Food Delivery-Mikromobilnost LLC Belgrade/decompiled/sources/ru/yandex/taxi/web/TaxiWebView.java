package ru.yandex.taxi.web;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import defpackage.ccy0;
import defpackage.jst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/yandex/taxi/web/TaxiWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "ccy0", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class TaxiWebView extends WebView {
    public static final ccy0 Companion = new ccy0();
    private static boolean wasReInit;

    public TaxiWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (wasReInit) {
            return;
        }
        try {
            new WebView(getContext()).destroy();
            wasReInit = true;
        } catch (Exception e) {
            jst.e.k(e, "Cannot tweak WebView");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxiWebView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TaxiWebView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
