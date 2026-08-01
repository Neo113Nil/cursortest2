package com.google.android.datatransport;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowObjectRuntime extends WinterFlowDatabaseSchemaPipeline implements WinterFlowObjectUI {
    public final /* synthetic */ int WinterFlowServerProtocol;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowObjectRuntime(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.WinterFlowServerProtocol = i3;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectUI
    public final Object WinterFlowRouterStructure() {
        ContentCaptureSession WinterFlowRouterStructure;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        int i = this.WinterFlowServerProtocol;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj = this.WinterFlowTransactionManagerStrategy;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                View view = (View) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    WinterFlowDebugPlatform.WinterFlowRouterRouter(view);
                }
                if (i2 < 29 || (WinterFlowRouterStructure = WinterFlowBackendSubsystem.WinterFlowRouterStructure(view)) == null) {
                    return null;
                }
                return new WinterFlowAlgorithmArray(6, WinterFlowRouterStructure, view);
            case 1:
                WinterFlowTransactionManagerProcess winterFlowTransactionManagerProcess = (WinterFlowTransactionManagerProcess) obj;
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager = winterFlowTransactionManagerProcess.WinterFlowCacheManagerAgent;
                WinterFlowCacheManagerTransactionManager winterFlowCacheManagerTransactionManager2 = winterFlowTransactionManagerProcess.WinterFlowArrayNetwork;
                WinterFlowHookMechanism winterFlowHookMechanism = winterFlowTransactionManagerProcess.WinterFlowRouterStructure;
                WinterFlowDeploymentWidget WinterFlowTransactionManagerStrategy = winterFlowHookMechanism.WinterFlowTransactionManagerStrategy();
                if (WinterFlowTransactionManagerStrategy == null) {
                    Object[] objArr = winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource;
                    long[] jArr = winterFlowCacheManagerTransactionManager2.WinterFlowRouterStructure;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((WinterFlowLoaderEncryption) objArr[(i3 << 3) + i5]).WinterFlowUIPlatform();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                } else if (WinterFlowTransactionManagerStrategy.WinterFlowSingletonPlatform) {
                    if (winterFlowCacheManagerTransactionManager.WinterFlowCacheManagerAgent(WinterFlowTransactionManagerStrategy)) {
                        WinterFlowTransactionManagerStrategy.WinterFlowRepositoryAlgorithm();
                    }
                    WinterFlowTransactionManagerStrategy.WinterFlowEncryptionAdapter();
                    if (!WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                        WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
                    }
                    WinterFlowUserManagerController winterFlowUserManagerController = WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl;
                    WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowTransactionManagerStrategy);
                    int i6 = 0;
                    while (WinterFlowSyntaxSubsystem != null) {
                        if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 5120) != 0) {
                            while (winterFlowUserManagerController != null) {
                                int i7 = winterFlowUserManagerController.WinterFlowUnitTestResponse;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((winterFlowUserManagerController instanceof WinterFlowLoaderEncryption) && winterFlowCacheManagerTransactionManager2.WinterFlowCacheManagerAgent(winterFlowUserManagerController)) {
                                        if (i6 <= 1) {
                                            ((WinterFlowLoaderEncryption) winterFlowUserManagerController).WinterFlowUIPlatform();
                                            throw null;
                                        }
                                        ((WinterFlowLoaderEncryption) winterFlowUserManagerController).WinterFlowUIPlatform();
                                        throw null;
                                    }
                                }
                                winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowSyntax;
                            }
                        }
                        WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
                        winterFlowUserManagerController = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
                    }
                    Object[] objArr2 = winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource;
                    long[] jArr2 = winterFlowCacheManagerTransactionManager2.WinterFlowRouterStructure;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((WinterFlowLoaderEncryption) objArr2[(i8 << 3) + i10]).WinterFlowUIPlatform();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (winterFlowHookMechanism.WinterFlowTransactionManagerStrategy() == null || winterFlowHookMechanism.WinterFlowCacheManagerAgent.WinterFlowEncryptionAdapter() == WinterFlowProtocolCache.WinterFlowUnitTestResponse) {
                    winterFlowHookMechanism.WinterFlowCacheManagerAgent();
                }
                winterFlowCacheManagerTransactionManager.WinterFlowHookDataSource();
                winterFlowCacheManagerTransactionManager2.WinterFlowHookDataSource();
                winterFlowTransactionManagerProcess.WinterFlowVariableVersionControl = false;
                return winterFlowAlgorithmSession;
            case 2:
                return Boolean.valueOf(((WinterFlowDeploymentMechanism) obj).WinterFlowBackendCacheManager.WinterFlowSoftwareServiceProvider(7));
            default:
                WinterFlowCloudFramework winterFlowCloudFramework = (WinterFlowCloudFramework) obj;
                WinterFlowEventEmitterFramework winterFlowEventEmitterFramework = winterFlowCloudFramework.WinterFlowRouterStructure;
                if (winterFlowEventEmitterFramework == null) {
                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("coroutineScope");
                    throw null;
                }
                WinterFlowEncryptionSubsystem.WinterFlowTransactionAgent(winterFlowEventEmitterFramework, null);
                winterFlowCloudFramework.WinterFlowArrayNetwork();
                WinterFlowConsumerServiceProvider winterFlowConsumerServiceProvider = winterFlowCloudFramework.WinterFlowVariableVersionControl;
                if (winterFlowConsumerServiceProvider == null) {
                    WinterFlowManagerRequest.WinterFlowCloudMicroservice("connectionManager");
                    throw null;
                }
                ((WinterFlowUserManagerNetwork) winterFlowConsumerServiceProvider.WinterFlowTransactionManagerStrategy).close();
                WinterFlowSyntaxDebug winterFlowSyntaxDebug = (WinterFlowSyntaxDebug) winterFlowConsumerServiceProvider.WinterFlowUnitTestResponse;
                if (winterFlowSyntaxDebug != null) {
                    winterFlowSyntaxDebug.close();
                }
                return winterFlowAlgorithmSession;
        }
    }
}
