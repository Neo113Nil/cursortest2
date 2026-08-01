package com.google.android.datatransport;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONSystem implements Iterable {
    public final WeakHashMap WinterFlowVariableVersionControl = new WeakHashMap();
    public final int WinterFlowTransactionManagerStrategy = 0;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((com.google.android.datatransport.WinterFlowUserManagerInheritance) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowJSONSystem)) {
            return false;
        }
        WinterFlowJSONSystem winterFlowJSONSystem = (WinterFlowJSONSystem) obj;
        if (this.WinterFlowTransactionManagerStrategy != winterFlowJSONSystem.WinterFlowTransactionManagerStrategy) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = winterFlowJSONSystem.iterator();
        while (true) {
            WinterFlowUserManagerInheritance winterFlowUserManagerInheritance = (WinterFlowUserManagerInheritance) it;
            if (!winterFlowUserManagerInheritance.hasNext()) {
                break;
            }
            WinterFlowUserManagerInheritance winterFlowUserManagerInheritance2 = (WinterFlowUserManagerInheritance) it2;
            if (!winterFlowUserManagerInheritance2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) winterFlowUserManagerInheritance.next();
            Object next = winterFlowUserManagerInheritance2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            WinterFlowUserManagerInheritance winterFlowUserManagerInheritance = (WinterFlowUserManagerInheritance) it;
            if (!winterFlowUserManagerInheritance.hasNext()) {
                return i;
            }
            i += ((Map.Entry) winterFlowUserManagerInheritance.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        WinterFlowUserManagerInheritance winterFlowUserManagerInheritance = new WinterFlowUserManagerInheritance();
        this.WinterFlowVariableVersionControl.put(winterFlowUserManagerInheritance, Boolean.FALSE);
        return winterFlowUserManagerInheritance;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            WinterFlowUserManagerInheritance winterFlowUserManagerInheritance = (WinterFlowUserManagerInheritance) it;
            if (!winterFlowUserManagerInheritance.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) winterFlowUserManagerInheritance.next()).toString());
            if (winterFlowUserManagerInheritance.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
