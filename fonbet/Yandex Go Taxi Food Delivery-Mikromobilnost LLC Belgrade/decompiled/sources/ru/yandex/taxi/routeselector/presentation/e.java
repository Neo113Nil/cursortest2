package ru.yandex.taxi.routeselector.presentation;

import defpackage.dal0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;

    public e(vpr vprVar, l lVar) {
        this.a = vprVar;
        this.b = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1 routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        SourceOnMapControl.a aVar;
        if (continuation instanceof RouteSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1) {
            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1 = (RouteSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = dal0.a[((AddressResolveRepository.State) obj).ordinal()];
                    l lVar = this.b;
                    vprVar = this.a;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            aVar = lVar.l;
                        } else if (i3 == 3 || i3 == 4) {
                            aVar = lVar.m;
                        } else {
                            if (i3 != 5) {
                                w511.b();
                                return null;
                            }
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$0 = null;
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$1 = null;
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$2 = null;
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$3 = null;
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$4 = vprVar;
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$5 = null;
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$6 = null;
                            routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label = 2;
                            obj2 = lVar.d(routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1);
                        }
                        obj2 = aVar;
                    } else {
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$0 = null;
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$1 = null;
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$2 = null;
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$3 = null;
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$4 = vprVar;
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$5 = null;
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$6 = null;
                        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label = 1;
                        obj2 = lVar.d(routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1);
                    }
                    return zy11.a;
                }
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$0 = null;
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$1 = null;
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$2 = null;
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$3 = null;
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$4 = null;
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$5 = null;
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$6 = null;
                routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label = 3;
            }
        }
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1 = new RouteSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$0 = null;
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$1 = null;
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$2 = null;
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$3 = null;
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$4 = null;
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$5 = null;
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.L$6 = null;
        routeSelectorPinV2StateRepository$defaultStateFlow$$inlined$map$1$2$1.label = 3;
    }
}
