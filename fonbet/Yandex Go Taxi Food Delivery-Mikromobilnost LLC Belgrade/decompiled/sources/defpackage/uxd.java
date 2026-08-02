package defpackage;

import android.os.Build;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final class uxd implements o231, ix1 {
    public final Map a;

    public uxd(String str, String str2, String str3, String str4, String str5, int i, String str6, EvgenOffersPlatform evgenOffersPlatform, String str7, String str8) {
        this.a = b.i(new Pair("model", Build.MODEL), new Pair(CommonUrlParts.SCREEN_HEIGHT, str), new Pair(CommonUrlParts.SCREEN_WIDTH, str2), new Pair("appmetrica_uuid", str3), new Pair("appmetrica_device_id", str4), new Pair(CommonUrlParts.APP_VERSION, str5), new Pair("app_version_code", Integer.valueOf(i)), new Pair("sdk_version", "110.0.2"), new Pair(CommonUrlParts.APP_ID, str6), new Pair("integration", "PaySDK"), new Pair("platform", evgenOffersPlatform.getEventValue()), new Pair("api_level", str7), new Pair("manufacturer", Build.MANUFACTURER), new Pair(CommonUrlParts.SCREEN_DPI, str8));
    }

    @Override // defpackage.ix1
    public kzv a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            ny61.p();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            v2u v2uVar = ((kzv) next).a;
            Map map = this.a;
            Integer num = (Integer) map.get(v2uVar);
            int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            do {
                Object next2 = it.next();
                Integer num2 = (Integer) map.get(((kzv) next2).a);
                int intValue2 = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
                if (intValue > intValue2) {
                    next = next2;
                    intValue = intValue2;
                }
            } while (it.hasNext());
        }
        return (kzv) next;
    }

    public jz4 b(String str) {
        Object obj = this.a.get(str);
        jz4 jz4Var = obj instanceof jz4 ? (jz4) obj : null;
        if (jz4Var != null) {
            return jz4Var;
        }
        ny61.r(g8e.o("Cannot find creator for custom type ", str));
        return null;
    }

    public Map c() {
        return this.a;
    }

    @Override // defpackage.o231
    public Object get(String str) {
        return this.a.get(str);
    }

    public uxd(r1s r1sVar) {
        ArrayList arrayList = (ArrayList) r1sVar.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList2.add(new Pair((v2u) ((Pair) obj).getFirst(), Integer.valueOf(i)));
            i = i2;
        }
        this.a = b.s(arrayList2);
    }

    public /* synthetic */ uxd(Map map) {
        this.a = map;
    }

    public uxd(PayEvgenAnalyticsPlatform payEvgenAnalyticsPlatform) {
        this.a = g8e.z("platform", payEvgenAnalyticsPlatform.getEventValue());
    }

    public uxd(PayUIEvgenDiagnosticPlatform payUIEvgenDiagnosticPlatform) {
        this.a = g8e.z("platform", payUIEvgenDiagnosticPlatform.getEventValue());
    }
}
