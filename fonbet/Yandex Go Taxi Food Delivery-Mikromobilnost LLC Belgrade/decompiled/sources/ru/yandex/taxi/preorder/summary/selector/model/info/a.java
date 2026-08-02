package ru.yandex.taxi.preorder.summary.selector.model.info;

import defpackage.eja1;
import defpackage.fk31;
import defpackage.ik31;
import defpackage.mrx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ fk31 b;

    public a(vpr vprVar, fk31 fk31Var) {
        this.a = vprVar;
        this.b = fk31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1 verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1) {
            verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1 = (VerticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ik31 ik31Var = (ik31) obj;
                    List list = ((mrx0) this.b.b.get()).a(kotlin.sequences.b.s(eja1.d("", ik31Var.a.a)), ik31Var.c, ik31Var.b, true, ik31Var.a.d).a;
                    verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.L$0 = null;
                    verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.L$1 = null;
                    verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.L$2 = null;
                    verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.L$3 = null;
                    verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(list, verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1 = new VerticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalsInfoRepository$verticalTariffsListFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
