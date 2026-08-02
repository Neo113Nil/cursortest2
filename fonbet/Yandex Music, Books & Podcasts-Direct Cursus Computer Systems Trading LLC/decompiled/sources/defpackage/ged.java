package defpackage;

import ru.yandex.music.common.media.queue.RemoteQueueStartException;

/* loaded from: classes5.dex */
public final class ged extends hed {
    public final RemoteQueueStartException a;

    public ged(RemoteQueueStartException remoteQueueStartException) {
        this.a = remoteQueueStartException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ged) && this.a.equals(((ged) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QueueStartError(error=" + this.a + ")";
    }
}
