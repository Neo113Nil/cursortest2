package N3;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements f3.c {

    /* renamed from: n, reason: collision with root package name */
    public final String f2011n;

    @Override // f3.c
    public Object c() {
        HandlerThread handlerThread = new HandlerThread(this.f2011n, 10);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }
}
