package app.cash.local.backend.real;

import app.cash.local.primitives.BrandSpot;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes3.dex */
public final class RealLocalBrandRepository {
    public final LocalInMemoryDatabase localInMemoryDatabase;

    public RealLocalBrandRepository(LocalInMemoryDatabase localInMemoryDatabase) {
        this.localInMemoryDatabase = localInMemoryDatabase;
    }

    public final ChannelFlowTransformLatest brand(BrandSpot brandSpot) {
        int i;
        Continuation continuation;
        MutableSharedFlow mutableSharedFlow;
        brandSpot.getClass();
        LocalInMemoryDatabase localInMemoryDatabase = this.localInMemoryDatabase;
        LinkedHashMap linkedHashMap = localInMemoryDatabase.brandSpotMappings;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(brandSpot);
                i = 1;
                continuation = null;
                Object obj2 = obj;
                if (obj == null) {
                    SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
                    MutableSharedFlow$default.tryEmit(null);
                    linkedHashMap.put(brandSpot, MutableSharedFlow$default);
                    obj2 = MutableSharedFlow$default;
                }
                mutableSharedFlow = (MutableSharedFlow) obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return FlowKt.transformLatest(mutableSharedFlow, new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, localInMemoryDatabase, brandSpot, i));
    }

    public final Flow buyerInfo(BrandSpot brandSpot) {
        brandSpot.getClass();
        return FlowKt.distinctUntilChanged(LocalInMemoryDatabase.getOrPutFlow$default(this.localInMemoryDatabase.buyerInfos, brandSpot));
    }
}
