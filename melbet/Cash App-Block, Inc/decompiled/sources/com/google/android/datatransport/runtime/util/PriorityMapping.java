package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.Priority;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class PriorityMapping {
    public static final HashMap PRIORITY_INT_MAP;
    public static final SparseArray PRIORITY_MAP = new SparseArray();

    static {
        HashMap hashMap = new HashMap();
        PRIORITY_INT_MAP = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        hashMap.put(Priority.VERY_LOW, 1);
        hashMap.put(Priority.HIGHEST, 2);
        for (Priority priority : hashMap.keySet()) {
            PRIORITY_MAP.append(((Integer) PRIORITY_INT_MAP.get(priority)).intValue(), priority);
        }
    }

    public static int toInt(Priority priority) {
        Integer num = (Integer) PRIORITY_INT_MAP.get(priority);
        if (num != null) {
            return num.intValue();
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(priority, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static Priority valueOf(int i) {
        Priority priority = (Priority) PRIORITY_MAP.get(i);
        if (priority != null) {
            return priority;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unknown Priority for value "));
        return null;
    }
}
