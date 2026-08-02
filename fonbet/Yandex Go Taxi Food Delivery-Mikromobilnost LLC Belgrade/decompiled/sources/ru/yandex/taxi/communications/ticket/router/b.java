package ru.yandex.taxi.communications.ticket.router;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.a2z0;
import defpackage.ar4;
import defpackage.br4;
import defpackage.c4z0;
import defpackage.cr4;
import defpackage.dr4;
import defpackage.gw00;
import defpackage.hxx;
import defpackage.m950;
import defpackage.mf1;
import defpackage.mno0;
import defpackage.ny61;
import defpackage.ot4;
import defpackage.pep0;
import defpackage.qu;
import defpackage.r;
import defpackage.rm5;
import defpackage.rmy0;
import defpackage.s2z0;
import defpackage.sno0;
import defpackage.st4;
import defpackage.tls;
import defpackage.ut4;
import defpackage.vno0;
import defpackage.vt4;
import defpackage.w511;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.banners.PromoBannerActivationStatus;

/* loaded from: classes5.dex */
public final class b implements s2z0 {
    public final mf1 a;
    public final /* synthetic */ a2z0 b;

    public b(a2z0 a2z0Var, mf1 mf1Var) {
        this.b = a2z0Var;
        this.a = mf1Var;
    }

