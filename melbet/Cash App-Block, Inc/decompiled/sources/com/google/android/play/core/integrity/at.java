package com.google.android.play.core.integrity;

import com.google.android.play.integrity.internal.aw;
import com.google.android.play.integrity.internal.ax;
import com.google.android.play.integrity.internal.s;
import com.google.mlkit.common.internal.zza;
import com.google.mlkit.common.internal.zzb;
import com.google.mlkit.common.internal.zze;

/* loaded from: classes.dex */
public final class at implements aw {
    public final /* synthetic */ int $r8$classId;
    public final ax a;
    public final com.google.android.play.integrity.internal.av b;

    public /* synthetic */ at(ax axVar, com.google.android.play.integrity.internal.av avVar, zzb zzbVar, int i) {
        this.$r8$classId = i;
        this.a = axVar;
        this.b = avVar;
    }

    @Override // com.google.android.play.integrity.internal.az
    public final Object a() {
        int i = this.$r8$classId;
        com.google.android.play.integrity.internal.av avVar = this.b;
        ax axVar = this.a;
        switch (i) {
            case 0:
                return new ar(axVar.a, (s) avVar.a(), new zze(7));
            default:
                return new bs(axVar.a, (s) avVar.a(), new zza(8));
        }
    }
}
