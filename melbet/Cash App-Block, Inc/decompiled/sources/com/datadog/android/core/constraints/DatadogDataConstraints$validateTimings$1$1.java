package com.datadog.android.core.constraints;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogDataConstraints$validateTimings$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ Map.Entry $entry;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $sanitizedKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogDataConstraints$validateTimings$1$1(Map.Entry entry, String str, int i) {
        super(0);
        this.$r8$classId = i;
        this.$entry = entry;
        this.$sanitizedKey = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.$sanitizedKey;
        Map.Entry entry = this.$entry;
        switch (i) {
            case 0:
                return String.format(Locale.US, "Invalid timing name: %s, sanitized to: %s", Arrays.copyOf(new Object[]{entry.getKey(), str}, 2));
            default:
                return "Key \"" + entry.getKey() + "\" was modified to \"" + str + "\" to match our constraints.";
        }
    }
}
