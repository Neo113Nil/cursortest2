package defpackage;

import ru.yandex.music.common.media.queue.ChromeRemoteQueueStartException;
import ru.yandex.music.common.media.queue.GlagolRemoteQueueStartException;
import ru.yandex.music.common.media.queue.RemoteQueueStartException;

/* loaded from: classes6.dex */
public final class g3u {
    public final jyr a = l18.b.b(hag.I(g64.class), true);

    public final xee a() {
        int ordinal = ((h74) ((g64) this.a.getValue()).h.getValue()).ordinal();
        RemoteQueueStartException remoteQueueStartException = null;
        if (ordinal == 0) {
            remoteQueueStartException = new GlagolRemoteQueueStartException(vid.a, "Landing.ClipsBlock: music videos start is prohibited for glagol", null);
        } else if (ordinal == 1) {
            remoteQueueStartException = new ChromeRemoteQueueStartException(null, "Landing.ClipsBlock: music videos start is prohibited for glagol");
        } else if (ordinal != 2 && ordinal != 3) {
            b6e.s();
            return null;
        }
        return remoteQueueStartException == null ? f94.j : new e94(remoteQueueStartException);
    }
}
