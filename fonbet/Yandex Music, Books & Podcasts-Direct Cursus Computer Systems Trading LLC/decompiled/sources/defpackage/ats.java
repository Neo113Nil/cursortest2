package defpackage;

import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.player.download2.TrackContentSourceException;

/* loaded from: classes4.dex */
public final class ats extends InternalDownloadException implements TrackContentSourceException {
    public final IllegalStateException a;

    public ats(IllegalStateException illegalStateException) {
        super(null);
        this.a = illegalStateException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
