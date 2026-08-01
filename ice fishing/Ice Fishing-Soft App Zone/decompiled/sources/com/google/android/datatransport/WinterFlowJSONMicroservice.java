package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONMicroservice {
    public final ArrayList WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowJSONMicroservice(String str, ArrayList arrayList) {
        if (str == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null userAgent");
            throw null;
        }
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowJSONMicroservice)) {
            return false;
        }
        WinterFlowJSONMicroservice winterFlowJSONMicroservice = (WinterFlowJSONMicroservice) obj;
        return this.WinterFlowRouterStructure.equals(winterFlowJSONMicroservice.WinterFlowRouterStructure) && this.WinterFlowHookDataSource.equals(winterFlowJSONMicroservice.WinterFlowHookDataSource);
    }

    public final int hashCode() {
        return this.WinterFlowHookDataSource.hashCode() ^ ((this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.WinterFlowRouterStructure + ", usedDates=" + this.WinterFlowHookDataSource + "}";
    }
}
