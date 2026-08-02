package ru.yandex.taxi.router;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import defpackage.h3y;
import defpackage.h55;
import defpackage.ie0;
import defpackage.je0;
import defpackage.ke0;
import defpackage.m950;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pe0;
import defpackage.q251;
import defpackage.qu;
import defpackage.r870;
import defpackage.ra00;
import defpackage.tje;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class c extends h55 {
    public final ra00 D;
    public final n20 E;
    public final com.yandex.go.navigation.screen.c F;
    public final h3y G;
    public final yvf0 H;
    public final yvf0 I;
    public final yvf0 J;
    public final yvf0 K;

    public c(ra00 ra00Var, n20 n20Var, com.yandex.go.navigation.screen.c cVar, h3y h3yVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4) {
        super(null);
        this.D = ra00Var;
        this.E = n20Var;
        this.F = cVar;
        this.G = h3yVar;
        this.H = yvf0Var;
        this.I = yvf0Var2;
        this.J = yvf0Var3;
        this.K = yvf0Var4;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ke0 ke0Var = (ke0) obj;
        if (ke0Var instanceof je0) {
            je0 je0Var = (je0) ke0Var;
            A((m950) this.I.get(), je0Var.c, new pe0(this, je0Var));
        } else if (ke0Var instanceof ie0) {
            Q(ke0Var);
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(ContinuationImpl continuationImpl) {
        AddFavoritesRootRouterImpl$navigateToOrderDetails$1 addFavoritesRootRouterImpl$navigateToOrderDetails$1;
        int i;
        o2y0 o2y0Var;
        if (continuationImpl instanceof AddFavoritesRootRouterImpl$navigateToOrderDetails$1) {
            addFavoritesRootRouterImpl$navigateToOrderDetails$1 = (AddFavoritesRootRouterImpl$navigateToOrderDetails$1) continuationImpl;
            int i2 = addFavoritesRootRouterImpl$navigateToOrderDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addFavoritesRootRouterImpl$navigateToOrderDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addFavoritesRootRouterImpl$navigateToOrderDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addFavoritesRootRouterImpl$navigateToOrderDetails$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addFavoritesRootRouterImpl$navigateToOrderDetails$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.E).t(addFavoritesRootRouterImpl$navigateToOrderDetails$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var == null) {
                    ((com.yandex.go.superapp.impl.router.a) ((r870) this.G.get())).b(o2y0Var.b(), true, DetailsOpenReason.AUTO, TaxiCardNavigationAction.EMPTY, new q251(10));
                    i();
                } else {
                    r(new qu(9));
                }
                return zy11.a;
            }
        }
        addFavoritesRootRouterImpl$navigateToOrderDetails$1 = new AddFavoritesRootRouterImpl$navigateToOrderDetails$1(this, continuationImpl);
        Object obj2 = addFavoritesRootRouterImpl$navigateToOrderDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addFavoritesRootRouterImpl$navigateToOrderDetails$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var == null) {
        }
        return zy11.a;
    }

    public final void Q(ke0 ke0Var) {
        tje.N(o(), null, null, new AddFavoritesRootRouterImpl$show$1$1(ke0Var, this, null), 3);
    }
}
