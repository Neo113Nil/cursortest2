package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Parcel;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.internal.maps.zzb;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzfd extends zzb {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzzx zza;
    public final /* synthetic */ zzct zzb;
    public final /* synthetic */ CallbackToFutureAdapter$Completer zzc;
    public final /* synthetic */ zzfn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(zzfn zzfnVar, zzzx zzzxVar, zzct zzctVar, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, int i) {
        super("com.google.android.apps.aicore.aidl.IDownloadListener2", 4);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = zzzxVar;
                this.zzb = zzctVar;
                this.zzc = callbackToFutureAdapter$Completer;
                Objects.requireNonNull(zzfnVar);
                this.zzd = zzfnVar;
                super("com.google.android.apps.aicore.aidl.IDownloadListener", 4);
                break;
            default:
                this.zza = zzzxVar;
                this.zzb = zzctVar;
                this.zzc = callbackToFutureAdapter$Completer;
                Objects.requireNonNull(zzfnVar);
                this.zzd = zzfnVar;
                break;
        }
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(Parcel parcel, int i) {
        int i2 = this.$r8$classId;
        zzfn zzfnVar = this.zzd;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.zzc;
        int i3 = 3;
        switch (i2) {
            case 0:
                zzct zzctVar = this.zzb;
                zzzx zzzxVar = this.zza;
                if (i == 2) {
                    parcel.readString();
                    long readLong = parcel.readLong();
                    zzl.zzb(parcel);
                    zzfnVar.zzg.execute(new zzeg(zzzxVar, zzctVar, readLong, 2));
                    break;
                } else if (i == 3) {
                    parcel.readString();
                    long readLong2 = parcel.readLong();
                    zzl.zzb(parcel);
                    zzfnVar.zzg.execute(new zzeg(zzzxVar, zzctVar, readLong2, 4));
                    break;
                } else if (i == 4) {
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    String readString2 = parcel.readString();
                    zzl.zzb(parcel);
                    Locale locale = Locale.ENGLISH;
                    zzcm zzc = zzcm.zzc(readInt == 1 ? 501 : 0, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m("Feature ", readInt, readString, " failed with failure status ", " and error "), readString2, "."));
                    zzfnVar.zzg.execute(new zzeg(zzzxVar, zzctVar, readInt, zzc));
                    callbackToFutureAdapter$Completer.setException(zzc);
                    break;
                } else if (i == 5) {
                    parcel.readString();
                    zzl.zzb(parcel);
                    zzfnVar.zzg.execute(new zzeg(zzzxVar, zzctVar, i3));
                    callbackToFutureAdapter$Completer.set(null);
                    break;
                } else {
                    break;
                }
            default:
                zzct zzctVar2 = this.zzb;
                zzzx zzzxVar2 = this.zza;
                if (i == 2) {
                    parcel.readString();
                    long readLong3 = parcel.readLong();
                    zzl.zzb(parcel);
                    zzfnVar.zzg.execute(new zzeg(zzzxVar2, zzctVar2, readLong3, 5));
                    break;
                } else if (i == 3) {
                    parcel.readString();
                    long readLong4 = parcel.readLong();
                    zzl.zzb(parcel);
                    zzfnVar.zzg.execute(new zzeg(zzzxVar2, zzctVar2, readLong4, 6));
                    break;
                } else if (i == 4) {
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    zzl.zzb(parcel);
                    Locale locale2 = Locale.ENGLISH;
                    zzcm zzc2 = zzcm.zzc(0, null, Boxes$$ExternalSyntheticOutline1.m("Feature ", readString3, " failed with failure ", readString4, "."));
                    zzfnVar.zzg.execute(new zzeg(zzzxVar2, zzctVar2, zzc2));
                    callbackToFutureAdapter$Completer.setException(zzc2);
                    break;
                } else if (i == 5) {
                    parcel.readString();
                    zzl.zzb(parcel);
                    zzfnVar.zzg.execute(new zzeg(zzzxVar2, zzctVar2, 7));
                    callbackToFutureAdapter$Completer.set(null);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }
}