    public final void a() {
        a2z0 a2z0Var = this.b;
        c4z0 c4z0Var = (c4z0) a2z0Var.d0.b;
        PromoBannerActivationStatus promoBannerActivationStatus = c4z0Var.c;
        c4z0Var.c = null;
        if (promoBannerActivationStatus != null) {
            a2z0Var.b0.a(promoBannerActivationStatus);
        }
        a2z0Var.r(new qu(9));
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vt4 vt4Var = (vt4) it.next();
            boolean z = vt4Var instanceof ot4;
            a2z0 a2z0Var = this.b;
            if (z) {
                a2z0Var.J.a(false, ((ot4) vt4Var).a, "PromoCode");
            } else if (vt4Var instanceof st4) {
                st4 st4Var = (st4) vt4Var;
                a2z0Var.S.b(st4Var.b, st4Var.c, st4Var.a);
            } else if (!(vt4Var instanceof ut4)) {
                w511.b();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, ContinuationImpl continuationImpl) {
        TicketComposeRouter$InnerNavigator$saveBenefit$1 ticketComposeRouter$InnerNavigator$saveBenefit$1;
        int i;
        dr4 dr4Var;
        a2z0 a2z0Var = this.b;
        final rm5 rm5Var = a2z0Var.d0;
        if (continuationImpl instanceof TicketComposeRouter$InnerNavigator$saveBenefit$1) {
            ticketComposeRouter$InnerNavigator$saveBenefit$1 = (TicketComposeRouter$InnerNavigator$saveBenefit$1) continuationImpl;
            int i2 = ticketComposeRouter$InnerNavigator$saveBenefit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ticketComposeRouter$InnerNavigator$saveBenefit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ticketComposeRouter$InnerNavigator$saveBenefit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ticketComposeRouter$InnerNavigator$saveBenefit$1.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rm5Var.getClass();
                    final int i4 = 0;
                    rm5Var.b(new tls() { // from class: y3z0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i5 = i4;
                            rm5 rm5Var2 = rm5Var;
                            v3z0 v3z0Var = (v3z0) obj2;
                            switch (i5) {
                                case 0:
                                    u2z0 u2z0Var = v3z0Var.a;
                                    return v3z0.a(v3z0Var, new u2z0(((avj0) ((zuj0) rm5Var2.d)).h(kyh0.promocodes_scooters_use_button_loading), u2z0Var.b), "", true, false);
                                default:
                                    u2z0 u2z0Var2 = v3z0Var.a;
                                    return v3z0.a(v3z0Var, new u2z0(((avj0) ((zuj0) rm5Var2.d)).h(kyh0.try_again), u2z0Var2.b), ((avj0) ((zuj0) rm5Var2.d)).h(kyh0.benefits_center_promo_promocode_error_subtitle), false, true);
                            }
                        }
                    }, str);
                    com.yandex.go.benefits_center.activation.data.b bVar = a2z0Var.a0;
                    ticketComposeRouter$InnerNavigator$saveBenefit$1.L$0 = str;
                    ticketComposeRouter$InnerNavigator$saveBenefit$1.L$1 = str2;
                    ticketComposeRouter$InnerNavigator$saveBenefit$1.label = 1;
                    obj = bVar.a(str, ticketComposeRouter$InnerNavigator$saveBenefit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) ticketComposeRouter$InnerNavigator$saveBenefit$1.L$1;
                    str = (String) ticketComposeRouter$InnerNavigator$saveBenefit$1.L$0;
                    kotlin.b.b(obj);
                }
                dr4Var = (dr4) obj;
                if (!(dr4Var instanceof cr4)) {
                    String a = a2z0Var.c0.a(gw00.e(new Pair(AuthSdkActivity.RESPONSE_TYPE_CODE, str)));
                    rm5Var.getClass();
                    rm5Var.b(new r(str2, a, 27), str);
                    ((c4z0) rm5Var.b).c = PromoBannerActivationStatus.ACTIVATED;
                } else if (dr4Var instanceof ar4) {
                    rm5Var.getClass();
                    rm5Var.b(new tls() { // from class: y3z0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i5 = i3;
                            rm5 rm5Var2 = rm5Var;
                            v3z0 v3z0Var = (v3z0) obj2;
                            switch (i5) {
                                case 0:
                                    u2z0 u2z0Var = v3z0Var.a;
                                    return v3z0.a(v3z0Var, new u2z0(((avj0) ((zuj0) rm5Var2.d)).h(kyh0.promocodes_scooters_use_button_loading), u2z0Var.b), "", true, false);
                                default:
                                    u2z0 u2z0Var2 = v3z0Var.a;
                                    return v3z0.a(v3z0Var, new u2z0(((avj0) ((zuj0) rm5Var2.d)).h(kyh0.try_again), u2z0Var2.b), ((avj0) ((zuj0) rm5Var2.d)).h(kyh0.benefits_center_promo_promocode_error_subtitle), false, true);
                            }
                        }
                    }, str);
                    ((c4z0) rm5Var.b).c = PromoBannerActivationStatus.ERROR;
                } else {
                    if (!(dr4Var instanceof br4)) {
                        w511.b();
                        return null;
                    }
                    String str3 = ((br4) dr4Var).a;
                    rm5Var.getClass();
                    rm5Var.b(new rmy0(12, str3, rm5Var), str);
                }
                return zy11.a;
            }
        }
        ticketComposeRouter$InnerNavigator$saveBenefit$1 = new TicketComposeRouter$InnerNavigator$saveBenefit$1(this, continuationImpl);
        Object obj2 = ticketComposeRouter$InnerNavigator$saveBenefit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ticketComposeRouter$InnerNavigator$saveBenefit$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        dr4Var = (dr4) obj2;
        if (!(dr4Var instanceof cr4)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        TicketComposeRouter$InnerNavigator$scootersUse$1 ticketComposeRouter$InnerNavigator$scootersUse$1;
        int i;
        if (continuationImpl instanceof TicketComposeRouter$InnerNavigator$scootersUse$1) {
            ticketComposeRouter$InnerNavigator$scootersUse$1 = (TicketComposeRouter$InnerNavigator$scootersUse$1) continuationImpl;
            int i2 = ticketComposeRouter$InnerNavigator$scootersUse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ticketComposeRouter$InnerNavigator$scootersUse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ticketComposeRouter$InnerNavigator$scootersUse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ticketComposeRouter$InnerNavigator$scootersUse$1.label;
                a2z0 a2z0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sno0 sno0Var = a2z0Var.T;
                    ticketComposeRouter$InnerNavigator$scootersUse$1.L$0 = null;
                    ticketComposeRouter$InnerNavigator$scootersUse$1.label = 1;
                    obj = sno0Var.a.a(str, ticketComposeRouter$InnerNavigator$scootersUse$1);
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
                ((pep0) a2z0Var.P).f((m950) a2z0Var.W.get(), new mno0((vno0) obj), hxx.a);
                a();
                return zy11.a;
            }
        }
        ticketComposeRouter$InnerNavigator$scootersUse$1 = new TicketComposeRouter$InnerNavigator$scootersUse$1(this, continuationImpl);
        Object obj2 = ticketComposeRouter$InnerNavigator$scootersUse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ticketComposeRouter$InnerNavigator$scootersUse$1.label;
        a2z0 a2z0Var2 = this.b;
        if (i != 0) {
        }
        ((pep0) a2z0Var2.P).f((m950) a2z0Var2.W.get(), new mno0((vno0) obj2), hxx.a);
        a();
        return zy11.a;
    }
}
