package ru.yandex.taxi.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.go.design.view.GoImageView;
import defpackage.ae4;
import defpackage.ce0;
import defpackage.dzg0;
import defpackage.jg;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/widget/BackButton;", "Lcom/yandex/go/design/view/GoImageView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onClick", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Lae4;", "onDismissListener", "setOnDismissListener", "(Lae4;)V", "Lae4;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackButton extends GoImageView {
    private ae4 onDismissListener;

    public /* synthetic */ BackButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.backButtonStyle : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick() {
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : (Activity) ((ContextWrapper) context).getBaseContext();
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.post(new ce0(currentFocus, 15));
        }
        activity.onBackPressed();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ru.yandex.taxi.design.utils.c.B(this, new jg(27, this));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnClickListener(null);
    }

    public final void setOnDismissListener(ae4 onDismissListener) {
    }

    public BackButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BackButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setImageResource(dzg0.ic_arrow_back_24dp);
        setBackgroundResource(dzg0.bg_button_round);
    }

    public BackButton(Context context) {
        this(context, null, 0, 6, null);
    }
}
