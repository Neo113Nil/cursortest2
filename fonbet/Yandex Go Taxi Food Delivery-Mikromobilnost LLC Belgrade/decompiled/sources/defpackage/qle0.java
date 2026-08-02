package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;

/* loaded from: classes.dex */
public final class qle0 {
    public final RoomDatabase a;
    public final ple0 b = new ple0(0);

    public qle0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final Long a(String str) {
        return (Long) a.b(this.a, true, false, new brd(str, 11));
    }

    public final void b(nle0 nle0Var) {
        a.b(this.a, false, true, new kn2(20, this, nle0Var));
    }
}
