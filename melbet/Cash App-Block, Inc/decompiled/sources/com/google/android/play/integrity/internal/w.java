package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.KeysetHandle;

/* loaded from: classes.dex */
public final class w extends t {
    public final /* synthetic */ TaskCompletionSource a;
    public final /* synthetic */ t b;
    public final /* synthetic */ ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.a = taskCompletionSource2;
        this.b = tVar;
        this.c = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        ae aeVar = this.c;
        synchronized (aeVar.g) {
            try {
                TaskCompletionSource taskCompletionSource = this.a;
                aeVar.f.add(taskCompletionSource);
                taskCompletionSource.zza.addOnCompleteListener(new KeysetHandle(3, aeVar, taskCompletionSource));
                if (aeVar.m.getAndIncrement() > 0) {
                    aeVar.c.d("Already connected to the service.", new Object[0]);
                }
                ae.r(aeVar, this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
