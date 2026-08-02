package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.dfb;
import defpackage.lh;
import defpackage.mrg0;
import defpackage.tje;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lru/yandex/taxi/design/CheckBoxComponent;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "Llh;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "checked", "Lzy11;", "setChecked", "(Z)V", "isChecked", "()Z", "toggle", "()V", BackendConfig.Restrictions.ENABLED, "setEnabled", "Landroidx/core/view/AccessibilityDelegateCompat;", "provideAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Ldfb;", "externalAccessibilityDelegate", "Ldfb;", "padding", CA20Status.STATUS_USER_I, "size", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CheckBoxComponent extends AppCompatImageView implements Checkable, lh {
    private final dfb externalAccessibilityDelegate;
    private final int padding;
    private final int size;

    public CheckBoxComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.externalAccessibilityDelegate = new dfb();
        int r = tje.r(mrg0.component_safe_image_padding, getContext());
        this.padding = r;
        int r2 = tje.r(mrg0.component_image_holder_size, getContext());
        this.size = r2;
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xw31.G(r, this);
        setLayoutParams(new ViewGroup.LayoutParams(r2, r2));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.externalAccessibilityDelegate.a;
    }

    @Override // defpackage.lh
    /* renamed from: provideAccessibilityDelegate */
    public AccessibilityDelegateCompat getDefaultAccessibilityDelegate() {
        return this.externalAccessibilityDelegate;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        this.externalAccessibilityDelegate.a = checked;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.externalAccessibilityDelegate.b = enabled;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.externalAccessibilityDelegate.a = !r1.a;
    }

    public CheckBoxComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CheckBoxComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CheckBoxComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
