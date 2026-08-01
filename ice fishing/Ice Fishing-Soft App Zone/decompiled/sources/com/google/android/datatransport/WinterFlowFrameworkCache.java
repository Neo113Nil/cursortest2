package com.google.android.datatransport;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowFrameworkCache extends WinterFlowDatabaseSchemaPipeline implements WinterFlowObjectSession {
    public final /* synthetic */ int WinterFlowServerProtocol;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WinterFlowFrameworkCache(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.WinterFlowServerProtocol = i3;
    }

    @Override // com.google.android.datatransport.WinterFlowObjectSession
    public final Object WinterFlowUnitTestResponse(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2 = this.WinterFlowServerProtocol;
        WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer = null;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        Object obj2 = this.WinterFlowTransactionManagerStrategy;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                WinterFlowDataSourceConsumer winterFlowDataSourceConsumer = (WinterFlowDataSourceConsumer) obj2;
                WinterFlowRepositoryProcessor winterFlowRepositoryProcessor = winterFlowDataSourceConsumer.WinterFlowStrategyTool;
                if (booleanValue) {
                    winterFlowDataSourceConsumer.WinterFlowRepositoryAlgorithm();
                } else {
                    if (winterFlowDataSourceConsumer.WinterFlowRouterAdapter != null) {
                        Object[] objArr3 = winterFlowRepositoryProcessor.WinterFlowCacheManagerAgent;
                        long[] jArr = winterFlowRepositoryProcessor.WinterFlowRouterStructure;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            i = i5;
                                            objArr2 = objArr3;
                                            WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowDataSourceConsumer.WinterFlowModuleService(), null, new WinterFlowUserManagerFunction(winterFlowDataSourceConsumer, (WinterFlowDebugVersion) objArr3[(i4 << 3) + i7], winterFlowTransactionManagerLayer, i3), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i6 != i5) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i4 != length) {
                                    i4++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        WinterFlowDebugVersion winterFlowDebugVersion = winterFlowDataSourceConsumer.WinterFlowPackageIDE;
                        if (winterFlowDebugVersion != null) {
                            WinterFlowCacheRuntime.WinterFlowStrategyTool(winterFlowDataSourceConsumer.WinterFlowModuleService(), null, new WinterFlowUserManagerFunction(winterFlowDataSourceConsumer, winterFlowDebugVersion, winterFlowTransactionManagerLayer, 1), 3);
                        }
                    }
                    winterFlowRepositoryProcessor.WinterFlowRouterStructure();
                    winterFlowDataSourceConsumer.WinterFlowPackageIDE = null;
                }
                return winterFlowAlgorithmSession;
            case 1:
                ((Set) obj).getClass();
                WinterFlowResponseConfiguration winterFlowResponseConfiguration = (WinterFlowResponseConfiguration) obj2;
                ReentrantLock reentrantLock = winterFlowResponseConfiguration.WinterFlowArrayNetwork;
                reentrantLock.lock();
                try {
                    List WinterFlowProtocolConsumer = WinterFlowSerializerUtility.WinterFlowProtocolConsumer(winterFlowResponseConfiguration.WinterFlowCacheManagerAgent.values());
                    reentrantLock.unlock();
                    Iterator it = WinterFlowProtocolConsumer.iterator();
                    if (!it.hasNext()) {
                        return winterFlowAlgorithmSession;
                    }
                    ((WinterFlowEncryptionCacheManager) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((WinterFlowMicroserviceRefactoring) obj2).WinterFlowServiceUtility((Throwable) obj);
                return winterFlowAlgorithmSession;
        }
    }
}
