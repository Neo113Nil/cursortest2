package com.squareup.cash.interaction;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ScreenNavigationEnd implements InteractionEvent {
    public final Screen screen;

    public ScreenNavigationEnd(Screen screen) {
        screen.getClass();
        this.screen = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ScreenNavigationEnd) && Intrinsics.areEqual(this.screen, ((ScreenNavigationEnd) obj).screen);
    }

    @Override // com.squareup.cash.interaction.InteractionEvent
    public final Screen getScreen() {
        return this.screen;
    }

    public final int hashCode() {
        return this.screen.hashCode();
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(this.screen, "ScreenNavigationEnd(screen=", ")");
    }
}
