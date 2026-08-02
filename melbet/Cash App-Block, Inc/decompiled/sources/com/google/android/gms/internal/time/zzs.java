package com.google.android.gms.internal.time;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzs extends zzbb {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzs(Executor executor, zzcb zzcbVar, int i) {
        super(executor, zzcbVar);
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.time.zzbb
    public final /* synthetic */ void zza(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw null;
            default:
                ((zzak) obj).zza((zzaw) obj2);
                return;
        }
    }
}
