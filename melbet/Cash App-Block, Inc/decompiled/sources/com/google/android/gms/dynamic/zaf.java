package com.google.android.gms.dynamic;

import android.os.RemoteException;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.maps.zzai;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zaf implements zah {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzai zaa;

    public zaf(zzai zzaiVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(zzaiVar);
                this.zaa = zzaiVar;
                break;
            default:
                Objects.requireNonNull(zzaiVar);
                this.zaa = zzaiVar;
                break;
        }
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        switch (this.$r8$classId) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab() {
        int i = this.$r8$classId;
        zzai zzaiVar = this.zaa;
        switch (i) {
            case 0:
                zzah zzahVar = (zzah) zzaiVar.zaa;
                zzahVar.getClass();
                try {
                    zzl zzlVar = (zzl) zzahVar.zzb;
                    zzlVar.zzc(zzlVar.zza(), 12);
                    break;
                } catch (RemoteException e) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e);
                    return;
                }
            default:
                zzah zzahVar2 = (zzah) zzaiVar.zaa;
                zzahVar2.getClass();
                try {
                    zzl zzlVar2 = (zzl) zzahVar2.zzb;
                    zzlVar2.zzc(zzlVar2.zza(), 3);
                    break;
                } catch (RemoteException e2) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e2);
                }
        }
    }
}
