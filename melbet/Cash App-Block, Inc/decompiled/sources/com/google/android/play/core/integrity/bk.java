package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.g;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bk extends br {
    public final /* synthetic */ long b;
    public final /* synthetic */ TaskCompletionSource c;
    public final /* synthetic */ bs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bs bsVar, TaskCompletionSource taskCompletionSource, long j, TaskCompletionSource taskCompletionSource2) {
        super(bsVar, taskCompletionSource);
        this.b = j;
        this.c = taskCompletionSource2;
        Objects.requireNonNull(bsVar);
        this.d = bsVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        TaskCompletionSource taskCompletionSource = this.c;
        long j = this.b;
        bs bsVar = this.d;
        if (bs.m(bsVar)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bs.l(bsVar)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            ((g) ((com.google.android.play.integrity.internal.i) bsVar.a.o)).e(bs.b(bsVar, j), new bp(bsVar, taskCompletionSource, 1));
        } catch (RemoteException e) {
            bsVar.b.c(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            taskCompletionSource.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
