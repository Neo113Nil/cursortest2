package z0;

import android.database.sqlite.SQLiteStatement;

/* renamed from: z0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5253i extends C5252h implements y0.c {

    /* renamed from: u, reason: collision with root package name */
    public final SQLiteStatement f42246u;

    public C5253i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f42246u = sQLiteStatement;
    }

    public final int b() {
        return this.f42246u.executeUpdateDelete();
    }
}
