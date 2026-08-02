package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class dgp extends yap {
    public final /* synthetic */ AtomicReferenceArray e;

    public dgp(long j, dgp dgpVar, int i) {
        super(j, dgpVar, i);
        this.e = new AtomicReferenceArray(cgp.f);
    }

    @Override // defpackage.yap
    public final int g() {
        return cgp.f;
    }

    @Override // defpackage.yap
    public final void h(int i, CoroutineContext coroutineContext) {
        this.e.set(i, cgp.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
