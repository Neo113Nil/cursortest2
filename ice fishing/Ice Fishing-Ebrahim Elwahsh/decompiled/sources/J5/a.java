package J5;

import kotlin.jvm.internal.h;
import w4.d;

/* loaded from: classes2.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final void run(d databaseProvider) {
        h.e(databaseProvider, "databaseProvider");
        databaseProvider.getOs().delete("outcome", "name = \"os__session_duration\" AND (session_time = 0 OR session_time IS NULL)", null);
    }
}
