package defpackage;

import com.yandex.music.shared.radio.domain.commands.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class s8q implements a8q {
    public final k7q e;
    public final d f;
    public final rfn g;
    public final f7l h;
    public final uol i;
    public final agn j;
    public final y7u k;
    public final Long l;
    public final x3n m;
    public final xdr n;
    public final yiq o;
    public final mm6 p;
    public final AtomicBoolean q;

    public s8q(k7q k7qVar, rfn rfnVar, f7l f7lVar, uol uolVar, agn agnVar, uoh uohVar, y7u y7uVar) {
        Unit unit;
        Long l = y7uVar.f;
        nur nurVar = rfnVar.a;
        x3n x3nVar = new x3n();
        x3nVar.a = nurVar;
        x3nVar.b = uolVar;
        x3nVar.c = y0q.b(0, 1, oi3.b, 1);
        x3nVar.d = new AtomicBoolean(false);
        k7qVar.getClass();
        agnVar.getClass();
        y7uVar.getClass();
        this.e = k7qVar;
        this.f = d.a;
        this.g = rfnVar;
        this.h = f7lVar;
        this.i = uolVar;
        this.j = agnVar;
        this.k = y7uVar;
        this.l = l;
        this.m = x3nVar;
        this.n = ydr.a(r7q.a);
        yiq yiqVar = new yiq();
        this.o = yiqVar;
        mm6 r = hld.r(yiqVar, dm6.b);
        this.p = r;
        this.q = new AtomicBoolean(false);
        Continuation continuation = null;
        if (((AtomicBoolean) x3nVar.d).compareAndSet(false, true)) {
            unit = Unit.a;
        } else {
            su4.s(2, null, "RadioVideoClipsNavigator initialized more that once", null);
            unit = null;
        }
        if (unit != null) {
            x97.y(r, null, null, new s1n((x0q) x3nVar.c, continuation, x3nVar, 12), 3);
        }
        zsd.r0(r, new u21(10, (b56) nurVar.b, uohVar.a, new cle(this, continuation, 24)));
        yiqVar.D(new oxo(18, this));
    }

    @Override // defpackage.g4q
    public final void a(c9g c9gVar) {
        this.o.V();
    }

    public final i5u b(s7u s7uVar) {
        y7u y7uVar = this.k;
        v80 v80Var = new v80(y7uVar.b, y7uVar.c, null);
        s7uVar.getClass();
        y1u y1uVar = s7uVar.b;
        x1u x1uVar = y1uVar.b;
        wmn wmnVar = y1uVar.c;
        String str = x1uVar.a;
        AtomicInteger atomicInteger = rwk.b;
        str.getClass();
        return new i5u(x1uVar, v80Var, wmnVar, str);
    }

    @Override // defpackage.g4q
    public final k7q getDescriptor() {
        return this.e;
    }

    @Override // defpackage.g4q
    public final vdr getState() {
        return this.n;
    }

    @Override // defpackage.g4q
    public final void start() {
        agn agnVar = this.j;
        agnVar.getClass();
        rfn rfnVar = this.g;
        rfnVar.getClass();
        agnVar.a.set(rfnVar);
        glp glpVar = new glp(this, null, 7);
        mm6 mm6Var = this.p;
        x97.y(mm6Var, null, null, glpVar, 3);
        ox6.B(this.h.e, mm6Var, new ryp(11, this));
    }
}
