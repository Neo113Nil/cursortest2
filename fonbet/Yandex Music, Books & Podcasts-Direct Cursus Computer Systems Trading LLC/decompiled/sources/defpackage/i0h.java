package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i0h implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i0h(sdr sdrVar, long j, z2h z2hVar, ges gesVar, yci yciVar, int i) {
        this.a = 2;
        this.c = sdrVar;
        this.b = j;
        this.d = z2hVar;
        this.e = gesVar;
        this.f = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(513);
                v3g.f((u0h) this.c, (oev) this.d, (bci) this.e, (Function0) this.f, this.b, (hq5) obj, R);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(1);
                hyf.g((p0r) this.c, (w5t) this.d, (m0r) this.e, (yci) this.f, this.b, (hq5) obj, R2);
                break;
            default:
                ((Integer) obj2).getClass();
                int R3 = rvf.R(1);
                u7g.t((sdr) this.c, this.b, (z2h) this.d, (ges) this.e, (yci) this.f, (hq5) obj, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i0h(Object obj, Object obj2, Object obj3, Object obj4, long j, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j;
    }
}
