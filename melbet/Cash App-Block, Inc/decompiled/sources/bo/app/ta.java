package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ta {
    public final w8 a;

    public ta(w8 w8Var) {
        w8Var.getClass();
        this.a = w8Var;
    }

    public static final String a(Lazy lazy, kd kdVar, ta taVar, Map map, JSONObject jSONObject) {
        Object value = lazy.getValue();
        taVar.getClass();
        return StringsKt__IndentKt.trimMargin$default("\n                |Making request with id => \"" + value + "\"\n                |to url: " + kdVar + "\n                \n                |with headers:\n                " + a(map) + "\n                |\n                |" + (jSONObject == null ? "" : Recorder$$ExternalSyntheticOutline2.m("and JSON :\n", JsonUtils.getPrettyPrintedString(jSONObject))) + "\n                ");
    }

    public static final String b(kd kdVar, Map map, JSONObject jSONObject) {
        Object[] objArr = {kdVar, map, jSONObject};
        String str = com.braze.support.h.a;
        long j = 1;
        for (int i = 0; i < 3; i++) {
            j *= objArr[i].hashCode();
        }
        String hexString = Long.toHexString(j);
        hexString.getClass();
        return hexString;
    }

    public static final String b() {
        return "Exception while logging result: ";
    }

    public final void a(kd kdVar, Map map, Lazy lazy, JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, kdVar.d, new ta$$ExternalSyntheticLambda1(lazy, kdVar, this, map, jSONObject, 0), 3, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(7), 4, (Object) null);
        }
    }

    public final n9 a(kd kdVar, Map map, JSONObject jSONObject) {
        kdVar.getClass();
        map.getClass();
        jSONObject.getClass();
        Lazy lazy = LazyKt.lazy(new n$$ExternalSyntheticLambda1(24, kdVar, map, jSONObject));
        a(kdVar, map, lazy, jSONObject);
        long currentTimeMillis = System.currentTimeMillis();
        n9 a = this.a.a(kdVar, map, jSONObject);
        a(lazy, kdVar, a.b, a.c, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }

    public static final String a() {
        return "Exception while logging request: ";
    }

    public final void a(final Lazy lazy, final kd kdVar, final Map map, final JSONObject jSONObject, final long j) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: bo.app.ta$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ta.a(Lazy.this, kdVar, j, this, map, jSONObject);
                }
            }, 7, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new w$$ExternalSyntheticLambda0(8), 4, (Object) null);
        }
    }

    public static final String a(Lazy lazy, kd kdVar, long j, ta taVar, Map map, JSONObject jSONObject) {
        Object value = lazy.getValue();
        taVar.getClass();
        String a = a(map);
        String prettyPrintedString = JsonUtils.getPrettyPrintedString(jSONObject);
        StringBuilder sb = new StringBuilder("\n                |Made request with id => \"");
        sb.append(value);
        sb.append("\"\n                |to url: ");
        sb.append(kdVar);
        sb.append("\n                |took: ");
        Fragment$5$$ExternalSyntheticOutline0.m(j, "ms\n                \n                |with response headers:\n                ", a, sb);
        sb.append("\n                |\n                |and response JSON:\n                |");
        sb.append(prettyPrintedString);
        sb.append("\n                ");
        return StringsKt__IndentKt.trimMargin$default(sb.toString());
    }

    public static String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(Boxes$$ExternalSyntheticOutline1.m("|\"", (String) entry.getKey(), "\" => \"", (String) entry.getValue(), "\""));
        }
        return CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62);
    }
}
