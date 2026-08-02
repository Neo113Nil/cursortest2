package androidx.room.util;

import androidx.room.RoomDatabase;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $block$inlined;
    public final /* synthetic */ RoomDatabase $db$inlined;
    public final /* synthetic */ boolean $isReadOnly$inlined;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(RoomDatabase roomDatabase, Continuation continuation, Function1 function1, boolean z) {
        super(2, continuation);
        this.$db$inlined = roomDatabase;
        this.$isReadOnly$inlined = z;
        this.$block$inlined = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        boolean z = this.$isReadOnly$inlined;
        return new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(this.$db$inlined, continuation, this.$block$inlined, z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        Function1 function1 = this.$block$inlined;
        RoomDatabase roomDatabase = this.$db$inlined;
        boolean z = this.$isReadOnly$inlined;
        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(roomDatabase, null, function1, z);
        this.label = 1;
        Object useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, this);
        return useConnection$room_runtime_release == coroutineSingletons ? coroutineSingletons : useConnection$room_runtime_release;
    }
}
