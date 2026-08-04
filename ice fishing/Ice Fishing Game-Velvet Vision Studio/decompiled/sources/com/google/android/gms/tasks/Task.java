package com.google.android.gms.tasks;

import com.appsflyer.internal.f;
import com.gamericefishpro.space.r9.a;
import com.gamericefishpro.space.r9.c;
import com.gamericefishpro.space.r9.d;
import com.gamericefishpro.space.r9.e;
import com.gamericefishpro.space.r9.g;
import com.gamericefishpro.space.r9.o;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Task<TResult> {
    public void a(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract o c(Executor executor, d dVar);

    public abstract o d(f fVar);

    public abstract o e(Executor executor, e eVar);

    public Task f(Executor executor, a aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task g(Executor executor, a aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract Object h();

    public abstract boolean i();

    public abstract boolean isSuccessful();

    public abstract boolean j();

    public Task k(Executor executor, g gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
