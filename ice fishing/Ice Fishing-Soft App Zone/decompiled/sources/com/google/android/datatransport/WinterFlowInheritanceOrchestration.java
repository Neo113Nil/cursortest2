package com.google.android.datatransport;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowInheritanceOrchestration extends Exception {
    public final Status WinterFlowVariableVersionControl;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowInheritanceOrchestration(Status status) {
        super(r4.toString());
        int i = status.WinterFlowVariableVersionControl;
        String str = status.WinterFlowTransactionManagerStrategy;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        this.WinterFlowVariableVersionControl = status;
    }
}
