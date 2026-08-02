package com.squareup.analytics.cdp;

import app.cash.cdp.api.EventConsumer;
import app.cash.cdp.backend.jvm.RealEventConsumer;
import app.cash.cdp.backend.jvm.RealEventConsumer$track$1;
import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.JobKt;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CdpAnalytics implements Analytics {
    public final CdpModule$Companion$$ExternalSyntheticLambda0 customerTokenProvider;
    public final Lazy eventConsumer$delegate = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 27));
    public final RealPasscodeFlowStarter.MetroFactory eventConsumerProvider;
    public volatile String latchedCustomerToken;

    public CdpAnalytics(RealPasscodeFlowStarter.MetroFactory metroFactory, CdpModule$Companion$$ExternalSyntheticLambda0 cdpModule$Companion$$ExternalSyntheticLambda0) {
        this.eventConsumerProvider = metroFactory;
        this.customerTokenProvider = cdpModule$Companion$$ExternalSyntheticLambda0;
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        event.getClass();
        EventConsumer eventConsumer = (EventConsumer) this.eventConsumer$delegate.getValue();
        String str = this.latchedCustomerToken;
        if (str == null) {
            str = PlatformKt.activeAccountTokenOrNull(this.customerTokenProvider.f$0);
        }
        String str2 = str;
        RealEventConsumer realEventConsumer = (RealEventConsumer) eventConsumer;
        realEventConsumer.getClass();
        JobKt.launch$default(realEventConsumer.scope, realEventConsumer.ioDispatcher, null, new RealEventConsumer$track$1(realEventConsumer, event, str2, l != null ? l.longValue() : System.currentTimeMillis(), null), 2);
        Timber.Forest.d(event.getName() + " " + event.getParameters(), new Object[0]);
    }
}
