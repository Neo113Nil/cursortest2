package defpackage;

import com.yandex.xplat.common.YSError;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public abstract class zmx {
    public static final q7x0 a = new q7x0(m83.c("com.yandex.infra.DefaultExecutor"), 1);
    public static final p7x0 b = new p7x0(Executors.newCachedThreadPool(new ywd("com.yandex.infra.AwaitingExecutor", 1)), 1);
    public static final q7x0 c = new q7x0(Executors.newCachedThreadPool(new ywd("com.yandex.infra.DelayingExecutorService", 1)), 1);

    public static final y4r0 a(ArrayList arrayList) {
        meo meoVar = ymx.b;
        List J0 = a.J0(arrayList);
        int i = 21;
        return new y4r0(b, new qk30(i, J0, new CountDownLatch(J0.size()), new ConcurrentHashMap()));
    }

    public static final y4r0 b(zls zlsVar) {
        return new y4r0(a, zlsVar);
    }

    public static final lfr0 c(YSError ySError) {
        return new lfr0(a, new flf0(ySError));
    }

    public static final lfr0 d(Object obj) {
        return new lfr0(a, new glf0(obj));
    }
}
