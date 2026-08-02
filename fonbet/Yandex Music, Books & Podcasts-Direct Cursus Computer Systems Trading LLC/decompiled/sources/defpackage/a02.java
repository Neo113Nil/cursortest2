package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a02 extends l9 {

    @NonNull
    public static final Parcelable.Creator<a02> CREATOR = new k2x(29);
    public final jwt a;
    public final n9x b;
    public final b02 c;
    public final wbx d;
    public final String e;

    public a02(jwt jwtVar, n9x n9xVar, b02 b02Var, wbx wbxVar, String str) {
        this.a = jwtVar;
        this.b = n9xVar;
        this.c = b02Var;
        this.d = wbxVar;
        this.e = str;
    }

    public final JSONObject d() {
        try {
            JSONObject jSONObject = new JSONObject();
            b02 b02Var = this.c;
            if (b02Var != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", b02Var.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            jwt jwtVar = this.a;
            if (jwtVar != null) {
                jSONObject.put("uvm", jwtVar.d());
            }
            wbx wbxVar = this.d;
            if (wbxVar != null) {
                jSONObject.put("prf", wbxVar.d());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            kac.k("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a02)) {
            return false;
        }
        a02 a02Var = (a02) obj;
        return ldg.s(this.a, a02Var.a) && ldg.s(this.b, a02Var.b) && ldg.s(this.c, a02Var.c) && ldg.s(this.d, a02Var.d) && ldg.s(this.e, a02Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return hrg.q("AuthenticationExtensionsClientOutputs{", d().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 1, this.a, i);
        o8g.i0(parcel, 2, this.b, i);
        o8g.i0(parcel, 3, this.c, i);
        o8g.i0(parcel, 4, this.d, i);
        o8g.j0(parcel, 5, this.e);
        o8g.p0(parcel, o0);
    }
}
