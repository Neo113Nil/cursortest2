package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowClassInterface implements WinterFlowRepositorySubsystem {
    public static final AtomicReference WinterFlowRouterStructure = new AtomicReference();

    @Override // com.google.android.datatransport.WinterFlowRepositorySubsystem
    public final void WinterFlowRouterStructure(boolean z) {
        synchronized (com.google.firebase.WinterFlowSyntaxEvent.WinterFlowResponseEngine) {
            try {
                ArrayList arrayList = new ArrayList(com.google.firebase.WinterFlowSyntaxEvent.WinterFlowTransactionAgent.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent = (com.google.firebase.WinterFlowSyntaxEvent) obj;
                    if (winterFlowSyntaxEvent.WinterFlowVariableVersionControl.get()) {
                        Iterator it = winterFlowSyntaxEvent.WinterFlowSyntax.iterator();
                        while (it.hasNext()) {
                            com.google.firebase.WinterFlowSyntaxEvent winterFlowSyntaxEvent2 = ((WinterFlowParserNode) it.next()).WinterFlowRouterStructure;
                            if (!z) {
                                ((WinterFlowDeserializationPlatform) winterFlowSyntaxEvent2.WinterFlowRouterRouter.get()).WinterFlowHookDataSource();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
