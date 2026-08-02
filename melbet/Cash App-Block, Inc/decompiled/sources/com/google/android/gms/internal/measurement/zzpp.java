package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: classes4.dex */
public final class zzpp implements RemoteCall {
    public static final Object zza = new Object();
    public static volatile RegularImmutableMap zzb;
    public final /* synthetic */ int $r8$classId;
    public final String zzc;

    public zzpp(Context context, zzpr zzprVar) {
        this.$r8$classId = 0;
        this.zzc = zzprVar.zzb() ? zzlg.zzb(context, zzprVar.zza()) : zzprVar.zza();
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        int i = this.$r8$classId;
        String str = this.zzc;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        zzku zzkuVar = (zzku) obj;
        switch (i) {
            case 1:
                int i2 = zzkk.$r8$clinit;
                zzjy zzjyVar = new zzjy(taskCompletionSource);
                zzkt zzktVar = (zzkt) zzkuVar.getService();
                Parcel zza2 = zzktVar.zza();
                zzbn.zzd(zza2, zzjyVar);
                zza2.writeString(str);
                zza2.writeString("");
                zza2.writeString(null);
                zzktVar.zzc(zza2, 11);
                break;
            default:
                int i3 = zzkk.$r8$clinit;
                zzjy zzjyVar2 = new zzjy(taskCompletionSource);
                zzkt zzktVar2 = (zzkt) zzkuVar.getService();
                Parcel zza3 = zzktVar2.zza();
                zzbn.zzd(zza3, zzjyVar2);
                zza3.writeString(str);
                zzktVar2.zzc(zza3, 5);
                break;
        }
    }

    public /* synthetic */ zzpp(String str, int i) {
        this.$r8$classId = i;
        this.zzc = str;
    }
}
