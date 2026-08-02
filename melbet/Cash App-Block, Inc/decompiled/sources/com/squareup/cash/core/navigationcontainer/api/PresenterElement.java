package com.squareup.cash.core.navigationcontainer.api;

import androidx.lifecycle.Lifecycle;
import app.cash.broadway.presenter.Placement;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.SwipeContext;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1$start$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* loaded from: classes.dex */
public final class PresenterElement implements CoroutineContext.Element {
    public static final Path.Companion Key = new Path.Companion();
    public Presenter.Binding binding;
    public boolean isObscured;
    public final Presenter presenter;
    public State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State Active;
        public static final State Destroyed;
        public static final State TransitioningOut;
        public static final State TransitioningOutStaged;

        static {
            State state = new State("Active", 0);
            Active = state;
            State state2 = new State("TransitioningOutStaged", 1);
            TransitioningOutStaged = state2;
            State state3 = new State("TransitioningOut", 2);
            TransitioningOut = state3;
            State state4 = new State("Destroyed", 3);
            Destroyed = state4;
            $VALUES = new State[]{state, state2, state3, state4};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public PresenterElement(Presenter presenter) {
        presenter.getClass();
        this.presenter = presenter;
        this.state = State.Active;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return Key;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public final void sendEvent(Object obj) {
        obj.getClass();
        Presenter.Binding binding = this.binding;
        if (binding != null) {
            binding.sendEvent(obj);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    public final void sendSwipeIn(SwipeContext swipeContext) {
        Function1 function1;
        Presenter.Binding binding = this.binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        Presenter.SwipeBinding swipeBinding = binding instanceof Presenter.SwipeBinding ? (Presenter.SwipeBinding) binding : null;
        if (swipeBinding == null || (function1 = ((MoleculePresenterKt$asPresenter$1$start$2) swipeBinding).$swipeCallbackDispatcher.handle) == null) {
            return;
        }
        function1.invoke(swipeContext);
    }

    public final void setPlacement(Placement placement) {
        Presenter.Binding binding = this.binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        Presenter.PlaceableBinding placeableBinding = binding instanceof Presenter.PlaceableBinding ? (Presenter.PlaceableBinding) binding : null;
        if (placeableBinding != null) {
            ((MoleculePresenterKt$asPresenter$1$start$2) placeableBinding).$placementFlow.updateState(null, placement);
        }
    }

    public final void setState(State state) {
        if (this.state != state) {
            this.state = state;
            updateLifecycleState();
        }
    }

    public final void updateLifecycleState() {
        Lifecycle.State state;
        int ordinal = this.state.ordinal();
        if (ordinal == 0) {
            state = this.isObscured ? Lifecycle.State.STARTED : Lifecycle.State.RESUMED;
        } else if (ordinal == 1 || ordinal == 2) {
            state = Lifecycle.State.STARTED;
        } else {
            if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            state = Lifecycle.State.DESTROYED;
        }
        Presenter.Binding binding = this.binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        Presenter.LifecycleBinding lifecycleBinding = binding instanceof Presenter.LifecycleBinding ? (Presenter.LifecycleBinding) binding : null;
        if (lifecycleBinding != null) {
            ((MoleculePresenterKt$asPresenter$1$start$2) lifecycleBinding).$presenterLifecycleOwner.lifecycleRegistry.setCurrentState(state);
        }
    }
}
