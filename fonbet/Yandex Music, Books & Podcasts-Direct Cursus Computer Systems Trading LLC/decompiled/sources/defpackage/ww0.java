package defpackage;

import defpackage.hmm;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ww0 implements sw0 {
    public static final /* synthetic */ s9f[] e;
    public static final long f;
    public final zzp a;
    public final mm6 b;
    public final jyr c;
    public final rhp d;

    static {
        opi opiVar = new opi(ww0.class, "storingJob", "getStoringJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        e = new s9f[]{opiVar};
        msa msaVar = nsa.b;
        f = yd5.M(24, ssa.HOURS);
    }

    public ww0(cc7 cc7Var, zzp zzpVar) {
        tf6 e2 = gld.e(dm6.b);
        this.a = zzpVar;
        this.b = e2;
        this.c = btf.b(new tw0(cc7Var, 0));
        this.d = new rhp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        if (r15 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        if (r15.j0(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        uw0 uw0Var;
        int i;
        if (cg6Var instanceof uw0) {
            uw0Var = (uw0) cg6Var;
            int i2 = uw0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uw0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = uw0Var.j;
                nm6 nm6Var = nm6.a;
                i = uw0Var.l;
                jyr jyrVar = this.c;
                int i3 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r2f b = this.d.b(e[0]);
                    if (b != null) {
                        uw0Var.l = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                return null;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        hmm hmmVar = (hmm) obj;
                        if (hmmVar != null) {
                            hmm.a aVar = new hmm.a("campaign_start_time");
                            LinkedHashMap linkedHashMap = ((lpi) hmmVar).a;
                            Long l = (Long) linkedHashMap.get(aVar);
                            if (l != null) {
                                long longValue = l.longValue();
                                if (nsa.f(f) + longValue >= this.a.b()) {
                                    return linkedHashMap.get(new hmm.a("campaign_id"));
                                }
                                wb7 wb7Var = (wb7) jyrVar.getValue();
                                xc xcVar = new xc(i3, 1, continuation);
                                uw0Var.l = 3;
                                if (lmm.a(wb7Var, xcVar, uw0Var) == nm6Var) {
                                    return nm6Var;
                                }
                            }
                        }
                        return null;
                    }
                    qgg.h0(obj);
                }
                pjc data = ((wb7) jyrVar.getValue()).getData();
                uw0Var.l = 2;
                obj = zsd.i0(data, uw0Var);
            }
        }
        uw0Var = new uw0(this, cg6Var);
        Object obj2 = uw0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = uw0Var.l;
        jyr jyrVar2 = this.c;
        int i32 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        pjc data2 = ((wb7) jyrVar2.getValue()).getData();
        uw0Var.l = 2;
        obj2 = zsd.i0(data2, uw0Var);
    }
}
