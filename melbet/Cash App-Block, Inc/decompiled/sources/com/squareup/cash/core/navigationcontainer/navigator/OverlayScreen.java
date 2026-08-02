package com.squareup.cash.core.navigationcontainer.navigator;

import app.cash.broadway.screen.Screen;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class OverlayScreen extends InternalScreen {
    public final Screen screen;
    public final String stateKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayScreen(String str, Screen screen, Function0 function0) {
        super(function0);
        str.getClass();
        screen.getClass();
        this.stateKey = str;
        this.screen = screen;
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
