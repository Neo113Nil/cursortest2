package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class x6b extends w6b {
    public final RoomDatabase a;
    public final fc1 b = new fc1(7);

    public x6b(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.w6b
    public final List a(long j) {
        return (List) a.b(this.a, true, false, new cs0(j, 23));
    }

    @Override // defpackage.w6b
    public final long[] b(ArrayList arrayList) {
        return (long[]) a.b(this.a, false, true, new cs8(29, this, arrayList));
    }

    @Override // defpackage.w6b
    public final boolean c(long j) {
        return ((Boolean) a.b(this.a, true, false, new cs0(j, 25))).booleanValue();
    }

    @Override // defpackage.w6b
    public final void d(long j) {
        a.b(this.a, false, true, new cs0(j, 24));
    }
}
