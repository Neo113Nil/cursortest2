package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xmp extends l9 {

    @NonNull
    public static final Parcelable.Creator<xmp> CREATOR = new k5x(10);
    public final coh a;
    public String b;
    public final JSONObject c;

    public xmp(coh cohVar, JSONObject jSONObject) {
        this.a = cohVar;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmp)) {
            return false;
        }
        xmp xmpVar = (xmp) obj;
        if (o7f.a(this.c, xmpVar.c)) {
            return ldg.s(this.a, xmpVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.c;
        this.b = jSONObject == null ? null : jSONObject.toString();
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 2, this.a, i);
        o8g.j0(parcel, 3, this.b);
        o8g.p0(parcel, o0);
    }
}
