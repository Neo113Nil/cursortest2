package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class yu6 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ kv6 b;

    public /* synthetic */ yu6(kv6 kv6Var, int i) {
        this.a = i;
        this.b = kv6Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                eps epsVar = this.b.l;
                epsVar.getClass();
                mal.a();
                lve lveVar = (lve) epsVar.d;
                if (lveVar != null) {
                    lveVar.a.b.l(floatValue, h4c.CROSSFADING_PLAYER);
                    if (lveVar.a.b.j == 0.0f && lveVar.b == null) {
                        ssg.a(3, "InternalPlayerManager", "stop idle player as it is muted", null);
                        lveVar.a.a.stop();
                        lveVar.a.a.y();
                    }
                }
                if (floatValue == 1.0f && ((Number) this.b.t.getValue()).floatValue() == 1.0f) {
                    this.b.v = false;
                }
                break;
            case 1:
                float floatValue2 = ((Number) obj).floatValue();
                kv6 kv6Var = this.b;
                eps epsVar2 = kv6Var.l;
                epsVar2.getClass();
                mal.a();
                epsVar2.h().a.b.l(floatValue2, h4c.CROSSFADING_PLAYER);
                if (floatValue2 == 1.0f && ((Number) kv6Var.u.getValue()).floatValue() == 1.0f) {
                    kv6Var.v = false;
                }
                break;
            default:
                vat vatVar = (vat) obj;
                u2q u2qVar = (u2q) vatVar.a;
                u2q u2qVar2 = (u2q) vatVar.b;
                boolean booleanValue = ((Boolean) vatVar.c).booleanValue();
                kv6 kv6Var2 = this.b;
                rjq rjqVar = kv6Var2.o;
                if (booleanValue) {
                    ssg.a(3, "CrossfadingExoPlayerImpl", "scheduling crossfade", null);
                    if (u2qVar2 != null) {
                        rjqVar.g();
                        x97.y(kv6Var2.p, null, null, new v3(kv6Var2, u2qVar2, u2qVar, null, 29), 3);
                    }
                } else {
                    ssg.a(3, "CrossfadingExoPlayerImpl", "unscheduling crossfade", null);
                    kv6Var2.s = null;
                    rjqVar.V();
                }
                break;
        }
        return Unit.a;
    }
}
