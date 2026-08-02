package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ouf extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ puf s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ouf(puf pufVar, int i) {
        super(1);
        this.r = i;
        this.s = pufVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ttf ttfVar = (ttf) this.s.o.invoke();
                int a = ttfVar.a();
                int i = 0;
                while (true) {
                    if (i >= a) {
                        i = -1;
                    } else if (!Intrinsics.d(ttfVar.e(i), obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Number) obj).intValue();
                puf pufVar = this.s;
                ttf ttfVar2 = (ttf) pufVar.o.invoke();
                if (intValue < 0 || intValue >= ttfVar2.a()) {
                    StringBuilder q = k5r.q(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    q.append(ttfVar2.a());
                    q.append(')');
                    vme.a(q.toString());
                }
                x97.y(pufVar.G0(), null, null, new dv0(pufVar, intValue, null, 4), 3);
                return Boolean.TRUE;
        }
    }
}
