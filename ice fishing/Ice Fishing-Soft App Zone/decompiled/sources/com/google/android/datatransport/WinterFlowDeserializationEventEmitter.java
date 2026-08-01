package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDeserializationEventEmitter {
    public final int WinterFlowRouterStructure;

    public static String WinterFlowRouterStructure(int i) {
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowDeserializationEventEmitter) {
            return this.WinterFlowRouterStructure == ((WinterFlowDeserializationEventEmitter) obj).WinterFlowRouterStructure;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.WinterFlowRouterStructure);
    }

    public final String toString() {
        return WinterFlowRouterStructure(this.WinterFlowRouterStructure);
    }
}
