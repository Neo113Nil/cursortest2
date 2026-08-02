package com.datadog.android.core.constraints;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.JsonSerializer$safeMapValuesToJson$1$1;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class DatadogDataConstraints {
    public static final Set reservedTagKeys = ArraysKt___ArraysKt.toSet(new String[]{"host", "device", "source"});
    public final InternalLogger internalLogger;
    public final List tagTransforms;

    public DatadogDataConstraints(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.tagTransforms = CollectionsKt__CollectionsKt.listOf((Object[]) new Function1[]{DatadogDataConstraints$tagTransforms$1.INSTANCE, DatadogDataConstraints$tagTransforms$1.INSTANCE$1, DatadogDataConstraints$tagTransforms$1.INSTANCE$2, DatadogDataConstraints$tagTransforms$1.INSTANCE$3, DatadogDataConstraints$tagTransforms$1.INSTANCE$4, new DatadogDataConstraints$tagTransforms$1(this)});
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap validateAttributes(Map map, String str, String str2, Set set) {
        InternalLogger.Target target;
        Pair pair;
        map.getClass();
        set.getClass();
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        int i3 = 1;
        int i4 = i + 1;
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            target = InternalLogger.Target.USER;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                DBUtil.log$default(this.internalLogger, 5, target, new JsonSerializer$safeMapValuesToJson$1$1(entry, 1), null, false, 56);
            } else if (set.contains(entry.getKey())) {
                DBUtil.log$default(this.internalLogger, 5, target, new JsonSerializer$safeMapValuesToJson$1$1(entry, 2), null, false, 56);
            } else {
                String str3 = (String) entry.getKey();
                ArrayList arrayList2 = new ArrayList(str3.length());
                int i5 = i4;
                for (int i6 = 0; i6 < str3.length(); i6++) {
                    char charAt = str3.charAt(i6);
                    if (charAt == '.' && (i5 = i5 + 1) > 9) {
                        charAt = '_';
                    }
                    arrayList2.add(Character.valueOf(charAt));
                }
                char[] cArr = new char[arrayList2.size()];
                Iterator it2 = arrayList2.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    cArr[i7] = ((Character) it2.next()).charValue();
                    i7++;
                }
                String str4 = new String(cArr);
                if (!str4.equals(entry.getKey())) {
                    DBUtil.log$default(this.internalLogger, 4, target, new DatadogDataConstraints$validateTimings$1$1(entry, str4, 1), null, false, 56);
                }
                pair = new Pair(str4, entry.getValue());
                if (pair == null) {
                    arrayList.add(pair);
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        int size = arrayList.size() - 128;
        if (size > 0) {
            DBUtil.log$default(this.internalLogger, 4, target, new DatadogInterceptor$intercept$1(str2 != null ? Recorder$$ExternalSyntheticOutline1.m("Too many attributes were added for [", size, str2, "], ", " had to be discarded.") : JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size, "Too many attributes were added, ", " had to be discarded."), i3), null, false, 56);
        }
        List take = CollectionsKt.take(arrayList, 128);
        take.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MapsKt__MapsKt.putAll(linkedHashMap, take);
        return linkedHashMap;
    }
}
