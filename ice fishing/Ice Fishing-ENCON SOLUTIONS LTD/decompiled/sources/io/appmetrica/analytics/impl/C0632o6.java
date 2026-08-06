package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.o6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632o6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0856wn apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C0856wn(name, priority, id, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
