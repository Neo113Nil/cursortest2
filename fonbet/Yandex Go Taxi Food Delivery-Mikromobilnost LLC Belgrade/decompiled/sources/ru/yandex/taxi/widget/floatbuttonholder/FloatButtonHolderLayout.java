package ru.yandex.taxi.widget.floatbuttonholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.tje;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0018\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u001bJ!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u001dJ!\u0010\u0018\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\rR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010&¨\u0006'"}, d2 = {"Lru/yandex/taxi/widget/floatbuttonholder/FloatButtonHolderLayout;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "setupPaddings", "()V", "Landroid/graphics/drawable/Drawable;", "drawable", "Ljava/lang/Runnable;", "clickListener", "Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "createButton", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "icon", "position", "tintAttrId", "addFloatButton", "(ILjava/lang/Runnable;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "drawableIcon", "(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;Ljava/lang/Integer;)Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "button", "(Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;Ljava/lang/Integer;)Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;", "Landroid/view/View;", "(Landroid/view/View;Ljava/lang/Integer;)Landroid/view/View;", "removeFloatButton", "(Lru/yandex/taxi/widget/floatbuttonholder/RotatableFloatButton;)V", "bottomPaddingPx", "setBottomPadding", "(I)V", "setupHorizontalPadding", CA20Status.STATUS_USER_I, "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatButtonHolderLayout extends GoLinearLayout {
    public static final int $stable = 8;
    private int bottomPaddingPx;

    public FloatButtonHolderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.bottomPaddingPx = tje.u(8, getContext());
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClipChildren(false);
        setLayoutDirection(0);
    }

    public static /* synthetic */ RotatableFloatButton addFloatButton$default(FloatButtonHolderLayout floatButtonHolderLayout, int i, Runnable runnable, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        if ((i2 & 8) != 0) {
            num2 = null;
        }
        return floatButtonHolderLayout.addFloatButton(i, runnable, num, num2);
    }

    private final RotatableFloatButton createButton(Drawable drawable, Runnable clickListener) {
        RotatableFloatButton rotatableFloatButton = new RotatableFloatButton(getContext(), null, 0, 0, 14, null);
        c.B(rotatableFloatButton, clickListener);
        rotatableFloatButton.setImageDrawable(drawable);
        return rotatableFloatButton;
    }

    private final void setupPaddings() {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                int u = tje.u(8, getContext());
                int u2 = tje.u(12, getContext());
                int u3 = tje.u(8, getContext()) / 2;
                int i2 = i != 0 ? u3 : u;
                if (i != getChildCount() - 1) {
                    u = u3;
                }
                childAt.setPadding(i2, u2, u, this.bottomPaddingPx);
            }
            i++;
        }
    }

    public final RotatableFloatButton addFloatButton(int icon, Runnable clickListener, Integer position, Integer tintAttrId) {
        RotatableFloatButton addFloatButton = addFloatButton(vng.t(icon, getContext()), clickListener, position);
        if (tintAttrId != null) {
            addFloatButton.setIconTintAttr(tintAttrId.intValue());
        }
        return addFloatButton;
    }

    public final void removeFloatButton(RotatableFloatButton button) {
        removeView(button);
        setupPaddings();
    }

    public final void setBottomPadding(int bottomPaddingPx) {
        this.bottomPaddingPx = bottomPaddingPx;
    }

    public final void setupHorizontalPadding() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                int u = tje.u(12, getContext());
                int u2 = tje.u(8, getContext()) / 2;
                childAt.setPadding(u2, u, u2, this.bottomPaddingPx);
            }
        }
    }

    public static /* synthetic */ RotatableFloatButton addFloatButton$default(FloatButtonHolderLayout floatButtonHolderLayout, Drawable drawable, Runnable runnable, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return floatButtonHolderLayout.addFloatButton(drawable, runnable, num);
    }

    public static /* synthetic */ RotatableFloatButton addFloatButton$default(FloatButtonHolderLayout floatButtonHolderLayout, RotatableFloatButton rotatableFloatButton, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return floatButtonHolderLayout.addFloatButton(rotatableFloatButton, num);
    }

    public static /* synthetic */ View addFloatButton$default(FloatButtonHolderLayout floatButtonHolderLayout, View view, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return floatButtonHolderLayout.addFloatButton(view, num);
    }

    public final RotatableFloatButton addFloatButton(Drawable drawableIcon, Runnable clickListener, Integer position) {
        return addFloatButton(createButton(drawableIcon, clickListener), position);
    }

    public final RotatableFloatButton addFloatButton(RotatableFloatButton button, Integer position) {
        if (position == null) {
            addView(button);
        } else {
            addView(button, position.intValue());
        }
        setupPaddings();
        return button;
    }

    public final View addFloatButton(View button, Integer position) {
        if (position == null) {
            addView(button);
        } else {
            addView(button, position.intValue());
        }
        setupPaddings();
        return button;
    }

    public FloatButtonHolderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public FloatButtonHolderLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public FloatButtonHolderLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ FloatButtonHolderLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
