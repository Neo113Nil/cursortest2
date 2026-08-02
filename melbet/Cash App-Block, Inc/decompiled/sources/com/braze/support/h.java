package com.braze.support;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;

/* loaded from: classes4.dex */
public abstract class h {
    public static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("HttpUtils");
    public static final SimpleDateFormat b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);

    public static final LinkedHashMap a(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            key.getClass();
            Locale locale = Locale.US;
            linkedHashMap2.put(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, (String) key, locale), entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), CollectionsKt.joinToString$default((Iterable) entry3.getValue(), null, null, null, 0, null, null, 63));
        }
        return linkedHashMap3;
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not parse http-date value: ", str);
    }

    public static final Long a(String str) {
        try {
            Double doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str);
            if (doubleOrNull != null) {
                return Long.valueOf((long) (doubleOrNull.doubleValue() * 1000.0d));
            }
            Date parse = b.parse(str);
            if (parse != null) {
                return Long.valueOf(parse.getTime() - DateTimeUtils.nowInMilliseconds());
            }
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda1(str, 27), 8, (Object) null);
            return null;
        }
    }
}
