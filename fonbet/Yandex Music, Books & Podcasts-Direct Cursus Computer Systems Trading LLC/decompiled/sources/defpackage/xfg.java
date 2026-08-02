package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class xfg implements rnq, tfg {
    public final oq7 a;
    public mwk b;
    public e73 c;

    public xfg(oq7 oq7Var) {
        oq7Var.getClass();
        this.a = oq7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object h(xfg xfgVar, cg6 cg6Var) {
        wfg wfgVar;
        int i;
        mwk b;
        Object k;
        n7q n7qVar;
        if (cg6Var instanceof wfg) {
            wfgVar = (wfg) cg6Var;
            int i2 = wfgVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wfgVar.n = i2 - Integer.MIN_VALUE;
                Object obj = wfgVar.l;
                nm6 nm6Var = nm6.a;
                i = wfgVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    d6l x = p6g.x((e6l) xfgVar.a.a.c.getValue());
                    b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
                    if (b == null) {
                        Assertions.throwOrSkip(f1d.g("PlayerScreen:Block:", xfgVar.b()), new FailedAssertionException(hrg.q("Block load[", xfgVar.a().a().a, "]: without playable")));
                        return new c73(xfgVar.a());
                    }
                    e73 e73Var = xfgVar.c;
                    mwk mwkVar = xfgVar.b;
                    if (mwkVar != null && mwkVar.equals(b) && e73Var != null && (!(e73Var instanceof c73))) {
                        return e73Var;
                    }
                    ssg.a(3, f1d.g("PlayerScreen:Block:", xfgVar.b()), hrg.q("Block load[", xfgVar.a().a().a, "]: force=false"), null);
                    wfgVar.j = xfgVar;
                    wfgVar.k = b;
                    wfgVar.n = 1;
                    k = xfgVar.k(b, wfgVar);
                    if (k == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mwk mwkVar2 = wfgVar.k;
                    xfg xfgVar2 = wfgVar.j;
                    qgg.h0(obj);
                    b = mwkVar2;
                    xfgVar = xfgVar2;
                    k = obj;
                }
                xfgVar.c = (e73) k;
                xfgVar.b = b;
                return k;
            }
        }
        wfgVar = new wfg(xfgVar, cg6Var);
        Object obj2 = wfgVar.l;
        nm6 nm6Var2 = nm6.a;
        i = wfgVar.n;
        if (i != 0) {
        }
        xfgVar.c = (e73) k;
        xfgVar.b = b;
        return k;
    }

    public abstract String b();

    @Override // defpackage.tfg
    public final Object d(Continuation continuation) {
        return h(this, (cg6) continuation);
    }

    public abstract Object k(mwk mwkVar, cg6 cg6Var);
}
