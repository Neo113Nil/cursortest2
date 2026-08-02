package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import com.google.common.io.BaseEncoding$Base64Encoding;
import com.google.common.io.BaseEncoding$StandardBaseEncoding;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbsn {
    public static final BaseEncoding$Base64Encoding zzb;
    public Object[] zzd;
    public int zze;
    public static final Logger zzc = Logger.getLogger(zzbsn.class.getName());
    public static final zzbsg zza = new zzbsg();

    static {
        BaseEncoding$Base64Encoding baseEncoding$Base64Encoding = BaseEncoding$StandardBaseEncoding.BASE64;
        if (baseEncoding$Base64Encoding.paddingChar != null) {
            baseEncoding$Base64Encoding = new BaseEncoding$Base64Encoding(baseEncoding$Base64Encoding.alphabet, (Character) null);
        }
        zzb = baseEncoding$Base64Encoding;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.zze; i++) {
            if (i != 0) {
                sb.append(',');
            }
            int i2 = i + i;
            byte[] bArr = (byte[]) this.zzd[i2];
            Charset charset = StandardCharsets.US_ASCII;
            String str = new String(bArr, charset);
            sb.append(str);
            sb.append('=');
            boolean endsWith = str.endsWith("-bin");
            Object[] objArr = this.zzd;
            if (endsWith) {
                Object obj = objArr[i2 + 1];
                if (!(obj instanceof byte[])) {
                    throw Boxes$$ExternalSyntheticOutline1.m(obj);
                }
                sb.append(zzb.encode((byte[]) obj));
            } else {
                Object obj2 = objArr[i2 + 1];
                if (!(obj2 instanceof byte[])) {
                    throw Boxes$$ExternalSyntheticOutline1.m(obj2);
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final Object zzb(zzbsj zzbsjVar) {
        int i;
        int i2 = this.zze;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
            i = i2 + i2;
        } while (!Arrays.equals(zzbsjVar.zze, (byte[]) this.zzd[i]));
        Object obj = this.zzd[i + 1];
        if (obj instanceof byte[]) {
            return zzbsjVar.zzb((byte[]) obj);
        }
        throw Boxes$$ExternalSyntheticOutline1.m(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 == (r1 != null ? r1.length : 0)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(zzbsj zzbsjVar, Object obj) {
        Trace.checkNotNull(zzbsjVar, "key");
        Trace.checkNotNull(obj, "value");
        int i = this.zze;
        int i2 = i + i;
        if (i2 != 0) {
            Object[] objArr = this.zzd;
        }
        zzm(Math.max(i2 + i2, 8));
        int i3 = this.zze;
        int i4 = i3 + i3;
        this.zzd[i4] = zzbsjVar.zze;
        this.zzd[i4 + 1] = zzbsjVar.zza(obj);
        this.zze++;
    }

    public final void zzd(zzbsj zzbsjVar) {
        if (this.zze == 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.zze;
            if (i >= i3) {
                Arrays.fill(this.zzd, i2 + i2, i3 + i3, (Object) null);
                this.zze = i2;
                return;
            }
            int i4 = i + i;
            if (!Arrays.equals(zzbsjVar.zze, (byte[]) this.zzd[i4])) {
                int i5 = i2 + i2;
                Object[] objArr = this.zzd;
                objArr[i5] = (byte[]) objArr[i4];
                Object obj = objArr[i4 + 1];
                if (objArr instanceof byte[][]) {
                    zzm(objArr != null ? objArr.length : 0);
                }
                this.zzd[i5 + 1] = obj;
                i2++;
            }
            i++;
        }
    }

    public final void zzf(zzbsn zzbsnVar) {
        int i = zzbsnVar.zze;
        if (i == 0) {
            return;
        }
        Object[] objArr = this.zzd;
        int length = objArr != null ? objArr.length : 0;
        int i2 = this.zze;
        int i3 = i2 + i2;
        int i4 = length - i3;
        if (i2 == 0 || i4 < i + i) {
            zzm(i + i + i3);
        }
        Object[] objArr2 = zzbsnVar.zzd;
        Object[] objArr3 = this.zzd;
        int i5 = this.zze;
        int i6 = zzbsnVar.zze;
        System.arraycopy(objArr2, 0, objArr3, i5 + i5, i6 + i6);
        this.zze += zzbsnVar.zze;
    }

    public final void zzm(int i) {
        Object[] objArr = new Object[i];
        int i2 = this.zze;
        if (i2 != 0) {
            System.arraycopy(this.zzd, 0, objArr, 0, i2 + i2);
        }
        this.zzd = objArr;
    }
}
