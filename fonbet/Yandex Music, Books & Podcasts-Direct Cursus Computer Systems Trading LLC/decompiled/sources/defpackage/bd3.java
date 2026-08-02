package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bd3 extends uif implements Function1 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ ai3 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ amr y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd3(boolean z, ai3 ai3Var, long j, float f, float f2, long j2, long j3, amr amrVar) {
        super(1);
        this.r = z;
        this.s = ai3Var;
        this.t = j;
        this.u = f;
        this.v = f2;
        this.w = j2;
        this.x = j3;
        this.y = amrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        opf opfVar = (opf) obj;
        opfVar.a();
        ou3 ou3Var = opfVar.a;
        if (this.r) {
            jpa.P(opfVar, this.s, 0L, 0L, this.t, null, 246);
        } else {
            long j = this.t;
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float f = this.u;
            if (intBitsToFloat < f) {
                float f2 = this.v;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (ou3Var.e() >> 32));
                float f3 = this.v;
                float f4 = intBitsToFloat2 - f3;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (ou3Var.e() & 4294967295L)) - f3;
                ai3 ai3Var = this.s;
                long j2 = this.t;
                nsh nshVar = ou3Var.b;
                long B = nshVar.B();
                nshVar.s().r();
                try {
                    ((xzi) nshVar.b).W(f2, f2, f4, intBitsToFloat3, 0);
                    jpa.P(opfVar, ai3Var, 0L, 0L, j2, null, 246);
                } finally {
                    vz1.A(nshVar, B);
                }
            } else {
                jpa.P(opfVar, this.s, this.w, this.x, c3x.T(f, j), this.y, 208);
            }
        }
        return Unit.a;
    }
}
