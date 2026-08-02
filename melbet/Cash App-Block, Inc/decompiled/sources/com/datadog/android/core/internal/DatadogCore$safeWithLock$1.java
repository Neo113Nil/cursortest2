package com.datadog.android.core.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogCore$safeWithLock$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Lock $this_safeWithLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogCore$safeWithLock$1(Lock lock, int i) {
        super(0);
        this.$r8$classId = i;
        this.$this_safeWithLock = lock;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Lock lock = this.$this_safeWithLock;
        switch (i) {
            case 0:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Couldn't acquire ", lock.getClass().getSimpleName(), " lock due to the exception thrown, aborting operation.");
            case 1:
                return "Couldn't acquire " + lock.getClass().getSimpleName() + " due to timeout (1 " + TimeUnit.SECONDS + "), aborting operation.";
            default:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Couldn't acquire ", lock.getClass().getSimpleName(), " due to the exception thrown, aborting operation.");
        }
    }
}
