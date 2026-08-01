package com.google.android.datatransport;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowFrameworkXML implements WinterFlowHookInheritance {
    public volatile Set WinterFlowHookDataSource;
    public volatile Set WinterFlowRouterStructure;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        throw r0;
     */
    @Override // com.google.android.datatransport.WinterFlowHookInheritance
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        if (this.WinterFlowHookDataSource == null) {
            synchronized (this) {
                try {
                    if (this.WinterFlowHookDataSource == null) {
                        this.WinterFlowHookDataSource = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            Iterator it = this.WinterFlowRouterStructure.iterator();
                            while (it.hasNext()) {
                                this.WinterFlowHookDataSource.add(((WinterFlowHookInheritance) it.next()).get());
                            }
                            this.WinterFlowRouterStructure = null;
                        }
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.WinterFlowHookDataSource);
    }
}
