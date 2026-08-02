package com.google.firebase.datastorage;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.room.TransactionScope;
import androidx.room.coroutines.RawConnectionAccessor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class JavaDataStorage$editSync$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 $transform;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$editSync$1$1(Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.$transform = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function1 function1 = this.$transform;
        switch (i) {
            case 0:
                JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$1 = new JavaDataStorage$editSync$1$1(function1, continuation);
                javaDataStorage$editSync$1$1.L$0 = obj;
                return javaDataStorage$editSync$1$1;
            default:
                JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$12 = new JavaDataStorage$editSync$1$1(continuation, function1);
                javaDataStorage$editSync$1$12.L$0 = obj;
                return javaDataStorage$editSync$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((JavaDataStorage$editSync$1$1) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((JavaDataStorage$editSync$1$1) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$transform;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke((MutablePreferences) this.L$0);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                TransactionScope transactionScope = (TransactionScope) this.L$0;
                transactionScope.getClass();
                return function1.invoke(((RawConnectionAccessor) transactionScope).getRawConnection());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDataStorage$editSync$1$1(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$transform = function1;
    }
}
