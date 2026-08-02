package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class mkf extends FrameLayout {
    public ObjectAnimator a;
    public kkf b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkf(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.95f);
        PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.95f);
        this.b = kkf.b;
    }

    public abstract String a();

    public final void b() {
        this.b = kkf.a;
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.95f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.95f));
        ofPropertyValuesHolder.setDuration(150L);
        ofPropertyValuesHolder.addListener(new lkf(this, 0));
        ofPropertyValuesHolder.start();
        this.a = ofPropertyValuesHolder;
    }

    public final void c(boolean z) {
        ObjectAnimator objectAnimator = this.a;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            if (z) {
                performHapticFeedback(6);
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f));
            ofPropertyValuesHolder.setDuration(300L);
            ofPropertyValuesHolder.addListener(new lkf(this, 1));
            ofPropertyValuesHolder.start();
            this.a = ofPropertyValuesHolder;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "android.widget.RadioButton";
    }

    public final boolean getBorderActivated() {
        return getBorderAlpha() > 0;
    }

    public abstract int getBorderAlpha();

    @NotNull
    public abstract String getName();

    public final int getPosition() {
        return this.c;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo.CollectionItemInfo obtain;
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        int i = this.c;
        axj[] axjVarArr = axj.a;
        if (Build.VERSION.SDK_INT >= 30) {
            obtain = bb.e(1, i, isSelected());
        } else {
            obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(1, 1, i, 1, false, isSelected());
            obtain.getClass();
        }
        accessibilityNodeInfo.setCollectionItemInfo(obtain);
    }

    public final void setBorderActivated(boolean z) {
        setSelected(z);
        setContentDescription(a());
        setBorderAlpha(z ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
    }

    public abstract void setBorderAlpha(int i);

    public abstract void setName(@NotNull String str);

    public final void setPosition(int i) {
        this.c = i;
    }

    public /* synthetic */ mkf(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
