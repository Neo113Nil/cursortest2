package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import defpackage.aqa;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.c8p;
import defpackage.d8p;
import defpackage.de8;
import defpackage.e8p;
import defpackage.eq2;
import defpackage.f8p;
import defpackage.fxf;
import defpackage.g8p;
import defpackage.hrg;
import defpackage.j4c;
import defpackage.kdh;
import defpackage.kqv;
import defpackage.lb4;
import defpackage.n8p;
import defpackage.nch;
import defpackage.ndu;
import defpackage.och;
import defpackage.p8p;
import defpackage.pd;
import defpackage.qgg;
import defpackage.ri2;
import defpackage.ros;
import defpackage.rvf;
import defpackage.t1f;
import defpackage.t8p;
import defpackage.tk6;
import defpackage.u2b;
import defpackage.uk6;
import defpackage.vdn;
import defpackage.wdu;
import defpackage.y2x;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class SearchView extends FrameLayout implements tk6, nch {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public boolean B;
    public p8p C;
    public HashMap D;
    public final View a;
    public final ClippableRoundedCornerLayout b;
    public final View c;
    public final View d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final Toolbar h;
    public final TextView i;
    public final LinearLayout j;
    public final EditText k;
    public final ImageButton l;
    public final View m;
    public final TouchObserverFrameLayout n;
    public final boolean o;
    public final t8p p;
    public final t1f q;
    public final boolean r;
    public final u2b s;
    public final LinkedHashSet t;
    public SearchBar u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public final int z;

    public SearchView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, R.style.Widget_Material3_SearchView), attributeSet, i);
        this.q = new t1f(this, this);
        this.t = new LinkedHashSet();
        this.v = 16;
        this.C = p8p.b;
        Context context2 = getContext();
        TypedArray B = bcx.B(context2, attributeSet, vdn.M, i, R.style.Widget_Material3_SearchView, new int[0]);
        this.z = B.getColor(11, 0);
        int resourceId = B.getResourceId(16, -1);
        int resourceId2 = B.getResourceId(0, -1);
        String string = B.getString(3);
        String string2 = B.getString(4);
        String string3 = B.getString(24);
        boolean z = B.getBoolean(27, false);
        this.w = B.getBoolean(8, true);
        this.x = B.getBoolean(7, true);
        boolean z2 = B.getBoolean(17, false);
        this.y = B.getBoolean(9, true);
        this.r = B.getBoolean(10, true);
        B.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.o = true;
        this.a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.b = clippableRoundedCornerLayout;
        this.c = findViewById(R.id.open_search_view_background);
        View findViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.d = findViewById;
        this.e = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.g = materialToolbar;
        this.h = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.i = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.j = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.k = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.l = imageButton;
        View findViewById2 = findViewById(R.id.open_search_view_divider);
        this.m = findViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.n = touchObserverFrameLayout;
        this.p = new t8p(this);
        this.s = new u2b(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new f8p());
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z2) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new c8p(this, 2));
            if (z) {
                aqa aqaVar = new aqa(getContext());
                int N = qgg.N(R.attr.colorOnSurface, this);
                Paint paint = aqaVar.a;
                if (N != paint.getColor()) {
                    paint.setColor(N);
                    aqaVar.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(aqaVar);
            }
        }
        imageButton.setOnClickListener(new c8p(this, 0));
        editText.addTextChangedListener(new lb4(10, this));
        touchObserverFrameLayout.setOnTouchListener(new de8(4, this));
        fxf.w(materialToolbar, new e8p(this));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        eq2 eq2Var = new eq2(marginLayoutParams, marginLayoutParams.leftMargin, marginLayoutParams.rightMargin);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(findViewById2, eq2Var);
        setUpStatusBarSpacer(getStatusBarHeight());
        ndu.n(findViewById, new e8p(this));
    }

    public static void a(SearchView searchView, kqv kqvVar) {
        int i = kqvVar.a.g(647).b;
        searchView.setUpStatusBarSpacer(i);
        if (searchView.B) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(i > 0);
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.u;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f) {
        View view;
        u2b u2bVar = this.s;
        if (u2bVar == null || (view = this.c) == null) {
            return;
        }
        view.setBackgroundColor(u2bVar.a(this.z, f));
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            LayoutInflater from = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.e;
            frameLayout.addView(from.inflate(i, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i) {
        View view = this.d;
        if (view.getLayoutParams().height != i) {
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.o) {
            this.n.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    public final void b() {
        this.k.post(new d8p(this, 2));
    }

    public final void c() {
        if (this.C.equals(p8p.b) || this.C.equals(p8p.a)) {
            return;
        }
        SearchBar searchBar = this.u;
        t8p t8pVar = this.p;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            t8pVar.m();
            return;
        }
        this.u.setPlaceholderText(this.k.getText().toString());
        SearchBar searchBar2 = this.u;
        Objects.requireNonNull(t8pVar);
        searchBar2.post(new g8p(t8pVar, 0));
    }

    @Override // defpackage.nch
    public final void cancelBackProgress() {
        if (e() || this.u == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.p.c();
    }

    public final boolean d() {
        return this.v == 48;
    }

    public final boolean e() {
        return this.C.equals(p8p.b) || this.C.equals(p8p.a);
    }

    public final void f() {
        if (this.y) {
            this.k.postDelayed(new d8p(this, 0), 100L);
        }
    }

    public final void g(p8p p8pVar, boolean z) {
        if (this.C.equals(p8pVar)) {
            return;
        }
        p8p p8pVar2 = p8p.b;
        if (z) {
            if (p8pVar == p8p.d) {
                setModalForAccessibility(true);
            } else if (p8pVar == p8pVar2) {
                setModalForAccessibility(false);
            }
        }
        this.C = p8pVar;
        Iterator it = new LinkedHashSet(this.t).iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        j(p8pVar);
        SearchBar searchBar = this.u;
        if (searchBar == null || p8pVar != p8pVar2) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public kdh getBackHelper() {
        return this.p.n;
    }

    @Override // defpackage.tk6
    @NonNull
    public uk6 getBehavior() {
        return new Behavior();
    }

    @NonNull
    public p8p getCurrentTransitionState() {
        return this.C;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    @NonNull
    public EditText getEditText() {
        return this.k;
    }

    public CharSequence getHint() {
        return this.k.getHint();
    }

    @NonNull
    public TextView getSearchPrefix() {
        return this.i;
    }

    public CharSequence getSearchPrefixText() {
        return this.i.getText();
    }

    public int getSoftInputMode() {
        return this.v;
    }

    @NonNull
    public Editable getText() {
        return this.k.getText();
    }

    @NonNull
    public Toolbar getToolbar() {
        return this.g;
    }

    public final void h() {
        if (this.C.equals(p8p.d)) {
            return;
        }
        p8p p8pVar = this.C;
        p8p p8pVar2 = p8p.c;
        if (p8pVar.equals(p8pVar2)) {
            return;
        }
        t8p t8pVar = this.p;
        SearchView searchView = t8pVar.a;
        SearchBar searchBar = t8pVar.p;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = t8pVar.c;
        if (searchBar == null) {
            if (searchView.d()) {
                searchView.postDelayed(new d8p(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new g8p(t8pVar, 2));
            return;
        }
        EditText editText = t8pVar.j;
        if (searchView.d()) {
            searchView.f();
        }
        searchView.setTransitionState(p8pVar2);
        Toolbar toolbar = t8pVar.g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (t8pVar.p.getMenuResId() == -1 || !searchView.x) {
            toolbar.setVisibility(8);
        } else {
            toolbar.m(t8pVar.p.getMenuResId());
            ActionMenuView F = pd.F(toolbar);
            if (F != null) {
                for (int i = 0; i < F.getChildCount(); i++) {
                    View childAt = F.getChildAt(i);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(t8pVar.p.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new g8p(t8pVar, 1));
    }

    @Override // defpackage.nch
    public final void handleBackInvoked() {
        if (e()) {
            return;
        }
        t8p t8pVar = this.p;
        kdh kdhVar = t8pVar.n;
        ri2 ri2Var = (ri2) kdhVar.f;
        kdhVar.f = null;
        if (Build.VERSION.SDK_INT < 34 || this.u == null || ri2Var == null) {
            c();
            return;
        }
        long totalDuration = t8pVar.m().getTotalDuration();
        kdh kdhVar2 = t8pVar.n;
        AnimatorSet f = kdhVar2.f(t8pVar.p);
        f.setDuration(totalDuration);
        f.start();
        kdhVar2.i = 0.0f;
        kdhVar2.j = null;
        kdhVar2.k = null;
        if (t8pVar.o != null) {
            t8pVar.d(false).start();
            t8pVar.o.resume();
        }
        t8pVar.o = null;
    }

    public final void i(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.b.getId()) != null) {
                    i((ViewGroup) childAt, z);
                } else {
                    HashMap hashMap = this.D;
                    if (z) {
                        hashMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else if (hashMap != null && hashMap.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.D.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    public final void j(p8p p8pVar) {
        och ochVar;
        if (this.u == null || !this.r) {
            return;
        }
        boolean equals = p8pVar.equals(p8p.d);
        t1f t1fVar = this.q;
        if (equals) {
            och ochVar2 = (och) t1fVar.b;
            if (ochVar2 != null) {
                ochVar2.b((nch) t1fVar.c, (View) t1fVar.d, false);
                return;
            }
            return;
        }
        if (!p8pVar.equals(p8p.b) || (ochVar = (och) t1fVar.b) == null) {
            return;
        }
        ochVar.c((View) t1fVar.d);
    }

    public final void k() {
        ImageButton H = pd.H(this.g);
        if (H == null) {
            return;
        }
        int i = this.b.getVisibility() == 0 ? 1 : 0;
        Drawable drawable = H.getDrawable();
        if (drawable instanceof aqa) {
            aqa aqaVar = (aqa) drawable;
            float f = i;
            if (aqaVar.i != f) {
                aqaVar.i = f;
                aqaVar.invalidateSelf();
            }
        }
        if (drawable instanceof j4c) {
            ((j4c) drawable).a(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rvf.L(this);
        p8p currentTransitionState = getCurrentTransitionState();
        if (currentTransitionState == p8p.d) {
            setModalForAccessibility(true);
        } else if (currentTransitionState == p8p.b) {
            setModalForAccessibility(false);
        }
        j(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        t1f t1fVar = this.q;
        och ochVar = (och) t1fVar.b;
        if (ochVar != null) {
            ochVar.c((View) t1fVar.d);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.v = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n8p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n8p n8pVar = (n8p) parcelable;
        super.onRestoreInstanceState(n8pVar.a);
        setText(n8pVar.c);
        setVisible(n8pVar.d == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n8p n8pVar = new n8p(super.onSaveInstanceState());
        Editable text = getText();
        n8pVar.c = text == null ? null : text.toString();
        n8pVar.d = this.b.getVisibility();
        return n8pVar;
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.w = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.y = z;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    public void setHint(CharSequence charSequence) {
        this.k.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.x = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.D = new HashMap(viewGroup.getChildCount());
        }
        i(viewGroup, z);
        if (z) {
            return;
        }
        this.D = null;
    }

    public void setOnMenuItemClickListener(ros rosVar) {
        this.g.setOnMenuItemClickListener(rosVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.i;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z) {
        this.B = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    public void setText(CharSequence charSequence) {
        this.k.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.g.setTouchscreenBlocksFocus(z);
    }

    public void setTransitionState(@NonNull p8p p8pVar) {
        g(p8pVar, true);
    }

    public void setUseWindowInsetsController(boolean z) {
        this.A = z;
    }

    public void setVisible(boolean z) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        boolean z2 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z ? 0 : 8);
        k();
        g(z ? p8p.d : p8p.b, z2 != z);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.u = searchBar;
        this.p.p = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new c8p(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new d8p(this, 1));
                    this.k.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.g;
        if (materialToolbar != null && !(materialToolbar.getNavigationIcon() instanceof aqa)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.u == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable mutate = y2x.w(getContext(), defaultNavigationIconResource).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    mutate.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                mutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.setNavigationIcon(new j4c(this.u.getNavigationIcon(), mutate));
                k();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        j(getCurrentTransitionState());
    }

    @Override // defpackage.nch
    public final void startBackProgress(ri2 ri2Var) {
        SearchBar searchBar;
        if (e() || (searchBar = this.u) == null) {
            return;
        }
        searchBar.setPlaceholderText(this.k.getText().toString());
        t8p t8pVar = this.p;
        kdh kdhVar = t8pVar.n;
        SearchBar searchBar2 = t8pVar.p;
        kdhVar.f = ri2Var;
        float f = ri2Var.b;
        View view = (View) kdhVar.e;
        kdhVar.j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar2 != null) {
            kdhVar.k = fxf.v(view, searchBar2);
        }
        kdhVar.i = f;
    }

    @Override // defpackage.nch
    public final void updateBackProgress(ri2 ri2Var) {
        if (e() || this.u == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.p.n(ri2Var);
    }

    public static class Behavior extends uk6 {
        public Behavior() {
        }

        @Override // defpackage.uk6
        public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull SearchView searchView, @NonNull View view) {
            if (searchView.u != null || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
        }
    }

    public void setHint(int i) {
        this.k.setHint(i);
    }

    public void setText(int i) {
        this.k.setText(i);
    }

    public SearchView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }
}
