package z0;

import android.database.sqlite.SQLiteStatement;
import y0.InterfaceC5198c;

/* renamed from: z0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5220i extends C5219h implements InterfaceC5198c {

    /* renamed from: u, reason: collision with root package name */
    public final SQLiteStatement f42220u;

    public C5220i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f42220u = sQLiteStatement;
    }

    public final int b() {
        return this.f42220u.executeUpdateDelete();
    }
}
