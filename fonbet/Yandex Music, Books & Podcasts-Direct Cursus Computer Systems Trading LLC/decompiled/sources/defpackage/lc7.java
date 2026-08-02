package defpackage;

import android.content.Context;
import com.yandex.music.databases.user.UserDatabase;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class lc7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc7 b;

    public /* synthetic */ lc7(oc7 oc7Var, int i) {
        this.a = i;
        this.b = oc7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                oc7 oc7Var = this.b;
                ((l13) obj).getClass();
                return new i5h(oc7Var);
            case 1:
                oc7 oc7Var2 = this.b;
                ((l13) obj).getClass();
                oc7Var2.getClass();
                return new dst("UserDatabase", new lc7(oc7Var2, 3), UserDatabase.n, null, 120);
            case 2:
                oc7 oc7Var3 = this.b;
                ((l13) obj).getClass();
                bdt I = hag.I(i5h.class);
                qdc qdcVar = oc7Var3.a;
                qdcVar.getClass();
                bdt I2 = hag.I(n9w.class);
                qdc qdcVar2 = oc7Var3.a;
                qdcVar2.getClass();
                nc7 nc7Var = new nc7();
                Collections.newSetFromMap(new ConcurrentHashMap()).getClass();
                return nc7Var;
            default:
                oc7 oc7Var4 = this.b;
                String str = (String) obj;
                str.getClass();
                bdt I3 = hag.I(Context.class);
                qdc qdcVar3 = oc7Var4.a;
                qdcVar3.getClass();
                Context context = (Context) qdcVar3.C(I3);
                bdt I4 = hag.I(l9w.class);
                qdc qdcVar4 = oc7Var4.a;
                qdcVar4.getClass();
                l9w l9wVar = (l9w) qdcVar4.C(I4);
                bdt I5 = hag.I(usr.class);
                qdc qdcVar5 = oc7Var4.a;
                qdcVar5.getClass();
                usr usrVar = (usr) qdcVar5.C(I5);
                bdt I6 = hag.I(z2b.class);
                qdc qdcVar6 = oc7Var4.a;
                qdcVar6.getClass();
                z2b z2bVar = (z2b) qdcVar6.C(I6);
                bdt I7 = hag.I(o9w.class);
                qdc qdcVar7 = oc7Var4.a;
                qdcVar7.getClass();
                seo M = bzf.M(UserDatabase.class, context, "userDb_".concat(str), usrVar, z2bVar, new dse(1, l9wVar, oc7Var4));
                long f = nsa.f(UserDatabase.n);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeUnit.getClass();
                if (f < 0) {
                    xq0.x("autoCloseTimeout must be >= 0");
                    return null;
                }
                M.k = f;
                M.l = timeUnit;
                M.a(new b58(21, 22, new grt(3)), g5h.w, new b58(19, 20, new grt(4)), new b58(18, 19, new grt(5)), new b58(17, 18, new grt(6)), g5h.v, new b58(15, 16, new grt(7)), new b58(14, 15, new grt(8)), new b58(13, 14, new grt(9)), new b58(12, 13, new grt(10)), new b58(11, 12, new grt(11)), new b58(10, 11, new grt(12)), new b58(9, 10, new grt(13)), new b58(8, 9, new grt(14)), new b58(7, 8, new grt(15)), new b58(6, 7, new grt(16)), new b58(5, 6, new grt(17)), new b58(4, 5, new grt(18)), new b58(3, 4, new grt(19)), new b58(2, 3, new grt(1)), new b58(1, 2, new grt(2)));
                return (UserDatabase) M.b();
        }
    }
}
