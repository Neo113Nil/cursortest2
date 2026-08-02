package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2", f = "SentryCrashApi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class W6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ List<Crash> b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ X6 d;

    @DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.implementation.api.SentryCrashApi$sendCrashes$2$1$1", f = "SentryCrashApi.kt", l = {58}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public ArrayList a;
        public int b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ X6 d;
        public final /* synthetic */ Crash e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList, X6 x6, Crash crash, Continuation continuation) {
            super(2, continuation);
            this.c = arrayList;
            this.d = x6;
            this.e = crash;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                ArrayList arrayList2 = this.c;
                Object value = this.d.b.getValue();
                value.getClass();
                Z6 z6 = (Z6) value;
                String a = this.d.a();
                CrashApiOptions crashApiOptions = this.d.c;
                if (crashApiOptions == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("crashApiOptions");
                    throw null;
                }
                String apiKey = crashApiOptions.getApiKey();
                Crash crash = this.e;
                this.a = arrayList2;
                this.b = 1;
                Object a2 = z6.a(a, apiKey, crash, this);
                if (a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a2;
                arrayList = arrayList2;
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = this.a;
                SafeTrace.throwOnFailure(obj);
            }
            arrayList.add(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(List list, ArrayList arrayList, X6 x6, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = arrayList;
        this.d = x6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        W6 w6 = new W6(this.b, this.c, this.d, continuation);
        w6.a = obj;
        return w6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.a;
        List<Crash> list = this.b;
        ArrayList arrayList = this.c;
        X6 x6 = this.d;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            JobKt.launch$default(coroutineScope, null, null, new a(arrayList, x6, (Crash) it.next(), null), 3);
        }
        return Unit.INSTANCE;
    }
}
