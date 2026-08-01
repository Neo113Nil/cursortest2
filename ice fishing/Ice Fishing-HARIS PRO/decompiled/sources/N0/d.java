package N0;

import O.D;
import O.K;
import a.AbstractC0078a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import l.o;
import l.z;
import m.d1;
import u0.AbstractC0358a;
import v0.AbstractC0360a;
import x0.C0376a;

/* loaded from: classes.dex */
public abstract class d extends FrameLayout implements z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f636G = {R.attr.state_checked};

    /* renamed from: H, reason: collision with root package name */
    public static final S0.e f637H = new S0.e(3);

    /* renamed from: I, reason: collision with root package name */
    public static final c f638I = new c(3);

    /* renamed from: A, reason: collision with root package name */
    public boolean f639A;

    /* renamed from: B, reason: collision with root package name */
    public int f640B;

    /* renamed from: C, reason: collision with root package name */
    public int f641C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f642D;

    /* renamed from: E, reason: collision with root package name */
    public int f643E;

    /* renamed from: F, reason: collision with root package name */
    public C0376a f644F;

    /* renamed from: a, reason: collision with root package name */
    public boolean f645a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f646b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f647c;

    /* renamed from: d, reason: collision with root package name */
    public int f648d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f649f;

    /* renamed from: g, reason: collision with root package name */
    public float f650g;

    /* renamed from: h, reason: collision with root package name */
    public float f651h;
    public float i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f652k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f653l;

    /* renamed from: m, reason: collision with root package name */
    public final View f654m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f655n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f656o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f657p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f658q;

    /* renamed from: r, reason: collision with root package name */
    public int f659r;

    /* renamed from: s, reason: collision with root package name */
    public int f660s;

    /* renamed from: t, reason: collision with root package name */
    public o f661t;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f662u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f663v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f664w;

    /* renamed from: x, reason: collision with root package name */
    public ValueAnimator f665x;

    /* renamed from: y, reason: collision with root package name */
    public S0.e f666y;

    /* renamed from: z, reason: collision with root package name */
    public float f667z;

    public d(Context context) {
        super(context);
        int i = 0;
        this.f645a = false;
        this.f659r = -1;
        this.f660s = 0;
        this.f666y = f637H;
        this.f667z = RecyclerView.f2111C0;
        this.f639A = false;
        this.f640B = 0;
        this.f641C = 0;
        this.f642D = false;
        this.f643E = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f653l = (FrameLayout) findViewById(com.lumenpath.harispro.hrnavigator.R.id.navigation_bar_item_icon_container);
        this.f654m = findViewById(com.lumenpath.harispro.hrnavigator.R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(com.lumenpath.harispro.hrnavigator.R.id.navigation_bar_item_icon_view);
        this.f655n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.lumenpath.harispro.hrnavigator.R.id.navigation_bar_item_labels_group);
        this.f656o = viewGroup;
        TextView textView = (TextView) findViewById(com.lumenpath.harispro.hrnavigator.R.id.navigation_bar_item_small_label_view);
        this.f657p = textView;
        TextView textView2 = (TextView) findViewById(com.lumenpath.harispro.hrnavigator.R.id.navigation_bar_item_large_label_view);
        this.f658q = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f648d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.e = viewGroup.getPaddingBottom();
        this.f649f = getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = K.f747a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a(i, (A0.a) this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(TextView textView, int i) {
        int round;
        textView.setTextAppearance(i);
        Context context = textView.getContext();
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0358a.f4435F);
            TypedValue typedValue = new TypedValue();
            boolean value = obtainStyledAttributes.getValue(0, typedValue);
            obtainStyledAttributes.recycle();
            if (value) {
                round = typedValue.getComplexUnit() == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                if (round == 0) {
                    textView.setTextSize(0, round);
                    return;
                }
                return;
            }
        }
        round = 0;
        if (round == 0) {
        }
    }

    public static void g(View view, float f2, float f3, int i) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f653l;
        return frameLayout != null ? frameLayout : this.f655n;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof d) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        return getIconOrContainer().getMeasuredHeight() + ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin;
    }

    private int getSuggestedIconWidth() {
        C0376a c0376a = this.f644F;
        int minimumWidth = c0376a == null ? 0 : c0376a.getMinimumWidth() - this.f644F.e.f4751b.f4746w.intValue();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f655n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void h(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void k(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public final void a(float f2, float f3) {
        this.f650g = f2 - f3;
        this.f651h = (f3 * 1.0f) / f2;
        this.i = (f2 * 1.0f) / f3;
    }

    public final void b() {
        o oVar = this.f661t;
        if (oVar != null) {
            setChecked(oVar.isChecked());
        }
    }

    @Override // l.z
    public final void c(o oVar) {
        this.f661t = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.e);
        setId(oVar.f3736a);
        if (!TextUtils.isEmpty(oVar.f3749q)) {
            setContentDescription(oVar.f3749q);
        }
        d1.a(this, !TextUtils.isEmpty(oVar.f3750r) ? oVar.f3750r : oVar.e);
        setVisibility(oVar.isVisible() ? 0 : 8);
        this.f645a = true;
    }

    public final void d() {
        Drawable drawable = this.f647c;
        ColorStateList colorStateList = this.f646b;
        FrameLayout frameLayout = this.f653l;
        RippleDrawable rippleDrawable = null;
        boolean z2 = true;
        if (colorStateList != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f639A && getActiveIndicatorDrawable() != null && frameLayout != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(Q0.a.b(this.f646b), null, activeIndicatorDrawable);
                z2 = false;
            } else if (drawable == null) {
                ColorStateList colorStateList2 = this.f646b;
                int[] iArr = Q0.a.f931d;
                int a2 = Q0.a.a(colorStateList2, Q0.a.f930c);
                int[] iArr2 = Q0.a.f929b;
                drawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a2, Q0.a.a(colorStateList2, iArr2), Q0.a.a(colorStateList2, Q0.a.f928a)}), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = K.f747a;
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f653l;
        if (frameLayout != null && this.f639A) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(float f2, float f3) {
        View view = this.f654m;
        if (view != null) {
            S0.e eVar = this.f666y;
            eVar.getClass();
            view.setScaleX(AbstractC0360a.a(0.4f, 1.0f, f2));
            view.setScaleY(eVar.c(f2, f3));
            view.setAlpha(AbstractC0360a.b(RecyclerView.f2111C0, 1.0f, f3 == RecyclerView.f2111C0 ? 0.8f : 0.0f, f3 == RecyclerView.f2111C0 ? 1.0f : 0.2f, f2));
        }
        this.f667z = f2;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f654m;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public C0376a getBadge() {
        return this.f644F;
    }

    public int getItemBackgroundResId() {
        return com.lumenpath.harispro.hrnavigator.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // l.z
    public o getItemData() {
        return this.f661t;
    }

    public int getItemDefaultMarginResId() {
        return com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f659r;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f656o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + getSuggestedIconHeight() + (viewGroup.getVisibility() == 0 ? this.f649f : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f656o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
    }

    public final void i(View view) {
        if (this.f644F != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C0376a c0376a = this.f644F;
                if (c0376a != null) {
                    if (c0376a.c() != null) {
                        c0376a.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(c0376a);
                    }
                }
            }
            this.f644F = null;
        }
    }

    public final void j(int i) {
        View view = this.f654m;
        if (view == null || i <= 0) {
            return;
        }
        int min = Math.min(this.f640B, i - (this.f643E * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.f642D && this.j == 2) ? min : this.f641C;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        o oVar = this.f661t;
        if (oVar != null && oVar.isCheckable() && this.f661t.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f636G);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0376a c0376a = this.f644F;
        if (c0376a != null && c0376a.isVisible()) {
            o oVar = this.f661t;
            CharSequence charSequence = oVar.e;
            if (!TextUtils.isEmpty(oVar.f3749q)) {
                charSequence = this.f661t.f3749q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            C0376a c0376a2 = this.f644F;
            Object obj = null;
            if (c0376a2.isVisible()) {
                x0.b bVar = c0376a2.e.f4751b;
                String str = bVar.j;
                if (str != null) {
                    String str2 = bVar.f4738o;
                    obj = str2 != null ? str2 : str;
                } else if (!c0376a2.f()) {
                    obj = bVar.f4739p;
                } else if (bVar.f4740q != 0 && (context = (Context) c0376a2.f4713a.get()) != null) {
                    if (c0376a2.f4719h != -2) {
                        int d2 = c0376a2.d();
                        int i = c0376a2.f4719h;
                        if (d2 > i) {
                            obj = context.getString(bVar.f4741r, Integer.valueOf(i));
                        }
                    }
                    obj = context.getResources().getQuantityString(bVar.f4740q, c0376a2.d(), Integer.valueOf(c0376a2.d()));
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.d.e.f887a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.lumenpath.harispro.hrnavigator.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new L.a(i, 1, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f654m;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        d();
    }

    public void setActiveIndicatorEnabled(boolean z2) {
        this.f639A = z2;
        d();
        View view = this.f654m;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f641C = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f649f != i) {
            this.f649f = i;
            b();
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.f643E = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z2) {
        this.f642D = z2;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f640B = i;
        j(getWidth());
    }

    public void setBadge(C0376a c0376a) {
        C0376a c0376a2 = this.f644F;
        if (c0376a2 == c0376a) {
            return;
        }
        boolean z2 = c0376a2 != null;
        ImageView imageView = this.f655n;
        if (z2 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            i(imageView);
        }
        this.f644F = c0376a;
        if (imageView == null || c0376a == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C0376a c0376a3 = this.f644F;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c0376a3.setBounds(rect);
        c0376a3.h(imageView, null);
        if (c0376a3.c() != null) {
            c0376a3.c().setForeground(c0376a3);
        } else {
            imageView.getOverlay().add(c0376a3);
        }
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setChecked(boolean z2) {
        int i;
        TextView textView = this.f658q;
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
        TextView textView2 = this.f657p;
        textView2.setPivotX(textView2.getWidth() / 2);
        textView2.setPivotY(textView2.getBaseline());
        float f2 = z2 ? 1.0f : RecyclerView.f2111C0;
        if (this.f639A && this.f645a) {
            WeakHashMap weakHashMap = K.f747a;
            if (isAttachedToWindow()) {
                ValueAnimator valueAnimator = this.f665x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f665x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f667z, f2);
                this.f665x = ofFloat;
                ofFloat.addUpdateListener(new b(this, f2));
                this.f665x.setInterpolator(AbstractC0078a.X(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionEasingEmphasizedInterpolator, AbstractC0360a.f4481b));
                this.f665x.setDuration(AbstractC0078a.W(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionDurationLong2, getResources().getInteger(com.lumenpath.harispro.hrnavigator.R.integer.material_motion_duration_long_1)));
                this.f665x.start();
                i = this.j;
                ViewGroup viewGroup = this.f656o;
                if (i == -1) {
                    if (i == 0) {
                        if (z2) {
                            h(getIconOrContainer(), this.f648d, 49);
                            k(viewGroup, this.e);
                            textView.setVisibility(0);
                        } else {
                            h(getIconOrContainer(), this.f648d, 17);
                            k(viewGroup, 0);
                            textView.setVisibility(4);
                        }
                        textView2.setVisibility(4);
                    } else if (i == 1) {
                        k(viewGroup, this.e);
                        if (z2) {
                            h(getIconOrContainer(), (int) (this.f648d + this.f650g), 49);
                            g(textView, 1.0f, 1.0f, 0);
                            float f3 = this.f651h;
                            g(textView2, f3, f3, 4);
                        } else {
                            h(getIconOrContainer(), this.f648d, 49);
                            float f4 = this.i;
                            g(textView, f4, f4, 4);
                            g(textView2, 1.0f, 1.0f, 0);
                        }
                    } else if (i == 2) {
                        h(getIconOrContainer(), this.f648d, 17);
                        textView.setVisibility(8);
                        textView2.setVisibility(8);
                    }
                } else if (this.f652k) {
                    if (z2) {
                        h(getIconOrContainer(), this.f648d, 49);
                        k(viewGroup, this.e);
                        textView.setVisibility(0);
                    } else {
                        h(getIconOrContainer(), this.f648d, 17);
                        k(viewGroup, 0);
                        textView.setVisibility(4);
                    }
                    textView2.setVisibility(4);
                } else {
                    k(viewGroup, this.e);
                    if (z2) {
                        h(getIconOrContainer(), (int) (this.f648d + this.f650g), 49);
                        g(textView, 1.0f, 1.0f, 0);
                        float f5 = this.f651h;
                        g(textView2, f5, f5, 4);
                    } else {
                        h(getIconOrContainer(), this.f648d, 49);
                        float f6 = this.i;
                        g(textView, f6, f6, 4);
                        g(textView2, 1.0f, 1.0f, 0);
                    }
                }
                refreshDrawableState();
                setSelected(z2);
            }
        }
        e(f2, f2);
        i = this.j;
        ViewGroup viewGroup2 = this.f656o;
        if (i == -1) {
        }
        refreshDrawableState();
        setSelected(z2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f657p.setEnabled(z2);
        this.f658q.setEnabled(z2);
        this.f655n.setEnabled(z2);
        if (z2) {
            D.a(this, PointerIcon.getSystemIcon(getContext(), 1002));
        } else {
            WeakHashMap weakHashMap = K.f747a;
            D.a(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f663v) {
            return;
        }
        this.f663v = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.f664w = drawable;
            ColorStateList colorStateList = this.f662u;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f655n.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        ImageView imageView = this.f655n;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f662u = colorStateList;
        if (this.f661t == null || (drawable = this.f664w) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.f664w.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemPaddingBottom(int i) {
        if (this.e != i) {
            this.e = i;
            b();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f648d != i) {
            this.f648d = i;
            b();
        }
    }

    public void setItemPosition(int i) {
        this.f659r = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f646b = colorStateList;
        d();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.j != i) {
            this.j = i;
            if (this.f642D && i == 2) {
                this.f666y = f638I;
            } else {
                this.f666y = f637H;
            }
            j(getWidth());
            b();
        }
    }

    public void setShifting(boolean z2) {
        if (this.f652k != z2) {
            this.f652k = z2;
            b();
        }
    }

    public void setTextAppearanceActive(int i) {
        this.f660s = i;
        TextView textView = this.f658q;
        f(textView, i);
        a(this.f657p.getTextSize(), textView.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z2) {
        setTextAppearanceActive(this.f660s);
        TextView textView = this.f658q;
        textView.setTypeface(textView.getTypeface(), z2 ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        TextView textView = this.f657p;
        f(textView, i);
        a(textView.getTextSize(), this.f658q.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f657p.setTextColor(colorStateList);
            this.f658q.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f657p.setText(charSequence);
        this.f658q.setText(charSequence);
        o oVar = this.f661t;
        if (oVar == null || TextUtils.isEmpty(oVar.f3749q)) {
            setContentDescription(charSequence);
        }
        o oVar2 = this.f661t;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.f3750r)) {
            charSequence = this.f661t.f3750r;
        }
        d1.a(this, charSequence);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f647c = drawable;
        d();
    }
}
