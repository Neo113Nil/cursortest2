package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public final class OptionalProvider implements Provider {
    public volatile Provider delegate;
    public OptionalProvider$$ExternalSyntheticLambda0 handler;
    public static final OptionalProvider$$ExternalSyntheticLambda0 NOOP_HANDLER = new OptionalProvider$$ExternalSyntheticLambda0(0);
    public static final ComponentRuntime$$ExternalSyntheticLambda0 EMPTY_PROVIDER = new ComponentRuntime$$ExternalSyntheticLambda0(1);

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        return this.delegate.get();
    }
}
