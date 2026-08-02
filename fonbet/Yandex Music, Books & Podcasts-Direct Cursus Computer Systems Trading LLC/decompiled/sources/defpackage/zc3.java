package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zc3 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc3(int i, long j, long j2, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.u = obj;
        this.s = j;
        this.t = j2;
        this.v = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                opf opfVar = (opf) obj;
                opfVar.a();
                jpa.A0(opfVar, (ai3) this.u, this.s, this.t, 0.0f, (kpa) this.v, null, 0, 104);
                break;
            default:
                jsk jskVar = (jsk) obj;
                ksk kskVar = (ksk) this.u;
                long j = this.s;
                long j2 = this.t;
                lma lmaVar = (lma) this.v;
                jskVar.getClass();
                jsk.a(jskVar, kskVar);
                kskVar.r0(wpe.d(((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L), kskVar.e), 0.0f, lmaVar);
                break;
        }
        return Unit.a;
    }
}
