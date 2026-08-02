package com.plaid.internal;

import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* renamed from: com.plaid.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0194i5 {
    public final File a;

    public C0194i5(File file, String str) {
        file.getClass();
        str.getClass();
        this.a = new File(file, str);
    }

    public final Object a(String str, SuspendLambda suspendLambda) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        Object withContext = JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0176g5(this, str, null), suspendLambda);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    public final Object a(SuspendLambda suspendLambda) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return JobKt.withContext(DefaultIoScheduler.INSTANCE, new C0158e5(this, null), suspendLambda);
    }
}
