package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class ro6 {
    public final RoomDatabase a;

    public ro6(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final long a(String str) {
        return ((Number) a.b(this.a, true, false, new h0(str, 22))).longValue();
    }

    public final void b(long j, String str) {
        ((Number) a.b(this.a, false, true, new qo6(str, j, 0))).longValue();
    }
}
