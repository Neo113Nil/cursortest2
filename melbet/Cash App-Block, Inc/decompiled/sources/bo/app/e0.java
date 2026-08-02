package bo.app;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e0 {
    public final JSONObject a;
    public final Long b;
    public final List c;

    public e0(JSONObject jSONObject, Long l, List list) {
        jSONObject.getClass();
        list.getClass();
        this.a = jSONObject;
        this.b = l;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.a, e0Var.a) && Intrinsics.areEqual(this.b, e0Var.b) && Intrinsics.areEqual(this.c, e0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.c.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        JSONObject jSONObject = this.a;
        Long l = this.b;
        List list = this.c;
        StringBuilder sb = new StringBuilder("BannersReceivedEvent(bannersData=");
        sb.append(jSONObject);
        sb.append(", requestTime=");
        sb.append(l);
        sb.append(", acknowledgedDismissals=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, list, ")");
    }
}
