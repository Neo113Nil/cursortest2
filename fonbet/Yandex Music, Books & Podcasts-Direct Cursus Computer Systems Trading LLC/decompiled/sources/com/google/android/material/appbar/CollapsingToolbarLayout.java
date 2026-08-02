package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.bu4;
import defpackage.cu4;
import defpackage.cy7;
import defpackage.du4;
import defpackage.efo;
import defpackage.etn;
import defpackage.eu4;
import defpackage.ivf;
import defpackage.kqv;
import defpackage.ndu;
import defpackage.nfu;
import defpackage.ngg;
import defpackage.re3;
import defpackage.szf;
import defpackage.u2b;
import defpackage.vdn;
import defpackage.wdu;
import defpackage.wm0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public du4 A;
    public int B;
    public int C;
    public int D;
    public kqv E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Rect k;
    public final bu4 l;
    public final bu4 m;
    public final u2b n;
    public boolean o;
    public boolean p;
    public final int q;
    public Drawable r;
    public Drawable s;
    public int t;
    public boolean u;
    public ValueAnimator v;
    public long w;
    public final TimeInterpolator x;
    public final TimeInterpolator y;
    public int z;

    public CollapsingToolbarLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        ColorStateList D;
        ColorStateList D2;
        this.a = true;
        this.k = new Rect();
        this.z = -1;
        this.F = 0;
        this.H = 0;
        this.I = 0;
        this.K = 0;
        Context context2 = getContext();
        this.C = getResources().getConfiguration().orientation;
        bu4 bu4Var = new bu4(this);
        this.l = bu4Var;
        DecelerateInterpolator decelerateInterpolator = wm0.e;
        bu4Var.X = decelerateInterpolator;
        bu4Var.l(false);
        bu4Var.K = false;
        this.n = new u2b(context2);
        bcx.t(context2, attributeSet, i, R.style.Widget_Design_CollapsingToolbar);
        int[] iArr = vdn.l;
        bcx.u(context2, attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Design_CollapsingToolbar);
        int i2 = obtainStyledAttributes.getInt(9, 8388691);
        int i3 = obtainStyledAttributes.getInt(2, 8388627);
        this.q = obtainStyledAttributes.getInt(3, 1);
        bu4Var.x(i2);
        bu4Var.s(i3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(13)) {
            this.f = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.h = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.g = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.i = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.j = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        }
        this.o = obtainStyledAttributes.getBoolean(28, true);
        setTitle(obtainStyledAttributes.getText(26));
        bu4Var.w(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        bu4Var.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (obtainStyledAttributes.hasValue(16)) {
            bu4Var.w(obtainStyledAttributes.getResourceId(16, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            bu4Var.q(obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.hasValue(31)) {
            int i4 = obtainStyledAttributes.getInt(31, -1);
            setTitleEllipsize(i4 != 0 ? i4 != 1 ? i4 != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START);
        }
        if (obtainStyledAttributes.hasValue(17) && bu4Var.o != (D2 = ivf.D(context2, obtainStyledAttributes, 17))) {
            bu4Var.o = D2;
            bu4Var.l(false);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            bu4Var.r(ivf.D(context2, obtainStyledAttributes, 5));
        }
        this.z = obtainStyledAttributes.getDimensionPixelSize(22, -1);
        if (obtainStyledAttributes.hasValue(29)) {
            bu4Var.v(obtainStyledAttributes.getInt(29, 1));
        } else if (obtainStyledAttributes.hasValue(20)) {
            bu4Var.v(obtainStyledAttributes.getInt(20, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            bu4Var.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            bu4Var.l(false);
        }
        bu4 bu4Var2 = new bu4(this);
        this.m = bu4Var2;
        bu4Var2.X = decelerateInterpolator;
        bu4Var2.l(false);
        bu4Var2.K = false;
        if (obtainStyledAttributes.hasValue(24)) {
            setSubtitle(obtainStyledAttributes.getText(24));
        }
        bu4Var2.x(i2);
        bu4Var2.s(i3);
        bu4Var2.w(R.style.TextAppearance_AppCompat_Headline);
        bu4Var2.q(R.style.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (obtainStyledAttributes.hasValue(7)) {
            bu4Var2.w(obtainStyledAttributes.getResourceId(7, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            bu4Var2.q(obtainStyledAttributes.getResourceId(0, 0));
        }
        if (obtainStyledAttributes.hasValue(8) && bu4Var2.o != (D = ivf.D(context2, obtainStyledAttributes, 8))) {
            bu4Var2.o = D;
            bu4Var2.l(false);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            bu4Var2.r(ivf.D(context2, obtainStyledAttributes, 1));
        }
        if (obtainStyledAttributes.hasValue(25)) {
            bu4Var2.v(obtainStyledAttributes.getInt(25, 1));
        }
        if (obtainStyledAttributes.hasValue(30)) {
            bu4Var2.W = AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(30, 0));
            bu4Var2.l(false);
        }
        this.w = obtainStyledAttributes.getInt(21, 600);
        this.x = szf.q0(context2, R.attr.motionEasingStandardInterpolator, wm0.c);
        this.y = szf.q0(context2, R.attr.motionEasingStandardInterpolator, wm0.d);
        setContentScrim(obtainStyledAttributes.getDrawable(6));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(23));
        setTitleCollapseMode(obtainStyledAttributes.getInt(27, 0));
        this.b = obtainStyledAttributes.getResourceId(32, -1);
        this.G = obtainStyledAttributes.getBoolean(19, false);
        this.J = obtainStyledAttributes.getBoolean(18, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        efo efoVar = new efo(16, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(this, efoVar);
    }

    public static nfu b(View view) {
        nfu nfuVar = (nfu) view.getTag(R.id.view_offset_helper);
        if (nfuVar != null) {
            return nfuVar;
        }
        nfu nfuVar2 = new nfu(view);
        view.setTag(R.id.view_offset_helper, nfuVar2);
        return nfuVar2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue C = ngg.C(context, R.attr.colorSurfaceContainer);
        ColorStateList colorStateList = null;
        if (C != null) {
            int i = C.resourceId;
            if (i != 0) {
                colorStateList = etn.E(context, i);
            } else {
                int i2 = C.data;
                if (i2 != 0) {
                    colorStateList = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        u2b u2bVar = this.n;
        return u2bVar.a(u2bVar.d, dimension);
    }

    public final void a() {
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.o && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.o || this.c == null) {
            return;
        }
        if (this.e == null) {
            this.e = new View(getContext());
        }
        if (this.e.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cu4;
    }

    public final void d() {
        if (this.r == null && this.s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.r) != null && this.t > 0) {
            drawable.mutate().setAlpha(this.t);
            this.r.draw(canvas);
        }
        if (this.o && this.p) {
            ViewGroup viewGroup = this.c;
            bu4 bu4Var = this.m;
            bu4 bu4Var2 = this.l;
            if (viewGroup == null || this.r == null || this.t <= 0 || this.D != 1 || bu4Var2.b >= bu4Var2.e) {
                bu4Var2.f(canvas);
                bu4Var.f(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                bu4Var2.f(canvas);
                bu4Var.f(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.s == null || this.t <= 0) {
            return;
        }
        kqv kqvVar = this.E;
        int d = kqvVar != null ? kqvVar.d() : 0;
        if (d > 0) {
            this.s.setBounds(0, -this.B, getWidth(), d - this.B);
            this.s.mutate().setAlpha(this.t);
            this.s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.r;
        if (drawable == null || this.t <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.D == 1 && view != null && this.o) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.r.mutate().setAlpha(this.t);
            this.r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        bu4 bu4Var = this.l;
        if (bu4Var != null) {
            bu4Var.S = drawableState;
            ColorStateList colorStateList2 = bu4Var.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bu4Var.o) != null && colorStateList.isStateful())) {
                bu4Var.l(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int i6;
        int i7;
        if (!this.o || (view = this.e) == null) {
            return;
        }
        int i8 = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.p = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((cu4) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            Rect rect = this.k;
            cy7.a(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i8 = toolbar.getTitleMarginStart();
                i6 = toolbar.getTitleMarginEnd();
                i7 = toolbar.getTitleMarginTop();
                i5 = toolbar.getTitleMarginBottom();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                i8 = toolbar2.getTitleMarginStart();
                i6 = toolbar2.getTitleMarginEnd();
                i7 = toolbar2.getTitleMarginTop();
                i5 = toolbar2.getTitleMarginBottom();
            } else {
                i5 = 0;
                i6 = 0;
                i7 = 0;
            }
            int i9 = rect.left + (z3 ? i6 : i8);
            int i10 = rect.right - (z3 ? i8 : i6);
            int i11 = rect.top + height + i7;
            int i12 = (rect.bottom + height) - i5;
            bu4 bu4Var = this.m;
            TextPaint textPaint = bu4Var.V;
            textPaint.setTextSize(bu4Var.n);
            textPaint.setTypeface(bu4Var.x);
            textPaint.setLetterSpacing(bu4Var.g0);
            int descent = (int) (i12 - (textPaint.descent() + (-textPaint.ascent())));
            bu4 bu4Var2 = this.l;
            TextPaint textPaint2 = bu4Var2.V;
            textPaint2.setTextSize(bu4Var2.n);
            textPaint2.setTypeface(bu4Var2.x);
            textPaint2.setLetterSpacing(bu4Var2.g0);
            int descent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i11);
            if (TextUtils.isEmpty(bu4Var.H)) {
                bu4Var2.o(i9, i11, i10, i12);
            } else {
                bu4Var2.o(i9, i11, i10, descent);
                bu4Var.o(i9, descent2, i10, i12);
            }
            if (this.q == 0) {
                cy7.a(this, this, rect);
                int i13 = rect.left + (z3 ? i6 : i8);
                int i14 = rect.right;
                if (!z3) {
                    i8 = i6;
                }
                int i15 = i14 - i8;
                if (TextUtils.isEmpty(bu4Var.H)) {
                    bu4Var2.p(i13, i11, i15, i12);
                } else {
                    bu4Var2.p(i13, i11, i15, descent);
                    bu4Var.p(i13, descent2, i15, i12);
                }
            }
            int i16 = z3 ? this.h : this.f;
            int i17 = rect.top + this.g;
            int i18 = (i3 - i) - (z3 ? this.f : this.h);
            int i19 = (i4 - i2) - this.i;
            boolean isEmpty = TextUtils.isEmpty(bu4Var.H);
            bu4 bu4Var3 = this.l;
            if (isEmpty) {
                bu4Var3.u(true, i16, i17, i18, i19);
                bu4Var2.l(z);
            } else {
                bu4Var3.u(false, i16, i17, i18, (int) ((i19 - (bu4Var.i() + this.I)) - this.j));
                this.m.u(false, i16, (int) (bu4Var2.i() + this.H + i17 + this.j), i18, i19);
                bu4Var2.l(z);
                bu4Var.l(z);
            }
        }
    }

    public final void f() {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || !this.o) {
            return;
        }
        CharSequence charSequence = null;
        CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        if (TextUtils.isEmpty(this.l.H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 instanceof Toolbar) {
            charSequence = ((Toolbar) viewGroup2).getSubtitle();
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            charSequence = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.m.H) || TextUtils.isEmpty(charSequence)) {
            return;
        }
        setSubtitle(charSequence);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        cu4 cu4Var = new cu4(-1, -1);
        cu4Var.a = 0;
        cu4Var.b = 0.5f;
        return cu4Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        cu4 cu4Var = new cu4(context, attributeSet);
        cu4Var.a = 0;
        cu4Var.b = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.m);
        cu4Var.a = obtainStyledAttributes.getInt(0, 0);
        cu4Var.b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return cu4Var;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.m.n;
    }

    @NonNull
    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.m.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.l.l;
    }

    public float getCollapsedTitleTextSize() {
        return this.l.n;
    }

    @NonNull
    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.l.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.r;
    }

    public float getExpandedSubtitleTextSize() {
        return this.m.m;
    }

    @NonNull
    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.m.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.l.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public int getExpandedTitleSpacing() {
        return this.j;
    }

    public float getExpandedTitleTextSize() {
        return this.l.m;
    }

    @NonNull
    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.l.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.l.s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.l.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.l.j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.l.j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.l.o0;
    }

    public int getScrimAlpha() {
        return this.t;
    }

    public long getScrimAnimationDuration() {
        return this.w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.z;
        if (i >= 0) {
            return i + this.F + this.H + this.I + this.K;
        }
        kqv kqvVar = this.E;
        int d = kqvVar != null ? kqvVar.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + d, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.s;
    }

    public CharSequence getSubtitle() {
        if (this.o) {
            return this.m.H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.o) {
            return this.l.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.D;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.l.W;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.l.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.D == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.A == null) {
                this.A = new du4(this);
            }
            appBarLayout.a(this.A);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bu4 bu4Var = this.l;
        bu4Var.k(configuration);
        if (this.C != configuration.orientation && this.J && bu4Var.b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.C = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        du4 du4Var = this.A;
        if (du4Var != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).h) != null) {
            arrayList.remove(du4Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        kqv kqvVar = this.E;
        if (kqvVar != null) {
            int d = kqvVar.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < d) {
                    WeakHashMap weakHashMap = wdu.a;
                    childAt.offsetTopAndBottom(d);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            nfu b = b(getChildAt(i6));
            View view = b.a;
            b.b = view.getTop();
            b.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        CollapsingToolbarLayout collapsingToolbarLayout;
        ViewGroup viewGroup;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        kqv kqvVar = this.E;
        int d = kqvVar != null ? kqvVar.d() : 0;
        if ((mode == 0 || this.G) && d > 0) {
            this.F = d;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + d, 1073741824));
        }
        f();
        if (this.o) {
            bu4 bu4Var = this.l;
            if (!TextUtils.isEmpty(bu4Var.H)) {
                int measuredHeight3 = getMeasuredHeight();
                collapsingToolbarLayout = this;
                collapsingToolbarLayout.e(true, 0, 0, getMeasuredWidth(), measuredHeight3);
                float i3 = bu4Var.i() + collapsingToolbarLayout.F + collapsingToolbarLayout.g;
                bu4 bu4Var2 = collapsingToolbarLayout.m;
                int i4 = (int) (i3 + (TextUtils.isEmpty(bu4Var2.H) ? 0.0f : collapsingToolbarLayout.j + bu4Var2.i()) + collapsingToolbarLayout.i);
                if (i4 > measuredHeight3) {
                    collapsingToolbarLayout.K = i4 - measuredHeight3;
                } else {
                    collapsingToolbarLayout.K = 0;
                }
                if (collapsingToolbarLayout.J) {
                    if (bu4Var.o0 > 1) {
                        int i5 = bu4Var.q;
                        if (i5 > 1) {
                            collapsingToolbarLayout.H = (i5 - 1) * Math.round(bu4Var.i());
                        } else {
                            collapsingToolbarLayout.H = 0;
                        }
                    }
                    if (bu4Var2.o0 > 1) {
                        int i6 = bu4Var2.q;
                        if (i6 > 1) {
                            collapsingToolbarLayout.I = (i6 - 1) * Math.round(bu4Var2.i());
                        } else {
                            collapsingToolbarLayout.I = 0;
                        }
                    }
                }
                int i7 = collapsingToolbarLayout.K;
                int i8 = collapsingToolbarLayout.H;
                int i9 = collapsingToolbarLayout.I;
                if (i7 + i8 + i9 > 0) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight3 + i7 + i8 + i9, 1073741824));
                }
                viewGroup = collapsingToolbarLayout.c;
                if (viewGroup == null) {
                    View view = collapsingToolbarLayout.d;
                    if (view == null || view == collapsingToolbarLayout) {
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        setMinimumHeight(measuredHeight);
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    } else {
                        measuredHeight2 = view.getMeasuredHeight();
                    }
                    setMinimumHeight(measuredHeight2);
                    return;
                }
                return;
            }
        }
        collapsingToolbarLayout = this;
        viewGroup = collapsingToolbarLayout.c;
        if (viewGroup == null) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.D == 1 && viewGroup != null && this.o) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.m.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        bu4 bu4Var = this.m;
        if (bu4Var.n != f) {
            bu4Var.n = f;
            bu4Var.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        bu4 bu4Var = this.m;
        if (bu4Var.t(typeface)) {
            bu4Var.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.l.s(i);
        this.m.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.l.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        bu4 bu4Var = this.l;
        if (bu4Var.n != f) {
            bu4Var.n = f;
            bu4Var.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        bu4 bu4Var = this.l;
        if (bu4Var.t(typeface)) {
            bu4Var.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.r = mutate;
            if (mutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.D == 1 && viewGroup != null && this.o) {
                    height = viewGroup.getBottom();
                }
                mutate.setBounds(0, 0, width, height);
                this.r.setCallback(this);
                this.r.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.m.w(i);
    }

    public void setExpandedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        bu4 bu4Var = this.m;
        if (bu4Var.o != colorStateList) {
            bu4Var.o = colorStateList;
            bu4Var.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.m.y(f);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        bu4 bu4Var = this.m;
        if (bu4Var.z(typeface)) {
            bu4Var.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.l.x(i);
        this.m.x(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.l.w(i);
    }

    public void setExpandedTitleTextColor(@NonNull ColorStateList colorStateList) {
        bu4 bu4Var = this.l;
        if (bu4Var.o != colorStateList) {
            bu4Var.o = colorStateList;
            bu4Var.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        this.l.y(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        bu4 bu4Var = this.l;
        if (bu4Var.z(typeface)) {
            bu4Var.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.J = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.G = z;
    }

    public void setHyphenationFrequency(int i) {
        this.l.s0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.l.q0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.l.r0 = f;
    }

    public void setMaxLines(int i) {
        this.l.v(i);
        this.m.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.l.K = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.t) {
            if (this.r != null && (viewGroup = this.c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.t = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.w = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.z != i) {
            this.z = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2 = isLaidOut() && !isInEditMode();
        if (this.u != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.v = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.t ? this.x : this.y);
                    this.v.addUpdateListener(new re3(1, this));
                } else if (valueAnimator.isRunning()) {
                    this.v.cancel();
                }
                this.v.setDuration(this.w);
                this.v.setIntValues(this.t, i);
                this.v.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.u = z;
        }
    }

    public void setStaticLayoutBuilderConfigurer(eu4 eu4Var) {
        bu4 bu4Var = this.l;
        bu4Var.getClass();
        if (eu4Var != null) {
            bu4Var.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.s = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                this.s.setLayoutDirection(getLayoutDirection());
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
                this.s.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.m.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.l.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.D = i;
        boolean z = i == 1;
        this.l.c = z;
        this.m.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.D == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        bu4 bu4Var = this.l;
        bu4Var.G = truncateAt;
        bu4Var.l(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        bu4 bu4Var = this.l;
        bu4Var.W = timeInterpolator;
        bu4Var.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.s;
        if (drawable != null && drawable.isVisible() != z) {
            this.s.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.r.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.s;
    }

    public void setCollapsedSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.m.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.l.r(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        cu4 cu4Var = new cu4(-1, -1);
        cu4Var.a = 0;
        cu4Var.b = 0.5f;
        return cu4Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        cu4 cu4Var = new cu4(layoutParams);
        cu4Var.a = 0;
        cu4Var.b = 0.5f;
        return cu4Var;
    }

    public CollapsingToolbarLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(@NonNull Context context) {
        this(context, null);
    }
}
