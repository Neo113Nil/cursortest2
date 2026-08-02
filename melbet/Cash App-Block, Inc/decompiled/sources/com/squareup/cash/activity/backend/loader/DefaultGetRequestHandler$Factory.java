package com.squareup.cash.activity.backend.loader;

import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;

/* loaded from: classes.dex */
public interface DefaultGetRequestHandler$Factory {

    public final class Impl implements DefaultGetRequestHandler$Factory {
        public final LoadTimeClock.MetroFactory delegateFactory;

        public Impl(LoadTimeClock.MetroFactory metroFactory) {
            this.delegateFactory = metroFactory;
        }

        @Override // com.squareup.cash.activity.backend.loader.DefaultGetRequestHandler$Factory
        public final KeysetHandle create() {
            LoadTimeClock.MetroFactory metroFactory = this.delegateFactory;
            ActivityClientService activityClientService = (ActivityClientService) metroFactory.clock.invoke();
            ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) metroFactory.observabilityManager.invoke();
            activityClientService.getClass();
            ziplineActivityItemFormatter.getClass();
            return new KeysetHandle(14, activityClientService, ziplineActivityItemFormatter);
        }
    }

    KeysetHandle create();
}
