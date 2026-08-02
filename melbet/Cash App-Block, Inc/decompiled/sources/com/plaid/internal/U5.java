package com.plaid.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

/* loaded from: classes5.dex */
public final class U5 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ P5 a;
    public final /* synthetic */ Job b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(P5 p5, Job job) {
        super(1);
        this.a = p5;
        this.b = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.e.remove(this.b);
        return Unit.INSTANCE;
    }
}
