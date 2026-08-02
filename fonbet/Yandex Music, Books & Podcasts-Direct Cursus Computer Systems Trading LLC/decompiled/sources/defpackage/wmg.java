package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class wmg {
    public final ocn a;
    public final aa2 b;

    public wmg(ocn ocnVar, aa2 aa2Var, jmg jmgVar, umg umgVar) {
        this.a = ocnVar;
        this.b = aa2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        vmg vmgVar;
        int i;
        Object g;
        if (continuation instanceof vmg) {
            vmgVar = (vmg) continuation;
            int i2 = vmgVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vmgVar.l = i2 - Integer.MIN_VALUE;
                Object obj = vmgVar.j;
                nm6 nm6Var = nm6.a;
                i = vmgVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    vmgVar.l = 1;
                    g = this.a.g(vmgVar);
                    if (g == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                return Boolean.valueOf(!(g instanceof t7o));
            }
        }
        vmgVar = new vmg(this, continuation);
        Object obj2 = vmgVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vmgVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        return Boolean.valueOf(!(g instanceof t7o));
    }
}
