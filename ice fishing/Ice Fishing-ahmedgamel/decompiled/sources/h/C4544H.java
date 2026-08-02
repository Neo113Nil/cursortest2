package h;

import O.X;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import i1.C4585b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C4708k;
import m.T0;
import m.Y0;

/* renamed from: h.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4544H extends AbstractC4545a {

    /* renamed from: a, reason: collision with root package name */
    public final Y0 f37844a;

    /* renamed from: b, reason: collision with root package name */
    public final w f37845b;

    /* renamed from: c, reason: collision with root package name */
    public final C4585b f37846c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37847d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37848e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37849f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f37850g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final G0.c f37851h = new G0.c(24, this);

    public C4544H(Toolbar toolbar, CharSequence charSequence, w wVar) {
        C4543G c4543g = new C4543G(this);
        Y0 y02 = new Y0(toolbar, false);
        this.f37844a = y02;
        wVar.getClass();
        this.f37845b = wVar;
        y02.f39160k = wVar;
        toolbar.setOnMenuItemClickListener(c4543g);
        if (!y02.f39157g) {
            y02.f39158h = charSequence;
            if ((y02.f39152b & 8) != 0) {
                Toolbar toolbar2 = y02.f39151a;
                toolbar2.setTitle(charSequence);
                if (y02.f39157g) {
                    X.p(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f37846c = new C4585b(28, this);
    }

    @Override // h.AbstractC4545a
    public final boolean a() {
        C4708k c4708k;
        ActionMenuView actionMenuView = this.f37844a.f39151a.f4579n;
        return (actionMenuView == null || (c4708k = actionMenuView.f4530M) == null || !c4708k.f()) ? false : true;
    }

    @Override // h.AbstractC4545a
    public final boolean b() {
        l.o oVar;
        T0 t02 = this.f37844a.f39151a.f4583q0;
        if (t02 == null || (oVar = t02.f39129u) == null) {
            return false;
        }
        if (t02 == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4545a
    public final void c(boolean z6) {
        if (z6 == this.f37849f) {
            return;
        }
        this.f37849f = z6;
        ArrayList arrayList = this.f37850g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // h.AbstractC4545a
    public final int d() {
        return this.f37844a.f39152b;
    }

    @Override // h.AbstractC4545a
    public final Context e() {
        return this.f37844a.f39151a.getContext();
    }

    @Override // h.AbstractC4545a
    public final boolean f() {
        Y0 y02 = this.f37844a;
        Toolbar toolbar = y02.f39151a;
        G0.c cVar = this.f37851h;
        toolbar.removeCallbacks(cVar);
        Toolbar toolbar2 = y02.f39151a;
        WeakHashMap weakHashMap = X.f2142a;
        toolbar2.postOnAnimation(cVar);
        return true;
    }

    @Override // h.AbstractC4545a
    public final void h() {
        this.f37844a.f39151a.removeCallbacks(this.f37851h);
    }

    @Override // h.AbstractC4545a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu t6 = t();
        if (t6 == null) {
            return false;
        }
        t6.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return t6.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4545a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // h.AbstractC4545a
    public final boolean k() {
        return this.f37844a.f39151a.v();
    }

    @Override // h.AbstractC4545a
    public final void m(boolean z6) {
        Y0 y02 = this.f37844a;
        y02.a((y02.f39152b & (-5)) | 4);
    }

    @Override // h.AbstractC4545a
    public final void n(int i) {
        this.f37844a.b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.drawable.Drawable] */
    @Override // h.AbstractC4545a
    public final void o(j.a aVar) {
        Y0 y02 = this.f37844a;
        y02.f39156f = aVar;
        int i = y02.f39152b & 4;
        Toolbar toolbar = y02.f39151a;
        j.a aVar2 = aVar;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (aVar == null) {
            aVar2 = y02.f39164o;
        }
        toolbar.setNavigationIcon(aVar2);
    }

    @Override // h.AbstractC4545a
    public final void r(CharSequence charSequence) {
        Y0 y02 = this.f37844a;
        if (y02.f39157g) {
            return;
        }
        y02.f39158h = charSequence;
        if ((y02.f39152b & 8) != 0) {
            Toolbar toolbar = y02.f39151a;
            toolbar.setTitle(charSequence);
            if (y02.f39157g) {
                X.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu t() {
        boolean z6 = this.f37848e;
        Y0 y02 = this.f37844a;
        if (!z6) {
            M.h hVar = new M.h(this);
            I0.j jVar = new I0.j(25, this);
            Toolbar toolbar = y02.f39151a;
            toolbar.f4584r0 = hVar;
            toolbar.f4585s0 = jVar;
            ActionMenuView actionMenuView = toolbar.f4579n;
            if (actionMenuView != null) {
                actionMenuView.f4531N = hVar;
                actionMenuView.f4532O = jVar;
            }
            this.f37848e = true;
        }
        return y02.f39151a.getMenu();
    }

    @Override // h.AbstractC4545a
    public final void g() {
    }

    @Override // h.AbstractC4545a
    public final void p() {
    }

    @Override // h.AbstractC4545a
    public final void l(boolean z6) {
    }

    @Override // h.AbstractC4545a
    public final void q(boolean z6) {
    }
}
