package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class kj1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ boolean o;
    public Object p;
    public final /* synthetic */ bfu q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj1(bfu bfuVar, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.q = bfuVar;
        this.o = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                kj1 kj1Var = new kj1((mj1) this.q, this.o, continuation, 0);
                kj1Var.n = obj;
                return kj1Var;
            default:
                kj1 kj1Var2 = new kj1((d06) this.q, this.o, continuation, 1);
                kj1Var2.n = obj;
                return kj1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((kj1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        long j;
        int i;
        fj1 fj1Var;
        int i2;
        Object a2;
        long j2;
        yz5 yz5Var;
        int i3;
        int i4 = this.j;
        bfu bfuVar = this.q;
        boolean z = this.o;
        Continuation continuation = null;
        int i5 = 2;
        switch (i4) {
            case 0:
                mj1 mj1Var = (mj1) bfuVar;
                xdr xdrVar = mj1Var.s;
                mm6 mm6Var = (mm6) this.n;
                nm6 nm6Var = nm6.a;
                int i6 = this.m;
                if (i6 == 0) {
                    qgg.h0(obj);
                    gis.a.getClass();
                    rdi.a.getClass();
                    long a3 = rdi.a();
                    this.n = mm6Var;
                    this.p = null;
                    this.k = 0;
                    this.l = a3;
                    this.m = 1;
                    a = mj1.a(mj1Var, z, this);
                    if (a != nm6Var) {
                        j = a3;
                    }
                    break;
                } else if (i6 == 1) {
                    j = this.l;
                    qgg.h0(obj);
                    a = obj;
                } else if (i6 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i2 = this.k;
                    fj1Var = (fj1) this.p;
                    qgg.h0(obj);
                    if (i2 != 0 || !(xdrVar.getValue() instanceof aj1)) {
                        xdrVar.l(fj1Var);
                    }
                    if (z && (fj1Var instanceof aj1)) {
                        x97.y(mm6Var, null, null, new ij1(mj1Var, continuation, i5), 3);
                    }
                    xdr xdrVar2 = mj1Var.z;
                    Boolean bool = Boolean.FALSE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                    break;
                }
                kis kisVar = new kis((fj1) a, fis.b(j), null);
                fj1 fj1Var2 = (fj1) kisVar.a;
                boolean z2 = fj1Var2 instanceof zi1;
                i = z2 ? 2000 : 200;
                msa msaVar = nsa.b;
                long M = yd5.M(i, ssa.MILLISECONDS);
                long j3 = kisVar.b;
                long n = nsa.n(M, j3);
                this.n = mm6Var;
                this.p = fj1Var2;
                this.l = j3;
                this.k = z2 ? 1 : 0;
                this.m = 2;
                if (y2x.p(n, this) != nm6Var) {
                    fj1Var = fj1Var2;
                    i2 = z2 ? 1 : 0;
                    if (i2 != 0) {
                    }
                    xdrVar.l(fj1Var);
                    if (z) {
                        x97.y(mm6Var, null, null, new ij1(mj1Var, continuation, i5), 3);
                    }
                    xdr xdrVar22 = mj1Var.z;
                    Boolean bool2 = Boolean.FALSE;
                    xdrVar22.getClass();
                    xdrVar22.m(null, bool2);
                }
            default:
                d06 d06Var = (d06) bfuVar;
                xdr xdrVar3 = d06Var.q;
                mm6 mm6Var2 = (mm6) this.n;
                nm6 nm6Var2 = nm6.a;
                int i7 = this.m;
                if (i7 == 0) {
                    qgg.h0(obj);
                    gis.a.getClass();
                    rdi.a.getClass();
                    long a4 = rdi.a();
                    this.n = mm6Var2;
                    this.p = null;
                    this.k = 0;
                    this.l = a4;
                    this.m = 1;
                    a2 = d06.a(d06Var, z, this);
                    if (a2 != nm6Var2) {
                        j2 = a4;
                    }
                    break;
                } else if (i7 == 1) {
                    j2 = this.l;
                    qgg.h0(obj);
                    a2 = obj;
                } else if (i7 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    i3 = this.k;
                    yz5Var = (yz5) this.p;
                    qgg.h0(obj);
                    if (i3 != 0 || !(xdrVar3.getValue() instanceof vz5)) {
                        xdrVar3.l(yz5Var);
                    }
                    if (z && (yz5Var instanceof vz5)) {
                        x97.y(mm6Var2, null, null, new b06(d06Var, continuation, i5), 3);
                    }
                    xdr xdrVar4 = d06Var.s;
                    Boolean bool3 = Boolean.FALSE;
                    xdrVar4.getClass();
                    xdrVar4.m(null, bool3);
                    break;
                }
                kis kisVar2 = new kis((yz5) a2, fis.b(j2), null);
                yz5 yz5Var2 = (yz5) kisVar2.a;
                boolean z3 = yz5Var2 instanceof uz5;
                i = z3 ? 2000 : 200;
                msa msaVar2 = nsa.b;
                long M2 = yd5.M(i, ssa.MILLISECONDS);
                long j4 = kisVar2.b;
                long n2 = nsa.n(M2, j4);
                this.n = mm6Var2;
                this.p = yz5Var2;
                this.l = j4;
                this.k = z3 ? 1 : 0;
                this.m = 2;
                if (y2x.p(n2, this) != nm6Var2) {
                    yz5Var = yz5Var2;
                    i3 = z3 ? 1 : 0;
                    if (i3 != 0) {
                    }
                    xdrVar3.l(yz5Var);
                    if (z) {
                        x97.y(mm6Var2, null, null, new b06(d06Var, continuation, i5), 3);
                    }
                    xdr xdrVar42 = d06Var.s;
                    Boolean bool32 = Boolean.FALSE;
                    xdrVar42.getClass();
                    xdrVar42.m(null, bool32);
                }
        }
        return Unit.a;
    }
}
