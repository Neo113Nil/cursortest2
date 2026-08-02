package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class u3f0 extends t3f0 {
    public final RoomDatabase a;
    public final x7b0 b = new x7b0(3);

    public u3f0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.t3f0
    public final void a() {
        a.b(this.a, false, true, new vld0(26));
    }

    @Override // defpackage.t3f0
    public final List b() {
        return (List) a.b(this.a, true, false, new vld0(27));
    }

    @Override // defpackage.t3f0
    public final void c(ArrayList arrayList) {
        a.b(this.a, false, true, new ugd0(7, this, arrayList));
    }
}
