package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;

/* loaded from: classes4.dex */
public abstract class IStatusCallback$Stub extends zab {
    public IStatusCallback$Stub() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
    }

    public abstract void onResult(Status status);

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
        com.google.android.gms.internal.base.zac.zad(parcel);
        onResult(status);
        return true;
    }
}
