package com.squareup.cash.gcl.data;

import com.squareup.cash.blockers.flowlistener.CombinedBlockerFlowListener;
import com.squareup.cash.gcl.delegate.GlobalConfigItemDelegate;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.SetFactory;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes6.dex */
public final class RealGlobalConfigDataSource {
    public final LinkedHashMap configItems;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final SetFactory delegates;

        public /* synthetic */ MetroFactory(SetFactory setFactory, int i) {
            this.$r8$classId = i;
            this.delegates = setFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            SetFactory setFactory = this.delegates;
            switch (i) {
                case 0:
                    Set set = (Set) setFactory.invoke();
                    set.getClass();
                    return new RealGlobalConfigDataSource(set);
                case 1:
                    Set set2 = (Set) setFactory.invoke();
                    set2.getClass();
                    return new CombinedBlockerFlowListener(set2);
                case 2:
                    Set set3 = (Set) setFactory.invoke();
                    set3.getClass();
                    return new TreehouseScreenFactory(set3);
                default:
                    Set set4 = (Set) setFactory.invoke();
                    set4.getClass();
                    return set4;
            }
        }
    }

    public RealGlobalConfigDataSource(Set set) {
        Set set2 = set;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Object obj : set2) {
            linkedHashMap.put(((GlobalConfigItemDelegate) obj).getItem(), obj);
        }
        this.configItems = linkedHashMap;
    }
}
