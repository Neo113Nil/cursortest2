package kotlin.text;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CatchingFishMVVMMVIGson implements Executor {
    public static final Handler CatchingFishDaggerWebsocket;
    public static final CatchingFishMVVMMVIGson CatchingFishReduxKtor;
    public static final /* synthetic */ CatchingFishMVVMMVIGson[] CatchingFishWorkManager;

    static {
        CatchingFishMVVMMVIGson catchingFishMVVMMVIGson = new CatchingFishMVVMMVIGson("INSTANCE", 0);
        CatchingFishReduxKtor = catchingFishMVVMMVIGson;
        CatchingFishWorkManager = new CatchingFishMVVMMVIGson[]{catchingFishMVVMMVIGson};
        CatchingFishDaggerWebsocket = new Handler(Looper.getMainLooper());
    }

    public static CatchingFishMVVMMVIGson valueOf(String str) {
        return (CatchingFishMVVMMVIGson) Enum.valueOf(CatchingFishMVVMMVIGson.class, str);
    }

    public static CatchingFishMVVMMVIGson[] values() {
        return (CatchingFishMVVMMVIGson[]) CatchingFishWorkManager.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        CatchingFishDaggerWebsocket.post(runnable);
    }
}
