package ru.yandex.logistics.sdk.cargo_form.impl.ui.section_promo;

import defpackage.cqs0;
import defpackage.g3q0;
import defpackage.h3q0;
import defpackage.i3q0;
import defpackage.j6s;
import defpackage.k3q0;
import defpackage.ny61;
import defpackage.xts0;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;

    public a(ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h3q0 h3q0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        SectionPromoMapper$map$1 sectionPromoMapper$map$1;
        int i;
        if (continuationImpl instanceof SectionPromoMapper$map$1) {
            sectionPromoMapper$map$1 = (SectionPromoMapper$map$1) continuationImpl;
            int i2 = sectionPromoMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sectionPromoMapper$map$1.label = i2 - Integer.MIN_VALUE;
                SectionPromoMapper$map$1 sectionPromoMapper$map$12 = sectionPromoMapper$map$1;
                Object obj = sectionPromoMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sectionPromoMapper$map$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(h3q0Var instanceof i3q0)) {
                        return null;
                    }
                    i3q0 i3q0Var = (i3q0) h3q0Var;
                    xts0 xts0Var = i3q0Var.a;
                    String str = i3q0Var.c;
                    sectionPromoMapper$map$12.L$0 = h3q0Var;
                    sectionPromoMapper$map$12.L$1 = null;
                    sectionPromoMapper$map$12.label = 1;
                    obj = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.q(this.a, xts0Var, j6sVar, str, sectionPromoMapper$map$12, 4);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h3q0Var = (h3q0) sectionPromoMapper$map$12.L$0;
                    kotlin.b.b(obj);
                }
                return new g3q0(Collections.singletonList(new k3q0((cqs0) obj)), this.a.g.f(((i3q0) h3q0Var).b));
            }
        }
        sectionPromoMapper$map$1 = new SectionPromoMapper$map$1(this, continuationImpl);
        SectionPromoMapper$map$1 sectionPromoMapper$map$122 = sectionPromoMapper$map$1;
        Object obj2 = sectionPromoMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sectionPromoMapper$map$122.label;
        if (i != 0) {
        }
        return new g3q0(Collections.singletonList(new k3q0((cqs0) obj2)), this.a.g.f(((i3q0) h3q0Var).b));
    }
}
