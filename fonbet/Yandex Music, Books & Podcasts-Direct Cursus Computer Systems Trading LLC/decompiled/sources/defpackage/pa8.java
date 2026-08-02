package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes5.dex */
public final class pa8 implements qa8 {
    public final ScheduledFuture a;

    public pa8(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    @Override // defpackage.qa8
    public final void a() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
