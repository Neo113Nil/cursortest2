package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l3k extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ o3k s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3k(o3k o3kVar, int i) {
        super(1);
        this.r = i;
        this.s = o3kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y2k y2kVar;
        switch (this.r) {
            case 0:
                cuf cufVar = (cuf) obj;
                o3k o3kVar = this.s;
                b2r G = wyf.G();
                Function1 e = G != null ? G.e() : null;
                b2r Q = wyf.Q(G);
                try {
                    cufVar.a(o3kVar.e);
                    wyf.b0(G, Q, e);
                    return Unit.a;
                } catch (Throwable th) {
                    wyf.b0(G, Q, e);
                    throw th;
                }
            default:
                float floatValue = ((Number) obj).floatValue();
                o3k o3kVar2 = this.s;
                long k = uwf.k(o3kVar2);
                float f = o3kVar2.i + floatValue;
                long c = eeh.c(f);
                o3kVar2.i = f - c;
                if (Math.abs(floatValue) >= 1.0E-4f) {
                    long j = k + c;
                    long f2 = yhn.f(j, o3kVar2.h, o3kVar2.g);
                    boolean z = j != f2;
                    long j2 = f2 - k;
                    float f3 = j2;
                    o3kVar2.j = f3;
                    if (Math.abs(j2) != 0) {
                        o3kVar2.H.setValue(Boolean.valueOf(f3 > 0.0f));
                        o3kVar2.I.setValue(Boolean.valueOf(f3 < 0.0f));
                    }
                    int i = (int) j2;
                    int i2 = -i;
                    y2k f4 = ((y2k) o3kVar2.p.getValue()).f(i2);
                    if (f4 != null && (y2kVar = o3kVar2.b) != null) {
                        y2k f5 = y2kVar.f(i2);
                        if (f5 != null) {
                            o3kVar2.b = f5;
                        } else {
                            f4 = null;
                        }
                    }
                    if (f4 != null) {
                        o3kVar2.h(f4, o3kVar2.a, true);
                        o3kVar2.D.setValue(Unit.a);
                    } else {
                        evj evjVar = o3kVar2.d;
                        o3k o3kVar3 = (o3k) evjVar.c;
                        t6k t6kVar = (t6k) evjVar.b;
                        t6kVar.h(t6kVar.e() + (o3kVar3.p() != 0 ? i / o3kVar3.p() : 0.0f));
                        mpf mpfVar = (mpf) o3kVar2.z.getValue();
                        if (mpfVar != null) {
                            mpfVar.l();
                        }
                    }
                    floatValue = (z ? Long.valueOf(j2) : Float.valueOf(floatValue)).floatValue();
                }
                return Float.valueOf(floatValue);
        }
    }
}
