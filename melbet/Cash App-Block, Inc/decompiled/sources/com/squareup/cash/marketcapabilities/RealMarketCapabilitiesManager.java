package com.squareup.cash.marketcapabilities;

import androidx.compose.runtime.Recomposer$join$2;
import androidx.datastore.core.DataStoreImpl$data$1;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.zzr;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealMarketCapabilitiesManager {
    public final ReadonlySharedFlow capabilitiesFlow;
    public volatile List currentCapabilities = EmptyList.INSTANCE;
    public final RealMarketCapabilitiesDataManager dataManager;
    public final zzr lnMcfMigrationLogger;
    public final SessionManager sessionManager;

    public RealMarketCapabilitiesManager(CoroutineScope coroutineScope, RealMarketCapabilitiesDataManager realMarketCapabilitiesDataManager, SessionManager sessionManager, zzr zzrVar) {
        this.dataManager = realMarketCapabilitiesDataManager;
        this.sessionManager = sessionManager;
        this.lnMcfMigrationLogger = zzrVar;
        Continuation continuation = null;
        this.capabilitiesFlow = FlowKt.shareIn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.mapLatest(new Recomposer$join$2(2, continuation, 5), FlowKt.distinctUntilChanged(realMarketCapabilitiesDataManager.clientMarketCapabilitiesFlow)), new RealGcmRegistrar$unregister$2(this, continuation, 23), 3), coroutineScope, SharingStarted.Companion.Eagerly, 1);
    }

    public final MarketCapabilityAvailability currentAvailability(MarketCapabilityName marketCapabilityName) {
        Object obj;
        if (PlatformKt.hasOnboardedAccount(this.sessionManager)) {
            Iterator it = this.currentCapabilities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((MarketCapability) obj).getCapabilityName() == marketCapabilityName) {
                    break;
                }
            }
            MarketCapability marketCapability = (MarketCapability) obj;
            if (marketCapability != null) {
                return marketCapability.getCapabilityAvailability();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ready(ContinuationImpl continuationImpl) {
        RealMarketCapabilitiesManager$ready$1 realMarketCapabilitiesManager$ready$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RealMarketCapabilitiesManager$ready$1) {
            realMarketCapabilitiesManager$ready$1 = (RealMarketCapabilitiesManager$ready$1) continuationImpl;
            int i2 = realMarketCapabilitiesManager$ready$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMarketCapabilitiesManager$ready$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = realMarketCapabilitiesManager$ready$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMarketCapabilitiesManager$ready$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realMarketCapabilitiesManager$ready$1.label = 1;
                    obj = this.dataManager.validateCache(realMarketCapabilitiesManager$ready$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Boolean.valueOf(obj != null);
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                DataStoreImpl$data$1.AnonymousClass2 anonymousClass2 = new DataStoreImpl$data$1.AnonymousClass2(28);
                realMarketCapabilitiesManager$ready$1.label = 2;
                obj = FirstOrNullOnTimeoutKt.firstOrNullWithTimeout(this.capabilitiesFlow, anonymousClass2, realMarketCapabilitiesManager$ready$1);
            }
        }
        realMarketCapabilitiesManager$ready$1 = new RealMarketCapabilitiesManager$ready$1(this, continuationImpl);
        obj = realMarketCapabilitiesManager$ready$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMarketCapabilitiesManager$ready$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
