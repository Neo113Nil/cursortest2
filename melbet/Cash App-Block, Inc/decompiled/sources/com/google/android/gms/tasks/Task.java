package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class Task<TResult> {
    public void addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract zzw addOnFailureListener(Executor executor, OnFailureListener onFailureListener);

    public abstract zzw addOnSuccessListener(OnSuccessListener onSuccessListener);

    public abstract zzw addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener);

    public Task continueWith(Executor executor, Continuation continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public Task continueWithTask(Continuation continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract Object getResult$1();

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public Task onSuccessTask(SuccessContinuation successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public void addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task continueWithTask(Executor executor, Continuation continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
