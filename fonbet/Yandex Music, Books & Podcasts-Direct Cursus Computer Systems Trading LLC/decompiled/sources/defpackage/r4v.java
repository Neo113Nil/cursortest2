package defpackage;

import androidx.fragment.app.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class r4v {
    public final z6v a;
    public final vdr b;
    public final Function0 c;
    public final Function0 d;
    public final jyr e;
    public final jyr f;
    public final apo g;

    public r4v(final mm6 mm6Var, z6v z6vVar, vdr vdrVar, Function0 function0, Function0 function02) {
        z6vVar.getClass();
        vdrVar.getClass();
        this.a = z6vVar;
        this.b = vdrVar;
        this.c = function0;
        this.d = function02;
        final int i = 0;
        this.e = btf.b(new Function0(this) { // from class: l4v
            public final /* synthetic */ r4v b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        r4v r4vVar = this.b;
                        z6v z6vVar2 = r4vVar.a;
                        Continuation continuation = null;
                        return lg3.u0(new eno(new tkc(zsd.b0(new u21(10, zsd.b0(new y4s(z6vVar2.k, 26)), zsd.b0(new y4s(z6vVar2.m, 27)), new v42(r4vVar, continuation, 17))), continuation, 2)), mm6Var, vq2.O((n9v) z6vVar2.k.getValue()));
                    default:
                        vdr vdrVar2 = this.b.a.l;
                        return lg3.u0(new y4s(vdrVar2, 25), mm6Var, Boolean.valueOf(((x66) vdrVar2.getValue()).a));
                }
            }
        });
        final int i2 = 1;
        this.f = btf.b(new Function0(this) { // from class: l4v
            public final /* synthetic */ r4v b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        r4v r4vVar = this.b;
                        z6v z6vVar2 = r4vVar.a;
                        Continuation continuation = null;
                        return lg3.u0(new eno(new tkc(zsd.b0(new u21(10, zsd.b0(new y4s(z6vVar2.k, 26)), zsd.b0(new y4s(z6vVar2.m, 27)), new v42(r4vVar, continuation, 17))), continuation, 2)), mm6Var, vq2.O((n9v) z6vVar2.k.getValue()));
                    default:
                        vdr vdrVar2 = this.b.a.l;
                        return lg3.u0(new y4s(vdrVar2, 25), mm6Var, Boolean.valueOf(((x66) vdrVar2.getValue()).a));
                }
            }
        });
        this.g = new apo(new jvu(10, this), new m4v(this, 0), false, 15);
    }

    public final exa a() {
        return (exa) this.c.invoke();
    }

    public final cvo b() {
        return (cvo) a().b.getValue();
    }

    public final void c(q6v q6vVar) {
        n6v n6vVar;
        m6v m6vVar = q6vVar.a;
        vdr vdrVar = this.b;
        boolean z = ((a7v) vdrVar.getValue()).n;
        Function0 function0 = this.d;
        if (!z && ((a7v) vdrVar.getValue()).p && !m6vVar.g.isEmpty()) {
            w1g.y(((k4v) function0.invoke()).a.a, "yandexmusic://paywall/option?type=alice-pro", true);
            return;
        }
        if (((a7v) vdrVar.getValue()).q && (n6vVar = m6vVar.e) != null) {
            this.g.p(m6vVar, n6vVar);
            return;
        }
        exa a = a();
        wjb wjbVar = wjb.FactScreen;
        cvo b = b();
        b.getClass();
        a.a(wjbVar, vq2.V(b, sj2.o(m6vVar)));
        k4v k4vVar = (k4v) function0.invoke();
        k4vVar.getClass();
        q1v q1vVar = k4vVar.a;
        i4v i4vVar = (i4v) q1vVar.c.b.getValue();
        y yVar = q1vVar.b;
        p1v p1vVar = (p1v) q1vVar.d.getValue();
        i4vVar.getClass();
        p1vVar.getClass();
        cvo cvoVar = cvo.i;
        g6v g6vVar = m6vVar.f;
        fxf.Q(yVar, o6m.b(wjbVar, new avo(sj2.n(g6vVar, pkb.Fact), g6vVar.a), 2), null, null, pd.t(new qzm[0]), null, new wn5(new fb1(16, i4vVar, q6vVar, p1vVar), -1376359534, true), 22);
    }
}
