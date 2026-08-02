package ru.domesticroots.certificatetransparency.datasource;

import defpackage.bvf0;
import defpackage.jpg;
import defpackage.ny61;
import defpackage.yvi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements jpg {
    public final /* synthetic */ jpg a;
    public final /* synthetic */ jpg b;

    public a(jpg jpgVar, jpg jpgVar2) {
        this.a = jpgVar;
        this.b = jpgVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if (r2 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.jpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DataSource$compose$1$get$1 dataSource$compose$1$get$1;
        int i;
        Object d;
        if (continuationImpl instanceof DataSource$compose$1$get$1) {
            dataSource$compose$1$get$1 = (DataSource$compose$1$get$1) continuationImpl;
            int i2 = dataSource$compose$1$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataSource$compose$1$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataSource$compose$1$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataSource$compose$1$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dataSource$compose$1$get$1.L$0 = this;
                    dataSource$compose$1$get$1.label = 1;
                    obj = this.a.b(dataSource$compose$1$get$1);
                } else if (i == 1) {
                    this = (a) dataSource$compose$1$get$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Object obj2 = dataSource$compose$1$get$1.L$0;
                            kotlin.b.b(obj);
                            return obj2;
                        }
                        this = (a) dataSource$compose$1$get$1.L$0;
                        kotlin.b.b(obj);
                        if (obj == null) {
                            return null;
                        }
                        jpg jpgVar = this.a;
                        dataSource$compose$1$get$1.L$0 = obj;
                        dataSource$compose$1$get$1.label = 4;
                        return jpgVar.k(obj, dataSource$compose$1$get$1) == coroutineSingletons ? coroutineSingletons : obj;
                    }
                    Object obj3 = dataSource$compose$1$get$1.L$1;
                    a aVar = (a) dataSource$compose$1$get$1.L$0;
                    kotlin.b.b(obj);
                    obj = obj3;
                    this = aVar;
                    d = obj;
                    if (((Boolean) d).booleanValue()) {
                        return obj;
                    }
                    jpg jpgVar2 = this.b;
                    dataSource$compose$1$get$1.L$0 = this;
                    dataSource$compose$1$get$1.L$1 = null;
                    dataSource$compose$1$get$1.label = 3;
                    obj = jpgVar2.b(dataSource$compose$1$get$1);
                }
                dataSource$compose$1$get$1.L$0 = this;
                dataSource$compose$1$get$1.L$1 = obj;
                dataSource$compose$1$get$1.label = 2;
                d = this.a.d(obj, dataSource$compose$1$get$1);
            }
        }
        dataSource$compose$1$get$1 = new DataSource$compose$1$get$1(this, continuationImpl);
        Object obj4 = dataSource$compose$1$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataSource$compose$1$get$1.label;
        if (i != 0) {
        }
        dataSource$compose$1$get$1.L$0 = this;
        dataSource$compose$1$get$1.L$1 = obj4;
        dataSource$compose$1$get$1.label = 2;
        d = this.a.d(obj4, dataSource$compose$1$get$1);
    }

    @Override // defpackage.jpg
    public final Object d(Object obj, Continuation continuation) {
        return this.a.d(obj, continuation);
    }

    @Override // defpackage.jpg
    public final a j(yvi0 yvi0Var) {
        return new a(this, yvi0Var);
    }

    @Override // defpackage.jpg
    public final Object k(Object obj, ContinuationImpl continuationImpl) {
        Object n = bvf0.n(new DataSource$compose$1$set$2(this.a, obj, this.b, null), continuationImpl);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
