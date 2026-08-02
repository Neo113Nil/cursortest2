package com.google.android.gms.internal.time;

import android.util.SparseArray;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.emoji2.text.MetadataRepo;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import androidx.paging.PagingConfig;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzwm;
import com.google.android.gms.internal.measurement.zzwn;
import com.google.android.libraries.places.internal.zzva;
import com.plaid.internal.EnumC0170g;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzei {
    public final /* synthetic */ int $r8$classId;
    public Object zza;
    public final Object zza$1;
    public Object zzb;
    public int zzb$1;
    public int zzc;
    public int zzc$1;

    public zzei(int[] iArr, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 3:
                this.zza$1 = iArr;
                zzva zzvaVar = new zzva(-1, -1);
                this.zza = zzvaVar;
                this.zzb = zzvaVar;
                break;
            default:
                this.zza$1 = iArr;
                zzwn zzwnVar = new zzwn(-1, -1);
                this.zza = zzwnVar;
                this.zzb = zzwnVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0026, code lost:
    
        r6 = r7.zzd;
        r7 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        if (r6.containsKey(r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        ((com.google.android.gms.internal.measurement.zzwn) r0.zzb).zzd.put(r7, new com.google.android.gms.internal.measurement.zzwn(r1, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        r5.zzc = (com.google.android.gms.internal.measurement.zzwn) r0.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        r5.zzc = (com.google.android.gms.internal.measurement.zzwn) r0.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        r0.zzb$1 = r1;
        r0.zzc$1++;
        r0.zzb();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzei zza(int[] iArr) {
        zzei zzeiVar = new zzei(iArr, 2);
        int i = 0;
        while (i < iArr.length) {
            zzeiVar.zzc++;
            int[] iArr2 = (int[]) zzeiVar.zza$1;
            int i2 = iArr2[i];
            while (true) {
                zzwn zzwnVar = null;
                while (true) {
                    if (zzeiVar.zzc > 0) {
                        int i3 = zzeiVar.zzc$1;
                        zzwn zzwnVar2 = (zzwn) zzeiVar.zzb;
                        if (i3 == 0) {
                            break;
                        }
                        int i4 = ((zzwn) zzwnVar2.zzd.get(Integer.valueOf(iArr2[zzeiVar.zzb$1]))).zza;
                        int i5 = zzeiVar.zzc$1;
                        if (iArr2[i4 + i5] == i2) {
                            if (zzwnVar != null) {
                                zzwnVar.zzc = (zzwn) zzeiVar.zzb;
                            }
                            zzeiVar.zzc$1 = i5 + 1;
                            zzeiVar.zzb();
                        } else {
                            zzwn zzwnVar3 = (zzwn) ((zzwn) zzeiVar.zzb).zzd.get(Integer.valueOf(iArr2[zzeiVar.zzb$1]));
                            zzwn zzwnVar4 = new zzwn(zzwnVar3.zza, (zzeiVar.zzc$1 + r9) - 1);
                            ((zzwn) zzeiVar.zzb).zzd.put(Integer.valueOf(iArr2[zzeiVar.zzb$1]), zzwnVar4);
                            int i6 = zzwnVar4.zzb + 1;
                            Integer valueOf = Integer.valueOf(iArr2[i6]);
                            HashMap hashMap = zzwnVar4.zzd;
                            hashMap.put(valueOf, zzwnVar3);
                            zzwnVar3.zza = i6;
                            if (zzwnVar != null) {
                                zzwnVar.zzc = zzwnVar4;
                            }
                            hashMap.put(Integer.valueOf(i2), new zzwn(i, 1073741824));
                            zzeiVar.zzc--;
                            zzeiVar.zzc();
                            zzwnVar = zzwnVar4;
                        }
                    }
                }
                zzeiVar.zzc--;
                zzeiVar.zzc();
            }
            i++;
        }
        return zzeiVar;
    }

    public static void zzm(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(zzer.zza(obj));
        sb.append("]");
    }

    public int check(int i) {
        SparseArray sparseArray = ((MetadataRepo.Node) this.zza).mChildren;
        MetadataRepo.Node node = sparseArray == null ? null : (MetadataRepo.Node) sparseArray.get(i);
        int i2 = 1;
        int i3 = 2;
        if (this.zzb$1 == 2) {
            if (node != null) {
                this.zza = node;
                this.zzc++;
            } else if (i == 65038) {
                reset();
            } else if (i != 65039) {
                MetadataRepo.Node node2 = (MetadataRepo.Node) this.zza;
                if (node2.mData != null) {
                    i3 = 3;
                    if (this.zzc != 1) {
                        this.zzb = node2;
                        reset();
                    } else if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.zzb = (MetadataRepo.Node) this.zza;
                        reset();
                    } else {
                        reset();
                    }
                } else {
                    reset();
                }
            }
            i2 = i3;
        } else if (node == null) {
            reset();
        } else {
            this.zzb$1 = 2;
            this.zza = node;
            this.zzc = 1;
            i2 = i3;
        }
        this.zzc$1 = i;
        return i2;
    }

    public void reset() {
        this.zzb$1 = 1;
        this.zza = (MetadataRepo.Node) this.zza$1;
        this.zzc = 0;
    }

    public boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
        MetadataItem metadataItem = ((MetadataRepo.Node) this.zza).mData.getMetadataItem();
        int __offset = metadataItem.__offset(6);
        return !(__offset == 0 || metadataItem.bb.get(__offset + metadataItem.bb_pos) == 0) || this.zzc$1 == 65039;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 2:
                StringBuilder sb = new StringBuilder("digraph {\n");
                zze((zzwn) this.zza, sb);
                sb.append("}");
                return sb.toString();
            case 3:
                StringBuilder sb2 = new StringBuilder("digraph {\n");
                zze((zzva) this.zza, sb2);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void zzb() {
        int i = this.$r8$classId;
        Object obj = this.zza$1;
        switch (i) {
            case 2:
                if (this.zzc$1 != 0) {
                    int[] iArr = (int[]) obj;
                    zzwn zzwnVar = (zzwn) ((zzwn) this.zzb).zzd.get(Integer.valueOf(iArr[this.zzb$1]));
                    while (true) {
                        int i2 = (zzwnVar.zzb - zzwnVar.zza) + 1;
                        int i3 = this.zzc$1;
                        if (i2 > i3) {
                            break;
                        } else {
                            int i4 = this.zzb$1 + i2;
                            this.zzb$1 = i4;
                            this.zzb = zzwnVar;
                            int i5 = i3 - i2;
                            this.zzc$1 = i5;
                            if (i5 > 0) {
                                zzwnVar = (zzwn) zzwnVar.zzd.get(Integer.valueOf(iArr[i4]));
                            }
                        }
                    }
                }
                break;
            default:
                if (this.zzc$1 != 0) {
                    int[] iArr2 = (int[]) obj;
                    zzva zzvaVar = (zzva) ((zzva) this.zzb).zzd.get(Integer.valueOf(iArr2[this.zzb$1]));
                    while (true) {
                        int i6 = (zzvaVar.zzb - zzvaVar.zza) + 1;
                        int i7 = this.zzc$1;
                        if (i6 > i7) {
                            break;
                        } else {
                            int i8 = this.zzb$1 + i6;
                            this.zzb$1 = i8;
                            this.zzb = zzvaVar;
                            int i9 = i7 - i6;
                            this.zzc$1 = i9;
                            if (i9 > 0) {
                                zzvaVar = (zzva) zzvaVar.zzd.get(Integer.valueOf(iArr2[i8]));
                            }
                        }
                    }
                }
                break;
        }
    }

    public void zzc() {
        switch (this.$r8$classId) {
            case 2:
                zzwn zzwnVar = ((zzwn) this.zzb).zzc;
                if (zzwnVar != null) {
                    this.zzb = zzwnVar;
                } else {
                    this.zzb = (zzwn) this.zza;
                    int i = this.zzc$1;
                    if (i > 0) {
                        this.zzc$1 = i - 1;
                    }
                    if (this.zzc > 0) {
                        this.zzb$1++;
                    }
                }
                zzb();
                break;
            default:
                zzva zzvaVar = ((zzva) this.zzb).zzc;
                if (zzvaVar != null) {
                    this.zzb = zzvaVar;
                } else {
                    this.zzb = (zzva) this.zza;
                    int i2 = this.zzc$1;
                    if (i2 > 0) {
                        this.zzc$1 = i2 - 1;
                    }
                    if (this.zzc > 0) {
                        this.zzb$1++;
                    }
                }
                zzb();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r8 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r8 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzd(Object obj, zzej zzejVar, zzek zzekVar) {
        String simpleName;
        zzek zzekVar2;
        boolean z;
        StringBuilder sb = (StringBuilder) this.zzb;
        int i = zzejVar.zzn;
        String str = zzejVar.zzp;
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = obj instanceof Boolean;
            } else if (ordinal == 2) {
                if (!(obj instanceof Character)) {
                    if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                        z = Character.isValidCodePoint(((Number) obj).intValue());
                    }
                    z = false;
                }
                z = true;
            } else if (ordinal == 3) {
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof Long)) {
                        if (!(obj instanceof Byte)) {
                            if (!(obj instanceof Short)) {
                            }
                        }
                    }
                }
                z = true;
            } else {
                if (ordinal != 4) {
                    throw null;
                }
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                    }
                }
                z = true;
            }
            if (!z) {
                zzm(sb, obj, str);
                return;
            }
        }
        int ordinal2 = zzejVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5) {
                            if (!zzekVar.zzj()) {
                                int i2 = zzekVar.zzc;
                                int i3 = i2 & 128;
                                if (i3 == 0) {
                                    zzekVar2 = zzek.zzb;
                                } else if (i3 != i2 || zzekVar.zzd != -1 || zzekVar.zze != -1) {
                                    zzekVar2 = new zzek(i3, -1, -1);
                                }
                                if (zzekVar2.equals(zzekVar)) {
                                    Number number = (Number) obj;
                                    Locale locale = zzer.zza;
                                    boolean zzk = zzekVar.zzk();
                                    long longValue = number.longValue();
                                    if (number instanceof Long) {
                                        zzer.zzf(sb, longValue, zzk);
                                        return;
                                    }
                                    if (number instanceof Integer) {
                                        zzer.zzf(sb, longValue & BodyPartID.bodyIdMax, zzk);
                                        return;
                                    }
                                    if (number instanceof Byte) {
                                        zzer.zzf(sb, longValue & 255, zzk);
                                        return;
                                    }
                                    if (number instanceof Short) {
                                        zzer.zzf(sb, longValue & 65535, zzk);
                                        return;
                                    }
                                    if (!(number instanceof BigInteger)) {
                                        a$$ExternalSyntheticBUOutline0.m$1("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                        return;
                                    }
                                    String bigInteger = ((BigInteger) number).toString(16);
                                    if (zzk) {
                                        bigInteger = bigInteger.toUpperCase(zzer.zza);
                                    }
                                    sb.append(bigInteger);
                                    return;
                                }
                            }
                            zzekVar2 = zzekVar;
                            if (zzekVar2.equals(zzekVar)) {
                            }
                        }
                    }
                } else if (zzekVar.zzj()) {
                    if (obj instanceof Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (zzekVar.zzj()) {
                sb.append(obj);
                return;
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = zzer.zza;
                int i4 = zzekVar.zzc;
                int i5 = i4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, zzer.zza);
                try {
                    formattable.formatTo(formatter, i5, zzekVar.zzd, zzekVar.zze);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable out = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        out.append(zzer.zzd(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (zzekVar.zzj()) {
                sb.append(zzer.zza(obj));
                return;
            }
        }
        if (!zzekVar.zzj()) {
            int i6 = zzejVar.zzm;
            if (zzekVar.zzk()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder("%");
            zzekVar.zzh(sb2);
            sb2.append((char) i6);
            str = sb2.toString();
        }
        sb.append(String.format(zzer.zza, str, obj));
    }

    public void zze(zzwn zzwnVar, StringBuilder sb) {
        for (zzwn zzwnVar2 : zzwnVar.zzd.values()) {
            sb.append("  ");
            sb.append(zzwnVar);
            sb.append(" -> ");
            sb.append(zzwnVar2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.zza$1;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, zzwnVar2.zza, Math.min(iArr.length, zzwnVar2.zzb + 1))));
            sb.append("\"]\n");
            zze(zzwnVar2, sb);
        }
    }

    public boolean zzf(int i, int i2, int i3, int i4) {
        int i5 = this.$r8$classId;
        Object obj = this.zza$1;
        switch (i5) {
            case 2:
                if (i >= 0 && i3 >= 0) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    int min = Math.min(length, i2);
                    if (min - i == Math.min(length, i4) - i3) {
                        for (int i6 = i; i6 <= min; i6++) {
                            if (iArr[i6] != iArr[(i3 + i6) - i]) {
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                if (i >= 0 && i3 >= 0) {
                    int[] iArr2 = (int[]) obj;
                    int length2 = iArr2.length;
                    int min2 = Math.min(length2, i2);
                    if (min2 - i == Math.min(length2, i4) - i3) {
                        for (int i7 = i; i7 <= min2; i7++) {
                            if (iArr2[i7] != iArr2[(i3 + i7) - i]) {
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public zzei(zzfr zzfrVar, Object[] objArr, StringBuilder sb) {
        this.$r8$classId = 0;
        this.zzb$1 = 0;
        this.zzc$1 = -1;
        zzcw.zza(zzfrVar, "context");
        this.zza$1 = zzfrVar;
        this.zzc = 0;
        this.zza = objArr;
        this.zzb = sb;
    }

    public zzei(MetadataRepo.Node node) {
        this.$r8$classId = 1;
        this.zzb$1 = 1;
        this.zza$1 = node;
        this.zza = node;
    }

    public void zze(zzva zzvaVar, StringBuilder sb) {
        for (zzva zzvaVar2 : zzvaVar.zzd.values()) {
            sb.append("  ");
            sb.append(zzvaVar);
            sb.append(" -> ");
            sb.append(zzvaVar2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.zza$1;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, zzvaVar2.zza, Math.min(iArr.length, zzvaVar2.zzb + 1))));
            sb.append("\"]\n");
            zze(zzvaVar2, sb);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (zzf(r8, r9, r10, (r10 + r9) - r8) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PagingConfig zzd() {
        int i;
        int i2;
        zzwm zzwmVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        zzwn zzwnVar = (zzwn) this.zza;
        int i3 = 0;
        zzwm zzwmVar2 = new zzwm(zzwnVar, 0, -1, -1);
        arrayDeque.push(zzwmVar2);
        while (!arrayDeque.isEmpty()) {
            zzwm zzwmVar3 = (zzwm) arrayDeque.pop();
            for (zzwn zzwnVar2 : zzwmVar3.zzd.zzd.values()) {
                int i4 = zzwmVar3.zzb;
                int i5 = zzwmVar3.zzc;
                int i6 = zzwnVar2.zza;
                int i7 = zzwnVar2.zzb;
                if (!zzf(i4, i5, i6, i7)) {
                    if (zzwnVar2.zzd.isEmpty()) {
                        int i8 = zzwnVar2.zza;
                    }
                    zzwmVar = new zzwm(zzwnVar2, 1, zzwnVar2.zza, i7);
                    if (zzwmVar2.zza >= zzwmVar.zza) {
                        zzwmVar2 = zzwmVar;
                    }
                    arrayDeque.push(zzwmVar);
                }
                zzwmVar = new zzwm(zzwnVar2, zzwmVar3.zza + 1, i4, i5);
                if (zzwmVar2.zza >= zzwmVar.zza) {
                }
                arrayDeque.push(zzwmVar);
            }
        }
        int[] iArr = (int[]) this.zza$1;
        int min = Math.min(iArr.length, zzwmVar2.zzc + 1);
        loop2: while (true) {
            i = zzwmVar2.zzb;
            i2 = min - i;
            zzwnVar = (zzwn) zzwnVar.zzd.get(Integer.valueOf(iArr[(i3 % i2) + i]));
            if (zzwnVar == null) {
                break;
            }
            for (int i9 = zzwnVar.zza; i9 < zzwnVar.zzb + 1 && i9 < iArr.length; i9++) {
                if (iArr[(i3 % i2) + i] != iArr[i9]) {
                    break loop2;
                }
                i3++;
            }
        }
        return new PagingConfig(i, min, i3 / i2);
    }
}
