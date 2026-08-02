package defpackage;

import com.yandex.passport.internal.account.f;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.impl.InterfaceC0532or;
import io.appmetrica.analytics.profile.Attribute;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.services.RoutineService;

/* loaded from: classes6.dex */
public final class mgp implements dho {
    public final eps a;
    public final jyr b;
    public final jyr c;

    public mgp(eps epsVar) {
        this.a = epsVar;
        bdt I = hag.I(jul.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(av0.class), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r14 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.dho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        kgp kgpVar;
        int i;
        d51 d51Var;
        RoutineService routineService;
        boolean booleanValue;
        boolean z;
        if (continuation instanceof kgp) {
            kgpVar = (kgp) continuation;
            int i2 = kgpVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kgpVar.o = i2 - Integer.MIN_VALUE;
                Object obj = kgpVar.m;
                Object obj2 = nm6.a;
                i = kgpVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    d51 d51Var2 = d51.i;
                    eps epsVar = this.a;
                    RoutineService routineService2 = (RoutineService) epsVar.a;
                    pjc g = ((frt) epsVar.b).g();
                    kgpVar.j = d51Var2;
                    kgpVar.k = routineService2;
                    kgpVar.o = 1;
                    Object g0 = zsd.g0(g, kgpVar);
                    if (g0 != obj2) {
                        d51Var = d51Var2;
                        obj = g0;
                        routineService = routineService2;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = kgpVar.l;
                        qgg.h0(obj);
                        booleanValue = z;
                        return Boolean.valueOf(booleanValue);
                    }
                    qgg.h0(obj);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (booleanValue) {
                        kgpVar.l = booleanValue;
                        kgpVar.o = 3;
                        if (b(kgpVar) != obj2) {
                            z = booleanValue;
                            booleanValue = z;
                        }
                        return obj2;
                    }
                    return Boolean.valueOf(booleanValue);
                }
                RoutineService routineService3 = kgpVar.k;
                d51Var = kgpVar.j;
                qgg.h0(obj);
                routineService = routineService3;
                xxq xxqVar = (xxq) obj;
                kgpVar.j = null;
                kgpVar.k = null;
                kgpVar.o = 2;
                d51Var.getClass();
                dq7 dq7Var = ca8.a;
                obj = x97.V(mn7.d, new fmk(xxqVar, "SendUserInfoRoutine", routineService, 86400000L, null), kgpVar);
            }
        }
        kgpVar = new kgp(this, (cg6) continuation);
        Object obj3 = kgpVar.m;
        Object obj22 = nm6.a;
        i = kgpVar.o;
        if (i != 0) {
        }
        xxq xxqVar2 = (xxq) obj3;
        kgpVar.j = null;
        kgpVar.k = null;
        kgpVar.o = 2;
        d51Var.getClass();
        dq7 dq7Var2 = ca8.a;
        obj3 = x97.V(mn7.d, new fmk(xxqVar2, "SendUserInfoRoutine", routineService, 86400000L, null), kgpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        if (r0 == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        if (r1 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        lgp lgpVar;
        int i;
        f fVar;
        f fVar2;
        int i2;
        yxc yxcVar;
        eps epsVar = this.a;
        if (cg6Var instanceof lgp) {
            lgpVar = (lgp) cg6Var;
            int i3 = lgpVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lgpVar.n = i3 - Integer.MIN_VALUE;
                lgp lgpVar2 = lgpVar;
                Object obj = lgpVar2.l;
                nm6 nm6Var = nm6.a;
                i = lgpVar2.n;
                if (i != 0) {
                    qgg.h0(obj);
                    av0 av0Var = (av0) this.c.getValue();
                    lgpVar2.n = 1;
                    obj = ((iv0) av0Var).b.c(lgpVar2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qgg.h0(obj);
                                return Unit.a;
                            }
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = lgpVar2.k;
                        fVar2 = lgpVar2.j;
                        qgg.h0(obj);
                        yxcVar = (yxc) obj;
                        if (yxcVar != null) {
                            RoutineService routineService = (RoutineService) epsVar.a;
                            j7q j7qVar = (j7q) epsVar.c;
                            ezb ezbVar = (ezb) epsVar.d;
                            u0j u0jVar = (u0j) ((fkn) ((z66) epsVar.e).e()).a.getValue();
                            jul julVar = (jul) this.b.getValue();
                            pfj pfjVar = (pfj) epsVar.f;
                            rfj rfjVar = (rfj) epsVar.g;
                            lgpVar2.j = null;
                            lgpVar2.k = i2;
                            lgpVar2.n = 3;
                            ist istVar = ist.a;
                            String str = (String) sn4.a.getValue();
                            UserProfileUpdate<? extends InterfaceC0532or> withValue = Attribute.customString("auth_type").withValue(ad.a(fVar2).name());
                            withValue.getClass();
                            UserProfileUpdate<? extends InterfaceC0532or> withValue2 = Attribute.customBoolean("has_yandex_plus").withValue(yxcVar.g);
                            withValue2.getClass();
                            UserProfileUpdate<? extends InterfaceC0532or> withValue3 = Attribute.customString("clid").withValue(str);
                            withValue3.getClass();
                            UserProfileUpdate<? extends InterfaceC0532or> withValue4 = Attribute.customString("push_status").withValue(rfjVar.h() ? "enabled" : "disabled");
                            withValue4.getClass();
                            l18 l18Var = l18.b;
                            bdt I = hag.I(wst.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            UserProfileUpdate<? extends InterfaceC0532or> withValue5 = Attribute.customString("kids_tab").withValue(((Boolean) ((wst) qdcVar.C(I)).b(yxcVar.d()).f(pff.e)).booleanValue() ? "on" : "off");
                            withValue5.getClass();
                            UserProfile.Builder newBuilder = UserProfile.newBuilder();
                            newBuilder.apply(withValue);
                            newBuilder.apply(withValue2);
                            newBuilder.apply(withValue3);
                            newBuilder.apply(withValue4);
                            newBuilder.apply(withValue5);
                            AppMetrica.reportUserProfile(newBuilder.build());
                            Object a = istVar.a(fVar2, yxcVar, routineService, pfjVar, ezbVar, u0jVar, julVar, j7qVar, lgpVar2);
                            if (a != nm6Var) {
                                a = Unit.a;
                            }
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                fVar = (f) obj;
                if (fVar != null) {
                    av0 av0Var2 = (av0) this.c.getValue();
                    lgpVar2.j = fVar;
                    lgpVar2.k = 0;
                    lgpVar2.n = 2;
                    Object k = ((iv0) av0Var2).a.k(lgpVar2);
                    if (k != nm6Var) {
                        fVar2 = fVar;
                        obj = k;
                        i2 = 0;
                        yxcVar = (yxc) obj;
                        if (yxcVar != null) {
                        }
                    }
                    return nm6Var;
                }
                return Unit.a;
            }
        }
        lgpVar = new lgp(this, cg6Var);
        lgp lgpVar22 = lgpVar;
        Object obj2 = lgpVar22.l;
        nm6 nm6Var2 = nm6.a;
        i = lgpVar22.n;
        if (i != 0) {
        }
        fVar = (f) obj2;
        if (fVar != null) {
        }
        return Unit.a;
    }
}
