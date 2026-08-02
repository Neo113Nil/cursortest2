package androidx.appcompat.widget;

import A8.b;
import G0.c;
import I0.j;
import M.h;
import N3.n;
import O.C0344n;
import O.InterfaceC0346p;
import O.X;
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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.F;
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.g;
import g.AbstractC4528a;
import h.C4543G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C4632i;
import l.m;
import l.o;
import m.C4708k;
import m.C4731w;
import m.C4733x;
import m.InterfaceC4705i0;
import m.K0;
import m.Q0;
import m.R0;
import m.S0;
import m.T0;
import m.U0;
import m.V0;
import m.W0;
import m.Y0;
import m.Z;
import m.g1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public C4731w f4553A;

    /* renamed from: B, reason: collision with root package name */
    public View f4554B;

    /* renamed from: C, reason: collision with root package name */
    public Context f4555C;

    /* renamed from: D, reason: collision with root package name */
    public int f4556D;

    /* renamed from: E, reason: collision with root package name */
    public int f4557E;

    /* renamed from: F, reason: collision with root package name */
    public int f4558F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4559G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4560H;

    /* renamed from: I, reason: collision with root package name */
    public int f4561I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f4562K;

    /* renamed from: L, reason: collision with root package name */
    public int f4563L;

    /* renamed from: M, reason: collision with root package name */
    public K0 f4564M;

    /* renamed from: N, reason: collision with root package name */
    public int f4565N;

    /* renamed from: O, reason: collision with root package name */
    public int f4566O;

    /* renamed from: P, reason: collision with root package name */
    public final int f4567P;

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f4568Q;

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f4569R;

    /* renamed from: S, reason: collision with root package name */
    public ColorStateList f4570S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f4571T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4572U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4573V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f4574W;

    /* renamed from: i0, reason: collision with root package name */
    public final ArrayList f4575i0;

    /* renamed from: j0, reason: collision with root package name */
    public final int[] f4576j0;

    /* renamed from: k0, reason: collision with root package name */
    public final C0344n f4577k0;

    /* renamed from: l0, reason: collision with root package name */
    public ArrayList f4578l0;
    public V0 m0;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuView f4579n;

    /* renamed from: n0, reason: collision with root package name */
    public final C4543G f4580n0;

    /* renamed from: o0, reason: collision with root package name */
    public Y0 f4581o0;

    /* renamed from: p0, reason: collision with root package name */
    public C4708k f4582p0;

    /* renamed from: q0, reason: collision with root package name */
    public T0 f4583q0;

    /* renamed from: r0, reason: collision with root package name */
    public h f4584r0;

    /* renamed from: s0, reason: collision with root package name */
    public j f4585s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f4586t0;

    /* renamed from: u, reason: collision with root package name */
    public Z f4587u;

    /* renamed from: u0, reason: collision with root package name */
    public OnBackInvokedCallback f4588u0;

    /* renamed from: v, reason: collision with root package name */
    public Z f4589v;

    /* renamed from: v0, reason: collision with root package name */
    public OnBackInvokedDispatcher f4590v0;

    /* renamed from: w, reason: collision with root package name */
    public C4731w f4591w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f4592w0;

    /* renamed from: x, reason: collision with root package name */
    public C4733x f4593x;

    /* renamed from: x0, reason: collision with root package name */
    public final c f4594x0;

    /* renamed from: y, reason: collision with root package name */
    public final Drawable f4595y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f4596z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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
        return new C4632i(getContext());
    }

    public static U0 h() {
        U0 u02 = new U0(-2, -2);
        u02.f39132b = 0;
        u02.f39131a = 8388627;
        return u02;
    }

    public static U0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z6 = layoutParams instanceof U0;
        if (z6) {
            U0 u02 = (U0) layoutParams;
            U0 u03 = new U0(u02);
            u03.f39132b = 0;
            u03.f39132b = u02.f39132b;
            return u03;
        }
        if (z6) {
            U0 u04 = new U0((U0) layoutParams);
            u04.f39132b = 0;
            return u04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            U0 u05 = new U0(layoutParams);
            u05.f39132b = 0;
            return u05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        U0 u06 = new U0(marginLayoutParams);
        u06.f39132b = 0;
        ((ViewGroup.MarginLayoutParams) u06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) u06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) u06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) u06).bottomMargin = marginLayoutParams.bottomMargin;
        return u06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                U0 u02 = (U0) childAt.getLayoutParams();
                if (u02.f39132b == 0 && u(childAt)) {
                    int i6 = u02.f39131a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, layoutDirection) & 7;
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
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            U0 u03 = (U0) childAt2.getLayoutParams();
            if (u03.f39132b == 0 && u(childAt2)) {
                int i10 = u03.f39131a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i10, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z6) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        U0 h3 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (U0) layoutParams;
        h3.f39132b = 1;
        if (!z6 || this.f4554B == null) {
            addView(view, h3);
        } else {
            view.setLayoutParams(h3);
            this.f4575i0.add(view);
        }
    }

    public final void c() {
        if (this.f4553A == null) {
            C4731w c4731w = new C4731w(getContext(), null, C5248R.attr.toolbarNavigationButtonStyle);
            this.f4553A = c4731w;
            c4731w.setImageDrawable(this.f4595y);
            this.f4553A.setContentDescription(this.f4596z);
            U0 h3 = h();
            h3.f39131a = (this.f4559G & 112) | 8388611;
            h3.f39132b = 2;
            this.f4553A.setLayoutParams(h3);
            this.f4553A.setOnClickListener(new n(12, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof U0);
    }

    public final void d() {
        if (this.f4564M == null) {
            K0 k02 = new K0();
            k02.f39092a = 0;
            k02.f39093b = 0;
            k02.f39094c = Integer.MIN_VALUE;
            k02.f39095d = Integer.MIN_VALUE;
            k02.f39096e = 0;
            k02.f39097f = 0;
            k02.f39098g = false;
            k02.f39099h = false;
            this.f4564M = k02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f4579n;
        if (actionMenuView.f4527I == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f4583q0 == null) {
                this.f4583q0 = new T0(this);
            }
            this.f4579n.setExpandedActionViewsExclusive(true);
            mVar.b(this.f4583q0, this.f4555C);
            w();
        }
    }

    public final void f() {
        if (this.f4579n == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4579n = actionMenuView;
            actionMenuView.setPopupTheme(this.f4556D);
            this.f4579n.setOnMenuItemClickListener(this.f4580n0);
            ActionMenuView actionMenuView2 = this.f4579n;
            h hVar = this.f4584r0;
            R0 r02 = new R0(this);
            actionMenuView2.f4531N = hVar;
            actionMenuView2.f4532O = r02;
            U0 h3 = h();
            h3.f39131a = (this.f4559G & 112) | 8388613;
            this.f4579n.setLayoutParams(h3);
            b(this.f4579n, false);
        }
    }

    public final void g() {
        if (this.f4591w == null) {
            this.f4591w = new C4731w(getContext(), null, C5248R.attr.toolbarNavigationButtonStyle);
            U0 h3 = h();
            h3.f39131a = (this.f4559G & 112) | 8388611;
            this.f4591w.setLayoutParams(h3);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C4731w c4731w = this.f4553A;
        if (c4731w != null) {
            return c4731w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C4731w c4731w = this.f4553A;
        if (c4731w != null) {
            return c4731w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        K0 k02 = this.f4564M;
        if (k02 != null) {
            return k02.f39098g ? k02.f39092a : k02.f39093b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f4566O;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        K0 k02 = this.f4564M;
        if (k02 != null) {
            return k02.f39092a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        K0 k02 = this.f4564M;
        if (k02 != null) {
            return k02.f39093b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        K0 k02 = this.f4564M;
        if (k02 != null) {
            return k02.f39098g ? k02.f39093b : k02.f39092a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f4565N;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f4579n;
        return (actionMenuView == null || (mVar = actionMenuView.f4527I) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4566O, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4565N, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C4733x c4733x = this.f4593x;
        if (c4733x != null) {
            return c4733x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C4733x c4733x = this.f4593x;
        if (c4733x != null) {
            return c4733x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4579n.getMenu();
    }

    public View getNavButtonView() {
        return this.f4591w;
    }

    public CharSequence getNavigationContentDescription() {
        C4731w c4731w = this.f4591w;
        if (c4731w != null) {
            return c4731w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C4731w c4731w = this.f4591w;
        if (c4731w != null) {
            return c4731w.getDrawable();
        }
        return null;
    }

    public C4708k getOuterActionMenuPresenter() {
        return this.f4582p0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4579n.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4555C;
    }

    public int getPopupTheme() {
        return this.f4556D;
    }

    public CharSequence getSubtitle() {
        return this.f4569R;
    }

    public final TextView getSubtitleTextView() {
        return this.f4589v;
    }

    public CharSequence getTitle() {
        return this.f4568Q;
    }

    public int getTitleMarginBottom() {
        return this.f4563L;
    }

    public int getTitleMarginEnd() {
        return this.J;
    }

    public int getTitleMarginStart() {
        return this.f4561I;
    }

    public int getTitleMarginTop() {
        return this.f4562K;
    }

    public final TextView getTitleTextView() {
        return this.f4587u;
    }

    public InterfaceC4705i0 getWrapper() {
        if (this.f4581o0 == null) {
            this.f4581o0 = new Y0(this, true);
        }
        return this.f4581o0;
    }

    public final int j(int i, View view) {
        U0 u02 = (U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i6 = u02.f39131a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f4567P & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i4;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) u02).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i9 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) u02).topMargin;
        if (i9 < i10) {
            i9 = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - i9) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) u02).bottomMargin;
            if (i11 < i12) {
                i9 = Math.max(0, i9 - (i12 - i11));
            }
        }
        return paddingTop + i9;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.f4578l0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f4577k0.f2200b.iterator();
        while (it2.hasNext()) {
            ((F) ((InterfaceC0346p) it2.next())).f4792a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4578l0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f4575i0.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4594x0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4573V = false;
        }
        if (!this.f4573V) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4573V = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4573V = false;
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
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c8 A[LOOP:2: B:47:0x02c6->B:48:0x02c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318 A[LOOP:3: B:56:0x0316->B:57:0x0318, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int i10;
        int i11;
        int max;
        boolean u6;
        boolean u9;
        boolean z9;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int i18;
        int i19;
        int size2;
        int i20;
        int size3;
        int i21;
        int i22;
        int i23;
        int size4;
        boolean z10 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.f4576j0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = X.f2142a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i9 - i4) : 0;
        if (!u(this.f4591w)) {
            i10 = paddingLeft;
        } else {
            if (z10) {
                i11 = r(this.f4591w, i24, min, iArr);
                i10 = paddingLeft;
                if (u(this.f4553A)) {
                    if (z10) {
                        i11 = r(this.f4553A, i11, min, iArr);
                    } else {
                        i10 = q(this.f4553A, i10, min, iArr);
                    }
                }
                if (u(this.f4579n)) {
                    if (z10) {
                        i10 = q(this.f4579n, i10, min, iArr);
                    } else {
                        i11 = r(this.f4579n, i11, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i10);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i11));
                max = Math.max(i10, currentContentInsetLeft);
                int min2 = Math.min(i11, i24 - currentContentInsetRight);
                if (u(this.f4554B)) {
                    if (z10) {
                        min2 = r(this.f4554B, min2, min, iArr);
                    } else {
                        max = q(this.f4554B, max, min, iArr);
                    }
                }
                if (u(this.f4593x)) {
                    if (z10) {
                        min2 = r(this.f4593x, min2, min, iArr);
                    } else {
                        max = q(this.f4593x, max, min, iArr);
                    }
                }
                u6 = u(this.f4587u);
                u9 = u(this.f4589v);
                if (u6) {
                    z9 = z10;
                    i12 = 0;
                } else {
                    U0 u02 = (U0) this.f4587u.getLayoutParams();
                    z9 = z10;
                    i12 = this.f4587u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u02).topMargin + ((ViewGroup.MarginLayoutParams) u02).bottomMargin;
                }
                if (!u9) {
                    U0 u03 = (U0) this.f4589v.getLayoutParams();
                    i12 = this.f4589v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u03).topMargin + ((ViewGroup.MarginLayoutParams) u03).bottomMargin + i12;
                }
                if (!u6 || u9) {
                    Z z11 = !u6 ? this.f4587u : this.f4589v;
                    Z z12 = !u9 ? this.f4589v : this.f4587u;
                    U0 u04 = (U0) z11.getLayoutParams();
                    U0 u05 = (U0) z12.getLayoutParams();
                    int i25 = i12;
                    boolean z13 = (!u6 && this.f4587u.getMeasuredWidth() > 0) || (u9 && this.f4589v.getMeasuredWidth() > 0);
                    i13 = this.f4567P & 112;
                    int i26 = max;
                    if (i13 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u04).topMargin + this.f4562K;
                    } else if (i13 != 80) {
                        int i27 = (((height - paddingTop2) - paddingBottom) - i25) / 2;
                        int i28 = ((ViewGroup.MarginLayoutParams) u04).topMargin + this.f4562K;
                        if (i27 < i28) {
                            i27 = i28;
                        } else {
                            int i29 = (((height - paddingBottom) - i25) - i27) - paddingTop2;
                            int i30 = ((ViewGroup.MarginLayoutParams) u04).bottomMargin;
                            int i31 = this.f4563L;
                            if (i29 < i30 + i31) {
                                i27 = Math.max(0, i27 - ((((ViewGroup.MarginLayoutParams) u05).bottomMargin + i31) - i29));
                            }
                        }
                        paddingTop = paddingTop2 + i27;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u05).bottomMargin) - this.f4563L) - i25;
                    }
                    if (z9) {
                        int i32 = (z13 ? this.f4561I : 0) - iArr[0];
                        max = Math.max(0, i32) + i26;
                        iArr[0] = Math.max(0, -i32);
                        if (u6) {
                            U0 u06 = (U0) this.f4587u.getLayoutParams();
                            int measuredWidth = this.f4587u.getMeasuredWidth() + max;
                            int measuredHeight = this.f4587u.getMeasuredHeight() + paddingTop;
                            this.f4587u.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.J;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) u06).bottomMargin;
                        } else {
                            i14 = max;
                        }
                        if (u9) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f4589v.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f4589v.getMeasuredWidth() + max;
                            this.f4589v.layout(max, i33, measuredWidth2, this.f4589v.getMeasuredHeight() + i33);
                            i15 = measuredWidth2 + this.J;
                        } else {
                            i15 = max;
                        }
                        if (z13) {
                            max = Math.max(i14, i15);
                        }
                    } else {
                        int i34 = (z13 ? this.f4561I : 0) - iArr[1];
                        min2 -= Math.max(0, i34);
                        iArr[1] = Math.max(0, -i34);
                        if (u6) {
                            U0 u07 = (U0) this.f4587u.getLayoutParams();
                            int measuredWidth3 = min2 - this.f4587u.getMeasuredWidth();
                            int measuredHeight2 = this.f4587u.getMeasuredHeight() + paddingTop;
                            this.f4587u.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.J;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) u07).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (u9) {
                            int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f4589v.getLayoutParams())).topMargin;
                            this.f4589v.layout(min2 - this.f4589v.getMeasuredWidth(), i35, min2, this.f4589v.getMeasuredHeight() + i35);
                            i17 = min2 - this.J;
                        } else {
                            i17 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i16, i17);
                        }
                        max = i26;
                    }
                }
                ArrayList arrayList = this.f4574W;
                a(3, arrayList);
                size = arrayList.size();
                i18 = max;
                for (i19 = 0; i19 < size; i19++) {
                    i18 = q((View) arrayList.get(i19), i18, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i20 = 0; i20 < size2; i20++) {
                    min2 = r((View) arrayList.get(i20), min2, min, iArr);
                }
                a(1, arrayList);
                int i36 = iArr[0];
                int i37 = iArr[1];
                size3 = arrayList.size();
                int i38 = i37;
                int i39 = i36;
                i21 = 0;
                int i40 = 0;
                while (i21 < size3) {
                    View view = (View) arrayList.get(i21);
                    U0 u08 = (U0) view.getLayoutParams();
                    int i41 = i21;
                    int i42 = ((ViewGroup.MarginLayoutParams) u08).leftMargin - i39;
                    int i43 = ((ViewGroup.MarginLayoutParams) u08).rightMargin - i38;
                    int max2 = Math.max(0, i42);
                    int max3 = Math.max(0, i43);
                    int max4 = Math.max(0, -i42);
                    int max5 = Math.max(0, -i43);
                    i40 += view.getMeasuredWidth() + max2 + max3;
                    i38 = max5;
                    i39 = max4;
                    i21 = i41 + 1;
                }
                i23 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i40 / 2);
                int i44 = i40 + i23;
                if (i23 >= i18) {
                    i18 = i44 > min2 ? i23 - (i44 - min2) : i23;
                }
                size4 = arrayList.size();
                for (i22 = 0; i22 < size4; i22++) {
                    i18 = q((View) arrayList.get(i22), i18, min, iArr);
                }
                arrayList.clear();
            }
            i10 = q(this.f4591w, paddingLeft, min, iArr);
        }
        i11 = i24;
        if (u(this.f4553A)) {
        }
        if (u(this.f4579n)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i10);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i11));
        max = Math.max(i10, currentContentInsetLeft2);
        int min22 = Math.min(i11, i24 - currentContentInsetRight2);
        if (u(this.f4554B)) {
        }
        if (u(this.f4593x)) {
        }
        u6 = u(this.f4587u);
        u9 = u(this.f4589v);
        if (u6) {
        }
        if (!u9) {
        }
        if (!u6) {
        }
        if (!u6) {
        }
        if (!u9) {
        }
        U0 u042 = (U0) z11.getLayoutParams();
        U0 u052 = (U0) z12.getLayoutParams();
        int i252 = i12;
        if (u6) {
        }
        i13 = this.f4567P & 112;
        int i262 = max;
        if (i13 != 48) {
        }
        if (z9) {
        }
        ArrayList arrayList2 = this.f4574W;
        a(3, arrayList2);
        size = arrayList2.size();
        i18 = max;
        while (i19 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i20 < size2) {
        }
        a(1, arrayList2);
        int i362 = iArr[0];
        int i372 = iArr[1];
        size3 = arrayList2.size();
        int i382 = i372;
        int i392 = i362;
        i21 = 0;
        int i402 = 0;
        while (i21 < size3) {
        }
        i23 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i402 / 2);
        int i442 = i402 + i23;
        if (i23 >= i18) {
        }
        size4 = arrayList2.size();
        while (i22 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        char c9;
        Object[] objArr;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z6 = g1.f39217a;
        int i15 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c9 = 0;
        } else {
            c9 = 1;
            objArr = false;
        }
        if (u(this.f4591w)) {
            t(this.f4591w, i, 0, i4, this.f4560H);
            i6 = k(this.f4591w) + this.f4591w.getMeasuredWidth();
            i9 = Math.max(0, l(this.f4591w) + this.f4591w.getMeasuredHeight());
            i10 = View.combineMeasuredStates(0, this.f4591w.getMeasuredState());
        } else {
            i6 = 0;
            i9 = 0;
            i10 = 0;
        }
        if (u(this.f4553A)) {
            t(this.f4553A, i, 0, i4, this.f4560H);
            i6 = k(this.f4553A) + this.f4553A.getMeasuredWidth();
            i9 = Math.max(i9, l(this.f4553A) + this.f4553A.getMeasuredHeight());
            i10 = View.combineMeasuredStates(i10, this.f4553A.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6);
        int max2 = Math.max(0, currentContentInsetStart - i6);
        Object[] objArr2 = objArr;
        int[] iArr = this.f4576j0;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (u(this.f4579n)) {
            t(this.f4579n, i, max, i4, this.f4560H);
            i11 = k(this.f4579n) + this.f4579n.getMeasuredWidth();
            i9 = Math.max(i9, l(this.f4579n) + this.f4579n.getMeasuredHeight());
            i10 = View.combineMeasuredStates(i10, this.f4579n.getMeasuredState());
        } else {
            i11 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i11);
        iArr[c9] = Math.max(0, currentContentInsetEnd - i11);
        if (u(this.f4554B)) {
            max3 += s(this.f4554B, i, max3, i4, 0, iArr);
            i9 = Math.max(i9, l(this.f4554B) + this.f4554B.getMeasuredHeight());
            i10 = View.combineMeasuredStates(i10, this.f4554B.getMeasuredState());
        }
        if (u(this.f4593x)) {
            max3 += s(this.f4593x, i, max3, i4, 0, iArr);
            i9 = Math.max(i9, l(this.f4593x) + this.f4593x.getMeasuredHeight());
            i10 = View.combineMeasuredStates(i10, this.f4593x.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (((U0) childAt.getLayoutParams()).f39132b == 0 && u(childAt)) {
                max3 += s(childAt, i, max3, i4, 0, iArr);
                int max4 = Math.max(i9, l(childAt) + childAt.getMeasuredHeight());
                i10 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
                i9 = max4;
            } else {
                max3 = max3;
            }
        }
        int i17 = max3;
        int i18 = this.f4562K + this.f4563L;
        int i19 = this.f4561I + this.J;
        if (u(this.f4587u)) {
            s(this.f4587u, i, i17 + i19, i4, i18, iArr);
            int k9 = k(this.f4587u) + this.f4587u.getMeasuredWidth();
            i12 = l(this.f4587u) + this.f4587u.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i10, this.f4587u.getMeasuredState());
            i14 = k9;
        } else {
            i12 = 0;
            i13 = i10;
            i14 = 0;
        }
        if (u(this.f4589v)) {
            i14 = Math.max(i14, s(this.f4589v, i, i17 + i19, i4, i18 + i12, iArr));
            i12 += l(this.f4589v) + this.f4589v.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i13, this.f4589v.getMeasuredState());
        }
        int max5 = Math.max(i9, i12);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i17 + i14;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i13);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i13 << 16);
        if (this.f4586t0) {
            int childCount2 = getChildCount();
            for (int i20 = 0; i20 < childCount2; i20++) {
                View childAt2 = getChildAt(i20);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i15);
        }
        i15 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i15);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        W0 w02 = (W0) parcelable;
        super.onRestoreInstanceState(w02.f3390n);
        ActionMenuView actionMenuView = this.f4579n;
        m mVar = actionMenuView != null ? actionMenuView.f4527I : null;
        int i = w02.f39145v;
        if (i != 0 && this.f4583q0 != null && mVar != null && (findItem = mVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (w02.f39146w) {
            c cVar = this.f4594x0;
            removeCallbacks(cVar);
            post(cVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        K0 k02 = this.f4564M;
        boolean z6 = i == 1;
        if (z6 == k02.f39098g) {
            return;
        }
        k02.f39098g = z6;
        if (!k02.f39099h) {
            k02.f39092a = k02.f39096e;
            k02.f39093b = k02.f39097f;
            return;
        }
        if (z6) {
            int i4 = k02.f39095d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = k02.f39096e;
            }
            k02.f39092a = i4;
            int i6 = k02.f39094c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = k02.f39097f;
            }
            k02.f39093b = i6;
            return;
        }
        int i9 = k02.f39094c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = k02.f39096e;
        }
        k02.f39092a = i9;
        int i10 = k02.f39095d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = k02.f39097f;
        }
        k02.f39093b = i10;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        W0 w02 = new W0(super.onSaveInstanceState());
        T0 t02 = this.f4583q0;
        if (t02 != null && (oVar = t02.f39129u) != null) {
            w02.f39145v = oVar.f38778n;
        }
        w02.f39146w = p();
        return w02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4572U = false;
        }
        if (!this.f4572U) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4572U = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4572U = false;
        return true;
    }

    public final boolean p() {
        C4708k c4708k;
        ActionMenuView actionMenuView = this.f4579n;
        return (actionMenuView == null || (c4708k = actionMenuView.f4530M) == null || !c4708k.k()) ? false : true;
    }

    public final int q(View view, int i, int i4, int[] iArr) {
        U0 u02 = (U0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) u02).leftMargin - iArr[0];
        int max = Math.max(0, i6) + i;
        iArr[0] = Math.max(0, -i6);
        int j6 = j(i4, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j6, max + measuredWidth, view.getMeasuredHeight() + j6);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) u02).rightMargin + max;
    }

    public final int r(View view, int i, int i4, int[] iArr) {
        U0 u02 = (U0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) u02).rightMargin - iArr[1];
        int max = i - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int j6 = j(i4, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j6, max, view.getMeasuredHeight() + j6);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) u02).leftMargin);
    }

    public final int s(View view, int i, int i4, int i6, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i11) + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.f4592w0 != z6) {
            this.f4592w0 = z6;
            w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(g.h(getContext(), i));
    }

    public void setCollapsible(boolean z6) {
        this.f4586t0 = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4566O) {
            this.f4566O = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4565N) {
            this.f4565N = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(g.h(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(g.h(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f4591w.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(V0 v02) {
        this.m0 = v02;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4579n.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f4556D != i) {
            this.f4556D = i;
            if (i == 0) {
                this.f4555C = getContext();
            } else {
                this.f4555C = new ContextThemeWrapper(getContext(), i);
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
        this.f4563L = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.J = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f4561I = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f4562K = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i4, int i6, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i9 >= 0) {
            if (mode != 0) {
                i9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        C4708k c4708k;
        ActionMenuView actionMenuView = this.f4579n;
        return (actionMenuView == null || (c4708k = actionMenuView.f4530M) == null || !c4708k.l()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a9 = S0.a(this);
            T0 t02 = this.f4583q0;
            boolean z6 = (t02 == null || t02.f39129u == null || a9 == null || !isAttachedToWindow() || !this.f4592w0) ? false : true;
            if (z6 && this.f4590v0 == null) {
                if (this.f4588u0 == null) {
                    this.f4588u0 = S0.b(new Q0(this, 0));
                }
                S0.c(a9, this.f4588u0);
                this.f4590v0 = a9;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.f4590v0) == null) {
                return;
            }
            S0.d(onBackInvokedDispatcher, this.f4588u0);
            this.f4590v0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, C5248R.attr.toolbarStyle);
        this.f4567P = 8388627;
        this.f4574W = new ArrayList();
        this.f4575i0 = new ArrayList();
        this.f4576j0 = new int[2];
        this.f4577k0 = new C0344n(new Q0(this, 1));
        this.f4578l0 = new ArrayList();
        this.f4580n0 = new C4543G(this);
        this.f4594x0 = new c(29, this);
        Context context2 = getContext();
        int[] iArr = AbstractC4528a.f37572x;
        l4.g s9 = l4.g.s(context2, attributeSet, iArr, C5248R.attr.toolbarStyle);
        X.n(this, context, iArr, attributeSet, (TypedArray) s9.f38917v, C5248R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) s9.f38917v;
        this.f4557E = typedArray.getResourceId(28, 0);
        this.f4558F = typedArray.getResourceId(19, 0);
        this.f4567P = typedArray.getInteger(0, 8388627);
        this.f4559G = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4563L = dimensionPixelOffset;
        this.f4562K = dimensionPixelOffset;
        this.J = dimensionPixelOffset;
        this.f4561I = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4561I = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.J = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4562K = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4563L = dimensionPixelOffset5;
        }
        this.f4560H = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        K0 k02 = this.f4564M;
        k02.f39099h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            k02.f39096e = dimensionPixelSize;
            k02.f39092a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            k02.f39097f = dimensionPixelSize2;
            k02.f39093b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            k02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4565N = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4566O = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4595y = s9.i(4);
        this.f4596z = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4555C = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable i4 = s9.i(16);
        if (i4 != null) {
            setNavigationIcon(i4);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable i6 = s9.i(11);
        if (i6 != null) {
            setLogo(i6);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(s9.h(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(s9.h(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        s9.t();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        U0 u02 = new U0(context, attributeSet);
        u02.f39131a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37551b);
        u02.f39131a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        u02.f39132b = 0;
        return u02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C4731w c4731w = this.f4553A;
        if (c4731w != null) {
            c4731w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4553A.setImageDrawable(drawable);
        } else {
            C4731w c4731w = this.f4553A;
            if (c4731w != null) {
                c4731w.setImageDrawable(this.f4595y);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4593x == null) {
                this.f4593x = new C4733x(getContext(), null, 0);
            }
            if (!o(this.f4593x)) {
                b(this.f4593x, true);
            }
        } else {
            C4733x c4733x = this.f4593x;
            if (c4733x != null && o(c4733x)) {
                removeView(this.f4593x);
                this.f4575i0.remove(this.f4593x);
            }
        }
        C4733x c4733x2 = this.f4593x;
        if (c4733x2 != null) {
            c4733x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4593x == null) {
            this.f4593x = new C4733x(getContext(), null, 0);
        }
        C4733x c4733x = this.f4593x;
        if (c4733x != null) {
            c4733x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C4731w c4731w = this.f4591w;
        if (c4731w != null) {
            c4731w.setContentDescription(charSequence);
            b.v(this.f4591w, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f4591w)) {
                b(this.f4591w, true);
            }
        } else {
            C4731w c4731w = this.f4591w;
            if (c4731w != null && o(c4731w)) {
                removeView(this.f4591w);
                this.f4575i0.remove(this.f4591w);
            }
        }
        C4731w c4731w2 = this.f4591w;
        if (c4731w2 != null) {
            c4731w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Z z6 = this.f4589v;
            if (z6 != null && o(z6)) {
                removeView(this.f4589v);
                this.f4575i0.remove(this.f4589v);
            }
        } else {
            if (this.f4589v == null) {
                Context context = getContext();
                Z z9 = new Z(context, null);
                this.f4589v = z9;
                z9.setSingleLine();
                this.f4589v.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4558F;
                if (i != 0) {
                    this.f4589v.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4571T;
                if (colorStateList != null) {
                    this.f4589v.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4589v)) {
                b(this.f4589v, true);
            }
        }
        Z z10 = this.f4589v;
        if (z10 != null) {
            z10.setText(charSequence);
        }
        this.f4569R = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4571T = colorStateList;
        Z z6 = this.f4589v;
        if (z6 != null) {
            z6.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Z z6 = this.f4587u;
            if (z6 != null && o(z6)) {
                removeView(this.f4587u);
                this.f4575i0.remove(this.f4587u);
            }
        } else {
            if (this.f4587u == null) {
                Context context = getContext();
                Z z9 = new Z(context, null);
                this.f4587u = z9;
                z9.setSingleLine();
                this.f4587u.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4557E;
                if (i != 0) {
                    this.f4587u.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4570S;
                if (colorStateList != null) {
                    this.f4587u.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4587u)) {
                b(this.f4587u, true);
            }
        }
        Z z10 = this.f4587u;
        if (z10 != null) {
            z10.setText(charSequence);
        }
        this.f4568Q = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4570S = colorStateList;
        Z z6 = this.f4587u;
        if (z6 != null) {
            z6.setTextColor(colorStateList);
        }
    }
}
