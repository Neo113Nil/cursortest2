package defpackage;

import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class vla extends bfu {
    public final ila k;
    public final ce5 l;
    public final xdr m;
    public final fkn n;

    public vla(ila ilaVar, lnq lnqVar) {
        ilaVar.getClass();
        this.k = ilaVar;
        ce5 ce5Var = new ce5("collection_downloads", ot0.F(this), ilaVar.b, lnqVar);
        this.l = ce5Var;
        xdr a = ydr.a(rla.a);
        this.m = a;
        this.n = new fkn(a);
        x97.y(ot0.F(this), null, null, new g68(this, null, 7), 3);
        ox6.B(new bca((xdr) ce5Var.e, 18), ot0.F(this), new u58(13, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r5.r(r0, null, r6) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(vla vlaVar, cg6 cg6Var) {
        ula ulaVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof ula) {
            ulaVar = (ula) cg6Var;
            int i2 = ulaVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ulaVar.l = i2 - Integer.MIN_VALUE;
                Object obj = ulaVar.j;
                nm6 nm6Var = nm6.a;
                i = ulaVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    q04 q04Var = vlaVar.k.a;
                    ulaVar.l = 1;
                    obj = q04Var.b(ulaVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdr xdrVar = vlaVar.m;
                    xdrVar.getClass();
                    xdrVar.m(null, qla.a);
                    return Unit.a;
                }
                ce5 ce5Var = vlaVar.l;
                List list = (List) ((qj6) rj6Var).a;
                ulaVar.l = 2;
            }
        }
        ulaVar = new ula(vlaVar, cg6Var);
        Object obj2 = ulaVar.j;
        nm6 nm6Var2 = nm6.a;
        i = ulaVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
