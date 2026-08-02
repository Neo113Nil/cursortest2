package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class xgu extends wgu {
    public final RoomDatabase a;
    public final fc1 b = new fc1(19);

    public xgu(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.wgu
    public final void a() {
        a.b(this.a, false, true, new iws(28));
    }

    @Override // defpackage.wgu
    public final List b() {
        return (List) a.b(this.a, true, false, new iws(27));
    }

    @Override // defpackage.wgu
    public final Long d(String str) {
        return (Long) a.b(this.a, true, false, new vsq(str, 8));
    }

    @Override // defpackage.wgu
    public final void e(ArrayList arrayList) {
        a.b(this.a, false, true, new mgu(1, this, arrayList));
    }
}
