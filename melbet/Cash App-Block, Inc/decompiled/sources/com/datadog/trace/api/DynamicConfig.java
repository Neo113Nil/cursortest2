package com.datadog.trace.api;

import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.datadog.android.trace.internal.compat.function.Function;
import com.datadog.trace.core.CoreTracer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class DynamicConfig {
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 LOWER_KEY = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(23);
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 REQUEST_TAG = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(24);
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 RESPONSE_TAG = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(25);
    public volatile CoreTracer.ConfigSnapshot currentSnapshot;
    public ExoPlayerImplInternal$$ExternalSyntheticLambda2 snapshotFactory;

    public final class Builder {
        public HashMap baggageMapping;
        public boolean dataStreamsEnabled;
        public boolean logsInjectionEnabled;
        public HashMap requestHeaderTags;
        public Map responseHeaderTags;
        public boolean runtimeMetricsEnabled;
        public HashMap serviceMapping;
        public List spanSamplingRules;
        public Double traceSampleRate;
        public List traceSamplingRules;

        public Builder() {
        }
    }

    public static HashMap cleanMapping(Set set, Function function) {
        HashMap hashMap = new HashMap((set.size() * 4) / 3);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap.put((String) LOWER_KEY.apply(entry), (String) function.apply(entry));
        }
        return new HashMap(hashMap);
    }

    public final String toString() {
        return this.currentSnapshot.toString();
    }
}
