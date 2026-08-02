package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new com.google.android.gms.common.zzs(23);
    public final List zza;

    public UvmEntries(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        List list = ((UvmEntries) obj).zza;
        List list2 = this.zza;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.zza;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 1, this.zza);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }

    public final JSONArray zza() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.zza;
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    UvmEntry uvmEntry = (UvmEntry) list.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.zzc);
                    jSONArray2.put((int) uvmEntry.zzb);
                    jSONArray2.put((int) uvmEntry.zzc);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Error encoding UvmEntries to JSON object", (Throwable) e);
            return null;
        }
    }
}
