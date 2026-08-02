package defpackage;

import android.os.SystemClock;
import java.util.Calendar;

/* loaded from: classes9.dex */
public final class tay0 implements b7z0 {
    public final jtq0 a;

    public tay0(jtq0 jtq0Var) {
        this.a = jtq0Var;
    }

    @Override // defpackage.b7z0
    public final long a() {
        return this.a.d();
    }

    @Override // defpackage.b7z0
    public final Calendar b() {
        return this.a.b(null);
    }

    @Override // defpackage.b7z0
    public final long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
