package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzpz implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Dialog zza;

    public /* synthetic */ zzpz(Dialog dialog, int i) {
        this.$r8$classId = i;
        this.zza = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final /* synthetic */ void onClick(View view) {
        int i = this.$r8$classId;
        Dialog dialog = this.zza;
        switch (i) {
            case 0:
                ((zzqg) dialog).zzg(zzqg.zze);
                break;
            case 1:
                ((zzqg) dialog).zzg(zzqg.zzh);
                break;
            case 2:
                ((zzqg) dialog).zzg(zzqg.zzg);
                break;
            case 3:
                ((zzqg) dialog).zzg(zzqg.zzf);
                break;
            case 4:
                ((zzqg) dialog).dismiss();
                break;
            case 5:
                ((zzqg) dialog).zzg(zzqg.zzd);
                break;
            default:
                ((zzqi) dialog).dismiss();
                break;
        }
    }
}
