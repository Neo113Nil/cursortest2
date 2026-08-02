package defpackage;

/* loaded from: classes.dex */
public abstract class i5i {
    public final int a;
    public final int b;

    public i5i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(xjo xjoVar) {
        xjoVar.getClass();
        if (!(xjoVar instanceof qsr)) {
            throw new uej("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((qsr) xjoVar).a);
    }

    public void b(rsr rsrVar) {
        rsrVar.getClass();
        throw new uej("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
