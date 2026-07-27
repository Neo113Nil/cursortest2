package androidx.appcompat.widget;

import F3.C;
import K3.b;
import M.h;
import O.C0352n;
import O.InterfaceC0354p;
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
import com.bumptech.glide.f;
import com.google.android.material.datepicker.j;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import g1.C4524d;
import h4.c;
import h8.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C4621i;
import l.l;
import l.n;
import m.C4743k;
import m.C4766w;
import m.C4768x;
import m.InterfaceC4740i0;
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
    public C4766w f4700A;

    /* renamed from: A0, reason: collision with root package name */
    public OnBackInvokedDispatcher f4701A0;

    /* renamed from: B, reason: collision with root package name */
    public View f4702B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f4703B0;

    /* renamed from: C, reason: collision with root package name */
    public Context f4704C;
    public final C C0;

    /* renamed from: D, reason: collision with root package name */
    public int f4705D;

    /* renamed from: E, reason: collision with root package name */
    public int f4706E;

    /* renamed from: F, reason: collision with root package name */
    public int f4707F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4708G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4709H;

    /* renamed from: I, reason: collision with root package name */
    public int f4710I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f4711K;

    /* renamed from: L, reason: collision with root package name */
    public int f4712L;

    /* renamed from: M, reason: collision with root package name */
    public K0 f4713M;

    /* renamed from: N, reason: collision with root package name */
    public int f4714N;

    /* renamed from: O, reason: collision with root package name */
    public int f4715O;

    /* renamed from: P, reason: collision with root package name */
    public final int f4716P;

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f4717Q;

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f4718R;

    /* renamed from: S, reason: collision with root package name */
    public ColorStateList f4719S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f4720T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4721U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4722V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f4723W;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuView f4724n;

    /* renamed from: n0, reason: collision with root package name */
    public final ArrayList f4725n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f4726o0;

    /* renamed from: p0, reason: collision with root package name */
    public final C0352n f4727p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f4728q0;

    /* renamed from: r0, reason: collision with root package name */
    public V0 f4729r0;

    /* renamed from: s0, reason: collision with root package name */
    public final C4524d f4730s0;

    /* renamed from: t0, reason: collision with root package name */
    public Y0 f4731t0;

    /* renamed from: u, reason: collision with root package name */
    public Z f4732u;

    /* renamed from: u0, reason: collision with root package name */
    public C4743k f4733u0;

    /* renamed from: v, reason: collision with root package name */
    public Z f4734v;

    /* renamed from: v0, reason: collision with root package name */
    public T0 f4735v0;

    /* renamed from: w, reason: collision with root package name */
    public C4766w f4736w;

    /* renamed from: w0, reason: collision with root package name */
    public h f4737w0;

    /* renamed from: x, reason: collision with root package name */
    public C4768x f4738x;

    /* renamed from: x0, reason: collision with root package name */
    public c f4739x0;

    /* renamed from: y, reason: collision with root package name */
    public final Drawable f4740y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4741y0;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f4742z;

    /* renamed from: z0, reason: collision with root package name */
    public OnBackInvokedCallback f4743z0;

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
        return new C4621i(getContext());
    }

    public static U0 h() {
        U0 u02 = new U0(-2, -2);
        u02.f39334b = 0;
        u02.f39333a = 8388627;
        return u02;
    }

    public static U0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z8 = layoutParams instanceof U0;
        if (z8) {
            U0 u02 = (U0) layoutParams;
            U0 u03 = new U0(u02);
            u03.f39334b = 0;
            u03.f39334b = u02.f39334b;
            return u03;
        }
        if (z8) {
            U0 u04 = new U0((U0) layoutParams);
            u04.f39334b = 0;
            return u04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            U0 u05 = new U0(layoutParams);
            u05.f39334b = 0;
            return u05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        U0 u06 = new U0(marginLayoutParams);
        u06.f39334b = 0;
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
        boolean z8 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z8) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                U0 u02 = (U0) childAt.getLayoutParams();
                if (u02.f39334b == 0 && u(childAt)) {
                    int i9 = u02.f39333a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, layoutDirection) & 7;
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
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            U0 u03 = (U0) childAt2.getLayoutParams();
            if (u03.f39334b == 0 && u(childAt2)) {
                int i11 = u03.f39333a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i11, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z8) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        U0 h9 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (U0) layoutParams;
        h9.f39334b = 1;
        if (!z8 || this.f4702B == null) {
            addView(view, h9);
        } else {
            view.setLayoutParams(h9);
            this.f4725n0.add(view);
        }
    }

    public final void c() {
        if (this.f4700A == null) {
            C4766w c4766w = new C4766w(getContext(), null, C5284R.attr.toolbarNavigationButtonStyle);
            this.f4700A = c4766w;
            c4766w.setImageDrawable(this.f4740y);
            this.f4700A.setContentDescription(this.f4742z);
            U0 h9 = h();
            h9.f39333a = (this.f4708G & 112) | 8388611;
            h9.f39334b = 2;
            this.f4700A.setLayoutParams(h9);
            this.f4700A.setOnClickListener(new j(11, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof U0);
    }

    public final void d() {
        if (this.f4713M == null) {
            K0 k02 = new K0();
            k02.f39291a = 0;
            k02.f39292b = 0;
            k02.f39293c = Integer.MIN_VALUE;
            k02.f39294d = Integer.MIN_VALUE;
            k02.f39295e = 0;
            k02.f39296f = 0;
            k02.f39297g = false;
            k02.f39298h = false;
            this.f4713M = k02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f4724n;
        if (actionMenuView.f4674I == null) {
            l lVar = (l) actionMenuView.getMenu();
            if (this.f4735v0 == null) {
                this.f4735v0 = new T0(this);
            }
            this.f4724n.setExpandedActionViewsExclusive(true);
            lVar.b(this.f4735v0, this.f4704C);
            w();
        }
    }

    public final void f() {
        if (this.f4724n == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4724n = actionMenuView;
            actionMenuView.setPopupTheme(this.f4705D);
            this.f4724n.setOnMenuItemClickListener(this.f4730s0);
            ActionMenuView actionMenuView2 = this.f4724n;
            h hVar = this.f4737w0;
            d dVar = new d(4, this);
            actionMenuView2.f4678N = hVar;
            actionMenuView2.f4679O = dVar;
            U0 h9 = h();
            h9.f39333a = (this.f4708G & 112) | 8388613;
            this.f4724n.setLayoutParams(h9);
            b(this.f4724n, false);
        }
    }

    public final void g() {
        if (this.f4736w == null) {
            this.f4736w = new C4766w(getContext(), null, C5284R.attr.toolbarNavigationButtonStyle);
            U0 h9 = h();
            h9.f39333a = (this.f4708G & 112) | 8388611;
            this.f4736w.setLayoutParams(h9);
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
        C4766w c4766w = this.f4700A;
        if (c4766w != null) {
            return c4766w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C4766w c4766w = this.f4700A;
        if (c4766w != null) {
            return c4766w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        K0 k02 = this.f4713M;
        if (k02 != null) {
            return k02.f39297g ? k02.f39291a : k02.f39292b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f4715O;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        K0 k02 = this.f4713M;
        if (k02 != null) {
            return k02.f39291a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        K0 k02 = this.f4713M;
        if (k02 != null) {
            return k02.f39292b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        K0 k02 = this.f4713M;
        if (k02 != null) {
            return k02.f39297g ? k02.f39292b : k02.f39291a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f4714N;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        l lVar;
        ActionMenuView actionMenuView = this.f4724n;
        return (actionMenuView == null || (lVar = actionMenuView.f4674I) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4715O, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4714N, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C4768x c4768x = this.f4738x;
        if (c4768x != null) {
            return c4768x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C4768x c4768x = this.f4738x;
        if (c4768x != null) {
            return c4768x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4724n.getMenu();
    }

    public View getNavButtonView() {
        return this.f4736w;
    }

    public CharSequence getNavigationContentDescription() {
        C4766w c4766w = this.f4736w;
        if (c4766w != null) {
            return c4766w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C4766w c4766w = this.f4736w;
        if (c4766w != null) {
            return c4766w.getDrawable();
        }
        return null;
    }

    public C4743k getOuterActionMenuPresenter() {
        return this.f4733u0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4724n.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4704C;
    }

    public int getPopupTheme() {
        return this.f4705D;
    }

    public CharSequence getSubtitle() {
        return this.f4718R;
    }

    public final TextView getSubtitleTextView() {
        return this.f4734v;
    }

    public CharSequence getTitle() {
        return this.f4717Q;
    }

    public int getTitleMarginBottom() {
        return this.f4712L;
    }

    public int getTitleMarginEnd() {
        return this.J;
    }

    public int getTitleMarginStart() {
        return this.f4710I;
    }

    public int getTitleMarginTop() {
        return this.f4711K;
    }

    public final TextView getTitleTextView() {
        return this.f4732u;
    }

    public InterfaceC4740i0 getWrapper() {
        if (this.f4731t0 == null) {
            this.f4731t0 = new Y0(this, true);
        }
        return this.f4731t0;
    }

    public final int j(int i, View view) {
        U0 u02 = (U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i9 = u02.f39333a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f4716P & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i4;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) u02).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) u02).topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) u02).bottomMargin;
            if (i12 < i13) {
                i10 = Math.max(0, i10 - (i13 - i12));
            }
        }
        return paddingTop + i10;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.f4728q0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f4727p0.f2298b.iterator();
        while (it2.hasNext()) {
            ((F) ((InterfaceC0354p) it2.next())).f4936a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4728q0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f4725n0.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.C0);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4722V = false;
        }
        if (!this.f4722V) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4722V = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4722V = false;
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
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        int i11;
        int i12;
        int max;
        boolean u7;
        boolean u9;
        boolean z9;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int size3;
        int i22;
        int i23;
        int i24;
        int size4;
        boolean z10 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f4726o0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = X.f2240a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i10 - i4) : 0;
        if (!u(this.f4736w)) {
            i11 = paddingLeft;
        } else {
            if (z10) {
                i12 = r(this.f4736w, i25, min, iArr);
                i11 = paddingLeft;
                if (u(this.f4700A)) {
                    if (z10) {
                        i12 = r(this.f4700A, i12, min, iArr);
                    } else {
                        i11 = q(this.f4700A, i11, min, iArr);
                    }
                }
                if (u(this.f4724n)) {
                    if (z10) {
                        i11 = q(this.f4724n, i11, min, iArr);
                    } else {
                        i12 = r(this.f4724n, i12, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i11);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i12));
                max = Math.max(i11, currentContentInsetLeft);
                int min2 = Math.min(i12, i25 - currentContentInsetRight);
                if (u(this.f4702B)) {
                    if (z10) {
                        min2 = r(this.f4702B, min2, min, iArr);
                    } else {
                        max = q(this.f4702B, max, min, iArr);
                    }
                }
                if (u(this.f4738x)) {
                    if (z10) {
                        min2 = r(this.f4738x, min2, min, iArr);
                    } else {
                        max = q(this.f4738x, max, min, iArr);
                    }
                }
                u7 = u(this.f4732u);
                u9 = u(this.f4734v);
                if (u7) {
                    z9 = z10;
                    i13 = 0;
                } else {
                    U0 u02 = (U0) this.f4732u.getLayoutParams();
                    z9 = z10;
                    i13 = this.f4732u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u02).topMargin + ((ViewGroup.MarginLayoutParams) u02).bottomMargin;
                }
                if (!u9) {
                    U0 u03 = (U0) this.f4734v.getLayoutParams();
                    i13 = this.f4734v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u03).topMargin + ((ViewGroup.MarginLayoutParams) u03).bottomMargin + i13;
                }
                if (!u7 || u9) {
                    Z z11 = !u7 ? this.f4732u : this.f4734v;
                    Z z12 = !u9 ? this.f4734v : this.f4732u;
                    U0 u04 = (U0) z11.getLayoutParams();
                    U0 u05 = (U0) z12.getLayoutParams();
                    int i26 = i13;
                    boolean z13 = (!u7 && this.f4732u.getMeasuredWidth() > 0) || (u9 && this.f4734v.getMeasuredWidth() > 0);
                    i14 = this.f4716P & 112;
                    int i27 = max;
                    if (i14 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u04).topMargin + this.f4711K;
                    } else if (i14 != 80) {
                        int i28 = (((height - paddingTop2) - paddingBottom) - i26) / 2;
                        int i29 = ((ViewGroup.MarginLayoutParams) u04).topMargin + this.f4711K;
                        if (i28 < i29) {
                            i28 = i29;
                        } else {
                            int i30 = (((height - paddingBottom) - i26) - i28) - paddingTop2;
                            int i31 = ((ViewGroup.MarginLayoutParams) u04).bottomMargin;
                            int i32 = this.f4712L;
                            if (i30 < i31 + i32) {
                                i28 = Math.max(0, i28 - ((((ViewGroup.MarginLayoutParams) u05).bottomMargin + i32) - i30));
                            }
                        }
                        paddingTop = paddingTop2 + i28;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u05).bottomMargin) - this.f4712L) - i26;
                    }
                    if (z9) {
                        int i33 = (z13 ? this.f4710I : 0) - iArr[0];
                        max = Math.max(0, i33) + i27;
                        iArr[0] = Math.max(0, -i33);
                        if (u7) {
                            U0 u06 = (U0) this.f4732u.getLayoutParams();
                            int measuredWidth = this.f4732u.getMeasuredWidth() + max;
                            int measuredHeight = this.f4732u.getMeasuredHeight() + paddingTop;
                            this.f4732u.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.J;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) u06).bottomMargin;
                        } else {
                            i15 = max;
                        }
                        if (u9) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f4734v.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f4734v.getMeasuredWidth() + max;
                            this.f4734v.layout(max, i34, measuredWidth2, this.f4734v.getMeasuredHeight() + i34);
                            i16 = measuredWidth2 + this.J;
                        } else {
                            i16 = max;
                        }
                        if (z13) {
                            max = Math.max(i15, i16);
                        }
                    } else {
                        int i35 = (z13 ? this.f4710I : 0) - iArr[1];
                        min2 -= Math.max(0, i35);
                        iArr[1] = Math.max(0, -i35);
                        if (u7) {
                            U0 u07 = (U0) this.f4732u.getLayoutParams();
                            int measuredWidth3 = min2 - this.f4732u.getMeasuredWidth();
                            int measuredHeight2 = this.f4732u.getMeasuredHeight() + paddingTop;
                            this.f4732u.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.J;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) u07).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (u9) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.f4734v.getLayoutParams())).topMargin;
                            this.f4734v.layout(min2 - this.f4734v.getMeasuredWidth(), i36, min2, this.f4734v.getMeasuredHeight() + i36);
                            i18 = min2 - this.J;
                        } else {
                            i18 = min2;
                        }
                        if (z13) {
                            min2 = Math.min(i17, i18);
                        }
                        max = i27;
                    }
                }
                ArrayList arrayList = this.f4723W;
                a(3, arrayList);
                size = arrayList.size();
                i19 = max;
                for (i20 = 0; i20 < size; i20++) {
                    i19 = q((View) arrayList.get(i20), i19, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i21 = 0; i21 < size2; i21++) {
                    min2 = r((View) arrayList.get(i21), min2, min, iArr);
                }
                a(1, arrayList);
                int i37 = iArr[0];
                int i38 = iArr[1];
                size3 = arrayList.size();
                int i39 = i38;
                int i40 = i37;
                i22 = 0;
                int i41 = 0;
                while (i22 < size3) {
                    View view = (View) arrayList.get(i22);
                    U0 u08 = (U0) view.getLayoutParams();
                    int i42 = i22;
                    int i43 = ((ViewGroup.MarginLayoutParams) u08).leftMargin - i40;
                    int i44 = ((ViewGroup.MarginLayoutParams) u08).rightMargin - i39;
                    int max2 = Math.max(0, i43);
                    int max3 = Math.max(0, i44);
                    int max4 = Math.max(0, -i43);
                    int max5 = Math.max(0, -i44);
                    i41 += view.getMeasuredWidth() + max2 + max3;
                    i39 = max5;
                    i40 = max4;
                    i22 = i42 + 1;
                }
                i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i41 / 2);
                int i45 = i41 + i24;
                if (i24 >= i19) {
                    i19 = i45 > min2 ? i24 - (i45 - min2) : i24;
                }
                size4 = arrayList.size();
                for (i23 = 0; i23 < size4; i23++) {
                    i19 = q((View) arrayList.get(i23), i19, min, iArr);
                }
                arrayList.clear();
            }
            i11 = q(this.f4736w, paddingLeft, min, iArr);
        }
        i12 = i25;
        if (u(this.f4700A)) {
        }
        if (u(this.f4724n)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i11);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i12));
        max = Math.max(i11, currentContentInsetLeft2);
        int min22 = Math.min(i12, i25 - currentContentInsetRight2);
        if (u(this.f4702B)) {
        }
        if (u(this.f4738x)) {
        }
        u7 = u(this.f4732u);
        u9 = u(this.f4734v);
        if (u7) {
        }
        if (!u9) {
        }
        if (!u7) {
        }
        if (!u7) {
        }
        if (!u9) {
        }
        U0 u042 = (U0) z11.getLayoutParams();
        U0 u052 = (U0) z12.getLayoutParams();
        int i262 = i13;
        if (u7) {
        }
        i14 = this.f4716P & 112;
        int i272 = max;
        if (i14 != 48) {
        }
        if (z9) {
        }
        ArrayList arrayList2 = this.f4723W;
        a(3, arrayList2);
        size = arrayList2.size();
        i19 = max;
        while (i20 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i21 < size2) {
        }
        a(1, arrayList2);
        int i372 = iArr[0];
        int i382 = iArr[1];
        size3 = arrayList2.size();
        int i392 = i382;
        int i402 = i372;
        i22 = 0;
        int i412 = 0;
        while (i22 < size3) {
        }
        i24 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i412 / 2);
        int i452 = i412 + i24;
        if (i24 >= i19) {
        }
        size4 = arrayList2.size();
        while (i23 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        char c4;
        Object[] objArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z8 = g1.f39419a;
        int i16 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c4 = 0;
        } else {
            c4 = 1;
            objArr = false;
        }
        if (u(this.f4736w)) {
            t(this.f4736w, i, 0, i4, this.f4709H);
            i9 = k(this.f4736w) + this.f4736w.getMeasuredWidth();
            i10 = Math.max(0, l(this.f4736w) + this.f4736w.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f4736w.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (u(this.f4700A)) {
            t(this.f4700A, i, 0, i4, this.f4709H);
            i9 = k(this.f4700A) + this.f4700A.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f4700A) + this.f4700A.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4700A.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        Object[] objArr2 = objArr;
        int[] iArr = this.f4726o0;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (u(this.f4724n)) {
            t(this.f4724n, i, max, i4, this.f4709H);
            i12 = k(this.f4724n) + this.f4724n.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f4724n) + this.f4724n.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4724n.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[c4] = Math.max(0, currentContentInsetEnd - i12);
        if (u(this.f4702B)) {
            max3 += s(this.f4702B, i, max3, i4, 0, iArr);
            i10 = Math.max(i10, l(this.f4702B) + this.f4702B.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4702B.getMeasuredState());
        }
        if (u(this.f4738x)) {
            max3 += s(this.f4738x, i, max3, i4, 0, iArr);
            i10 = Math.max(i10, l(this.f4738x) + this.f4738x.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4738x.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((U0) childAt.getLayoutParams()).f39334b == 0 && u(childAt)) {
                max3 += s(childAt, i, max3, i4, 0, iArr);
                int max4 = Math.max(i10, l(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
                i10 = max4;
            } else {
                max3 = max3;
            }
        }
        int i18 = max3;
        int i19 = this.f4711K + this.f4712L;
        int i20 = this.f4710I + this.J;
        if (u(this.f4732u)) {
            s(this.f4732u, i, i18 + i20, i4, i19, iArr);
            int k6 = k(this.f4732u) + this.f4732u.getMeasuredWidth();
            i13 = l(this.f4732u) + this.f4732u.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f4732u.getMeasuredState());
            i15 = k6;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (u(this.f4734v)) {
            i15 = Math.max(i15, s(this.f4734v, i, i18 + i20, i4, i19 + i13, iArr));
            i13 += l(this.f4734v) + this.f4734v.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f4734v.getMeasuredState());
        }
        int max5 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i18 + i15;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i14 << 16);
        if (this.f4741y0) {
            int childCount2 = getChildCount();
            for (int i21 = 0; i21 < childCount2; i21++) {
                View childAt2 = getChildAt(i21);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i16);
        }
        i16 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i16);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        W0 w02 = (W0) parcelable;
        super.onRestoreInstanceState(w02.f3318n);
        ActionMenuView actionMenuView = this.f4724n;
        l lVar = actionMenuView != null ? actionMenuView.f4674I : null;
        int i = w02.f39347v;
        if (i != 0 && this.f4735v0 != null && lVar != null && (findItem = lVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (w02.f39348w) {
            C c4 = this.C0;
            removeCallbacks(c4);
            post(c4);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        K0 k02 = this.f4713M;
        boolean z8 = i == 1;
        if (z8 == k02.f39297g) {
            return;
        }
        k02.f39297g = z8;
        if (!k02.f39298h) {
            k02.f39291a = k02.f39295e;
            k02.f39292b = k02.f39296f;
            return;
        }
        if (z8) {
            int i4 = k02.f39294d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = k02.f39295e;
            }
            k02.f39291a = i4;
            int i9 = k02.f39293c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = k02.f39296f;
            }
            k02.f39292b = i9;
            return;
        }
        int i10 = k02.f39293c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = k02.f39295e;
        }
        k02.f39291a = i10;
        int i11 = k02.f39294d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = k02.f39296f;
        }
        k02.f39292b = i11;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n nVar;
        W0 w02 = new W0(super.onSaveInstanceState());
        T0 t02 = this.f4735v0;
        if (t02 != null && (nVar = t02.f39331u) != null) {
            w02.f39347v = nVar.f38993n;
        }
        w02.f39348w = p();
        return w02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4721U = false;
        }
        if (!this.f4721U) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4721U = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4721U = false;
        return true;
    }

    public final boolean p() {
        C4743k c4743k;
        ActionMenuView actionMenuView = this.f4724n;
        return (actionMenuView == null || (c4743k = actionMenuView.f4677M) == null || !c4743k.k()) ? false : true;
    }

    public final int q(View view, int i, int i4, int[] iArr) {
        U0 u02 = (U0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) u02).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i;
        iArr[0] = Math.max(0, -i9);
        int j9 = j(i4, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j9, max + measuredWidth, view.getMeasuredHeight() + j9);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) u02).rightMargin + max;
    }

    public final int r(View view, int i, int i4, int[] iArr) {
        U0 u02 = (U0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) u02).rightMargin - iArr[1];
        int max = i - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int j9 = j(i4, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j9, max, view.getMeasuredHeight() + j9);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) u02).leftMargin);
    }

    public final int s(View view, int i, int i4, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z8) {
        if (this.f4703B0 != z8) {
            this.f4703B0 = z8;
            w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(f.h(getContext(), i));
    }

    public void setCollapsible(boolean z8) {
        this.f4741y0 = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4715O) {
            this.f4715O = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4714N) {
            this.f4714N = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(f.h(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(f.h(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f4736w.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(V0 v02) {
        this.f4729r0 = v02;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4724n.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f4705D != i) {
            this.f4705D = i;
            if (i == 0) {
                this.f4704C = getContext();
            } else {
                this.f4704C = new ContextThemeWrapper(getContext(), i);
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
        this.f4712L = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.J = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f4710I = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f4711K = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i4, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean v() {
        C4743k c4743k;
        ActionMenuView actionMenuView = this.f4724n;
        return (actionMenuView == null || (c4743k = actionMenuView.f4677M) == null || !c4743k.l()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a9 = S0.a(this);
            T0 t02 = this.f4735v0;
            boolean z8 = (t02 == null || t02.f39331u == null || a9 == null || !isAttachedToWindow() || !this.f4703B0) ? false : true;
            if (z8 && this.f4701A0 == null) {
                if (this.f4743z0 == null) {
                    this.f4743z0 = S0.b(new R0(this, 0));
                }
                S0.c(a9, this.f4743z0);
                this.f4701A0 = a9;
                return;
            }
            if (z8 || (onBackInvokedDispatcher = this.f4701A0) == null) {
                return;
            }
            S0.d(onBackInvokedDispatcher, this.f4743z0);
            this.f4701A0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, C5284R.attr.toolbarStyle);
        this.f4716P = 8388627;
        this.f4723W = new ArrayList();
        this.f4725n0 = new ArrayList();
        this.f4726o0 = new int[2];
        this.f4727p0 = new C0352n(new R0(this, 1));
        this.f4728q0 = new ArrayList();
        this.f4730s0 = new C4524d(25, this);
        this.C0 = new C(26, this);
        Context context2 = getContext();
        int[] iArr = AbstractC4518a.f37840x;
        Q0 p6 = Q0.p(context2, attributeSet, iArr, C5284R.attr.toolbarStyle);
        X.n(this, context, iArr, attributeSet, (TypedArray) p6.f39326c, C5284R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) p6.f39326c;
        this.f4706E = typedArray.getResourceId(28, 0);
        this.f4707F = typedArray.getResourceId(19, 0);
        this.f4716P = typedArray.getInteger(0, 8388627);
        this.f4708G = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4712L = dimensionPixelOffset;
        this.f4711K = dimensionPixelOffset;
        this.J = dimensionPixelOffset;
        this.f4710I = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4710I = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.J = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4711K = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4712L = dimensionPixelOffset5;
        }
        this.f4709H = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        K0 k02 = this.f4713M;
        k02.f39298h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            k02.f39295e = dimensionPixelSize;
            k02.f39291a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            k02.f39296f = dimensionPixelSize2;
            k02.f39292b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            k02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4714N = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4715O = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4740y = p6.g(4);
        this.f4742z = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4704C = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable g9 = p6.g(16);
        if (g9 != null) {
            setNavigationIcon(g9);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable g10 = p6.g(11);
        if (g10 != null) {
            setLogo(g10);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(p6.f(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(p6.f(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        p6.q();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        U0 u02 = new U0(context, attributeSet);
        u02.f39333a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37819b);
        u02.f39333a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        u02.f39334b = 0;
        return u02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C4766w c4766w = this.f4700A;
        if (c4766w != null) {
            c4766w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4700A.setImageDrawable(drawable);
        } else {
            C4766w c4766w = this.f4700A;
            if (c4766w != null) {
                c4766w.setImageDrawable(this.f4740y);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4738x == null) {
                this.f4738x = new C4768x(getContext(), null, 0);
            }
            if (!o(this.f4738x)) {
                b(this.f4738x, true);
            }
        } else {
            C4768x c4768x = this.f4738x;
            if (c4768x != null && o(c4768x)) {
                removeView(this.f4738x);
                this.f4725n0.remove(this.f4738x);
            }
        }
        C4768x c4768x2 = this.f4738x;
        if (c4768x2 != null) {
            c4768x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4738x == null) {
            this.f4738x = new C4768x(getContext(), null, 0);
        }
        C4768x c4768x = this.f4738x;
        if (c4768x != null) {
            c4768x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C4766w c4766w = this.f4736w;
        if (c4766w != null) {
            c4766w.setContentDescription(charSequence);
            b.B(this.f4736w, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f4736w)) {
                b(this.f4736w, true);
            }
        } else {
            C4766w c4766w = this.f4736w;
            if (c4766w != null && o(c4766w)) {
                removeView(this.f4736w);
                this.f4725n0.remove(this.f4736w);
            }
        }
        C4766w c4766w2 = this.f4736w;
        if (c4766w2 != null) {
            c4766w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Z z8 = this.f4734v;
            if (z8 != null && o(z8)) {
                removeView(this.f4734v);
                this.f4725n0.remove(this.f4734v);
            }
        } else {
            if (this.f4734v == null) {
                Context context = getContext();
                Z z9 = new Z(context, null);
                this.f4734v = z9;
                z9.setSingleLine();
                this.f4734v.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4707F;
                if (i != 0) {
                    this.f4734v.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4720T;
                if (colorStateList != null) {
                    this.f4734v.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4734v)) {
                b(this.f4734v, true);
            }
        }
        Z z10 = this.f4734v;
        if (z10 != null) {
            z10.setText(charSequence);
        }
        this.f4718R = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4720T = colorStateList;
        Z z8 = this.f4734v;
        if (z8 != null) {
            z8.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Z z8 = this.f4732u;
            if (z8 != null && o(z8)) {
                removeView(this.f4732u);
                this.f4725n0.remove(this.f4732u);
            }
        } else {
            if (this.f4732u == null) {
                Context context = getContext();
                Z z9 = new Z(context, null);
                this.f4732u = z9;
                z9.setSingleLine();
                this.f4732u.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4706E;
                if (i != 0) {
                    this.f4732u.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4719S;
                if (colorStateList != null) {
                    this.f4732u.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4732u)) {
                b(this.f4732u, true);
            }
        }
        Z z10 = this.f4732u;
        if (z10 != null) {
            z10.setText(charSequence);
        }
        this.f4717Q = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4719S = colorStateList;
        Z z8 = this.f4732u;
        if (z8 != null) {
            z8.setTextColor(colorStateList);
        }
    }
}
