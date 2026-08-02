package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d1s extends uif implements Function1 {
    public final /* synthetic */ ksk r;
    public final /* synthetic */ ksk s;
    public final /* synthetic */ mfh t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ Integer w;
    public final /* synthetic */ Integer x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1s(ksk kskVar, ksk kskVar2, mfh mfhVar, int i, int i2, Integer num, Integer num2) {
        super(1);
        this.r = kskVar;
        this.s = kskVar2;
        this.t = mfhVar;
        this.u = i;
        this.v = i2;
        this.w = num;
        this.x = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        ksk kskVar = this.s;
        int i = this.v;
        ksk kskVar2 = this.r;
        if (kskVar2 != null && kskVar != null) {
            Integer num = this.w;
            num.getClass();
            int intValue = num.intValue();
            Integer num2 = this.x;
            num2.getClass();
            int intValue2 = num2.intValue();
            float f = intValue == intValue2 ? f1s.c : f1s.d;
            mfh mfhVar = this.t;
            int L = mfhVar.L(r1s.a) + mfhVar.L(f);
            int s0 = (mfhVar.s0(f1s.e) + kskVar.b) - intValue;
            int i2 = kskVar2.a;
            int i3 = this.u;
            int i4 = (i - intValue2) - L;
            jsk.g(jskVar, kskVar2, (i3 - i2) / 2, i4);
            jsk.g(jskVar, kskVar, (i3 - kskVar.a) / 2, i4 - s0);
        } else if (kskVar2 != null) {
            float f2 = f1s.a;
            jsk.g(jskVar, kskVar2, 0, (i - kskVar2.b) / 2);
        } else if (kskVar != null) {
            float f3 = f1s.a;
            jsk.g(jskVar, kskVar, 0, (i - kskVar.b) / 2);
        }
        return Unit.a;
    }
}
