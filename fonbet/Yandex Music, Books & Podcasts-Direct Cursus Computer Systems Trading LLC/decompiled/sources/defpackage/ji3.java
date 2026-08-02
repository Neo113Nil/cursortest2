package defpackage;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;

/* loaded from: classes4.dex */
public final class ji3 implements ki3 {
    public final PlaybackCommand$QueueBound a;

    public ji3(PlaybackCommand$QueueBound playbackCommand$QueueBound) {
        this.a = playbackCommand$QueueBound;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji3) && this.a.equals(((ji3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Single(command=" + this.a + ")";
    }
}
