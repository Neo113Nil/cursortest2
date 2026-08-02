package bo.app;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n9 {
    public final int a;
    public final Map b;
    public final JSONObject c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n9(int i, Map map, int i2) {
        this(i, map, (JSONObject) null);
        if ((i2 & 2) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9)) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return this.a == n9Var.a && Intrinsics.areEqual(this.b, n9Var.b) && Intrinsics.areEqual(this.c, n9Var.c);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(Integer.hashCode(this.a) * 31, this.b, 31);
        JSONObject jSONObject = this.c;
        return m + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "HttpConnectorResult(responseCode=" + this.a + ", responseHeaders=" + this.b + ", jsonResponse=" + this.c + ")";
    }

    public n9(int i, Map map, JSONObject jSONObject) {
        map.getClass();
        this.a = i;
        this.b = map;
        this.c = jSONObject;
    }
}
