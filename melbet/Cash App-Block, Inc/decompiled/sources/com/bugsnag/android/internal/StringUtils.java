package com.bugsnag.android.internal;

import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes4.dex */
public abstract class StringUtils {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewListing.deepLinkSpecs;
    }

    public static boolean isDefinitelyMutableMap(Object obj) {
        return (obj instanceof HashMap) || (obj instanceof TreeMap) || (obj instanceof ConcurrentMap) || (obj instanceof EnumMap) || (obj instanceof Hashtable) || (obj instanceof WeakHashMap);
    }

    public static String stringTrimmedTo(int i, String str) {
        int length = str.length() - i;
        if (length < 25) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        sb.append("***<");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length, "> CHARS TRUNCATED***", sb);
    }

    public static TrimMetrics trimStringValuesTo(int i, Map map) {
        int i2;
        int i3;
        Object obj;
        int i4 = 0;
        int i5 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.length() > i) {
                    String stringTrimmedTo = stringTrimmedTo(i, str);
                    i3 = str.length() - i;
                    entry.setValue(stringTrimmedTo);
                    i4++;
                    i5 += i3;
                }
            }
            if (isDefinitelyMutableMap(value)) {
                value.getClass();
                TrimMetrics trimStringValuesTo = trimStringValuesTo(i, TypeIntrinsics.asMutableMap(value));
                i2 = trimStringValuesTo.itemsTrimmed;
                i3 = trimStringValuesTo.dataTrimmed;
                obj = value;
            } else if ((value instanceof ArrayList) || (value instanceof LinkedList) || (value instanceof CopyOnWriteArrayList) || (value instanceof Vector)) {
                value.getClass();
                TrimMetrics trimStringValuesTo2 = trimStringValuesTo(i, TypeIntrinsics.asMutableList(value));
                i2 = trimStringValuesTo2.itemsTrimmed;
                i3 = trimStringValuesTo2.dataTrimmed;
                obj = value;
            } else if (value instanceof Map) {
                Map asMutableMap = TypeIntrinsics.asMutableMap(new LinkedHashMap((Map) value));
                TrimMetrics trimStringValuesTo3 = trimStringValuesTo(i, asMutableMap);
                i2 = trimStringValuesTo3.itemsTrimmed;
                i3 = trimStringValuesTo3.dataTrimmed;
                obj = asMutableMap;
            } else if (value instanceof Collection) {
                ArrayList arrayList = new ArrayList((Collection) value);
                TrimMetrics trimStringValuesTo4 = trimStringValuesTo(i, arrayList);
                int i6 = trimStringValuesTo4.itemsTrimmed;
                int i7 = trimStringValuesTo4.dataTrimmed;
                entry.setValue(arrayList);
                i4 += i6;
                i5 += i7;
            }
            entry.setValue(obj);
            i4 += i2;
            i5 += i3;
        }
        return new TrimMetrics(i4, i5);
    }

    public static TrimMetrics trimStringValuesTo(int i, List list) {
        int i2;
        int i3;
        Object obj;
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj2 = list.get(i6);
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (str.length() > i) {
                    String stringTrimmedTo = stringTrimmedTo(i, str);
                    i3 = str.length() - i;
                    list.set(i6, stringTrimmedTo);
                    i4++;
                    i5 += i3;
                }
            }
            if (isDefinitelyMutableMap(obj2)) {
                obj2.getClass();
                TrimMetrics trimStringValuesTo = trimStringValuesTo(i, TypeIntrinsics.asMutableMap(obj2));
                i2 = trimStringValuesTo.itemsTrimmed;
                i3 = trimStringValuesTo.dataTrimmed;
                obj = obj2;
            } else if (!(obj2 instanceof ArrayList) && !(obj2 instanceof LinkedList) && !(obj2 instanceof CopyOnWriteArrayList) && !(obj2 instanceof Vector)) {
                if (obj2 instanceof Map) {
                    Map asMutableMap = TypeIntrinsics.asMutableMap(new LinkedHashMap((Map) obj2));
                    TrimMetrics trimStringValuesTo2 = trimStringValuesTo(i, asMutableMap);
                    i2 = trimStringValuesTo2.itemsTrimmed;
                    i3 = trimStringValuesTo2.dataTrimmed;
                    obj = asMutableMap;
                } else {
                    if (obj2 instanceof Collection) {
                        ArrayList arrayList = new ArrayList((Collection) obj2);
                        TrimMetrics trimStringValuesTo3 = trimStringValuesTo(i, arrayList);
                        int i7 = trimStringValuesTo3.itemsTrimmed;
                        int i8 = trimStringValuesTo3.dataTrimmed;
                        list.set(i6, arrayList);
                        i4 += i7;
                        i5 += i8;
                    }
                }
            } else {
                obj2.getClass();
                TrimMetrics trimStringValuesTo4 = trimStringValuesTo(i, TypeIntrinsics.asMutableList(obj2));
                i2 = trimStringValuesTo4.itemsTrimmed;
                i3 = trimStringValuesTo4.dataTrimmed;
                obj = obj2;
            }
            list.set(i6, obj);
            i4 += i2;
            i5 += i3;
        }
        return new TrimMetrics(i4, i5);
    }
}
