package ru.yandex.video.m3.player.crashmanager;

import android.content.Context;
import android.os.Looper;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/crashmanager/CrashManager;", "", "Landroid/content/Context;", "context", "Ljava/lang/Thread;", "thread", "Lzy11;", "registerCrashManager", "(Landroid/content/Context;Ljava/lang/Thread;)V", "", "getWasAppCrashed", "()Z", "wasAppCrashed", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CrashManager {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void registerCrashManager$default(CrashManager crashManager, Context context, Thread thread, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: registerCrashManager");
            return;
        }
        if ((i & 2) != 0) {
            thread = Looper.getMainLooper().getThread();
        }
        crashManager.registerCrashManager(context, thread);
    }

    boolean getWasAppCrashed();

    void registerCrashManager(Context context, Thread thread);
}
