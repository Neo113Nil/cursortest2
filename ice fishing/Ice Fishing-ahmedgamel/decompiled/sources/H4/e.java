package H4;

import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z6, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            z6 = false;
        }
        fVar.enqueue(gVar, z6);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z6, InterfaceC5240d interfaceC5240d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i & 2) != 0) {
            z6 = false;
        }
        return fVar.enqueueAndWait(gVar, z6, interfaceC5240d);
    }
}
