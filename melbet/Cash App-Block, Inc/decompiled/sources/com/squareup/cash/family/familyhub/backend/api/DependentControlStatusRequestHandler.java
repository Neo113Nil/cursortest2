package com.squareup.cash.family.familyhub.backend.api;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public interface DependentControlStatusRequestHandler {
    Object getDependentControlStatus(boolean z, ContinuationImpl continuationImpl);

    Object toggleDependentControl(boolean z, ContinuationImpl continuationImpl);
}
