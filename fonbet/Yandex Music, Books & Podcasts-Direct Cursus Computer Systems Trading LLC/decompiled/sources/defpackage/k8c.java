package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k8c {
    public final br1 a;
    public final sfg b;
    public final qc9 c;
    public final CoroutineContext d;
    public rv8 e;

    public k8c(br1 br1Var, sfg sfgVar, qc9 qc9Var) {
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        this.a = br1Var;
        this.b = sfgVar;
        this.c = qc9Var;
        this.d = mn7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        i8c i8cVar;
        int i;
        if (cg6Var instanceof i8c) {
            i8cVar = (i8c) cg6Var;
            int i2 = i8cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i8cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = i8cVar.j;
                nm6 nm6Var = nm6.a;
                i = i8cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ox1 ox1Var = new ox1(this, null, 16);
                    i8cVar.l = 1;
                    obj = x97.V(this.d, ox1Var, i8cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
                JSONObject jSONObject3 = jSONObject.getJSONObject("card");
                jSONObject2.getClass();
                jSONObject3.getClass();
                return new uv8(jSONObject2, jSONObject3);
            }
        }
        i8cVar = new i8c(this, cg6Var);
        Object obj2 = i8cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = i8cVar.l;
        if (i != 0) {
        }
        JSONObject jSONObject4 = (JSONObject) obj2;
        JSONObject jSONObject22 = jSONObject4.getJSONObject("templates");
        JSONObject jSONObject32 = jSONObject4.getJSONObject("card");
        jSONObject22.getClass();
        jSONObject32.getClass();
        return new uv8(jSONObject22, jSONObject32);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, cg6 cg6Var) {
        j8c j8cVar;
        int i;
        k8c k8cVar;
        k8c k8cVar2;
        if (cg6Var instanceof j8c) {
            j8cVar = (j8c) cg6Var;
            int i2 = j8cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j8cVar.m = i2 - Integer.MIN_VALUE;
                Object obj = j8cVar.k;
                nm6 nm6Var = nm6.a;
                i = j8cVar.m;
                Continuation continuation = null;
                if (i == 0) {
                    if (i == 1) {
                        k8cVar2 = j8cVar.j;
                        qgg.h0(obj);
                        uv8 uv8Var = (uv8) obj;
                        k8cVar2.c.e(uv8Var.a);
                        int i3 = rv8.i;
                        return fgq.y(k8cVar2.c, uv8Var.b);
                    }
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k8cVar = j8cVar.j;
                    qgg.h0(obj);
                    rv8 rv8Var = (rv8) obj;
                    k8cVar.e = rv8Var;
                    return rv8Var;
                }
                qgg.h0(obj);
                sfm sfmVar = new sfm(dq8.RESULT, (JSONObject) null, 6);
                rv8 rv8Var2 = this.e;
                if (z) {
                    if (rv8Var2 != null) {
                        return rv8Var2;
                    }
                    j8cVar.j = this;
                    j8cVar.m = 1;
                    obj = a(j8cVar);
                    if (obj != nm6Var) {
                        k8cVar2 = this;
                        uv8 uv8Var2 = (uv8) obj;
                        k8cVar2.c.e(uv8Var2.a);
                        int i32 = rv8.i;
                        return fgq.y(k8cVar2.c, uv8Var2.b);
                    }
                } else {
                    if (rv8Var2 != null) {
                        return rv8Var2;
                    }
                    hv0 hv0Var = new hv0(this, continuation, 10);
                    j8cVar.j = this;
                    j8cVar.m = 2;
                    obj = this.b.a(this.c, sfmVar, hv0Var, j8cVar);
                    if (obj != nm6Var) {
                        k8cVar = this;
                        rv8 rv8Var3 = (rv8) obj;
                        k8cVar.e = rv8Var3;
                        return rv8Var3;
                    }
                }
                return nm6Var;
            }
        }
        j8cVar = new j8c(this, cg6Var);
        Object obj2 = j8cVar.k;
        nm6 nm6Var2 = nm6.a;
        i = j8cVar.m;
        Continuation continuation2 = null;
        if (i == 0) {
        }
    }
}
