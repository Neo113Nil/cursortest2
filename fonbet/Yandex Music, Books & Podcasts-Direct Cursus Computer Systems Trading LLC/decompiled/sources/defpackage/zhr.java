package defpackage;

import android.database.sqlite.SQLiteStatement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class zhr implements yhr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ zhr(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // defpackage.yhr
    public final void a(zp4 zp4Var) {
        switch (this.a) {
            case 0:
                SQLiteStatement compileStatement = ((dg0) zp4Var.b).a.compileStatement("DELETE FROM raw_json WHERE raw_json_id IN ".concat(CollectionsKt.X((LinkedHashSet) this.b, "', '", "('", "')", null, 56)));
                ((ArrayList) zp4Var.c).add(compileStatement);
                compileStatement.executeUpdateDelete();
                return;
            default:
                tjn tjnVar = new tjn(xuj.E, new yp4(zp4Var, "SELECT * FROM raw_json", new String[0]));
                try {
                    ((lj0) this.b).invoke(tjnVar);
                    tjnVar.close();
                    return;
                } finally {
                }
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "Deleting raw jsons with ids: " + ((LinkedHashSet) this.b);
            default:
                return "Selecting all raw jsons";
        }
    }
}
