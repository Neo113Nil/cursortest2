package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class nr1 extends jcc implements dt1, aa7 {
    public final sr1 g;
    public dt1 h;
    public qzc i;
    public int k;
    public String l;
    public String m;
    public sa7 o;
    public final /* synthetic */ or1 p;
    public final /* synthetic */ sr1 q;
    public final /* synthetic */ c6e r;
    public final /* synthetic */ qr1 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ nsh u;
    public final sld f = new sld(8, this);
    public boolean j = false;
    public boolean n = true;

    public nr1(nsh nshVar, sr1 sr1Var, or1 or1Var, sr1 sr1Var2, c6e c6eVar, qr1 qr1Var, int i) {
        this.u = nshVar;
        this.p = or1Var;
        this.q = sr1Var2;
        this.r = c6eVar;
        this.s = qr1Var;
        this.t = i;
        this.g = sr1Var;
    }

    @Override // defpackage.jcc, defpackage.aa7
    public final ys1 a() {
        return this.h.a();
    }

    @Override // defpackage.jcc
    public final void b(Exception exc) {
        dt1 dt1Var;
        Exception exc2;
        or1 or1Var = this.p;
        if (or1Var.isCancelled() || (dt1Var = this.h) == null) {
            return;
        }
        super.b(exc);
        this.h.c(new tr1(this, 0));
        this.h.h(null);
        this.h.d(null);
        this.h.s(null);
        this.j = true;
        if ((dt1Var.isOpen() && exc == null) || this.i != null || exc == null) {
            exc2 = exc;
        } else {
            exc2 = exc;
            this.u.K(or1Var, exc2, null, this.q, this.r);
        }
        qr1 qr1Var = this.s;
        qr1Var.j = exc2;
        Iterator it = ((CopyOnWriteArrayList) this.u.b).iterator();
        while (it.hasNext()) {
            ((cjq) it.next()).d(qr1Var);
        }
    }

    @Override // defpackage.jcc, defpackage.aa7
    public final void close() {
        super.close();
        this.h.c(new tr1(this, 0));
    }

    @Override // defpackage.sa7
    public final void d(pm5 pm5Var) {
        this.o.d(pm5Var);
    }

    @Override // defpackage.sa7
    public final void e(om3 om3Var) {
        if (this.n) {
            this.n = false;
        }
        this.o.e(om3Var);
    }

    @Override // defpackage.sa7
    public final void end() {
        throw new AssertionError("end called?");
    }

    @Override // defpackage.jcc
    public final void f(aa7 aa7Var) {
        sr1 sr1Var = this.q;
        qzc qzcVar = sr1Var.c;
        qr1 qr1Var = this.s;
        qr1Var.i = aa7Var;
        nsh nshVar = this.u;
        Iterator it = ((CopyOnWriteArrayList) nshVar.b).iterator();
        while (it.hasNext()) {
            ((cjq) it.next()).getClass();
        }
        super.f(qr1Var.i);
        qzc qzcVar2 = this.i;
        int i = this.k;
        c6e c6eVar = this.r;
        or1 or1Var = this.p;
        if ((i != 301 && i != 302 && i != 307) || !sr1Var.d) {
            toString();
            this.u.K(or1Var, null, this, sr1Var, c6eVar);
            return;
        }
        String p = qzcVar2.p("Location");
        try {
            Uri parse = Uri.parse(p);
            if (parse.getScheme() == null) {
                parse = Uri.parse(new URL(new URL(sr1Var.b.toString()), p).toString());
            }
            sr1 sr1Var2 = new sr1(parse, sr1Var.a.equals("HEAD") ? "HEAD" : ServiceCommand.TYPE_GET);
            sr1Var2.h = sr1Var.h;
            sr1Var2.f = sr1Var.f;
            sr1Var2.g = sr1Var.g;
            nsh.S(sr1Var2);
            String p2 = qzcVar.p(HttpMessage.USER_AGENT);
            if (!TextUtils.isEmpty(p2)) {
                sr1Var2.c.H(HttpMessage.USER_AGENT, p2);
            }
            String p3 = qzcVar.p("Range");
            if (!TextUtils.isEmpty(p3)) {
                sr1Var2.c.H("Range", p3);
            }
            nshVar.h(sr1Var2, this.t + 1, or1Var, c6eVar);
            this.c = new imp();
        } catch (Exception e) {
            this.u.K(or1Var, e, this, sr1Var, c6eVar);
        }
    }

    @Override // defpackage.sa7
    public final void h(d6w d6wVar) {
        this.o.h(d6wVar);
    }

    public final void i(Exception exc) {
        sr1 sr1Var = this.q;
        nsh nshVar = this.u;
        or1 or1Var = this.p;
        if (exc != null) {
            nshVar.K(or1Var, exc, null, sr1Var, this.r);
            return;
        }
        if (or1Var.isCancelled()) {
            return;
        }
        if (or1Var.j != null && this.i == null) {
            ((ys1) nshVar.d).e(or1Var.i);
            or1Var.i = ((ys1) nshVar.d).d(or1Var.j, sr1Var.e);
        }
        Iterator it = ((CopyOnWriteArrayList) nshVar.b).iterator();
        while (it.hasNext()) {
            ((cjq) it.next()).c(this.s);
        }
    }

    @Override // defpackage.sa7
    public final boolean isOpen() {
        return this.o.isOpen();
    }

    public final String toString() {
        qzc qzcVar = this.i;
        if (qzcVar == null) {
            return super.toString();
        }
        return qzcVar.I(this.l + StringUtil.SPACE + this.k + StringUtil.SPACE + this.m);
    }
}
