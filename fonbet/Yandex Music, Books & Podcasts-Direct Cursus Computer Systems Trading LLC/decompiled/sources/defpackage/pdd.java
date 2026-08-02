package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class pdd implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jac b;

    public /* synthetic */ pdd(jac jacVar, int i) {
        this.a = i;
        this.b = jacVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        qec qecVar;
        qec qecVar2;
        qec qecVar3;
        switch (this.a) {
            case 0:
                dgd dgdVar = (dgd) obj;
                jac jacVar = this.b;
                if (dgdVar instanceof bgd) {
                    ced cedVar = ((bgd) dgdVar).c;
                    vqi vqiVar = (vqi) jacVar.f;
                    if (vqiVar != null) {
                        vqiVar.V();
                    }
                    vqi z = ((yiq) jacVar.a).z();
                    jacVar.f = z;
                    mm6 r = hld.r(z, dm6.b());
                    jacVar.e = cedVar;
                    xdr xdrVar = cedVar.u;
                    rea reaVar = new rea(13);
                    xdrVar.getClass();
                    ox6.B(zsd.K(new n5(xdrVar, reaVar, 1000L, (Continuation) null, 2)), r, new pdd(jacVar, 1));
                    rvh rvhVar = (rvh) ((jyr) jacVar.b).getValue();
                    rvhVar.d = cedVar.w;
                    rvhVar.a();
                } else {
                    if (!(dgdVar instanceof cgd)) {
                        b6e.s();
                        return null;
                    }
                    jacVar.n();
                }
                return Unit.a;
            default:
                vhd vhdVar = (vhd) obj;
                jac jacVar2 = this.b;
                vhd vhdVar2 = (vhd) jacVar2.d;
                jacVar2.d = vhdVar;
                long j = vhdVar2.e;
                long j2 = vhdVar.e;
                String str = vhdVar.a;
                if (Math.abs(j - j2) > 2000 && (qecVar3 = (qec) jacVar2.g) != null) {
                    zfd zfdVar = (zfd) qecVar3.b;
                    tnl tnlVar = zfdVar.d;
                    zfdVar.i = false;
                    zfd.z(zfdVar, null, tnl.b, false, 13);
                    zfd.z(zfdVar, null, tnlVar, false, 13);
                }
                tnl tnlVar2 = vhdVar2.d;
                tnl tnlVar3 = vhdVar.d;
                if (tnlVar2 != tnlVar3 && (qecVar2 = (qec) jacVar2.g) != null) {
                    str.getClass();
                    zfd.z((zfd) qecVar2.b, str, tnlVar3, false, 12);
                }
                boolean z2 = vhdVar2.c;
                boolean z3 = vhdVar.c;
                if (z2 != z3 && (qecVar = (qec) jacVar2.g) != null) {
                    str.getClass();
                    zfd.z((zfd) qecVar.b, str, null, z3, 10);
                }
                return Unit.a;
        }
    }
}
