package defpackage;

import android.content.Context;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class uh {
    public abstract Intent createIntent(Context context, Object obj);

    public th getSynchronousResult(@NotNull Context context, Object obj) {
        context.getClass();
        return null;
    }

    public abstract Object parseResult(int i, Intent intent);
}
