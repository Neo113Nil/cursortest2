package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class jwt extends l9 {

    @NonNull
    public static final Parcelable.Creator<jwt> CREATOR = new k2x(15);
    public final List a;

    public jwt(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final JSONArray d() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.a;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    kwt kwtVar = (kwt) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) kwtVar.c);
                    jSONArray2.put((int) kwtVar.b);
                    jSONArray2.put((int) kwtVar.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            kac.k("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jwt)) {
            return false;
        }
        List list = ((jwt) obj).a;
        List list2 = this.a;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.a;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.n0(parcel, 1, this.a);
        o8g.p0(parcel, o0);
    }
}
