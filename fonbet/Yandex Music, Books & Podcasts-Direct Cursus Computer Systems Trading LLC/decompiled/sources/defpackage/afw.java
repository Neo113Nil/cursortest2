package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class afw {
    public static final String l = "YnisonApp:".concat("YnisonCenter");
    public final rjq a;
    public final um6 b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public rar k;

    public afw() {
        rjq rjqVar = new rjq(false);
        this.a = rjqVar;
        this.b = hld.s(rjqVar, dm6.b());
        bdt I = hag.I(wlw.class);
        l18 l18Var = l18.b;
        this.c = l18Var.b(I, true);
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: oew
            public final /* synthetic */ afw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (qfw) ((wlw) this.b.c.getValue()).g.getValue();
                    case 1:
                        return new mrw(this.b.b);
                    default:
                        return new udw(new z78(this.b.a().e(), 8));
                }
            }
        });
        this.e = btf.b(new law(3));
        this.f = l18Var.b(hag.I(z5l.class), true);
        this.g = l18Var.b(hag.I(oq7.class), true);
        this.h = btf.b(new law(4));
        final int i2 = 1;
        this.i = btf.b(new Function0(this) { // from class: oew
            public final /* synthetic */ afw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (qfw) ((wlw) this.b.c.getValue()).g.getValue();
                    case 1:
                        return new mrw(this.b.b);
                    default:
                        return new udw(new z78(this.b.a().e(), 8));
                }
            }
        });
        final int i3 = 2;
        this.j = btf.b(new Function0(this) { // from class: oew
            public final /* synthetic */ afw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (qfw) ((wlw) this.b.c.getValue()).g.getValue();
                    case 1:
                        return new mrw(this.b.b);
                    default:
                        return new udw(new z78(this.b.a().e(), 8));
                }
            }
        });
    }

    public final qfw a() {
        return (qfw) this.d.getValue();
    }

    public final how b() {
        sqw sqwVar = a().c() ? (sqw) a().F.getValue() : null;
        if (sqwVar != null) {
            return sqwVar.a();
        }
        return null;
    }

    public final jmg c() {
        return (jmg) this.h.getValue();
    }

    public final pjc d() {
        return zsd.b0(new e7v(a().F, 24));
    }

    public final yc4 e() {
        return zsd.M0(zsd.b0(new e7v(((mrw) this.i.getValue()).n, 25)), new j0v((Continuation) null, this, 4));
    }

    public final void f(String str, zsw zswVar) {
        how b;
        List list;
        str.getClass();
        if (!a().c() || (b = b()) == null || (list = b.a) == null) {
            return;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((gow) it.next()).a);
        }
        if (arrayList.contains(str)) {
            qfw.j(a(), str, zswVar, 2);
        }
    }

    public final void g(zsw zswVar) {
        how b;
        if (a().c() && (b = b()) != null) {
            qfw.j(a(), b.d.a, zswVar, 2);
        }
    }

    public final void h(oow oowVar) {
        oowVar.getClass();
        wlw wlwVar = (wlw) this.c.getValue();
        wlwVar.getClass();
        diw b = wlwVar.b();
        bdt I = hag.I(mlw.class);
        qdc qdcVar = b.a;
        qdcVar.getClass();
        ((mlw) qdcVar.C(I)).e.a(oowVar);
    }
}
