package com.yandex.plus.core.benchmark;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class k {
    public final AtomicReference a;
    public volatile long b;
    public volatile long c;

    public k(d dVar, long j, long j2) {
        this.a = new AtomicReference(dVar);
        this.b = j;
        this.c = j2;
    }
}
