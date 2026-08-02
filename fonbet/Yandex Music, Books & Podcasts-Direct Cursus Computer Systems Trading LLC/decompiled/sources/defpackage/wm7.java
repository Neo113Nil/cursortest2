package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class wm7 implements m0e {
    public final /* synthetic */ ym7 a;

    public wm7(ym7 ym7Var) {
        this.a = ym7Var;
    }

    @Override // defpackage.m0e
    public final void b() {
        this.a.e.remove(this);
    }

    @Override // defpackage.m0e
    public final boolean d(Uri uri, j4x j4xVar, boolean z) {
        xm7 xm7Var;
        ym7 ym7Var = this.a;
        HashMap hashMap = ym7Var.d;
        if (ym7Var.l == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h0e h0eVar = ym7Var.j;
            int i = dvt.a;
            List list = h0eVar.e;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                xm7 xm7Var2 = (xm7) hashMap.get(((g0e) list.get(i3)).a);
                if (xm7Var2 != null && elapsedRealtime < xm7Var2.h) {
                    i2++;
                }
            }
            mdr L = ym7Var.c.L(new weg(1, 0, ym7Var.j.e.size(), i2), j4xVar);
            if (L != null && L.a == 2 && (xm7Var = (xm7) hashMap.get(uri)) != null) {
                xm7.a(xm7Var, L.b);
            }
        }
        return false;
    }
}
