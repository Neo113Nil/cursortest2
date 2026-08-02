package defpackage;

import android.content.Context;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l8g {
    public static final l8g a = new l8g();

    public final void a(@NotNull Context context, @NotNull Intent intent) {
        context.startForegroundService(intent);
    }
}
