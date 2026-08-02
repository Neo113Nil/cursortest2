package ru.yandex.taxi.widget;

import defpackage.chb1;
import defpackage.eqn;
import defpackage.fbz;
import defpackage.gp50;
import defpackage.jci0;
import defpackage.nsz;
import defpackage.nuz;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.ssz;
import defpackage.vng;
import defpackage.wp6;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class d {
    public final gp50 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public d(gp50 gp50Var) {
        this.a = gp50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0059, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[Catch: all -> 0x00ac, LOOP:0: B:31:0x0068->B:33:0x006e, LOOP_END, TryCatch #2 {all -> 0x00ac, blocks: (B:30:0x005f, B:31:0x0068, B:33:0x006e, B:35:0x0078), top: B:29:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LottieAnimationLoader$load$1 lottieAnimationLoader$load$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        Iterator it;
        try {
            if (continuationImpl instanceof LottieAnimationLoader$load$1) {
                lottieAnimationLoader$load$1 = (LottieAnimationLoader$load$1) continuationImpl;
                int i2 = lottieAnimationLoader$load$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lottieAnimationLoader$load$1.label = i2 - Integer.MIN_VALUE;
                    obj = lottieAnimationLoader$load$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieAnimationLoader$load$1.label;
                    Object obj2 = null;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        lottieAnimationLoader$load$1.L$0 = null;
                        lottieAnimationLoader$load$1.label = 1;
                        obj = ((ru.yandex.taxi.communications.common.repository.a) this.a.b).a(str, lottieAnimationLoader$load$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            closeable2 = (Closeable) lottieAnimationLoader$load$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                nsz nszVar = (nsz) obj;
                                ooc.g(closeable2, null);
                                return nszVar;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    ooc.g(closeable2, th);
                                    throw th3;
                                }
                            }
                        }
                        kotlin.b.b(obj);
                    }
                    closeable = (Closeable) obj;
                    InputStream inputStream = (InputStream) closeable;
                    it = this.b.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    wp6 wp6Var = new wp6(new jci0(vng.H(inputStream)), 1);
                    nuz a = ssz.a(null, new eqn(3, wp6Var, obj2), new fbz(5, wp6Var));
                    lottieAnimationLoader$load$1.L$0 = null;
                    lottieAnimationLoader$load$1.L$1 = closeable;
                    lottieAnimationLoader$load$1.L$2 = null;
                    lottieAnimationLoader$load$1.label = 2;
                    obj = chb1.c(a, lottieAnimationLoader$load$1);
                    if (obj != coroutineSingletons) {
                        closeable2 = closeable;
                        nsz nszVar2 = (nsz) obj;
                        ooc.g(closeable2, null);
                        return nszVar2;
                    }
                    return coroutineSingletons;
                }
            }
            InputStream inputStream2 = (InputStream) closeable;
            it = this.b.iterator();
            while (it.hasNext()) {
            }
            wp6 wp6Var2 = new wp6(new jci0(vng.H(inputStream2)), 1);
            nuz a2 = ssz.a(null, new eqn(3, wp6Var2, obj2), new fbz(5, wp6Var2));
            lottieAnimationLoader$load$1.L$0 = null;
            lottieAnimationLoader$load$1.L$1 = closeable;
            lottieAnimationLoader$load$1.L$2 = null;
            lottieAnimationLoader$load$1.label = 2;
            obj = chb1.c(a2, lottieAnimationLoader$load$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th4) {
            th = th4;
            closeable2 = closeable;
            throw th;
        }
        lottieAnimationLoader$load$1 = new LottieAnimationLoader$load$1(this, continuationImpl);
        obj = lottieAnimationLoader$load$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieAnimationLoader$load$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        closeable = (Closeable) obj;
    }
}
