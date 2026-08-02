package ru.yandex.taxi.address.map;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wes0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SimpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1 simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1;
        int i;
        SourceOnMapControl.a aVar;
        if (continuation instanceof SimpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1) {
            simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1 = (SimpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = wes0.a[((AddressResolveRepository.State) obj).ordinal()];
                    f fVar = this.b;
                    if (i3 == 1 || i3 == 2) {
                        aVar = fVar.e;
                    } else if (i3 == 3) {
                        aVar = fVar.f;
                    } else {
                        if (i3 != 4 && i3 != 5) {
                            w511.b();
                            return null;
                        }
                        aVar = fVar.g;
                    }
                    simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(aVar, simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1 = new SimpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simpleSelectorPinV2DataRepository$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
