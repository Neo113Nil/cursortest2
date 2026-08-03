package z8;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface f {
    Object awaitInitialized(fc.d dVar);

    <T extends g> boolean containsInstanceOf(vc.b bVar);

    void enqueue(g gVar, boolean z10);

    Object enqueueAndWait(g gVar, boolean z10, fc.d dVar);

    void forceExecuteOperations();
}
