package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class po1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ po1(float f, Function0 function0, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = function0;
        this.d = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair;
        float d;
        long j;
        switch (this.a) {
            case 0:
                Function1 function1 = (Function1) this.c;
                gar garVar = (gar) this.d;
                opf opfVar = (opf) obj;
                opfVar.getClass();
                opfVar.a();
                ou3 ou3Var = opfVar.a;
                long j2 = ((enj) function1.invoke(opfVar)).a;
                int ordinal = garVar.ordinal();
                if (ordinal == 0) {
                    int ordinal2 = opfVar.getLayoutDirection().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        j2 = enj.a(nmq.d(ou3Var.e()) - enj.e(j2), 0.0f, 2, j2);
                    }
                    jpa.D0(opfVar, d85.b, opfVar.n0(this.b), j2, 0.0f, null, 8, 56);
                    return Unit.a;
                }
                if (ordinal == 1) {
                    int ordinal3 = opfVar.getLayoutDirection().ordinal();
                    if (ordinal3 == 0) {
                        j2 = enj.a(nmq.d(ou3Var.e()) - enj.e(j2), 0.0f, 2, j2);
                    } else if (ordinal3 != 1) {
                        b6e.s();
                    }
                    jpa.D0(opfVar, d85.b, opfVar.n0(this.b), j2, 0.0f, null, 8, 56);
                    return Unit.a;
                }
                b6e.s();
                return null;
            case 1:
                g4c[] g4cVarArr = (g4c[]) this.c;
                cma cmaVar = (cma) this.d;
                opf opfVar2 = (opf) obj;
                opfVar2.getClass();
                opfVar2.a();
                ou3 ou3Var2 = opfVar2.a;
                for (g4c g4cVar : g4cVarArr) {
                    long e = ou3Var2.e();
                    int ordinal4 = g4cVar.ordinal();
                    if (ordinal4 == 0) {
                        pair = new Pair(new enj(0L), new enj(swf.i(nmq.d(e), 0.0f)));
                    } else if (ordinal4 == 1) {
                        pair = new Pair(new enj(swf.i(nmq.d(e), 0.0f)), new enj(0L));
                    } else if (ordinal4 == 2) {
                        pair = new Pair(new enj(swf.i(0.0f, nmq.b(e))), new enj(0L));
                    } else {
                        if (ordinal4 != 3) {
                            b6e.s();
                            return null;
                        }
                        pair = new Pair(new enj(0L), new enj(swf.i(0.0f, nmq.b(e))));
                    }
                    long j3 = ((enj) pair.a).a;
                    long j4 = ((enj) pair.b).a;
                    float n0 = opfVar2.n0(cmaVar != null ? cmaVar.a : this.b);
                    int ordinal5 = g4cVar.ordinal();
                    if (ordinal5 == 0 || ordinal5 == 1) {
                        d = nmq.d(ou3Var2.e());
                    } else {
                        if (ordinal5 != 2 && ordinal5 != 3) {
                            b6e.s();
                            return null;
                        }
                        d = nmq.b(ou3Var2.e());
                    }
                    jpa.A0(opfVar2, y9w.L(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(d85.m)), new Pair(Float.valueOf(n0 / d), new d85(d85.b))}, j3, j4), 0L, ou3Var2.e(), 0.0f, null, null, 6, 58);
                }
                return Unit.a;
            case 2:
                Function0 function0 = (Function0) this.c;
                aqi aqiVar = (aqi) this.d;
                ((wof) obj).getClass();
                float j5 = ((int) (r3.j() & 4294967295L)) - this.b;
                if (j5 <= 0.0f && !Intrinsics.a(j5, (Float) aqiVar.getValue())) {
                    function0.invoke();
                    aqiVar.setValue(Float.valueOf(j5));
                }
                return Unit.a;
            default:
                Function0 function02 = (Function0) this.c;
                Function0 function03 = (Function0) this.d;
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                float n02 = jpaVar.n0(this.b);
                long floatToRawIntBits = (Float.floatToRawIntBits(n02) << 32) | (Float.floatToRawIntBits(n02) & 4294967295L);
                jpa.u(jpaVar, ((d85) function02.invoke()).a, 0L, floatToRawIntBits, 246);
                float max = Math.max(0.0f, ((Number) function03.invoke()).floatValue() * nmq.d(jpaVar.e()));
                if (max > 0.0f) {
                    nh0 a = ph0.a();
                    ynn d2 = ywf.d(0L, jpaVar.e());
                    float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                    eak.a(a, new jgo(d2.a, d2.b, d2.c, d2.d, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2));
                    nsh q0 = jpaVar.q0();
                    long B = q0.B();
                    q0.s().r();
                    try {
                        ((nsh) ((xzi) q0.b).a).s().h(a);
                        j = B;
                    } catch (Throwable th) {
                        th = th;
                        j = B;
                    }
                    try {
                        jpa.B(jpaVar, d85.b(d85.f, 0.08f, 0.0f, 0.0f, 0.0f, 14), 0L, a4g.i(max, nmq.b(jpaVar.e())), 0.0f, null, 0, 122);
                        vz1.A(q0, j);
                    } catch (Throwable th2) {
                        th = th2;
                        vz1.A(q0, j);
                        throw th;
                    }
                }
                return Unit.a;
        }
    }

    public /* synthetic */ po1(Object obj, Comparable comparable, float f, int i) {
        this.a = i;
        this.c = obj;
        this.d = comparable;
        this.b = f;
    }
}
