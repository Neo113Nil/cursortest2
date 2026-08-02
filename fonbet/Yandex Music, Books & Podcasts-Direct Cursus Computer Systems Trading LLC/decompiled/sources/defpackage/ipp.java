package defpackage;

import defpackage.hmm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ipp {
    public static final hmm.a c = new hmm.a("firebase_sessions_enabled");
    public static final hmm.a d = new hmm.a("firebase_sessions_sampling_rate");
    public static final hmm.a e = new hmm.a("firebase_sessions_restart_timeout");
    public static final hmm.a f = new hmm.a("firebase_sessions_cache_duration");
    public static final hmm.a g = new hmm.a("firebase_sessions_cache_updated_time");
    public final wb7 a;
    public dlp b;

    public ipp(wb7 wb7Var) {
        wb7Var.getClass();
        this.a = wb7Var;
        x97.D(g.a, new v5p(this, (Continuation) null, 9));
    }

    public static final void a(ipp ippVar, hmm hmmVar) {
        ippVar.getClass();
        ippVar.b = new dlp((Boolean) hmmVar.a(c), (Double) hmmVar.a(d), (Integer) hmmVar.a(e), (Integer) hmmVar.a(f), (Long) hmmVar.a(g));
    }

    public final boolean b() {
        dlp dlpVar = this.b;
        if (dlpVar == null) {
            Intrinsics.j("sessionConfigs");
            throw null;
        }
        Long l = dlpVar.e;
        if (dlpVar != null) {
            Integer num = dlpVar.d;
            return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        Intrinsics.j("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(hmm.a aVar, Object obj, cg6 cg6Var) {
        gpp gppVar;
        int i;
        if (cg6Var instanceof gpp) {
            gppVar = (gpp) cg6Var;
            int i2 = gppVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gppVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = gppVar.j;
                nm6 nm6Var = nm6.a;
                i = gppVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    wb7 wb7Var = this.a;
                    hpp hppVar = new hpp(obj, aVar, this, null);
                    gppVar.l = 1;
                    if (lmm.a(wb7Var, hppVar, gppVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        gppVar = new gpp(this, cg6Var);
        Object obj22 = gppVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gppVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }
}
