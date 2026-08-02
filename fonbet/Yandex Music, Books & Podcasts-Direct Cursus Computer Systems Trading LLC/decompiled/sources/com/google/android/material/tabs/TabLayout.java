package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.dhm;
import defpackage.ehm;
import defpackage.etn;
import defpackage.fxf;
import defpackage.g1s;
import defpackage.h1s;
import defpackage.h2k;
import defpackage.i1s;
import defpackage.ivf;
import defpackage.j1s;
import defpackage.k1s;
import defpackage.ken;
import defpackage.kk2;
import defpackage.l1s;
import defpackage.leo;
import defpackage.lgu;
import defpackage.lk2;
import defpackage.mi;
import defpackage.mk2;
import defpackage.ngg;
import defpackage.nr2;
import defpackage.o2b;
import defpackage.pdu;
import defpackage.qb;
import defpackage.re3;
import defpackage.rvf;
import defpackage.s7g;
import defpackage.szf;
import defpackage.tb;
import defpackage.ub;
import defpackage.vdn;
import defpackage.w0s;
import defpackage.wdu;
import defpackage.wm0;
import defpackage.xq0;
import defpackage.y2x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    public static final ehm G0 = new ehm(16);
    public int A;
    public nr2 A0;
    public final int B;
    public k1s B0;
    public int C;
    public g1s C0;
    public int D;
    public boolean D0;
    public boolean E;
    public int E0;
    public boolean F;
    public final dhm F0;
    public int G;
    public int H;
    public boolean I;
    public com.google.android.material.tabs.a J;
    public final TimeInterpolator K;
    public h1s L;
    public int a;
    public final ArrayList b;
    public b c;
    public final j1s d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public int p;
    public final PorterDuff.Mode q;
    public final float r;
    public final float s;
    public final float t;
    public final int u;
    public int v;
    public final ArrayList v0;
    public final int w;
    public l1s w0;
    public final int x;
    public ValueAnimator x0;
    public final int y;
    public lgu y0;
    public final int z;
    public h2k z0;

    public final class a extends LinearLayout {
        public static final /* synthetic */ int l = 0;
        public b a;
        public TextView b;
        public ImageView c;
        public View d;
        public kk2 e;
        public View f;
        public TextView g;
        public ImageView h;
        public Drawable i;
        public int j;

        public a(@NonNull Context context) {
            super(context);
            this.j = 2;
            f(context);
            setPaddingRelative(TabLayout.this.e, TabLayout.this.f, TabLayout.this.g, TabLayout.this.h);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap weakHashMap = wdu.a;
            pdu.a(this, systemIcon);
        }

        private kk2 getBadge() {
            return this.e;
        }

        @NonNull
        private kk2 getOrCreateBadge() {
            if (this.e == null) {
                this.e = new kk2(getContext());
            }
            c();
            kk2 kk2Var = this.e;
            if (kk2Var != null) {
                return kk2Var;
            }
            xq0.q("Unable to create badge");
            return null;
        }

        public final void a(View view) {
            if (this.e == null || view == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            kk2 kk2Var = this.e;
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            kk2Var.setBounds(rect);
            kk2Var.i(view, null);
            if (kk2Var.d() != null) {
                kk2Var.d().setForeground(kk2Var);
            } else {
                view.getOverlay().add(kk2Var);
            }
            this.d = view;
        }

        public final void b() {
            if (this.e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.d;
                if (view != null) {
                    kk2 kk2Var = this.e;
                    if (kk2Var != null) {
                        if (kk2Var.d() != null) {
                            kk2Var.d().setForeground(null);
                        } else {
                            view.getOverlay().remove(kk2Var);
                        }
                    }
                    this.d = null;
                }
            }
        }

        public final void c() {
            b bVar;
            if (this.e != null) {
                if (this.f != null) {
                    b();
                    return;
                }
                ImageView imageView = this.c;
                if (imageView != null && (bVar = this.a) != null && bVar.a != null) {
                    if (this.d == imageView) {
                        d(imageView);
                        return;
                    } else {
                        b();
                        a(this.c);
                        return;
                    }
                }
                TextView textView = this.b;
                if (textView == null || this.a == null) {
                    b();
                } else if (this.d == textView) {
                    d(textView);
                } else {
                    b();
                    a(this.b);
                }
            }
        }

        public final void d(View view) {
            kk2 kk2Var = this.e;
            if (kk2Var == null || view != this.d) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            kk2Var.setBounds(rect);
            kk2Var.i(view, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            boolean z;
            g();
            b bVar = this.a;
            if (bVar != null) {
                TabLayout tabLayout = bVar.f;
                if (tabLayout == null) {
                    xq0.x("Tab not attached to a TabLayout");
                    return;
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == bVar.d) {
                    z = true;
                    setSelected(z);
                }
            }
            z = false;
            setSelected(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$a] */
        public final void f(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.u;
            if (i != 0) {
                Drawable w = y2x.w(context, i);
                this.i = w;
                if (w != null && w.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            } else {
                this.i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (tabLayout.n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateList = tabLayout.n;
                int[] iArr = leo.d;
                int a = leo.a(colorStateList, leo.c);
                int[] iArr2 = leo.b;
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{a, leo.a(colorStateList, iArr2), leo.a(colorStateList, leo.a)});
                boolean z = tabLayout.I;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z ? null : gradientDrawable2);
            }
            setBackground(gradientDrawable);
            tabLayout.invalidate();
        }

        public final void g() {
            int i;
            ViewParent parent;
            b bVar = this.a;
            View view = bVar != null ? bVar.e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f);
                    }
                    addView(view);
                }
                this.f = view;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.g = textView2;
                if (textView2 != null) {
                    this.j = textView2.getMaxLines();
                }
                this.h = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f;
                if (view3 != null) {
                    removeView(view3);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ru.yandex.music.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ru.yandex.music.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.b = textView3;
                    addView(textView3);
                    this.j = this.b.getMaxLines();
                }
                TextView textView4 = this.b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.i);
                if (!isSelected() || (i = tabLayout.k) == -1) {
                    this.b.setTextAppearance(tabLayout.j);
                } else {
                    this.b.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.l;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                h(this.b, this.c, true);
                c();
                ImageView imageView3 = this.c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new c(this, imageView3));
                }
                TextView textView5 = this.b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new c(this, textView5));
                }
            } else {
                TextView textView6 = this.g;
                if (textView6 != null || this.h != null) {
                    h(textView6, this.h, false);
                }
            }
            if (bVar == null || TextUtils.isEmpty(bVar.c)) {
                return;
            }
            setContentDescription(bVar.c);
        }

        public int getContentHeight() {
            View[] viewArr = {this.b, this.c, this.f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.f};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public b getTab() {
            return this.a;
        }

        public final void h(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            b bVar = this.a;
            Drawable mutate = (bVar == null || (drawable = bVar.a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (mutate != null) {
                mutate.setTintList(tabLayout.m);
                PorterDuff.Mode mode = tabLayout.q;
                if (mode != null) {
                    mutate.setTintMode(mode);
                }
            }
            b bVar2 = this.a;
            CharSequence charSequence = bVar2 != null ? bVar2.b : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (isEmpty) {
                    z2 = false;
                } else {
                    this.a.getClass();
                    z2 = true;
                }
                textView.setText(!isEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!isEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int x = (z2 && imageView.getVisibility() == 0) ? (int) fxf.x(getContext(), 8) : 0;
                if (tabLayout.E) {
                    if (x != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(x);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (x != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = x;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            b bVar3 = this.a;
            CharSequence charSequence2 = bVar3 != null ? bVar3.c : null;
            if (isEmpty) {
                charSequence = charSequence2;
            }
            s7g.C(this, charSequence);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Context context;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            kk2 kk2Var = this.e;
            if (kk2Var != null && kk2Var.isVisible()) {
                kk2 kk2Var2 = this.e;
                mk2 mk2Var = kk2Var2.e;
                CharSequence charSequence = null;
                if (kk2Var2.isVisible()) {
                    lk2 lk2Var = mk2Var.b;
                    if (lk2Var.j != null) {
                        charSequence = lk2Var.o;
                        if (charSequence == null) {
                            charSequence = kk2Var2.e.b.j;
                        }
                    } else if (!kk2Var2.g()) {
                        charSequence = lk2Var.p;
                    } else if (lk2Var.q != 0 && (context = (Context) kk2Var2.a.get()) != null) {
                        if (kk2Var2.h != -2) {
                            int e = kk2Var2.e();
                            int i = kk2Var2.h;
                            if (e > i) {
                                charSequence = context.getString(lk2Var.r, Integer.valueOf(i));
                            }
                        }
                        charSequence = context.getResources().getQuantityString(lk2Var.q, kk2Var2.e(), Integer.valueOf(kk2Var2.e()));
                    }
                }
                accessibilityNodeInfo.setContentDescription(charSequence);
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ub.d(isSelected(), 0, 1, this.a.d, 1).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) qb.e.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ru.yandex.music.R.string.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.v, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.b != null) {
                float f = tabLayout.r;
                if (isSelected() && tabLayout.k != -1) {
                    f = tabLayout.s;
                }
                int i3 = this.j;
                ImageView imageView = this.c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.t;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int maxLines = this.b.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.D == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.b.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.b.setTextSize(0, f);
                    this.b.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            b bVar = this.a;
            TabLayout tabLayout = bVar.f;
            if (tabLayout != null) {
                tabLayout.i(bVar, true);
                return true;
            }
            xq0.x("Tab not attached to a TabLayout");
            return false;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(b bVar) {
            if (bVar != this.a) {
                this.a = bVar;
                e();
            }
        }
    }

    public TabLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, ru.yandex.music.R.style.Widget_Design_TabLayout), attributeSet, i);
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.v = Integer.MAX_VALUE;
        this.G = -1;
        this.v0 = new ArrayList();
        this.F0 = new dhm(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        j1s j1sVar = new j1s(this, context2);
        this.d = j1sVar;
        super.addView(j1sVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray B = bcx.B(context2, attributeSet, vdn.U, i, ru.yandex.music.R.style.Widget_Design_TabLayout, 24);
        ColorStateList n = mi.n(getBackground());
        if (n != null) {
            com.google.android.material.shape.a aVar = new com.google.android.material.shape.a();
            aVar.r(n);
            aVar.n(context2);
            aVar.q(getElevation());
            setBackground(aVar);
        }
        setSelectedTabIndicator(ivf.F(context2, B, 5));
        setSelectedTabIndicatorColor(B.getColor(8, 0));
        j1sVar.b(B.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(B.getInt(10, 0));
        setTabIndicatorAnimationMode(B.getInt(7, 0));
        setTabIndicatorFullWidth(B.getBoolean(9, true));
        int dimensionPixelSize = B.getDimensionPixelSize(16, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = B.getDimensionPixelSize(19, dimensionPixelSize);
        this.f = B.getDimensionPixelSize(20, dimensionPixelSize);
        this.g = B.getDimensionPixelSize(18, dimensionPixelSize);
        this.h = B.getDimensionPixelSize(17, dimensionPixelSize);
        if (ngg.D(context2, ru.yandex.music.R.attr.isMaterial3Theme, false)) {
            this.i = ru.yandex.music.R.attr.textAppearanceTitleSmall;
        } else {
            this.i = ru.yandex.music.R.attr.textAppearanceButton;
        }
        int resourceId = B.getResourceId(24, ru.yandex.music.R.style.TextAppearance_Design_Tab);
        this.j = resourceId;
        int[] iArr = ken.y;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            this.r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.l = ivf.D(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (B.hasValue(22)) {
                this.k = B.getResourceId(22, resourceId);
            }
            int i2 = this.k;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i2 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i2, iArr);
                try {
                    this.s = obtainStyledAttributes.getDimensionPixelSize(0, (int) r6);
                    ColorStateList D = ivf.D(context2, obtainStyledAttributes, 3);
                    if (D != null) {
                        this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{D.getColorForState(new int[]{R.attr.state_selected}, D.getDefaultColor()), this.l.getDefaultColor()});
                    }
                } finally {
                }
            }
            if (B.hasValue(25)) {
                this.l = ivf.D(context2, B, 25);
            }
            if (B.hasValue(23)) {
                this.l = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{B.getColor(23, 0), this.l.getDefaultColor()});
            }
            this.m = ivf.D(context2, B, 3);
            this.q = fxf.L(B.getInt(4, -1), null);
            this.n = ivf.D(context2, B, 21);
            this.B = B.getInt(6, 300);
            this.K = szf.q0(context2, ru.yandex.music.R.attr.motionEasingEmphasizedInterpolator, wm0.b);
            this.w = B.getDimensionPixelSize(14, -1);
            this.x = B.getDimensionPixelSize(13, -1);
            this.u = B.getResourceId(0, 0);
            this.z = B.getDimensionPixelSize(1, 0);
            this.D = B.getInt(15, 1);
            this.A = B.getInt(2, 0);
            this.E = B.getBoolean(12, false);
            this.I = B.getBoolean(26, false);
            B.recycle();
            Resources resources = getResources();
            this.t = resources.getDimensionPixelSize(ru.yandex.music.R.dimen.design_tab_text_size_2line);
            this.y = resources.getDimensionPixelSize(ru.yandex.music.R.dimen.design_tab_scrollable_min_width);
            d();
        } finally {
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            if (bVar != null && bVar.a != null && !TextUtils.isEmpty(bVar.b)) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.w;
        if (i != -1) {
            return i;
        }
        int i2 = this.D;
        if (i2 == 0 || i2 == 2) {
            return this.y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        j1s j1sVar = this.d;
        int childCount = j1sVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = j1sVar.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof a) {
                        ((a) childAt).g();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(b bVar, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (bVar.f != this) {
            xq0.x("Tab belongs to a different TabLayout.");
            return;
        }
        bVar.d = size;
        arrayList.add(size, bVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((b) arrayList.get(i2)).d == this.a) {
                i = i2;
            }
            ((b) arrayList.get(i2)).d = i2;
        }
        this.a = i;
        a aVar = bVar.g;
        aVar.setSelected(false);
        aVar.setActivated(false);
        int i3 = bVar.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.d.addView(aVar, i3, layoutParams);
        if (z) {
            TabLayout tabLayout = bVar.f;
            if (tabLayout != null) {
                tabLayout.i(bVar, true);
            } else {
                xq0.x("Tab not attached to a TabLayout");
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        b(view);
    }

    public final void b(View view) {
        if (!(view instanceof w0s)) {
            xq0.x("Only TabItem instances can be added to TabLayout");
            return;
        }
        w0s w0sVar = (w0s) view;
        b g = g();
        CharSequence charSequence = w0sVar.a;
        if (charSequence != null) {
            if (TextUtils.isEmpty(g.c) && !TextUtils.isEmpty(charSequence)) {
                g.g.setContentDescription(charSequence);
            }
            g.b = charSequence;
            a aVar = g.g;
            if (aVar != null) {
                aVar.e();
            }
        }
        Drawable drawable = w0sVar.b;
        if (drawable != null) {
            g.a = drawable;
            TabLayout tabLayout = g.f;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.m(true);
            }
            a aVar2 = g.g;
            if (aVar2 != null) {
                aVar2.e();
            }
        }
        int i = w0sVar.c;
        if (i != 0) {
            g.e = LayoutInflater.from(g.g.getContext()).inflate(i, (ViewGroup) g.g, false);
            a aVar3 = g.g;
            if (aVar3 != null) {
                aVar3.e();
            }
        }
        if (!TextUtils.isEmpty(w0sVar.getContentDescription())) {
            g.c = w0sVar.getContentDescription();
            a aVar4 = g.g;
            if (aVar4 != null) {
                aVar4.e();
            }
        }
        a(g, this.b.isEmpty());
    }

    public final void c(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            j1s j1sVar = this.d;
            int childCount = j1sVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (j1sVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int e = e(i, 0.0f);
            if (scrollX != e) {
                f();
                this.x0.setIntValues(scrollX, e);
                this.x0.start();
            }
            ValueAnimator valueAnimator = j1sVar.a;
            if (valueAnimator != null && valueAnimator.isRunning() && j1sVar.b.a != i) {
                j1sVar.a.cancel();
            }
            j1sVar.d(i, this.B, true);
            return;
        }
        k(i, 0.0f, true, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r0 != 2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        int i = this.D;
        int max = (i == 0 || i == 2) ? Math.max(0, this.z - this.e) : 0;
        j1s j1sVar = this.d;
        j1sVar.setPaddingRelative(max, 0, 0, 0);
        int i2 = this.D;
        if (i2 == 0) {
            int i3 = this.A;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                j1sVar.setGravity(1);
            }
            j1sVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.A == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            j1sVar.setGravity(1);
        }
        m(true);
    }

    public final int e(int i, float f) {
        j1s j1sVar;
        View childAt;
        int i2 = this.D;
        if ((i2 != 0 && i2 != 2) || (childAt = (j1sVar = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < j1sVar.getChildCount() ? j1sVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final void f() {
        if (this.x0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.x0 = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.x0.setDuration(this.B);
            this.x0.addUpdateListener(new re3(5, this));
        }
    }

    public final b g() {
        b bVar = (b) G0.f();
        if (bVar == null) {
            bVar = new b();
            bVar.d = -1;
        }
        bVar.f = this;
        dhm dhmVar = this.F0;
        a aVar = dhmVar != null ? (a) dhmVar.f() : null;
        if (aVar == null) {
            aVar = new a(getContext());
        }
        aVar.setTab(bVar);
        aVar.setFocusable(true);
        aVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(bVar.c)) {
            aVar.setContentDescription(bVar.b);
        } else {
            aVar.setContentDescription(bVar.c);
        }
        bVar.g = aVar;
        return bVar;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    public int getTabMaxWidth() {
        return this.v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    @NonNull
    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final void h() {
        b bVar;
        int currentItem;
        j1s j1sVar = this.d;
        int childCount = j1sVar.getChildCount() - 1;
        while (true) {
            bVar = null;
            if (childCount < 0) {
                break;
            }
            a aVar = (a) j1sVar.getChildAt(childCount);
            j1sVar.removeViewAt(childCount);
            if (aVar != null) {
                aVar.setTab(null);
                aVar.setSelected(false);
                this.F0.c(aVar);
            }
            requestLayout();
            childCount--;
        }
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            it.remove();
            bVar2.f = null;
            bVar2.g = null;
            bVar2.a = null;
            bVar2.b = null;
            bVar2.c = null;
            bVar2.d = -1;
            bVar2.e = null;
            G0.c(bVar2);
        }
        this.c = null;
        h2k h2kVar = this.z0;
        if (h2kVar != null) {
            int b = h2kVar.b();
            for (int i = 0; i < b; i++) {
                b g = g();
                this.z0.getClass();
                if (TextUtils.isEmpty(g.c) && !TextUtils.isEmpty(null)) {
                    g.g.setContentDescription(null);
                }
                g.b = null;
                a aVar2 = g.g;
                if (aVar2 != null) {
                    aVar2.e();
                }
                a(g, false);
            }
            lgu lguVar = this.y0;
            if (lguVar == null || b <= 0 || (currentItem = lguVar.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            if (currentItem >= 0 && currentItem < getTabCount()) {
                bVar = (b) arrayList.get(currentItem);
            }
            i(bVar, true);
        }
    }

    public final void i(b bVar, boolean z) {
        TabLayout tabLayout;
        b bVar2 = this.c;
        ArrayList arrayList = this.v0;
        if (bVar2 == bVar) {
            if (bVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((h1s) arrayList.get(size)).getClass();
                }
                c(bVar.d);
                return;
            }
            return;
        }
        int i = bVar != null ? bVar.d : -1;
        if (z) {
            if ((bVar2 == null || bVar2.d == -1) && i != -1) {
                tabLayout = this;
                tabLayout.k(i, 0.0f, true, true, true);
            } else {
                tabLayout = this;
                c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.c = bVar;
        if (bVar2 != null && bVar2.f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((h1s) arrayList.get(size2)).getClass();
            }
        }
        if (bVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((l1s) ((h1s) arrayList.get(size3))).a.setCurrentItem(bVar.d);
            }
        }
    }

    public final void j(h2k h2kVar, boolean z) {
        nr2 nr2Var;
        h2k h2kVar2 = this.z0;
        if (h2kVar2 != null && (nr2Var = this.A0) != null) {
            h2kVar2.a.unregisterObserver(nr2Var);
        }
        this.z0 = h2kVar;
        if (z && h2kVar != null) {
            if (this.A0 == null) {
                this.A0 = new nr2(3, this);
            }
            h2kVar.a.registerObserver(this.A0);
        }
        h();
    }

    public final void k(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int round = Math.round(f2);
        if (round >= 0) {
            j1s j1sVar = this.d;
            if (round >= j1sVar.getChildCount()) {
                return;
            }
            if (z2) {
                j1sVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = j1sVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    j1sVar.a.cancel();
                }
                j1sVar.c(j1sVar.getChildAt(i), j1sVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.x0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.x0.cancel();
            }
            int e = e(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && e >= scrollX) || (i > getSelectedTabPosition() && e <= scrollX) || i == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && e <= scrollX) || (i > getSelectedTabPosition() && e >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.E0 == 1 || z3) {
                if (i < 0) {
                    e = 0;
                }
                scrollTo(e, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void l(lgu lguVar, boolean z) {
        TabLayout tabLayout;
        ArrayList arrayList;
        lgu lguVar2 = this.y0;
        if (lguVar2 != null) {
            k1s k1sVar = this.B0;
            if (k1sVar != null) {
                lguVar2.u(k1sVar);
            }
            g1s g1sVar = this.C0;
            if (g1sVar != null && (arrayList = this.y0.B0) != null) {
                arrayList.remove(g1sVar);
            }
        }
        l1s l1sVar = this.w0;
        ArrayList arrayList2 = this.v0;
        if (l1sVar != null) {
            arrayList2.remove(l1sVar);
            this.w0 = null;
        }
        if (lguVar != null) {
            this.y0 = lguVar;
            if (this.B0 == null) {
                this.B0 = new k1s(this);
            }
            k1s k1sVar2 = this.B0;
            k1sVar2.c = 0;
            k1sVar2.b = 0;
            lguVar.b(k1sVar2);
            l1s l1sVar2 = new l1s(lguVar);
            this.w0 = l1sVar2;
            if (!arrayList2.contains(l1sVar2)) {
                arrayList2.add(l1sVar2);
            }
            h2k adapter = lguVar.getAdapter();
            if (adapter != null) {
                j(adapter, true);
            }
            if (this.C0 == null) {
                this.C0 = new g1s(this);
            }
            g1s g1sVar2 = this.C0;
            g1sVar2.a = true;
            if (lguVar.B0 == null) {
                lguVar.B0 = new ArrayList();
            }
            lguVar.B0.add(g1sVar2);
            k(lguVar.getCurrentItem(), 0.0f, true, true, true);
            tabLayout = this;
        } else {
            tabLayout = this;
            tabLayout.y0 = null;
            j(null, false);
        }
        tabLayout.D0 = z;
    }

    public final void m(boolean z) {
        int i = 0;
        while (true) {
            j1s j1sVar = this.d;
            if (i >= j1sVar.getChildCount()) {
                return;
            }
            View childAt = j1sVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.D == 1 && this.A == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rvf.L(this);
        if (this.y0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof lgu) {
                l((lgu) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.D0) {
            setupWithViewPager(null);
            this.D0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            j1s j1sVar = this.d;
            if (i >= j1sVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = j1sVar.getChildAt(i);
            if ((childAt instanceof a) && (drawable = (aVar = (a) childAt).i) != null) {
                drawable.setBounds(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
                aVar.i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) tb.b(1, getTabCount(), 1).a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int round = Math.round(fxf.x(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.x;
            if (i3 <= 0) {
                i3 = (int) (size - fxf.x(getContext(), 56));
            }
            this.v = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.D;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
                if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof com.google.android.material.shape.a) {
            ((com.google.android.material.shape.a) background).q(f);
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        int i = 0;
        while (true) {
            j1s j1sVar = this.d;
            if (i >= j1sVar.getChildCount()) {
                d();
                return;
            }
            View childAt = j1sVar.getChildAt(i);
            if (childAt instanceof a) {
                a aVar = (a) childAt;
                aVar.setOrientation(!TabLayout.this.E ? 1 : 0);
                TextView textView = aVar.g;
                if (textView == null && aVar.h == null) {
                    aVar.h(aVar.b, aVar.c, true);
                } else {
                    aVar.h(textView, aVar.h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(h1s h1sVar) {
        h1s h1sVar2 = this.L;
        ArrayList arrayList = this.v0;
        if (h1sVar2 != null) {
            arrayList.remove(h1sVar2);
        }
        this.L = h1sVar;
        if (h1sVar == null || arrayList.contains(h1sVar)) {
            return;
        }
        arrayList.add(h1sVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.x0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = drawable.mutate();
        this.o = mutate;
        int i = this.p;
        if (i != 0) {
            mutate.setTint(i);
        } else {
            mutate.setTintList(null);
        }
        int i2 = this.G;
        if (i2 == -1) {
            i2 = this.o.getIntrinsicHeight();
        }
        this.d.b(i2);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        m(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.C != i) {
            this.C = i;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.G = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.A != i) {
            this.A = i;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a aVar = ((b) arrayList.get(i)).g;
                if (aVar != null) {
                    aVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(etn.E(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.H = i;
        if (i == 0) {
            this.J = new com.google.android.material.tabs.a();
            return;
        }
        if (i == 1) {
            this.J = new o2b(0);
        } else {
            if (i == 2) {
                this.J = new o2b(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.F = z;
        int i = j1s.c;
        j1s j1sVar = this.d;
        j1sVar.a(j1sVar.b.getSelectedTabPosition());
        j1sVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.D) {
            this.D = i;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        int i = 0;
        while (true) {
            j1s j1sVar = this.d;
            if (i >= j1sVar.getChildCount()) {
                return;
            }
            View childAt = j1sVar.getChildAt(i);
            if (childAt instanceof a) {
                Context context = getContext();
                int i2 = a.l;
                ((a) childAt).f(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(etn.E(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a aVar = ((b) arrayList.get(i)).g;
                if (aVar != null) {
                    aVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(h2k h2kVar) {
        j(h2kVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        int i = 0;
        while (true) {
            j1s j1sVar = this.d;
            if (i >= j1sVar.getChildCount()) {
                return;
            }
            View childAt = j1sVar.getChildAt(i);
            if (childAt instanceof a) {
                Context context = getContext();
                int i2 = a.l;
                ((a) childAt).f(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(lgu lguVar) {
        l(lguVar, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Deprecated
    public void setOnTabSelectedListener(i1s i1sVar) {
        setOnTabSelectedListener((h1s) i1sVar);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(y2x.w(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public TabLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.tabStyle);
    }

    public TabLayout(@NonNull Context context) {
        this(context, null);
    }
}
