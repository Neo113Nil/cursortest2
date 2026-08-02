package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzea implements zzfk {
    public static final zzea zza = new zzea(0);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzea(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r14[r12] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(int i, int i2, int i3, byte[] bArr) {
        int i4;
        int i5;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b = (byte) i;
            if (b < -32) {
                if (b >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            int i6 = ~(i >> 8);
            if (b < -16) {
                byte b2 = (byte) i6;
                if (b2 == 0) {
                    int i7 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (i7 >= i3) {
                        return zzhe.zzh(b, b3);
                    }
                    i2 = i7;
                    b2 = b3;
                }
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            byte b4 = (byte) i6;
            if (b4 == 0) {
                int i8 = i2 + 1;
                b4 = bArr[i2];
                if (i8 >= i3) {
                    return zzhe.zzh(b, b4);
                }
                i2 = i8;
                i4 = 0;
            } else {
                i4 = i >> 16;
            }
            if (i4 == 0) {
                int i9 = i2 + 1;
                byte b5 = bArr[i2];
                if (i9 >= i3) {
                    zzea zzeaVar = zzhe.zzb;
                    if (b > -12 || b4 > -65 || b5 > -65) {
                        return -1;
                    }
                    return ((b4 << 8) ^ b) ^ (b5 << 16);
                }
                i2 = i9;
                i4 = b5;
            }
            if (b4 <= -65) {
                if ((((b4 + 112) + (b << 28)) >> 30) == 0 && i4 <= -65) {
                    i5 = i2 + 1;
                }
            }
            return -1;
        }
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 < i3) {
            while (i2 < i3) {
                int i10 = i2 + 1;
                byte b6 = bArr[i2];
                if (b6 < 0) {
                    if (b6 < -32) {
                        if (i10 >= i3) {
                            return b6;
                        }
                        if (b6 >= -62) {
                            i2 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b6 < -16) {
                        if (i10 >= i3 - 1) {
                            return zzhe.zzc(i10, i3, bArr);
                        }
                        int i11 = i2 + 2;
                        byte b7 = bArr[i10];
                        if (b7 <= -65 && ((b6 != -32 || b7 >= -96) && (b6 != -19 || b7 < -96))) {
                            i2 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i3 - 2) {
                        return zzhe.zzc(i10, i3, bArr);
                    }
                    int i12 = i2 + 2;
                    byte b8 = bArr[i10];
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b6 << 28)) >> 30) == 0) {
                            int i13 = i2 + 3;
                            if (bArr[i12] <= -65) {
                                i2 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i2 = i10;
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public zzfw zzb(Class cls) {
        switch (this.$r8$classId) {
            case 0:
                if (!zzeh.class.isAssignableFrom(cls)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (zzfw) zzeh.zzJ(cls.asSubclass(zzeh.class)).zzg(3, null);
                } catch (Exception e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("Unable to get message info for ".concat(cls.getName()), (Throwable) e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfk
    public boolean zzc(Class cls) {
        switch (this.$r8$classId) {
            case 0:
                return zzeh.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    public static void zzb(zzfe zzfeVar, Map.Entry entry) {
        zzee zzeeVar = (zzee) entry.getKey();
        zzhf zzhfVar = zzhf.zzj;
        zzeeVar.getClass();
        throw null;
    }

    public static final zzfg zza(Object obj, Object obj2) {
        zzfg zzfgVar = (zzfg) obj;
        zzfg zzfgVar2 = (zzfg) obj2;
        if (!zzfgVar2.isEmpty()) {
            if (!zzfgVar.zzb) {
                if (zzfgVar.isEmpty()) {
                    zzfgVar = new zzfg();
                } else {
                    zzfg zzfgVar3 = new zzfg(zzfgVar);
                    zzfgVar3.zzb = true;
                    zzfgVar = zzfgVar3;
                }
            }
            zzfgVar.zzg();
            if (!zzfgVar2.isEmpty()) {
                zzfgVar.putAll(zzfgVar2);
            }
        }
        return zzfgVar;
    }
}
