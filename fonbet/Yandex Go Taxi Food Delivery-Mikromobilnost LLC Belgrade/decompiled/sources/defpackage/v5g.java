package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.profile.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes8.dex */
public final class v5g implements vdf0 {
    public final ju11 A;
    public final b8w B;
    public final ee C;
    public final ju11 D;
    public final xvf0 E;
    public final i6r a;
    public final u5g b;
    public final i5g c;
    public final i5g d;
    public final u5g e;
    public final xvf0 f;
    public final u5g g;
    public final u5g h;
    public final i5g i;
    public final i5g j;
    public final xvf0 k;
    public final u5g l;
    public final n3w m;
    public final edf0 n;
    public final i5g o;
    public final xvf0 p;
    public final n3w q;
    public final u5g r;
    public final u5g s;
    public final xvf0 t;
    public final ci3 u;
    public final xvf0 v;
    public final icc0 w;
    public final ci3 x;
    public final m9a0 y;
    public final rk21 z;

    public v5g(i6r i6rVar) {
        this.a = i6rVar;
        this.b = new u5g(i6rVar, 21);
        this.c = new i5g(i6rVar, 26);
        i5g i5gVar = new i5g(i6rVar, 20);
        this.d = i5gVar;
        u5g u5gVar = new u5g(i6rVar, 1);
        this.e = u5gVar;
        this.f = i5m.b(new icc0(this.c, i5m.b(new npe0(i5gVar, u5gVar, new u5g(i6rVar, 6), 2)), 17, false));
        this.g = new u5g(i6rVar, 15);
        this.h = new u5g(i6rVar, 20);
        this.i = new i5g(i6rVar, 23);
        u5g u5gVar2 = new u5g(i6rVar, 8);
        i5g i5gVar2 = new i5g(i6rVar, 21);
        this.j = i5gVar2;
        xvf0 b = i5m.b(new npe0(u5gVar2, this.b, i5gVar2, 4));
        this.k = b;
        xvf0 b2 = i5m.b(new ci3(this.b, this.f, this.g, this.h, this.d, this.i, this.e, b, this.j));
        u5g u5gVar3 = new u5g(i6rVar, 26);
        this.l = u5gVar3;
        this.m = n3w.a(new yff0(new yuf0(b2, this.e, this.k, u5gVar3, this.h, new u5g(i6rVar, 4))));
        this.n = new edf0(new i5g(i6rVar, 28), 6);
        this.o = new i5g(i6rVar, 22);
        xvf0 b3 = i5m.b(new g970(new i5g(i6rVar, 29), 26));
        this.p = b3;
        this.q = n3w.a(new gef0(new ofa0(this.b, this.n, this.o, b3)));
        this.r = new u5g(i6rVar, 0);
        u5g u5gVar4 = new u5g(i6rVar, 18);
        this.s = u5gVar4;
        xvf0 b4 = i5m.b(new g970(u5gVar4, 24));
        this.t = b4;
        this.u = new ci3(this.c, i5m.b(new m9a0(this.r, this.f, b4, new edf0(sef0.a, 1), new u5g(i6rVar, 19), 15)), new u5g(i6rVar, 2), this.t, new u5g(i6rVar, 10), new u5g(i6rVar, 24), new u5g(i6rVar, 17), new u5g(i6rVar, 23), this.p);
        xvf0 b5 = i5m.b(bgf0.a);
        this.v = b5;
        i5g i5gVar3 = new i5g(i6rVar, 27);
        i5g i5gVar4 = this.c;
        this.w = new icc0(i5gVar4, i5gVar3, 22);
        this.x = new ci3(i5gVar4, new u5g(i6rVar, 22), new u5g(i6rVar, 12), new u5g(i6rVar, 11), new u5g(i6rVar, 7), b5, i5gVar3, new u5g(i6rVar, 3), new u5g(i6rVar, 25));
        u5g u5gVar5 = new u5g(i6rVar, 13);
        i5g i5gVar5 = new i5g(i6rVar, 25);
        u5g u5gVar6 = new u5g(i6rVar, 14);
        i5g i5gVar6 = this.d;
        this.y = new m9a0(u5gVar5, i5gVar5, u5gVar6, i5gVar6, i5gVar3, 7);
        this.z = new rk21(new u5g(i6rVar, 9), i5gVar3, 2);
        this.A = new ju11(this.l, i5gVar3);
        this.B = new b8w(new i5g(i6rVar, 24), i5gVar3, 3);
        this.C = new ee(i5gVar3, new u5g(i6rVar, 16), new u5g(i6rVar, 5), i5gVar6, 4);
        this.D = new ju11(i5gVar3, this.s);
        n3w n3wVar = y2r0.c;
        ArrayList arrayList = new ArrayList(8);
        List list = Collections.EMPTY_LIST;
        arrayList.add(this.w);
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.z);
        arrayList.add(this.A);
        arrayList.add(this.B);
        arrayList.add(this.C);
        arrayList.add(this.D);
        y2r0 y2r0Var = new y2r0(arrayList, list);
        this.E = i5m.b(new icc0(this.b, y2r0Var, 19));
    }

    @Override // defpackage.vdf0
    public final r8w0 a() {
        return new s8w0(d(), this.u, (agf0) this.v.get());
    }

    @Override // defpackage.vdf0
    public final jy60 b() {
        Lifecycle lifecycle = (Lifecycle) ((c0g) this.a).P.get();
        q5z.h(lifecycle);
        return new a(lifecycle, (com.yandex.go.profile.domain.divkit.a) this.E.get());
    }

    @Override // defpackage.vdf0
    public final q8w0 c() {
        cxq0 d = d();
        b bVar = (b) ((c0g) this.a).k8.get();
        q5z.h(bVar);
        return new com.yandex.go.profile.b(d, this.u, bVar, (agf0) this.v.get());
    }

    public final cxq0 d() {
        return new cxq0((yff0) this.m.a, (gef0) this.q.a, ((c0g) this.a).p2(), (com.yandex.div.core.expression.variables.a) this.p.get(), 21);
    }
}
