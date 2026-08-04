package com.gamericefishpro.space.i9;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends com.gamericefishpro.space.w8.a {
    public static final Parcelable.Creator<v0> CREATOR = new u0(1);
    public final int d;
    public final String e;
    public final Intent i;

    public v0(int i, String str, Intent intent) {
        this.d = i;
        this.e = str;
        this.i = intent;
    }

    public static v0 b(Activity activity) {
        return new v0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.d == v0Var.d && Objects.equals(this.e, v0Var.e) && Objects.equals(this.i, v0Var.i);
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = y3.V(parcel, 20293);
        y3.U(parcel, 1, 4);
        parcel.writeInt(this.d);
        y3.Q(parcel, 2, this.e);
        y3.P(parcel, 3, this.i, i);
        y3.W(parcel, iV);
    }
}
