package com.squareup.cash.observability.protovalidation;

import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;

/* loaded from: classes.dex */
public interface HasObservability {
    ErrorReporter getErrorReporter();

    SampleStrategy getOneErrorPerAppSessionStrategy();
}
