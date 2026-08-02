package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wu8 implements u8s {
    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        xu8 xu8Var = (xu8) d7fVar;
        return new tu8(h4a.N(t7kVar, xu8Var.a, jSONObject, CommonUrlParts.LOCALE, vct.c), (String) h4a.C(xu8Var.b, jSONObject, "raw_text_variable", bcx.i, bcx.h));
    }
}
