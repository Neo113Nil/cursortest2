package defpackage;

import android.net.Uri;
import com.yandex.div.core.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class qtk extends kql {
    public final d a;
    public final rvo b;
    public final xw91 c;
    public final ArrayList d = new ArrayList();
    public final /* synthetic */ rtk e;

    public qtk(rtk rtkVar, d dVar, rvo rvoVar, xw91 xw91Var) {
        this.e = rtkVar;
        this.a = dVar;
        this.b = rvoVar;
        this.c = xw91Var;
    }

    @Override // defpackage.kql
    public final /* bridge */ /* synthetic */ Object a(m3k m3kVar, rvo rvoVar) {
        o(m3kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object b(i2k i2kVar, rvo rvoVar) {
        o(i2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object d(k2k k2kVar, rvo rvoVar) {
        o(k2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object e(l2k l2kVar, rvo rvoVar) {
        o(l2kVar, rvoVar);
        if (this.c.i(l2kVar, rvoVar)) {
            String uri = ((Uri) l2kVar.c.u.a(rvoVar)).toString();
            d dVar = this.a;
            dVar.k();
            this.d.add(this.e.a.loadImageBytes(uri, dVar, -1));
        }
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object f(m2k m2kVar, rvo rvoVar) {
        o(m2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object g(n2k n2kVar, rvo rvoVar) {
        o(n2kVar, rvoVar);
        if (this.c.i(n2kVar, rvoVar)) {
            String uri = ((Uri) n2kVar.c.B.a(rvoVar)).toString();
            d dVar = this.a;
            dVar.k();
            this.d.add(this.e.a.loadImage(uri, dVar, -1));
        }
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object h(q2k q2kVar, rvo rvoVar) {
        o(q2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object j(u2k u2kVar, rvo rvoVar) {
        o(u2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object k(w2k w2kVar, rvo rvoVar) {
        o(w2kVar, rvoVar);
        return zy11.a;
    }

    @Override // defpackage.kql
    public final Object l(x2k x2kVar, rvo rvoVar) {
        List list;
        o(x2kVar, rvoVar);
        if (this.c.i(x2kVar, rvoVar) && (list = x2kVar.c.F) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String uri = ((Uri) ((cfl) it.next()).i.a(rvoVar)).toString();
                d dVar = this.a;
                dVar.k();
                this.d.add(this.e.a.loadImage(uri, dVar, -1));
            }
        }
        return zy11.a;
    }

    public final void o(m3k m3kVar, rvo rvoVar) {
        List<kfk> background = m3kVar.d().getBackground();
        if (background != null) {
            for (kfk kfkVar : background) {
                if (kfkVar instanceof ffk) {
                    ffk ffkVar = (ffk) kfkVar;
                    this.c.getClass();
                    if (((Boolean) ffkVar.b.f.a(rvoVar)).booleanValue()) {
                        String uri = ((Uri) ffkVar.b.e.a(rvoVar)).toString();
                        d dVar = this.a;
                        dVar.k();
                        this.d.add(this.e.a.loadImage(uri, dVar, -1));
                    }
                }
            }
        }
    }
}
