package bo.app;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class k1 implements y8 {
    public static final j1 g;
    public static final /* synthetic */ KProperty[] h;
    public final w7 a;
    public final JSONObject b;
    public final double c;
    public final String d;
    public final ra e;
    public final ra f;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(k1.class, "userId", "getUserId()Ljava/lang/String;", 0);
        ReflectionFactory reflectionFactory = Reflection.factory;
        h = new KProperty[]{reflectionFactory.mutableProperty1(mutablePropertyReference1Impl), Fragment$5$$ExternalSyntheticOutline0.m(k1.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0, reflectionFactory)};
        g = new j1();
    }

    public k1(w7 w7Var, JSONObject jSONObject, double d, String str) {
        w7Var.getClass();
        jSONObject.getClass();
        str.getClass();
        this.a = w7Var;
        this.b = jSONObject;
        this.c = d;
        this.d = str;
        this.e = new ra();
        this.f = new ra();
        if (w7Var != w7.J) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Event type cannot be unknown.");
        throw null;
    }

    public static final String b() {
        return "Caught exception creating Braze event json";
    }

    public final void a(ye yeVar) {
        this.f.setValue(this, h[1], yeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.d, ((k1) obj).d);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final JSONObject getPropertiesJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.a.a);
            jSONObject.put("data", this.b);
            jSONObject.put("time", this.c);
            ra raVar = this.e;
            KProperty[] kPropertyArr = h;
            KProperty kProperty = kPropertyArr[0];
            raVar.getClass();
            kProperty.getClass();
            String str = (String) raVar.a;
            if (str != null && str.length() != 0) {
                ra raVar2 = this.e;
                KProperty kProperty2 = kPropertyArr[0];
                raVar2.getClass();
                kProperty2.getClass();
                jSONObject.put("user_id", (String) raVar2.a);
            }
            ra raVar3 = this.f;
            KProperty kProperty3 = kPropertyArr[1];
            raVar3.getClass();
            kProperty3.getClass();
            ye yeVar = (ye) raVar3.a;
            if (yeVar != null) {
                jSONObject.put("session_id", yeVar.b);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(21), 4, (Object) null);
            return jSONObject;
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        String jSONObject = getPropertiesJSONObject().toString();
        jSONObject.getClass();
        return jSONObject;
    }

    public /* synthetic */ k1(w7 w7Var, JSONObject jSONObject, double d, int i) {
        this(w7Var, (i & 2) != 0 ? new JSONObject() : jSONObject, (i & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d, Boxes$$ExternalSyntheticOutline1.m());
    }
}
