package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes15.dex */
public final class w5b extends v5b {
    public final RoomDatabase a;

    public w5b(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.v5b
    public final void a(String str) {
        a.b(this.a, false, true, new b5a(str, 8));
    }

    @Override // defpackage.v5b
    public final x5b b(String str) {
        return (x5b) a.b(this.a, true, false, new b5a(str, 9));
    }

    @Override // defpackage.v5b
    public final Long c() {
        return (Long) a.b(this.a, true, false, new rfa(13));
    }

    @Override // defpackage.v5b
    public final long d(String str, boolean z, boolean z2, Long l) {
        return ((Number) a.b(this.a, false, true, new l15(str, z, z2, l))).longValue();
    }
}
