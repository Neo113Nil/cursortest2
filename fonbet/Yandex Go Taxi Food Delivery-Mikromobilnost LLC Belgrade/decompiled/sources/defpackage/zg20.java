package defpackage;

import androidx.sqlite.driver.a;
import kotlin.NotImplementedError;

/* loaded from: classes.dex */
public abstract class zg20 {
    public final int a;
    public final int b;

    public zg20(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(oll0 oll0Var) {
        if (oll0Var instanceof a) {
            b(((a) oll0Var).a);
        } else {
            qir.p("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
    }

    public void b(hkw0 hkw0Var) {
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
