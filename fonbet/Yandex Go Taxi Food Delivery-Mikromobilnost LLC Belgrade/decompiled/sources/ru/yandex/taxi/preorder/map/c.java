package ru.yandex.taxi.preorder.map;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.b0c0;
import defpackage.bl00;
import defpackage.boj0;
import defpackage.c0c0;
import defpackage.d0c0;
import defpackage.e6l0;
import defpackage.f0c0;
import defpackage.fji;
import defpackage.g0c0;
import defpackage.gk00;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.qj6;
import defpackage.rj6;
import defpackage.s8o;
import defpackage.sq00;
import defpackage.t3l0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class c {
    public final Context a;
    public final com.yandex.go.pin.api.widget.b b;
    public final ru.yandex.taxi.preorder.map.interactor.b c;
    public final boj0 d;

    public c(Context context, com.yandex.go.pin.api.widget.b bVar, ru.yandex.taxi.preorder.map.interactor.b bVar2, boj0 boj0Var) {
        this.a = context;
        this.b = bVar;
        this.c = bVar2;
        this.d = boj0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qj6 qj6Var, e6l0 e6l0Var, ContinuationImpl continuationImpl) {
        RouteOverlayIconFactory$createBrandingDestinationIcon$1 routeOverlayIconFactory$createBrandingDestinationIcon$1;
        int i;
        if (continuationImpl instanceof RouteOverlayIconFactory$createBrandingDestinationIcon$1) {
            routeOverlayIconFactory$createBrandingDestinationIcon$1 = (RouteOverlayIconFactory$createBrandingDestinationIcon$1) continuationImpl;
            int i2 = routeOverlayIconFactory$createBrandingDestinationIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconFactory$createBrandingDestinationIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconFactory$createBrandingDestinationIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconFactory$createBrandingDestinationIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routeOverlayIconFactory$createBrandingDestinationIcon$1.L$0 = null;
                    routeOverlayIconFactory$createBrandingDestinationIcon$1.L$1 = null;
                    routeOverlayIconFactory$createBrandingDestinationIcon$1.label = 1;
                    obj = this.c.a(qj6Var, e6l0Var, routeOverlayIconFactory$createBrandingDestinationIcon$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new t3l0((bl00) obj, null, false, null, 14);
                    }
                    kotlin.b.b(obj);
                }
                routeOverlayIconFactory$createBrandingDestinationIcon$1.L$0 = null;
                routeOverlayIconFactory$createBrandingDestinationIcon$1.L$1 = null;
                routeOverlayIconFactory$createBrandingDestinationIcon$1.L$2 = null;
                routeOverlayIconFactory$createBrandingDestinationIcon$1.label = 2;
                obj = this.b.e((sq00) obj, routeOverlayIconFactory$createBrandingDestinationIcon$1);
            }
        }
        routeOverlayIconFactory$createBrandingDestinationIcon$1 = new RouteOverlayIconFactory$createBrandingDestinationIcon$1(this, continuationImpl);
        Object obj2 = routeOverlayIconFactory$createBrandingDestinationIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconFactory$createBrandingDestinationIcon$1.label;
        if (i != 0) {
        }
        routeOverlayIconFactory$createBrandingDestinationIcon$1.L$0 = null;
        routeOverlayIconFactory$createBrandingDestinationIcon$1.L$1 = null;
        routeOverlayIconFactory$createBrandingDestinationIcon$1.L$2 = null;
        routeOverlayIconFactory$createBrandingDestinationIcon$1.label = 2;
        obj2 = this.b.e((sq00) obj2, routeOverlayIconFactory$createBrandingDestinationIcon$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fji fjiVar, e6l0 e6l0Var, ContinuationImpl continuationImpl) {
        RouteOverlayIconFactory$createDeliveryDestinationIcon$1 routeOverlayIconFactory$createDeliveryDestinationIcon$1;
        int i;
        if (continuationImpl instanceof RouteOverlayIconFactory$createDeliveryDestinationIcon$1) {
            routeOverlayIconFactory$createDeliveryDestinationIcon$1 = (RouteOverlayIconFactory$createDeliveryDestinationIcon$1) continuationImpl;
            int i2 = routeOverlayIconFactory$createDeliveryDestinationIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconFactory$createDeliveryDestinationIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconFactory$createDeliveryDestinationIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconFactory$createDeliveryDestinationIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sq00 sq00Var = new sq00(e6l0Var.a, fjiVar.a, true, null, e6l0Var.b, fjiVar.b, fjiVar.c, fjiVar.d, fjiVar.e, null, null, 0.0f, 7680);
                    routeOverlayIconFactory$createDeliveryDestinationIcon$1.L$0 = null;
                    routeOverlayIconFactory$createDeliveryDestinationIcon$1.L$1 = null;
                    routeOverlayIconFactory$createDeliveryDestinationIcon$1.label = 1;
                    obj = this.b.e(sq00Var, routeOverlayIconFactory$createDeliveryDestinationIcon$1);
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
                return new t3l0((bl00) obj, null, false, null, 14);
            }
        }
        routeOverlayIconFactory$createDeliveryDestinationIcon$1 = new RouteOverlayIconFactory$createDeliveryDestinationIcon$1(this, continuationImpl);
        Object obj2 = routeOverlayIconFactory$createDeliveryDestinationIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconFactory$createDeliveryDestinationIcon$1.label;
        if (i != 0) {
        }
        return new t3l0((bl00) obj2, null, false, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(fji fjiVar, e6l0 e6l0Var, ContinuationImpl continuationImpl) {
        RouteOverlayIconFactory$createDeliverySourceIcon$1 routeOverlayIconFactory$createDeliverySourceIcon$1;
        int i;
        if (continuationImpl instanceof RouteOverlayIconFactory$createDeliverySourceIcon$1) {
            routeOverlayIconFactory$createDeliverySourceIcon$1 = (RouteOverlayIconFactory$createDeliverySourceIcon$1) continuationImpl;
            int i2 = routeOverlayIconFactory$createDeliverySourceIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconFactory$createDeliverySourceIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconFactory$createDeliverySourceIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconFactory$createDeliverySourceIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sq00 sq00Var = new sq00(e6l0Var.a, fjiVar.a, true, null, e6l0Var.b, fjiVar.b, fjiVar.c, fjiVar.d, fjiVar.e, null, null, 0.0f, 7680);
                    routeOverlayIconFactory$createDeliverySourceIcon$1.L$0 = null;
                    routeOverlayIconFactory$createDeliverySourceIcon$1.L$1 = null;
                    routeOverlayIconFactory$createDeliverySourceIcon$1.label = 1;
                    obj = this.b.h(sq00Var, routeOverlayIconFactory$createDeliverySourceIcon$1);
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
                return new t3l0((bl00) obj, null, false, null, 14);
            }
        }
        routeOverlayIconFactory$createDeliverySourceIcon$1 = new RouteOverlayIconFactory$createDeliverySourceIcon$1(this, continuationImpl);
        Object obj2 = routeOverlayIconFactory$createDeliverySourceIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconFactory$createDeliverySourceIcon$1.label;
        if (i != 0) {
        }
        return new t3l0((bl00) obj2, null, false, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Integer num, String str, String str2, rj6 rj6Var, e6l0 e6l0Var, ContinuationImpl continuationImpl) {
        RouteOverlayIconFactory$createEtaIcon$1 routeOverlayIconFactory$createEtaIcon$1;
        int i;
        if (continuationImpl instanceof RouteOverlayIconFactory$createEtaIcon$1) {
            routeOverlayIconFactory$createEtaIcon$1 = (RouteOverlayIconFactory$createEtaIcon$1) continuationImpl;
            int i2 = routeOverlayIconFactory$createEtaIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconFactory$createEtaIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconFactory$createEtaIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconFactory$createEtaIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sq00 sq00Var = new sq00(e6l0Var.a, null, true, num, e6l0Var.b, str, str2, rj6Var.c, rj6Var.d, null, null, 0.0f, 7682);
                    routeOverlayIconFactory$createEtaIcon$1.L$0 = null;
                    routeOverlayIconFactory$createEtaIcon$1.L$1 = null;
                    routeOverlayIconFactory$createEtaIcon$1.L$2 = null;
                    routeOverlayIconFactory$createEtaIcon$1.L$3 = null;
                    routeOverlayIconFactory$createEtaIcon$1.L$4 = null;
                    routeOverlayIconFactory$createEtaIcon$1.label = 1;
                    obj = this.b.h(sq00Var, routeOverlayIconFactory$createEtaIcon$1);
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
                return new t3l0((bl00) obj, null, false, null, 14);
            }
        }
        routeOverlayIconFactory$createEtaIcon$1 = new RouteOverlayIconFactory$createEtaIcon$1(this, continuationImpl);
        Object obj2 = routeOverlayIconFactory$createEtaIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconFactory$createEtaIcon$1.label;
        if (i != 0) {
        }
        return new t3l0((bl00) obj2, null, false, null, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(e6l0 e6l0Var, ContinuationImpl continuationImpl) {
        RouteOverlayIconFactory$createLoadingIcon$1 routeOverlayIconFactory$createLoadingIcon$1;
        int i;
        if (continuationImpl instanceof RouteOverlayIconFactory$createLoadingIcon$1) {
            routeOverlayIconFactory$createLoadingIcon$1 = (RouteOverlayIconFactory$createLoadingIcon$1) continuationImpl;
            int i2 = routeOverlayIconFactory$createLoadingIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconFactory$createLoadingIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconFactory$createLoadingIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconFactory$createLoadingIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p0c0 p0c0Var = e6l0Var.a;
                    routeOverlayIconFactory$createLoadingIcon$1.L$0 = null;
                    routeOverlayIconFactory$createLoadingIcon$1.label = 1;
                    obj = this.b.f(p0c0Var, routeOverlayIconFactory$createLoadingIcon$1);
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
                return new t3l0(null, (gk00) obj, false, null, 13);
            }
        }
        routeOverlayIconFactory$createLoadingIcon$1 = new RouteOverlayIconFactory$createLoadingIcon$1(this, continuationImpl);
        Object obj2 = routeOverlayIconFactory$createLoadingIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconFactory$createLoadingIcon$1.label;
        if (i != 0) {
        }
        return new t3l0(null, (gk00) obj2, false, null, 13);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Integer num, g0c0 g0c0Var, e6l0 e6l0Var, boolean z, ContinuationImpl continuationImpl) {
        RouteOverlayIconFactory$createRouteIconFromConfig$1 routeOverlayIconFactory$createRouteIconFromConfig$1;
        int i;
        f0c0 f0c0Var;
        g0c0 g0c0Var2;
        d0c0 d0c0Var;
        bl00 bl00Var;
        if (continuationImpl instanceof RouteOverlayIconFactory$createRouteIconFromConfig$1) {
            routeOverlayIconFactory$createRouteIconFromConfig$1 = (RouteOverlayIconFactory$createRouteIconFromConfig$1) continuationImpl;
            int i2 = routeOverlayIconFactory$createRouteIconFromConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeOverlayIconFactory$createRouteIconFromConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeOverlayIconFactory$createRouteIconFromConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeOverlayIconFactory$createRouteIconFromConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    BitmapDrawable bitmapDrawable = (g0c0Var == null || (d0c0Var = g0c0Var.f) == null) ? null : d0c0Var.a;
                    if ((g0c0Var != null ? g0c0Var.f : null) == null || bitmapDrawable == null) {
                        f0c0Var = null;
                    } else {
                        d0c0 d0c0Var2 = g0c0Var.f;
                        kdc kdcVar = d0c0Var2 != null ? d0c0Var2.b : null;
                        kdc kdcVar2 = d0c0Var2 != null ? d0c0Var2.c : null;
                        if (kdcVar == null || kdcVar2 == null) {
                            f0c0Var = new c0c0(bitmapDrawable);
                        } else {
                            Drawable mutate = bitmapDrawable.mutate();
                            Context context = this.a;
                            mutate.setTint(s8o.m(kdcVar2, context));
                            f0c0Var = new b0c0(bitmapDrawable, s8o.m(kdcVar, context));
                        }
                    }
                    p0c0 p0c0Var = e6l0Var.a;
                    String str = g0c0Var != null ? g0c0Var.b : null;
                    String str2 = str == null ? "" : str;
                    String str3 = g0c0Var != null ? g0c0Var.a : null;
                    sq00 sq00Var = new sq00(p0c0Var, null, true, num, null, str2, str3 == null ? "" : str3, g0c0Var != null ? g0c0Var.d : false, g0c0Var != null ? g0c0Var.e : false, null, null, 0.0f, 7698);
                    sq00 a = f0c0Var != null ? sq00.a(sq00Var, null, f0c0Var, null, 8189) : sq00.a(sq00Var, null, null, e6l0Var.b, 8175);
                    com.yandex.go.pin.api.widget.b bVar = this.b;
                    if (z) {
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$0 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$1 = g0c0Var;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$2 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$3 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$4 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$5 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.Z$0 = z;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.label = 1;
                        obj = bVar.h(a, routeOverlayIconFactory$createRouteIconFromConfig$1);
                        if (obj != coroutineSingletons) {
                            g0c0Var2 = g0c0Var;
                            bl00Var = (bl00) obj;
                        }
                    } else {
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$0 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$1 = g0c0Var;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$2 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$3 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$4 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.L$5 = null;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.Z$0 = z;
                        routeOverlayIconFactory$createRouteIconFromConfig$1.label = 2;
                        obj = bVar.e(a, routeOverlayIconFactory$createRouteIconFromConfig$1);
                        if (obj != coroutineSingletons) {
                            g0c0Var2 = g0c0Var;
                            bl00Var = (bl00) obj;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    g0c0Var2 = (g0c0) routeOverlayIconFactory$createRouteIconFromConfig$1.L$1;
                    kotlin.b.b(obj);
                    bl00Var = (bl00) obj;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g0c0Var2 = (g0c0) routeOverlayIconFactory$createRouteIconFromConfig$1.L$1;
                    kotlin.b.b(obj);
                    bl00Var = (bl00) obj;
                }
                return new t3l0(bl00Var, null, g0c0Var2 != null, null, 10);
            }
        }
        routeOverlayIconFactory$createRouteIconFromConfig$1 = new RouteOverlayIconFactory$createRouteIconFromConfig$1(this, continuationImpl);
        Object obj2 = routeOverlayIconFactory$createRouteIconFromConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeOverlayIconFactory$createRouteIconFromConfig$1.label;
        if (i != 0) {
        }
        return new t3l0(bl00Var, null, g0c0Var2 != null, null, 10);
    }
}
