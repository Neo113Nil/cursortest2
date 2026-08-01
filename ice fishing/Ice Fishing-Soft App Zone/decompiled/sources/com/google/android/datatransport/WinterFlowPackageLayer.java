package com.google.android.datatransport;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPackageLayer extends WinterFlowTransactionVariable {
    public final LinkedHashMap WinterFlowHookDataSource = new LinkedHashMap();

    @Override // com.google.android.datatransport.WinterFlowTransactionVariable
    public final void WinterFlowArrayNetwork() {
        LinkedHashMap linkedHashMap = this.WinterFlowHookDataSource;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((WinterFlowScriptManager) it.next()).WinterFlowRouterStructure();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
        long j = identityHashCode & 4294967295L;
        if (j >= 0) {
            WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
            concat = Long.toString(j, 16);
            concat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
            String l = Long.toString(j2, 16);
            l.getClass();
            WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
            String l2 = Long.toString(j3, 16);
            l2.getClass();
            concat = l.concat(l2);
        }
        sb.append(concat);
        sb.append("} ViewModelStores (");
        Iterator it = this.WinterFlowHookDataSource.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
