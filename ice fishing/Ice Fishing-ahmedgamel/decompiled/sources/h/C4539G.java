package h;

import O.X;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import g1.C4522b;
import g1.C4523c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C4695k;
import m.S0;
import m.X0;

/* renamed from: h.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4539G extends AbstractC4541a {

    /* renamed from: a, reason: collision with root package name */
    public final X0 f37818a;

    /* renamed from: b, reason: collision with root package name */
    public final w f37819b;

    /* renamed from: c, reason: collision with root package name */
    public final C4523c f37820c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37821d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37822e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37823f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f37824g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final G0.c f37825h = new G0.c(24, this);

    public C4539G(Toolbar toolbar, CharSequence charSequence, w wVar) {
        I0.j jVar = new I0.j(27, this);
        X0 x02 = new X0(toolbar, false);
        this.f37818a = x02;
        wVar.getClass();
        this.f37819b = wVar;
        x02.f39090k = wVar;
        toolbar.setOnMenuItemClickListener(jVar);
        if (!x02.f39087g) {
            x02.f39088h = charSequence;
            if ((x02.f39082b & 8) != 0) {
                Toolbar toolbar2 = x02.f39081a;
                toolbar2.setTitle(charSequence);
                if (x02.f39087g) {
                    X.p(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.f37820c = new C4523c(23, this);
    }

    @Override // h.AbstractC4541a
    public final boolean a() {
        C4695k c4695k;
        ActionMenuView actionMenuView = this.f37818a.f39081a.f4609n;
        return (actionMenuView == null || (c4695k = actionMenuView.f4562M) == null || !c4695k.f()) ? false : true;
    }

    @Override // h.AbstractC4541a
    public final boolean b() {
        l.o oVar;
        S0 s02 = this.f37818a.f39081a.f4620v0;
        if (s02 == null || (oVar = s02.f39060u) == null) {
            return false;
        }
        if (s02 == null) {
            oVar = null;
        }
        if (oVar == null) {
            return true;
        }
        oVar.collapseActionView();
        return true;
    }

    @Override // h.AbstractC4541a
    public final void c(boolean z3) {
        if (z3 == this.f37823f) {
            return;
        }
        this.f37823f = z3;
        ArrayList arrayList = this.f37824g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // h.AbstractC4541a
    public final int d() {
        return this.f37818a.f39082b;
    }

    @Override // h.AbstractC4541a
    public final Context e() {
        return this.f37818a.f39081a.getContext();
    }

    @Override // h.AbstractC4541a
    public final boolean f() {
        X0 x02 = this.f37818a;
        Toolbar toolbar = x02.f39081a;
        G0.c cVar = this.f37825h;
        toolbar.removeCallbacks(cVar);
        Toolbar toolbar2 = x02.f39081a;
        WeakHashMap weakHashMap = X.f2054a;
        toolbar2.postOnAnimation(cVar);
        return true;
    }

    @Override // h.AbstractC4541a
    public final void h() {
        this.f37818a.f39081a.removeCallbacks(this.f37825h);
    }

    @Override // h.AbstractC4541a
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu t6 = t();
        if (t6 == null) {
            return false;
        }
        t6.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return t6.performShortcut(i, keyEvent, 0);
    }

    @Override // h.AbstractC4541a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // h.AbstractC4541a
    public final boolean k() {
        return this.f37818a.f39081a.v();
    }

    @Override // h.AbstractC4541a
    public final void m(boolean z3) {
        X0 x02 = this.f37818a;
        x02.a((x02.f39082b & (-5)) | 4);
    }

    @Override // h.AbstractC4541a
    public final void n(int i) {
        this.f37818a.b(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.drawable.Drawable] */
    @Override // h.AbstractC4541a
    public final void o(j.a aVar) {
        X0 x02 = this.f37818a;
        x02.f39086f = aVar;
        int i = x02.f39082b & 4;
        Toolbar toolbar = x02.f39081a;
        j.a aVar2 = aVar;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (aVar == null) {
            aVar2 = x02.f39094o;
        }
        toolbar.setNavigationIcon(aVar2);
    }

    @Override // h.AbstractC4541a
    public final void r(CharSequence charSequence) {
        X0 x02 = this.f37818a;
        if (x02.f39087g) {
            return;
        }
        x02.f39088h = charSequence;
        if ((x02.f39082b & 8) != 0) {
            Toolbar toolbar = x02.f39081a;
            toolbar.setTitle(charSequence);
            if (x02.f39087g) {
                X.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu t() {
        boolean z3 = this.f37822e;
        X0 x02 = this.f37818a;
        if (!z3) {
            L3.h hVar = new L3.h(this);
            C4522b c4522b = new C4522b(20, this);
            Toolbar toolbar = x02.f39081a;
            toolbar.f4622w0 = hVar;
            toolbar.f4624x0 = c4522b;
            ActionMenuView actionMenuView = toolbar.f4609n;
            if (actionMenuView != null) {
                actionMenuView.f4563N = hVar;
                actionMenuView.f4564O = c4522b;
            }
            this.f37822e = true;
        }
        return x02.f39081a.getMenu();
    }

    @Override // h.AbstractC4541a
    public final void g() {
    }

    @Override // h.AbstractC4541a
    public final void p() {
    }

    @Override // h.AbstractC4541a
    public final void l(boolean z3) {
    }

    @Override // h.AbstractC4541a
    public final void q(boolean z3) {
    }
}
