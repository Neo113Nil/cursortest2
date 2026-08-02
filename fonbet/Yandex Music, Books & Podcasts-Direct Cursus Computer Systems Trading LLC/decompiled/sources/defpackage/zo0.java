package defpackage;

import android.content.Context;
import com.yandex.passport.common.coroutine.a;
import com.yandex.passport.common.coroutine.g;
import com.yandex.passport.internal.analytics.d0;
import com.yandex.passport.internal.autologin.k;
import com.yandex.passport.internal.autologin.o;
import com.yandex.passport.internal.badges.f;
import com.yandex.passport.internal.badges.h;
import com.yandex.passport.internal.config.b;
import com.yandex.passport.internal.core.accounts.s;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.i;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.ui.common.c;
import com.yandex.passport.internal.usecase.s0;
import com.yandex.passport.internal.usecase.ui.b0;
import com.yandex.passport.internal.usecase.ui.e;
import com.yandex.payment.divkit.api.DivKitApi;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class zo0 implements rzm {
    public final /* synthetic */ int a;
    public final Object b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;
    public final szm g;
    public final szm h;
    public final rzm i;

    public zo0(kjn kjnVar, toe toeVar, toe toeVar2, tp2 tp2Var, toe toeVar3, toe toeVar4, toe toeVar5, toe toeVar6) {
        this.a = 0;
        this.b = kjnVar;
        this.c = toeVar;
        this.d = toeVar2;
        this.e = tp2Var;
        this.f = toeVar3;
        this.i = toeVar4;
        this.g = toeVar5;
        this.h = toeVar6;
    }

    public static DivKitApi a(kjn kjnVar, pyh pyhVar, jdk jdkVar, Context context, pxf pxfVar, atj atjVar, g0c g0cVar, boolean z) {
        pyhVar.getClass();
        jdkVar.getClass();
        context.getClass();
        pxfVar.getClass();
        atjVar.getClass();
        g0cVar.getClass();
        joj jojVar = new joj();
        jojVar.c.add(new yo0(z, context, pyhVar, g0cVar, atjVar, jdkVar));
        y6e y6eVar = new y6e();
        y6eVar.c = 4;
        jojVar.c.add(y6eVar);
        OkHttpClient okHttpClient = new OkHttpClient(jojVar);
        uao uaoVar = new uao();
        int ordinal = pxfVar.a.ordinal();
        String str = "https://tt-renderer.yandex.net/api/";
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                str = "https://tt-renderer-test.yandex-team.ru/api/";
            } else if (ordinal != 3) {
                if (ordinal != 4) {
                    b6e.s();
                    return null;
                }
                str = "http://127.0.0.1:8080/api/";
            }
        }
        uaoVar.b(str);
        uaoVar.b = okHttpClient;
        Object b = uaoVar.c().b(DivKitApi.class);
        b.getClass();
        return (DivKitApi) b;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return a((kjn) this.b, (pyh) this.c.get(), (jdk) this.d.get(), (Context) this.e.get(), (pxf) this.f.get(), (atj) ((toe) this.i).a, (g0c) this.g.get(), ((Boolean) this.h.get()).booleanValue());
            case 1:
                return new k((a) ((rzm) this.b).get(), (m) ((rzm) this.c).get(), (x) ((rzm) this.d).get(), (i) ((rzm) this.e).get(), (s0) ((rzm) this.f).get(), (o) ((rzm) this.g).get(), (e) ((d0) this.h).get(), (b0) ((c) this.i).get());
            default:
                return new o((a) ((rzm) this.b).get(), (com.yandex.passport.internal.core.accounts.e) ((rzm) this.c).get(), (com.yandex.passport.internal.badges.e) ((f) this.d).get(), (h) ((g) this.e).get(), (b) ((rzm) this.f).get(), (com.yandex.passport.common.common.a) ((rzm) this.g).get(), (com.yandex.passport.internal.flags.i) ((rzm) this.h).get(), (s) this.i.get());
        }
    }

    public /* synthetic */ zo0(rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, int i) {
        this.a = i;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
        this.e = rzmVar4;
        this.f = rzmVar5;
        this.g = rzmVar6;
        this.h = rzmVar7;
        this.i = rzmVar8;
    }
}
