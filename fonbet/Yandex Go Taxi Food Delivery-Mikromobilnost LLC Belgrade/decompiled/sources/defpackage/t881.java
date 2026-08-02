package defpackage;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.of2;
import yads.pf2;
import yads.qf2;
import yads.te2;
import yads.xz;
import yads.yf2;
import yads.zp1;

/* loaded from: classes7.dex */
public final class t881 {
    public final rr41 a;
    public final qn61 b;
    public final rr41 c;
    public final ad71 d;

    public t881(z581 z581Var, rr41 rr41Var) {
        qn61 qn61Var = new qn61();
        rr41 rr41Var2 = new rr41(z581Var);
        new da71();
        ad71 ad71Var = new ad71();
        this.a = rr41Var;
        this.b = qn61Var;
        this.c = rr41Var2;
        this.d = ad71Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (r0 != r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r0 == r12) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t881 t881Var, Context context, xz xzVar, a271 a271Var, List list, long j, ContinuationImpl continuationImpl) {
        of2 of2Var;
        t881 t881Var2;
        int i;
        t881Var.getClass();
        if (continuationImpl instanceof of2) {
            of2Var = (of2) continuationImpl;
            int i2 = of2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                of2Var.d = i2 - Integer.MIN_VALUE;
                t881Var2 = t881Var;
                Object obj = of2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = of2Var.d;
                if (i != 0) {
                    b.b(obj);
                    if (list.isEmpty()) {
                        String str = te2.f.c;
                        return new is81(Collections.singletonList(new np61(StringUtils.UNDEFINED, new ql81(yf2.d, "No mediation data was received. Possibly, Client Bidding adapters are not connected", 1003))));
                    }
                    pf2 pf2Var = new pf2(j, context, list, null, xzVar, t881Var2, a271Var);
                    of2Var.d = 1;
                    obj = bvf0.n(pf2Var, of2Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        List list2 = (List) obj;
                        if (!list2.isEmpty()) {
                            return new is81(list2);
                        }
                        String str2 = te2.f.c;
                        return new is81(Collections.singletonList(new np61(StringUtils.UNDEFINED, new ql81(yf2.d, "No mediation data was received. Possibly, Client Bidding adapters are not connected", 1003))));
                    }
                    b.b(obj);
                }
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                qf2 qf2Var = new qf2((List) obj, null);
                of2Var.d = 2;
                obj = tje.k0(mdhVar, qf2Var, of2Var);
            }
        }
        t881Var2 = t881Var;
        of2Var = new of2(t881Var2, continuationImpl);
        Object obj2 = of2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = of2Var.d;
        if (i != 0) {
        }
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        qf2 qf2Var2 = new qf2((List) obj2, null);
        of2Var.d = 2;
        obj2 = tje.k0(mdhVar2, qf2Var2, of2Var);
    }

    public static final void b(t881 t881Var, zp1 zp1Var) {
        t881Var.getClass();
        if (evu0.y(zp1Var.b, "LevelPlay", true)) {
            List g = scc.g("app_key", "placement_name");
            ArrayList arrayList = new ArrayList();
            for (Object obj : g) {
                if (!zp1Var.c.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ny61.g("Required configuration parameters are missing");
        }
    }
}
