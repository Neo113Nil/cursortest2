package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class mnr implements u0q {
    public final u0q a;
    public final aur b;

    /* JADX WARN: Multi-variable type inference failed */
    public mnr(u0q u0qVar, Function2 function2) {
        this.a = u0qVar;
        this.b = (aur) function2;
    }

    @Override // defpackage.u0q
    public final List b() {
        return this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v1, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        lnr lnrVar;
        int i;
        if (continuation instanceof lnr) {
            lnrVar = (lnr) continuation;
            int i2 = lnrVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lnrVar.l = i2 - Integer.MIN_VALUE;
                Object obj = lnrVar.j;
                nm6 nm6Var = nm6.a;
                i = lnrVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    knr knrVar = new knr(rjcVar, this.b);
                    lnrVar.l = 1;
                    if (this.a.collect(knrVar, lnrVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            }
        }
        lnrVar = new lnr(this, continuation);
        Object obj2 = lnrVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lnrVar.l;
        if (i != 0) {
        }
        rj7.f();
        return null;
    }
}
