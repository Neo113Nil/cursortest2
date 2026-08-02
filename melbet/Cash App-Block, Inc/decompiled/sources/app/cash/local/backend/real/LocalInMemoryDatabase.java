package app.cash.local.backend.real;

import app.cash.local.primitives.BrandSpot;
import dev.zacsweers.metro.internal.Factory;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes3.dex */
public final class LocalInMemoryDatabase {
    public final LinkedHashMap brands = new LinkedHashMap();
    public final LinkedHashMap locationStatuses = new LinkedHashMap();
    public final LinkedHashMap buyerInfos = new LinkedHashMap();
    public final LinkedHashMap brandSpotMappings = new LinkedHashMap();

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory(0);
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE$2 = new MetroFactory(2);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new LocalInMemoryDatabase();
                case 1:
                    return new RealBuyerIntentManager();
                default:
                    return new RealLocalBrandProfileCheckedInSheetTracker();
            }
        }
    }

    public static MutableSharedFlow getOrPutFlow$default(LinkedHashMap linkedHashMap, BrandSpot brandSpot) {
        MutableSharedFlow mutableSharedFlow;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(brandSpot);
                if (obj == null) {
                    obj = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
                    linkedHashMap.put(brandSpot, obj);
                }
                mutableSharedFlow = (MutableSharedFlow) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mutableSharedFlow;
    }
}
