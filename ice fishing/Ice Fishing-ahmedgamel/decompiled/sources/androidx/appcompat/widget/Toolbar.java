package androidx.appcompat.widget;

import A8.b;
import F1.a;
import G0.c;
import L3.h;
import L3.q;
import O.C0339n;
import O.InterfaceC0341p;
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
import com.bumptech.glide.g;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import g.AbstractC4518a;
import g1.C4522b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.C4622i;
import l.C4648e;
import l.m;
import l.o;
import m.C4695k;
import m.C4718w;
import m.C4720x;
import m.InterfaceC4692i0;
import m.K0;
import m.Q0;
import m.R0;
import m.S0;
import m.T0;
import m.U0;
import m.V0;
import m.X0;
import m.Z;
import m.f1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public C4718w f4585A;

    /* renamed from: A0, reason: collision with root package name */
    public OnBackInvokedDispatcher f4586A0;

    /* renamed from: B, reason: collision with root package name */
    public View f4587B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f4588B0;

    /* renamed from: C, reason: collision with root package name */
    public Context f4589C;
    public final c C0;

    /* renamed from: D, reason: collision with root package name */
    public int f4590D;

    /* renamed from: E, reason: collision with root package name */
    public int f4591E;

    /* renamed from: F, reason: collision with root package name */
    public int f4592F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4593G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4594H;

    /* renamed from: I, reason: collision with root package name */
    public int f4595I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f4596K;

    /* renamed from: L, reason: collision with root package name */
    public int f4597L;

    /* renamed from: M, reason: collision with root package name */
    public K0 f4598M;

    /* renamed from: N, reason: collision with root package name */
    public int f4599N;

    /* renamed from: O, reason: collision with root package name */
    public int f4600O;

    /* renamed from: P, reason: collision with root package name */
    public final int f4601P;

    /* renamed from: Q, reason: collision with root package name */
    public CharSequence f4602Q;

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f4603R;

    /* renamed from: S, reason: collision with root package name */
    public ColorStateList f4604S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f4605T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4606U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4607V;

    /* renamed from: W, reason: collision with root package name */
    public final ArrayList f4608W;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuView f4609n;

    /* renamed from: n0, reason: collision with root package name */
    public final ArrayList f4610n0;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f4611o0;

    /* renamed from: p0, reason: collision with root package name */
    public final C0339n f4612p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f4613q0;

    /* renamed from: r0, reason: collision with root package name */
    public U0 f4614r0;

    /* renamed from: s0, reason: collision with root package name */
    public final a f4615s0;

    /* renamed from: t0, reason: collision with root package name */
    public X0 f4616t0;

    /* renamed from: u, reason: collision with root package name */
    public Z f4617u;

    /* renamed from: u0, reason: collision with root package name */
    public C4695k f4618u0;

    /* renamed from: v, reason: collision with root package name */
    public Z f4619v;

    /* renamed from: v0, reason: collision with root package name */
    public S0 f4620v0;

    /* renamed from: w, reason: collision with root package name */
    public C4718w f4621w;

    /* renamed from: w0, reason: collision with root package name */
    public h f4622w0;

    /* renamed from: x, reason: collision with root package name */
    public C4720x f4623x;

    /* renamed from: x0, reason: collision with root package name */
    public C4522b f4624x0;

    /* renamed from: y, reason: collision with root package name */
    public final Drawable f4625y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4626y0;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f4627z;

    /* renamed from: z0, reason: collision with root package name */
    public OnBackInvokedCallback f4628z0;

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
        return new C4622i(getContext());
    }

    public static T0 h() {
        T0 t02 = new T0(-2, -2);
        t02.f39063b = 0;
        t02.f39062a = 8388627;
        return t02;
    }

    public static T0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof T0;
        if (z3) {
            T0 t02 = (T0) layoutParams;
            T0 t03 = new T0(t02);
            t03.f39063b = 0;
            t03.f39063b = t02.f39063b;
            return t03;
        }
        if (z3) {
            T0 t04 = new T0((T0) layoutParams);
            t04.f39063b = 0;
            return t04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            T0 t05 = new T0(layoutParams);
            t05.f39063b = 0;
            return t05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        T0 t06 = new T0(marginLayoutParams);
        t06.f39063b = 0;
        ((ViewGroup.MarginLayoutParams) t06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) t06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) t06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) t06).bottomMargin = marginLayoutParams.bottomMargin;
        return t06;
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
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                T0 t02 = (T0) childAt.getLayoutParams();
                if (t02.f39063b == 0 && u(childAt)) {
                    int i9 = t02.f39062a;
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
            T0 t03 = (T0) childAt2.getLayoutParams();
            if (t03.f39063b == 0 && u(childAt2)) {
                int i11 = t03.f39062a;
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

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        T0 h9 = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (T0) layoutParams;
        h9.f39063b = 1;
        if (!z3 || this.f4587B == null) {
            addView(view, h9);
        } else {
            view.setLayoutParams(h9);
            this.f4610n0.add(view);
        }
    }

    public final void c() {
        if (this.f4585A == null) {
            C4718w c4718w = new C4718w(getContext(), null, C5275R.attr.toolbarNavigationButtonStyle);
            this.f4585A = c4718w;
            c4718w.setImageDrawable(this.f4625y);
            this.f4585A.setContentDescription(this.f4627z);
            T0 h9 = h();
            h9.f39062a = (this.f4593G & 112) | 8388611;
            h9.f39063b = 2;
            this.f4585A.setLayoutParams(h9);
            this.f4585A.setOnClickListener(new q(6, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof T0);
    }

    public final void d() {
        if (this.f4598M == null) {
            K0 k02 = new K0();
            k02.f39024a = 0;
            k02.f39025b = 0;
            k02.f39026c = Integer.MIN_VALUE;
            k02.f39027d = Integer.MIN_VALUE;
            k02.f39028e = 0;
            k02.f39029f = 0;
            k02.f39030g = false;
            k02.f39031h = false;
            this.f4598M = k02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f4609n;
        if (actionMenuView.f4559I == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f4620v0 == null) {
                this.f4620v0 = new S0(this);
            }
            this.f4609n.setExpandedActionViewsExclusive(true);
            mVar.b(this.f4620v0, this.f4589C);
            w();
        }
    }

    public final void f() {
        if (this.f4609n == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4609n = actionMenuView;
            actionMenuView.setPopupTheme(this.f4590D);
            this.f4609n.setOnMenuItemClickListener(this.f4615s0);
            ActionMenuView actionMenuView2 = this.f4609n;
            h hVar = this.f4622w0;
            C4648e c4648e = new C4648e(2, this);
            actionMenuView2.f4563N = hVar;
            actionMenuView2.f4564O = c4648e;
            T0 h9 = h();
            h9.f39062a = (this.f4593G & 112) | 8388613;
            this.f4609n.setLayoutParams(h9);
            b(this.f4609n, false);
        }
    }

    public final void g() {
        if (this.f4621w == null) {
            this.f4621w = new C4718w(getContext(), null, C5275R.attr.toolbarNavigationButtonStyle);
            T0 h9 = h();
            h9.f39062a = (this.f4593G & 112) | 8388611;
            this.f4621w.setLayoutParams(h9);
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
        C4718w c4718w = this.f4585A;
        if (c4718w != null) {
            return c4718w.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C4718w c4718w = this.f4585A;
        if (c4718w != null) {
            return c4718w.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        K0 k02 = this.f4598M;
        if (k02 != null) {
            return k02.f39030g ? k02.f39024a : k02.f39025b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f4600O;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        K0 k02 = this.f4598M;
        if (k02 != null) {
            return k02.f39024a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        K0 k02 = this.f4598M;
        if (k02 != null) {
            return k02.f39025b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        K0 k02 = this.f4598M;
        if (k02 != null) {
            return k02.f39030g ? k02.f39025b : k02.f39024a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f4599N;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f4609n;
        return (actionMenuView == null || (mVar = actionMenuView.f4559I) == null || !mVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4600O, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4599N, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C4720x c4720x = this.f4623x;
        if (c4720x != null) {
            return c4720x.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C4720x c4720x = this.f4623x;
        if (c4720x != null) {
            return c4720x.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4609n.getMenu();
    }

    public View getNavButtonView() {
        return this.f4621w;
    }

    public CharSequence getNavigationContentDescription() {
        C4718w c4718w = this.f4621w;
        if (c4718w != null) {
            return c4718w.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C4718w c4718w = this.f4621w;
        if (c4718w != null) {
            return c4718w.getDrawable();
        }
        return null;
    }

    public C4695k getOuterActionMenuPresenter() {
        return this.f4618u0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4609n.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4589C;
    }

    public int getPopupTheme() {
        return this.f4590D;
    }

    public CharSequence getSubtitle() {
        return this.f4603R;
    }

    public final TextView getSubtitleTextView() {
        return this.f4619v;
    }

    public CharSequence getTitle() {
        return this.f4602Q;
    }

    public int getTitleMarginBottom() {
        return this.f4597L;
    }

    public int getTitleMarginEnd() {
        return this.J;
    }

    public int getTitleMarginStart() {
        return this.f4595I;
    }

    public int getTitleMarginTop() {
        return this.f4596K;
    }

    public final TextView getTitleTextView() {
        return this.f4617u;
    }

    public InterfaceC4692i0 getWrapper() {
        if (this.f4616t0 == null) {
            this.f4616t0 = new X0(this, true);
        }
        return this.f4616t0;
    }

    public final int j(int i, View view) {
        T0 t02 = (T0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i9 = t02.f39062a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f4601P & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i6;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) t02).bottomMargin) - i6;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) t02).topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) t02).bottomMargin;
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
        Iterator it = this.f4613q0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f4612p0.f2112b.iterator();
        while (it2.hasNext()) {
            ((F) ((InterfaceC0341p) it2.next())).f4824a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f4613q0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.f4610n0.contains(view);
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
            this.f4607V = false;
        }
        if (!this.f4607V) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4607V = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f4607V = false;
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
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int i11;
        int i12;
        int max;
        boolean u3;
        boolean u6;
        boolean z6;
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
        boolean z9 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.f4611o0;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = X.f2054a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i10 - i6) : 0;
        if (!u(this.f4621w)) {
            i11 = paddingLeft;
        } else {
            if (z9) {
                i12 = r(this.f4621w, i25, min, iArr);
                i11 = paddingLeft;
                if (u(this.f4585A)) {
                    if (z9) {
                        i12 = r(this.f4585A, i12, min, iArr);
                    } else {
                        i11 = q(this.f4585A, i11, min, iArr);
                    }
                }
                if (u(this.f4609n)) {
                    if (z9) {
                        i11 = q(this.f4609n, i11, min, iArr);
                    } else {
                        i12 = r(this.f4609n, i12, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i11);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i12));
                max = Math.max(i11, currentContentInsetLeft);
                int min2 = Math.min(i12, i25 - currentContentInsetRight);
                if (u(this.f4587B)) {
                    if (z9) {
                        min2 = r(this.f4587B, min2, min, iArr);
                    } else {
                        max = q(this.f4587B, max, min, iArr);
                    }
                }
                if (u(this.f4623x)) {
                    if (z9) {
                        min2 = r(this.f4623x, min2, min, iArr);
                    } else {
                        max = q(this.f4623x, max, min, iArr);
                    }
                }
                u3 = u(this.f4617u);
                u6 = u(this.f4619v);
                if (u3) {
                    z6 = z9;
                    i13 = 0;
                } else {
                    T0 t02 = (T0) this.f4617u.getLayoutParams();
                    z6 = z9;
                    i13 = this.f4617u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t02).topMargin + ((ViewGroup.MarginLayoutParams) t02).bottomMargin;
                }
                if (!u6) {
                    T0 t03 = (T0) this.f4619v.getLayoutParams();
                    i13 = this.f4619v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) t03).topMargin + ((ViewGroup.MarginLayoutParams) t03).bottomMargin + i13;
                }
                if (!u3 || u6) {
                    Z z10 = !u3 ? this.f4617u : this.f4619v;
                    Z z11 = !u6 ? this.f4619v : this.f4617u;
                    T0 t04 = (T0) z10.getLayoutParams();
                    T0 t05 = (T0) z11.getLayoutParams();
                    int i26 = i13;
                    boolean z12 = (!u3 && this.f4617u.getMeasuredWidth() > 0) || (u6 && this.f4619v.getMeasuredWidth() > 0);
                    i14 = this.f4601P & 112;
                    int i27 = max;
                    if (i14 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) t04).topMargin + this.f4596K;
                    } else if (i14 != 80) {
                        int i28 = (((height - paddingTop2) - paddingBottom) - i26) / 2;
                        int i29 = ((ViewGroup.MarginLayoutParams) t04).topMargin + this.f4596K;
                        if (i28 < i29) {
                            i28 = i29;
                        } else {
                            int i30 = (((height - paddingBottom) - i26) - i28) - paddingTop2;
                            int i31 = ((ViewGroup.MarginLayoutParams) t04).bottomMargin;
                            int i32 = this.f4597L;
                            if (i30 < i31 + i32) {
                                i28 = Math.max(0, i28 - ((((ViewGroup.MarginLayoutParams) t05).bottomMargin + i32) - i30));
                            }
                        }
                        paddingTop = paddingTop2 + i28;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) t05).bottomMargin) - this.f4597L) - i26;
                    }
                    if (z6) {
                        int i33 = (z12 ? this.f4595I : 0) - iArr[0];
                        max = Math.max(0, i33) + i27;
                        iArr[0] = Math.max(0, -i33);
                        if (u3) {
                            T0 t06 = (T0) this.f4617u.getLayoutParams();
                            int measuredWidth = this.f4617u.getMeasuredWidth() + max;
                            int measuredHeight = this.f4617u.getMeasuredHeight() + paddingTop;
                            this.f4617u.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i15 = measuredWidth + this.J;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) t06).bottomMargin;
                        } else {
                            i15 = max;
                        }
                        if (u6) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((T0) this.f4619v.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f4619v.getMeasuredWidth() + max;
                            this.f4619v.layout(max, i34, measuredWidth2, this.f4619v.getMeasuredHeight() + i34);
                            i16 = measuredWidth2 + this.J;
                        } else {
                            i16 = max;
                        }
                        if (z12) {
                            max = Math.max(i15, i16);
                        }
                    } else {
                        int i35 = (z12 ? this.f4595I : 0) - iArr[1];
                        min2 -= Math.max(0, i35);
                        iArr[1] = Math.max(0, -i35);
                        if (u3) {
                            T0 t07 = (T0) this.f4617u.getLayoutParams();
                            int measuredWidth3 = min2 - this.f4617u.getMeasuredWidth();
                            int measuredHeight2 = this.f4617u.getMeasuredHeight() + paddingTop;
                            this.f4617u.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i17 = measuredWidth3 - this.J;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) t07).bottomMargin;
                        } else {
                            i17 = min2;
                        }
                        if (u6) {
                            int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((T0) this.f4619v.getLayoutParams())).topMargin;
                            this.f4619v.layout(min2 - this.f4619v.getMeasuredWidth(), i36, min2, this.f4619v.getMeasuredHeight() + i36);
                            i18 = min2 - this.J;
                        } else {
                            i18 = min2;
                        }
                        if (z12) {
                            min2 = Math.min(i17, i18);
                        }
                        max = i27;
                    }
                }
                ArrayList arrayList = this.f4608W;
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
                    T0 t08 = (T0) view.getLayoutParams();
                    int i42 = i22;
                    int i43 = ((ViewGroup.MarginLayoutParams) t08).leftMargin - i40;
                    int i44 = ((ViewGroup.MarginLayoutParams) t08).rightMargin - i39;
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
            i11 = q(this.f4621w, paddingLeft, min, iArr);
        }
        i12 = i25;
        if (u(this.f4585A)) {
        }
        if (u(this.f4609n)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i11);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i12));
        max = Math.max(i11, currentContentInsetLeft2);
        int min22 = Math.min(i12, i25 - currentContentInsetRight2);
        if (u(this.f4587B)) {
        }
        if (u(this.f4623x)) {
        }
        u3 = u(this.f4617u);
        u6 = u(this.f4619v);
        if (u3) {
        }
        if (!u6) {
        }
        if (!u3) {
        }
        if (!u3) {
        }
        if (!u6) {
        }
        T0 t042 = (T0) z10.getLayoutParams();
        T0 t052 = (T0) z11.getLayoutParams();
        int i262 = i13;
        if (u3) {
        }
        i14 = this.f4601P & 112;
        int i272 = max;
        if (i14 != 48) {
        }
        if (z6) {
        }
        ArrayList arrayList2 = this.f4608W;
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
    public final void onMeasure(int i, int i6) {
        char c9;
        Object[] objArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3 = f1.f39146a;
        int i16 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c9 = 0;
        } else {
            c9 = 1;
            objArr = false;
        }
        if (u(this.f4621w)) {
            t(this.f4621w, i, 0, i6, this.f4594H);
            i9 = k(this.f4621w) + this.f4621w.getMeasuredWidth();
            i10 = Math.max(0, l(this.f4621w) + this.f4621w.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f4621w.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (u(this.f4585A)) {
            t(this.f4585A, i, 0, i6, this.f4594H);
            i9 = k(this.f4585A) + this.f4585A.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f4585A) + this.f4585A.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4585A.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        Object[] objArr2 = objArr;
        int[] iArr = this.f4611o0;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (u(this.f4609n)) {
            t(this.f4609n, i, max, i6, this.f4594H);
            i12 = k(this.f4609n) + this.f4609n.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f4609n) + this.f4609n.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4609n.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[c9] = Math.max(0, currentContentInsetEnd - i12);
        if (u(this.f4587B)) {
            max3 += s(this.f4587B, i, max3, i6, 0, iArr);
            i10 = Math.max(i10, l(this.f4587B) + this.f4587B.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4587B.getMeasuredState());
        }
        if (u(this.f4623x)) {
            max3 += s(this.f4623x, i, max3, i6, 0, iArr);
            i10 = Math.max(i10, l(this.f4623x) + this.f4623x.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f4623x.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((T0) childAt.getLayoutParams()).f39063b == 0 && u(childAt)) {
                max3 += s(childAt, i, max3, i6, 0, iArr);
                int max4 = Math.max(i10, l(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
                i10 = max4;
            } else {
                max3 = max3;
            }
        }
        int i18 = max3;
        int i19 = this.f4596K + this.f4597L;
        int i20 = this.f4595I + this.J;
        if (u(this.f4617u)) {
            s(this.f4617u, i, i18 + i20, i6, i19, iArr);
            int k9 = k(this.f4617u) + this.f4617u.getMeasuredWidth();
            i13 = l(this.f4617u) + this.f4617u.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f4617u.getMeasuredState());
            i15 = k9;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (u(this.f4619v)) {
            i15 = Math.max(i15, s(this.f4619v, i, i18 + i20, i6, i19 + i13, iArr));
            i13 += l(this.f4619v) + this.f4619v.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f4619v.getMeasuredState());
        }
        int max5 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i18 + i15;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i6, i14 << 16);
        if (this.f4626y0) {
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
        if (!(parcelable instanceof V0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        V0 v02 = (V0) parcelable;
        super.onRestoreInstanceState(v02.f3267n);
        ActionMenuView actionMenuView = this.f4609n;
        m mVar = actionMenuView != null ? actionMenuView.f4559I : null;
        int i = v02.f39076v;
        if (i != 0 && this.f4620v0 != null && mVar != null && (findItem = mVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (v02.f39077w) {
            c cVar = this.C0;
            removeCallbacks(cVar);
            post(cVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        K0 k02 = this.f4598M;
        boolean z3 = i == 1;
        if (z3 == k02.f39030g) {
            return;
        }
        k02.f39030g = z3;
        if (!k02.f39031h) {
            k02.f39024a = k02.f39028e;
            k02.f39025b = k02.f39029f;
            return;
        }
        if (z3) {
            int i6 = k02.f39027d;
            if (i6 == Integer.MIN_VALUE) {
                i6 = k02.f39028e;
            }
            k02.f39024a = i6;
            int i9 = k02.f39026c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = k02.f39029f;
            }
            k02.f39025b = i9;
            return;
        }
        int i10 = k02.f39026c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = k02.f39028e;
        }
        k02.f39024a = i10;
        int i11 = k02.f39027d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = k02.f39029f;
        }
        k02.f39025b = i11;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        V0 v02 = new V0(super.onSaveInstanceState());
        S0 s02 = this.f4620v0;
        if (s02 != null && (oVar = s02.f39060u) != null) {
            v02.f39076v = oVar.f38851n;
        }
        v02.f39077w = p();
        return v02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4606U = false;
        }
        if (!this.f4606U) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4606U = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f4606U = false;
        return true;
    }

    public final boolean p() {
        C4695k c4695k;
        ActionMenuView actionMenuView = this.f4609n;
        return (actionMenuView == null || (c4695k = actionMenuView.f4562M) == null || !c4695k.k()) ? false : true;
    }

    public final int q(View view, int i, int i6, int[] iArr) {
        T0 t02 = (T0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) t02).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i;
        iArr[0] = Math.max(0, -i9);
        int j6 = j(i6, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j6, max + measuredWidth, view.getMeasuredHeight() + j6);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) t02).rightMargin + max;
    }

    public final int r(View view, int i, int i6, int[] iArr) {
        T0 t02 = (T0) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) t02).rightMargin - iArr[1];
        int max = i - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int j6 = j(i6, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j6, max, view.getMeasuredHeight() + j6);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) t02).leftMargin);
    }

    public final int s(View view, int i, int i6, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f4588B0 != z3) {
            this.f4588B0 = z3;
            w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(g.e(getContext(), i));
    }

    public void setCollapsible(boolean z3) {
        this.f4626y0 = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4600O) {
            this.f4600O = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f4599N) {
            this.f4599N = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(g.e(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(g.e(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f4621w.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(U0 u02) {
        this.f4614r0 = u02;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4609n.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f4590D != i) {
            this.f4590D = i;
            if (i == 0) {
                this.f4589C = getContext();
            } else {
                this.f4589C = new ContextThemeWrapper(getContext(), i);
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
        this.f4597L = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.J = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f4595I = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f4596K = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i6, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width);
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
        C4695k c4695k;
        ActionMenuView actionMenuView = this.f4609n;
        return (actionMenuView == null || (c4695k = actionMenuView.f4562M) == null || !c4695k.l()) ? false : true;
    }

    public final void w() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a9 = R0.a(this);
            S0 s02 = this.f4620v0;
            boolean z3 = (s02 == null || s02.f39060u == null || a9 == null || !isAttachedToWindow() || !this.f4588B0) ? false : true;
            if (z3 && this.f4586A0 == null) {
                if (this.f4628z0 == null) {
                    this.f4628z0 = R0.b(new Q0(this, 0));
                }
                R0.c(a9, this.f4628z0);
                this.f4586A0 = a9;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.f4586A0) == null) {
                return;
            }
            R0.d(onBackInvokedDispatcher, this.f4628z0);
            this.f4586A0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, C5275R.attr.toolbarStyle);
        this.f4601P = 8388627;
        this.f4608W = new ArrayList();
        this.f4610n0 = new ArrayList();
        this.f4611o0 = new int[2];
        this.f4612p0 = new C0339n(new Q0(this, 1));
        this.f4613q0 = new ArrayList();
        this.f4615s0 = new a(24, this);
        this.C0 = new c(29, this);
        Context context2 = getContext();
        int[] iArr = AbstractC4518a.f37610x;
        j4.g s9 = j4.g.s(context2, attributeSet, iArr, C5275R.attr.toolbarStyle);
        X.n(this, context, iArr, attributeSet, (TypedArray) s9.f38405v, C5275R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) s9.f38405v;
        this.f4591E = typedArray.getResourceId(28, 0);
        this.f4592F = typedArray.getResourceId(19, 0);
        this.f4601P = typedArray.getInteger(0, 8388627);
        this.f4593G = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4597L = dimensionPixelOffset;
        this.f4596K = dimensionPixelOffset;
        this.J = dimensionPixelOffset;
        this.f4595I = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4595I = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.J = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4596K = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4597L = dimensionPixelOffset5;
        }
        this.f4594H = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        K0 k02 = this.f4598M;
        k02.f39031h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            k02.f39028e = dimensionPixelSize;
            k02.f39024a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            k02.f39029f = dimensionPixelSize2;
            k02.f39025b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            k02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4599N = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4600O = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4625y = s9.i(4);
        this.f4627z = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4589C = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable i6 = s9.i(16);
        if (i6 != null) {
            setNavigationIcon(i6);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable i9 = s9.i(11);
        if (i9 != null) {
            setLogo(i9);
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
        T0 t02 = new T0(context, attributeSet);
        t02.f39062a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37589b);
        t02.f39062a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        t02.f39063b = 0;
        return t02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C4718w c4718w = this.f4585A;
        if (c4718w != null) {
            c4718w.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4585A.setImageDrawable(drawable);
        } else {
            C4718w c4718w = this.f4585A;
            if (c4718w != null) {
                c4718w.setImageDrawable(this.f4625y);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4623x == null) {
                this.f4623x = new C4720x(getContext(), null, 0);
            }
            if (!o(this.f4623x)) {
                b(this.f4623x, true);
            }
        } else {
            C4720x c4720x = this.f4623x;
            if (c4720x != null && o(c4720x)) {
                removeView(this.f4623x);
                this.f4610n0.remove(this.f4623x);
            }
        }
        C4720x c4720x2 = this.f4623x;
        if (c4720x2 != null) {
            c4720x2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4623x == null) {
            this.f4623x = new C4720x(getContext(), null, 0);
        }
        C4720x c4720x = this.f4623x;
        if (c4720x != null) {
            c4720x.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C4718w c4718w = this.f4621w;
        if (c4718w != null) {
            c4718w.setContentDescription(charSequence);
            b.t(this.f4621w, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f4621w)) {
                b(this.f4621w, true);
            }
        } else {
            C4718w c4718w = this.f4621w;
            if (c4718w != null && o(c4718w)) {
                removeView(this.f4621w);
                this.f4610n0.remove(this.f4621w);
            }
        }
        C4718w c4718w2 = this.f4621w;
        if (c4718w2 != null) {
            c4718w2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Z z3 = this.f4619v;
            if (z3 != null && o(z3)) {
                removeView(this.f4619v);
                this.f4610n0.remove(this.f4619v);
            }
        } else {
            if (this.f4619v == null) {
                Context context = getContext();
                Z z6 = new Z(context, null);
                this.f4619v = z6;
                z6.setSingleLine();
                this.f4619v.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4592F;
                if (i != 0) {
                    this.f4619v.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4605T;
                if (colorStateList != null) {
                    this.f4619v.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4619v)) {
                b(this.f4619v, true);
            }
        }
        Z z9 = this.f4619v;
        if (z9 != null) {
            z9.setText(charSequence);
        }
        this.f4603R = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4605T = colorStateList;
        Z z3 = this.f4619v;
        if (z3 != null) {
            z3.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Z z3 = this.f4617u;
            if (z3 != null && o(z3)) {
                removeView(this.f4617u);
                this.f4610n0.remove(this.f4617u);
            }
        } else {
            if (this.f4617u == null) {
                Context context = getContext();
                Z z6 = new Z(context, null);
                this.f4617u = z6;
                z6.setSingleLine();
                this.f4617u.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4591E;
                if (i != 0) {
                    this.f4617u.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f4604S;
                if (colorStateList != null) {
                    this.f4617u.setTextColor(colorStateList);
                }
            }
            if (!o(this.f4617u)) {
                b(this.f4617u, true);
            }
        }
        Z z9 = this.f4617u;
        if (z9 != null) {
            z9.setText(charSequence);
        }
        this.f4602Q = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4604S = colorStateList;
        Z z3 = this.f4617u;
        if (z3 != null) {
            z3.setTextColor(colorStateList);
        }
    }
}
