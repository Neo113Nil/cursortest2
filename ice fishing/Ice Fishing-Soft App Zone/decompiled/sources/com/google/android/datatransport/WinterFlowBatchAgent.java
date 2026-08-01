package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowBatchAgent {
    public boolean WinterFlowArrayNetwork;
    public final WinterFlowViewObject WinterFlowCacheManagerAgent;
    public ArrayList WinterFlowHookDataSource;
    public final ArrayList WinterFlowRouterStructure;
    public int WinterFlowVariableVersionControl;

    public WinterFlowBatchAgent(WinterFlowViewObject winterFlowViewObject) {
        winterFlowViewObject.getClass();
        this.WinterFlowRouterStructure = new ArrayList();
        this.WinterFlowVariableVersionControl = -1;
        this.WinterFlowCacheManagerAgent = winterFlowViewObject;
    }

    public final int WinterFlowRouterStructure(boolean z) {
        String str;
        WinterFlowViewObject winterFlowViewObject = this.WinterFlowCacheManagerAgent;
        if (this.WinterFlowArrayNetwork) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("commit already called");
            return 0;
        }
        if (WinterFlowViewObject.WinterFlowResponseEngine(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new WinterFlowUserManagerHelper());
            ArrayList arrayList = this.WinterFlowRouterStructure;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(this.WinterFlowVariableVersionControl);
            printWriter.print(" mCommitted=");
            printWriter.println(this.WinterFlowArrayNetwork);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    WinterFlowAdapterTool winterFlowAdapterTool = (WinterFlowAdapterTool) arrayList.get(i);
                    switch (winterFlowAdapterTool.WinterFlowRouterStructure) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            str = "SHOW";
                            break;
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "DETACH";
                            break;
                        case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                            str = "ATTACH";
                            break;
                        case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + winterFlowAdapterTool.WinterFlowRouterStructure;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(winterFlowAdapterTool.WinterFlowHookDataSource);
                    if (winterFlowAdapterTool.WinterFlowArrayNetwork != 0 || winterFlowAdapterTool.WinterFlowVariableVersionControl != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(winterFlowAdapterTool.WinterFlowArrayNetwork));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(winterFlowAdapterTool.WinterFlowVariableVersionControl));
                    }
                    if (winterFlowAdapterTool.WinterFlowTransactionManagerStrategy != 0 || winterFlowAdapterTool.WinterFlowUnitTestResponse != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(winterFlowAdapterTool.WinterFlowTransactionManagerStrategy));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(winterFlowAdapterTool.WinterFlowUnitTestResponse));
                    }
                }
            }
            printWriter.close();
        }
        this.WinterFlowArrayNetwork = true;
        this.WinterFlowVariableVersionControl = -1;
        if (!z) {
            winterFlowViewObject.getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("FragmentManager has not been attached to a host.");
            return 0;
        }
        synchronized (winterFlowViewObject.WinterFlowRouterStructure) {
            if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        return this.WinterFlowVariableVersionControl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.WinterFlowVariableVersionControl >= 0) {
            sb.append(" #");
            sb.append(this.WinterFlowVariableVersionControl);
        }
        sb.append("}");
        return sb.toString();
    }
}
