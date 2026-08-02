package ru.yandex.taxi.search.repository;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a0c0;
import defpackage.b1c0;
import defpackage.d6z;
import defpackage.e0c0;
import defpackage.e1c0;
import defpackage.f0c0;
import defpackage.f1c0;
import defpackage.g92;
import defpackage.ny61;
import defpackage.q41;
import defpackage.r0c0;
import defpackage.tpr;
import defpackage.uze0;
import defpackage.vtb0;
import defpackage.wiq0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.f;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes6.dex */
public final class e extends b1c0 {
    public final wiq0 a;
    public final f1c0 b;
    public final uze0 c;
    public final AddressResolveRepository d;
    public final vtb0 e;
    public final SourceOnMapControl.a f;
    public final SourceOnMapControl.a g;
    public final SourceOnMapControl.a h;
    public final g92 i;

    public e(PointType pointType, r0c0 r0c0Var, wiq0 wiq0Var, f1c0 f1c0Var, uze0 uze0Var, AddressResolveRepository addressResolveRepository, vtb0 vtb0Var) {
        this.a = wiq0Var;
        this.b = f1c0Var;
        this.c = uze0Var;
        this.d = addressResolveRepository;
        this.e = vtb0Var;
        this.f = new SourceOnMapControl.a(pointType.a() ? r0c0Var.h() : r0c0Var.b(), null, null, false, false, null, null, 2046);
        this.g = new SourceOnMapControl.a(e0c0.a, null, null, false, false, null, null, 2046);
        this.h = new SourceOnMapControl.a(r0c0Var.d(), null, null, false, false, null, null, 2046);
        this.i = new g92(2, pointType.a() ? r0c0Var.i() : r0c0Var.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(e eVar, q41 q41Var, boolean z, ContinuationImpl continuationImpl) {
        AddressPickerPinV2DataRepository$createLoadedState$1 addressPickerPinV2DataRepository$createLoadedState$1;
        int i;
        String str;
        f0c0 f0c0Var;
        eVar.getClass();
        if (continuationImpl instanceof AddressPickerPinV2DataRepository$createLoadedState$1) {
            addressPickerPinV2DataRepository$createLoadedState$1 = (AddressPickerPinV2DataRepository$createLoadedState$1) continuationImpl;
            int i2 = addressPickerPinV2DataRepository$createLoadedState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressPickerPinV2DataRepository$createLoadedState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressPickerPinV2DataRepository$createLoadedState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressPickerPinV2DataRepository$createLoadedState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        return eVar.g;
                    }
                    Integer num = new Integer(q41Var.a);
                    a0c0 a0c0Var = num.intValue() <= 0 ? a0c0.c : new a0c0(String.valueOf(num.intValue()), num);
                    String str2 = q41Var.b;
                    f1c0 f1c0Var = eVar.b;
                    addressPickerPinV2DataRepository$createLoadedState$1.L$0 = null;
                    addressPickerPinV2DataRepository$createLoadedState$1.L$1 = a0c0Var;
                    addressPickerPinV2DataRepository$createLoadedState$1.L$2 = str2;
                    addressPickerPinV2DataRepository$createLoadedState$1.Z$0 = z;
                    addressPickerPinV2DataRepository$createLoadedState$1.label = 1;
                    Object a = f1c0Var.a(addressPickerPinV2DataRepository$createLoadedState$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                    f0c0Var = a0c0Var;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) addressPickerPinV2DataRepository$createLoadedState$1.L$2;
                    f0c0Var = (f0c0) addressPickerPinV2DataRepository$createLoadedState$1.L$1;
                    kotlin.b.b(obj);
                    str = str3;
                }
                e1c0 e1c0Var = (e1c0) obj;
                if (str != null || str.length() == 0) {
                    return new SourceOnMapControl.a(f0c0Var, null, null, false, false, null, null, 2046);
                }
                String Y = d6z.Y(e1c0Var, e1c0Var.f);
                if (Y.length() == 0) {
                    Y = d6z.Y(e1c0Var, e1c0Var.d);
                }
                return new SourceOnMapControl.a(f0c0Var, Y, str, false, false, null, null, 2040);
            }
        }
        addressPickerPinV2DataRepository$createLoadedState$1 = new AddressPickerPinV2DataRepository$createLoadedState$1(eVar, continuationImpl);
        Object obj2 = addressPickerPinV2DataRepository$createLoadedState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressPickerPinV2DataRepository$createLoadedState$1.label;
        if (i != 0) {
        }
        e1c0 e1c0Var2 = (e1c0) obj2;
        if (str != null) {
        }
        return new SourceOnMapControl.a(f0c0Var, null, null, false, false, null, null, 2046);
    }

    @Override // defpackage.b1c0
    public final tpr a(tpr tprVar) {
        return new m0(tprVar, this.d.b, new AddressPickerPinV2DataRepository$positionFlow$1(3, null));
    }

    @Override // defpackage.b1c0
    public final tpr b(tpr tprVar) {
        AddressResolveRepository addressResolveRepository = this.d;
        return kotlinx.coroutines.flow.e.m(addressResolveRepository.a, kotlinx.coroutines.flow.e.t(new b(((k) this.c).j.a())), kotlinx.coroutines.flow.e.t(new d(((k) this.a).j.b())), ((f) this.e).a(addressResolveRepository.a, this.f), new AddressPickerPinV2DataRepository$stateFlow$2(this, null));
    }

    @Override // defpackage.b1c0
    public final tpr c() {
        return this.i;
    }

    @Override // defpackage.b1c0
    public final tpr d() {
        return new g92(2, Boolean.TRUE);
    }
}
