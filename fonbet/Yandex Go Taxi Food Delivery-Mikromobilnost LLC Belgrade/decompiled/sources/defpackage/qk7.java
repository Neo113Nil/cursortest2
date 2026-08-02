package defpackage;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.inapp_calls.repository.defaultoutgoingcall.g;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class qk7 extends ad5 {
    public final q A;
    public final g B;
    public final tk7 C;
    public final pwy0 D;
    public final njv E;
    public boolean F;
    public final gkv x;
    public final hh5 y;
    public final mf1 z;

    public qk7(gkv gkvVar, hh5 hh5Var, mf1 mf1Var, q qVar, g gVar, tk7 tk7Var, pwy0 pwy0Var, njv njvVar) {
        super(pk7.class);
        this.x = gkvVar;
        this.y = hh5Var;
        this.z = mf1Var;
        this.A = qVar;
        this.B = gVar;
        this.C = tk7Var;
        this.D = pwy0Var;
        this.E = njvVar;
    }

    public final void Kg(DefaultOutgoingCallType defaultOutgoingCallType) {
        this.B.a(defaultOutgoingCallType);
        mjv mjvVar = this.E.b;
        String a = njv.a(defaultOutgoingCallType);
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", a);
        mjvVar.a.a("InAppCalls.RememberMyChoice.Selected", hashMap, 1, new HashMap());
    }
}
