package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzano {
    public static final zzano zza = new zzano(0, new int[0], new Object[0], false);
    public int zzb;
    public int[] zzc;
    public Object[] zzd;
    public boolean zze;

    public zzano(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z;
    }

    public static zzano zzd() {
        return new zzano(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzano)) {
            zzano zzanoVar = (zzano) obj;
            int i = this.zzb;
            if (i == zzanoVar.zzb) {
                int[] iArr = this.zzc;
                int[] iArr2 = zzanoVar.zzc;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.zzd;
                        Object[] objArr2 = zzanoVar.zzd;
                        int i3 = this.zzb;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    }
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int m$1 = Fragment$5$$ExternalSyntheticOutline0.m$1(i2, 31, i4, 31);
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return m$1 + i3;
    }

    public final void zzh(int i, Object obj) {
        if (!this.zze) {
            OptionalProvider$$ExternalSyntheticLambda0.m();
            return;
        }
        zzi(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzi(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }
}
