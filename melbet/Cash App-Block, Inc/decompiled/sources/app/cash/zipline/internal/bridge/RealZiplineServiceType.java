package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineFunction;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes3.dex */
public final class RealZiplineServiceType {
    public final List functions;
    public final LinkedHashMap functionsById;
    public final String name;

    public RealZiplineServiceType(String str, List list) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.functions = list;
        List list2 = list;
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        for (Object obj : list2) {
            linkedHashMap.put(((ZiplineFunction) obj).getId(), obj);
        }
        this.functionsById = linkedHashMap;
    }
}
