package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.PagingConfig;
import com.google.android.gms.internal.time.zzei;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class zzuh implements Closeable {
    public final UUID zza;
    public final String zzb;
    public final String zzc;

    public zzuh(String str, UUID uuid, String str2, zzvd zzvdVar) {
        this.zzc = str;
        this.zza = uuid;
        this.zzb = str2;
        zzvdVar.getClass();
        Thread.currentThread();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzvd zzd = zzur.zzd();
        zzuh zzuhVar = zzd.zzb;
        String str = this.zzc;
        if (zzuhVar == null) {
            throw new zzuo(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == zzuhVar) {
            zzur.zzc(zzd, null);
            return;
        }
        String str2 = zzuhVar.zzc;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new zzup(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x023a, code lost:
    
        if ((r7 * r9) < r8) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0091, code lost:
    
        r14 = r15.zzd;
        r15 = java.lang.Integer.valueOf(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009b, code lost:
    
        if (r14.containsKey(r15) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009d, code lost:
    
        ((com.google.android.libraries.places.internal.zzva) r1.zzb).zzd.put(r15, new com.google.android.libraries.places.internal.zzva(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if (r13 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ad, code lost:
    
        r13.zzc = (com.google.android.libraries.places.internal.zzva) r1.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
    
        if (r13 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        r13.zzc = (com.google.android.libraries.places.internal.zzva) r1.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c4, code lost:
    
        r1.zzb$1 = r7;
        r1.zzc$1 += r6;
        r1.zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c4, code lost:
    
        if (r1.zzf(r12, r13, r14, (r14 + r13) - r12) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        int i;
        int i2;
        PagingConfig pagingConfig;
        zzva zzvaVar;
        zzuz zzuzVar;
        String str;
        AtomicReference atomicReference = zzur.zzc;
        int i3 = 0;
        int i4 = 0;
        for (zzuh zzuhVar = this; zzuhVar != null; zzuhVar = null) {
            i4 += zzuhVar.zzc.length();
            i3++;
        }
        if (i3 > 250) {
            int i5 = i3 - 1;
            String[] strArr = new String[i3];
            zzuh zzuhVar2 = this;
            while (i5 >= 0) {
                strArr[i5] = zzuhVar2.zzc;
                i5--;
                zzuhVar2 = null;
            }
            StatusLine builder = RegularImmutableMap.builder();
            UnmodifiableIterator it = ImmutableSet.copyOf(strArr).iterator();
            int i6 = 0;
            while (it.hasNext()) {
                builder.put(it.next(), Integer.valueOf(i6));
                i6++;
            }
            int i7 = 1;
            RegularImmutableMap build = builder.build(true);
            int i8 = build.size;
            int i9 = i3 >> 2;
            if (i8 <= i9) {
                int i10 = i3 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i3; i11++) {
                    iArr[i11] = ((Integer) build.get(strArr[i11])).intValue();
                }
                iArr[i3] = i8;
                zzei zzeiVar = new zzei(iArr, 3);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    zzeiVar.zzc += i7;
                    int i14 = iArr[i12];
                    while (true) {
                        zzva zzvaVar2 = null;
                        while (true) {
                            if (zzeiVar.zzc <= 0) {
                                break;
                            }
                            int i15 = zzeiVar.zzc$1;
                            zzva zzvaVar3 = (zzva) zzeiVar.zzb;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((zzva) zzvaVar3.zzd.get(Integer.valueOf(iArr[zzeiVar.zzb$1]))).zza;
                            int i17 = zzeiVar.zzc$1;
                            if (iArr[i16 + i17] == i14) {
                                if (zzvaVar2 != null) {
                                    zzvaVar2.zzc = (zzva) zzeiVar.zzb;
                                }
                                zzeiVar.zzc$1 = i17 + 1;
                                zzeiVar.zzb();
                            } else {
                                zzva zzvaVar4 = (zzva) ((zzva) zzeiVar.zzb).zzd.get(Integer.valueOf(iArr[zzeiVar.zzb$1]));
                                int i18 = i7;
                                int i19 = zzvaVar4.zza;
                                zzva zzvaVar5 = new zzva(i19, zzeiVar.zzc$1 + i19 + i13);
                                ((zzva) zzeiVar.zzb).zzd.put(Integer.valueOf(iArr[zzeiVar.zzb$1]), zzvaVar5);
                                int i20 = zzvaVar5.zzb + 1;
                                Integer valueOf = Integer.valueOf(iArr[i20]);
                                int i21 = i13;
                                HashMap hashMap = zzvaVar5.zzd;
                                hashMap.put(valueOf, zzvaVar4);
                                zzvaVar4.zza = i20;
                                if (zzvaVar2 != null) {
                                    zzvaVar2.zzc = zzvaVar5;
                                }
                                hashMap.put(Integer.valueOf(i14), new zzva(i12, 1073741824));
                                zzeiVar.zzc--;
                                zzeiVar.zzc();
                                zzvaVar2 = zzvaVar5;
                                i7 = i18;
                                i13 = i21;
                            }
                        }
                        zzeiVar.zzc += i13;
                        zzeiVar.zzc();
                    }
                    i12++;
                    i7 = i7;
                }
                int i22 = i7;
                ArrayDeque arrayDeque = new ArrayDeque();
                zzva zzvaVar6 = (zzva) zzeiVar.zza;
                zzuz zzuzVar2 = new zzuz(zzvaVar6, 0, -1, -1);
                arrayDeque.push(zzuzVar2);
                while (!arrayDeque.isEmpty()) {
                    zzuz zzuzVar3 = (zzuz) arrayDeque.pop();
                    for (zzva zzvaVar7 : zzuzVar3.zzd.zzd.values()) {
                        int i23 = zzuzVar3.zzb;
                        int i24 = zzuzVar3.zzc;
                        int i25 = zzvaVar7.zza;
                        int i26 = zzvaVar7.zzb;
                        if (zzeiVar.zzf(i23, i24, i25, i26)) {
                            zzvaVar = zzvaVar6;
                        } else {
                            if (zzvaVar7.zzd.isEmpty()) {
                                int i27 = zzvaVar7.zza;
                                zzvaVar = zzvaVar6;
                            } else {
                                zzvaVar = zzvaVar6;
                            }
                            zzuzVar = new zzuz(zzvaVar7, i22, zzvaVar7.zza, i26);
                            if (zzuzVar2.zza >= zzuzVar.zza) {
                                zzuzVar2 = zzuzVar;
                            }
                            arrayDeque.push(zzuzVar);
                            zzvaVar6 = zzvaVar;
                            i22 = 1;
                        }
                        zzuzVar = new zzuz(zzvaVar7, zzuzVar3.zza + i22, i23, i24);
                        if (zzuzVar2.zza >= zzuzVar.zza) {
                        }
                        arrayDeque.push(zzuzVar);
                        zzvaVar6 = zzvaVar;
                        i22 = 1;
                    }
                    i22 = 1;
                }
                int min = Math.min(iArr.length, zzuzVar2.zzc + 1);
                int i28 = 0;
                loop9: while (true) {
                    i = zzuzVar2.zzb;
                    i2 = min - i;
                    zzvaVar6 = (zzva) zzvaVar6.zzd.get(Integer.valueOf(iArr[(i28 % i2) + i]));
                    if (zzvaVar6 == null) {
                        break;
                    }
                    for (int i29 = zzvaVar6.zza; i29 < zzvaVar6.zzb + 1 && i29 < iArr.length; i29++) {
                        if (iArr[(i28 % i2) + i] != iArr[i29]) {
                            break loop9;
                        }
                        i28++;
                    }
                }
                int i30 = i28 / i2;
                pagingConfig = new PagingConfig(i, min, i30);
            }
            pagingConfig = null;
            str = "";
            if (pagingConfig != null) {
                int i31 = pagingConfig.pageSize;
                String concat = i31 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i31))).concat(" -> ") : "";
                int i32 = pagingConfig.prefetchDistance;
                int i33 = pagingConfig.initialLoadSize;
                int i34 = ((i32 - i31) * i33) + i31;
                str = i34 < i3 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i34, i3)))) : "";
                String join = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i31, i32));
                Locale locale = Locale.US;
                str = concat + "{" + join + "}x" + i33 + str;
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[i4];
        for (zzuh zzuhVar3 = this; zzuhVar3 != null; zzuhVar3 = null) {
            String str2 = zzuhVar3.zzc;
            i4 -= str2.length();
            str2.getChars(0, str2.length(), cArr, i4);
        }
        return new String(cArr);
    }

    public abstract zzuy zzg();
}
