package androidx.media3.session;

import defpackage.dvt;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {
    public final /* synthetic */ MediaNotificationManager a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dvt.c0(this.a.d, runnable);
    }
}
