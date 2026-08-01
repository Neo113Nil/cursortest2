package H4;

import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public interface f {
    Object awaitInitialized(InterfaceC5267d interfaceC5267d);

    <T extends g> boolean containsInstanceOf(O7.c cVar);

    void enqueue(g gVar, boolean z3);

    Object enqueueAndWait(g gVar, boolean z3, InterfaceC5267d interfaceC5267d);

    void forceExecuteOperations();
}
