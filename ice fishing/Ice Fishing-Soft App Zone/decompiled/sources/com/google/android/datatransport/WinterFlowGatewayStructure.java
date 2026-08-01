package com.google.android.datatransport;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewayStructure extends WinterFlowThreadHelper implements ScheduledFuture {
    public final ScheduledFuture WinterFlowServerProtocol;

    public WinterFlowGatewayStructure(WinterFlowDeserializationRenderer winterFlowDeserializationRenderer) {
        this.WinterFlowServerProtocol = winterFlowDeserializationRenderer.WinterFlowRouterStructure(new WinterFlowJSONDecorator(9, this));
    }

    @Override // com.google.android.datatransport.WinterFlowThreadHelper
    public final void WinterFlowHookDataSource() {
        ScheduledFuture scheduledFuture = this.WinterFlowServerProtocol;
        Object obj = this.WinterFlowVariableVersionControl;
        scheduledFuture.cancel((obj instanceof WinterFlowDeserializationMapper) && ((WinterFlowDeserializationMapper) obj).WinterFlowRouterStructure);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.WinterFlowServerProtocol.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.WinterFlowServerProtocol.getDelay(timeUnit);
    }
}
