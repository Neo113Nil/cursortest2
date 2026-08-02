package bo.app;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class j6 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ BufferedReader d;
    public final /* synthetic */ ProducerScope e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(BufferedReader bufferedReader, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.d = bufferedReader;
        this.e = producerScope;
    }

    public static final String a(Exception exc) {
        return Boxes$$ExternalSyntheticOutline1.m(exc, "Stream producer job cancelled ");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j6 j6Var = new j6(this.d, this.e, continuation);
        j6Var.c = obj;
        return j6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                String readLine = this.d.readLine();
                if (readLine == null) {
                    return Unit.INSTANCE;
                }
                ProducerScope producerScope = this.e;
                this.c = coroutineScope;
                this.a = null;
                this.b = 1;
                if (((ProducerCoroutine) producerScope)._channel.send(readLine, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
        } catch (Exception e) {
            if (JobKt.isActive(coroutineScope)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, BrazeLogger.Priority.D, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(14), 8, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g$$ExternalSyntheticLambda1(1, e), 14, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a() {
        return "Caught unexpected exception in dust stream producer";
    }
}
