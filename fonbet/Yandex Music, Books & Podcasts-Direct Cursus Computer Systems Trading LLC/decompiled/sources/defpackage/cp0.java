package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class cp0 {
    public final qne a = new qne(18);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final x4b d = x4b.a;
    public String e;
    public bnd f;
    public Boolean g;

    public cp0() {
        mn7 mn7Var = da8.a;
    }

    public final dp0 a() {
        if (this.e == null) {
            xq0.q("Apollo: 'serverUrl' is required");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String str = this.e;
        str.getClass();
        bnd bndVar = this.f;
        Continuation continuation = null;
        if (bndVar == null) {
            bndVar = null;
        }
        Boolean bool = this.g;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ArrayList arrayList2 = this.c;
        arrayList2.getClass();
        arrayList.clear();
        arrayList.addAll(arrayList2);
        str.getClass();
        rp7 rp7Var = new rp7();
        rp7Var.a = str;
        if (bndVar == null) {
            joj jojVar = new joj();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jojVar.c(60000L, timeUnit);
            jojVar.e(60000L, timeUnit);
            bndVar = new bnd(22, new OkHttpClient(jojVar));
        }
        yk3 yk3Var = new yk3();
        yk3Var.b = rp7Var;
        yk3Var.c = bndVar;
        yk3Var.d = arrayList;
        yk3Var.a = booleanValue;
        yk3Var.e = new b7e(yk3Var);
        String str2 = this.e;
        f2j tyiVar = str2 == null ? yk3Var : new tyi(new qs(str2, continuation, 12), new ArrayList(), new xzi(23), 60000L, new wx0(6));
        qne qneVar = this.a;
        qneVar.getClass();
        return new dp0(yk3Var, new fx6((LinkedHashMap) qneVar.a, (r0o) qneVar.b), tyiVar, CollectionsKt.g0(this.b, c5b.a), this.d);
    }
}
