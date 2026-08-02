package defpackage;

import ru.yandex.music.common.media.queue.RemoteQueueStartException;

/* loaded from: classes4.dex */
public final class e94 extends xee {
    public final RemoteQueueStartException j;

    public e94(RemoteQueueStartException remoteQueueStartException) {
        this.j = remoteQueueStartException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e94) && this.j.equals(((e94) obj).j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return "Invalid(error=" + this.j + ")";
    }
}
