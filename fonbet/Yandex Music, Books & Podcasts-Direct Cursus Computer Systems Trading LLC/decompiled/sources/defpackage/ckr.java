package defpackage;

import android.os.StrictMode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ckr {
    public static final ckr a = new ckr();

    @NotNull
    public final StrictMode.VmPolicy.Builder a(@NotNull StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
