package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sft implements Executor {
    public static final sft a;
    public static final Handler b;
    public static final /* synthetic */ sft[] c;

    static {
        sft sftVar = new sft("INSTANCE", 0);
        a = sftVar;
        c = new sft[]{sftVar};
        b = new Handler(Looper.getMainLooper());
    }

    public static sft valueOf(String str) {
        return (sft) Enum.valueOf(sft.class, str);
    }

    public static sft[] values() {
        return (sft[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
