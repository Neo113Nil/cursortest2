package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import com.google.android.play.integrity.internal.ae;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class bx {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ by d;

    public bx(by byVar, long j, long j2) {
        this.a = j;
        this.b = j2;
        Objects.requireNonNull(byVar);
        this.d = byVar;
    }

    public final zzw request(q qVar) {
        bs bsVar = this.d.a;
        long j = this.b;
        bsVar.b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        bl blVar = new bl(bsVar, taskCompletionSource, qVar, this.a, j, taskCompletionSource);
        ae aeVar = bsVar.a;
        aeVar.getClass();
        aeVar.c().post(new com.google.android.play.integrity.internal.w(aeVar, taskCompletionSource, taskCompletionSource, blVar));
        return taskCompletionSource.zza;
    }
}
