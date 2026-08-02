package ru.yandex.music.common.media.context;

import ru.yandex.music.common.media.context.PlaybackScope;

/* loaded from: classes5.dex */
public final class h extends PlaybackScope {
    private static final long serialVersionUID = 1;

    public h(Page page) {
        super(page, PlaybackScope.Type.SIMPLE_PAGE);
    }

    public h(Page page, LaunchActionInfo launchActionInfo) {
        super(page, PlaybackScope.Type.SIMPLE_PAGE, launchActionInfo);
    }
}
