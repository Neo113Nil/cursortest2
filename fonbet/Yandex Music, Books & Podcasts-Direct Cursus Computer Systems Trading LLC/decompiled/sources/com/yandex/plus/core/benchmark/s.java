package com.yandex.plus.core.benchmark;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class s {
    public final AtomicReference a;
    public volatile long b;

    public s(o oVar, long j) {
        this.a = new AtomicReference(oVar);
        this.b = j;
    }
}
