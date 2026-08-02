package bo.app;

import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ed extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ hd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(hd hdVar, Continuation continuation) {
        super(2, continuation);
        this.d = hdVar;
    }

    public static final String a() {
        return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected, but future requests will not be made.";
    }

    public static final String b() {
        return "Caught exception during request sweep";
    }

    public static final String c() {
        return "Request sweeper job has finished.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ed edVar = new ed(this.d, continuation);
        edVar.c = obj;
        return edVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ed edVar = new ed(this.d, (Continuation) obj2);
        edVar.c = (CoroutineScope) obj;
        return edVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(50, r14) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r6, r14) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b0 -> B:18:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        LinkedHashMap linkedHashMap;
        CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                linkedHashMap = this.d.e;
                if (!linkedHashMap.isEmpty()) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((c7) ((Map.Entry) it.next()).getValue()).e.isEmpty()) {
                            this.c = coroutineScope;
                            this.a = null;
                            this.b = 2;
                        }
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.n, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(27), 12, (Object) null);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        SafeTrace.throwOnFailure(obj);
        coroutineScope = coroutineScope2;
        if (JobKt.isActive(coroutineScope)) {
            if (this.d.k.get() >= 5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.n, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(25), 12, (Object) null);
            } else {
                try {
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.n, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new d0$$ExternalSyntheticLambda9(26), 8, (Object) null);
                    long j = hd.p;
                    this.c = coroutineScope;
                    this.a = null;
                    this.b = 1;
                }
                hd.a(this.d);
                linkedHashMap = this.d.e;
                if (!linkedHashMap.isEmpty()) {
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.n, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(27), 12, (Object) null);
        return Unit.INSTANCE;
    }
}
