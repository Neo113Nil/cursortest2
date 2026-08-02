package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class phm {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public phm(boolean z, boolean z2, boolean z3, a9p a9pVar, boolean z4) {
        qs5 qs5Var = bi0.a;
        int i = !z ? 262152 : SQLiteDatabase.OPEN_PRIVATECACHE;
        i = a9pVar == a9p.b ? i | RemoteCameraConfig.Notification.ID : i;
        i = z4 ? i : i | RemoteCameraConfig.Mic.BUFFER_SIZE;
        boolean z5 = a9pVar == a9p.a;
        this.a = i;
        this.b = z5;
        this.c = z2;
        this.d = z3;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phm)) {
            return false;
        }
        phm phmVar = (phm) obj;
        return this.a == phmVar.a && this.b == phmVar.b && this.c == phmVar.c && this.d == phmVar.d && this.e == phmVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + k5r.e(k5r.e(k5r.e(k5r.e(this.a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public phm(int i, boolean z) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0, (i & 4) != 0, a9p.a, true);
    }
}
