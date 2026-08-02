package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;

/* loaded from: classes4.dex */
public final class zza {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    public final List zzf;
    public final List zzg;
    public final PendingIntent zzh;
    public final List zzi;

    public zza(int i, int i2, int i3, long j, long j2, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = j2;
        this.zzf = list;
        this.zzg = list2;
        this.zzh = pendingIntent;
        this.zzi = list3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.zza == zzaVar.zza && this.zzb == zzaVar.zzb && this.zzc == zzaVar.zzc && this.zzd == zzaVar.zzd && this.zze == zzaVar.zze) {
                List list = zzaVar.zzf;
                List list2 = this.zzf;
                if (list2 != null ? list2.equals(list) : list == null) {
                    List list3 = zzaVar.zzg;
                    List list4 = this.zzg;
                    if (list4 != null ? list4.equals(list3) : list3 == null) {
                        PendingIntent pendingIntent = zzaVar.zzh;
                        PendingIntent pendingIntent2 = this.zzh;
                        if (pendingIntent2 != null ? pendingIntent2.equals(pendingIntent) : pendingIntent == null) {
                            List list5 = zzaVar.zzi;
                            List list6 = this.zzi;
                            if (list6 != null ? list6.equals(list5) : list5 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
        long j = this.zzd;
        long j2 = j ^ (j >>> 32);
        long j3 = this.zze;
        long j4 = (j3 >>> 32) ^ j3;
        List list = this.zzf;
        int hashCode = ((((((i * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) j4)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.zzg;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.zzh;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.zzi;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzf);
        String valueOf2 = String.valueOf(this.zzg);
        String valueOf3 = String.valueOf(this.zzh);
        String valueOf4 = String.valueOf(this.zzi);
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(this.zza, this.zzb, "SplitInstallSessionState{sessionId=", ", status=", ", errorCode=");
        m107m.append(this.zzc);
        m107m.append(", bytesDownloaded=");
        m107m.append(this.zzd);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.zze, ", totalBytesToDownload=", ", moduleNamesNullable=", m107m);
        Boxes$$ExternalSyntheticOutline1.m(m107m, valueOf, ", languagesNullable=", valueOf2, ", resolutionIntent=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m107m, valueOf3, ", splitFileIntents=", valueOf4, "}");
    }
}
