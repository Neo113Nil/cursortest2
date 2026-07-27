package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.AbstractC0097a;
import com.icedrifter.arcticquest.R;
import d.AbstractC0110a;
import h.w0;
import java.lang.reflect.Field;
import w.x;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    public int f1114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1115g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1116h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f1117i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1118j;

    /* renamed from: k, reason: collision with root package name */
    public View f1119k;

    /* renamed from: l, reason: collision with root package name */
    public LinearLayout f1120l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1121m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f1122n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1123o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1124p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1125q;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0097a.f1632d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0110a.a(context, resourceId);
        Field field = x.f3069a;
        setBackground(drawable);
        this.f1123o = obtainStyledAttributes.getResourceId(5, 0);
        this.f1124p = obtainStyledAttributes.getResourceId(4, 0);
        this.f1114f = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f1120l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1120l = linearLayout;
            this.f1121m = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1122n = (TextView) this.f1120l.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f1123o;
            if (i2 != 0) {
                this.f1121m.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f1124p;
            if (i3 != 0) {
                this.f1122n.setTextAppearance(getContext(), i3);
            }
        }
        this.f1121m.setText(this.f1117i);
        this.f1122n.setText(this.f1118j);
        boolean isEmpty = TextUtils.isEmpty(this.f1117i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1118j);
        this.f1122n.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1120l.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1120l.getParent() == null) {
            addView(this.f1120l);
        }
    }

    @Override // android.view.View
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            super.setVisibility(i2);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1114f;
    }

    public CharSequence getSubtitle() {
        return this.f1118j;
    }

    public CharSequence getTitle() {
        return this.f1117i;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0097a.f1629a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1116h = false;
        }
        if (!this.f1116h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1116h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1116h = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1117i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean a2 = w0.a(this);
        int paddingRight = a2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f1120l;
        if (linearLayout != null && this.f1119k == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f1120l, paddingRight, paddingTop, paddingTop2, a2);
        }
        View view = this.f1119k;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a2);
        }
        if (a2) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int i4 = this.f1114f;
        if (i4 <= 0) {
            i4 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i5 = i4 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f1120l;
        if (linearLayout != null && this.f1119k == null) {
            if (this.f1125q) {
                this.f1120l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1120l.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1120l.setVisibility(z2 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f1119k;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                i5 = Math.min(i8, i5);
            }
            this.f1119k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
        }
        if (this.f1114f > 0) {
            setMeasuredDimension(size, i4);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1115g = false;
        }
        if (!this.f1115g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1115g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1115g = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f1114f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1119k;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1119k = view;
        if (view != null && (linearLayout = this.f1120l) != null) {
            removeView(linearLayout);
            this.f1120l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1118j = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1117i = charSequence;
        a();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1125q) {
            requestLayout();
        }
        this.f1125q = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
