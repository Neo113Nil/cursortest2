package com.yandex.passport.internal.ui.account_upgrade;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.api.q;
import com.yandex.passport.api.t;
import com.yandex.passport.api.v;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.report.we;
import com.yandex.passport.internal.util.p;
import defpackage.b1b;
import defpackage.e7o;
import defpackage.ern;
import defpackage.gld;
import defpackage.hq0;
import defpackage.l8j;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.ph;
import defpackage.qgg;
import defpackage.u0v;
import defpackage.vh;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.zh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AccountUpgraderActivity extends hq0 {
    public static final /* synthetic */ int f = 0;
    public l a;
    public final ybf b = new ybf(ern.a(j.class), new c(this, 0), new w0(4), new c(this, 1));
    public final zh c = registerForActivityResult(new vh(25), new d(this, 1));
    public final zh d = registerForActivityResult(new vh(26), new d(this, 0));
    public final PassportProcessGlobalComponent e = com.yandex.passport.internal.di.a.a();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r7.g(r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r7.g(r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(AccountUpgraderActivity accountUpgraderActivity, v vVar, Continuation continuation) {
        b bVar;
        int i;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = vVar instanceof t;
                    PassportProcessGlobalComponent passportProcessGlobalComponent = accountUpgraderActivity.e;
                    if (z) {
                        com.yandex.passport.internal.upgrader.f accountUpgradeSuccessUseCase = passportProcessGlobalComponent.getAccountUpgradeSuccessUseCase();
                        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L(((t) vVar).a);
                        bVar.j = vVar;
                        bVar.m = 1;
                    } else {
                        com.yandex.passport.internal.upgrader.e accountUpgradeRefuseUseCase = passportProcessGlobalComponent.getAccountUpgradeRefuseUseCase();
                        l lVar = accountUpgraderActivity.a;
                        if (lVar == null) {
                            Intrinsics.j("upgraderExtras");
                            throw null;
                        }
                        com.yandex.passport.common.core.f fVar = lVar.a;
                        bVar.j = vVar;
                        bVar.m = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vVar = bVar.j;
                    qgg.h0(obj);
                }
                com.yandex.passport.internal.ui.a.r(accountUpgraderActivity, com.yandex.plus.core.network.api.utils.a.F(vVar));
                return Unit.a;
            }
        }
        bVar = new b(accountUpgraderActivity, continuation);
        Object obj2 = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i != 0) {
        }
        com.yandex.passport.internal.ui.a.r(accountUpgraderActivity, com.yandex.plus.core.network.api.utils.a.F(vVar));
        return Unit.a;
    }

    public static final void k(AccountUpgraderActivity accountUpgraderActivity, ph phVar) {
        phVar.getClass();
        x97.y(gld.e(l8j.c), null, null, new com.yandex.passport.internal.provider.communication.c(accountUpgraderActivity, q.c(phVar.a.b, phVar.b), (Continuation) null, 7), 3);
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AccountUpgraderActivity accountUpgraderActivity;
        View view;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            e7o.i(getIntent(), "no extras in ");
            return;
        }
        l lVar = (l) com.appsflyer.internal.k.h(extras, p.class, "key-upgrader-extras");
        if (lVar == null) {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", l.class));
            return;
        }
        this.a = lVar;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.e;
        Continuation continuation = null;
        if (((Boolean) passportProcessGlobalComponent.getFlagRepository().b(o.W)).booleanValue()) {
            l lVar2 = this.a;
            if (lVar2 == null) {
                Intrinsics.j("upgraderExtras");
                throw null;
            }
            com.yandex.passport.common.ui.a G = com.yandex.plus.pay.ui.core.b.G(lVar2.b);
            b1b.a(this, com.yandex.plus.pay.ui.core.b.C(G), com.yandex.plus.pay.ui.core.b.C(G));
            accountUpgraderActivity = this;
            ComposeView composeView = new ComposeView(accountUpgraderActivity, null, 0, 6, null);
            composeView.setContent(new wn5(new u0v(25, G, this), 678206641, true));
            view = composeView;
        } else {
            accountUpgraderActivity = this;
            view = new f(this, passportProcessGlobalComponent.getProperties().x).e();
        }
        setContentView(view);
        x97.y(wyf.F(getLifecycle()), null, null, new a(this, continuation, 1), 3);
        if (bundle == null) {
            j jVar = (j) accountUpgraderActivity.b.getValue();
            l lVar3 = accountUpgraderActivity.a;
            if (lVar3 != null) {
                x97.y(ot0.F(jVar), null, null, new we(jVar, lVar3, continuation, 3), 3);
            } else {
                Intrinsics.j("upgraderExtras");
                throw null;
            }
        }
    }
}
