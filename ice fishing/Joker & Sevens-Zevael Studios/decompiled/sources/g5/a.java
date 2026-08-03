package g5;

import android.database.Cursor;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Cursor f2515a;

    public a(Cursor cursor) {
        pc.j.e(cursor, "cursor");
        this.f2515a = cursor;
    }

    public final Long a(int i10) {
        Cursor cursor = this.f2515a;
        if (cursor.isNull(i10)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i10));
    }

    public final String b(int i10) {
        Cursor cursor = this.f2515a;
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }

    public final f5.d c() {
        return new f5.d(Boolean.valueOf(this.f2515a.moveToNext()));
    }
}
