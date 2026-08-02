package com.squareup.cash.marketcapabilities;

import dev.zacsweers.metro.internal.Factory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes.dex */
public final class RealMarketCapabilitiesValidator {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealMarketCapabilitiesValidator();
        }
    }

    public static boolean validateClientMarketCapabilities(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MarketCapability) it.next()).getCapabilityName());
        }
        return arrayList2.containsAll(ArraysKt___ArraysKt.toList(MarketCapabilityName.values()));
    }
}
