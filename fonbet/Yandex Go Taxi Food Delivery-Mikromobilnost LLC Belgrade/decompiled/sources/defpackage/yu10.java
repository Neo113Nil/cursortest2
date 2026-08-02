package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class yu10 extends xu10 {
    public final RoomDatabase a;

    public yu10(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.xu10
    public final Boolean a(long j, String str) {
        return (Boolean) a.b(this.a, true, false, new qo6(str, j, 6));
    }

    @Override // defpackage.xu10
    public final long b(String str, long j, boolean z) {
        return ((Number) a.b(this.a, false, true, new ewr(str, 1, j, z))).longValue();
    }
}
