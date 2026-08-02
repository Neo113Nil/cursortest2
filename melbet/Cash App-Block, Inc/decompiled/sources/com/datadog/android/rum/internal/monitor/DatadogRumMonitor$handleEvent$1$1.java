package com.datadog.android.rum.internal.monitor;

import com.datadog.android.rum.internal.domain.RumContext;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class DatadogRumMonitor$handleEvent$1$1 extends Lambda implements Function1 {
    public final /* synthetic */ RumContext $currentFeatureContext;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DatadogRumMonitor$handleEvent$1$1(RumContext rumContext, int i) {
        super(1);
        this.$r8$classId = i;
        this.$currentFeatureContext = rumContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        RumContext rumContext = this.$currentFeatureContext;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                map.putAll(rumContext.toMap());
                break;
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                map2.putAll(rumContext.toMap());
                break;
        }
        return Unit.INSTANCE;
    }
}
