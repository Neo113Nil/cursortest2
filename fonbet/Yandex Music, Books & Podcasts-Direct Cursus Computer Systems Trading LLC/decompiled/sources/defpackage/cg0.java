package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class cg0 extends SQLiteOpenHelper {
    public final /* synthetic */ nsh a;
    public final /* synthetic */ cn9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0(Context context, String str, bn9 bn9Var, nsh nshVar, cn9 cn9Var) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
        this.a = nshVar;
        this.b = cn9Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        dn9.l(this.a.W(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        dg0 W = this.a.W(sQLiteDatabase);
        dn9 dn9Var = this.b.a;
        ym9 ym9Var = (ym9) dn9Var.f;
        ghh.l(null, Long.valueOf(i2), Long.valueOf(3));
        if (i == 3) {
            return;
        }
        ym9 ym9Var2 = (ym9) ((Map) dn9Var.e).get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        if (ym9Var2 == null) {
            ym9Var2 = ym9Var;
        }
        try {
            ym9Var2.a(W);
        } catch (SQLException unused) {
            ym9Var.a(W);
        }
    }
}
