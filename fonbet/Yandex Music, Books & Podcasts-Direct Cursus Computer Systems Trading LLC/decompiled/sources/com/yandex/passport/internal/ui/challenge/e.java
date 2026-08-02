package com.yandex.passport.internal.ui.challenge;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.q2;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.v;
import defpackage.b1b;
import defpackage.b6;
import defpackage.b6e;
import defpackage.bsh;
import defpackage.btf;
import defpackage.cg6;
import defpackage.dsa;
import defpackage.gld;
import defpackage.hq0;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r1w;
import defpackage.rvr;
import defpackage.tf6;
import defpackage.ub7;
import defpackage.wyf;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.zsd;
import defpackage.zyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class e extends hq0 {
    public static final /* synthetic */ int d = 0;
    public final PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
    public final jyr b;
    public f c;

    public e() {
        final int i = 0;
        btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.j
            public final /* synthetic */ com.yandex.passport.internal.ui.challenge.e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        com.yandex.passport.internal.ui.challenge.e eVar = this.b;
                        return new com.yandex.passport.internal.ui.common.b(eVar, new v(new j2(), q2.a, n2.a, true), eVar.a.getProperties());
                    default:
                        return this.b.m().getUi();
                }
            }
        });
        final int i2 = 1;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.j
            public final /* synthetic */ com.yandex.passport.internal.ui.challenge.e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        com.yandex.passport.internal.ui.challenge.e eVar = this.b;
                        return new com.yandex.passport.internal.ui.common.b(eVar, new v(new j2(), q2.a, n2.a, true), eVar.a.getProperties());
                    default:
                        return this.b.m().getUi();
                }
            }
        });
    }

    public static final void j(e eVar, Object obj) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "activity finishWithResult " + obj, 8);
        }
        int u = eVar.u(obj);
        Intent intent = new Intent();
        Bundle v = eVar.v(obj);
        if (v != null) {
            intent.putExtras(v);
        }
        eVar.setResult(u, intent);
        eVar.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object r(e eVar, b6 b6Var, cg6 cg6Var) {
        a aVar;
        int i;
        x0q x0qVar;
        e eVar2;
        b6 b6Var2;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.n = i2 - Integer.MIN_VALUE;
                a aVar2 = aVar;
                Object obj = aVar2.l;
                nm6 nm6Var = nm6.a;
                i = aVar2.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    b0 n = eVar.n();
                    n.getClass();
                    b6Var.getClass();
                    com.yandex.passport.common.core.f fVar = (com.yandex.passport.common.core.f) b6Var.b;
                    bsh bshVar = n.k;
                    if (bshVar != null) {
                        b6 b6Var3 = (b6) bshVar.b;
                        if (Intrinsics.d((com.yandex.passport.common.core.f) b6Var3.b, fVar)) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Old model reused", 8);
                            }
                            x0qVar = (x0q) bshVar.f;
                            d dVar = new d(new ub7(12, x0qVar, new b(2, eVar, e.class, "consumeViewState", "consumeViewState(Lcom/yandex/passport/internal/ui/challenge/ChallengeViewModel$State;)V", 4, 0)), 0);
                            aVar2.j = b6Var;
                            aVar2.k = eVar;
                            aVar2.n = 1;
                            obj = zsd.g0(dVar, aVar2);
                            if (obj != nm6Var) {
                                eVar2 = eVar;
                                b6Var2 = b6Var;
                            }
                        }
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Uids not match: " + ((com.yandex.passport.common.core.f) b6Var3.b) + " != " + fVar, 8);
                        }
                        gld.L((tf6) bshVar.d, null);
                    }
                    bsh a = n.a(b6Var);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "New model created", 8);
                    }
                    n.k = a;
                    x97.y((tf6) a.d, null, null, new r1w(a, continuation, 22), 3);
                    x0qVar = (x0q) a.f;
                    d dVar2 = new d(new ub7(12, x0qVar, new b(2, eVar, e.class, "consumeViewState", "consumeViewState(Lcom/yandex/passport/internal/ui/challenge/ChallengeViewModel$State;)V", 4, 0)), 0);
                    aVar2.j = b6Var;
                    aVar2.k = eVar;
                    aVar2.n = 1;
                    obj = zsd.g0(dVar2, aVar2);
                    if (obj != nm6Var) {
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eVar2 = aVar2.k;
                b6Var2 = aVar2.j;
                qgg.h0(obj);
                boolean z = ((y) obj).a;
                aVar2.j = null;
                aVar2.k = null;
                aVar2.n = 2;
                Object w = eVar2.w(z, b6Var2, aVar2);
                return w != nm6Var ? nm6Var : w;
            }
        }
        aVar = new a(eVar, cg6Var);
        a aVar22 = aVar;
        Object obj2 = aVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = aVar22.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        boolean z2 = ((y) obj2).a;
        aVar22.j = null;
        aVar22.k = null;
        aVar22.n = 2;
        Object w2 = eVar2.w(z2, b6Var2, aVar22);
        if (w2 != nm6Var2) {
        }
    }

    public void k(a0 a0Var) {
        a0Var.getClass();
        boolean z = a0Var instanceof x;
        jyr jyrVar = this.b;
        if (z) {
            com.yandex.passport.internal.ui.common.b loader = m().getLoader();
            loader.getClass();
            ((w) jyrVar.getValue()).a.a(new dsa(loader));
            return;
        }
        if (a0Var instanceof z) {
            com.yandex.passport.internal.ui.common.web.g webSlab = m().getWebSlab();
            webSlab.e(((z) a0Var).a);
            ((w) jyrVar.getValue()).a.a(webSlab);
        } else {
            if (a0Var instanceof y) {
                return;
            }
            b6e.s();
        }
    }

    public abstract f l(PassportProcessGlobalComponent passportProcessGlobalComponent, Bundle bundle);

    public final f m() {
        f fVar = this.c;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.j("component");
        throw null;
    }

    public abstract b0 n();

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        rvr rvrVar = rvr.t;
        b1b.a(this, new zyr(0, 0, 0, rvrVar), new zyr(0, 0, 0, rvrVar));
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            xq0.q("no extras data");
            return;
        }
        f l = l(a, extras);
        l.getClass();
        this.c = l;
        s(bundle);
    }

    /* renamed from: p */
    public /* bridge */ Object q(b6 b6Var, com.yandex.passport.internal.ui.k kVar) {
        return q(b6Var, kVar);
    }

    public Object q(b6 b6Var, com.yandex.passport.internal.ui.k kVar) {
        return r(this, b6Var, kVar);
    }

    public final void s(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(((w) this.b.getValue()).a.a);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.k(this, t(extras), null, 1), 3);
            return;
        }
        com.yandex.passport.api.exception.t tVar = new com.yandex.passport.api.exception.t("no input data");
        Intent intent2 = new Intent();
        intent2.putExtra(Constants.KEY_EXCEPTION, tVar);
        setResult(13, intent2);
        finish();
    }

    public abstract b6 t(Bundle bundle);

    public abstract int u(Object obj);

    public abstract Bundle v(Object obj);

    public abstract Object w(boolean z, b6 b6Var, a aVar);
}
