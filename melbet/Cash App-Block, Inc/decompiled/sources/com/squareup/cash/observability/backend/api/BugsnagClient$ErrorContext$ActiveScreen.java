package com.squareup.cash.observability.backend.api;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BugsnagClient$ErrorContext$ActiveScreen {
    public final Screen screen;

    public BugsnagClient$ErrorContext$ActiveScreen(Screen screen) {
        screen.getClass();
        this.screen = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BugsnagClient$ErrorContext$ActiveScreen) && Intrinsics.areEqual(this.screen, ((BugsnagClient$ErrorContext$ActiveScreen) obj).screen);
    }

    public final int hashCode() {
        return this.screen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.screen, "ActiveScreen(screen=", ")");
    }
}
