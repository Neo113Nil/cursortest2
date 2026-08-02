package com.squareup.cash.payments.presenters;

import dev.zacsweers.metro.internal.Factory;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class PersonalizationDraftStore {
    public final StateFlowImpl _draft;
    public final ReadonlyStateFlow draft;

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new PersonalizationDraftStore();
        }
    }

    public PersonalizationDraftStore() {
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
        this._draft = MutableStateFlow;
        this.draft = FlowKt.asStateFlow(MutableStateFlow);
    }
}
