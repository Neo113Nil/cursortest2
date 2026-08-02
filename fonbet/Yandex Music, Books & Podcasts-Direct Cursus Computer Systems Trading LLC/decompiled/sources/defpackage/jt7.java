package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;

/* loaded from: classes6.dex */
public final /* synthetic */ class jt7 implements ThreadFactory {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "YP:VideoDataDownloader");
            case 1:
                return new Thread(runnable, "Music:Experiments");
            case 2:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("YPST:Heartbeat");
                return newThread;
            case 3:
                return new Thread(runnable, "Music:Downloading");
            case 4:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 5:
                Thread newThread2 = Executors.defaultThreadFactory().newThread(runnable);
                newThread2.setName("YP:OYandexPlayer");
                return newThread2;
            case 6:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(runnable);
                newThread3.setName("YP:YandexPlayer");
                return newThread3;
            default:
                return C1121l6.a("CastLogger", runnable);
        }
    }
}
