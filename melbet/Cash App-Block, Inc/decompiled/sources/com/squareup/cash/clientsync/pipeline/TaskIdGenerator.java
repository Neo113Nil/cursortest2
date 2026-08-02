package com.squareup.cash.clientsync.pipeline;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class TaskIdGenerator {
    public final AtomicInteger nextId = new AtomicInteger(0);

    public final TaskId nextTaskId(String str) {
        str.getClass();
        AtomicInteger atomicInteger = this.nextId;
        atomicInteger.getClass();
        return new TaskId(atomicInteger.getAndAdd(1) + ":" + str);
    }
}
