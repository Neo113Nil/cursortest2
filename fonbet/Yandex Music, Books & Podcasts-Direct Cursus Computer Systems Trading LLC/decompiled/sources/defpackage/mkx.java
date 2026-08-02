package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class mkx extends aww {
    public final l9e S0(zhj zhjVar, int i, zhj zhjVar2) {
        Parcel M0 = M0();
        z4x.c(M0, zhjVar);
        M0.writeString("com.google.android.gms.cast.framework.dynamite");
        M0.writeInt(i);
        z4x.c(M0, zhjVar2);
        Parcel L0 = L0(M0, 2);
        l9e S0 = zhj.S0(L0.readStrongBinder());
        L0.recycle();
        return S0;
    }

    public final l9e T0(zhj zhjVar, int i, zhj zhjVar2) {
        Parcel M0 = M0();
        z4x.c(M0, zhjVar);
        M0.writeString("com.google.android.gms.cast.framework.dynamite");
        M0.writeInt(i);
        z4x.c(M0, zhjVar2);
        Parcel L0 = L0(M0, 3);
        l9e S0 = zhj.S0(L0.readStrongBinder());
        L0.recycle();
        return S0;
    }
}
