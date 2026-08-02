package ru.yandex.taxi.cashback.router.real.home;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.plus.home.api.config.PlusHomeBundle;
import defpackage.bo10;
import defpackage.d59;
import defpackage.frd0;
import defpackage.grd0;
import defpackage.h3y;
import defpackage.krd0;
import defpackage.l9y0;
import defpackage.mjd0;
import defpackage.ny61;
import defpackage.oqd0;
import defpackage.q3u0;
import defpackage.qp00;
import defpackage.qxx0;
import defpackage.rp00;
import defpackage.tzf0;
import defpackage.u1d0;
import defpackage.vfc0;
import defpackage.vrd0;
import defpackage.w030;
import defpackage.w2d0;
import defpackage.w511;
import defpackage.w7o;
import defpackage.xhh0;
import defpackage.yvf0;
import defpackage.znp0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.cashback.router.real.home.a;
import ru.yandex.taxi.plus.repository.c;
import ru.yandex.taxi.plus.sdk.home.config.OpenPlusSubscriptionAction;

/* loaded from: classes6.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final ComponentActivity G;
    public final h3y H;
    public final h3y I;
    public final l9y0 J;
    public final tzf0 K;
    public final mjd0 L;
    public final qp00 M;
    public final q3u0 N;
    public final frd0 O;
    public final oqd0 P;
    public final yvf0 Q;

    public a(w030 w030Var, ComponentActivity componentActivity, h3y h3yVar, h3y h3yVar2, l9y0 l9y0Var, tzf0 tzf0Var, mjd0 mjd0Var, qp00 qp00Var, q3u0 q3u0Var, frd0 frd0Var, oqd0 oqd0Var, yvf0 yvf0Var) {
        super(null);
        this.F = w030Var;
        this.G = componentActivity;
        this.H = h3yVar;
        this.I = h3yVar2;
        this.J = l9y0Var;
        this.K = tzf0Var;
        this.L = mjd0Var;
        this.M = qp00Var;
        this.N = q3u0Var;
        this.O = frd0Var;
        this.P = oqd0Var;
        this.Q = yvf0Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((rp00) this.M).b(this);
        this.N.a.remove(this);
        u1d0 u1d0Var = ((qxx0) obj).c;
        if (u1d0Var != null) {
            u1d0Var.h(new w7o(this.L.a));
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        OpenPlusSubscriptionAction openPlusSubscriptionAction;
        qxx0 qxx0Var = (qxx0) obj;
        this.L.a = false;
        tzf0 tzf0Var = this.K;
        int i = krd0.a[qxx0Var.b.a.ordinal()];
        if (i == 1) {
            openPlusSubscriptionAction = OpenPlusSubscriptionAction.NONE;
        } else if (i == 2) {
            openPlusSubscriptionAction = OpenPlusSubscriptionAction.BUY_SUBSCRIPTION;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            openPlusSubscriptionAction = OpenPlusSubscriptionAction.UPGRADE_SUBSCRIPTION;
        }
        tzf0Var.b = openPlusSubscriptionAction;
        vfc0 vfc0Var = tzf0Var.a;
        if (vfc0Var != null) {
            vfc0Var.f();
        }
        this.J.c = qxx0Var.b.c;
        ((rp00) this.M).a(this);
        this.N.a.add(this);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0, types: [jrd0] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(qxx0 qxx0Var, ContinuationImpl continuationImpl) {
        PlusWebHomeInternalRealRouter$provideModalView$1 plusWebHomeInternalRealRouter$provideModalView$1;
        int i;
        bo10 bo10Var;
        if (continuationImpl instanceof PlusWebHomeInternalRealRouter$provideModalView$1) {
            plusWebHomeInternalRealRouter$provideModalView$1 = (PlusWebHomeInternalRealRouter$provideModalView$1) continuationImpl;
            int i2 = plusWebHomeInternalRealRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebHomeInternalRealRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                PlusWebHomeInternalRealRouter$provideModalView$1 plusWebHomeInternalRealRouter$provideModalView$12 = plusWebHomeInternalRealRouter$provideModalView$1;
                Object obj = plusWebHomeInternalRealRouter$provideModalView$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebHomeInternalRealRouter$provideModalView$12.label;
                final int i3 = 1;
                if (i != 0) {
                    b.b(obj);
                    znp0 znp0Var = ((c) this.I.get()).a.a;
                    String str = (znp0Var == null || (bo10Var = znp0Var.b) == null) ? null : bo10Var.a;
                    grd0 grd0Var = this.O.a;
                    PlusHomeBundle plusHomeBundle = grd0Var.a;
                    final int i4 = 0;
                    if (plusHomeBundle == null) {
                        plusHomeBundle = new PlusHomeBundle(0);
                    }
                    PlusHomeBundle plusHomeBundle2 = plusHomeBundle;
                    if (qxx0Var.b.b) {
                        plusHomeBundle2.p("composite_payment.enabled");
                        plusHomeBundle2.q(Boolean.TRUE);
                    } else {
                        plusHomeBundle2.p(null);
                        plusHomeBundle2.q(null);
                    }
                    String str2 = qxx0Var.b.e;
                    if (str != null && str.length() != 0 && str2 != null) {
                        str = Uri.parse(str).buildUpon().appendQueryParameter("clientSubSource", str2).toString();
                    }
                    plusHomeBundle2.m(str);
                    grd0Var.a = plusHomeBundle2;
                    ru.yandex.taxi.plus.sdk.modal.a aVar = (ru.yandex.taxi.plus.sdk.modal.a) this.H.get();
                    ComponentActivity componentActivity = this.G;
                    Lifecycle lifecycle = componentActivity.getLifecycle();
                    String str3 = qxx0Var.a;
                    w2d0 w2d0Var = qxx0Var.b;
                    String str4 = w2d0Var.d;
                    String str5 = w2d0Var.c;
                    ?? r8 = new Runnable(this) { // from class: jrd0
                        public final /* synthetic */ a b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5 = i4;
                            a aVar2 = this.b;
                            switch (i5) {
                                case 0:
                                    aVar2.L.a = true;
                                    break;
                                default:
                                    aVar2.r(new qu(9));
                                    break;
                            }
                        }
                    };
                    d59 d59Var = new d59(this, 2);
                    plusWebHomeInternalRealRouter$provideModalView$12.L$0 = null;
                    plusWebHomeInternalRealRouter$provideModalView$12.L$1 = null;
                    plusWebHomeInternalRealRouter$provideModalView$12.L$2 = null;
                    plusWebHomeInternalRealRouter$provideModalView$12.label = 1;
                    obj = aVar.a(componentActivity, lifecycle, str3, str4, str5, plusHomeBundle2, r8, d59Var, plusWebHomeInternalRealRouter$provideModalView$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return new PlusWebHomeModalView(this.G, (ViewGroup) this.G.findViewById(xhh0.top_modal_views_container), (vrd0) obj, new Runnable(this) { // from class: jrd0
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i3;
                        a aVar2 = this.b;
                        switch (i5) {
                            case 0:
                                aVar2.L.a = true;
                                break;
                            default:
                                aVar2.r(new qu(9));
                                break;
                        }
                    }
                });
            }
        }
        plusWebHomeInternalRealRouter$provideModalView$1 = new PlusWebHomeInternalRealRouter$provideModalView$1(this, continuationImpl);
        PlusWebHomeInternalRealRouter$provideModalView$1 plusWebHomeInternalRealRouter$provideModalView$122 = plusWebHomeInternalRealRouter$provideModalView$1;
        Object obj2 = plusWebHomeInternalRealRouter$provideModalView$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebHomeInternalRealRouter$provideModalView$122.label;
        final int i32 = 1;
        if (i != 0) {
        }
        return new PlusWebHomeModalView(this.G, (ViewGroup) this.G.findViewById(xhh0.top_modal_views_container), (vrd0) obj2, new Runnable(this) { // from class: jrd0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i5 = i32;
                a aVar2 = this.b;
                switch (i5) {
                    case 0:
                        aVar2.L.a = true;
                        break;
                    default:
                        aVar2.r(new qu(9));
                        break;
                }
            }
        });
    }
}
