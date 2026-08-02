package com.google.android.gms.internal.tapandpay;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public abstract class zzah extends zzb implements IInterface {
    public zzah() {
        super(8);
        attachInterface(this, "com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean dispatchTransaction(Parcel parcel, int i) {
        switch (i) {
            case 2:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 3:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzt(status);
                return true;
            case 4:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 5:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 6:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 7:
            case 16:
            case 26:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            case 54:
            default:
                return false;
            case 8:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 9:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 10:
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 11:
                parcel.readInt();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 12:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 13:
                parcel.readInt();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 14:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 15:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 17:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 18:
                parcel.readString();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 19:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                String readString = parcel.readString();
                zzc.zzb(parcel);
                zzg(status2, readString);
                return true;
            case 20:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 21:
                parcel.readInt();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 22:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 23:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                String readString2 = parcel.readString();
                zzc.zzb(parcel);
                zzN(status3, readString2);
                return true;
            case 24:
                parcel.readString();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 25:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 27:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 28:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 29:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 30:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 31:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 35:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 38:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 39:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 40:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 41:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 42:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 43:
                parcel.readString();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 44:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 45:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 46:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 47:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 48:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 49:
                parcel.readInt();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 50:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 51:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 52:
                parcel.createByteArray();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 53:
                throw zzel$EnumUnboxingLocalUtility.m(parcel);
            case 55:
                parcel.readInt();
                zzc.zzb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
        }
    }

    public void zzN(Status status, String str) {
        throw new UnsupportedOperationException();
    }

    public void zzg(Status status, String str) {
        throw new UnsupportedOperationException();
    }

    public void zzt(Status status) {
        throw new UnsupportedOperationException();
    }
}
