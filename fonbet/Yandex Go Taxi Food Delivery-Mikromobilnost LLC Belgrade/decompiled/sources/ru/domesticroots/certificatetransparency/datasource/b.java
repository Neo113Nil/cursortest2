package ru.domesticroots.certificatetransparency.datasource;

import defpackage.jpg;
import defpackage.juf0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yvi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b implements jpg {
    public final /* synthetic */ jpg a;
    public final /* synthetic */ tls b;

    public b(jpg jpgVar, tls tlsVar) {
        this.a = jpgVar;
        this.b = tlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.jpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DataSource$oneWayTransform$1$get$1 dataSource$oneWayTransform$1$get$1;
        Object obj;
        int i;
        if (continuationImpl instanceof DataSource$oneWayTransform$1$get$1) {
            dataSource$oneWayTransform$1$get$1 = (DataSource$oneWayTransform$1$get$1) continuationImpl;
            int i2 = dataSource$oneWayTransform$1$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataSource$oneWayTransform$1$get$1.label = i2 - Integer.MIN_VALUE;
                obj = dataSource$oneWayTransform$1$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataSource$oneWayTransform$1$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dataSource$oneWayTransform$1$get$1.L$0 = this;
                    dataSource$oneWayTransform$1$get$1.label = 1;
                    obj = this.a.b(dataSource$oneWayTransform$1$get$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (b) dataSource$oneWayTransform$1$get$1.L$0;
                    kotlin.b.b(obj);
                }
                if (obj == null) {
                    return this.b.invoke(obj);
                }
                return null;
            }
        }
        dataSource$oneWayTransform$1$get$1 = new DataSource$oneWayTransform$1$get$1(this, continuationImpl);
        obj = dataSource$oneWayTransform$1$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataSource$oneWayTransform$1$get$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    @Override // defpackage.jpg
    public final Object d(Object obj, Continuation continuation) {
        return juf0.d(obj);
    }

    @Override // defpackage.jpg
    public final a j(yvi0 yvi0Var) {
        return new a(this, yvi0Var);
    }

    @Override // defpackage.jpg
    public final Object k(Object obj, ContinuationImpl continuationImpl) {
        return zy11.a;
    }
}
