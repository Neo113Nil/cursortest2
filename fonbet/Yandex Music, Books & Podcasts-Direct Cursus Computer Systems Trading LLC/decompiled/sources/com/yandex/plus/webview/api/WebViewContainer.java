package com.yandex.plus.webview.api;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class WebViewContainer extends ConstraintLayout {
    public static final /* synthetic */ s9f[] r;
    public final com.yandex.plus.bdui.plus.content.controller.f q;

    static {
        yxm yxmVar = new yxm(WebViewContainer.class, "webView", "getWebView()Landroid/webkit/WebView;", 0);
        ern.a.getClass();
        r = new s9f[]{yxmVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewContainer(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.q = new com.yandex.plus.bdui.plus.content.controller.f(new com.yandex.passport.common.util.e(11, this));
        r1.p(this, R.layout.plus_sdk_webview, true);
    }

    @NotNull
    public final WebView getWebView() {
        return (WebView) this.q.g(r[0]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewContainer(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ WebViewContainer(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewContainer(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
