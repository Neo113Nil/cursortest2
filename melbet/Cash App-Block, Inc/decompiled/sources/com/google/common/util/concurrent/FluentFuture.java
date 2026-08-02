package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.TimeUnit;
import kotlin.io.ByteStreamsKt;

/* loaded from: classes.dex */
public abstract class FluentFuture extends AbstractFuture {
    public static FluentFuture from(ListenableFuture listenableFuture) {
        return listenableFuture instanceof FluentFuture ? (FluentFuture) listenableFuture : new ForwardingFluentFuture(listenableFuture);
    }

    public abstract class TrustedFuture extends FluentFuture implements AbstractFuture.Trusted {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return ByteStreamsKt.get(this, j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.valueField instanceof AbstractFuture.Cancellation;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final Object get() {
            return ByteStreamsKt.get(this);
        }
    }
}
