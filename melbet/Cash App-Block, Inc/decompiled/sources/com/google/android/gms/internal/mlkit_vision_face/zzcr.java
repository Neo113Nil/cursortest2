package com.google.android.gms.internal.mlkit_vision_face;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class zzcr extends OutputStream {
    public final /* synthetic */ int $r8$classId;
    public long zza;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        int length2;
        int i4;
        int length3;
        int i5;
        int length4;
        int i6;
        int length5;
        int i7;
        int i8;
        switch (this.$r8$classId) {
            case 0:
                if (i >= 0 && i <= (length = bArr.length) && i2 >= 0 && (i3 = i + i2) <= length && i3 >= 0) {
                    this.zza += i2;
                    break;
                } else {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    break;
                }
                break;
            case 1:
                if (i >= 0 && i <= (length2 = bArr.length) && i2 >= 0 && (i4 = i + i2) <= length2 && i4 >= 0) {
                    this.zza += i2;
                    break;
                } else {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    break;
                }
                break;
            case 2:
                if (i >= 0 && i <= (length3 = bArr.length) && i2 >= 0 && (i5 = i + i2) <= length3 && i5 >= 0) {
                    this.zza += i2;
                    break;
                } else {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    break;
                }
                break;
            case 3:
                if (i >= 0 && i <= (length4 = bArr.length) && i2 >= 0 && (i6 = i + i2) <= length4 && i6 >= 0) {
                    this.zza += i2;
                    break;
                } else {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    break;
                }
                break;
            case 4:
                if (i >= 0 && i <= (length5 = bArr.length) && i2 >= 0 && (i7 = i + i2) <= length5 && i7 >= 0) {
                    this.zza += i2;
                    break;
                } else {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    break;
                }
            default:
                if (i >= 0 && i <= bArr.length && i2 >= 0 && (i8 = i + i2) <= bArr.length && i8 >= 0) {
                    this.zza += i2;
                    break;
                } else {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    break;
                }
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.$r8$classId) {
            case 0:
                this.zza += bArr.length;
                break;
            case 1:
                this.zza += bArr.length;
                break;
            case 2:
                this.zza += bArr.length;
                break;
            case 3:
                this.zza += bArr.length;
                break;
            case 4:
                this.zza += bArr.length;
                break;
            default:
                this.zza += bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.$r8$classId) {
            case 0:
                this.zza++;
                break;
            case 1:
                this.zza++;
                break;
            case 2:
                this.zza++;
                break;
            case 3:
                this.zza++;
                break;
            case 4:
                this.zza++;
                break;
            default:
                this.zza++;
                break;
        }
    }
}
