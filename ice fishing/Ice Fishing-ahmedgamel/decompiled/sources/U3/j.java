package U3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j implements Executor {

    /* renamed from: n, reason: collision with root package name */
    public static final j f3325n;

    /* renamed from: u, reason: collision with root package name */
    public static final Handler f3326u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ j[] f3327v;

    static {
        j jVar = new j("INSTANCE", 0);
        f3325n = jVar;
        f3327v = new j[]{jVar};
        f3326u = new Handler(Looper.getMainLooper());
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f3327v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f3326u.post(runnable);
    }
}
