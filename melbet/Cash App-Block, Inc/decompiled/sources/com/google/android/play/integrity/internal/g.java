package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.play.core.integrity.bp;

/* loaded from: classes4.dex */
public final class g extends zaa implements i {
    public final void e(Bundle bundle, bp bpVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zab);
        int i = c.$r8$clinit;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(bpVar);
        b(obtain, 2);
    }
}
