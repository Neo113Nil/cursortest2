package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class tos extends qd {
    public final zos a;
    public final Window.Callback b;
    public final z6n c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final yyo h = new yyo(9, this);

    public tos(Toolbar toolbar, CharSequence charSequence, ar0 ar0Var) {
        vtm vtmVar = new vtm(this);
        zos zosVar = new zos(toolbar, false);
        this.a = zosVar;
        ar0Var.getClass();
        this.b = ar0Var;
        zosVar.k = ar0Var;
        toolbar.setOnMenuItemClickListener(vtmVar);
        if (!zosVar.g) {
            zosVar.h = charSequence;
            if ((zosVar.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (zosVar.g) {
                    wdu.r(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.c = new z6n(13, this);
    }

    @Override // defpackage.qd
    public final boolean a() {
        dg dgVar;
        ActionMenuView actionMenuView = this.a.a.a;
        return (actionMenuView == null || (dgVar = actionMenuView.t) == null || !dgVar.f()) ? false : true;
    }

    @Override // defpackage.qd
    public final boolean b() {
        rxh rxhVar;
        pos posVar = this.a.a.v0;
        if (posVar == null || (rxhVar = posVar.b) == null) {
            return false;
        }
        if (posVar == null) {
            rxhVar = null;
        }
        if (rxhVar == null) {
            return true;
        }
        rxhVar.collapseActionView();
        return true;
    }

    @Override // defpackage.qd
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        l1j.f();
    }

    @Override // defpackage.qd
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.qd
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.qd
    public final void f() {
        this.a.a.setVisibility(8);
    }

    @Override // defpackage.qd
    public final boolean g() {
        zos zosVar = this.a;
        Toolbar toolbar = zosVar.a;
        yyo yyoVar = this.h;
        toolbar.removeCallbacks(yyoVar);
        Toolbar toolbar2 = zosVar.a;
        WeakHashMap weakHashMap = wdu.a;
        toolbar2.postOnAnimation(yyoVar);
        return true;
    }

    @Override // defpackage.qd
    public final void i() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.qd
    public final boolean j(int i, KeyEvent keyEvent) {
        Menu w = w();
        if (w == null) {
            return false;
        }
        w.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return w.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.qd
    public final boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    @Override // defpackage.qd
    public final boolean l() {
        return this.a.a.v();
    }

    @Override // defpackage.qd
    public final void n(boolean z) {
        int i = z ? 4 : 0;
        zos zosVar = this.a;
        zosVar.a((i & 4) | (zosVar.b & (-5)));
    }

    @Override // defpackage.qd
    public final void o(Drawable drawable) {
        zos zosVar = this.a;
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
    public final void q(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    @Override // defpackage.qd
    public final void r(int i) {
        zos zosVar = this.a;
        CharSequence text = i != 0 ? zosVar.a.getContext().getText(i) : null;
        zosVar.g = true;
        Toolbar toolbar = zosVar.a;
        zosVar.h = text;
        if ((zosVar.b & 8) != 0) {
            toolbar.setTitle(text);
            if (zosVar.g) {
                wdu.r(toolbar.getRootView(), text);
            }
        }
    }

    @Override // defpackage.qd
    public final void s(CharSequence charSequence) {
        zos zosVar = this.a;
        zosVar.g = true;
        Toolbar toolbar = zosVar.a;
        zosVar.h = null;
        if ((zosVar.b & 8) != 0) {
            toolbar.setTitle((CharSequence) null);
            if (zosVar.g) {
                wdu.r(toolbar.getRootView(), null);
            }
        }
    }

    @Override // defpackage.qd
    public final void t(CharSequence charSequence) {
        zos zosVar = this.a;
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
        this.a.a.setVisibility(0);
    }

    public final Menu w() {
        boolean z = this.e;
        zos zosVar = this.a;
        if (!z) {
            bz2 bz2Var = new bz2(21, this);
            gao gaoVar = new gao(this);
            Toolbar toolbar = zosVar.a;
            toolbar.w0 = bz2Var;
            toolbar.x0 = gaoVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.u = bz2Var;
                actionMenuView.v = gaoVar;
            }
            this.e = true;
        }
        return zosVar.a.getMenu();
    }

    @Override // defpackage.qd
    public final void h() {
    }

    @Override // defpackage.qd
    public final void m(boolean z) {
    }

    @Override // defpackage.qd
    public final void p(boolean z) {
    }
}
