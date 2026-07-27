package H4;

import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            z3 = false;
        }
        fVar.enqueue(gVar, z3);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z3, InterfaceC5267d interfaceC5267d, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i & 2) != 0) {
            z3 = false;
        }
        return fVar.enqueueAndWait(gVar, z3, interfaceC5267d);
    }
}
