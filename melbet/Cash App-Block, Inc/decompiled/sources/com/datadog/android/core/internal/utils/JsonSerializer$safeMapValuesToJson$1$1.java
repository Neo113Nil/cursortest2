package com.datadog.android.core.internal.utils;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class JsonSerializer$safeMapValuesToJson$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ Map.Entry $it;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonSerializer$safeMapValuesToJson$1$1(Map.Entry entry, int i) {
        super(0);
        this.$r8$classId = i;
        this.$it = entry;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Map.Entry entry = this.$it;
        switch (i) {
            case 0:
                return String.format(Locale.US, "Error serializing value for key %s, value was dropped.", Arrays.copyOf(new Object[]{entry.getKey()}, 1));
            case 1:
                return "\"" + entry + "\" is an invalid attribute, and was ignored.";
            case 2:
                return "\"" + entry + "\" key was in the reservedKeys set, and was dropped.";
            default:
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error converting value for key ", " to meta string, it will be dropped.", entry.getKey());
        }
    }
}
