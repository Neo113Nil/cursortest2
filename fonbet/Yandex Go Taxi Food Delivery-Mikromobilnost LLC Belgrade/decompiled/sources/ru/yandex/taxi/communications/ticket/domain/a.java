package ru.yandex.taxi.communications.ticket.domain;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.a2z0;
import defpackage.a60;
import defpackage.avj0;
import defpackage.c4z0;
import defpackage.j3z0;
import defpackage.jl40;
import defpackage.k3z0;
import defpackage.kyh0;
import defpackage.l3z0;
import defpackage.m3z0;
import defpackage.m950;
import defpackage.mf1;
import defpackage.n3z0;
import defpackage.ny61;
import defpackage.o2z0;
import defpackage.o3z0;
import defpackage.oep0;
import defpackage.ore0;
import defpackage.p3z0;
import defpackage.q3z0;
import defpackage.ra00;
import defpackage.s2z0;
import defpackage.v770;
import defpackage.w511;
import defpackage.y1h0;
import defpackage.ynv0;
import defpackage.z1z0;
import defpackage.zpf0;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.banners.PromoBannerActivationStatus;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.benefitscenter.BenefitsCenterNotification;

/* loaded from: classes5.dex */
public final class a {
    public final zpf0 a;

    public a(zpf0 zpf0Var) {
        this.a = zpf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01f5, code lost:
    
        if (r9 == r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f3, code lost:
    
        if (r9 == r3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q3z0 q3z0Var, s2z0 s2z0Var, o2z0 o2z0Var, String str, ContinuationImpl continuationImpl) {
        TicketUiActionInteractor$handleAction$1 ticketUiActionInteractor$handleAction$1;
        Object d;
        mf1 mf1Var;
        ynv0 b;
        s2z0 s2z0Var2;
        v770 v770Var = v770.c;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof TicketUiActionInteractor$handleAction$1) {
            ticketUiActionInteractor$handleAction$1 = (TicketUiActionInteractor$handleAction$1) continuationImpl;
            int i = ticketUiActionInteractor$handleAction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketUiActionInteractor$handleAction$1.label = i - Integer.MIN_VALUE;
                Object obj = ticketUiActionInteractor$handleAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (ticketUiActionInteractor$handleAction$1.label) {
                    case 0:
                        b.b(obj);
                        if (jl40.l(q3z0Var, j3z0.a)) {
                            ((ru.yandex.taxi.communications.ticket.router.b) s2z0Var).a();
                            return zy11Var;
                        }
                        if (jl40.l(q3z0Var, j3z0.b)) {
                            this.a.d(o2z0Var.a, str);
                            return zy11Var;
                        }
                        if (q3z0Var instanceof m3z0) {
                            m3z0 m3z0Var = (m3z0) q3z0Var;
                            String str2 = m3z0Var.a;
                            ru.yandex.taxi.communications.ticket.router.b bVar = (ru.yandex.taxi.communications.ticket.router.b) s2z0Var;
                            a2z0 a2z0Var = bVar.b;
                            c4z0 c4z0Var = (c4z0) a2z0Var.d0.b;
                            PromoBannerActivationStatus promoBannerActivationStatus = c4z0Var.c;
                            c4z0Var.c = null;
                            ((a60) a2z0Var.H).c(str2, v770Var);
                            this.a.c(o2z0Var.a, str);
                            List list = m3z0Var.b;
                            ticketUiActionInteractor$handleAction$1.L$0 = null;
                            ticketUiActionInteractor$handleAction$1.L$1 = bVar;
                            ticketUiActionInteractor$handleAction$1.L$2 = null;
                            ticketUiActionInteractor$handleAction$1.L$3 = null;
                            ticketUiActionInteractor$handleAction$1.label = 1;
                            bVar.b(list);
                            if (zy11Var != coroutineSingletons) {
                                s2z0Var2 = bVar;
                                ((ru.yandex.taxi.communications.ticket.router.b) s2z0Var2).a();
                                return zy11Var;
                            }
                        } else if (q3z0Var instanceof k3z0) {
                            k3z0 k3z0Var = (k3z0) q3z0Var;
                            ru.yandex.taxi.communications.ticket.router.b bVar2 = (ru.yandex.taxi.communications.ticket.router.b) s2z0Var;
                            bVar2.b.J.a(false, k3z0Var.a, "PromoCode");
                            this.a.c(o2z0Var.a, str);
                            List list2 = k3z0Var.b;
                            ticketUiActionInteractor$handleAction$1.L$0 = null;
                            ticketUiActionInteractor$handleAction$1.L$1 = null;
                            ticketUiActionInteractor$handleAction$1.L$2 = null;
                            ticketUiActionInteractor$handleAction$1.L$3 = null;
                            ticketUiActionInteractor$handleAction$1.label = 2;
                            bVar2.b(list2);
                            if (zy11Var != coroutineSingletons) {
                                return zy11Var;
                            }
                        } else if (q3z0Var instanceof p3z0) {
                            this.a.c(o2z0Var.a, str);
                            p3z0 p3z0Var = (p3z0) q3z0Var;
                            String str3 = p3z0Var.a;
                            String str4 = p3z0Var.b;
                            ticketUiActionInteractor$handleAction$1.L$0 = null;
                            ticketUiActionInteractor$handleAction$1.L$1 = null;
                            ticketUiActionInteractor$handleAction$1.L$2 = null;
                            ticketUiActionInteractor$handleAction$1.L$3 = null;
                            ticketUiActionInteractor$handleAction$1.label = 3;
                            Object c = ((ru.yandex.taxi.communications.ticket.router.b) s2z0Var).c(str3, str4, ticketUiActionInteractor$handleAction$1);
                            if (c != coroutineSingletons) {
                                return c;
                            }
                        } else {
                            if (q3z0Var instanceof n3z0) {
                                String str5 = ((n3z0) q3z0Var).a;
                                a2z0 a2z0Var2 = ((ru.yandex.taxi.communications.ticket.router.b) s2z0Var).b;
                                c4z0 c4z0Var2 = (c4z0) a2z0Var2.d0.b;
                                PromoBannerActivationStatus promoBannerActivationStatus2 = c4z0Var2.c;
                                c4z0Var2.c = null;
                                ((a60) a2z0Var2.H).c(str5, v770Var);
                                return zy11Var;
                            }
                            if (q3z0Var instanceof o3z0) {
                                BannerWidgets.NamedActionType namedActionType = ((o3z0) q3z0Var).a;
                                ticketUiActionInteractor$handleAction$1.L$0 = q3z0Var;
                                ticketUiActionInteractor$handleAction$1.L$1 = s2z0Var;
                                ticketUiActionInteractor$handleAction$1.L$2 = null;
                                ticketUiActionInteractor$handleAction$1.L$3 = null;
                                ticketUiActionInteractor$handleAction$1.label = 4;
                                ru.yandex.taxi.communications.ticket.router.b bVar3 = (ru.yandex.taxi.communications.ticket.router.b) s2z0Var;
                                bVar3.getClass();
                                int i2 = z1z0.a[namedActionType.ordinal()];
                                if (i2 == 1) {
                                    mf1 mf1Var2 = bVar3.a;
                                    if (mf1Var2 != null) {
                                        d = bVar3.d(mf1Var2.b, ticketUiActionInteractor$handleAction$1);
                                        break;
                                    }
                                } else if (i2 == 2 && (mf1Var = bVar3.a) != null) {
                                    String str6 = mf1Var.b;
                                    boolean isEmpty = bVar3.b.O.a().a.isEmpty();
                                    boolean isEmpty2 = bVar3.b.O.a().e.isEmpty();
                                    if (isEmpty && isEmpty2) {
                                        bVar3.b.N.m(str6);
                                        a2z0 a2z0Var3 = bVar3.b;
                                        ra00 ra00Var = a2z0Var3.M;
                                        m950 m950Var = (m950) a2z0Var3.U.get();
                                        Preorder preorder = a2z0Var3.I.a;
                                        b = a2z0Var3.V.b(null, null);
                                        ra00Var.b(m950Var, new ore0(preorder, "open summary from benefits-center-activation", b));
                                        ru.yandex.taxi.communications.benefitscenter.b bVar4 = a2z0Var3.S;
                                        String h = ((avj0) a2z0Var3.K).h(kyh0.benefits_center_promo_activated);
                                        int i3 = y1h0.ic_success_activation;
                                        BenefitsCenterNotification a = bVar4.a(h, null);
                                        bVar4.d.e(a);
                                        a.setImage(i3);
                                    } else {
                                        a2z0 a2z0Var4 = bVar3.b;
                                        oep0.b(a2z0Var4.P, (m950) a2z0Var4.Z.get());
                                        bVar3.a();
                                    }
                                }
                                d = zy11Var;
                                break;
                            } else {
                                if (!(q3z0Var instanceof l3z0)) {
                                    w511.b();
                                    return null;
                                }
                                ru.yandex.taxi.communications.ticket.router.b bVar5 = (ru.yandex.taxi.communications.ticket.router.b) s2z0Var;
                                bVar5.b.N.f();
                                bVar5.a();
                                List list3 = ((l3z0) q3z0Var).a;
                                ticketUiActionInteractor$handleAction$1.L$0 = null;
                                ticketUiActionInteractor$handleAction$1.L$1 = null;
                                ticketUiActionInteractor$handleAction$1.L$2 = null;
                                ticketUiActionInteractor$handleAction$1.L$3 = null;
                                ticketUiActionInteractor$handleAction$1.label = 6;
                                ((ru.yandex.taxi.communications.ticket.router.b) s2z0Var).b(list3);
                                if (zy11Var == coroutineSingletons) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        s2z0Var2 = (s2z0) ticketUiActionInteractor$handleAction$1.L$1;
                        b.b(obj);
                        ((ru.yandex.taxi.communications.ticket.router.b) s2z0Var2).a();
                        return zy11Var;
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        b.b(obj);
                        return obj;
                    case 4:
                        s2z0Var = (s2z0) ticketUiActionInteractor$handleAction$1.L$1;
                        q3z0Var = (q3z0) ticketUiActionInteractor$handleAction$1.L$0;
                        b.b(obj);
                        List list4 = ((o3z0) q3z0Var).b;
                        ticketUiActionInteractor$handleAction$1.L$0 = null;
                        ticketUiActionInteractor$handleAction$1.L$1 = null;
                        ticketUiActionInteractor$handleAction$1.L$2 = null;
                        ticketUiActionInteractor$handleAction$1.L$3 = null;
                        ticketUiActionInteractor$handleAction$1.label = 5;
                        ((ru.yandex.taxi.communications.ticket.router.b) s2z0Var).b(list4);
                        if (zy11Var == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ticketUiActionInteractor$handleAction$1 = new TicketUiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj2 = ticketUiActionInteractor$handleAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (ticketUiActionInteractor$handleAction$1.label) {
        }
    }
}
