package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zf0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf0(long j, int i) {
        super(1);
        this.r = i;
        this.s = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                np3 np3Var = (np3) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (np3Var.a.e() >> 32)) / 2.0f;
                return np3Var.b(new yf0(intBitsToFloat, 0, qld.w(np3Var, intBitsToFloat), new d43(this.s, 5)));
            case 1:
                ((jfp) obj).o(pep.c, new oep(xrd.a, this.s, nep.b, true));
                return Unit.a;
            case 2:
                vbl vblVar = (vbl) obj;
                vblVar.getClass();
                vblVar.a = new kes(this.s);
                return Unit.a;
            case 3:
                ieg iegVar = (ieg) obj;
                iegVar.getClass();
                iegVar.a = this.s;
                return Unit.a;
            case 4:
                ((acl) obj).getClass();
                return Unit.a;
            case 5:
                Long l = (Long) obj;
                if (l != null) {
                    long j = this.s;
                    if (nsa.m(j)) {
                        return Long.valueOf(nsa.f(j) + l.longValue());
                    }
                    xq0.x("Cannot call addTime with a negative duration");
                } else {
                    xq0.q("Start the timer with startTimer before calling addTime");
                }
                return null;
            default:
                ((acl) obj).getClass();
                return Unit.a;
        }
    }
}
