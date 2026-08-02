package ru.yandex.taxi.costcenters.fields;

import defpackage.jl40;
import defpackage.jwe;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CostCenterFieldsModalView$CostCentersListAdapter$1 extends FunctionReferenceImpl implements wls {
    public static final CostCenterFieldsModalView$CostCentersListAdapter$1 b = new CostCenterFieldsModalView$CostCentersListAdapter$1(2, 0, jwe.class, "isTheSame", "isTheSame(Lru/yandex/taxi/costcenters/fields/CostCenterFieldViewModel;)Z");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        jwe jweVar = (jwe) obj;
        jwe jweVar2 = (jwe) obj2;
        jweVar.getClass();
        return Boolean.valueOf(jl40.l(jweVar2.a, jweVar.a) && jl40.l(jweVar.b, jweVar2.b) && jl40.l(jweVar.c, jweVar2.c) && jl40.l(jweVar.e, jweVar2.e) && jweVar.d == jweVar2.d);
    }
}
