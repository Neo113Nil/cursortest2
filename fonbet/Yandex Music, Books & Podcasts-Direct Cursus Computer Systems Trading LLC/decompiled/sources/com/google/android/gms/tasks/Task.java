package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import defpackage.ag6;
import defpackage.aqr;
import defpackage.onx;
import defpackage.spj;
import defpackage.tqj;
import defpackage.zpj;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, spj spjVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract onx c(Executor executor, zpj zpjVar);

    public abstract onx d(Executor executor, tqj tqjVar);

    public Task e(Executor executor, ag6 ag6Var) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task f(Executor executor, ag6 ag6Var) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception g();

    public abstract Object h();

    public abstract Object i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public Task m(Executor executor, aqr aqrVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
