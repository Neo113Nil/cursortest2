package com.squareup.cash.onboarding.check;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public interface IntegrityCheck {
    Object check(ContinuationImpl continuationImpl);

    IntegrityCheckFactory$Type getType();
}
