package defpackage;

import com.yandex.go.inapp_calls.navigation.f;
import java.util.HashMap;
import kotlin.Pair;

/* loaded from: classes12.dex */
public final class ukv implements sy60 {
    public final hkv a;
    public final /* synthetic */ f b;

    public ukv(f fVar, hkv hkvVar) {
        this.b = fVar;
        this.a = hkvVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        f fVar = this.b;
        njv njvVar = fVar.K;
        String str = this.a.d.b;
        njvVar.k("CallSelection", "Close", new Pair[0]);
        mjv mjvVar = njvVar.b;
        mjvVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("linkage_id", str);
        mjvVar.a.a("InAppCalls.CallSelection.Closed", hashMap, 2, new HashMap());
        fVar.r(new qu(9));
    }
}
