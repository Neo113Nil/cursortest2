package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class ba extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(String str, String str2, a9 a9Var, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = a9Var;
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Logging click on in-app message with button id: ", str);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ba baVar = new ba(this.b, this.c, this.d, continuation);
        baVar.a = obj;
        return baVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ba) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String str = this.b;
        if (str == null || StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda3(22), 6, (Object) null);
            y8 m = k1.g.m(this.c);
            if (m != null) {
                ((e2) this.d).a(m);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(this.b, 2), 6, (Object) null);
            y8 i = k1.g.i(this.c, this.b);
            if (i != null) {
                ((e2) this.d).a(i);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a() {
        return "Logging click on in-app message";
    }
}
