package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class drl implements rjc {
    public final /* synthetic */ rjc a;
    public final /* synthetic */ n7q b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ grl d;
    public final /* synthetic */ j1g e;
    public final /* synthetic */ p5n f;
    public final /* synthetic */ qpl g;
    public final /* synthetic */ h4q h;
    public final /* synthetic */ z3h i;
    public final /* synthetic */ boolean j;

    public drl(rjc rjcVar, n7q n7qVar, boolean z, grl grlVar, j1g j1gVar, p5n p5nVar, qpl qplVar, h4q h4qVar, z3h z3hVar, boolean z2) {
        this.a = rjcVar;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        crl crlVar;
        int i;
        grl grlVar = this.d;
        xdr xdrVar = grlVar.x;
        jkl jklVar = grlVar.r;
        if (continuation instanceof crl) {
            crlVar = (crl) continuation;
            int i2 = crlVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                crlVar.k = i2 - Integer.MIN_VALUE;
                Object obj2 = crlVar.j;
                nm6 nm6Var = nm6.a;
                i = crlVar.k;
                if (i != 0) {
                    qgg.h0(obj2);
                    bdn bdnVar = (bdn) obj;
                    n7q n7qVar = this.b;
                    n7qVar.getClass();
                    jklVar.getClass();
                    qan qanVar = (qan) wdg.A(n7qVar, new zks(this.c, jklVar, 1));
                    n1g n1gVar = (n1g) dag.p(n7qVar.b(), new hjp(this.e));
                    mj2 mj2Var = (mj2) wdg.A(n7qVar, e88.h);
                    jklVar.getClass();
                    jklVar.getClass();
                    pt0 pt0Var = new pt0();
                    pt0Var.a = jklVar;
                    yi6 yi6Var = yi6.b;
                    xi6 xi6Var = xi6.a;
                    pt0Var.b = new zi6(yi6Var, xi6Var, xi6Var, false);
                    zi6 zi6Var = (zi6) wdg.A(n7qVar, pt0Var);
                    float f = this.h.a;
                    xgl xglVar = xgl.b;
                    if (f != 1.0f) {
                        xgl xglVar2 = xgl.c;
                        if (f != 1.25f) {
                            xglVar2 = xgl.d;
                            if (f != 1.5f) {
                                xglVar2 = xgl.e;
                                if (f != 2.0f) {
                                    su4.s(2, null, "Unknown playback speed " + f, null);
                                }
                            }
                        }
                        xglVar = xglVar2;
                    }
                    z3h z3hVar = this.i;
                    boolean z = z3hVar != null;
                    xgl xglVar3 = xglVar;
                    p5n p5nVar = this.f;
                    p5nVar.getClass();
                    qpl qplVar = this.g;
                    qplVar.getClass();
                    rnl rnlVar = new rnl(bdnVar, qanVar, n1gVar, mj2Var, zi6Var, (dtp) wdg.A(n7qVar, new v97(p5nVar, qplVar, jklVar, xglVar3, z, this.j)), this.j ? z3hVar : null);
                    if (!bdnVar.d && xdrVar.getValue() == evo.b) {
                        evo evoVar = evo.a;
                        xdrVar.getClass();
                        xdrVar.m(null, evoVar);
                    }
                    crlVar.k = 1;
                    if (this.a.emit(rnlVar, crlVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        crlVar = new crl(this, continuation);
        Object obj22 = crlVar.j;
        nm6 nm6Var2 = nm6.a;
        i = crlVar.k;
        if (i != 0) {
        }
        return Unit.a;
    }
}
