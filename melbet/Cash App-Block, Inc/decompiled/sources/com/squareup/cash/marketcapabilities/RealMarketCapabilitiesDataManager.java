package com.squareup.cash.marketcapabilities;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaad;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealMarketCapabilitiesDataManager {
    public final Flow clientMarketCapabilitiesFlow;
    public final RealMarketCapabilitiesDataSource dataSource;

    public RealMarketCapabilitiesDataManager(CoroutineContext coroutineContext, RealMarketCapabilitiesDataSource realMarketCapabilitiesDataSource, RealMarketCapabilitiesValidator realMarketCapabilitiesValidator) {
        this.dataSource = realMarketCapabilitiesDataSource;
        this.clientMarketCapabilitiesFlow = FlowKt.flowOn(new FinishSetupTileBadgeCounter(17, realMarketCapabilitiesDataSource.protoMarketCapabilitiesFlow, this), coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validateCache(ContinuationImpl continuationImpl) {
        RealMarketCapabilitiesDataManager$validateCache$1 realMarketCapabilitiesDataManager$validateCache$1;
        int i;
        List list;
        List list2;
        ArrayList convertAndFilterKnownValues;
        if (continuationImpl instanceof RealMarketCapabilitiesDataManager$validateCache$1) {
            realMarketCapabilitiesDataManager$validateCache$1 = (RealMarketCapabilitiesDataManager$validateCache$1) continuationImpl;
            int i2 = realMarketCapabilitiesDataManager$validateCache$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMarketCapabilitiesDataManager$validateCache$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMarketCapabilitiesDataManager$validateCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMarketCapabilitiesDataManager$validateCache$1.label;
                ArrayList arrayList = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2 = this.dataSource.protoMarketCapabilitiesFlow;
                    realMarketCapabilitiesDataManager$validateCache$1.L$0 = this;
                    realMarketCapabilitiesDataManager$validateCache$1.label = 1;
                    obj = FlowKt.firstOrNull(appLockMonitor$special$$inlined$map$2, realMarketCapabilitiesDataManager$validateCache$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = realMarketCapabilitiesDataManager$validateCache$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                list = (List) obj;
                this.getClass();
                list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    convertAndFilterKnownValues = zzaad.convertAndFilterKnownValues(list);
                    if (RealMarketCapabilitiesValidator.validateClientMarketCapabilities(convertAndFilterKnownValues)) {
                        arrayList = convertAndFilterKnownValues;
                    }
                }
                return Boolean.valueOf(!(arrayList != null || arrayList.isEmpty()));
            }
        }
        realMarketCapabilitiesDataManager$validateCache$1 = new RealMarketCapabilitiesDataManager$validateCache$1(this, continuationImpl);
        Object obj2 = realMarketCapabilitiesDataManager$validateCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMarketCapabilitiesDataManager$validateCache$1.label;
        ArrayList arrayList2 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        this.getClass();
        list2 = list;
        if (list2 != null) {
            convertAndFilterKnownValues = zzaad.convertAndFilterKnownValues(list);
            if (RealMarketCapabilitiesValidator.validateClientMarketCapabilities(convertAndFilterKnownValues)) {
            }
        }
        return Boolean.valueOf(!(arrayList2 != null || arrayList2.isEmpty()));
    }
}
