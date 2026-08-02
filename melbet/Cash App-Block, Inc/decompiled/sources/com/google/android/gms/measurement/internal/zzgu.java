package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes.dex */
public final class zzgu extends zzjf {
    public char zza;
    public long zzb;
    public String zzc;
    public final zzgs zzd;
    public final zzgs zze;
    public final zzgs zzf;
    public final zzgs zzg;
    public final zzgs zzh;
    public final zzgs zzi;
    public final zzgs zzj;
    public final zzgs zzk;
    public final zzgs zzl;

    public zzgu(zzic zzicVar) {
        super(zzicVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzgs(this, 6, false, false);
        this.zze = new zzgs(this, 6, true, false);
        this.zzf = new zzgs(this, 6, false, true);
        this.zzg = new zzgs(this, 5, false, false);
        this.zzh = new zzgs(this, 5, true, false);
        this.zzi = new zzgs(this, 5, false, true);
        this.zzj = new zzgs(this, 4, false, false);
        this.zzk = new zzgs(this, 3, false, false);
        this.zzl = new zzgs(this, 2, false, false);
    }

    public static zzgt zzl(String str) {
        if (str == null) {
            return null;
        }
        return new zzgt(str);
    }

    public static String zzo(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String zzp = zzp(obj, z);
        String zzp2 = zzp(obj2, z);
        String zzp3 = zzp(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb.append(str2);
            sb.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb.append(str3);
            sb.append(zzp3);
        }
        return sb.toString();
    }

    public static String zzp(Object obj, boolean z) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            String str = charAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(str.length() + length + 3, String.valueOf(round2).length(), str));
            Boxes$$ExternalSyntheticOutline1.m1151m(round, str, "...", sb);
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof zzgt ? ((zzgt) obj).zza() : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = zzic.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        return false;
    }

    public final zzgs zzb() {
        return this.zzd;
    }

    public final zzgs zze() {
        return this.zzg;
    }

    public final zzgs zzj() {
        return this.zzk;
    }

    public final zzgs zzk() {
        return this.zzl;
    }

    public final void zzm(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzn(), i)) {
            Log.println(i, zzn(), zzo(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        zzae.checkNotNull(str);
        zzhz zzhzVar = ((zzic) this.$$delegate_0).zzj;
        if (zzhzVar == null) {
            Log.println(6, zzn(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!((zzjf) zzhzVar).zza) {
                Log.println(6, zzn(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            zzhzVar.zzj(new zzgr(this, i, str, obj, obj2, obj3));
        }
    }

    public final String zzn() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    ((zzic) ((zzic) this.$$delegate_0).zzg.$$delegate_0).getClass();
                    this.zzc = "FA";
                }
                zzae.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
