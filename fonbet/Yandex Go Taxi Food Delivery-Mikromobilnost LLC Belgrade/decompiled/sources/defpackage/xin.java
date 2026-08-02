package defpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.verification.ebs.data.api.a;
import ru.rt.ebs.cryptosdk.core.verification.ebs.data.d;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.VerificationsNegotiateRequest;

/* loaded from: classes4.dex */
public final class xin extends x3 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ug(String str, Map map, Map map2, VerificationsNegotiateRequest verificationsNegotiateRequest, ContinuationImpl continuationImpl) {
        a aVar;
        int i;
        try {
            if (continuationImpl instanceof a) {
                aVar = (a) continuationImpl;
                int i2 = aVar.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.c = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.c;
                    if (i != 0) {
                        b.b(obj);
                        wwu wwuVar = new wwu(HttpsMethod.POST, str != null ? new axu(str) : new zwu("api/v3/verifications/{session_id}/negotiate"));
                        wwuVar.b(map);
                        wwuVar.a(map2);
                        wwuVar.e.put("Content-Type", Collections.singletonList("application/json;charset=UTF-8"));
                        wwuVar.f = verificationsNegotiateRequest;
                        xwu c = wwuVar.c();
                        qwu qwuVar = (qwu) this.b;
                        aVar.c = 1;
                        obj = qwuVar.d(c, aVar);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((ywu) obj).e, uza.a), 8192);
                    String x0 = cma1.x0(bufferedReader);
                    bufferedReader.close();
                    return new JSONObject(x0);
                }
            }
            String x02 = cma1.x0(bufferedReader);
            bufferedReader.close();
            return new JSONObject(x02);
        } finally {
        }
        aVar = new a(this, continuationImpl);
        Object obj2 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.c;
        if (i != 0) {
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(((ywu) obj2).e, uza.a), 8192);
    }

    public final Object Vg(String str, Map map, Map map2, ArrayList arrayList, d dVar) {
        wwu wwuVar = new wwu(HttpsMethod.POST, str != null ? new axu(str) : new zwu("api/v3/verifications/{session_id}/upload"));
        wwuVar.a(map2);
        wwuVar.b(map);
        wwuVar.g.addAll(arrayList);
        return ((qwu) this.b).d(wwuVar.c(), dVar);
    }
}
