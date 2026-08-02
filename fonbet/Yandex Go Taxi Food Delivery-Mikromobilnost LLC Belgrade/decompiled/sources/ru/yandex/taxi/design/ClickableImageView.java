package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.dl40;
import defpackage.e32;
import defpackage.evu0;
import defpackage.f32;
import defpackage.fl40;
import defpackage.ny61;
import defpackage.q94;
import defpackage.r94;
import defpackage.t1c;
import defpackage.udq0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.ui.DebounceClickListener;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/design/ClickableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "analyticsButtonName", "Lzy11;", "setAnalyticsButtonName", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Ljava/lang/Runnable;", "listener", "setDebounceClickListener", "(Ljava/lang/Runnable;)V", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Ljava/lang/String;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClickableImageView extends AppCompatImageView {
    private String analyticsButtonName;

    public /* synthetic */ ClickableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        String str;
        f32 f32Var;
        e32 analyticsContext;
        super.onVisibilityChanged(changedView, visibility);
        if (changedView != this || (str = this.analyticsButtonName) == null || evu0.J(str) || (f32Var = (f32) xw31.f(this)) == null || (analyticsContext = f32Var.getAnalyticsContext()) == null) {
            return;
        }
        if (visibility == 0) {
            analyticsContext.d(str);
        } else {
            analyticsContext.e(str);
        }
    }

    public final void setAnalyticsButtonName(String analyticsButtonName) {
        udq0.I(this, this.analyticsButtonName, analyticsButtonName, getVisibility() == 0);
        this.analyticsButtonName = analyticsButtonName;
    }

    public final void setDebounceClickListener(Runnable listener) {
        if (listener == null) {
            super.setOnClickListener(null);
            setClickable(false);
            return;
        }
        r94 V = udq0.V(this, listener, new t1c(this, 1));
        if (V == null) {
            ny61.g("Required value was null.");
        } else {
            Object context = getContext();
            super.setOnClickListener(new DebounceClickListener(context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0), V));
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l) {
        int i = 0;
        super.setOnClickListener(l == null ? null : new q94(i, l, new t1c(this, i), this));
    }

    public ClickableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ClickableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClickableImageView(Context context) {
        this(context, null, 0, 6, null);
    }
}
