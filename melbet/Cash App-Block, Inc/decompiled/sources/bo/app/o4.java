package bo.app;

import android.content.Context;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class o4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ DefaultBrazeImageLoader b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, Continuation continuation) {
        super(2, continuation);
        this.a = context;
        this.b = defaultBrazeImageLoader;
    }

    public static final String a() {
        return "Initializing disk cache";
    }

    public static final String b() {
        return "Disk cache initialized";
    }

    public static final String c() {
        return "Image loader was replaced. Disk cache shut down";
    }

    public static final String d() {
        return "Caught exception creating new disk cache. Unable to create new disk cache";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o4(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o4(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ReentrantLock reentrantLock;
        String str;
        String str2;
        AtomicBoolean atomicBoolean;
        String str3;
        k0 k0Var;
        String str4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        n4 n4Var = DefaultBrazeImageLoader.Companion;
        Context context = this.a;
        n4Var.getClass();
        File a = n4.a(context, "appboy.imageloader.lru.cache");
        reentrantLock = this.b.diskCacheLock;
        DefaultBrazeImageLoader defaultBrazeImageLoader = this.b;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                str2 = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger, str2, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(12), 14, (Object) null);
                defaultBrazeImageLoader.diskLruCache = new k0(a);
                atomicBoolean = defaultBrazeImageLoader.isOffline;
                if (atomicBoolean.get()) {
                    str3 = DefaultBrazeImageLoader.TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(14), 14, (Object) null);
                    k0Var = defaultBrazeImageLoader.diskLruCache;
                    if (k0Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                        throw null;
                    }
                    k0Var.a();
                } else {
                    str4 = DefaultBrazeImageLoader.TAG;
                    BrazeLogger.brazelog$default(brazeLogger, str4, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(13), 14, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                }
            } catch (Exception e) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                str = DefaultBrazeImageLoader.TAG;
                BrazeLogger.brazelog$default(brazeLogger2, str, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new n8$$ExternalSyntheticLambda1(15), 8, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            return unit;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
