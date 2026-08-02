package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wbx extends l9 {
    public static final Parcelable.Creator<wbx> CREATOR = new k5x(29);
    public final boolean a;
    public final obx b;

    public wbx(boolean z, obx obxVar) {
        this.a = z;
        this.b = obxVar;
    }

    public final JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            obx obxVar = this.b;
            byte[] u = obxVar == null ? null : obxVar.u();
            if (u != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(u, 32), 11));
                if (u.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(u, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            kac.k("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wbx)) {
            return false;
        }
        wbx wbxVar = (wbx) obj;
        return this.a == wbxVar.a && ldg.s(this.b, wbxVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return hrg.q("AuthenticationExtensionsPrfOutputs{", d().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a ? 1 : 0);
        obx obxVar = this.b;
        o8g.c0(parcel, 2, obxVar == null ? null : obxVar.u());
        o8g.p0(parcel, o0);
    }
}
