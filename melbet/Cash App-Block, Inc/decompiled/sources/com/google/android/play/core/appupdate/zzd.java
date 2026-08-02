package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.android.play.core.appupdate.internal.zzaf;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class zzd implements zzaf {
    public final /* synthetic */ int $r8$classId;
    public final com.google.mlkit.vision.text.internal.zzr zza;

    public /* synthetic */ zzd(com.google.mlkit.vision.text.internal.zzr zzrVar, int i) {
        this.$r8$classId = i;
        this.zza = zzrVar;
    }

    @Override // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        int i = this.$r8$classId;
        com.google.mlkit.vision.text.internal.zzr zzrVar = this.zza;
        switch (i) {
            case 0:
                Context context = ((zzi) zzrVar.zza).zza;
                Recorder$$ExternalSyntheticOutline2.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("AppUpdateListenerRegistry");
                new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
                zzc zzcVar = new zzc();
                new HashSet();
                context.getApplicationContext();
                return zzcVar;
            default:
                return new zzt(((zzi) zzrVar.zza).zza);
        }
    }
}
