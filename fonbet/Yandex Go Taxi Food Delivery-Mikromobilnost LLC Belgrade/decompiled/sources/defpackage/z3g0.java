package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ru.yandex.taxi.settings.navigation.PushSettingsNotificationRouter$resume$$inlined$collectIn$1;
import ru.yandex.taxi.settings.presentation.notification.PushSettingsNotification;

/* loaded from: classes6.dex */
public final class z3g0 {
    public final tse a;
    public final tj60 b;
    public final g3g0 c;
    public final v2g0 d;
    public final j2g0 e;
    public final jae0 f;
    public final x500 g;
    public final x1g0 h;
    public final ArrayList i = new ArrayList();
    public pzt0 j;

    public z3g0(tse tseVar, tj60 tj60Var, g3g0 g3g0Var, v2g0 v2g0Var, j2g0 j2g0Var, jae0 jae0Var, x500 x500Var, x1g0 x1g0Var) {
        this.a = tseVar;
        this.b = tj60Var;
        this.c = g3g0Var;
        this.d = v2g0Var;
        this.e = j2g0Var;
        this.f = jae0Var;
        this.g = x500Var;
        this.h = x1g0Var;
    }

    public final void a() {
        ArrayList arrayList = this.i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.b.c((String) it.next());
        }
        arrayList.clear();
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    public final void b() {
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.j = tje.N(this.a, null, null, new PushSettingsNotificationRouter$resume$$inlined$collectIn$1(this.f.a.a(), null, this), 3);
    }

    public final void c(w2g0 w2g0Var) {
        v2g0 v2g0Var = this.d;
        v7j v7jVar = v2g0Var.a;
        boolean z = w2g0Var instanceof f4g0;
        if (z && v7jVar.a.f("push_settings_popup_is_interacted_with")) {
            return;
        }
        if (z ? v2g0Var.b.a().b : true) {
            iae0 iae0Var = (iae0) v2g0Var.c.a.b();
            if (iae0Var.c(w2g0Var.getC()) && iae0Var.c(w2g0Var.getD()) && w2g0Var.getB().a) {
                String c = w2g0Var.c();
                p8s0 b = w2g0Var.getB();
                if (b.b != 0 && v7jVar.a.i(c.concat("_show_count"), 0) >= b.b) {
                    return;
                }
                if (v7jVar.a.j(w2g0Var.c().concat("_last_shown_timestamp"), 0L) + TimeUnit.DAYS.toMillis(w2g0Var.getB().c) < System.currentTimeMillis()) {
                    b6g b6gVar = ((b6g) this.c.b.getValue()).b;
                    x500 x500Var = this.g;
                    x500Var.getClass();
                    a6g a6gVar = b6gVar.i;
                    iw8 iw8Var = b6gVar.a;
                    a6g a6gVar2 = b6gVar.k;
                    a6g a6gVar3 = b6gVar.p;
                    Object obj = n3w.a(w2g0Var).a;
                    n3w a = n3w.a(x500Var);
                    a6g a6gVar4 = b6gVar.n;
                    n4g0 n4g0Var = b6gVar.o;
                    a6g a6gVar5 = b6gVar.p;
                    a6g a6gVar6 = b6gVar.j;
                    a6g a6gVar7 = b6gVar.q;
                    Context context = (Context) iw8Var.f;
                    q5z.h(context);
                    pav pavVar = (pav) iw8Var.h;
                    q5z.h(pavVar);
                    PushSettingsNotification pushSettingsNotification = new PushSettingsNotification(context, pavVar, new y3g0(new v2g0(new v7j((dne0) a6gVar.get(), 2), (q3g0) a6gVar2.get(), (jae0) a6gVar3.get()), (o4g0) n4g0Var.get(), (w2g0) obj, (x500) a.a, (jae0) a6gVar5.get(), (k7x0) a6gVar6.get(), (tj60) a6gVar7.get(), new y4a0(new u8w((pho) a6gVar4.get()), (w2g0) obj, false, 27)));
                    this.b.e(pushSettingsNotification);
                    this.i.add(pushSettingsNotification.getUid());
                }
            }
        }
    }
}
