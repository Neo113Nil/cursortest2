package defpackage;

import android.app.Activity;
import ru.yandex.music.concert.ConcertActivity;

/* loaded from: classes4.dex */
public final class w26 implements y26 {
    public final rmb a;
    public final t36 b;
    public final boolean c;
    public final bz2 d;
    public final fkn e;

    public w26(m36 m36Var, rmb rmbVar, t36 t36Var, boolean z, bz2 bz2Var) {
        rmbVar.getClass();
        t36Var.getClass();
        this.a = rmbVar;
        this.b = t36Var;
        this.c = z;
        this.d = bz2Var;
        this.e = m36Var.l;
    }

    @Override // defpackage.y26
    public final void a(String str) {
        bz2 bz2Var = this.d;
        rmb.k(this.a, str, null, bz2Var != null ? xp3.w((rw5) bz2Var.c, bz2Var.b) : null, 2);
        t36 t36Var = this.b;
        t36Var.getClass();
        w1g.y(t36Var.a, str, true);
    }

    @Override // defpackage.y26
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.y26
    public final void d(int i, h06 h06Var) {
        h06Var.getClass();
        wjb wjbVar = wjb.ConcertScreen;
        thj n = x97.n(h06Var, i, 0);
        bz2 bz2Var = this.d;
        rmb.j(this.a, wjbVar, n, bz2Var != null ? xp3.w((rw5) bz2Var.c, bz2Var.b) : null, 8);
        String str = h06Var.a;
        t36 t36Var = this.b;
        t36Var.getClass();
        str.getClass();
        Activity activity = t36Var.a;
        int i2 = ConcertActivity.w0;
        activity.startActivity(bkp.j0(activity, str, null));
    }

    @Override // defpackage.y26
    public final void g(boolean z, int i, String str, h06 h06Var) {
        str.getClass();
        h06Var.getClass();
        thj n = x97.n(h06Var, i, 0);
        bz2 bz2Var = this.d;
        weo.H(this.a, n, z, str, bz2Var != null ? xp3.w((rw5) bz2Var.c, bz2Var.b) : null);
    }

    @Override // defpackage.y26
    public final vdr getState() {
        return this.e;
    }
}
