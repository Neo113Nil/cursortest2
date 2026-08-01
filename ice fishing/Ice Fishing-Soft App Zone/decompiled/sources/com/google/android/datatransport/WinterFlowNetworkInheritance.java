package com.google.android.datatransport;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowNetworkInheritance {
    public static final WinterFlowDatabaseSchemaHook WinterFlowRouterStructure;

    static {
        WinterFlowDatabaseSchemaHook winterFlowDatabaseSchemaHook;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                winterFlowDatabaseSchemaHook = new WinterFlowDatabaseSchemaHook();
                WinterFlowRouterStructure = winterFlowDatabaseSchemaHook;
            }
        }
        winterFlowDatabaseSchemaHook = null;
        WinterFlowRouterStructure = winterFlowDatabaseSchemaHook;
    }
}
