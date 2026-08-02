package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzgbp extends zzgad {
    static final zzgad zza = new zzgbp(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzgbp(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static zzgbp zzj(int i, Object[] objArr, zzgac zzgacVar) {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr2;
        int i2 = i;
        Object[] objArr3 = objArr;
        if (i2 == 0) {
            return (zzgbp) zza;
        }
        Object obj = null;
        int i3 = 1;
        if (i2 == 1) {
            zzfyx.zzb(Objects.requireNonNull(objArr3[0]), Objects.requireNonNull(objArr3[1]));
            return new zzgbp(null, objArr3, 1);
        }
        zzfxe.zzb(i2, objArr3.length >> 1, "index");
        int zzh = zzgaf.zzh(i);
        if (i2 == 1) {
            zzfyx.zzb(Objects.requireNonNull(objArr3[0]), Objects.requireNonNull(objArr3[1]));
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = zzh - 1;
            char c3 = 65535;
            if (zzh <= 128) {
                byte[] bArr = new byte[zzh];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object requireNonNull = Objects.requireNonNull(objArr3[i8]);
                    Object requireNonNull2 = Objects.requireNonNull(objArr3[i8 ^ i3]);
                    zzfyx.zzb(requireNonNull, requireNonNull2);
                    int zza2 = zzfzs.zza(requireNonNull.hashCode());
                    while (true) {
                        int i9 = zza2 & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArr3[i7] = requireNonNull;
                                objArr3[i7 ^ 1] = requireNonNull2;
                            }
                            i6++;
                        } else {
                            if (requireNonNull.equals(objArr3[i10])) {
                                int i11 = i10 ^ 1;
                                zzgab zzgabVar = new zzgab(requireNonNull, requireNonNull2, Objects.requireNonNull(objArr3[i11]));
                                objArr3[i11] = requireNonNull2;
                                obj = zzgabVar;
                                break;
                            }
                            zza2 = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr, Integer.valueOf(i6), obj};
                    c2 = 2;
                    c = 1;
                }
            } else {
                if (zzh <= 32768) {
                    sArr = new short[zzh];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i2; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object requireNonNull3 = Objects.requireNonNull(objArr3[i15]);
                        Object requireNonNull4 = Objects.requireNonNull(objArr3[i15 ^ 1]);
                        zzfyx.zzb(requireNonNull3, requireNonNull4);
                        int zza3 = zzfzs.zza(requireNonNull3.hashCode());
                        while (true) {
                            int i16 = zza3 & i4;
                            char c4 = (char) sArr[i16];
                            if (c4 == 65535) {
                                sArr[i16] = (short) i14;
                                if (i12 < i13) {
                                    objArr3[i14] = requireNonNull3;
                                    objArr3[i14 ^ 1] = requireNonNull4;
                                }
                                i12++;
                            } else {
                                if (requireNonNull3.equals(objArr3[c4])) {
                                    int i17 = c4 ^ 1;
                                    zzgab zzgabVar2 = new zzgab(requireNonNull3, requireNonNull4, Objects.requireNonNull(objArr3[i17]));
                                    objArr3[i17] = requireNonNull4;
                                    obj = zzgabVar2;
                                    break;
                                }
                                zza3 = i16 + 1;
                            }
                        }
                    }
                    if (i12 != i2) {
                        Integer valueOf = Integer.valueOf(i12);
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, valueOf, obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                } else {
                    int i18 = 1;
                    sArr = new int[zzh];
                    Arrays.fill((int[]) sArr, -1);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i2) {
                        int i21 = i20 + i20;
                        int i22 = i19 + i19;
                        Object requireNonNull5 = Objects.requireNonNull(objArr3[i22]);
                        Object requireNonNull6 = Objects.requireNonNull(objArr3[i22 ^ i18]);
                        zzfyx.zzb(requireNonNull5, requireNonNull6);
                        int zza4 = zzfzs.zza(requireNonNull5.hashCode());
                        while (true) {
                            int i23 = zza4 & i4;
                            ?? r15 = sArr[i23];
                            if (r15 == c3) {
                                sArr[i23] = i21;
                                if (i20 < i19) {
                                    objArr3[i21] = requireNonNull5;
                                    objArr3[i21 ^ 1] = requireNonNull6;
                                }
                                i20++;
                            } else {
                                if (requireNonNull5.equals(objArr3[r15])) {
                                    int i24 = r15 ^ 1;
                                    zzgab zzgabVar3 = new zzgab(requireNonNull5, requireNonNull6, Objects.requireNonNull(objArr3[i24]));
                                    objArr3[i24] = requireNonNull6;
                                    obj = zzgabVar3;
                                    break;
                                }
                                zza4 = i23 + 1;
                                c3 = 65535;
                            }
                        }
                        i19++;
                        i18 = 1;
                        c3 = 65535;
                    }
                    if (i20 != i2) {
                        c = 1;
                        c2 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                        obj = objArr2;
                    }
                    obj = sArr;
                }
                c = 1;
            }
            c2 = 2;
            c = 1;
        }
        boolean z = obj instanceof Object[];
        Object obj2 = obj;
        if (z) {
            Object[] objArr4 = (Object[]) obj;
            zzgab zzgabVar4 = (zzgab) objArr4[c2];
            if (zzgacVar == null) {
                throw zzgabVar4.zza();
            }
            zzgacVar.zzc = zzgabVar4;
            Object obj3 = objArr4[0];
            int intValue = ((Integer) objArr4[c]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj2 = obj3;
            i2 = intValue;
        }
        return new zzgbp(obj2, objArr3, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzgad, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj != null) {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i != 1) {
                Object obj3 = this.zzc;
                if (obj3 != null) {
                    if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        int length = bArr.length - 1;
                        int zza2 = zzfzs.zza(obj.hashCode());
                        while (true) {
                            int i2 = zza2 & length;
                            int i3 = bArr[i2] & 255;
                            if (i3 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i3])) {
                                obj2 = objArr[i3 ^ 1];
                                break;
                            }
                            zza2 = i2 + 1;
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        int length2 = sArr.length - 1;
                        int zza3 = zzfzs.zza(obj.hashCode());
                        while (true) {
                            int i4 = zza3 & length2;
                            char c = (char) sArr[i4];
                            if (c == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                                break;
                            }
                            zza3 = i4 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj3;
                        int length3 = iArr.length - 1;
                        int zza4 = zzfzs.zza(obj.hashCode());
                        while (true) {
                            int i5 = zza4 & length3;
                            int i6 = iArr[i5];
                            if (i6 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i6])) {
                                obj2 = objArr[i6 ^ 1];
                                break;
                            }
                            zza4 = i5 + 1;
                        }
                    }
                }
            } else if (Objects.requireNonNull(objArr[0]).equals(obj)) {
                obj2 = Objects.requireNonNull(objArr[1]);
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzfzv zza() {
        return new zzgbo(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzgaf zzf() {
        return new zzgbm(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzgad
    final zzgaf zzg() {
        return new zzgbn(this, new zzgbo(this.zzb, 0, this.zzd));
    }
}
