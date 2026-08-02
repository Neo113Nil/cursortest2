package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.aw;
import com.google.android.play.integrity.internal.ax;
import com.google.crypto.tink.KeysetHandle;
import com.google.mlkit.common.internal.zzb;

/* loaded from: classes.dex */
public final class ac implements aw {
    public final com.google.android.play.integrity.internal.av f;

    public ac(Context context) {
        ax axVar = new ax(context, false);
        com.google.android.play.integrity.internal.av b = com.google.android.play.integrity.internal.av.b(new at(axVar, com.google.android.play.integrity.internal.av.b(w.a$1), new zzb(axVar, w.f83a), 1));
        this.f = com.google.android.play.integrity.internal.av.b(new KeysetHandle(2, b, com.google.android.play.integrity.internal.av.b(new ac(b))));
    }

    @Override // com.google.android.play.integrity.internal.az
    public /* bridge */ /* synthetic */ Object a() {
        return new by((bs) this.f.a());
    }

    public ac(com.google.android.play.integrity.internal.av avVar) {
        this.f = avVar;
    }
}
