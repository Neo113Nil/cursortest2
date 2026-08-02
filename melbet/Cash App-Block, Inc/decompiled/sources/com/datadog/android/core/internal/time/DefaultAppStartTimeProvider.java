package com.datadog.android.core.internal.time;

import app.cash.trifle.KeyHandle$keyPair$2;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes4.dex */
public final class DefaultAppStartTimeProvider {
    public static final long PROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS;
    public final Lazy appStartTimeNs$delegate;
    public final KeyHandle$keyPair$2 timeProviderFactory;

    static {
        Duration.Companion companion = Duration.Companion;
        PROCESS_START_TO_CP_START_DIFF_THRESHOLD_NS = Duration.m4168getInWholeNanosecondsimpl(DurationKt.toDuration(10, DurationUnit.SECONDS));
    }

    public DefaultAppStartTimeProvider(KeyHandle$keyPair$2 keyHandle$keyPair$2) {
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = BuildSdkVersionProvider.Companion.DEFAULT;
        this.timeProviderFactory = keyHandle$keyPair$2;
        this.appStartTimeNs$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ViewRegistryKt$buildView$1$2$1$1(10, buildSdkVersionProvider$Companion$DEFAULT$1, this));
    }
}
