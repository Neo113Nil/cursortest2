package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.List;

/* loaded from: classes15.dex */
public final class tr10 extends sr10 {
    public final RoomDatabase a;

    public tr10(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // defpackage.sr10
    public final List a() {
        return (List) a.b(this.a, true, false, new ws00(27));
    }
}
