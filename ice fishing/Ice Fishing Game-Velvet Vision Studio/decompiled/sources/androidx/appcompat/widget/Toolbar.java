package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.h4.b;
import com.gamericefishpro.space.j.a;
import com.gamericefishpro.space.l.d;
import com.gamericefishpro.space.m.i;
import com.gamericefishpro.space.m.j;
import com.gamericefishpro.space.n.a2;
import com.gamericefishpro.space.n.b2;
import com.gamericefishpro.space.n.c2;
import com.gamericefishpro.space.n.d2;
import com.gamericefishpro.space.n.e2;
import com.gamericefishpro.space.n.f;
import com.gamericefishpro.space.n.f2;
import com.gamericefishpro.space.n.g2;
import com.gamericefishpro.space.n.h2;
import com.gamericefishpro.space.n.i0;
import com.gamericefishpro.space.n.k2;
import com.gamericefishpro.space.n.p0;
import com.gamericefishpro.space.n.r1;
import com.gamericefishpro.space.n.u;
import com.gamericefishpro.space.n.v;
import com.gamericefishpro.space.n.y1;
import com.gamericefishpro.space.n.z1;
import com.gamericefishpro.space.vb.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public u A;
    public View B;
    public Context C;
    public int D;
    public int E;
    public int F;
    public final int G;
    public final int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public r1 M;
    public int N;
    public int O;
    public final int P;
    public CharSequence Q;
    public CharSequence R;
    public ColorStateList S;
    public ColorStateList T;
    public boolean U;
    public boolean V;
    public final ArrayList W;
    public final ArrayList a0;
    public final int[] b0;
    public final c c0;
    public ActionMenuView d;
    public ArrayList d0;
    public i0 e;
    public final z1 e0;
    public g2 f0;
    public c2 g0;
    public boolean h0;
    public i0 i;
    public OnBackInvokedCallback i0;
    public OnBackInvokedDispatcher j0;
    public boolean k0;
    public final b l0;
    public u v;
    public v w;
    public final Drawable y;
    public final CharSequence z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static d2 g() {
        d2 d2Var = new d2(-2, -2);
        d2Var.b = 0;
        d2Var.a = 8388627;
        return d2Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static d2 h(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof d2;
        if (z) {
            d2 d2Var = (d2) layoutParams;
            d2 d2Var2 = new d2(d2Var);
            d2Var2.b = 0;
            d2Var2.b = d2Var.b;
            return d2Var2;
        }
        if (z) {
            d2 d2Var3 = new d2((d2) layoutParams);
            d2Var3.b = 0;
            return d2Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            d2 d2Var4 = new d2(layoutParams);
            d2Var4.b = 0;
            return d2Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        d2 d2Var5 = new d2(marginLayoutParams);
        d2Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) d2Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) d2Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) d2Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) d2Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return d2Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                d2 d2Var = (d2) childAt.getLayoutParams();
                if (d2Var.b == 0 && r(childAt)) {
                    int i3 = d2Var.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
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
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            d2 d2Var2 = (d2) childAt2.getLayoutParams();
            if (d2Var2.b == 0 && r(childAt2)) {
                int i5 = d2Var2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        d2 d2VarH;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            d2VarH = g();
        } else {
            d2VarH = !checkLayoutParams(layoutParams) ? h(layoutParams) : (d2) layoutParams;
        }
        d2VarH.b = 1;
        if (!z || this.B == null) {
            addView(view, d2VarH);
        } else {
            view.setLayoutParams(d2VarH);
            this.a0.add(view);
        }
    }

    public final void c() {
        if (this.A == null) {
            u uVar = new u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.A = uVar;
            uVar.setImageDrawable(this.y);
            this.A.setContentDescription(this.z);
            d2 d2VarG = g();
            d2VarG.a = (this.G & 112) | 8388611;
            d2VarG.b = 2;
            this.A.setLayoutParams(d2VarG);
            this.A.setOnClickListener(new a2(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof d2);
    }

    public final void d() {
        if (this.M == null) {
            r1 r1Var = new r1();
            r1Var.a = 0;
            r1Var.b = 0;
            r1Var.c = Integer.MIN_VALUE;
            r1Var.d = Integer.MIN_VALUE;
            r1Var.e = 0;
            r1Var.f = 0;
            r1Var.g = false;
            r1Var.h = false;
            this.M = r1Var;
        }
    }

    public final void e() {
        if (this.d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.d = actionMenuView;
            actionMenuView.setPopupTheme(this.D);
            this.d.setOnMenuItemClickListener(this.e0);
            ActionMenuView actionMenuView2 = this.d;
            z1 z1Var = new z1(this);
            actionMenuView2.getClass();
            actionMenuView2.M = z1Var;
            d2 d2VarG = g();
            d2VarG.a = (this.G & 112) | 8388613;
            this.d.setLayoutParams(d2VarG);
            b(this.d, false);
        }
        ActionMenuView actionMenuView3 = this.d;
        if (actionMenuView3.I == null) {
            i iVar = (i) actionMenuView3.getMenu();
            if (this.g0 == null) {
                this.g0 = new c2(this);
            }
            this.d.setExpandedActionViewsExclusive(true);
            iVar.b(this.g0, this.C);
            s();
        }
    }

    public final void f() {
        if (this.v == null) {
            this.v = new u(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            d2 d2VarG = g();
            d2VarG.a = (this.G & 112) | 8388611;
            this.v.setLayoutParams(d2VarG);
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
        u uVar = this.A;
        if (uVar != null) {
            return uVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        u uVar = this.A;
        if (uVar != null) {
            return uVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r1 r1Var = this.M;
        if (r1Var != null) {
            return r1Var.g ? r1Var.a : r1Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.O;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r1 r1Var = this.M;
        if (r1Var != null) {
            return r1Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        r1 r1Var = this.M;
        if (r1Var != null) {
            return r1Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        r1 r1Var = this.M;
        if (r1Var != null) {
            return r1Var.g ? r1Var.b : r1Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.N;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        i iVar;
        ActionMenuView actionMenuView = this.d;
        return (actionMenuView == null || (iVar = actionMenuView.I) == null || !iVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.O, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.N, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        v vVar = this.w;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        v vVar = this.w;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.d.getMenu();
    }

    public View getNavButtonView() {
        return this.v;
    }

    public CharSequence getNavigationContentDescription() {
        u uVar = this.v;
        if (uVar != null) {
            return uVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        u uVar = this.v;
        if (uVar != null) {
            return uVar.getDrawable();
        }
        return null;
    }

    public com.gamericefishpro.space.n.i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.C;
    }

    public int getPopupTheme() {
        return this.D;
    }

    public CharSequence getSubtitle() {
        return this.R;
    }

    public final TextView getSubtitleTextView() {
        return this.i;
    }

    public CharSequence getTitle() {
        return this.Q;
    }

    public int getTitleMarginBottom() {
        return this.L;
    }

    public int getTitleMarginEnd() {
        return this.J;
    }

    public int getTitleMarginStart() {
        return this.I;
    }

    public int getTitleMarginTop() {
        return this.K;
    }

    public final TextView getTitleTextView() {
        return this.e;
    }

    public p0 getWrapper() {
        Drawable drawable;
        if (this.f0 == null) {
            g2 g2Var = new g2();
            g2Var.l = 0;
            g2Var.a = this;
            g2Var.h = getTitle();
            g2Var.i = getSubtitle();
            g2Var.g = g2Var.h != null;
            g2Var.f = getNavigationIcon();
            com.gamericefishpro.space.a8.c cVarT = com.gamericefishpro.space.a8.c.t(getContext(), null, a.a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) cVarT.i;
            g2Var.m = cVarT.l(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                g2Var.g = true;
                g2Var.h = text;
                if ((g2Var.b & 8) != 0) {
                    setTitle(text);
                    if (g2Var.g) {
                        l0.m(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                g2Var.i = text2;
                if ((g2Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableL = cVarT.l(20);
            if (drawableL != null) {
                g2Var.e = drawableL;
                g2Var.c();
            }
            Drawable drawableL2 = cVarT.l(17);
            if (drawableL2 != null) {
                g2Var.d = drawableL2;
                g2Var.c();
            }
            if (g2Var.f == null && (drawable = g2Var.m) != null) {
                g2Var.f = drawable;
                if ((g2Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            g2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = g2Var.c;
                if (view != null && (g2Var.b & 16) != 0) {
                    removeView(view);
                }
                g2Var.c = viewInflate;
                if (viewInflate != null && (g2Var.b & 16) != 0) {
                    addView(viewInflate);
                }
                g2Var.a(g2Var.b | 16);
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
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.M.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.E = resourceId2;
                i0 i0Var = this.e;
                if (i0Var != null) {
                    i0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.F = resourceId3;
                i0 i0Var2 = this.i;
                if (i0Var2 != null) {
                    i0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            cVarT.u();
            if (R.string.abc_action_bar_up_description != g2Var.l) {
                g2Var.l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = g2Var.l;
                    g2Var.j = i != 0 ? getContext().getString(i) : null;
                    g2Var.b();
                }
            }
            g2Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new a2(g2Var));
            this.f0 = g2Var;
        }
        return this.f0;
    }

    public final int i(View view, int i) {
        d2 d2Var = (d2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = d2Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.P & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) d2Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) d2Var).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) d2Var).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    public final void l() {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c0.e).iterator();
        if (it.hasNext()) {
            ((com.gamericefishpro.space.w4.i) it.next()).getClass();
            throw null;
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.d0 = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.a0.contains(view);
    }

    public final int n(View view, int i, int i2, int[] iArr) {
        d2 d2Var = (d2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) d2Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i4, iMax + measuredWidth, view.getMeasuredHeight() + i4);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) d2Var).rightMargin + iMax;
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        d2 d2Var = (d2) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) d2Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int i4 = i(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i4, iMax, view.getMeasuredHeight() + i4);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) d2Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.l0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.V = false;
        }
        if (!this.V) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.V = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.V = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iN;
        int iO;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        i0 i0Var;
        i0 i0Var2;
        d2 d2Var;
        d2 d2Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList;
        int size;
        int iN2;
        int i18;
        int size2;
        int i19;
        int i20;
        int size3;
        int i21;
        int i22;
        int measuredWidth;
        int i23;
        int i24;
        int i25;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.b0;
        iArr[1] = 0;
        iArr[0] = 0;
        Field field = l0.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (r(this.v)) {
            if (z3) {
                iO = o(this.v, i26, iMin2, iArr);
                iN = paddingLeft;
            } else {
                iN = n(this.v, paddingLeft, iMin2, iArr);
            }
            if (r(this.A)) {
                if (z3) {
                    iO = o(this.A, iO, iMin2, iArr);
                } else {
                    iN = n(this.A, iN, iMin2, iArr);
                }
            }
            if (r(this.d)) {
                if (z3) {
                    iN = n(this.d, iN, iMin2, iArr);
                } else {
                    iO = o(this.d, iO, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iN);
            iArr[1] = Math.max(0, currentContentInsetRight - (i26 - iO));
            iMax = Math.max(iN, currentContentInsetLeft);
            iMin = Math.min(iO, i26 - currentContentInsetRight);
            if (r(this.B)) {
                if (z3) {
                    iMin = o(this.B, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.B, iMax, iMin2, iArr);
                }
            }
            if (r(this.w)) {
                if (z3) {
                    iMin = o(this.w, iMin, iMin2, iArr);
                } else {
                    iMax = n(this.w, iMax, iMin2, iArr);
                }
            }
            zR = r(this.e);
            zR2 = r(this.i);
            if (zR) {
                d2 d2Var3 = (d2) this.e.getLayoutParams();
                measuredHeight = this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d2Var3).topMargin + ((ViewGroup.MarginLayoutParams) d2Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                d2 d2Var4 = (d2) this.i.getLayoutParams();
                measuredHeight = this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d2Var4).topMargin + ((ViewGroup.MarginLayoutParams) d2Var4).bottomMargin + measuredHeight;
            }
            if (zR || zR2) {
                if (zR) {
                    i0Var = this.e;
                } else {
                    i0Var = this.i;
                }
                if (zR2) {
                    i0Var2 = this.i;
                } else {
                    i0Var2 = this.e;
                }
                d2Var = (d2) i0Var.getLayoutParams();
                d2Var2 = (d2) i0Var2.getLayoutParams();
                i5 = measuredHeight;
                z2 = (!zR && this.e.getMeasuredWidth() > 0) || (zR2 && this.i.getMeasuredWidth() > 0);
                i6 = this.P & 112;
                i7 = iMax;
                if (i6 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) d2Var).topMargin + this.K;
                } else if (i6 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) d2Var).topMargin + this.K;
                    if (iMax2 < i14) {
                        iMax2 = i14;
                    } else {
                        i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) d2Var).bottomMargin;
                        i17 = this.L;
                        if (i15 < i16 + i17) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) d2Var2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) d2Var2).bottomMargin) - this.L) - i5;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.I;
                    } else {
                        i11 = 0;
                    }
                    int i27 = i11 - iArr[1];
                    iMin -= Math.max(0, i27);
                    iArr[1] = Math.max(0, -i27);
                    if (zR) {
                        d2 d2Var5 = (d2) this.e.getLayoutParams();
                        int measuredWidth2 = iMin - this.e.getMeasuredWidth();
                        int measuredHeight2 = this.e.getMeasuredHeight() + paddingTop;
                        this.e.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth2 - this.J;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) d2Var5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zR2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d2) this.i.getLayoutParams())).topMargin;
                        this.i.layout(iMin - this.i.getMeasuredWidth(), i28, iMin, this.i.getMeasuredHeight() + i28);
                        i13 = iMin - this.J;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = i7;
                } else {
                    if (z2) {
                        i8 = this.I;
                    } else {
                        i8 = 0;
                    }
                    int i29 = i8 - iArr[0];
                    iMax = Math.max(0, i29) + i7;
                    iArr[0] = Math.max(0, -i29);
                    if (zR) {
                        d2 d2Var6 = (d2) this.e.getLayoutParams();
                        int measuredWidth3 = this.e.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.e.getMeasuredHeight() + paddingTop;
                        this.e.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i9 = measuredWidth3 + this.J;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) d2Var6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zR2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d2) this.i.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.i.getMeasuredWidth() + iMax;
                        this.i.layout(iMax, i30, measuredWidth4, this.i.getMeasuredHeight() + i30);
                        i10 = measuredWidth4 + this.J;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
            }
            arrayList = this.W;
            a(3, arrayList);
            size = arrayList.size();
            iN2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iN2 = n((View) arrayList.get(i18), iN2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i19 = 0; i19 < size2; i19++) {
                iMin = o((View) arrayList.get(i19), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i31 = iArr[0];
            i20 = iArr[1];
            size3 = arrayList.size();
            i21 = i31;
            i22 = 0;
            measuredWidth = 0;
            while (i22 < size3) {
                View view = (View) arrayList.get(i22);
                d2 d2Var7 = (d2) view.getLayoutParams();
                int i32 = i20;
                int i33 = ((ViewGroup.MarginLayoutParams) d2Var7).leftMargin - i21;
                int i34 = ((ViewGroup.MarginLayoutParams) d2Var7).rightMargin - i32;
                int iMax3 = Math.max(0, i33);
                int iMax4 = Math.max(0, i34);
                int iMax5 = Math.max(0, -i33);
                int iMax6 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i22++;
                i21 = iMax5;
                i20 = iMax6;
            }
            i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iN2) {
                if (i25 > iMin) {
                    iN2 = i24 - (i25 - iMin);
                } else {
                    iN2 = i24;
                }
            }
            size4 = arrayList.size();
            for (i23 = 0; i23 < size4; i23++) {
                iN2 = n((View) arrayList.get(i23), iN2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iN = paddingLeft;
        iO = i26;
        if (r(this.A)) {
            if (z3) {
                iO = o(this.A, iO, iMin2, iArr);
            } else {
                iN = n(this.A, iN, iMin2, iArr);
            }
        }
        if (r(this.d)) {
            if (z3) {
                iN = n(this.d, iN, iMin2, iArr);
            } else {
                iO = o(this.d, iO, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iN);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - iO));
        iMax = Math.max(iN, currentContentInsetLeft2);
        iMin = Math.min(iO, i26 - currentContentInsetRight2);
        if (r(this.B)) {
            if (z3) {
                iMin = o(this.B, iMin, iMin2, iArr);
            } else {
                iMax = n(this.B, iMax, iMin2, iArr);
            }
        }
        if (r(this.w)) {
            if (z3) {
                iMin = o(this.w, iMin, iMin2, iArr);
            } else {
                iMax = n(this.w, iMax, iMin2, iArr);
            }
        }
        zR = r(this.e);
        zR2 = r(this.i);
        if (zR) {
            d2 d2Var8 = (d2) this.e.getLayoutParams();
            measuredHeight = this.e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d2Var8).topMargin + ((ViewGroup.MarginLayoutParams) d2Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            d2 d2Var9 = (d2) this.i.getLayoutParams();
            measuredHeight = this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) d2Var9).topMargin + ((ViewGroup.MarginLayoutParams) d2Var9).bottomMargin + measuredHeight;
        }
        if (zR) {
            if (zR) {
                i0Var = this.e;
            } else {
                i0Var = this.i;
            }
            if (zR2) {
                i0Var2 = this.i;
            } else {
                i0Var2 = this.e;
            }
            d2Var = (d2) i0Var.getLayoutParams();
            d2Var2 = (d2) i0Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zR) {
            }
            i6 = this.P & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) d2Var).topMargin + this.K;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) d2Var).topMargin + this.K;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) d2Var).bottomMargin;
                    i17 = this.L;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) d2Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) d2Var2).bottomMargin) - this.L) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.I;
                } else {
                    i11 = 0;
                }
                int i210 = i11 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zR) {
                    d2 d2Var10 = (d2) this.e.getLayoutParams();
                    int measuredWidth5 = iMin - this.e.getMeasuredWidth();
                    int measuredHeight4 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth5 - this.J;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) d2Var10).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zR2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d2) this.i.getLayoutParams())).topMargin;
                    this.i.layout(iMin - this.i.getMeasuredWidth(), i211, iMin, this.i.getMeasuredHeight() + i211);
                    i13 = iMin - this.J;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.I;
                } else {
                    i8 = 0;
                }
                int i212 = i8 - iArr[0];
                iMax = Math.max(0, i212) + i7;
                iArr[0] = Math.max(0, -i212);
                if (zR) {
                    d2 d2Var11 = (d2) this.e.getLayoutParams();
                    int measuredWidth6 = this.e.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i9 = measuredWidth6 + this.J;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) d2Var11).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zR2) {
                    int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d2) this.i.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.i.getMeasuredWidth() + iMax;
                    this.i.layout(iMax, i35, measuredWidth7, this.i.getMeasuredHeight() + i35);
                    i10 = measuredWidth7 + this.J;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zR) {
                i0Var = this.e;
            } else {
                i0Var = this.i;
            }
            if (zR2) {
                i0Var2 = this.i;
            } else {
                i0Var2 = this.e;
            }
            d2Var = (d2) i0Var.getLayoutParams();
            d2Var2 = (d2) i0Var2.getLayoutParams();
            i5 = measuredHeight;
            if (zR) {
            }
            i6 = this.P & 112;
            i7 = iMax;
            if (i6 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) d2Var).topMargin + this.K;
            } else if (i6 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i5) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) d2Var).topMargin + this.K;
                if (iMax2 < i14) {
                    iMax2 = i14;
                } else {
                    i15 = (((height - paddingBottom) - i5) - iMax2) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) d2Var).bottomMargin;
                    i17 = this.L;
                    if (i15 < i16 + i17) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) d2Var2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) d2Var2).bottomMargin) - this.L) - i5;
            }
            if (z3) {
                if (z2) {
                    i11 = this.I;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zR) {
                    d2 d2Var12 = (d2) this.e.getLayoutParams();
                    int measuredWidth8 = iMin - this.e.getMeasuredWidth();
                    int measuredHeight6 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth8 - this.J;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) d2Var12).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zR2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d2) this.i.getLayoutParams())).topMargin;
                    this.i.layout(iMin - this.i.getMeasuredWidth(), i214, iMin, this.i.getMeasuredHeight() + i214);
                    i13 = iMin - this.J;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = i7;
            } else {
                if (z2) {
                    i8 = this.I;
                } else {
                    i8 = 0;
                }
                int i215 = i8 - iArr[0];
                iMax = Math.max(0, i215) + i7;
                iArr[0] = Math.max(0, -i215);
                if (zR) {
                    d2 d2Var13 = (d2) this.e.getLayoutParams();
                    int measuredWidth9 = this.e.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.e.getMeasuredHeight() + paddingTop;
                    this.e.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i9 = measuredWidth9 + this.J;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) d2Var13).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zR2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((d2) this.i.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.i.getMeasuredWidth() + iMax;
                    this.i.layout(iMax, i36, measuredWidth10, this.i.getMeasuredHeight() + i36);
                    i10 = measuredWidth10 + this.J;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        arrayList = this.W;
        a(3, arrayList);
        size = arrayList.size();
        iN2 = iMax;
        while (i18 < size) {
            iN2 = n((View) arrayList.get(i18), iN2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i19 < size2) {
            iMin = o((View) arrayList.get(i19), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i37 = iArr[0];
        i20 = iArr[1];
        size3 = arrayList.size();
        i21 = i37;
        i22 = 0;
        measuredWidth = 0;
        while (i22 < size3) {
            View view2 = (View) arrayList.get(i22);
            d2 d2Var14 = (d2) view2.getLayoutParams();
            int i38 = i20;
            int i39 = ((ViewGroup.MarginLayoutParams) d2Var14).leftMargin - i21;
            int i310 = ((ViewGroup.MarginLayoutParams) d2Var14).rightMargin - i38;
            int iMax7 = Math.max(0, i39);
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, -i39);
            int iMax10 = Math.max(0, -i310);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i22++;
            i21 = iMax9;
            i20 = iMax10;
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iN2) {
            if (i25 > iMin) {
                iN2 = i24 - (i25 - iMin);
            } else {
                iN2 = i24;
            }
        }
        size4 = arrayList.size();
        while (i23 < size4) {
            iN2 = n((View) arrayList.get(i23), iN2, iMin2, iArr);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z = k2.a;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (r(this.v)) {
            q(this.v, i, 0, i2, this.H);
            iJ = j(this.v) + this.v.getMeasuredWidth();
            iMax = Math.max(0, k(this.v) + this.v.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.v.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.A)) {
            q(this.A, i, 0, i2, this.H);
            iJ = j(this.A) + this.A.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.A) + this.A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.A.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        Object[] objArr2 = objArr;
        int[] iArr = this.b0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (r(this.d)) {
            q(this.d, i, iMax3, i2, this.H);
            iJ2 = j(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[c] = Math.max(0, currentContentInsetEnd - iJ2);
        if (r(this.B)) {
            iMax5 += p(this.B, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.B) + this.B.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.B.getMeasuredState());
        }
        if (r(this.w)) {
            iMax5 += p(this.w, i, iMax5, i2, 0, iArr);
            iMax = Math.max(iMax, k(this.w) + this.w.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.w.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((d2) childAt.getLayoutParams()).b == 0 && r(childAt)) {
                iMax5 += p(childAt, i, iMax5, i2, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i5 = iMax5;
        int i6 = this.K + this.L;
        int i7 = this.I + this.J;
        if (r(this.e)) {
            p(this.e, i, i5 + i7, i2, i6, iArr);
            int iJ3 = j(this.e) + this.e.getMeasuredWidth();
            iK = k(this.e) + this.e.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (r(this.i)) {
            iMax2 = Math.max(iMax2, p(this.i, i, i5 + i7, i2, i6 + iK, iArr));
            iK += k(this.i) + this.i.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.i.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i5 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.h0) {
            i3 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i3 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof f2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f2 f2Var = (f2) parcelable;
        super.onRestoreInstanceState(f2Var.d);
        ActionMenuView actionMenuView = this.d;
        i iVar = actionMenuView != null ? actionMenuView.I : null;
        int i = f2Var.i;
        if (i != 0 && this.g0 != null && iVar != null && (menuItemFindItem = iVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (f2Var.v) {
            b bVar = this.l0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        r1 r1Var = this.M;
        boolean z = i == 1;
        if (z == r1Var.g) {
            return;
        }
        r1Var.g = z;
        if (!r1Var.h) {
            r1Var.a = r1Var.e;
            r1Var.b = r1Var.f;
            return;
        }
        if (z) {
            int i2 = r1Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = r1Var.e;
            }
            r1Var.a = i2;
            int i3 = r1Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = r1Var.f;
            }
            r1Var.b = i3;
            return;
        }
        int i4 = r1Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = r1Var.e;
        }
        r1Var.a = i4;
        int i5 = r1Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = r1Var.f;
        }
        r1Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        com.gamericefishpro.space.n.i iVar;
        f fVar;
        j jVar;
        f2 f2Var = new f2(super.onSaveInstanceState());
        c2 c2Var = this.g0;
        if (c2Var != null && (jVar = c2Var.e) != null) {
            f2Var.i = jVar.a;
        }
        ActionMenuView actionMenuView = this.d;
        f2Var.v = (actionMenuView == null || (iVar = actionMenuView.L) == null || (fVar = iVar.K) == null || !fVar.b()) ? false : true;
        return f2Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.U = false;
        }
        if (!this.U) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.U = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.U = false;
        return true;
    }

    public final int p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = b2.a(this);
            c2 c2Var = this.g0;
            boolean z = (c2Var == null || c2Var.e == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.k0) ? false : true;
            if (z && this.j0 == null) {
                if (this.i0 == null) {
                    this.i0 = b2.b(new y1(this, 0));
                }
                b2.c(onBackInvokedDispatcherA, this.i0);
                this.j0 = onBackInvokedDispatcherA;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.j0) == null) {
                return;
            }
            b2.d(onBackInvokedDispatcher, this.i0);
            this.j0 = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            s();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(com.gamericefishpro.space.u6.f.x(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.h0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.O) {
            this.O = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.N) {
            this.N = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(com.gamericefishpro.space.u6.f.x(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(com.gamericefishpro.space.u6.f.x(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.v.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.D != i) {
            this.D = i;
            if (i == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.L = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.J = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.I = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.K = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.P = 8388627;
        this.W = new ArrayList();
        this.a0 = new ArrayList();
        this.b0 = new int[2];
        this.c0 = new c(new y1(this, 1));
        this.d0 = new ArrayList();
        this.e0 = new z1(this);
        this.l0 = new b(6, this);
        Context context2 = getContext();
        int[] iArr = a.s;
        com.gamericefishpro.space.a8.c cVarT = com.gamericefishpro.space.a8.c.t(context2, attributeSet, iArr, R.attr.toolbarStyle);
        l0.k(this, context, iArr, attributeSet, (TypedArray) cVarT.i, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) cVarT.i;
        this.E = typedArray.getResourceId(28, 0);
        this.F = typedArray.getResourceId(19, 0);
        this.P = typedArray.getInteger(0, 8388627);
        this.G = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.L = dimensionPixelOffset;
        this.K = dimensionPixelOffset;
        this.J = dimensionPixelOffset;
        this.I = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.I = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.J = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.K = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.L = dimensionPixelOffset5;
        }
        this.H = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        r1 r1Var = this.M;
        r1Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            r1Var.e = dimensionPixelSize;
            r1Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            r1Var.f = dimensionPixelSize2;
            r1Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            r1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.N = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.O = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.y = cVarT.l(4);
        this.z = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.C = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableL = cVarT.l(16);
        if (drawableL != null) {
            setNavigationIcon(drawableL);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableL2 = cVarT.l(11);
        if (drawableL2 != null) {
            setLogo(drawableL2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(cVarT.k(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(cVarT.k(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        cVarT.u();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d2 d2Var = new d2(context, attributeSet);
        d2Var.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b);
        d2Var.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        d2Var.b = 0;
        return d2Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        u uVar = this.A;
        if (uVar != null) {
            uVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.A.setImageDrawable(drawable);
        } else {
            u uVar = this.A;
            if (uVar != null) {
                uVar.setImageDrawable(this.y);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.w == null) {
                this.w = new v(getContext(), 0);
            }
            if (!m(this.w)) {
                b(this.w, true);
            }
        } else {
            v vVar = this.w;
            if (vVar != null && m(vVar)) {
                removeView(this.w);
                this.a0.remove(this.w);
            }
        }
        v vVar2 = this.w;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.w == null) {
            this.w = new v(getContext(), 0);
        }
        v vVar = this.w;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        u uVar = this.v;
        if (uVar != null) {
            uVar.setContentDescription(charSequence);
            h2.a(this.v, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.v)) {
                b(this.v, true);
            }
        } else {
            u uVar = this.v;
            if (uVar != null && m(uVar)) {
                removeView(this.v);
                this.a0.remove(this.v);
            }
        }
        u uVar2 = this.v;
        if (uVar2 != null) {
            uVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            i0 i0Var = this.i;
            if (i0Var != null && m(i0Var)) {
                removeView(this.i);
                this.a0.remove(this.i);
            }
        } else {
            if (this.i == null) {
                Context context = getContext();
                i0 i0Var2 = new i0(context, null);
                this.i = i0Var2;
                i0Var2.setSingleLine();
                this.i.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.F;
                if (i != 0) {
                    this.i.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.T;
                if (colorStateList != null) {
                    this.i.setTextColor(colorStateList);
                }
            }
            if (!m(this.i)) {
                b(this.i, true);
            }
        }
        i0 i0Var3 = this.i;
        if (i0Var3 != null) {
            i0Var3.setText(charSequence);
        }
        this.R = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.T = colorStateList;
        i0 i0Var = this.i;
        if (i0Var != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            i0 i0Var = this.e;
            if (i0Var != null && m(i0Var)) {
                removeView(this.e);
                this.a0.remove(this.e);
            }
        } else {
            if (this.e == null) {
                Context context = getContext();
                i0 i0Var2 = new i0(context, null);
                this.e = i0Var2;
                i0Var2.setSingleLine();
                this.e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.E;
                if (i != 0) {
                    this.e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    this.e.setTextColor(colorStateList);
                }
            }
            if (!m(this.e)) {
                b(this.e, true);
            }
        }
        i0 i0Var3 = this.e;
        if (i0Var3 != null) {
            i0Var3.setText(charSequence);
        }
        this.Q = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.S = colorStateList;
        i0 i0Var = this.e;
        if (i0Var != null) {
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(e2 e2Var) {
    }
}
