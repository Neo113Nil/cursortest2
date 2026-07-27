package kotlin.text;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class CatchingFishRoomToastView implements ThreadFactory {
    public static final ThreadFactory CatchingFishDaggerWebsocket = Executors.defaultThreadFactory();
    public final int CatchingFishCoroutine;
    public final AtomicLong CatchingFishParcelableFAB = new AtomicLong();
    public final StrictMode.ThreadPolicy CatchingFishReduxKtor;
    public final String CatchingFishSnackbar;

    public CatchingFishRoomToastView(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.CatchingFishSnackbar = str;
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = CatchingFishDaggerWebsocket.newThread(new CatchingFishEspressoFlux(7, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.CatchingFishSnackbar + " Thread #" + this.CatchingFishParcelableFAB.getAndIncrement());
        return newThread;
    }
}
