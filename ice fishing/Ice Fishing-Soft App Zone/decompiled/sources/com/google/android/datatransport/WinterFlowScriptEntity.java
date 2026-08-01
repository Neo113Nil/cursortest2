package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowScriptEntity implements WinterFlowTransactionPlatform {
    public final /* synthetic */ int WinterFlowArrayNetwork;
    public final /* synthetic */ WinterFlowSessionUI WinterFlowCacheManagerAgent;
    public final /* synthetic */ WinterFlowTransactionPlatform WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;
    public final /* synthetic */ WinterFlowTransactionPlatform WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowScriptEntity(WinterFlowTransactionPlatform winterFlowTransactionPlatform, WinterFlowSessionUI winterFlowSessionUI, int i, WinterFlowTransactionPlatform winterFlowTransactionPlatform2, int i2) {
        this.WinterFlowRouterStructure = i2;
        this.WinterFlowCacheManagerAgent = winterFlowSessionUI;
        this.WinterFlowArrayNetwork = i;
        this.WinterFlowVariableVersionControl = winterFlowTransactionPlatform2;
        this.WinterFlowHookDataSource = winterFlowTransactionPlatform;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final WinterFlowObjectSession WinterFlowArrayNetwork() {
        switch (this.WinterFlowRouterStructure) {
        }
        return this.WinterFlowHookDataSource.WinterFlowArrayNetwork();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final int WinterFlowCacheManagerAgent() {
        switch (this.WinterFlowRouterStructure) {
        }
        return this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final void WinterFlowHookDataSource() {
        int i;
        int i2 = this.WinterFlowRouterStructure;
        WinterFlowTransactionPlatform winterFlowTransactionPlatform = this.WinterFlowVariableVersionControl;
        int i3 = this.WinterFlowArrayNetwork;
        WinterFlowSessionUI winterFlowSessionUI = this.WinterFlowCacheManagerAgent;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                winterFlowSessionUI.WinterFlowSyntax = i3;
                winterFlowTransactionPlatform.WinterFlowHookDataSource();
                WinterFlowJSON winterFlowJSON = winterFlowSessionUI.WinterFlowConcurrencyThread;
                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowSessionUI.WinterFlowOrchestrationSubsystem;
                long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource[i8];
                                    WinterFlowInvokerMicroservice winterFlowInvokerMicroservice = (WinterFlowInvokerMicroservice) winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent[i8];
                                    int WinterFlowSyntax = winterFlowJSON.WinterFlowSyntax(obj);
                                    if (WinterFlowSyntax < 0 || WinterFlowSyntax >= winterFlowSessionUI.WinterFlowSyntax) {
                                        if (WinterFlowSyntax >= 0) {
                                            Object obj2 = WinterFlowUnitTestLibrary.WinterFlowBandwidthObject;
                                            i = i5;
                                            Object[] objArr = winterFlowJSON.WinterFlowVariableVersionControl;
                                            Object obj3 = objArr[WinterFlowSyntax];
                                            objArr[WinterFlowSyntax] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (winterFlowSessionUI.WinterFlowServiceUtility.WinterFlowHookDataSource(obj)) {
                                            winterFlowInvokerMicroservice.WinterFlowRouterStructure();
                                        }
                                        winterFlowDatabaseSchemaStructure.WinterFlowServerProtocol(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                winterFlowSessionUI.WinterFlowTransactionManagerStrategy(winterFlowSessionUI.WinterFlowRouterRouter);
                break;
            default:
                winterFlowSessionUI.WinterFlowRouterRouter = i3;
                winterFlowTransactionPlatform.WinterFlowHookDataSource();
                if (winterFlowSessionUI.WinterFlowVariableVersionControl.WinterFlowServerProtocol == null) {
                    winterFlowSessionUI.WinterFlowTransactionManagerStrategy(winterFlowSessionUI.WinterFlowRouterRouter);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final Map WinterFlowRouterStructure() {
        switch (this.WinterFlowRouterStructure) {
        }
        return this.WinterFlowHookDataSource.WinterFlowRouterStructure();
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionPlatform
    public final int WinterFlowVariableVersionControl() {
        switch (this.WinterFlowRouterStructure) {
        }
        return this.WinterFlowHookDataSource.WinterFlowVariableVersionControl();
    }
}
