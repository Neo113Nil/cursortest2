package bo.app;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.ArrayIterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c9 {
    public static final b9 b;
    public static final LinkedHashMap c;
    public static final c9 d;
    public static final c9 e;
    public static final c9 f;
    public static final c9 g;
    public static final c9 h;
    public static final c9 i;
    public static final c9 j;
    public static final c9 k;
    public static final c9 l;
    public static final c9 m;
    public static final c9 n;
    public static final c9 o;
    public static final /* synthetic */ c9[] p;
    public final String a;

    static {
        c9 c9Var = new c9("CONTENT_CARD_SYNC", 0, "content_cards/sync");
        d = c9Var;
        c9 c9Var2 = new c9("FEATURE_FLAG_SYNC", 1, "feature_flags/sync");
        e = c9Var2;
        c9 c9Var3 = new c9("V3_DATA", 2, "data");
        f = c9Var3;
        c9 c9Var4 = new c9("TEMPLATE_REQUEST", 3, "template");
        g = c9Var4;
        c9 c9Var5 = new c9("PUSH_DELIVERY_EVENTS", 4, "push/delivery_events");
        h = c9Var5;
        c9 c9Var6 = new c9("GEOFENCE_REFRESH", 5, "geofence/request");
        i = c9Var6;
        c9 c9Var7 = new c9("GEOFENCE_REPORT", 6, "geofence/report");
        j = c9Var7;
        c9 c9Var8 = new c9("PUSH_REDELIVER", 7, "push/redeliver");
        k = c9Var8;
        c9 c9Var9 = new c9("BANNERS_SYNC", 8, "banners/sync");
        l = c9Var9;
        c9 c9Var10 = new c9("SDK_DEBUGGER_INIT", 9, "debugger/init");
        m = c9Var10;
        c9 c9Var11 = new c9("SDK_DEBUGGER_LOG", 10, "debugger/log");
        n = c9Var11;
        c9 c9Var12 = new c9("DUST_CONFIG", 11, "dust/config");
        o = c9Var12;
        c9[] c9VarArr = {c9Var, c9Var2, c9Var3, c9Var4, c9Var5, c9Var6, c9Var7, c9Var8, c9Var9, c9Var10, c9Var11, c9Var12};
        p = c9VarArr;
        EnumEntriesList enumEntriesList = new EnumEntriesList(c9VarArr);
        b = new b9();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(enumEntriesList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
        ArrayIterator arrayIterator = new ArrayIterator(enumEntriesList);
        while (arrayIterator.hasNext()) {
            Object next = arrayIterator.next();
            linkedHashMap.put(((c9) next).a, next);
        }
        c = linkedHashMap;
    }

    public c9(String str, int i2, String str2) {
        this.a = str2;
    }

    public static c9 valueOf(String str) {
        return (c9) Enum.valueOf(c9.class, str);
    }

    public static c9[] values() {
        return (c9[]) p.clone();
    }
}
