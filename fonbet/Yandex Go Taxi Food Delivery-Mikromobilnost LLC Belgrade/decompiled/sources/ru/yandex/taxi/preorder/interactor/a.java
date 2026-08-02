package ru.yandex.taxi.preorder.interactor;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public a(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r9.emit(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MakeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1 makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        vpr vprVar2;
        Object obj2;
        if (continuation instanceof MakeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1) {
            makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1 = (MakeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1) continuation;
            int i2 = makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Address h = ((d0l0) obj).h();
                    GeoPointAcquisitionType geoPointAcquisitionType = h != null ? h.getGeoPointAcquisitionType() : null;
                    vprVar = this.a;
                    if (geoPointAcquisitionType == null || geoPointAcquisitionType == GeoPointAcquisitionType.USER_LOCATION) {
                        ru.yandex.taxi.e eVar = this.b.e;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$0 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$1 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$2 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$3 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$4 = vprVar;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$5 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$6 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$7 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$8 = null;
                        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label = 1;
                        Object i3 = eVar.i(makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1);
                        if (i3 != coroutineSingletons) {
                            obj3 = i3;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    obj2 = Boolean.FALSE;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$0 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$1 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$2 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$3 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$4 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$5 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$6 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$7 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$8 = null;
                    makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                }
                Object obj4 = obj3;
                vprVar = vprVar2;
                obj2 = obj4;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$0 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$1 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$2 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$3 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$4 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$5 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$6 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$7 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$8 = null;
                makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label = 2;
            }
        }
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1 = new MakeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1(this, continuation);
        Object obj32 = makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Object obj42 = obj32;
        vprVar = vprVar2;
        obj2 = obj42;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$0 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$1 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$2 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$3 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$4 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$5 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$6 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$7 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.L$8 = null;
        makeAccurateSourcePointInteractor$needToMakeAccurateSourcePoint$$inlined$map$1$2$1.label = 2;
    }
}
