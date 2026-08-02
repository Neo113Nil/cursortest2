package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zac extends com.google.android.gms.internal.base.zab implements IInterface {
    public zac() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 4:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 7:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
            case 8:
                zak zakVar = (zak) com.google.android.gms.internal.base.zac.zaa(parcel, zak.CREATOR);
                com.google.android.gms.internal.base.zac.zad(parcel);
                zab(zakVar);
                break;
            case 9:
                com.google.android.gms.internal.base.zac.zad(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract void zab(zak zakVar);
}
