package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.maps.zzb;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class zbh extends zzb implements IInterface {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zbi zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbh(zbi zbiVar, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 1);
        this.$r8$classId = i;
        this.zba = zbiVar;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2) {
        zbi zbiVar = this.zba;
        int i2 = this.$r8$classId;
        switch (i) {
            case 101:
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                OptionalProvider$$ExternalSyntheticLambda0.m();
                return false;
            case 102:
                Status status = (Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                switch (i2) {
                    case 0:
                        zbiVar.setResult(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case 103:
                Status status2 = (Status) com.google.android.gms.internal.p000authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p000authapi.zbc.zbb(parcel);
                switch (i2) {
                    case 1:
                        zbiVar.setResult(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
