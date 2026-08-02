package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class yi71 extends aj61 {
    public yi71(Context context, String str, g291 g291Var) {
        super(context, 0, str, g291Var, null);
        Integer num;
        a081 a081Var;
        Integer num2;
        gg81 a = dha1.f().a(context);
        int intValue = (a == null || (num2 = a.x0) == null) ? 10000 : num2.intValue();
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a2 = a081Var2.a(context);
        setRetryPolicy(new nv71(1.0f, intValue, (a2 == null || (num = a2.M) == null) ? 0 : num.intValue()));
        setShouldRetryConnectionErrors(true);
        setShouldRetryServerErrors(true);
    }

    @Override // com.monetization.ads.network.core.Request
    public final km81 parseNetworkResponse(gb81 gb81Var) {
        return new km81(gb81Var, hba1.d(gb81Var));
    }
}
