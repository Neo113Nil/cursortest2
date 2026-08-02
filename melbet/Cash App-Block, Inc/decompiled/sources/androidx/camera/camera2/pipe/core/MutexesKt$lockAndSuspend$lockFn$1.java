package androidx.camera.camera2.pipe.core;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.sync.Mutex;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes3.dex */
public final /* synthetic */ class MutexesKt$lockAndSuspend$lockFn$1 extends FunctionReferenceImpl implements Function2 {
    public static final MutexesKt$lockAndSuspend$lockFn$1 INSTANCE = new MutexesKt$lockAndSuspend$lockFn$1(2, LinkScanner.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object lock = ((Mutex) obj).lock((Continuation) obj2);
        return lock == CoroutineSingletons.COROUTINE_SUSPENDED ? lock : Unit.INSTANCE;
    }
}
