package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface ns6 {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, ar6 ar6Var, CancellationSignal cancellationSignal, Executor executor, ls6 ls6Var);

    void onGetCredential(Context context, n7d n7dVar, CancellationSignal cancellationSignal, Executor executor, ls6 ls6Var);
}
