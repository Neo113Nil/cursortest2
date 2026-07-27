package n;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class b {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
