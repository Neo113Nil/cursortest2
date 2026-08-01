package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowUnitTestMechanism extends WinterFlowTestingCloud {
    public final long WinterFlowServiceUtility;
    public final Object WinterFlowThreadListener;

    public WinterFlowUnitTestMechanism(long j, Object obj) {
        this.WinterFlowThreadListener = obj;
        this.WinterFlowServiceUtility = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowUnitTestMechanism)) {
            return false;
        }
        WinterFlowUnitTestMechanism winterFlowUnitTestMechanism = (WinterFlowUnitTestMechanism) obj;
        return this.WinterFlowThreadListener.equals(winterFlowUnitTestMechanism.WinterFlowThreadListener) && this.WinterFlowServiceUtility == winterFlowUnitTestMechanism.WinterFlowServiceUtility;
    }

    public final int hashCode() {
        return Long.hashCode(this.WinterFlowServiceUtility) + (this.WinterFlowThreadListener.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.WinterFlowThreadListener + ", compositeKey=" + this.WinterFlowServiceUtility + ')';
    }
}
