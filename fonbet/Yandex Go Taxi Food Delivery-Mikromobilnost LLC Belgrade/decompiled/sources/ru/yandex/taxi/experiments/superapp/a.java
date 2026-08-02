package ru.yandex.taxi.experiments.superapp;

import com.yandex.go.shortcuts.impl.interactors.m;
import defpackage.abf0;
import defpackage.czo0;
import defpackage.eaf0;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qaf0;
import defpackage.uaf0;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final po21 a;
    public final m b;
    public final abf0 c;
    public final hbp0 d;
    public boolean e;

    public a(po21 po21Var, m mVar, abf0 abf0Var) {
        this.a = po21Var;
        this.b = mVar;
        this.c = abf0Var;
        String str = (2 & 1) != 0 ? null : "EatsOrderBasedProductFetcher";
        this.d = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r11 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, yaf0 yaf0Var, eaf0 eaf0Var, ContinuationImpl continuationImpl) {
        EatsOrderBasedProductFetcher$invalidate$1 eatsOrderBasedProductFetcher$invalidate$1;
        int i;
        qaf0 b;
        aVar.getClass();
        if (continuationImpl instanceof EatsOrderBasedProductFetcher$invalidate$1) {
            eatsOrderBasedProductFetcher$invalidate$1 = (EatsOrderBasedProductFetcher$invalidate$1) continuationImpl;
            int i2 = eatsOrderBasedProductFetcher$invalidate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderBasedProductFetcher$invalidate$1.label = i2 - Integer.MIN_VALUE;
                EatsOrderBasedProductFetcher$invalidate$1 eatsOrderBasedProductFetcher$invalidate$12 = eatsOrderBasedProductFetcher$invalidate$1;
                Object obj = eatsOrderBasedProductFetcher$invalidate$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderBasedProductFetcher$invalidate$12.label;
                Object obj2 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (eaf0Var == null) {
                        po21 po21Var = aVar.a;
                        eatsOrderBasedProductFetcher$invalidate$12.L$0 = yaf0Var;
                        eatsOrderBasedProductFetcher$invalidate$12.L$1 = null;
                        eatsOrderBasedProductFetcher$invalidate$12.L$2 = aVar;
                        eatsOrderBasedProductFetcher$invalidate$12.label = 1;
                        obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(eatsOrderBasedProductFetcher$invalidate$12);
                    } else {
                        eatsOrderBasedProductFetcher$invalidate$12.L$0 = null;
                        eatsOrderBasedProductFetcher$invalidate$12.L$1 = null;
                        eatsOrderBasedProductFetcher$invalidate$12.label = 3;
                        qaf0 b2 = aVar.b(yaf0Var);
                        if (b2 != null) {
                            aVar.c.a(b2);
                            obj2 = aVar.b.b(b2, eaf0Var, eatsOrderBasedProductFetcher$invalidate$12);
                        }
                        if (obj2 != coroutineSingletons) {
                            return obj2;
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                aVar = (a) eatsOrderBasedProductFetcher$invalidate$12.L$2;
                yaf0Var = (yaf0) eatsOrderBasedProductFetcher$invalidate$12.L$0;
                kotlin.b.b(obj);
                mo21 mo21Var = (mo21) obj;
                eatsOrderBasedProductFetcher$invalidate$12.L$0 = null;
                eatsOrderBasedProductFetcher$invalidate$12.L$1 = null;
                eatsOrderBasedProductFetcher$invalidate$12.L$2 = null;
                eatsOrderBasedProductFetcher$invalidate$12.label = 2;
                b = aVar.b(yaf0Var);
                if (b != null) {
                    aVar.c.a(b);
                    obj2 = aVar.b.c(b, null, null, null, mo21Var.a(), eatsOrderBasedProductFetcher$invalidate$12);
                }
                return obj2 != coroutineSingletons ? coroutineSingletons : obj2;
            }
        }
        eatsOrderBasedProductFetcher$invalidate$1 = new EatsOrderBasedProductFetcher$invalidate$1(aVar, continuationImpl);
        EatsOrderBasedProductFetcher$invalidate$1 eatsOrderBasedProductFetcher$invalidate$122 = eatsOrderBasedProductFetcher$invalidate$1;
        Object obj3 = eatsOrderBasedProductFetcher$invalidate$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderBasedProductFetcher$invalidate$122.label;
        Object obj22 = zy11.a;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj3;
        eatsOrderBasedProductFetcher$invalidate$122.L$0 = null;
        eatsOrderBasedProductFetcher$invalidate$122.L$1 = null;
        eatsOrderBasedProductFetcher$invalidate$122.L$2 = null;
        eatsOrderBasedProductFetcher$invalidate$122.label = 2;
        b = aVar.b(yaf0Var);
        if (b != null) {
        }
        if (obj22 != coroutineSingletons2) {
        }
    }

    public final qaf0 b(yaf0 yaf0Var) {
        uaf0 uaf0Var = yaf0.c;
        if (jl40.l(uaf0Var, yaf0Var)) {
            return new qaf0(uaf0Var, hashCode());
        }
        jst.e.w(new IllegalArgumentException("Unexpected product productsScreenType " + yaf0Var));
        return null;
    }
}
