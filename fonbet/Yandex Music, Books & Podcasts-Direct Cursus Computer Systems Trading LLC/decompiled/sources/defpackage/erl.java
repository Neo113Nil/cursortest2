package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class erl implements pjc {
    public final /* synthetic */ qm a;
    public final /* synthetic */ n7q b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ grl d;
    public final /* synthetic */ j1g e;
    public final /* synthetic */ p5n f;
    public final /* synthetic */ qpl g;
    public final /* synthetic */ h4q h;
    public final /* synthetic */ z3h i;
    public final /* synthetic */ boolean j;

    public erl(qm qmVar, n7q n7qVar, boolean z, grl grlVar, j1g j1gVar, p5n p5nVar, qpl qplVar, h4q h4qVar, z3h z3hVar, boolean z2) {
        this.a = qmVar;
        this.b = n7qVar;
        this.c = z;
        this.d = grlVar;
        this.e = j1gVar;
        this.f = p5nVar;
        this.g = qplVar;
        this.h = h4qVar;
        this.i = z3hVar;
        this.j = z2;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new drl(rjcVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
