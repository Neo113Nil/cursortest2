package defpackage;

import com.yandex.plus.pay.a;
import com.yandex.plus.pay.api.exception.PlusPayUnexpectedException;

/* loaded from: classes4.dex */
public final class cfe {
    public static final long b;
    public final a a;

    static {
        msa msaVar = nsa.b;
        b = yd5.M(30, ssa.SECONDS);
    }

    public cfe(a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        bfe bfeVar;
        int i;
        Object obj;
        try {
            if (cg6Var instanceof bfe) {
                bfeVar = (bfe) cg6Var;
                int i2 = bfeVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bfeVar.l = i2 - Integer.MIN_VALUE;
                    Object obj2 = bfeVar.j;
                    nm6 nm6Var = nm6.a;
                    i = bfeVar.l;
                    obj = kfe.a;
                    if (i != 0) {
                        qgg.h0(obj2);
                        long j = b;
                        jmd jmdVar = new jmd(this, null, 4);
                        bfeVar.l = 1;
                        obj2 = tyf.K(j, jmdVar, bfeVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                    }
                    return (mfe) obj2;
                }
            }
            if (i != 0) {
            }
            return (mfe) obj2;
        } catch (PlusPayUnexpectedException e) {
            if (!(e.getCause() instanceof wis)) {
                obj = new ife(e.toString());
            }
            return obj;
        } catch (com.yandex.plus.pay.api.exception.a e2) {
            return new ife(e2.toString());
        } catch (wis unused) {
            return obj;
        }
        bfeVar = new bfe(this, cg6Var);
        Object obj22 = bfeVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bfeVar.l;
        obj = kfe.a;
    }
}
