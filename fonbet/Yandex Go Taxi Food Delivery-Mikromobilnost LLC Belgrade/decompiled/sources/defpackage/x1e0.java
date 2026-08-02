package defpackage;

import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.ybsdk.rconfig.configs.PollingConfig;

/* loaded from: classes9.dex */
public abstract class x1e0 {
    public static final PolymorphicJsonAdapterFactory a = PolymorphicJsonAdapterFactory.of(PollingConfig.class, "strategy").withSubtype(PollingConfig.Simple.class, "simple").withSubtype(PollingConfig.Backoff.class, "backoff");
}
