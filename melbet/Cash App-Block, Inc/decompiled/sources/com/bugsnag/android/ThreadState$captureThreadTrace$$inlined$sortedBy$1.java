package com.bugsnag.android;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;

/* loaded from: classes.dex */
public final class ThreadState$captureThreadTrace$$inlined$sortedBy$1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(ThreadState.getThreadId((java.lang.Thread) obj)), Long.valueOf(ThreadState.getThreadId((java.lang.Thread) obj2)));
    }
}
