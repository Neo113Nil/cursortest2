package ru.yandex.video.m3.player.crashmanager;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.sls;
import defpackage.zy11;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/player/crashmanager/CrashManagerImpl;", "Lru/yandex/video/m3/player/crashmanager/CrashManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "resetCrashInfo", "", "wasCrashed", "(Landroid/content/Context;)Z", "crashHappened", "Landroid/content/SharedPreferences;", "getSharedPref", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Ljava/lang/Thread;", "thread", "registerCrashManager", "(Landroid/content/Context;Ljava/lang/Thread;)V", "wasAppCrashed", "Z", "getWasAppCrashed", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CrashManagerImpl implements CrashManager {
    private static final String CRASH_SHARED_PREF_NAME = "YandexPlayerCrashInfo";
    private static final String CRASH_SHARED_PREF_PARAM_NAME = "isCrashed";
    private static volatile CrashManager instance;
    private final AtomicBoolean isRegistered;
    private final boolean wasAppCrashed;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    private CrashManagerImpl(Context context) {
        this.wasAppCrashed = wasCrashed(context);
        this.isRegistered = new AtomicBoolean();
        resetCrashInfo(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void crashHappened(Context context) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        SharedPreferences sharedPref = getSharedPref(context);
        if (sharedPref == null || (edit = sharedPref.edit()) == null || (putBoolean = edit.putBoolean(CRASH_SHARED_PREF_PARAM_NAME, true)) == null) {
            return;
        }
        putBoolean.apply();
    }

    private final SharedPreferences getSharedPref(Context context) {
        return context.getSharedPreferences(CRASH_SHARED_PREF_NAME, 0);
    }

    private final void resetCrashInfo(Context context) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPref = getSharedPref(context);
        if (sharedPref == null || (edit = sharedPref.edit()) == null) {
            return;
        }
        edit.putBoolean(CRASH_SHARED_PREF_PARAM_NAME, false);
        edit.apply();
    }

    private final boolean wasCrashed(Context context) {
        SharedPreferences sharedPref = getSharedPref(context);
        if (sharedPref != null) {
            return sharedPref.getBoolean(CRASH_SHARED_PREF_PARAM_NAME, false);
        }
        return false;
    }

    @Override // ru.yandex.video.m3.player.crashmanager.CrashManager
    public boolean getWasAppCrashed() {
        return this.wasAppCrashed;
    }

    @Override // ru.yandex.video.m3.player.crashmanager.CrashManager
    public void registerCrashManager(Context context, Thread thread) {
        if (this.isRegistered.compareAndSet(false, true)) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = thread.getUncaughtExceptionHandler();
            final Context applicationContext = context.getApplicationContext();
            thread.setUncaughtExceptionHandler(new CrashHandler(uncaughtExceptionHandler, new sls() { // from class: ru.yandex.video.m3.player.crashmanager.CrashManagerImpl$registerCrashManager$crashHandler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m762invoke() {
                    CrashManagerImpl.this.crashHappened(applicationContext);
                }

                @Override // defpackage.sls
                public /* bridge */ /* synthetic */ Object invoke() {
                    m762invoke();
                    return zy11.a;
                }
            }));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/crashmanager/CrashManagerImpl$Companion;", "", "()V", "CRASH_SHARED_PREF_NAME", "", "CRASH_SHARED_PREF_PARAM_NAME", "instance", "Lru/yandex/video/m3/player/crashmanager/CrashManager;", "getInstance", "context", "Landroid/content/Context;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CrashManager getInstance(Context context) {
            CrashManager crashManager;
            CrashManager crashManager2 = CrashManagerImpl.instance;
            if (crashManager2 != null) {
                return crashManager2;
            }
            synchronized (this) {
                crashManager = CrashManagerImpl.instance;
                if (crashManager == null) {
                    crashManager = new CrashManagerImpl(context, null);
                    CrashManagerImpl.instance = crashManager;
                }
            }
            return crashManager;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrashManagerImpl(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
