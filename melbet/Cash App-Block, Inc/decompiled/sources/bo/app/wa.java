package bo.app;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wa {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    public wa(JSONObject jSONObject) {
        jSONObject.getClass();
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(jSONObject, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(jSONObject, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(jSONObject, "border_color");
        this.a = colorIntegerOrNull;
        this.b = colorIntegerOrNull2;
        this.c = colorIntegerOrNull3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa)) {
            return false;
        }
        wa waVar = (wa) obj;
        return Intrinsics.areEqual(this.a, waVar.a) && Intrinsics.areEqual(this.b, waVar.b) && Intrinsics.areEqual(this.c, waVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        StringBuilder sb = new StringBuilder("MessageButtonTheme(backgroundColor=");
        sb.append(num);
        sb.append(", textColor=");
        sb.append(num2);
        sb.append(", borderColor=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, num3, ")");
    }
}
