package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.aw;
import com.google.android.play.integrity.internal.ax;
import com.google.mlkit.common.internal.zzb;

/* loaded from: classes.dex */
public final class z implements aw {
    public final com.google.android.play.integrity.internal.av e;

    /* JADX WARN: Multi-variable type inference failed */
    public z(Context context) {
        ax axVar = new ax(context, false);
        this.e = com.google.android.play.integrity.internal.av.b(new z(com.google.android.play.integrity.internal.av.b(new at(axVar, com.google.android.play.integrity.internal.av.b(u.f82a), new zzb(axVar, u.f81a), 0 == true ? 1 : 0))));
    }

    @Override // com.google.android.play.integrity.internal.az
    public /* bridge */ /* synthetic */ Object a() {
        return new ai((ar) this.e.a());
    }

    public z(com.google.android.play.integrity.internal.av avVar) {
        this.e = avVar;
    }
}
