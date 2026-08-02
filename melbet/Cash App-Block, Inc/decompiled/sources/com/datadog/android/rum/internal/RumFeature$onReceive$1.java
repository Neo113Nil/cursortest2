package com.datadog.android.rum.internal;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RumFeature$onReceive$1 extends Lambda implements Function0 {
    public final /* synthetic */ Object $event;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RumFeature$onReceive$1(Object obj, int i) {
        super(0);
        this.$r8$classId = i;
        this.$event = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.$event;
        switch (i) {
            case 0:
                return String.format(Locale.US, "RUM feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{obj.getClass().getCanonicalName()}, 1));
            case 1:
                return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
            case 2:
                return String.format(Locale.US, "RumEventMapper: there was no EventMapper assigned for RUM event type: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
            case 3:
                return String.format(Locale.US, "RumEventMapper: the returned mapped ViewEvent was null. The original event object will be used instead: %s", Arrays.copyOf(new Object[]{obj}, 1));
            case 4:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{obj}, 1));
            default:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{obj}, 1));
        }
    }
}
