package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class xw10 {
    public final RoomDatabase a;
    public final fc1 b = new fc1(22);

    public xw10(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final int a(long j, long j2) {
        return ((Number) a.b(this.a, false, true, new j2b(6, j, j2))).intValue();
    }

    public final yw10 b(long j, long j2, String str, long j3) {
        return (yw10) a.b(this.a, true, false, new why(j, j2, str, j3));
    }
}
