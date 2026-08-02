package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes4.dex */
public abstract class h extends zzb implements i {
    public static i b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new g(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService", 10);
    }
}
