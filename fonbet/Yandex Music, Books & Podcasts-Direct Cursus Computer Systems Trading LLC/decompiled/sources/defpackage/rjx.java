package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class rjx extends aww {
    public final l9e S0(zhj zhjVar, int i) {
        Parcel M0 = M0();
        z4x.c(M0, zhjVar);
        M0.writeString("com.google.android.gms.cast.framework.dynamite");
        M0.writeInt(i);
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
        Parcel L0 = L0(M0, 8);
        l9e S0 = zhj.S0(L0.readStrongBinder());
        L0.recycle();
        return S0;
    }

    public final l9e U0(zhj zhjVar, int i) {
        Parcel M0 = M0();
        z4x.c(M0, zhjVar);
        M0.writeString("com.google.android.gms.cast.framework.dynamite");
        M0.writeInt(i);
        Parcel L0 = L0(M0, 4);
        l9e S0 = zhj.S0(L0.readStrongBinder());
        L0.recycle();
        return S0;
    }

    public final l9e V0(zhj zhjVar, boolean z, long j) {
        Parcel M0 = M0();
        z4x.c(M0, zhjVar);
        M0.writeString("com.google.android.gms.cast.framework.dynamite");
        M0.writeInt(z ? 1 : 0);
        M0.writeLong(j);
        Parcel L0 = L0(M0, 7);
        l9e S0 = zhj.S0(L0.readStrongBinder());
        L0.recycle();
        return S0;
    }
}
