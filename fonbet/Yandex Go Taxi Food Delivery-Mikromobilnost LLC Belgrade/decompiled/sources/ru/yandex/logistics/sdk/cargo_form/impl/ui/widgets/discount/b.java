package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.qoj;
import defpackage.r9x0;
import defpackage.roj;
import defpackage.sbv;
import defpackage.v4v;
import defpackage.x2s;
import defpackage.x9x0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
        this.b = q8sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r1v3, types: [v4v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(roj rojVar, ContinuationImpl continuationImpl) {
        DiscountMapper$map$1 discountMapper$map$1;
        int i;
        lvi0 lvi0Var;
        ldc ldcVar;
        roj rojVar2 = rojVar;
        if (continuationImpl instanceof DiscountMapper$map$1) {
            discountMapper$map$1 = (DiscountMapper$map$1) continuationImpl;
            int i2 = discountMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                discountMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = discountMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = discountMapper$map$1.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sbv sbvVar = rojVar2.b;
                    lvi0 g = sbvVar != null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, sbvVar, null, null, 14) : null;
                    String str = rojVar2.c;
                    ldc f = str != null ? aVar.g.f(str) : null;
                    FormattedText formattedText = rojVar2.d;
                    discountMapper$map$1.L$0 = rojVar2;
                    discountMapper$map$1.L$1 = g;
                    discountMapper$map$1.L$2 = f;
                    discountMapper$map$1.label = 1;
                    Object a = this.b.a(formattedText, discountMapper$map$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lvi0Var = g;
                    ldcVar = f;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ldc ldcVar2 = (ldc) discountMapper$map$1.L$2;
                    ?? r1 = (v4v) discountMapper$map$1.L$1;
                    roj rojVar3 = (roj) discountMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    ldcVar = ldcVar2;
                    lvi0Var = r1;
                    rojVar2 = rojVar3;
                }
                CharSequence charSequence = (CharSequence) obj;
                sbv sbvVar2 = rojVar2.e;
                lvi0 g2 = sbvVar2 != null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, sbvVar2, null, null, 14) : null;
                r9x0 r9x0Var = rojVar2.f;
                x2s x2sVar = rojVar2.g;
                return new qoj(lvi0Var, ldcVar, charSequence, g2, new x9x0(r9x0Var, null, null, x2sVar, 6), x2sVar, rojVar2.a);
            }
        }
        discountMapper$map$1 = new DiscountMapper$map$1(this, continuationImpl);
        Object obj2 = discountMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = discountMapper$map$1.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        sbv sbvVar22 = rojVar2.e;
        if (sbvVar22 != null) {
        }
        r9x0 r9x0Var2 = rojVar2.f;
        x2s x2sVar2 = rojVar2.g;
        return new qoj(lvi0Var, ldcVar, charSequence2, g2, new x9x0(r9x0Var2, null, null, x2sVar2, 6), x2sVar2, rojVar2.a);
    }
}
