package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.appset.zzd;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new zzd(26);
    public final List zab;
    public final boolean zac;
    public final String zad;
    public final String zae;

    public ApiFeatureRequest(String str, String str2, ArrayList arrayList, boolean z) {
        zzae.checkNotNull(arrayList);
        this.zab = arrayList;
        this.zac = z;
        this.zad = str;
        this.zae = str2;
    }

    public static ApiFeatureRequest zaa(List list, boolean z) {
        TreeSet treeSet = new TreeSet(ViewPager.AnonymousClass1.zaa$1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((OptionalModuleApi) it.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(null, null, new ArrayList(treeSet), z);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.zac == apiFeatureRequest.zac && zzae.equal(this.zab, apiFeatureRequest.zab) && zzae.equal(this.zad, apiFeatureRequest.zad) && zzae.equal(this.zae, apiFeatureRequest.zae);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.zac), this.zab, this.zad, this.zae});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeTypedList(parcel, 1, this.zab);
        MooncakeHeaderViewKt.zza(parcel, 2, 4);
        parcel.writeInt(this.zac ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zad);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zae);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
