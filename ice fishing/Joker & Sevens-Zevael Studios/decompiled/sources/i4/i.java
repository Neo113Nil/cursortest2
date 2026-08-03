package i4;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends h implements h4.e {

    /* renamed from: h, reason: collision with root package name */
    public final SQLiteStatement f3194h;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3194h = sQLiteStatement;
    }

    public final int a() {
        return this.f3194h.executeUpdateDelete();
    }
}
