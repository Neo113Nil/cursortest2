package com.google.android.gms.internal.mlkit_genai_prompt;

import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzanw {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        if (zzanu.zzh && zzanu.zzg) {
            int i = zzaki.$r8$clinit;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(int i, int i2, byte[] bArr) {
        int i3 = i2 - i;
        byte b = bArr[i - 1];
        if (i3 == 0) {
            if (b <= -12) {
                return b;
            }
            return -1;
        }
        if (i3 == 1) {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return (b2 << 8) ^ b;
        }
        if (i3 != 2) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return 0;
        }
        byte b3 = bArr[i];
        byte b4 = bArr[i + 1];
        if (b > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzb(int i, int i2, byte[] bArr) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            int i4 = bArr[i];
            if (i4 >= 0) {
                i = i3;
            } else if (i4 < -32) {
                if (i3 >= i2) {
                    return i4 == 0;
                }
                if (i4 < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i3] > 65471) {
                    return false;
                }
            } else if (i4 < -16) {
                if (i3 >= i2 - 1) {
                    i4 = zza(i3, i2, bArr);
                    if (i4 == 0) {
                    }
                } else {
                    int i5 = i + 2;
                    char c = bArr[i3];
                    if (c > 65471) {
                        return false;
                    }
                    if (i4 == -32 && c < 65440) {
                        return false;
                    }
                    if (i4 == -19 && c >= 65440) {
                        return false;
                    }
                    i += 3;
                    if (bArr[i5] > 65471) {
                        return false;
                    }
                }
            } else if (i3 >= i2 - 2) {
                i4 = zza(i3, i2, bArr);
                if (i4 == 0) {
                }
            } else {
                int i6 = i + 2;
                int i7 = bArr[i3];
                if (i7 > -65) {
                    return false;
                }
                if ((((i7 + 112) + (i4 << 28)) >> 30) != 0) {
                    return false;
                }
                int i8 = i + 3;
                if (bArr[i6] > 65471) {
                    return false;
                }
                i += 4;
                if (bArr[i8] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
