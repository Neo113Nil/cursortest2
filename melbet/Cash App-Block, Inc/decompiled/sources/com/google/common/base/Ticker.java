package com.google.common.base;

/* loaded from: classes4.dex */
public abstract class Ticker {
    public static final AnonymousClass1 SYSTEM_TICKER = new AnonymousClass1();

    /* renamed from: com.google.common.base.Ticker$1, reason: invalid class name */
    public final class AnonymousClass1 extends Ticker {
        @Override // com.google.common.base.Ticker
        public final long read() {
            return System.nanoTime();
        }
    }

    public abstract long read();
}
