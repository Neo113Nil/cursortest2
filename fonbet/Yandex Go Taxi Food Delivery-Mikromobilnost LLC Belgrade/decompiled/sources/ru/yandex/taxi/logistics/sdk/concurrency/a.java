package ru.yandex.taxi.logistics.sdk.concurrency;

import defpackage.fyc;
import defpackage.gwk0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final tls a;
    public final fyc b;
    public final fyc c;

    public a(tls tlsVar) {
        this.a = tlsVar;
        fyc b = gwk0.b();
        this.b = b;
        this.c = b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r3.j0(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        Actor$Task$execute$1 actor$Task$execute$1;
        int i;
        if (continuationImpl instanceof Actor$Task$execute$1) {
            actor$Task$execute$1 = (Actor$Task$execute$1) continuationImpl;
            int i2 = actor$Task$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                actor$Task$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = actor$Task$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actor$Task$execute$1.label;
                fyc fycVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tls tlsVar = this.a;
                    actor$Task$execute$1.label = 1;
                    obj = tlsVar.invoke(actor$Task$execute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                fycVar.T(obj);
                return zy11.a;
            }
        }
        actor$Task$execute$1 = new Actor$Task$execute$1(this, continuationImpl);
        Object obj2 = actor$Task$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actor$Task$execute$1.label;
        fyc fycVar2 = this.b;
        if (i != 0) {
        }
        fycVar2.T(obj2);
        return zy11.a;
    }
}
