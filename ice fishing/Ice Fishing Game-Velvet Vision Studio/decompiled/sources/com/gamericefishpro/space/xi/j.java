package com.gamericefishpro.space.xi;

import com.gamericefishpro.space.ui.q;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j, j jVar, int i) {
        super(j, jVar, i);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // com.gamericefishpro.space.ui.q
    public final int f() {
        return i.f;
    }

    @Override // com.gamericefishpro.space.ui.q
    public final void g(int i, CoroutineContext coroutineContext) {
        this.e.set(i, i.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
