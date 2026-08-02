package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.b8r;
import defpackage.c4r0;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.mi31;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.uze0;
import defpackage.xaj0;
import defpackage.yaj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class z {
    public final yaj0 a;
    public final c4r0 b;
    public final uze0 c;
    public final b8r d;

    public z(yaj0 yaj0Var, c4r0 c4r0Var, uze0 uze0Var, b8r b8rVar) {
        this.a = yaj0Var;
        this.b = c4r0Var;
        this.c = uze0Var;
        this.d = b8rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1 selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1;
        int i;
        pex0 pex0Var;
        String str;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1) {
            selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1 = (SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1) continuationImpl;
            int i2 = selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1.label;
                pex0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = new mth(((com.yandex.go.taxi.tariffs.internal.repository.k) this.c).j.a(), 4);
                    SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2 selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2 = new SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2(2, null);
                    selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(mthVar, selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$2, selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                yaj0 yaj0Var = this.a;
                xaj0 xaj0Var = (xaj0) yaj0Var.a.b.a.getValue();
                str = xaj0Var.a;
                if (str != null) {
                    String str2 = xaj0Var.b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    mi31 d = b8r.d(this.d, str, str2, 4);
                    if (d != null) {
                        pex0Var = d.a;
                    }
                }
                if (pex0Var != null) {
                    this.b.a(new gnx0(new fnx0(pex0Var, "", SelectionOrigin.ACTION), false));
                }
                r0Var = yaj0Var.a.a;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, xaj0.c));
                return zy11.a;
            }
        }
        selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1 = new SelectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1(this, continuationImpl);
        Object obj2 = selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectRequiredPreselectedTariffInteractor$trySelectPreselectedTariff$1.label;
        pex0Var = null;
        if (i != 0) {
        }
        yaj0 yaj0Var2 = this.a;
        xaj0 xaj0Var2 = (xaj0) yaj0Var2.a.b.a.getValue();
        str = xaj0Var2.a;
        if (str != null) {
        }
        if (pex0Var != null) {
        }
        r0Var = yaj0Var2.a.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, xaj0.c));
        return zy11.a;
    }
}
