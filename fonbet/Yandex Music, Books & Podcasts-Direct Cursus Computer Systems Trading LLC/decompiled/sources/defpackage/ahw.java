package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ahw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ghw b;

    public /* synthetic */ ahw(ghw ghwVar, int i) {
        this.a = i;
        this.b = ghwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(Pair pair, Continuation continuation) {
        zgw zgwVar;
        int i;
        ghw ghwVar;
        ccw ccwVar;
        if (continuation instanceof zgw) {
            zgwVar = (zgw) continuation;
            int i2 = zgwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zgwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = zgwVar.j;
                nm6 nm6Var = nm6.a;
                i = zgwVar.l;
                ghwVar = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) pair.a).booleanValue();
                    boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
                    if (!booleanValue) {
                        ghwVar.j();
                        return Unit.a;
                    }
                    if (booleanValue2 && (ccwVar = (ccw) ghwVar.m.getValue()) != null) {
                        zgwVar.l = 1;
                        if (ccwVar.e(zgwVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!ghwVar.l.get()) {
                    ghwVar.i();
                }
                return Unit.a;
            }
        }
        zgwVar = new zgw(this, continuation);
        Object obj2 = zgwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = zgwVar.l;
        ghwVar = this.b;
        if (i != 0) {
        }
        if (!ghwVar.l.get()) {
        }
        return Unit.a;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                jrc jrcVar = (jrc) obj;
                ssg.a(2, ghw.w, "foreground=" + jrcVar, null);
                v3w.n(jrcVar == jrc.a, this.b.s, null);
                break;
            default:
                p76 p76Var = (p76) obj;
                ssg.a(2, ghw.w, "network=" + p76Var, null);
                v3w.n(p76Var == p76.a, this.b.r, null);
                break;
        }
        return Unit.a;
    }
}
