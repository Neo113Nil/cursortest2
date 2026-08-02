package ru.yandex.taxi.plus.repository;

import defpackage.bvf0;
import defpackage.jmd0;
import defpackage.mth;
import defpackage.ny61;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class f {
    public final r0 a = bvf0.c(null);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TypedScreensRepository$getPlusSubsPromoScreen$1 typedScreensRepository$getPlusSubsPromoScreen$1;
        int i;
        if (continuationImpl instanceof TypedScreensRepository$getPlusSubsPromoScreen$1) {
            typedScreensRepository$getPlusSubsPromoScreen$1 = (TypedScreensRepository$getPlusSubsPromoScreen$1) continuationImpl;
            int i2 = typedScreensRepository$getPlusSubsPromoScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                typedScreensRepository$getPlusSubsPromoScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = typedScreensRepository$getPlusSubsPromoScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = typedScreensRepository$getPlusSubsPromoScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = new mth(this.a, 6);
                    typedScreensRepository$getPlusSubsPromoScreen$1.L$0 = str;
                    typedScreensRepository$getPlusSubsPromoScreen$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(mthVar, typedScreensRepository$getPlusSubsPromoScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) typedScreensRepository$getPlusSubsPromoScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                for (Object obj2 : (List) obj) {
                    if (((jmd0) obj2).e.equals(str)) {
                        return obj2;
                    }
                }
                return null;
            }
        }
        typedScreensRepository$getPlusSubsPromoScreen$1 = new TypedScreensRepository$getPlusSubsPromoScreen$1(this, continuationImpl);
        Object obj3 = typedScreensRepository$getPlusSubsPromoScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = typedScreensRepository$getPlusSubsPromoScreen$1.label;
        if (i != 0) {
        }
        while (r5.hasNext()) {
        }
        return null;
    }
}
