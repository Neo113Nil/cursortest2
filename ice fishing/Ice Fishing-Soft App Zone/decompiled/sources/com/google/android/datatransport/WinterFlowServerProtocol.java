package com.google.android.datatransport;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServerProtocol extends WinterFlowConcurrencyQueue implements WinterFlowBandwidthDebug, RandomAccess, Serializable {
    public final Enum[] WinterFlowVariableVersionControl;

    public WinterFlowServerProtocol(Enum[] enumArr) {
        enumArr.getClass();
        this.WinterFlowVariableVersionControl = enumArr;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowVariableVersionControl.length;
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        Enum[] enumArr = this.WinterFlowVariableVersionControl;
        enumArr.getClass();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.WinterFlowVariableVersionControl;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.WinterFlowVariableVersionControl;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.WinterFlowVariableVersionControl;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }
}
