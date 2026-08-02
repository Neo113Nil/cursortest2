package defpackage;

import android.os.Trace;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class eqs {
    public static final eqs a = new eqs();

    public final void a(@NotNull String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public final void b(@NotNull String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
