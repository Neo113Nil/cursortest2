package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public static IllegalStateException of(zzw zzwVar) {
        if (!zzwVar.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = zzwVar.getException();
        return new DuplicateTaskCompletionException("Complete with: ".concat(exception != null ? "failure" : zzwVar.isSuccessful() ? "result ".concat(String.valueOf(zzwVar.getResult())) : zzwVar.zzd ? "cancellation" : "unknown issue"), exception);
    }
}
