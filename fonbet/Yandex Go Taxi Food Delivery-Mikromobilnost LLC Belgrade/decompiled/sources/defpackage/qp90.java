package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.messaging.auth.passport.b;
import com.yandex.passport.api.o3;

/* loaded from: classes8.dex */
public final class qp90 {
    public final Context a;
    public final b b;
    public final x22 c;

    public qp90(Context context, b bVar, x22 x22Var) {
        this.a = context;
        this.b = bVar;
        this.c = x22Var;
    }

    public final Intent a(wl3 wl3Var) {
        b bVar = this.b;
        if (bVar == null) {
            b("createUpgradeIntent");
            return null;
        }
        if (!(bVar instanceof b)) {
            return null;
        }
        return bVar.b.q().a().a(bVar.a, new o3(jjo.f(wl3Var)));
    }

    public final void b(String str) {
        ika1.d(this.c, "PassportWrapper_".concat(str));
    }
}
