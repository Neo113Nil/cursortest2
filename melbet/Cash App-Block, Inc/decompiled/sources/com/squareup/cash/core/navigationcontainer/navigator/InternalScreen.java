package com.squareup.cash.core.navigationcontainer.navigator;

import app.cash.broadway.screen.Screen;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class InternalScreen {
    public final Function0 scopeCreator;
    public CoroutineScope startedScope;

    public InternalScreen(Function0 function0) {
        this.scopeCreator = function0;
    }

    public final CoroutineScope getScope() {
        CoroutineScope coroutineScope = this.startedScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope coroutineScope2 = (CoroutineScope) this.scopeCreator.invoke();
        this.startedScope = coroutineScope2;
        return coroutineScope2;
    }

    public abstract Screen getScreen();

    public abstract String getStateKey();
}
