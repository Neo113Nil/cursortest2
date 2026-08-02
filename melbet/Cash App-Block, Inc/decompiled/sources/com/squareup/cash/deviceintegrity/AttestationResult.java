package com.squareup.cash.deviceintegrity;

/* loaded from: classes.dex */
public abstract class AttestationResult {

    /* loaded from: classes6.dex */
    public final class Failure extends AttestationResult {
        public static final Failure INSTANCE = new Failure();
    }

    public final class Success extends AttestationResult {
        public static final Success INSTANCE = new Success();
    }
}
