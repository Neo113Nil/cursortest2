package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowEventUtility extends WinterFlowProviderRouter {
    public static String WinterFlowRouterAdapter(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        WinterFlowScriptArray winterFlowScriptArray = new WinterFlowScriptArray(str);
        int i = 0;
        while (winterFlowScriptArray.hasNext()) {
            String str2 = (String) winterFlowScriptArray.next();
            str2.getClass();
            if (!WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str2)) {
                str2 = "    ".concat(str2);
            } else if (str2.length() < 4) {
                str2 = "    ";
            }
            i++;
            if (i > 1) {
                sb.append((CharSequence) "\n");
            }
            WinterFlowProviderRouter.WinterFlowHookDataSource(sb, str2, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String WinterFlowSerializerStructure(String str) {
        if (WinterFlowFrameworkStrategy.WinterFlowArrayHelper("|")) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("marginPrefix must be non-blank string.");
            return null;
        }
        List WinterFlowCompilerVariable = WinterFlowFrameworkStrategy.WinterFlowCompilerVariable(str);
        int length = str.length();
        WinterFlowCompilerVariable.size();
        int size = WinterFlowCompilerVariable.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : WinterFlowCompilerVariable) {
            int i2 = i + 1;
            if (i < 0) {
                WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                throw null;
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!WinterFlowQuerySyntax.WinterFlowBatchUI(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        WinterFlowSerializerUtility.WinterFlowHandlerJSON(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
