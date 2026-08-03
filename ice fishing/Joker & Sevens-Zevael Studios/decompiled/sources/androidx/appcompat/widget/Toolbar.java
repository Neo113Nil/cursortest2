package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b4.g;
import h3.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.d;
import l.h;
import m.b0;
import m.f;
import m.i;
import m.n1;
import m.o1;
import m.p;
import m.p1;
import m.q;
import m.q1;
import m.r1;
import m.s1;
import m.u0;
import m.v;
import m.v1;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public int B;
    public final int C;
    public CharSequence D;
    public CharSequence E;
    public ColorStateList F;
    public ColorStateList G;
    public boolean H;
    public boolean I;
    public final ArrayList J;
    public final ArrayList K;
    public final int[] L;
    public final f8.c M;
    public s1 N;
    public o1 O;
    public boolean P;
    public final g Q;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f458g;

    /* renamed from: h, reason: collision with root package name */
    public v f459h;

    /* renamed from: i, reason: collision with root package name */
    public v f460i;

    /* renamed from: j, reason: collision with root package name */
    public p f461j;

    /* renamed from: k, reason: collision with root package name */
    public q f462k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f463l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f464m;

    /* renamed from: n, reason: collision with root package name */
    public p f465n;

    /* renamed from: o, reason: collision with root package name */
    public View f466o;

    /* renamed from: p, reason: collision with root package name */
    public Context f467p;

    /* renamed from: q, reason: collision with root package name */
    public int f468q;

    /* renamed from: r, reason: collision with root package name */
    public int f469r;

    /* renamed from: s, reason: collision with root package name */
    public int f470s;

    /* renamed from: t, reason: collision with root package name */
    public final int f471t;

    /* renamed from: u, reason: collision with root package name */
    public final int f472u;

    /* renamed from: v, reason: collision with root package name */
    public int f473v;

    /* renamed from: w, reason: collision with root package name */
    public int f474w;

    /* renamed from: x, reason: collision with root package name */
    public int f475x;

    /* renamed from: y, reason: collision with root package name */
    public int f476y;

    /* renamed from: z, reason: collision with root package name */
    public u0 f477z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.C = 8388627;
        this.J = new ArrayList();
        this.K = new ArrayList();
        this.L = new int[2];
        this.M = new f8.c(27, this);
        this.Q = new g(6, this);
        Context context2 = getContext();
        int[] iArr = i.a.f2928s;
        a5.c C = a5.c.C(context2, attributeSet, iArr, R.attr.toolbarStyle);
        w.a(this, context, iArr, attributeSet, (TypedArray) C.f261g, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) C.f261g;
        this.f469r = typedArray.getResourceId(28, 0);
        this.f470s = typedArray.getResourceId(19, 0);
        this.C = typedArray.getInteger(0, 8388627);
        this.f471t = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f476y = dimensionPixelOffset;
        this.f475x = dimensionPixelOffset;
        this.f474w = dimensionPixelOffset;
        this.f473v = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f473v = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f474w = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f475x = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f476y = dimensionPixelOffset5;
        }
        this.f472u = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        u0 u0Var = this.f477z;
        u0Var.f4485h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            u0Var.f4482e = dimensionPixelSize;
            u0Var.f4478a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            u0Var.f4483f = dimensionPixelSize2;
            u0Var.f4479b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            u0Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.B = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f463l = C.v(4);
        this.f464m = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f467p = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable v10 = C.v(16);
        if (v10 != null) {
            setNavigationIcon(v10);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable v11 = C.v(11);
        if (v11 != null) {
            setLogo(v11);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(C.u(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(C.u(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        C.F();
    }

    public static p1 g() {
        p1 p1Var = new p1(-2, -2);
        p1Var.f4426b = 0;
        p1Var.f4425a = 8388627;
        return p1Var;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static p1 h(ViewGroup.LayoutParams layoutParams) {
        boolean z10 = layoutParams instanceof p1;
        if (z10) {
            p1 p1Var = (p1) layoutParams;
            p1 p1Var2 = new p1(p1Var);
            p1Var2.f4426b = 0;
            p1Var2.f4426b = p1Var.f4426b;
            return p1Var2;
        }
        if (z10) {
            p1 p1Var3 = new p1((p1) layoutParams);
            p1Var3.f4426b = 0;
            return p1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            p1 p1Var4 = new p1(layoutParams);
            p1Var4.f4426b = 0;
            return p1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        p1 p1Var5 = new p1(marginLayoutParams);
        p1Var5.f4426b = 0;
        ((ViewGroup.MarginLayoutParams) p1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) p1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) p1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) p1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return p1Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        Field field = w.f2829a;
        boolean z10 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                p1 p1Var = (p1) childAt.getLayoutParams();
                if (p1Var.f4426b == 0 && q(childAt)) {
                    int i12 = p1Var.f4425a;
                    Field field2 = w.f2829a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            p1 p1Var2 = (p1) childAt2.getLayoutParams();
            if (p1Var2.f4426b == 0 && q(childAt2)) {
                int i14 = p1Var2.f4425a;
                Field field3 = w.f2829a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p1 g8 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (p1) layoutParams;
        g8.f4426b = 1;
        if (!z10 || this.f466o == null) {
            addView(view, g8);
        } else {
            view.setLayoutParams(g8);
            this.K.add(view);
        }
    }

    public final void c() {
        if (this.f465n == null) {
            p pVar = new p(getContext());
            this.f465n = pVar;
            pVar.setImageDrawable(this.f463l);
            this.f465n.setContentDescription(this.f464m);
            p1 g8 = g();
            g8.f4425a = (this.f471t & 112) | 8388611;
            g8.f4426b = 2;
            this.f465n.setLayoutParams(g8);
            this.f465n.setOnClickListener(new n1(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof p1);
    }

    public final void d() {
        if (this.f477z == null) {
            u0 u0Var = new u0();
            u0Var.f4478a = 0;
            u0Var.f4479b = 0;
            u0Var.f4480c = Integer.MIN_VALUE;
            u0Var.f4481d = Integer.MIN_VALUE;
            u0Var.f4482e = 0;
            u0Var.f4483f = 0;
            u0Var.f4484g = false;
            u0Var.f4485h = false;
            this.f477z = u0Var;
        }
    }

    public final void e() {
        if (this.f458g == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f458g = actionMenuView;
            actionMenuView.setPopupTheme(this.f468q);
            this.f458g.setOnMenuItemClickListener(this.M);
            this.f458g.getClass();
            p1 g8 = g();
            g8.f4425a = (this.f471t & 112) | 8388613;
            this.f458g.setLayoutParams(g8);
            b(this.f458g, false);
        }
        ActionMenuView actionMenuView2 = this.f458g;
        if (actionMenuView2.f422v == null) {
            h hVar = (h) actionMenuView2.getMenu();
            if (this.O == null) {
                this.O = new o1(this);
            }
            this.f458g.setExpandedActionViewsExclusive(true);
            hVar.b(this.O, this.f467p);
        }
    }

    public final void f() {
        if (this.f461j == null) {
            this.f461j = new p(getContext());
            p1 g8 = g();
            g8.f4425a = (this.f471t & 112) | 8388611;
            this.f461j.setLayoutParams(g8);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        p pVar = this.f465n;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        p pVar = this.f465n;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        u0 u0Var = this.f477z;
        if (u0Var != null) {
            return u0Var.f4484g ? u0Var.f4478a : u0Var.f4479b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.B;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        u0 u0Var = this.f477z;
        if (u0Var != null) {
            return u0Var.f4478a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        u0 u0Var = this.f477z;
        if (u0Var != null) {
            return u0Var.f4479b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        u0 u0Var = this.f477z;
        if (u0Var != null) {
            return u0Var.f4484g ? u0Var.f4479b : u0Var.f4478a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.A;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        h hVar;
        ActionMenuView actionMenuView = this.f458g;
        return (actionMenuView == null || (hVar = actionMenuView.f422v) == null || !hVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.B, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = w.f2829a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = w.f2829a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.A, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        q qVar = this.f462k;
        if (qVar != null) {
            return qVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        q qVar = this.f462k;
        if (qVar != null) {
            return qVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f458g.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        p pVar = this.f461j;
        if (pVar != null) {
            return pVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        p pVar = this.f461j;
        if (pVar != null) {
            return pVar.getDrawable();
        }
        return null;
    }

    public i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f458g.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f467p;
    }

    public int getPopupTheme() {
        return this.f468q;
    }

    public CharSequence getSubtitle() {
        return this.E;
    }

    public final TextView getSubtitleTextView() {
        return this.f460i;
    }

    public CharSequence getTitle() {
        return this.D;
    }

    public int getTitleMarginBottom() {
        return this.f476y;
    }

    public int getTitleMarginEnd() {
        return this.f474w;
    }

    public int getTitleMarginStart() {
        return this.f473v;
    }

    public int getTitleMarginTop() {
        return this.f475x;
    }

    public final TextView getTitleTextView() {
        return this.f459h;
    }

    public b0 getWrapper() {
        Drawable drawable;
        if (this.N == null) {
            s1 s1Var = new s1();
            s1Var.f4450l = 0;
            s1Var.f4439a = this;
            s1Var.f4446h = getTitle();
            s1Var.f4447i = getSubtitle();
            s1Var.f4445g = s1Var.f4446h != null;
            s1Var.f4444f = getNavigationIcon();
            a5.c C = a5.c.C(getContext(), null, i.a.f2910a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) C.f261g;
            s1Var.f4451m = C.v(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                s1Var.f4445g = true;
                s1Var.f4446h = text;
                if ((s1Var.f4440b & 8) != 0) {
                    setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                s1Var.f4447i = text2;
                if ((s1Var.f4440b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable v10 = C.v(20);
            if (v10 != null) {
                s1Var.f4443e = v10;
                s1Var.c();
            }
            Drawable v11 = C.v(17);
            if (v11 != null) {
                s1Var.f4442d = v11;
                s1Var.c();
            }
            if (s1Var.f4444f == null && (drawable = s1Var.f4451m) != null) {
                s1Var.f4444f = drawable;
                if ((s1Var.f4440b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            s1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = s1Var.f4441c;
                if (view != null && (s1Var.f4440b & 16) != 0) {
                    removeView(view);
                }
                s1Var.f4441c = inflate;
                if (inflate != null && (s1Var.f4440b & 16) != 0) {
                    addView(inflate);
                }
                s1Var.a(s1Var.f4440b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f477z.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f469r = resourceId2;
                v vVar = this.f459h;
                if (vVar != null) {
                    vVar.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f470s = resourceId3;
                v vVar2 = this.f460i;
                if (vVar2 != null) {
                    vVar2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            C.F();
            if (R.string.abc_action_bar_up_description != s1Var.f4450l) {
                s1Var.f4450l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = s1Var.f4450l;
                    s1Var.f4448j = i10 != 0 ? getContext().getString(i10) : null;
                    s1Var.b();
                }
            }
            s1Var.f4448j = getNavigationContentDescription();
            setNavigationOnClickListener(new n1(s1Var));
            this.N = s1Var;
        }
        return this.N;
    }

    public final int i(View view, int i10) {
        p1 p1Var = (p1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = p1Var.f4425a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.C & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) p1Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i14 = ((ViewGroup.MarginLayoutParams) p1Var).topMargin;
        if (i13 < i14) {
            i13 = i14;
        } else {
            int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
            int i16 = ((ViewGroup.MarginLayoutParams) p1Var).bottomMargin;
            if (i15 < i16) {
                i13 = Math.max(0, i13 - (i16 - i15));
            }
        }
        return paddingTop + i13;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.K.contains(view);
    }

    public final int m(View view, int i10, int i11, int[] iArr) {
        p1 p1Var = (p1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) p1Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i13, max + measuredWidth, view.getMeasuredHeight() + i13);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) p1Var).rightMargin + max;
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        p1 p1Var = (p1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) p1Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i13, max, view.getMeasuredHeight() + i13);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) p1Var).leftMargin);
    }

    public final int o(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.I = false;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.I = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.I = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int max;
        boolean q10;
        boolean q11;
        boolean z11;
        int i16;
        int i17;
        int paddingTop;
        int i18;
        int i19;
        int i20;
        int i21;
        int size;
        int i22;
        int i23;
        int size2;
        int i24;
        int size3;
        int i25;
        int i26;
        int i27;
        int size4;
        Field field = w.f2829a;
        boolean z12 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.L;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i13 - i11) : 0;
        if (!q(this.f461j)) {
            i14 = paddingLeft;
        } else {
            if (z12) {
                i15 = n(this.f461j, i28, min, iArr);
                i14 = paddingLeft;
                if (q(this.f465n)) {
                    if (z12) {
                        i15 = n(this.f465n, i15, min, iArr);
                    } else {
                        i14 = m(this.f465n, i14, min, iArr);
                    }
                }
                if (q(this.f458g)) {
                    if (z12) {
                        i14 = m(this.f458g, i14, min, iArr);
                    } else {
                        i15 = n(this.f458g, i15, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i14);
                iArr[1] = Math.max(0, currentContentInsetRight - (i28 - i15));
                max = Math.max(i14, currentContentInsetLeft);
                int min2 = Math.min(i15, i28 - currentContentInsetRight);
                if (q(this.f466o)) {
                    if (z12) {
                        min2 = n(this.f466o, min2, min, iArr);
                    } else {
                        max = m(this.f466o, max, min, iArr);
                    }
                }
                if (q(this.f462k)) {
                    if (z12) {
                        min2 = n(this.f462k, min2, min, iArr);
                    } else {
                        max = m(this.f462k, max, min, iArr);
                    }
                }
                q10 = q(this.f459h);
                q11 = q(this.f460i);
                if (q10) {
                    z11 = z12;
                    i16 = 0;
                } else {
                    p1 p1Var = (p1) this.f459h.getLayoutParams();
                    z11 = z12;
                    i16 = this.f459h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p1Var).topMargin + ((ViewGroup.MarginLayoutParams) p1Var).bottomMargin;
                }
                if (!q11) {
                    p1 p1Var2 = (p1) this.f460i.getLayoutParams();
                    i16 = this.f460i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) p1Var2).topMargin + ((ViewGroup.MarginLayoutParams) p1Var2).bottomMargin + i16;
                }
                if (!q10 || q11) {
                    v vVar = !q10 ? this.f459h : this.f460i;
                    v vVar2 = !q11 ? this.f460i : this.f459h;
                    p1 p1Var3 = (p1) vVar.getLayoutParams();
                    p1 p1Var4 = (p1) vVar2.getLayoutParams();
                    int i29 = i16;
                    boolean z13 = (!q10 && this.f459h.getMeasuredWidth() > 0) || (q11 && this.f460i.getMeasuredWidth() > 0);
                    i17 = this.C & 112;
                    int i30 = max;
                    if (i17 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) p1Var3).topMargin + this.f475x;
                    } else if (i17 != 80) {
                        int i31 = (((height - paddingTop2) - paddingBottom) - i29) / 2;
                        int i32 = ((ViewGroup.MarginLayoutParams) p1Var3).topMargin + this.f475x;
                        if (i31 < i32) {
                            i31 = i32;
                        } else {
                            int i33 = (((height - paddingBottom) - i29) - i31) - paddingTop2;
                            int i34 = ((ViewGroup.MarginLayoutParams) p1Var3).bottomMargin;
                            int i35 = this.f476y;
                            if (i33 < i34 + i35) {
                                i31 = Math.max(0, i31 - ((((ViewGroup.MarginLayoutParams) p1Var4).bottomMargin + i35) - i33));
                            }
                        }
                        paddingTop = paddingTop2 + i31;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) p1Var4).bottomMargin) - this.f476y) - i29;
                    }
                    if (z11) {
                        int i36 = (z13 ? this.f473v : 0) - iArr[0];
                        max = Math.max(0, i36) + i30;
                        iArr[0] = Math.max(0, -i36);
                        if (q10) {
                            p1 p1Var5 = (p1) this.f459h.getLayoutParams();
                            int measuredWidth = this.f459h.getMeasuredWidth() + max;
                            int measuredHeight = this.f459h.getMeasuredHeight() + paddingTop;
                            this.f459h.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i18 = measuredWidth + this.f474w;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) p1Var5).bottomMargin;
                        } else {
                            i18 = max;
                        }
                        if (q11) {
                            int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p1) this.f460i.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f460i.getMeasuredWidth() + max;
                            this.f460i.layout(max, i37, measuredWidth2, this.f460i.getMeasuredHeight() + i37);
                            i19 = measuredWidth2 + this.f474w;
                        } else {
                            i19 = max;
                        }
                        if (z13) {
                            max = Math.max(i18, i19);
                        }
                    } else {
                        int i38 = (z13 ? this.f473v : 0) - iArr[1];
                        min2 -= Math.max(0, i38);
                        iArr[1] = Math.max(0, -i38);
                        if (q10) {
                            p1 p1Var6 = (p1) this.f459h.getLayoutParams();
                            int measuredWidth3 = min2 - this.f459h.getMeasuredWidth();
                            int measuredHeight2 = this.f459h.getMeasuredHeight() + paddingTop;
                            this.f459h.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i20 = measuredWidth3 - this.f474w;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) p1Var6).bottomMargin;
                        } else {
                            i20 = min2;
                        }
                        if (q11) {
                            int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((p1) this.f460i.getLayoutParams())).topMargin;
                            this.f460i.layout(min2 - this.f460i.getMeasuredWidth(), i39, min2, this.f460i.getMeasuredHeight() + i39);
                            i21 = min2 - this.f474w;
                        } else {
                            i21 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i20, i21);
                        }
                        max = i30;
                    }
                }
                ArrayList arrayList = this.J;
                a(3, arrayList);
                size = arrayList.size();
                i22 = max;
                for (i23 = 0; i23 < size; i23++) {
                    i22 = m((View) arrayList.get(i23), i22, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i24 = 0; i24 < size2; i24++) {
                    min2 = n((View) arrayList.get(i24), min2, min, iArr);
                }
                a(1, arrayList);
                int i40 = iArr[0];
                int i41 = iArr[1];
                size3 = arrayList.size();
                int i42 = i40;
                i25 = 0;
                int i43 = 0;
                while (i25 < size3) {
                    View view = (View) arrayList.get(i25);
                    p1 p1Var7 = (p1) view.getLayoutParams();
                    int i44 = i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) p1Var7).leftMargin - i42;
                    int i46 = ((ViewGroup.MarginLayoutParams) p1Var7).rightMargin - i44;
                    int max2 = Math.max(0, i45);
                    int max3 = Math.max(0, i46);
                    int max4 = Math.max(0, -i45);
                    int max5 = Math.max(0, -i46);
                    i43 += view.getMeasuredWidth() + max2 + max3;
                    i25++;
                    i42 = max4;
                    i41 = max5;
                }
                i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i43 / 2);
                int i47 = i43 + i27;
                if (i27 >= i22) {
                    i22 = i47 > min2 ? i27 - (i47 - min2) : i27;
                }
                size4 = arrayList.size();
                for (i26 = 0; i26 < size4; i26++) {
                    i22 = m((View) arrayList.get(i26), i22, min, iArr);
                }
                arrayList.clear();
            }
            i14 = m(this.f461j, paddingLeft, min, iArr);
        }
        i15 = i28;
        if (q(this.f465n)) {
        }
        if (q(this.f458g)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i14);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i28 - i15));
        max = Math.max(i14, currentContentInsetLeft2);
        int min22 = Math.min(i15, i28 - currentContentInsetRight2);
        if (q(this.f466o)) {
        }
        if (q(this.f462k)) {
        }
        q10 = q(this.f459h);
        q11 = q(this.f460i);
        if (q10) {
        }
        if (!q11) {
        }
        if (!q10) {
        }
        if (!q10) {
        }
        if (!q11) {
        }
        p1 p1Var32 = (p1) vVar.getLayoutParams();
        p1 p1Var42 = (p1) vVar2.getLayoutParams();
        int i292 = i16;
        if (q10) {
        }
        i17 = this.C & 112;
        int i302 = max;
        if (i17 != 48) {
        }
        if (z11) {
        }
        ArrayList arrayList2 = this.J;
        a(3, arrayList2);
        size = arrayList2.size();
        i22 = max;
        while (i23 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i24 < size2) {
        }
        a(1, arrayList2);
        int i402 = iArr[0];
        int i412 = iArr[1];
        size3 = arrayList2.size();
        int i422 = i402;
        i25 = 0;
        int i432 = 0;
        while (i25 < size3) {
        }
        i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i432 / 2);
        int i472 = i432 + i27;
        if (i27 >= i22) {
        }
        size4 = arrayList2.size();
        while (i26 < size4) {
        }
        arrayList2.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean a6 = v1.a(this);
        int i19 = !a6 ? 1 : 0;
        int i20 = 0;
        if (q(this.f461j)) {
            p(this.f461j, i10, 0, i11, this.f472u);
            i12 = j(this.f461j) + this.f461j.getMeasuredWidth();
            i13 = Math.max(0, k(this.f461j) + this.f461j.getMeasuredHeight());
            i14 = View.combineMeasuredStates(0, this.f461j.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (q(this.f465n)) {
            p(this.f465n, i10, 0, i11, this.f472u);
            i12 = j(this.f465n) + this.f465n.getMeasuredWidth();
            i13 = Math.max(i13, k(this.f465n) + this.f465n.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f465n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i12);
        int max2 = Math.max(0, currentContentInsetStart - i12);
        int[] iArr = this.L;
        iArr[a6 ? 1 : 0] = max2;
        if (q(this.f458g)) {
            p(this.f458g, i10, max, i11, this.f472u);
            i15 = j(this.f458g) + this.f458g.getMeasuredWidth();
            i13 = Math.max(i13, k(this.f458g) + this.f458g.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f458g.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (q(this.f466o)) {
            max3 += o(this.f466o, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, k(this.f466o) + this.f466o.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f466o.getMeasuredState());
        }
        if (q(this.f462k)) {
            max3 += o(this.f462k, i10, max3, i11, 0, iArr);
            i13 = Math.max(i13, k(this.f462k) + this.f462k.getMeasuredHeight());
            i14 = View.combineMeasuredStates(i14, this.f462k.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((p1) childAt.getLayoutParams()).f4426b == 0 && q(childAt)) {
                max3 += o(childAt, i10, max3, i11, 0, iArr);
                int max4 = Math.max(i13, k(childAt) + childAt.getMeasuredHeight());
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
                i13 = max4;
            } else {
                max3 = max3;
            }
        }
        int i22 = max3;
        int i23 = this.f475x + this.f476y;
        int i24 = this.f473v + this.f474w;
        if (q(this.f459h)) {
            o(this.f459h, i10, i22 + i24, i11, i23, iArr);
            int j3 = j(this.f459h) + this.f459h.getMeasuredWidth();
            i16 = k(this.f459h) + this.f459h.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i14, this.f459h.getMeasuredState());
            i18 = j3;
        } else {
            i16 = 0;
            i17 = i14;
            i18 = 0;
        }
        if (q(this.f460i)) {
            i18 = Math.max(i18, o(this.f460i, i10, i22 + i24, i11, i23 + i16, iArr));
            i16 += k(this.f460i) + this.f460i.getMeasuredHeight();
            i17 = View.combineMeasuredStates(i17, this.f460i.getMeasuredState());
        }
        int max5 = Math.max(i13, i16);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i22 + i18;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & i17);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, i17 << 16);
        if (this.P) {
            int childCount2 = getChildCount();
            for (int i25 = 0; i25 < childCount2; i25++) {
                View childAt2 = getChildAt(i25);
                if (!q(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i20);
        }
        i20 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i20);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof r1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r1 r1Var = (r1) parcelable;
        super.onRestoreInstanceState(r1Var.f5182g);
        ActionMenuView actionMenuView = this.f458g;
        h hVar = actionMenuView != null ? actionMenuView.f422v : null;
        int i10 = r1Var.f4433i;
        if (i10 != 0 && this.O != null && hVar != null && (findItem = hVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (r1Var.f4434j) {
            g gVar = this.Q;
            removeCallbacks(gVar);
            post(gVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        u0 u0Var = this.f477z;
        boolean z10 = i10 == 1;
        if (z10 == u0Var.f4484g) {
            return;
        }
        u0Var.f4484g = z10;
        if (!u0Var.f4485h) {
            u0Var.f4478a = u0Var.f4482e;
            u0Var.f4479b = u0Var.f4483f;
            return;
        }
        if (z10) {
            int i11 = u0Var.f4481d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = u0Var.f4482e;
            }
            u0Var.f4478a = i11;
            int i12 = u0Var.f4480c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = u0Var.f4483f;
            }
            u0Var.f4479b = i12;
            return;
        }
        int i13 = u0Var.f4480c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = u0Var.f4482e;
        }
        u0Var.f4478a = i13;
        int i14 = u0Var.f4481d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = u0Var.f4483f;
        }
        u0Var.f4479b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar;
        f fVar;
        l.i iVar2;
        r1 r1Var = new r1(super.onSaveInstanceState());
        o1 o1Var = this.O;
        if (o1Var != null && (iVar2 = o1Var.f4421h) != null) {
            r1Var.f4433i = iVar2.f3710a;
        }
        ActionMenuView actionMenuView = this.f458g;
        r1Var.f4434j = (actionMenuView == null || (iVar = actionMenuView.f425y) == null || (fVar = iVar.f4329x) == null || !fVar.b()) ? false : true;
        return r1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    public final void p(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(j.a.a(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.B) {
            this.B = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.A) {
            this.A = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(j.a.a(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(j.a.a(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f461j.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f458g.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f468q != i10) {
            this.f468q = i10;
            if (i10 == 0) {
                this.f467p = getContext();
            } else {
                this.f467p = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f476y = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f474w = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f473v = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f475x = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        p1 p1Var = new p1(context, attributeSet);
        p1Var.f4425a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f2911b);
        p1Var.f4425a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        p1Var.f4426b = 0;
        return p1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        p pVar = this.f465n;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f465n.setImageDrawable(drawable);
        } else {
            p pVar = this.f465n;
            if (pVar != null) {
                pVar.setImageDrawable(this.f463l);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f462k == null) {
                this.f462k = new q(getContext(), 0);
            }
            if (!l(this.f462k)) {
                b(this.f462k, true);
            }
        } else {
            q qVar = this.f462k;
            if (qVar != null && l(qVar)) {
                removeView(this.f462k);
                this.K.remove(this.f462k);
            }
        }
        q qVar2 = this.f462k;
        if (qVar2 != null) {
            qVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f462k == null) {
            this.f462k = new q(getContext(), 0);
        }
        q qVar = this.f462k;
        if (qVar != null) {
            qVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        p pVar = this.f461j;
        if (pVar != null) {
            pVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.f461j)) {
                b(this.f461j, true);
            }
        } else {
            p pVar = this.f461j;
            if (pVar != null && l(pVar)) {
                removeView(this.f461j);
                this.K.remove(this.f461j);
            }
        }
        p pVar2 = this.f461j;
        if (pVar2 != null) {
            pVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            v vVar = this.f460i;
            if (vVar != null && l(vVar)) {
                removeView(this.f460i);
                this.K.remove(this.f460i);
            }
        } else {
            if (this.f460i == null) {
                Context context = getContext();
                v vVar2 = new v(context, null);
                this.f460i = vVar2;
                vVar2.setSingleLine();
                this.f460i.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f470s;
                if (i10 != 0) {
                    this.f460i.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.f460i.setTextColor(colorStateList);
                }
            }
            if (!l(this.f460i)) {
                b(this.f460i, true);
            }
        }
        v vVar3 = this.f460i;
        if (vVar3 != null) {
            vVar3.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        v vVar = this.f460i;
        if (vVar != null) {
            vVar.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            v vVar = this.f459h;
            if (vVar != null && l(vVar)) {
                removeView(this.f459h);
                this.K.remove(this.f459h);
            }
        } else {
            if (this.f459h == null) {
                Context context = getContext();
                v vVar2 = new v(context, null);
                this.f459h = vVar2;
                vVar2.setSingleLine();
                this.f459h.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f469r;
                if (i10 != 0) {
                    this.f459h.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.f459h.setTextColor(colorStateList);
                }
            }
            if (!l(this.f459h)) {
                b(this.f459h, true);
            }
        }
        v vVar3 = this.f459h;
        if (vVar3 != null) {
            vVar3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        v vVar = this.f459h;
        if (vVar != null) {
            vVar.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(q1 q1Var) {
    }
}
