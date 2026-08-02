package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import com.google.android.play.integrity.internal.t;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class br extends t {
    public final /* synthetic */ bs g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(bs bsVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        Objects.requireNonNull(bsVar);
        this.g = bsVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (!(exc instanceof af)) {
            super.a(exc);
        } else if (bs.m(this.g)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
