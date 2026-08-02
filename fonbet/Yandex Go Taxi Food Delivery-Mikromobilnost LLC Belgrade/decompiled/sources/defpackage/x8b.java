package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class x8b {
    public final RoomDatabase a;
    public final fc1 b = new fc1(8);

    public x8b(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final y8b a(long j) {
        return (y8b) a.b(this.a, true, false, new cs0(j, 29));
    }

    public final void b(y8b y8bVar) {
        ((Number) a.b(this.a, false, true, new a7b(1, this, y8bVar))).longValue();
    }
}
