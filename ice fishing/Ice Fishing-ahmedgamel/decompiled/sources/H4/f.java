package H4;

import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public interface f {
    Object awaitInitialized(InterfaceC5240d interfaceC5240d);

    <T extends g> boolean containsInstanceOf(O7.c cVar);

    void enqueue(g gVar, boolean z6);

    Object enqueueAndWait(g gVar, boolean z6, InterfaceC5240d interfaceC5240d);

    void forceExecuteOperations();
}
