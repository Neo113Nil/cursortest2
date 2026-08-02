package com.squareup.cash.core.navigationcontainer.navigator;

import app.cash.broadway.screen.Screen;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FullScreen extends InternalScreen {
    public final Screen initiatorScreen;
    public final boolean isBack;
    public final String previousStateKey;
    public final Object result;
    public final Screen screen;
    public final String stateKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreen(String str, Screen screen, Function0 function0, boolean z, String str2, Object obj, Screen screen2) {
        super(function0);
        str.getClass();
        screen.getClass();
        this.stateKey = str;
        this.screen = screen;
        this.isBack = z;
        this.previousStateKey = str2;
        this.result = obj;
        this.initiatorScreen = screen2;
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.InternalScreen
    public final Screen getScreen() {
        return this.screen;
    }

    @Override // com.squareup.cash.core.navigationcontainer.navigator.InternalScreen
    public final String getStateKey() {
        return this.stateKey;
    }
}
