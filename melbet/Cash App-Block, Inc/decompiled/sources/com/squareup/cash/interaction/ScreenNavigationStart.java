package com.squareup.cash.interaction;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScreenNavigationStart implements InteractionEvent {
    public final Screen screen;

    public ScreenNavigationStart(Screen screen) {
        screen.getClass();
        this.screen = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreenNavigationStart) && Intrinsics.areEqual(this.screen, ((ScreenNavigationStart) obj).screen);
    }

    @Override // com.squareup.cash.interaction.InteractionEvent
    public final Screen getScreen() {
        return this.screen;
    }

    public final int hashCode() {
        return this.screen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.screen, "ScreenNavigationStart(screen=", ")");
    }
}
