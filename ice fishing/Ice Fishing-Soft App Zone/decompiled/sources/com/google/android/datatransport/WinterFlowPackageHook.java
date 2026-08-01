package com.google.android.datatransport;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPackageHook implements WinterFlowSerializerFramework, WinterFlowModuleClass {
    public static final /* synthetic */ WinterFlowPackageHook WinterFlowTransactionManagerStrategy = new WinterFlowPackageHook(2);
    public static final /* synthetic */ WinterFlowPackageHook WinterFlowUnitTestResponse = new WinterFlowPackageHook(3);
    public final /* synthetic */ int WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowPackageHook(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowModuleClass
    public /* synthetic */ Object WinterFlowArrayNetwork(WinterFlowExceptionParser winterFlowExceptionParser) {
        switch (this.WinterFlowVariableVersionControl) {
            case 2:
                Intent intent = (Intent) ((Bundle) winterFlowExceptionParser.WinterFlowTransactionManagerStrategy()).getParcelable("notification_data");
                if (intent != null) {
                    return new WinterFlowThreadTransactionManager(intent);
                }
                return null;
            default:
                if (winterFlowExceptionParser.WinterFlowRouterRouter()) {
                    return (Bundle) winterFlowExceptionParser.WinterFlowTransactionManagerStrategy();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(winterFlowExceptionParser.WinterFlowVariableVersionControl()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", winterFlowExceptionParser.WinterFlowVariableVersionControl());
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int hashCode = hashCode();
                WinterFlowQuerySyntax.WinterFlowArrayNetwork(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + WinterFlowListenerProtocol.WinterFlowRouterStructure(String.class).WinterFlowCacheManagerAgent() + ">";
            default:
                return super.toString();
        }
    }
}
