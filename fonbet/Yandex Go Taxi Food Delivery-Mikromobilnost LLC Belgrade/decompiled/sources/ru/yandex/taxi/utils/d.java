package ru.yandex.taxi.utils;

import defpackage.c4v;
import defpackage.evu0;
import defpackage.g16;
import defpackage.ny61;
import defpackage.obv;
import defpackage.pav;
import defpackage.qbv;
import defpackage.tbv;
import defpackage.tfv;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class d {
    public final pav a;

    public d(pav pavVar) {
        this.a = pavVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c4v c4vVar, tfv tfvVar, ContinuationImpl continuationImpl) {
        IconLoader$loadIcon$1 iconLoader$loadIcon$1;
        int i;
        tbv obvVar;
        if (continuationImpl instanceof IconLoader$loadIcon$1) {
            iconLoader$loadIcon$1 = (IconLoader$loadIcon$1) continuationImpl;
            int i2 = iconLoader$loadIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iconLoader$loadIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = iconLoader$loadIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iconLoader$loadIcon$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                kotlin.b.b(obj);
                String str = c4vVar.b;
                String str2 = c4vVar.a;
                if (str != null && (!evu0.J(str))) {
                    obvVar = new qbv(str);
                } else {
                    if (str2 == null || !(!evu0.J(str2))) {
                        return new Result.Failure(new IllegalArgumentException("Icon data is empty"));
                    }
                    obvVar = new obv(str2, null, 6, 0);
                }
                g16 e = this.a.b().i(obvVar).g(0, 0).e(tfvVar);
                iconLoader$loadIcon$1.L$0 = null;
                iconLoader$loadIcon$1.L$1 = null;
                iconLoader$loadIcon$1.L$2 = null;
                iconLoader$loadIcon$1.L$3 = null;
                iconLoader$loadIcon$1.L$4 = null;
                iconLoader$loadIcon$1.I$0 = 0;
                iconLoader$loadIcon$1.I$1 = 0;
                iconLoader$loadIcon$1.label = 1;
                Object d = a.d(e, iconLoader$loadIcon$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        iconLoader$loadIcon$1 = new IconLoader$loadIcon$1(this, continuationImpl);
        Object obj2 = iconLoader$loadIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iconLoader$loadIcon$1.label;
        if (i == 0) {
        }
    }
}
