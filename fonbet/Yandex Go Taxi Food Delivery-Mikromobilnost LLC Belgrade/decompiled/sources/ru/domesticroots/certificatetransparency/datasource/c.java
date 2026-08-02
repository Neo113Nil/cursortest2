package ru.domesticroots.certificatetransparency.datasource;

import defpackage.bvf0;
import defpackage.jpg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.yvi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c implements jpg {
    public qoh a;
    public final /* synthetic */ jpg b;

    public c(jpg jpgVar) {
        this.b = jpgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.jpg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DataSource$reuseInflight$1$get$1 dataSource$reuseInflight$1$get$1;
        int i;
        if (continuationImpl instanceof DataSource$reuseInflight$1$get$1) {
            dataSource$reuseInflight$1$get$1 = (DataSource$reuseInflight$1$get$1) continuationImpl;
            int i2 = dataSource$reuseInflight$1$get$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataSource$reuseInflight$1$get$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataSource$reuseInflight$1$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataSource$reuseInflight$1$get$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DataSource$reuseInflight$1$get$2 dataSource$reuseInflight$1$get$2 = new DataSource$reuseInflight$1$get$2(this, this.b, null);
                    dataSource$reuseInflight$1$get$1.label = 1;
                    obj = bvf0.n(dataSource$reuseInflight$1$get$2, dataSource$reuseInflight$1$get$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                dataSource$reuseInflight$1$get$1.label = 2;
                Object k = ((noh) obj).k(dataSource$reuseInflight$1$get$1);
                return k != coroutineSingletons ? coroutineSingletons : k;
            }
        }
        dataSource$reuseInflight$1$get$1 = new DataSource$reuseInflight$1$get$1(this, continuationImpl);
        Object obj2 = dataSource$reuseInflight$1$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataSource$reuseInflight$1$get$1.label;
        if (i != 0) {
        }
        dataSource$reuseInflight$1$get$1.label = 2;
        Object k2 = ((noh) obj2).k(dataSource$reuseInflight$1$get$1);
        if (k2 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.jpg
    public final Object d(Object obj, Continuation continuation) {
        return this.b.d(obj, continuation);
    }

    @Override // defpackage.jpg
    public final a j(yvi0 yvi0Var) {
        return new a(this, yvi0Var);
    }

    @Override // defpackage.jpg
    public final Object k(Object obj, ContinuationImpl continuationImpl) {
        Object k = this.b.k(obj, continuationImpl);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : zy11.a;
    }
}
