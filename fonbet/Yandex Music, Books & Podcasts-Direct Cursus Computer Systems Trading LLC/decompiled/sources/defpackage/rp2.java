package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import com.yandex.passport.data.network.core.s;
import com.yandex.passport.internal.account.d;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.core.accounts.f;
import com.yandex.passport.internal.core.accounts.k;
import com.yandex.passport.internal.core.accounts.q;
import com.yandex.passport.internal.di.module.p;
import com.yandex.passport.internal.network.a;
import com.yandex.passport.internal.network.client.h;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.internal.report.reporters.c1;
import com.yandex.passport.internal.report.reporters.f1;
import com.yandex.passport.internal.storage.m;
import com.yandex.passport.internal.ui.common.c;
import com.yandex.passport.internal.usecase.authorize.o;
import com.yandex.passport.internal.usecase.l2;
import com.yandex.passport.internal.usecase.r;
import com.yandex.passport.internal.usecase.u;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class rp2 implements rzm {
    public final /* synthetic */ int a;
    public final Object b;
    public final szm c;
    public final szm d;
    public final szm e;
    public final szm f;
    public final szm g;
    public final szm h;
    public final szm i;
    public final szm j;
    public final szm k;

    public rp2(rzm rzmVar, toe toeVar, toe toeVar2, toe toeVar3, rzm rzmVar2, rzm rzmVar3, toe toeVar4, toe toeVar5, toe toeVar6, toe toeVar7) {
        this.a = 1;
        this.b = rzmVar;
        this.c = toeVar;
        this.d = toeVar2;
        this.e = toeVar3;
        this.f = rzmVar2;
        this.g = rzmVar3;
        this.h = toeVar4;
        this.i = toeVar5;
        this.k = toeVar6;
        this.j = toeVar7;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                pxf pxfVar = (pxf) ((szm) this.b).get();
                String str = (String) this.c.get();
                String str2 = (String) this.d.get();
                g86 g86Var = (g86) this.e.get();
                g0c g0cVar = (g0c) this.f.get();
                b0j b0jVar = (b0j) this.g.get();
                Context context = (Context) this.h.get();
                jdk jdkVar = (jdk) this.i.get();
                boolean booleanValue = ((Boolean) this.j.get()).booleanValue();
                String str3 = (String) this.k.get();
                pxfVar.getClass();
                g86Var.getClass();
                g0cVar.getClass();
                b0jVar.getClass();
                context.getClass();
                jdkVar.getClass();
                str3.getClass();
                return vnj.k(pxfVar, str, g86Var, str2, g0cVar, b0jVar, context, jdkVar, booleanValue, str3);
            case 1:
                ogk ogkVar = (ogk) ((szm) this.b).get();
                gek gekVar = (gek) this.c.get();
                jdk jdkVar2 = (jdk) this.d.get();
                xwj xwjVar = (xwj) this.e.get();
                lnd lndVar = (lnd) this.f.get();
                j03 j03Var = (j03) this.g.get();
                List list = (List) this.h.get();
                ((Boolean) this.i.get()).getClass();
                return new mgk(ogkVar, gekVar, jdkVar2, xwjVar, lndVar, j03Var, list, (Function0) ((toe) this.k).a, (g0c) this.j.get());
            case 2:
                return new d((h) ((rzm) this.b).get(), (f) ((rzm) this.c).get(), (x) ((rzm) this.d).get(), (com.yandex.passport.internal.database.d) ((rzm) this.e).get(), (f1) ((rzm) this.f).get(), (a) ((rzm) this.g).get(), (o) ((rzm) this.h).get(), (u) ((rzm) this.i).get(), (l2) ((rzm) this.j).get(), (r) ((c) this.k).get());
            default:
                p pVar = (p) this.b;
                Context context2 = (Context) ((rzm) this.c).get();
                q qVar = (q) ((rzm) this.d).get();
                o0 o0Var = (o0) ((rzm) this.e).get();
                c1 c1Var = (c1) ((rzm) this.f).get();
                m mVar = (m) ((rzm) this.g).get();
                com.yandex.passport.common.a aVar = (com.yandex.passport.common.a) ((rzm) this.h).get();
                s sVar = (s) ((rzm) this.i).get();
                com.yandex.passport.internal.database.d dVar = (com.yandex.passport.internal.database.d) ((rzm) this.j).get();
                com.yandex.passport.internal.report.reporters.r rVar = (com.yandex.passport.internal.report.reporters.r) ((rzm) this.k).get();
                pVar.getClass();
                context2.getClass();
                qVar.getClass();
                o0Var.getClass();
                c1Var.getClass();
                mVar.getClass();
                aVar.getClass();
                sVar.getClass();
                dVar.getClass();
                rVar.getClass();
                AccountManager accountManager = AccountManager.get(context2);
                accountManager.getClass();
                return new k(accountManager, qVar, context2, o0Var, c1Var, mVar, aVar, sVar, dVar, rVar);
        }
    }

    public /* synthetic */ rp2(Object obj, rzm rzmVar, rzm rzmVar2, rzm rzmVar3, rzm rzmVar4, rzm rzmVar5, rzm rzmVar6, rzm rzmVar7, rzm rzmVar8, rzm rzmVar9, int i) {
        this.a = i;
        this.b = obj;
        this.c = rzmVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
        this.f = rzmVar4;
        this.g = rzmVar5;
        this.h = rzmVar6;
        this.i = rzmVar7;
        this.j = rzmVar8;
        this.k = rzmVar9;
    }

    public rp2(mvn mvnVar, rzm rzmVar, toe toeVar, toe toeVar2, toe toeVar3, toe toeVar4, toe toeVar5, toe toeVar6, toe toeVar7, toe toeVar8, toe toeVar9) {
        this.a = 0;
        this.b = rzmVar;
        this.c = toeVar;
        this.d = toeVar2;
        this.e = toeVar3;
        this.f = toeVar4;
        this.g = toeVar5;
        this.h = toeVar6;
        this.i = toeVar7;
        this.j = toeVar8;
        this.k = toeVar9;
    }
}
