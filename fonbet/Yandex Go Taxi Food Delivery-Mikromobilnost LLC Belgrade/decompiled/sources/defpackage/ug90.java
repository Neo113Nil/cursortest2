package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class ug90 extends tg90 {
    public final RoomDatabase a;
    public final fc1 b = new fc1(25);

    public ug90(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.tg90
    public final Long a(long j) {
        return (Long) a.b(this.a, true, false, new vh10(j, 16));
    }

    @Override // defpackage.tg90
    public final long b(vg90 vg90Var) {
        return ((Number) a.b(this.a, false, true, new zl50(27, this, vg90Var))).longValue();
    }
}
