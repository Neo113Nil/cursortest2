package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes4.dex */
public abstract class zzjz extends zzjc {
    public static zzjz zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzjz ? (zzjz) listenableFuture : new zzka(listenableFuture);
    }
}
