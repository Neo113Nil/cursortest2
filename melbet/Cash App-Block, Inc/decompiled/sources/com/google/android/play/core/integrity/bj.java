package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.t;

/* loaded from: classes.dex */
public final class bj extends t {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bs bsVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.a = context;
        this.b = bsVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.b.d.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(this.a)));
    }
}
