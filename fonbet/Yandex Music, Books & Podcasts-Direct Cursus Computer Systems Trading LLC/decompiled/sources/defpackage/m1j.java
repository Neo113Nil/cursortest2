package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class m1j extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ t1f s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1j(t1f t1fVar, int i) {
        super(1);
        this.r = i;
        this.s = t1fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                if (yd5.w(r7wVar)) {
                    return nif.c(r7wVar);
                }
                return nif.c(((o1j) this.s.d).f(new n1j(q1c.e, r1c.a, (Integer) null, f1d.g("Transport failure: ", r7wVar.getMessage()), (String) null, true)));
            default:
                r7w r7wVar2 = (r7w) obj;
                r7wVar2.getClass();
                return nif.c(((o1j) this.s.d).f(new n1j(q1c.e, r1c.a, (Integer) null, f1d.g("Transport failure: ", r7wVar2.getMessage()), (String) null, true)));
        }
    }
}
