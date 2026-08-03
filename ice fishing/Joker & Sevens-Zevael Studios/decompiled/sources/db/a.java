package db;

import pc.j;
import t8.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    public final void run(d dVar) {
        j.e(dVar, "databaseProvider");
        dVar.getOs().delete("outcome", "name = \"os__session_duration\" AND session_time = 0", null);
    }
}
