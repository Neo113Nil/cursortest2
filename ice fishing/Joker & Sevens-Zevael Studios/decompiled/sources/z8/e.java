package z8;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fVar.enqueue(gVar, z10);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z10, fc.d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return fVar.enqueueAndWait(gVar, z10, dVar);
    }
}
