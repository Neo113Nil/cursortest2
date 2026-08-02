package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zun extends l9 {
    public static final Parcelable.Creator<zun> CREATOR = new s2m(9);
    public final Bundle a;
    public xy0 b;

    public zun(Bundle bundle) {
        this.a = bundle;
    }

    public final Map d() {
        if (this.b == null) {
            xy0 xy0Var = new xy0(0);
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        xy0Var.put(str, str2);
                    }
                }
            }
            this.b = xy0Var;
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.b0(parcel, 2, this.a);
        o8g.p0(parcel, o0);
    }
}
