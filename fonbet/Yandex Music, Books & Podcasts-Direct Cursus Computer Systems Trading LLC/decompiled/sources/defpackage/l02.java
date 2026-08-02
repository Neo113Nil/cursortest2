package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l02 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l02> CREATOR = new i02(2);
    public final String a;
    public final String b;
    public final String c;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r4 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l02(String str) {
        boolean z;
        str.getClass();
        wxf.F(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        decode.getClass();
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, Charsets.UTF_8));
            String optString = jSONObject.optString("alg");
            optString.getClass();
            z = true;
            boolean z2 = optString.length() > 0 && Intrinsics.d(optString, "RS256");
            String optString2 = jSONObject.optString("kid");
            optString2.getClass();
            boolean z3 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            optString3.getClass();
            boolean z4 = optString3.length() > 0;
            if (z2) {
                if (z3) {
                }
            }
        } catch (JSONException unused) {
        }
        z = false;
        if (!z) {
            xq0.x("Invalid Header");
            throw null;
        }
        byte[] decode2 = Base64.decode(str, 0);
        decode2.getClass();
        JSONObject jSONObject2 = new JSONObject(new String(decode2, Charsets.UTF_8));
        String string = jSONObject2.getString("alg");
        string.getClass();
        this.a = string;
        String string2 = jSONObject2.getString("typ");
        string2.getClass();
        this.b = string2;
        String string3 = jSONObject2.getString("kid");
        string3.getClass();
        this.c = string3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l02)) {
            return false;
        }
        l02 l02Var = (l02) obj;
        return Intrinsics.d(this.a, l02Var.a) && Intrinsics.d(this.b, l02Var.b) && Intrinsics.d(this.c, l02Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(k5r.c(527, 31, this.a), 31, this.b);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.a);
        jSONObject.put("typ", this.b);
        jSONObject.put("kid", this.c);
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public l02(Parcel parcel) {
        String readString = parcel.readString();
        wxf.I(readString, "alg");
        if (readString != null) {
            this.a = readString;
            String readString2 = parcel.readString();
            wxf.I(readString2, "typ");
            if (readString2 != null) {
                this.b = readString2;
                String readString3 = parcel.readString();
                wxf.I(readString3, "kid");
                if (readString3 == null) {
                    xq0.q("Required value was null.");
                    throw null;
                }
                this.c = readString3;
                return;
            }
            xq0.q("Required value was null.");
            throw null;
        }
        xq0.q("Required value was null.");
        throw null;
    }
}
