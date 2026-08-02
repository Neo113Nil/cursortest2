package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.io.Serializable;

/* loaded from: classes15.dex */
public final class wh10 extends uh10 {
    public final RoomDatabase a;
    public final fc1 b = new fc1(21);

    public wh10(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static void e(wh10 wh10Var, long j, String[] strArr, long[] jArr) {
        super.d(j, strArr, jArr);
    }

    @Override // defpackage.uh10
    public final int a(long j, String str) {
        return ((Number) a.b(this.a, false, true, new qo6(j, str, 5))).intValue();
    }

    @Override // defpackage.uh10
    public final int b(long j) {
        return ((Number) a.b(this.a, false, true, new vh10(j, 0))).intValue();
    }

    @Override // defpackage.uh10
    public final long c(oh10 oh10Var) {
        return ((Number) a.b(this.a, false, true, new vmz(15, this, oh10Var))).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uh10
    public final void d(long j, String[] strArr, long[] jArr) {
        a.b(this.a, false, true, new sa6((Object) this, j, (Serializable) strArr, (Object) jArr, 2));
    }
}
