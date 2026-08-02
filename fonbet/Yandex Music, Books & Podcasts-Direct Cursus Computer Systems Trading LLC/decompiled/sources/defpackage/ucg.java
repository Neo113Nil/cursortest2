package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ucg {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public ucg(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            xq0.x("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            xq0.x("WorkerParameters is null");
            throw null;
        }
        this.a = context;
        this.b = workerParameters;
    }

    public abstract ys3 a();

    public abstract ys3 b();
}
