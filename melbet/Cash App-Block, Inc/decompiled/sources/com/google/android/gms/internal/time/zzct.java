package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final class zzct extends zzef {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzct(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final /* synthetic */ Object zza() {
        switch (this.$r8$classId) {
            case 0:
                return new zzcu();
            case 1:
                return new zzcx();
            case 2:
                return new zzdu();
            default:
                return new zzdz();
        }
    }
}
