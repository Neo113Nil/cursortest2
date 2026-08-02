package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class ueb {
    public final RoomDatabase a;
    public final fc1 b = new fc1(11);

    public ueb(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final udb a(long j) {
        return (udb) a.b(this.a, true, false, new hcb(j, 24));
    }
}
