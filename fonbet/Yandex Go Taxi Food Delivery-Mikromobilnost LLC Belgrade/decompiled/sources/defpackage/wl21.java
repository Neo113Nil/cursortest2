package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class wl21 extends vl21 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(13);

    public wl21(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.vl21
    public final int a(String str) {
        return ((Number) a.b(this.a, false, true, new il01(str, 12))).intValue();
    }

    @Override // defpackage.vl21
    public final List b(long j, String str) {
        return (List) a.b(this.a, true, false, new qo6(str, j, 25));
    }

    @Override // defpackage.vl21
    public final List c(String str) {
        return (List) a.b(this.a, true, false, new il01(str, 10));
    }

    @Override // defpackage.vl21
    public final List d(String str) {
        return (List) a.b(this.a, true, false, new il01(str, 11));
    }

    @Override // defpackage.vl21
    public final void e(ArrayList arrayList) {
        a.b(this.a, false, true, new dl01(23, this, arrayList));
    }
}
