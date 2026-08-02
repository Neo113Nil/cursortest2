package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class vtw extends uif implements Function2 {
    public final /* synthetic */ tqn r;
    public final /* synthetic */ long s;
    public final /* synthetic */ wqn t;
    public final /* synthetic */ ikn u;
    public final /* synthetic */ wqn v;
    public final /* synthetic */ wqn w;
    public final /* synthetic */ xqn x;
    public final /* synthetic */ xqn y;
    public final /* synthetic */ xqn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtw(tqn tqnVar, long j, wqn wqnVar, ikn iknVar, wqn wqnVar2, wqn wqnVar3, xqn xqnVar, xqn xqnVar2, xqn xqnVar3) {
        super(2);
        this.r = tqnVar;
        this.s = j;
        this.t = wqnVar;
        this.u = iknVar;
        this.v = wqnVar2;
        this.w = wqnVar3;
        this.x = xqnVar;
        this.y = xqnVar2;
        this.z = xqnVar3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        ikn iknVar = this.u;
        if (intValue == 1) {
            tqn tqnVar = this.r;
            if (tqnVar.a) {
                kac.f("bad zip: zip64 extra repeated");
                return null;
            }
            tqnVar.a = true;
            if (longValue < this.s) {
                kac.f("bad zip: zip64 extra too short");
                return null;
            }
            wqn wqnVar = this.t;
            long j = wqnVar.a;
            if (j == 4294967295L) {
                j = iknVar.o();
            }
            wqnVar.a = j;
            wqn wqnVar2 = this.v;
            wqnVar2.a = wqnVar2.a == 4294967295L ? iknVar.o() : 0L;
            wqn wqnVar3 = this.w;
            wqnVar3.a = wqnVar3.a == 4294967295L ? iknVar.o() : 0L;
        } else if (intValue == 10) {
            if (longValue < 4) {
                kac.f("bad zip: NTFS extra too short");
                return null;
            }
            iknVar.skip(4L);
            o8g.H(iknVar, (int) (longValue - 4), new utw(this.x, iknVar, this.y, this.z));
        }
        return Unit.a;
    }
}
