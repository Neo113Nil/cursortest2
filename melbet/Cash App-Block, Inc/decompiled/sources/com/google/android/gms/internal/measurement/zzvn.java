package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.PagingConfig;
import com.google.android.gms.internal.time.zzei;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
public abstract class zzvn implements zzws {
    public final zzvn zza;
    public final UUID zzb;
    public final String zzc;
    public final String zzd;
    public Thread zze;

    public zzvn(String str, zzvn zzvnVar, zzwq zzwqVar) {
        this.zzd = str;
        this.zza = zzvnVar;
        this.zzb = zzvnVar.zzb;
        this.zzc = zzvnVar.zzc;
        this.zze = Thread.currentThread();
    }

    public static String zzcL(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzwq zzd = zzvy.zzd();
        zzws zzwsVar = zzd.zzb;
        String str = this.zzd;
        if (zzwsVar == null) {
            throw new zzvv(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == zzwsVar) {
            zzvy.zzc(zzd, ((zzvn) zzwsVar).zza);
            this.zze = null;
            return;
        }
        String str2 = ((zzvn) zzwsVar).zzd;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
        sb.append(".");
        throw new zzvw(sb.toString());
    }

    public final String toString() {
        String str;
        AtomicReference atomicReference = zzvy.zzd;
        zzvn zzvnVar = this;
        int i = 0;
        int i2 = 0;
        while (zzvnVar != null) {
            i++;
            i2 += zzvnVar.zzd.length();
            zzvnVar = zzvnVar.zza;
            if (zzvnVar != null) {
                i2 += 4;
            }
        }
        if (i > 250) {
            String[] strArr = new String[i];
            zzvn zzvnVar2 = this;
            for (int i3 = i - 1; i3 >= 0; i3--) {
                strArr[i3] = zzvnVar2.zzd;
                zzvnVar2 = zzvnVar2.zza;
            }
            StatusLine builder = RegularImmutableMap.builder();
            UnmodifiableIterator it = ImmutableSet.copyOf(strArr).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                builder.put(it.next(), Integer.valueOf(i4));
                i4++;
            }
            RegularImmutableMap build = builder.build(true);
            int i5 = build.size;
            int i6 = i >> 2;
            PagingConfig pagingConfig = null;
            if (i5 <= i6) {
                int[] iArr = new int[i + 1];
                for (int i7 = 0; i7 < i; i7++) {
                    iArr[i7] = ((Integer) build.get(strArr[i7])).intValue();
                }
                iArr[i] = i5;
                PagingConfig zzd = zzei.zza(iArr).zzd();
                if ((zzd.prefetchDistance - zzd.pageSize) * zzd.initialLoadSize >= i6) {
                    pagingConfig = zzd;
                }
            }
            str = "";
            if (pagingConfig != null) {
                int i8 = pagingConfig.pageSize;
                String concat = i8 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i8))).concat(" -> ") : "";
                int i9 = pagingConfig.prefetchDistance;
                int i10 = pagingConfig.initialLoadSize;
                int i11 = ((i9 - i8) * i10) + i8;
                str = i11 < i ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i11, i)))) : "";
                String join = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i8, i9));
                Locale locale = Locale.US;
                str = concat + "{" + join + "}x" + i10 + str;
            }
            if (!str.isEmpty()) {
                return str;
            }
        }
        char[] cArr = new char[i2];
        while (this != null) {
            String str2 = this.zzd;
            i2 -= str2.length();
            str2.getChars(0, str2.length(), cArr, i2);
            this = this.zza;
            if (this != null) {
                i2 -= 4;
                " -> ".getChars(0, 4, cArr, i2);
            }
        }
        return new String(cArr);
    }

    public zzvn(String str, UUID uuid, String str2, zzwq zzwqVar) {
        this.zzd = str;
        this.zza = null;
        this.zzb = uuid;
        this.zzc = str2;
        zzwqVar.getClass();
        this.zze = Thread.currentThread();
    }
}
