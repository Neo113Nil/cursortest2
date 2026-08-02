package com.yandex.music.shared.ynison.api.queue;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.nyn;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/yandex/music/shared/ynison/api/queue/YnisonOptionCommand$RepeatToggle", "", "Lnyn;", "mode", "Lnyn;", "a", "()Lnyn;", "shared-ynison-queue"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class YnisonOptionCommand$RepeatToggle implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    private final nyn mode;

    public YnisonOptionCommand$RepeatToggle(nyn nynVar) {
        nynVar.getClass();
        this.mode = nynVar;
    }

    /* renamed from: a, reason: from getter */
    public final nyn getMode() {
        return this.mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof YnisonOptionCommand$RepeatToggle) && this.mode == ((YnisonOptionCommand$RepeatToggle) obj).mode;
    }

    public final int hashCode() {
        return this.mode.hashCode();
    }

    public final String toString() {
        return "RepeatToggle(mode=" + this.mode + ")";
    }
}
