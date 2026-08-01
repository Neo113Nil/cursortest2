package com.google.android.datatransport;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowEventEmitterNode extends WinterFlowObjectHelper {
    public static Object WinterFlowAPIFrontend(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        WinterFlowCompilerMechanism.WinterFlowSyntax("List is empty.");
        return null;
    }

    public static Object WinterFlowBandwidth(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        WinterFlowCompilerMechanism.WinterFlowSyntax("List is empty.");
        return null;
    }

    public static Object WinterFlowCacheManagerException(AbstractList abstractList) {
        abstractList.getClass();
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static void WinterFlowVariableInterface(AbstractList abstractList, Iterable iterable) {
        abstractList.getClass();
        if (iterable instanceof Collection) {
            abstractList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }
}
