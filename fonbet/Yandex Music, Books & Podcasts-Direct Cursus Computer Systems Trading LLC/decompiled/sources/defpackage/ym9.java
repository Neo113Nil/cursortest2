package defpackage;

import android.database.SQLException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final /* synthetic */ class ym9 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ ym9() {
    }

    public final void a(dg0 dg0Var) {
        switch (this.a) {
            case 0:
                try {
                    dg0Var.a.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
                    return;
                } catch (SQLException e) {
                    throw new SQLException("Create \"raw_json\" table", e);
                }
            default:
                new uiq(new an9(dg0Var, 0)).A(1, (yhr[]) Arrays.copyOf(new yhr[]{new air()}, 1));
                dn9.l(dg0Var);
                return;
        }
    }

    public /* synthetic */ ym9(dn9 dn9Var) {
    }
}
