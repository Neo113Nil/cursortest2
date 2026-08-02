package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.a;
import kotlin.collections.b;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.eatskit.ContentView;
import ru.yandex.taxi.eatskit.Controller$State;
import ru.yandex.taxi.eatskit.EatsKitDelegates$ClickTarget;
import ru.yandex.taxi.eatskit.dto.ErrorSource;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;

/* loaded from: classes5.dex */
public abstract class rme {
    public final fen a;
    public final xz4 b;
    public String d;
    public String e;
    public cvq0 g;
    public String h;
    public String i;
    public final gl j;
    public final ike k;
    public ContentView l;
    public boolean m;
    public final i3y c = a.a(new aje(this, 3));
    public Controller$State f = Controller$State.LOADING;

    public rme(fen fenVar, xz4 xz4Var) {
        this.a = fenVar;
        this.b = xz4Var;
        gl glVar = new gl();
        glVar.x = this;
        glVar.c = this.f;
        String str = g().k;
        str = (str == null || str.length() == 0) ? null : str;
        glVar.w = str != null ? new Regex(str) : null;
        this.j = glVar;
        this.k = bvf0.b();
    }

    public final Uri.Builder a() {
        Uri.Builder buildUpon = Uri.parse(g().a).buildUpon();
        if (g().n) {
            buildUpon.appendQueryParameter("mode", "fullscreen");
        }
        return buildUpon;
    }

    public abstract void b();

    public void c() {
        if (this.l != null) {
            ien h = h();
            if (h != null) {
                h.destroy();
            }
            this.l = null;
        }
        bvf0.j(this.k, null);
    }

    public final void d(String str, String str2, List list) {
        StringBuilder w = oyr.w(str2, Extension.DOT_CHAR, str, Extension.O_BRAKE, kotlin.collections.a.X(list, Extension.FIX_SPACE, null, null, new foc(15), 30));
        w.append(Extension.C_BRAKE);
        String sb = w.toString();
        ien h = h();
        if (h != null) {
            h.evaluateJavascript(sb, new pme(0));
        }
    }

    public abstract xz4 e();

    public abstract NativeApi f();

    public final cvq0 g() {
        if (this.g == null) {
            this.g = ((rnc) this.b.a).n();
        }
        return this.g;
    }

    public final ien h() {
        return (ien) this.c.getValue();
    }

    public final boolean i() {
        ien h = h();
        if (h == null || !h.canGoBack()) {
            return false;
        }
        ContentView contentView = this.l;
        if ((contentView != null ? contentView.getCurrentState() : null) != Controller$State.ACTIVE) {
            return false;
        }
        ien h2 = h();
        if (h2 != null) {
            h2.goBack();
        }
        return true;
    }

    public void j(Uri.Builder builder, String str) {
    }

    public void k(Uri.Builder builder) {
    }

    public void l() {
    }

    public void m(EatsKitDelegates$ClickTarget eatsKitDelegates$ClickTarget) {
        int i = qme.a[eatsKitDelegates$ClickTarget.ordinal()];
        xz4 xz4Var = this.b;
        if (i == 1) {
            ((rnc) xz4Var.a).close();
            return;
        }
        if (i == 2) {
            this.g = null;
            aje ajeVar = new aje(this, 4);
            u(Controller$State.LOADING);
            ((rnc) xz4Var.a).i(false, new dke(2, this, ajeVar));
            return;
        }
        if (i == 3) {
            ((rnc) xz4Var.a).m();
            return;
        }
        if (i == 4) {
            ((rnc) xz4Var.a).close();
        } else if (i == 5) {
            ((rnc) xz4Var.a).close();
        } else {
            w511.b();
        }
    }

    public void n(boolean z) {
    }

    public void o() {
    }

    public void p(f8o f8oVar, ErrorSource errorSource) {
        String string;
        d6j0 d6j0Var;
        ien h = h();
        if (h != null) {
            h.loadUrl("about:blank", b.f());
        }
        ContentView contentView = this.l;
        if (contentView != null) {
            if (f8oVar == null || (d6j0Var = f8oVar.a) == null || (string = d6j0Var.c) == null) {
                string = contentView.getContext().getString(nzh0.super_app_error_screen_subtitle);
            }
            contentView.setErrorMessage$eatskit(string);
        }
        u(Controller$State.ERROR);
    }

    public void q() {
        Controller$State controller$State = this.f;
        Controller$State controller$State2 = Controller$State.ACTIVE;
        if (controller$State == controller$State2) {
            return;
        }
        ien h = h();
        if (h != null) {
            h.clearHistory();
        }
        ien h2 = h();
        if (h2 != null) {
            h2.gainFocus();
        }
        u(controller$State2);
        ((rnc) this.b.a).h();
    }

    public void r(iti0 iti0Var, boolean z) {
        this.g = null;
        jhd jhdVar = new jhd(13, iti0Var, this);
        u(Controller$State.LOADING);
        ((rnc) this.b.a).i(z, new dke(2, this, jhdVar));
    }

    public final void s(String str, boolean z) {
        r(str != null ? new iti0(str, 5) : null, z);
    }

    public final void t(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        n(z);
        ContentView contentView = this.l;
        if (contentView != null) {
            contentView.setIsOpen(z);
        }
    }

    public final void u(Controller$State controller$State) {
        Controller$State controller$State2 = Controller$State.ACTIVE;
        this.f = controller$State;
        ContentView contentView = this.l;
        if (contentView != null) {
            contentView.updateState(controller$State);
        }
    }
}
