package ru.yandex.taxi.routeselector.presentation;

import android.graphics.drawable.BitmapDrawable;
import defpackage.a0c0;
import defpackage.c0c0;
import defpackage.cal0;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.e0c0;
import defpackage.e1c0;
import defpackage.e800;
import defpackage.evu0;
import defpackage.f0c0;
import defpackage.f1c0;
import defpackage.fji;
import defpackage.lub0;
import defpackage.nj6;
import defpackage.ny61;
import defpackage.r0c0;
import defpackage.rwt;
import defpackage.tpr;
import defpackage.uwt;
import defpackage.uze0;
import defpackage.vn6;
import defpackage.vtb0;
import defpackage.wiq0;
import defpackage.x9l0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class l {
    public final x9l0 a;
    public final AddressResolveRepository b;
    public final f1c0 c;
    public final uze0 d;
    public final wiq0 e;
    public final e800 f;
    public final ru.yandex.taxi.delivery.pin.k g;
    public final vtb0 h;
    public final rwt i;
    public final nj6 j;
    public final ru.yandex.taxi.widget.utils.e k;
    public final SourceOnMapControl.a l;
    public final SourceOnMapControl.a m;
    public final SourceOnMapControl.a n;

    /* JADX WARN: Multi-variable type inference failed */
    public l(x9l0 x9l0Var, AddressResolveRepository addressResolveRepository, f1c0 f1c0Var, uze0 uze0Var, wiq0 wiq0Var, e800 e800Var, ru.yandex.taxi.delivery.pin.k kVar, vtb0 vtb0Var, rwt rwtVar, nj6 nj6Var, ru.yandex.taxi.widget.utils.e eVar, r0c0 r0c0Var) {
        this.a = x9l0Var;
        this.b = addressResolveRepository;
        this.c = f1c0Var;
        this.d = uze0Var;
        this.e = wiq0Var;
        this.f = e800Var;
        this.g = kVar;
        this.h = vtb0Var;
        this.i = rwtVar;
        this.j = nj6Var;
        this.k = eVar;
        String str = null;
        boolean z = false;
        this.l = new SourceOnMapControl.a(e0c0.a, null, str, false, z, null, null, 2046);
        this.m = new SourceOnMapControl.a(r0c0Var.d(), str, null, z, false, 0 == true ? 1 : 0, null, 2046);
        this.n = new SourceOnMapControl.a(x9l0Var.b() ? r0c0Var.h() : r0c0Var.b(), null, null, false, false, null, null, 2046);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, fji fjiVar, ContinuationImpl continuationImpl) {
        RouteSelectorPinV2StateRepository$createDeliveryState$1 routeSelectorPinV2StateRepository$createDeliveryState$1;
        int i;
        f0c0 f0c0Var;
        lVar.getClass();
        if (continuationImpl instanceof RouteSelectorPinV2StateRepository$createDeliveryState$1) {
            routeSelectorPinV2StateRepository$createDeliveryState$1 = (RouteSelectorPinV2StateRepository$createDeliveryState$1) continuationImpl;
            int i2 = routeSelectorPinV2StateRepository$createDeliveryState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$createDeliveryState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPinV2StateRepository$createDeliveryState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$createDeliveryState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routeSelectorPinV2StateRepository$createDeliveryState$1.L$0 = fjiVar;
                    routeSelectorPinV2StateRepository$createDeliveryState$1.label = 1;
                    obj = lVar.d(routeSelectorPinV2StateRepository$createDeliveryState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fjiVar = (fji) routeSelectorPinV2StateRepository$createDeliveryState$1.L$0;
                    kotlin.b.b(obj);
                }
                SourceOnMapControl.a aVar = (SourceOnMapControl.a) obj;
                f0c0Var = fjiVar.a;
                if (f0c0Var == null) {
                    f0c0Var = aVar.a;
                }
                return SourceOnMapControl.a.a(aVar, f0c0Var, fjiVar.c, fjiVar.b, fjiVar.d, null, fjiVar.e, false, null, 1968);
            }
        }
        routeSelectorPinV2StateRepository$createDeliveryState$1 = new RouteSelectorPinV2StateRepository$createDeliveryState$1(lVar, continuationImpl);
        Object obj3 = routeSelectorPinV2StateRepository$createDeliveryState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$createDeliveryState$1.label;
        if (i != 0) {
        }
        SourceOnMapControl.a aVar2 = (SourceOnMapControl.a) obj3;
        f0c0Var = fjiVar.a;
        if (f0c0Var == null) {
        }
        return SourceOnMapControl.a.a(aVar2, f0c0Var, fjiVar.c, fjiVar.b, fjiVar.d, null, fjiVar.e, false, null, 1968);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l lVar, uwt uwtVar, ContinuationImpl continuationImpl) {
        RouteSelectorPinV2StateRepository$createGpsDiscoBubbleState$1 routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1;
        int i;
        lVar.getClass();
        if (continuationImpl instanceof RouteSelectorPinV2StateRepository$createGpsDiscoBubbleState$1) {
            routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1 = (RouteSelectorPinV2StateRepository$createGpsDiscoBubbleState$1) continuationImpl;
            int i2 = routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.L$0 = uwtVar;
                    routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.label = 1;
                    obj = lVar.d(routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uwtVar = (uwt) routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.L$0;
                    kotlin.b.b(obj);
                }
                return vn6.a((SourceOnMapControl.a) obj, uwtVar.a, uwtVar.b, uwtVar.c, uwtVar.d, uwtVar.e);
            }
        }
        routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1 = new RouteSelectorPinV2StateRepository$createGpsDiscoBubbleState$1(lVar, continuationImpl);
        Object obj3 = routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$createGpsDiscoBubbleState$1.label;
        if (i != 0) {
        }
        return vn6.a((SourceOnMapControl.a) obj3, uwtVar.a, uwtVar.b, uwtVar.c, uwtVar.d, uwtVar.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(l lVar, e1c0 e1c0Var, ContinuationImpl continuationImpl) {
        RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$1 routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1;
        int i;
        tpr tprVar;
        tpr t;
        e1c0 e1c0Var2;
        tpr tprVar2;
        tpr tprVar3;
        tpr tprVar4;
        tpr tprVar5;
        vtb0 vtb0Var;
        x9l0 x9l0Var = lVar.a;
        AddressResolveRepository addressResolveRepository = lVar.b;
        if (continuationImpl instanceof RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$1) {
            routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1 = (RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$1) continuationImpl;
            int i2 = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tprVar = addressResolveRepository.a;
                    t = kotlinx.coroutines.flow.e.t(new i(((com.yandex.go.taxi.tariffs.internal.repository.k) lVar.d).j.a()));
                    SourcePicker sourcePicker = x9l0Var.a;
                    sourcePicker.getClass();
                    SourcePicker sourcePicker2 = SourcePicker.SHORTCUT_REQUESTED_FROM_HOME;
                    boolean z = sourcePicker == sourcePicker2 || sourcePicker == SourcePicker.A_FROM_HOME || sourcePicker == SourcePicker.B_FROM_HOME;
                    wiq0 wiq0Var = lVar.e;
                    tpr t2 = kotlinx.coroutines.flow.e.t(new k(z ? ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).f() : ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b()));
                    ru.yandex.taxi.delivery.pin.k kVar = lVar.g;
                    SourcePicker sourcePicker3 = x9l0Var.a;
                    sourcePicker3.getClass();
                    tpr t3 = kotlinx.coroutines.flow.e.t(new ru.yandex.taxi.delivery.pin.d(kVar.e(sourcePicker3 == sourcePicker2 || sourcePicker3 == SourcePicker.A_FROM_HOME || sourcePicker3 == SourcePicker.B_FROM_HOME), kVar));
                    tpr c = ((com.yandex.go.summary.branding_pin.i) lVar.j).c();
                    vtb0 vtb0Var2 = lVar.h;
                    r0 r0Var = addressResolveRepository.a;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$0 = e1c0Var;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$1 = tprVar;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$2 = t;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$3 = t2;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$4 = t3;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$5 = c;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$6 = vtb0Var2;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$7 = r0Var;
                    routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.label = 1;
                    Object d = lVar.d(routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1);
                    if (d == obj2) {
                        return obj2;
                    }
                    e1c0Var2 = e1c0Var;
                    tprVar2 = r0Var;
                    tprVar3 = c;
                    tprVar4 = t2;
                    obj = d;
                    tprVar5 = t3;
                    vtb0Var = vtb0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tprVar2 = (tpr) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$7;
                    vtb0Var = (vtb0) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$6;
                    tprVar3 = (tpr) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$5;
                    tprVar5 = (tpr) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$4;
                    tprVar4 = (tpr) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$3;
                    t = (tpr) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$2;
                    tprVar = (tpr) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$1;
                    e1c0Var2 = (e1c0) routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                return new g(new tpr[]{tprVar, t, tprVar4, tprVar5, tprVar3, ((ru.yandex.taxi.f) vtb0Var).a(tprVar2, (SourceOnMapControl.a) obj), com.yandex.go.coroutines.b.d(lVar.i.a, new RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$start$1(2, null))}, lVar, e1c0Var2);
            }
        }
        routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1 = new RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$1(lVar, continuationImpl);
        Object obj3 = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$stateFullInfoInnerFlow$1.label;
        if (i != 0) {
        }
        return new g(new tpr[]{tprVar, t, tprVar4, tprVar5, tprVar3, ((ru.yandex.taxi.f) vtb0Var).a(tprVar2, (SourceOnMapControl.a) obj3), com.yandex.go.coroutines.b.d(lVar.i.a, new RouteSelectorPinV2StateRepository$stateFullInfoInnerFlow$$inlined$start$1(2, null))}, lVar, e1c0Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        RouteSelectorPinV2StateRepository$defaultState$1 routeSelectorPinV2StateRepository$defaultState$1;
        int i;
        if (continuationImpl instanceof RouteSelectorPinV2StateRepository$defaultState$1) {
            routeSelectorPinV2StateRepository$defaultState$1 = (RouteSelectorPinV2StateRepository$defaultState$1) continuationImpl;
            int i2 = routeSelectorPinV2StateRepository$defaultState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$defaultState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPinV2StateRepository$defaultState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$defaultState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean b = this.a.b();
                    e800 e800Var = this.f;
                    if (b) {
                        routeSelectorPinV2StateRepository$defaultState$1.label = 2;
                        obj = ((com.yandex.go.pin.repository.b) e800Var).b(routeSelectorPinV2StateRepository$defaultState$1);
                    } else {
                        routeSelectorPinV2StateRepository$defaultState$1.label = 1;
                        obj = ((com.yandex.go.pin.repository.b) e800Var).a(routeSelectorPinV2StateRepository$defaultState$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    SourceOnMapControl.a aVar = (SourceOnMapControl.a) obj;
                    if (aVar != null) {
                        return aVar;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    SourceOnMapControl.a aVar2 = (SourceOnMapControl.a) obj;
                    if (aVar2 != null) {
                        return aVar2;
                    }
                }
                return this.n;
            }
        }
        routeSelectorPinV2StateRepository$defaultState$1 = new RouteSelectorPinV2StateRepository$defaultState$1(this, continuationImpl);
        Object obj2 = routeSelectorPinV2StateRepository$defaultState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$defaultState$1.label;
        if (i != 0) {
        }
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cal0 cal0Var, e1c0 e1c0Var, ContinuationImpl continuationImpl) {
        RouteSelectorPinV2StateRepository$destinationState$1 routeSelectorPinV2StateRepository$destinationState$1;
        int i;
        String str;
        String str2;
        if (continuationImpl instanceof RouteSelectorPinV2StateRepository$destinationState$1) {
            routeSelectorPinV2StateRepository$destinationState$1 = (RouteSelectorPinV2StateRepository$destinationState$1) continuationImpl;
            int i2 = routeSelectorPinV2StateRepository$destinationState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$destinationState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPinV2StateRepository$destinationState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$destinationState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = cal0Var.c;
                    String str4 = cal0Var.b;
                    if (str3 == null || str3.length() == 0 || str4 == null || str4.length() == 0) {
                        routeSelectorPinV2StateRepository$destinationState$1.L$0 = null;
                        routeSelectorPinV2StateRepository$destinationState$1.L$1 = null;
                        routeSelectorPinV2StateRepository$destinationState$1.L$2 = null;
                        routeSelectorPinV2StateRepository$destinationState$1.L$3 = null;
                        routeSelectorPinV2StateRepository$destinationState$1.label = 1;
                        Object d = d(routeSelectorPinV2StateRepository$destinationState$1);
                        if (d != obj2) {
                            return d;
                        }
                    } else {
                        routeSelectorPinV2StateRepository$destinationState$1.L$0 = null;
                        routeSelectorPinV2StateRepository$destinationState$1.L$1 = e1c0Var;
                        routeSelectorPinV2StateRepository$destinationState$1.L$2 = str3;
                        routeSelectorPinV2StateRepository$destinationState$1.L$3 = str4;
                        routeSelectorPinV2StateRepository$destinationState$1.label = 2;
                        Object d2 = d(routeSelectorPinV2StateRepository$destinationState$1);
                        if (d2 != obj2) {
                            str = str3;
                            obj = d2;
                            str2 = str4;
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) routeSelectorPinV2StateRepository$destinationState$1.L$3;
                String str5 = (String) routeSelectorPinV2StateRepository$destinationState$1.L$2;
                e1c0Var = (e1c0) routeSelectorPinV2StateRepository$destinationState$1.L$1;
                kotlin.b.b(obj);
                str = str5;
                return SourceOnMapControl.a.a((SourceOnMapControl.a) obj, null, cvu0.v(d6z.Y(e1c0Var, e1c0Var.e), "$TIME$", str2, false), str, false, null, false, false, null, 2041);
            }
        }
        routeSelectorPinV2StateRepository$destinationState$1 = new RouteSelectorPinV2StateRepository$destinationState$1(this, continuationImpl);
        Object obj3 = routeSelectorPinV2StateRepository$destinationState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$destinationState$1.label;
        if (i != 0) {
        }
        return SourceOnMapControl.a.a((SourceOnMapControl.a) obj3, null, cvu0.v(d6z.Y(e1c0Var, e1c0Var.e), "$TIME$", str2, false), str, false, null, false, false, null, 2041);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cal0 cal0Var, e1c0 e1c0Var, lub0 lub0Var, ContinuationImpl continuationImpl) {
        RouteSelectorPinV2StateRepository$sourceState$1 routeSelectorPinV2StateRepository$sourceState$1;
        int i;
        f0c0 a0c0Var;
        f0c0 f0c0Var;
        String str;
        if (continuationImpl instanceof RouteSelectorPinV2StateRepository$sourceState$1) {
            routeSelectorPinV2StateRepository$sourceState$1 = (RouteSelectorPinV2StateRepository$sourceState$1) continuationImpl;
            int i2 = routeSelectorPinV2StateRepository$sourceState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$sourceState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPinV2StateRepository$sourceState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$sourceState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = lub0Var.a;
                    if (str2 == null || evu0.J(str2)) {
                        Integer num = new Integer(cal0Var.a);
                        a0c0Var = num.intValue() <= 0 ? a0c0.c : new a0c0(String.valueOf(num.intValue()), num);
                        f0c0Var = a0c0Var;
                        str = cal0Var.c;
                        if (str != null || str.length() == 0) {
                            return new SourceOnMapControl.a(f0c0Var, null, null, false, false, null, null, 2046);
                        }
                        String Y = d6z.Y(e1c0Var, e1c0Var.f);
                        if (Y.length() == 0) {
                            Y = d6z.Y(e1c0Var, e1c0Var.d);
                        }
                        return new SourceOnMapControl.a(f0c0Var, Y, str, false, false, null, null, 2040);
                    }
                    String str3 = lub0Var.a;
                    routeSelectorPinV2StateRepository$sourceState$1.L$0 = cal0Var;
                    routeSelectorPinV2StateRepository$sourceState$1.L$1 = e1c0Var;
                    routeSelectorPinV2StateRepository$sourceState$1.L$2 = null;
                    routeSelectorPinV2StateRepository$sourceState$1.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.f(this.k, str3, null, routeSelectorPinV2StateRepository$sourceState$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e1c0Var = (e1c0) routeSelectorPinV2StateRepository$sourceState$1.L$1;
                    cal0Var = (cal0) routeSelectorPinV2StateRepository$sourceState$1.L$0;
                    kotlin.b.b(obj);
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                a0c0Var = bitmapDrawable == null ? new c0c0(bitmapDrawable) : this.n.a;
                f0c0Var = a0c0Var;
                str = cal0Var.c;
                if (str != null) {
                }
                return new SourceOnMapControl.a(f0c0Var, null, null, false, false, null, null, 2046);
            }
        }
        routeSelectorPinV2StateRepository$sourceState$1 = new RouteSelectorPinV2StateRepository$sourceState$1(this, continuationImpl);
        Object obj2 = routeSelectorPinV2StateRepository$sourceState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$sourceState$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
        if (bitmapDrawable2 == null) {
        }
        f0c0Var = a0c0Var;
        str = cal0Var.c;
        if (str != null) {
        }
        return new SourceOnMapControl.a(f0c0Var, null, null, false, false, null, null, 2046);
    }
}
