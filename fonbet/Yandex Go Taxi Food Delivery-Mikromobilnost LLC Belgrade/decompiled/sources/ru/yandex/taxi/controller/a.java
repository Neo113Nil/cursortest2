package ru.yandex.taxi.controller;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import defpackage.a2d;
import defpackage.a5y0;
import defpackage.bvf0;
import defpackage.d8k0;
import defpackage.dvw;
import defpackage.egb1;
import defpackage.h3y;
import defpackage.hc00;
import defpackage.ic00;
import defpackage.j18;
import defpackage.jc00;
import defpackage.kc00;
import defpackage.ks70;
import defpackage.ls70;
import defpackage.m950;
import defpackage.ms70;
import defpackage.nlw;
import defpackage.ns70;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.q5z;
import defpackage.ra00;
import defpackage.tls;
import defpackage.u2w0;
import defpackage.uoe0;
import defpackage.w030;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.f;

/* loaded from: classes9.dex */
public final class a implements ru.yandex.taxi.controller.compat.a {
    public final Activity a;
    public final ra00 b;
    public final com.yandex.go.taxi.order.multi.domain.a c;
    public final yvf0 d;
    public final h3y e;
    public final yvf0 f;
    public final jc00 g;
    public final g h;
    public final ru.yandex.taxi.orders.b i;
    public final u2w0 j;
    public final w030 k;
    public final h3y l;
    public final f m;
    public final c n;

