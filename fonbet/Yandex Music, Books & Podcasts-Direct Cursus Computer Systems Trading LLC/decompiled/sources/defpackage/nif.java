package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public abstract class nif {
    public static final f4s a = new f4s(zdg.r("com.yandex.infra.DefaultExecutor"), 1);
    public static final e4s b;
    public static final f4s c;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new y36("com.yandex.infra.AwaitingExecutor", 1));
        newCachedThreadPool.getClass();
        b = new e4s(newCachedThreadPool, 1);
        ExecutorService newCachedThreadPool2 = Executors.newCachedThreadPool(new y36("com.yandex.infra.DelayingExecutorService", 1));
        newCachedThreadPool2.getClass();
        c = new f4s(newCachedThreadPool2, 1);
    }

    public static final yop a(ArrayList arrayList) {
        e4s e4sVar = b;
        e4sVar.getClass();
        efo efoVar = mif.b;
        List w0 = CollectionsKt.w0(arrayList);
        return new yop(e4sVar, new zl0(4, w0, new CountDownLatch(w0.size()), new ConcurrentHashMap()));
    }

    public static final yop b(ig3 ig3Var, pyc pycVar) {
        ig3Var.getClass();
        return new yop(ig3Var, pycVar);
    }

    public static final jtp c(r7w r7wVar) {
        r7wVar.getClass();
        f4s f4sVar = a;
        f4sVar.getClass();
        return new jtp(f4sVar, new cwm(r7wVar));
    }

    public static final jtp d(Object obj) {
        f4s f4sVar = a;
        f4sVar.getClass();
        return new jtp(f4sVar, new dwm(obj));
    }
}
