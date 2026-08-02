package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzef;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzef(5);
    public final Algorithm zza;

    public final class UnsupportedAlgorithmIdentifierException extends Exception {
    }

    public COSEAlgorithmIdentifier(Algorithm algorithm) {
        this.zza = algorithm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier fromCoseValue(int i) {
        RSAAlgorithm rSAAlgorithm;
        if (i == -262) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] values = RSAAlgorithm.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (EC2Algorithm eC2Algorithm : EC2Algorithm.values()) {
                        if (eC2Algorithm.zzb == i) {
                            rSAAlgorithm = eC2Algorithm;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Algorithm with COSE value ", " not supported"));
                }
                RSAAlgorithm rSAAlgorithm2 = values[i2];
                if (rSAAlgorithm2.zzb == i) {
                    rSAAlgorithm = rSAAlgorithm2;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.zza), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
