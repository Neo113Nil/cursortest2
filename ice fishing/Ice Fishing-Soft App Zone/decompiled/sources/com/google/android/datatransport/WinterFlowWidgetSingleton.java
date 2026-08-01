package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetSingleton implements Comparable {
    public static final WinterFlowWidgetSingleton WinterFlowTransactionManagerStrategy = new WinterFlowWidgetSingleton();
    public final int WinterFlowVariableVersionControl = 132106;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        WinterFlowWidgetSingleton winterFlowWidgetSingleton = (WinterFlowWidgetSingleton) obj;
        winterFlowWidgetSingleton.getClass();
        return this.WinterFlowVariableVersionControl - winterFlowWidgetSingleton.WinterFlowVariableVersionControl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WinterFlowWidgetSingleton winterFlowWidgetSingleton = obj instanceof WinterFlowWidgetSingleton ? (WinterFlowWidgetSingleton) obj : null;
        return winterFlowWidgetSingleton != null && this.WinterFlowVariableVersionControl == winterFlowWidgetSingleton.WinterFlowVariableVersionControl;
    }

    public final int hashCode() {
        return this.WinterFlowVariableVersionControl;
    }

    public final String toString() {
        return "2.4.10";
    }
}
