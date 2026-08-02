package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.connectsdk.device.ConnectableDevice;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xi extends l9 {

    @NonNull
    public static final Parcelable.Creator<xi> CREATOR = new k2x(6);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    public xi(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.g = z3;
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ConnectableDevice.KEY_ID, this.b);
            long j = this.a;
            Pattern pattern = d94.a;
            jSONObject.put("position", j / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f);
            jSONObject.put("duration", this.c / 1000.0d);
            jSONObject.put("expanded", this.g);
            String[] strArr = this.e;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return d94.d(this.b, xiVar.b) && this.a == xiVar.a && this.c == xiVar.c && this.d == xiVar.d && Arrays.equals(this.e, xiVar.e) && this.f == xiVar.f && this.g == xiVar.g;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 8, parcel);
        parcel.writeLong(this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.q0(4, 8, parcel);
        parcel.writeLong(this.c);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.d ? 1 : 0);
        o8g.k0(parcel, 6, this.e);
        o8g.q0(7, 4, parcel);
        parcel.writeInt(this.f ? 1 : 0);
        o8g.q0(8, 4, parcel);
        parcel.writeInt(this.g ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
