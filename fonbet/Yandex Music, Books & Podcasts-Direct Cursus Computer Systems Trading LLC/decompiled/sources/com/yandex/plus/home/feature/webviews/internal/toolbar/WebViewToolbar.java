package com.yandex.plus.home.feature.webviews.internal.toolbar;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.passport.internal.push.x0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.b6e;
import defpackage.btf;
import defpackage.eb;
import defpackage.ern;
import defpackage.f1d;
import defpackage.hy7;
import defpackage.jyr;
import defpackage.s9f;
import defpackage.wdu;
import defpackage.y2x;
import defpackage.yxm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class WebViewToolbar extends ConstraintLayout {
    public static final /* synthetic */ s9f[] A = {new yxm(WebViewToolbar.class, "title", "getTitle()Landroid/widget/TextView;", 0), f1d.c(ern.a, WebViewToolbar.class, "startIcon", "getStartIcon()Landroid/widget/ImageView;", 0), new yxm(WebViewToolbar.class, "endIcon", "getEndIcon()Landroid/widget/ImageView;", 0), new yxm(WebViewToolbar.class, "dashIcon", "getDashIcon()Landroid/view/View;", 0)};
    public final f q;
    public final f r;
    public final f s;
    public final f t;
    public Drawable u;
    public Drawable v;
    public int w;
    public a x;
    public final jyr y;
    public final jyr z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewToolbar(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.q = new f(new b(this, 0));
        this.r = new f(new b(this, 1));
        this.s = new f(new b(this, 2));
        this.t = new f(new b(this, 3));
        this.w = -1;
        this.x = a.b;
        this.y = btf.b(new x0(context, 2));
        this.z = btf.b(new x0(context, 3));
        r1.p(this, R.layout.plus_sdk_webview_toolbar, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.yandex.plus.home.core.design.a.c, i, i2);
        obtainStyledAttributes.getClass();
        try {
            t(this, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            wdu.q(getStartIcon(), new eb(22));
            wdu.q(getEndIcon(), new eb(23));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final View getDashIcon() {
        return (View) this.t.g(A[3]);
    }

    private final ImageView getEndIcon() {
        return (ImageView) this.s.g(A[2]);
    }

    private final int getRippleResId() {
        return ((Number) this.z.getValue()).intValue();
    }

    private final StateListAnimator getScaleAnimator() {
        return (StateListAnimator) this.y.getValue();
    }

    private final ImageView getStartIcon() {
        return (ImageView) this.r.g(A[1]);
    }

    private final TextView getTitle() {
        return (TextView) this.q.g(A[0]);
    }

    public static Unit t(WebViewToolbar webViewToolbar, Context context, TypedArray typedArray) {
        typedArray.getClass();
        int resourceId = typedArray.getResourceId(3, R.color.plus_sdk_gray_600);
        Context context2 = webViewToolbar.getContext();
        context2.getClass();
        webViewToolbar.w = context2.getColor(resourceId);
        webViewToolbar.v = webViewToolbar.u(typedArray.getResourceId(2, R.drawable.plus_sdk_ic_close));
        webViewToolbar.u = webViewToolbar.u(typedArray.getResourceId(0, R.drawable.plus_sdk_ic_arrow_back));
        webViewToolbar.setBackgroundColor(com.yandex.plus.home.common.utils.a.a(context, typedArray.getResourceId(1, R.color.plus_sdk_transparent)));
        webViewToolbar.getTitle().setTextAppearance(typedArray.getResourceId(5, R.style.PlusSDK_TextAppearance_WebViewToolbar));
        int i = typedArray.getInt(4, 0);
        webViewToolbar.x = i != 0 ? i != 1 ? a.b : a.a : a.b;
        return Unit.a;
    }

    public final void setIsDashVisible(boolean z) {
        getDashIcon().setVisibility(z ? 0 : 8);
    }

    public final void setOnEndIconClickListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        r1.E(getEndIcon(), new hy7(8, function0));
    }

    public final void setOnStartIconClickListener(@NotNull Function0<Unit> function0) {
        function0.getClass();
        r1.E(getStartIcon(), new hy7(7, function0));
    }

    public final void setTitle(String str) {
        TextView title = getTitle();
        if (str == null) {
            str = "";
        }
        title.setText(str);
    }

    public final Drawable u(int i) {
        Context context = getContext();
        context.getClass();
        Drawable w = y2x.w(context, i);
        if (w == null) {
            return null;
        }
        w.setTint(this.w);
        return w;
    }

    public final void v() {
        getEndIcon().setVisibility(4);
    }

    public final void w() {
        getStartIcon().setVisibility(4);
    }

    public final void x(ImageView imageView, a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            imageView.setBackground(null);
            imageView.setStateListAnimator(getScaleAnimator());
        } else if (ordinal != 1) {
            b6e.s();
        } else {
            imageView.setBackgroundResource(getRippleResId());
            imageView.setStateListAnimator(null);
        }
    }

    public final void y() {
        getStartIcon().setImageDrawable(this.u);
        x(getStartIcon(), this.x);
        getEndIcon().setContentDescription(getContext().getString(R.string.CloseButton_AccessibilityLabel));
        getStartIcon().setVisibility(0);
    }

    public final void z() {
        getEndIcon().setImageDrawable(this.v);
        x(getEndIcon(), this.x);
        getEndIcon().setContentDescription(getContext().getString(R.string.CloseButton_AccessibilityLabel));
        getEndIcon().setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewToolbar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewToolbar(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    public /* synthetic */ WebViewToolbar(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.plus_sdk_style_WebViewToolbar : i, (i3 & 8) != 0 ? R.style.PlusSDK_Widget_WebViewToolbar : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewToolbar(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
