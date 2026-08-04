package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.UByte;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.1.1 */
/* JADX INFO: loaded from: classes.dex */
final class zzdp extends zzcr {
    static final zzcr zza = new zzdp(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzdp(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static zzdp zzg(int i, Object[] objArr, zzcq zzcqVar) {
        boolean z;
        int i2;
        char c;
        ?? r3;
        char c2;
        short[] sArr;
        boolean z2;
        int i3;
        ?? r16;
        boolean z3;
        ?? r4;
        Object[] objArr2;
        zzcp zzcpVar;
        boolean z4;
        int i4 = i;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return (zzdp) zza;
        }
        zzcp zzcpVar2 = null;
        ?? r5 = 0;
        zzcp zzcpVar3 = null;
        zzcp zzcpVar4 = null;
        boolean z5 = false;
        int i5 = 1;
        if (i4 == 1) {
            zzbw.zzb(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
            return new zzdp(null, objArrCopyOf, 1);
        }
        zzbe.zzb(i4, objArrCopyOf.length >> 1, "index");
        int iZzh = zzcv.zzh(i4);
        char c3 = 2;
        if (i4 != 1) {
            int i6 = iZzh - 1;
            if (iZzh <= 128) {
                byte[] bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i7 = 0;
                int i8 = 0;
                while (i7 < i4) {
                    int i9 = i8 + i8;
                    int i10 = i7 + i7;
                    Object objRequireNonNull = Objects.requireNonNull(objArrCopyOf[i10]);
                    Object objRequireNonNull2 = Objects.requireNonNull(objArrCopyOf[i10 ^ i5]);
                    zzbw.zzb(objRequireNonNull, objRequireNonNull2);
                    int iZza = zzcg.zza(objRequireNonNull.hashCode());
                    while (true) {
                        int i11 = iZza & i6;
                        z2 = z5;
                        i3 = i5;
                        int i12 = bArr[i11] & UByte.MAX_VALUE;
                        if (i12 == 255) {
                            bArr[i11] = (byte) i9;
                            if (i8 < i7) {
                                objArrCopyOf[i9] = objRequireNonNull;
                                objArrCopyOf[i9 ^ 1] = objRequireNonNull2;
                            }
                            i8++;
                            break;
                        }
                        if (objRequireNonNull.equals(objArrCopyOf[i12 == true ? 1 : 0])) {
                            int i13 = ~i12;
                            zzcp zzcpVar5 = new zzcp(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArrCopyOf[i13 == true ? 1 : 0]));
                            objArrCopyOf[i13 == true ? 1 : 0] = objRequireNonNull2;
                            zzcpVar3 = zzcpVar5;
                            break;
                        }
                        iZza = i11 + 1;
                        z5 = z2;
                        i5 = i3;
                    }
                    i7++;
                    z5 = z2;
                    i5 = i3;
                }
                z = z5;
                i2 = i5;
                if (i8 == i4) {
                    r5 = bArr;
                    z4 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[i2] = Integer.valueOf(i8);
                    sArr[2] = zzcpVar3;
                    r5 = sArr;
                    z4 = z;
                }
            } else {
                z = false;
                i2 = 1;
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i14 = 0;
                    for (int i15 = 0; i15 < i4; i15++) {
                        int i16 = i14 + i14;
                        int i17 = i15 + i15;
                        Object objRequireNonNull3 = Objects.requireNonNull(objArrCopyOf[i17]);
                        Object objRequireNonNull4 = Objects.requireNonNull(objArrCopyOf[i17 ^ 1]);
                        zzbw.zzb(objRequireNonNull3, objRequireNonNull4);
                        int iZza2 = zzcg.zza(objRequireNonNull3.hashCode());
                        while (true) {
                            int i18 = iZza2 & i6;
                            char c4 = (char) sArr[i18];
                            if (c4 == 65535) {
                                sArr[i18] = (short) i16;
                                if (i14 < i15) {
                                    objArrCopyOf[i16] = objRequireNonNull3;
                                    objArrCopyOf[i16 ^ 1] = objRequireNonNull4;
                                }
                                i14++;
                                break;
                            }
                            if (objRequireNonNull3.equals(objArrCopyOf[c4])) {
                                int i19 = c4 ^ 1;
                                zzcp zzcpVar6 = new zzcp(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArrCopyOf[i19 == true ? 1 : 0]));
                                objArrCopyOf[i19 == true ? 1 : 0] = objRequireNonNull4;
                                zzcpVar4 = zzcpVar6;
                                break;
                            }
                            iZza2 = i18 + 1;
                        }
                    }
                    if (i14 == i4) {
                        r5 = sArr;
                        z4 = z;
                    } else {
                        r5 = new Object[]{sArr, Integer.valueOf(i14), zzcpVar4};
                        z4 = z;
                    }
                } else {
                    int[] iArr = new int[iZzh];
                    Arrays.fill(iArr, -1);
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < i4) {
                        int i22 = i21 + i21;
                        int i23 = i20 + i20;
                        Object objRequireNonNull5 = Objects.requireNonNull(objArrCopyOf[i23]);
                        Object objRequireNonNull6 = Objects.requireNonNull(objArrCopyOf[i23 ^ 1]);
                        zzbw.zzb(objRequireNonNull5, objRequireNonNull6);
                        int iZza3 = zzcg.zza(objRequireNonNull5.hashCode());
                        while (true) {
                            int i24 = iZza3 & i6;
                            int i25 = iArr[i24];
                            if (i25 == -1) {
                                iArr[i24] = i22;
                                if (i21 < i20) {
                                    objArrCopyOf[i22] = objRequireNonNull5;
                                    objArrCopyOf[i22 ^ 1] = objRequireNonNull6;
                                }
                                i21++;
                                c2 = c3;
                                break;
                            }
                            c2 = c3;
                            if (objRequireNonNull5.equals(objArrCopyOf[i25])) {
                                int i26 = i25 ^ 1;
                                zzcp zzcpVar7 = new zzcp(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArrCopyOf[i26]));
                                objArrCopyOf[i26] = objRequireNonNull6;
                                zzcpVar2 = zzcpVar7;
                                break;
                            }
                            iZza3 = i24 + 1;
                            c3 = c2;
                        }
                        i20++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i21 == i4) {
                        r3 = iArr;
                        r16 = z;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i21);
                        objArr3[c] = zzcpVar2;
                        r3 = objArr3;
                        r16 = z;
                    }
                }
            }
            z3 = r3 instanceof Object[];
            r4 = r3;
            if (z3) {
                objArr2 = (Object[]) r3;
                zzcpVar = (zzcp) objArr2[c];
                if (zzcqVar != null) {
                    throw zzcpVar.zza();
                }
                zzcqVar.zzc = zzcpVar;
                Object obj = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i2]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r4 = obj;
                i4 = iIntValue;
            }
            return new zzdp(r4, objArrCopyOf, i4);
        }
        zzbw.zzb(Objects.requireNonNull(objArrCopyOf[0]), Objects.requireNonNull(objArrCopyOf[1]));
        z4 = false;
        i4 = 1;
        i2 = 1;
        c = 2;
        r3 = r5;
        r16 = z4;
        z3 = r3 instanceof Object[];
        r4 = r3;
        if (z3) {
            objArr2 = (Object[]) r3;
            zzcpVar = (zzcp) objArr2[c];
            if (zzcqVar != null) {
                throw zzcpVar.zza();
            }
            zzcqVar.zzc = zzcpVar;
            Object obj2 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i2]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r4 = obj2;
            i4 = iIntValue2;
        }
        return new zzdp(r4, objArrCopyOf, i4);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzcr, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object objRequireNonNull;
        if (obj == null) {
            objRequireNonNull = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i != 1) {
                Object obj2 = this.zzc;
                if (obj2 == null) {
                    objRequireNonNull = null;
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int iZza = zzcg.zza(obj.hashCode());
                    while (true) {
                        int i2 = iZza & length;
                        int i3 = bArr[i2] & UByte.MAX_VALUE;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            objRequireNonNull = objArr[i3 ^ 1];
                        } else {
                            iZza = i2 + 1;
                        }
                    }
                    objRequireNonNull = null;
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzcg.zza(obj.hashCode());
                    while (true) {
                        int i4 = iZza2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            objRequireNonNull = objArr[c ^ 1];
                        } else {
                            iZza2 = i4 + 1;
                        }
                    }
                    objRequireNonNull = null;
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzcg.zza(obj.hashCode());
                    while (true) {
                        int i5 = iZza3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            objRequireNonNull = objArr[i6 ^ 1];
                        } else {
                            iZza3 = i5 + 1;
                        }
                    }
                    objRequireNonNull = null;
                }
            } else if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                objRequireNonNull = Objects.requireNonNull(objArr[1]);
            } else {
                objRequireNonNull = null;
            }
        }
        if (objRequireNonNull == null) {
            return null;
        }
        return objRequireNonNull;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    final zzcj zza() {
        return new zzdo(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    final zzcv zzd() {
        return new zzdm(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    final zzcv zze() {
        return new zzdn(this, new zzdo(this.zzb, 0, this.zzd));
    }
}
