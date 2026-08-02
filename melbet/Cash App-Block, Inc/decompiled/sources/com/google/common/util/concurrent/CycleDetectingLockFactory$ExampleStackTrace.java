package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableSet;

/* loaded from: classes4.dex */
class CycleDetectingLockFactory$ExampleStackTrace extends IllegalStateException {
    static {
        ImmutableSet.construct(3, "com.google.common.util.concurrent.CycleDetectingLockFactory", "com.google.common.util.concurrent.CycleDetectingLockFactory$ExampleStackTrace", "com.google.common.util.concurrent.CycleDetectingLockFactory$LockGraphNode");
    }
}