    public a(Activity activity, ra00 ra00Var, com.yandex.go.taxi.order.multi.domain.a aVar, yvf0 yvf0Var, h3y h3yVar, yvf0 yvf0Var2, jc00 jc00Var, g gVar, ru.yandex.taxi.orders.b bVar, u2w0 u2w0Var, w030 w030Var, h3y h3yVar2, f fVar, c cVar) {
        this.a = activity;
        this.b = ra00Var;
        this.c = aVar;
        this.d = yvf0Var;
        this.e = h3yVar;
        this.f = yvf0Var2;
        this.g = jc00Var;
        this.h = gVar;
        this.i = bVar;
        this.j = u2w0Var;
        this.k = w030Var;
        this.l = h3yVar2;
        this.m = fVar;
        this.n = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        StartNextControllerDelegateImpl$awaitTopContainerModalShown$1 startNextControllerDelegateImpl$awaitTopContainerModalShown$1;
        int i;
        w030 w030Var = aVar.k;
        if (continuationImpl instanceof StartNextControllerDelegateImpl$awaitTopContainerModalShown$1) {
            startNextControllerDelegateImpl$awaitTopContainerModalShown$1 = (StartNextControllerDelegateImpl$awaitTopContainerModalShown$1) continuationImpl;
            int i2 = startNextControllerDelegateImpl$awaitTopContainerModalShown$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startNextControllerDelegateImpl$awaitTopContainerModalShown$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startNextControllerDelegateImpl$awaitTopContainerModalShown$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startNextControllerDelegateImpl$awaitTopContainerModalShown$1.label;
                zy11 zy11Var = zy11.a;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                startNextControllerDelegateImpl$awaitTopContainerModalShown$1.label = 1;
                j18 j18Var = new j18(1, dvw.b(startNextControllerDelegateImpl$awaitTopContainerModalShown$1));
                j18Var.u();
                if (w030Var.e() != null) {
                    j18Var.q(zy11Var, a2d.A);
                } else {
                    j18Var.w(new d8k0(w030Var.g(new nlw(i3, j18Var)), 1));
                }
                return j18Var.s() == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        startNextControllerDelegateImpl$awaitTopContainerModalShown$1 = new StartNextControllerDelegateImpl$awaitTopContainerModalShown$1(aVar, continuationImpl);
        Object obj2 = startNextControllerDelegateImpl$awaitTopContainerModalShown$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startNextControllerDelegateImpl$awaitTopContainerModalShown$1.label;
        zy11 zy11Var2 = zy11.a;
        int i32 = 1;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ns70 ns70Var, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        StartNextControllerDelegateImpl$navigateIfNeed$1 startNextControllerDelegateImpl$navigateIfNeed$1;
        int i;
        com.yandex.go.preload.b bVar;
        if (continuationImpl instanceof StartNextControllerDelegateImpl$navigateIfNeed$1) {
            startNextControllerDelegateImpl$navigateIfNeed$1 = (StartNextControllerDelegateImpl$navigateIfNeed$1) continuationImpl;
            int i2 = startNextControllerDelegateImpl$navigateIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startNextControllerDelegateImpl$navigateIfNeed$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startNextControllerDelegateImpl$navigateIfNeed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startNextControllerDelegateImpl$navigateIfNeed$1.label;
                yvf0 yvf0Var = this.f;
                ra00 ra00Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ns70Var instanceof ms70)) {
                        if (!(ns70Var instanceof ks70) || o2y0Var == null) {
                            if (ns70Var instanceof ls70) {
                                com.yandex.go.preload.b bVar2 = (com.yandex.go.preload.b) this.d.get();
                                ra00Var.b(bVar2, new uoe0(null, false));
                                startNextControllerDelegateImpl$navigateIfNeed$1.L$0 = null;
                                startNextControllerDelegateImpl$navigateIfNeed$1.L$1 = null;
                                startNextControllerDelegateImpl$navigateIfNeed$1.L$2 = bVar2;
                                startNextControllerDelegateImpl$navigateIfNeed$1.label = 1;
                                if (((ru.yandex.taxi.multiorder.f) this.e.get()).a((ls70) ns70Var, startNextControllerDelegateImpl$navigateIfNeed$1) != coroutineSingletons) {
                                    bVar = bVar2;
                                    bVar.i();
                                }
                            } else {
                                ic00 ic00Var = ((kc00) this.g).a;
                                ic00Var.getClass();
                                if (!(ic00Var instanceof hc00)) {
                                    startNextControllerDelegateImpl$navigateIfNeed$1.L$0 = null;
                                    startNextControllerDelegateImpl$navigateIfNeed$1.L$1 = o2y0Var;
                                    startNextControllerDelegateImpl$navigateIfNeed$1.label = 2;
                                    obj = this.h.c(startNextControllerDelegateImpl$navigateIfNeed$1);
                                }
                                ra00Var.a();
                            }
                            return coroutineSingletons;
                        }
                        ra00Var.b((m950) yvf0Var.get(), new a5y0(DetailsOpenReason.ON_START.alias, o2y0Var, null, 28));
                    }
                } else if (i == 1) {
                    bVar = (com.yandex.go.preload.b) startNextControllerDelegateImpl$navigateIfNeed$1.L$2;
                    kotlin.b.b(obj);
                    bVar.i();
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o2y0Var = (o2y0) startNextControllerDelegateImpl$navigateIfNeed$1.L$1;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ra00Var.b((m950) yvf0Var.get(), new a5y0("back to main screen with active orders to show", o2y0Var, null, 28));
                    }
                    ra00Var.a();
                }
                return zy11.a;
            }
        }
        startNextControllerDelegateImpl$navigateIfNeed$1 = new StartNextControllerDelegateImpl$navigateIfNeed$1(this, continuationImpl);
        Object obj2 = startNextControllerDelegateImpl$navigateIfNeed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startNextControllerDelegateImpl$navigateIfNeed$1.label;
        yvf0 yvf0Var2 = this.f;
        ra00 ra00Var2 = this.b;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r8.invoke(r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(tls tlsVar, ContinuationImpl continuationImpl) {
        StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1 startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1;
        int i;
        boolean z;
        Intent intent;
        Uri data;
        if (continuationImpl instanceof StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1) {
            startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1 = (StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1) continuationImpl;
            int i2 = startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.label;
                zy11 zy11Var = zy11.a;
                z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.b.a();
                    startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.L$0 = null;
                    startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                intent = this.a.getIntent();
                f fVar = this.m;
                fVar.getClass();
                if (q5z.H(intent) || (!egb1.d(intent) && ((data = intent.getData()) == null || !fVar.c(data)))) {
                    z = false;
                }
                if (!z) {
                    StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2 startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2 = new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2(this, null);
                    startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.L$0 = null;
                    startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.Z$0 = z;
                    startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.label = 2;
                    if (bvf0.n(startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2, startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1) == obj2) {
                        return obj2;
                    }
                }
                return zy11Var;
            }
        }
        startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1 = new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1(this, continuationImpl);
        Object obj3 = startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$1.label;
        zy11 zy11Var2 = zy11.a;
        z = true;
        if (i != 0) {
        }
        intent = this.a.getIntent();
        f fVar2 = this.m;
        fVar2.getClass();
        if (q5z.H(intent)) {
        }
        z = false;
        if (!z) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(tls tlsVar, ContinuationImpl continuationImpl) {
        StartNextControllerDelegateImpl$startNextController$1 startNextControllerDelegateImpl$startNextController$1;
        int i;
        boolean booleanValue;
        tls tlsVar2;
        boolean z;
        ns70 ns70Var;
        o2y0 o2y0Var;
        boolean z2;
        tls tlsVar3;
        if (continuationImpl instanceof StartNextControllerDelegateImpl$startNextController$1) {
            startNextControllerDelegateImpl$startNextController$1 = (StartNextControllerDelegateImpl$startNextController$1) continuationImpl;
            int i2 = startNextControllerDelegateImpl$startNextController$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startNextControllerDelegateImpl$startNextController$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startNextControllerDelegateImpl$startNextController$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startNextControllerDelegateImpl$startNextController$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    startNextControllerDelegateImpl$startNextController$1.L$0 = tlsVar;
                    startNextControllerDelegateImpl$startNextController$1.label = 1;
                    obj = this.i.a(startNextControllerDelegateImpl$startNextController$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                z = startNextControllerDelegateImpl$startNextController$1.Z$0;
                                tlsVar2 = (tls) startNextControllerDelegateImpl$startNextController$1.L$0;
                                kotlin.b.b(obj);
                                Pair pair = (Pair) obj;
                                ns70Var = (ns70) pair.getFirst();
                                o2y0Var = (o2y0) pair.getSecond();
                                startNextControllerDelegateImpl$startNextController$1.L$0 = tlsVar2;
                                startNextControllerDelegateImpl$startNextController$1.L$1 = null;
                                startNextControllerDelegateImpl$startNextController$1.L$2 = null;
                                startNextControllerDelegateImpl$startNextController$1.Z$0 = z;
                                startNextControllerDelegateImpl$startNextController$1.label = 4;
                                if (c(ns70Var, o2y0Var, startNextControllerDelegateImpl$startNextController$1) != obj2) {
                                    z2 = z;
                                    tlsVar3 = tlsVar2;
                                    startNextControllerDelegateImpl$startNextController$1.L$0 = null;
                                    startNextControllerDelegateImpl$startNextController$1.L$1 = null;
                                    startNextControllerDelegateImpl$startNextController$1.L$2 = null;
                                    startNextControllerDelegateImpl$startNextController$1.Z$0 = z2;
                                    startNextControllerDelegateImpl$startNextController$1.label = 5;
                                    if (tlsVar3.invoke(startNextControllerDelegateImpl$startNextController$1) != obj2) {
                                    }
                                }
                            }
                            if (i == 4) {
                                z2 = startNextControllerDelegateImpl$startNextController$1.Z$0;
                                tlsVar3 = (tls) startNextControllerDelegateImpl$startNextController$1.L$0;
                                kotlin.b.b(obj);
                                startNextControllerDelegateImpl$startNextController$1.L$0 = null;
                                startNextControllerDelegateImpl$startNextController$1.L$1 = null;
                                startNextControllerDelegateImpl$startNextController$1.L$2 = null;
                                startNextControllerDelegateImpl$startNextController$1.Z$0 = z2;
                                startNextControllerDelegateImpl$startNextController$1.label = 5;
                                return tlsVar3.invoke(startNextControllerDelegateImpl$startNextController$1) != obj2 ? obj2 : zy11Var;
                            }
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    tlsVar = (tls) startNextControllerDelegateImpl$startNextController$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    startNextControllerDelegateImpl$startNextController$1.L$0 = tlsVar;
                    startNextControllerDelegateImpl$startNextController$1.Z$0 = booleanValue;
                    startNextControllerDelegateImpl$startNextController$1.label = 3;
                    Object a = this.c.a(startNextControllerDelegateImpl$startNextController$1);
                    if (a != obj2) {
                        tlsVar2 = tlsVar;
                        z = booleanValue;
                        obj = a;
                        Pair pair2 = (Pair) obj;
                        ns70Var = (ns70) pair2.getFirst();
                        o2y0Var = (o2y0) pair2.getSecond();
                        startNextControllerDelegateImpl$startNextController$1.L$0 = tlsVar2;
                        startNextControllerDelegateImpl$startNextController$1.L$1 = null;
                        startNextControllerDelegateImpl$startNextController$1.L$2 = null;
                        startNextControllerDelegateImpl$startNextController$1.Z$0 = z;
                        startNextControllerDelegateImpl$startNextController$1.label = 4;
                        if (c(ns70Var, o2y0Var, startNextControllerDelegateImpl$startNextController$1) != obj2) {
                        }
                    }
                } else {
                    this.l.get();
                    startNextControllerDelegateImpl$startNextController$1.L$0 = null;
                    startNextControllerDelegateImpl$startNextController$1.Z$0 = booleanValue;
                    startNextControllerDelegateImpl$startNextController$1.label = 2;
                    if (d(tlsVar, startNextControllerDelegateImpl$startNextController$1) == obj2) {
                    }
                }
            }
        }
        startNextControllerDelegateImpl$startNextController$1 = new StartNextControllerDelegateImpl$startNextController$1(this, continuationImpl);
        Object obj3 = startNextControllerDelegateImpl$startNextController$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startNextControllerDelegateImpl$startNextController$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        if (booleanValue) {
        }
    }
}
