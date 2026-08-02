package defpackage;

import androidx.room.RoomDatabase;
import androidx.room.util.a;
import java.util.List;

/* loaded from: classes.dex */
public final class ywi {
    public final RoomDatabase a;
    public final fc1 b = new fc1(13);

    public ywi(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public final List a(String str) {
        return (List) a.b(this.a, true, false, new brd(str, 2));
    }
}
