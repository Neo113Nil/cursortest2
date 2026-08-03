package m7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: g, reason: collision with root package name */
    public static final l f4967g;

    /* renamed from: h, reason: collision with root package name */
    public static final Handler f4968h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l[] f4969i;

    static {
        l lVar = new l("INSTANCE", 0);
        f4967g = lVar;
        f4969i = new l[]{lVar};
        f4968h = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f4969i.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f4968h.post(runnable);
    }
}
