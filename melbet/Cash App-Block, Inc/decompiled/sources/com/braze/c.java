package com.braze;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.y0$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class c extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Braze e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z, boolean z2, boolean z3, Braze braze, Function0 function0, Function0 function02, Continuation continuation) {
        super(2, continuation);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = braze;
        this.f = function0;
        this.g = function02;
    }

    public static final String a(Function0 function0) {
        return Boxes$$ExternalSyntheticOutline1.m("Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > ", function0.invoke());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        cVar.a = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (this.b && Braze.INSTANCE.isDisabled()) {
            return Unit.INSTANCE;
        }
        if (this.c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return Unit.INSTANCE;
        }
        if (this.d && this.e.udm == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new y0$$ExternalSyntheticLambda0(10, this.g), 6, (Object) null);
            return Unit.INSTANCE;
        }
        this.f.invoke();
        return Unit.INSTANCE;
    }
}
