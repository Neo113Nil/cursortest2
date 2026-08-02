package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hpv extends qd implements ne {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public dh7 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public gpv i;
    public gpv j;
    public nnk k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public xgu t;
    public boolean u;
    public boolean v;
    public final fpv w;
    public final fpv x;
    public final c5p y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    public hpv(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new fpv(this, 0);
        this.x = new fpv(this, 1);
        this.y = new c5p(15, this);
        View decorView = activity.getWindow().getDecorView();
        x(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.qd
    public final boolean b() {
        pos posVar;
        dh7 dh7Var = this.e;
        if (dh7Var == null || (posVar = ((zos) dh7Var).a.v0) == null || posVar.b == null) {
            return false;
        }
        pos posVar2 = ((zos) dh7Var).a.v0;
        rxh rxhVar = posVar2 == null ? null : posVar2.b;
        if (rxhVar == null) {
            return true;
        }
        rxhVar.collapseActionView();
        return true;
    }

    @Override // defpackage.qd
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        l1j.f();
    }

    @Override // defpackage.qd
    public final int d() {
        return ((zos) this.e).b;
    }

    @Override // defpackage.qd
    public final Context e() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(ru.yandex.music.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    @Override // defpackage.qd
    public final void f() {
        if (this.p) {
            return;
        }
        this.p = true;
        z(false);
    }

    @Override // defpackage.qd
    public final void h() {
        y(qe.a(this.a).a.getResources().getBoolean(ru.yandex.music.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.qd
    public final boolean j(int i, KeyEvent keyEvent) {
        hxh hxhVar;
        gpv gpvVar = this.i;
        if (gpvVar == null || (hxhVar = gpvVar.d) == null) {
            return false;
        }
        hxhVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return hxhVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.qd
    public final void m(boolean z2) {
        if (this.h) {
            return;
        }
        n(z2);
    }

    @Override // defpackage.qd
    public final void n(boolean z2) {
        int i = z2 ? 4 : 0;
        zos zosVar = (zos) this.e;
        int i2 = zosVar.b;
        this.h = true;
        zosVar.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.qd
    public final void o(Drawable drawable) {
        zos zosVar = (zos) this.e;
        zosVar.f = drawable;
        int i = zosVar.b & 4;
        Toolbar toolbar = zosVar.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = zosVar.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // defpackage.qd
    public final void p(boolean z2) {
        xgu xguVar;
        this.u = z2;
        if (z2 || (xguVar = this.t) == null) {
            return;
        }
        xguVar.a();
    }

    @Override // defpackage.qd
    public final void q(CharSequence charSequence) {
        ((zos) this.e).b(charSequence);
    }

    @Override // defpackage.qd
    public final void r(int i) {
        s(this.a.getString(i));
    }

    @Override // defpackage.qd
    public final void s(CharSequence charSequence) {
        zos zosVar = (zos) this.e;
        zosVar.g = true;
        Toolbar toolbar = zosVar.a;
        zosVar.h = charSequence;
        if ((zosVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (zosVar.g) {
                wdu.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.qd
    public final void t(CharSequence charSequence) {
        zos zosVar = (zos) this.e;
        if (zosVar.g) {
            return;
        }
        Toolbar toolbar = zosVar.a;
        zosVar.h = charSequence;
        if ((zosVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (zosVar.g) {
                wdu.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.qd
    public final void u() {
        if (this.p) {
            this.p = false;
            z(false);
        }
    }

    @Override // defpackage.qd
    public final ig v(nnk nnkVar) {
        gpv gpvVar = this.i;
        if (gpvVar != null) {
            gpvVar.b();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        gpv gpvVar2 = new gpv(this, this.f.getContext(), nnkVar);
        hxh hxhVar = gpvVar2.d;
        hxhVar.w();
        try {
            if (!((hg) gpvVar2.e.a).B(gpvVar2, hxhVar)) {
                return null;
            }
            this.i = gpvVar2;
            gpvVar2.h();
            this.f.c(gpvVar2);
            w(true);
            return gpvVar2;
        } finally {
            hxhVar.v();
        }
    }

    public final void w(boolean z2) {
        wgu b;
        wgu i;
        boolean z3 = this.r;
        if (z2) {
            if (!z3) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                z(false);
            }
        } else if (z3) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            z(false);
        }
        boolean isLaidOut = this.d.isLaidOut();
        dh7 dh7Var = this.e;
        if (!isLaidOut) {
            if (z2) {
                ((zos) dh7Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((zos) dh7Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            zos zosVar = (zos) dh7Var;
            i = wdu.b(zosVar.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new yos(zosVar, 4));
            b = this.f.i(0, 200L);
        } else {
            zos zosVar2 = (zos) dh7Var;
            b = wdu.b(zosVar2.a);
            b.a(1.0f);
            b.c(200L);
            b.d(new yos(zosVar2, 0));
            i = this.f.i(8, 100L);
        }
        xgu xguVar = new xgu();
        ArrayList arrayList = xguVar.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) b.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(b);
        xguVar.b();
    }

    public final void x(View view) {
        dh7 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ru.yandex.music.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(ru.yandex.music.R.id.action_bar);
        if (findViewById instanceof dh7) {
            wrapper = (dh7) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(ru.yandex.music.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ru.yandex.music.R.id.action_bar_container);
        this.d = actionBarContainer;
        dh7 dh7Var = this.e;
        if (dh7Var == null || this.f == null || actionBarContainer == null) {
            xq0.q(hpv.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((zos) dh7Var).a.getContext();
        this.a = context;
        if ((((zos) this.e).b & 4) != 0) {
            this.h = true;
        }
        Context context2 = qe.a(context).a;
        int i = context2.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        y(context2.getResources().getBoolean(ru.yandex.music.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, ken.a, ru.yandex.music.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.g) {
                xq0.q("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = wdu.a;
            ndu.l(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void y(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((zos) this.e).getClass();
        } else {
            ((zos) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((zos) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void z(boolean z2) {
        boolean z3 = this.r || !(this.p || this.q);
        boolean z4 = this.s;
        c5p c5pVar = this.y;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.s = false;
                xgu xguVar = this.t;
                if (xguVar != null) {
                    xguVar.a();
                }
                int i = this.n;
                fpv fpvVar = this.w;
                if (i != 0 || (!this.u && !z2)) {
                    fpvVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                xgu xguVar2 = new xgu();
                float f = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                wgu b = wdu.b(this.d);
                b.e(f);
                View view2 = (View) b.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c5pVar != null ? new up0(4, c5pVar, view2) : null);
                }
                boolean z5 = xguVar2.e;
                ArrayList arrayList = xguVar2.a;
                if (!z5) {
                    arrayList.add(b);
                }
                if (this.o && view != null) {
                    wgu b2 = wdu.b(view);
                    b2.e(f);
                    if (!xguVar2.e) {
                        arrayList.add(b2);
                    }
                }
                boolean z6 = xguVar2.e;
                if (!z6) {
                    xguVar2.c = z;
                }
                if (!z6) {
                    xguVar2.b = 250L;
                }
                if (!z6) {
                    xguVar2.d = fpvVar;
                }
                this.t = xguVar2;
                xguVar2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.s = true;
        xgu xguVar3 = this.t;
        if (xguVar3 != null) {
            xguVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        fpv fpvVar2 = this.x;
        if (i2 == 0 && (this.u || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.d.setTranslationY(f2);
            xgu xguVar4 = new xgu();
            wgu b3 = wdu.b(this.d);
            b3.e(0.0f);
            View view3 = (View) b3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c5pVar != null ? new up0(4, c5pVar, view3) : null);
            }
            boolean z7 = xguVar4.e;
            ArrayList arrayList2 = xguVar4.a;
            if (!z7) {
                arrayList2.add(b3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                wgu b4 = wdu.b(view);
                b4.e(0.0f);
                if (!xguVar4.e) {
                    arrayList2.add(b4);
                }
            }
            boolean z8 = xguVar4.e;
            if (!z8) {
                xguVar4.c = A;
            }
            if (!z8) {
                xguVar4.b = 250L;
            }
            if (!z8) {
                xguVar4.d = fpvVar2;
            }
            this.t = xguVar4;
            xguVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            fpvVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = wdu.a;
            ldu.c(actionBarOverlayLayout);
        }
    }

    public hpv(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new fpv(this, 0);
        this.x = new fpv(this, 1);
        this.y = new c5p(15, this);
        x(dialog.getWindow().getDecorView());
    }
}
