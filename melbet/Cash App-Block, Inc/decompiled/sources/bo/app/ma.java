package bo.app;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ma {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public ma(JSONObject jSONObject) {
        jSONObject.getClass();
        Integer colorIntegerOrNull = JsonUtils.getColorIntegerOrNull(jSONObject, "bg_color");
        Integer colorIntegerOrNull2 = JsonUtils.getColorIntegerOrNull(jSONObject, "text_color");
        Integer colorIntegerOrNull3 = JsonUtils.getColorIntegerOrNull(jSONObject, "close_btn_color");
        Integer colorIntegerOrNull4 = JsonUtils.getColorIntegerOrNull(jSONObject, "icon_color");
        Integer colorIntegerOrNull5 = JsonUtils.getColorIntegerOrNull(jSONObject, "icon_bg_color");
        Integer colorIntegerOrNull6 = JsonUtils.getColorIntegerOrNull(jSONObject, "header_text_color");
        Integer colorIntegerOrNull7 = JsonUtils.getColorIntegerOrNull(jSONObject, "frame_color");
        this.a = colorIntegerOrNull;
        this.b = colorIntegerOrNull2;
        this.c = colorIntegerOrNull3;
        this.d = colorIntegerOrNull4;
        this.e = colorIntegerOrNull5;
        this.f = colorIntegerOrNull6;
        this.g = colorIntegerOrNull7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        return Intrinsics.areEqual(this.a, maVar.a) && Intrinsics.areEqual(this.b, maVar.b) && Intrinsics.areEqual(this.c, maVar.c) && Intrinsics.areEqual(this.d, maVar.d) && Intrinsics.areEqual(this.e, maVar.e) && Intrinsics.areEqual(this.f, maVar.f) && Intrinsics.areEqual(this.g, maVar.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        return hashCode6 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.a;
        Integer num2 = this.b;
        Integer num3 = this.c;
        Integer num4 = this.d;
        Integer num5 = this.e;
        Integer num6 = this.f;
        Integer num7 = this.g;
        StringBuilder sb = new StringBuilder("InAppMessageTheme(backgroundColor=");
        sb.append(num);
        sb.append(", textColor=");
        sb.append(num2);
        sb.append(", closeButtonColor=");
        NavAction$$ExternalSyntheticOutline0.m(sb, num3, ", iconColor=", num4, ", iconBackgroundColor=");
        NavAction$$ExternalSyntheticOutline0.m(sb, num5, ", headerTextColor=", num6, ", frameColor=");
        return NavAction$$ExternalSyntheticOutline0.m(sb, num7, ")");
    }
}
