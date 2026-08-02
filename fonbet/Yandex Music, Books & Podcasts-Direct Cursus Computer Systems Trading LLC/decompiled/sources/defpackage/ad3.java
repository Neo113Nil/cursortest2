package defpackage;

import android.text.Layout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ad3 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad3(long j, float[] fArr, vqn vqnVar, uqn uqnVar) {
        super(1);
        this.r = 1;
        this.s = j;
        this.t = fArr;
        this.u = vqnVar;
        this.v = uqnVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        float f2;
        ou3 ou3Var;
        float[] fArr;
        ih0 ih0Var;
        int i;
        boolean z;
        float a;
        float a2;
        nsh nshVar;
        long j;
        switch (this.r) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.a();
                ynn ynnVar = (ynn) this.t;
                float f3 = ynnVar.a;
                float f4 = ynnVar.b;
                xqn xqnVar = (xqn) this.u;
                long j2 = this.s;
                m85 m85Var = (m85) this.v;
                ou3 ou3Var2 = opfVar.a;
                ((xzi) ou3Var2.b.b).m0(f3, f4);
                try {
                    ou3Var = ou3Var2;
                    try {
                        jpa.j0(opfVar, (yg0) xqnVar.a, 0L, j2, 0L, 0L, 0.0f, m85Var, 0, 890);
                        ((xzi) ou3Var.b.b).m0(-f3, -f4);
                        return Unit.a;
                    } catch (Throwable th) {
                        th = th;
                        f = f3;
                        f2 = f4;
                        ((xzi) ou3Var.b.b).m0(-f, -f2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    f = f3;
                    f2 = f4;
                    ou3Var = ou3Var2;
                }
            case 1:
                t5k t5kVar = (t5k) obj;
                float[] fArr2 = (float[]) this.t;
                vqn vqnVar = (vqn) this.u;
                uqn uqnVar = (uqn) this.v;
                int i2 = t5kVar.b;
                ih0 ih0Var2 = t5kVar.a;
                int i3 = t5kVar.c;
                long j3 = this.s;
                int e = i2 > rds.e(j3) ? t5kVar.b : rds.e(j3);
                if (i3 >= rds.d(j3)) {
                    i3 = rds.d(j3);
                }
                long P = y5g.P(t5kVar.d(e), t5kVar.d(i3));
                int i4 = vqnVar.a;
                ads adsVar = (ads) ih0Var2.d;
                int e2 = rds.e(P);
                int d = rds.d(P);
                Layout layout = adsVar.f;
                int length = layout.getText().length();
                if (e2 < 0) {
                    tme.a("startOffset must be > 0");
                }
                if (e2 >= length) {
                    tme.a("startOffset must be less than text length");
                }
                if (d <= e2) {
                    tme.a("endOffset must be greater than startOffset");
                }
                if (d > length) {
                    tme.a("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (d - e2) * 4) {
                    tme.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(e2);
                int lineForOffset2 = layout.getLineForOffset(d - 1);
                f3e f3eVar = new f3e(adsVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int i5 = i4;
                        int f5 = adsVar.f(lineForOffset);
                        int max = Math.max(e2, lineStart);
                        int min = Math.min(d, f5);
                        float g = adsVar.g(lineForOffset);
                        float e3 = adsVar.e(lineForOffset);
                        fArr = fArr2;
                        ads adsVar2 = adsVar;
                        ih0Var = ih0Var2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i6 = max;
                        int i7 = i5;
                        while (i6 < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z3 || isRtlCharAt) {
                                i = min;
                                if (z3 && isRtlCharAt) {
                                    z2 = false;
                                    float a3 = f3eVar.a(i6, false, false, false);
                                    z = z3;
                                    a = f3eVar.a(i6 + 1, true, true, false);
                                    a2 = a3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !isRtlCharAt) {
                                        a = f3eVar.a(i6, false, false, false);
                                        a2 = f3eVar.a(i6 + 1, true, true, false);
                                    } else {
                                        a2 = f3eVar.a(i6, false, false, true);
                                        a = f3eVar.a(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i7] = a;
                                fArr[i7 + 1] = g;
                                fArr[i7 + 2] = a2;
                                fArr[i7 + 3] = e3;
                                i7 += 4;
                                i6++;
                                z3 = z;
                                min = i;
                            } else {
                                i = min;
                                a = f3eVar.a(i6, z2, z2, true);
                                z = z3;
                                a2 = f3eVar.a(i6 + 1, true, true, true);
                            }
                            z2 = false;
                            fArr[i7] = a;
                            fArr[i7 + 1] = g;
                            fArr[i7 + 2] = a2;
                            fArr[i7 + 3] = e3;
                            i7 += 4;
                            i6++;
                            z3 = z;
                            min = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            i4 = i7;
                            fArr2 = fArr;
                            adsVar = adsVar2;
                            ih0Var2 = ih0Var;
                        }
                    }
                } else {
                    fArr = fArr2;
                    ih0Var = ih0Var2;
                }
                int c = (rds.c(P) * 4) + vqnVar.a;
                for (int i8 = vqnVar.a; i8 < c; i8 += 4) {
                    int i9 = i8 + 1;
                    float f6 = fArr[i9];
                    float f7 = uqnVar.a;
                    fArr[i9] = f6 + f7;
                    int i10 = i8 + 3;
                    fArr[i10] = fArr[i10] + f7;
                }
                vqnVar.a = c;
                uqnVar.a = ih0Var.b() + uqnVar.a;
                return Unit.a;
            default:
                jpa jpaVar = (jpa) obj;
                d1n d1nVar = (d1n) this.t;
                float a4 = d1nVar.a() / d1nVar.g.e();
                float max2 = (Math.max(Math.min(1.0f, a4) - 0.4f, 0.0f) * 5) / 3;
                float abs = Math.abs(a4) - 1.0f;
                float f8 = abs >= 0.0f ? abs : 0.0f;
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                float pow = (((0.4f * max2) - 0.25f) + (f8 - (((float) Math.pow(f8, 2)) / 4))) * 0.5f;
                float f9 = 360;
                float f10 = pow * f9;
                float f11 = ((0.8f * max2) + pow) * f9;
                float min2 = Math.min(1.0f, max2);
                yz0 yz0Var = new yz0();
                yz0Var.a = f11;
                yz0Var.b = min2;
                float floatValue = ((Number) ((sdr) this.u).getValue()).floatValue();
                long j4 = this.s;
                eak eakVar = (eak) this.v;
                long y0 = jpaVar.y0();
                nsh q0 = jpaVar.q0();
                long B = q0.B();
                q0.s().r();
                try {
                    ((xzi) q0.b).e0(pow, y0);
                    float n0 = jpaVar.n0(z0n.c);
                    float f12 = z0n.d;
                    float n02 = (jpaVar.n0(f12) / 2.0f) + n0;
                    ynn ynnVar2 = new ynn(enj.e(a4g.y(jpaVar.e())) - n02, enj.f(a4g.y(jpaVar.e())) - n02, enj.e(a4g.y(jpaVar.e())) + n02, enj.f(a4g.y(jpaVar.e())) + n02);
                    nshVar = q0;
                    try {
                        jpaVar.V(j4, f10, f11 - f10, false, ynnVar2.f(), ynnVar2.e(), (r26 & 64) != 0 ? 1.0f : floatValue, (r26 & 128) != 0 ? dbc.a : new amr(jpaVar.n0(f12), 0.0f, 2, 0, 26));
                        z0n.c(jpaVar, eakVar, ynnVar2, j4, floatValue, yz0Var);
                        vz1.A(nshVar, B);
                        return Unit.a;
                    } catch (Throwable th3) {
                        th = th3;
                        j = B;
                        vz1.A(nshVar, j);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    nshVar = q0;
                    j = B;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad3(Object obj, Object obj2, long j, Object obj3, int i) {
        super(1);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.s = j;
        this.v = obj3;
    }
}
