package io.appmetrica.analytics.rtm.internal.service;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage;
import io.appmetrica.analytics.coreutils.internal.services.frequency.InMemoryEventFrequencyStorage;

/* loaded from: classes9.dex */
public class ReporterEventProcessorComponents {
    private final RtmLibBuilderWrapper a;
    private final Context b;
    private final IHandlerExecutor c;
    private final IBinaryDataHelper d;
    private final InMemoryEventFrequencyStorage e;
    private final TempCacheStorage f;
    private final DefaultValuesProvider g;
    private final RtmAppHostStaticsInitializer h;

    public ReporterEventProcessorComponents(Context context, IHandlerExecutor iHandlerExecutor, IBinaryDataHelper iBinaryDataHelper, TempCacheStorage tempCacheStorage, DefaultValuesProvider defaultValuesProvider) {
        RtmLibBuilderWrapper rtmLibBuilderWrapper = new RtmLibBuilderWrapper();
        this.a = rtmLibBuilderWrapper;
        this.b = context;
        this.d = iBinaryDataHelper;
        this.c = iHandlerExecutor;
        this.g = defaultValuesProvider;
        this.e = new InMemoryEventFrequencyStorage();
        this.f = tempCacheStorage;
        this.h = new RtmAppHostStaticsInitializer(rtmLibBuilderWrapper);
    }

    public IBinaryDataHelper getBinaryDataHelper() {
        return this.d;
    }

    public Context getContext() {
        return this.b;
    }

    public DefaultValuesProvider getDefaultValuesProvider() {
        return this.g;
    }

    public EventFrequencyStorage getErrorsFrequencyStorage() {
        return this.e;
    }

    public IHandlerExecutor getExecutor() {
        return this.c;
    }

    public RtmAppHostStaticsInitializer getRtmAppHostStaticsInitializer() {
        return this.h;
    }

    public RtmLibBuilderWrapper getRtmLibBuilderWrapper() {
        return this.a;
    }

    public TempCacheStorage getTempCacheStorage() {
        return this.f;
    }
}
