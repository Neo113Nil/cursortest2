package com.google.android.play.core.appupdate;

import com.fillr.browsersdk.utilities.Obfuscator;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class zzq extends zzb {
    public final Obfuscator zza;
    public final TaskCompletionSource zzb;
    public final /* synthetic */ zzr zzc;
    public final /* synthetic */ zzr zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource, String str) {
        super(11);
        this.zzd = zzrVar;
        Obfuscator obfuscator = new Obfuscator("OnRequestInstallCallback", 1);
        this.zzc = zzrVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.zza = obfuscator;
        this.zzb = taskCompletionSource;
    }
}
