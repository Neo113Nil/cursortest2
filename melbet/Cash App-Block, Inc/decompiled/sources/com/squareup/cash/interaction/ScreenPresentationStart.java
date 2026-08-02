package com.squareup.cash.interaction;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.Screen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes.dex */
public final class ScreenPresentationStart implements InteractionEvent {
    public final long initDuration;
    public final Screen screen;
    public final long startDuration;

    public ScreenPresentationStart(Screen screen, long j, long j2) {
        screen.getClass();
        this.screen = screen;
        this.initDuration = j;
        this.startDuration = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenPresentationStart)) {
            return false;
        }
        ScreenPresentationStart screenPresentationStart = (ScreenPresentationStart) obj;
        return Intrinsics.areEqual(this.screen, screenPresentationStart.screen) && Duration.m4166equalsimpl0(this.initDuration, screenPresentationStart.initDuration) && Duration.m4166equalsimpl0(this.startDuration, screenPresentationStart.startDuration);
    }

    @Override // com.squareup.cash.interaction.InteractionEvent
    public final Screen getScreen() {
        return this.screen;
    }

    public final int hashCode() {
        int hashCode = this.screen.hashCode() * 31;
        Duration.Companion companion = Duration.Companion;
        return Long.hashCode(this.startDuration) + Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.initDuration);
    }

    public final String toString() {
        String m4177toStringimpl = Duration.m4177toStringimpl(this.initDuration);
        String m4177toStringimpl2 = Duration.m4177toStringimpl(this.startDuration);
        StringBuilder sb = new StringBuilder("ScreenPresentationStart(screen=");
        sb.append(this.screen);
        sb.append(", initDuration=");
        sb.append(m4177toStringimpl);
        sb.append(", startDuration=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m4177toStringimpl2, ")");
    }
}
