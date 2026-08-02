package com.squareup.cash.blockers.views;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class FileBlockerView$6$2$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileBlockerView$6$2$1() {
        super(3, null);
        this.$r8$classId = 2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (this.$r8$classId) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                FileBlockerView$6$2$1 fileBlockerView$6$2$1 = new FileBlockerView$6$2$1(i, (Continuation) obj3, 0);
                fileBlockerView$6$2$1.Z$0 = booleanValue;
                fileBlockerView$6$2$1.Z$1 = booleanValue2;
                return fileBlockerView$6$2$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                boolean booleanValue3 = bool.booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                FileBlockerView$6$2$1 fileBlockerView$6$2$12 = new FileBlockerView$6$2$1(i, (Continuation) obj3, 1);
                fileBlockerView$6$2$12.Z$0 = booleanValue3;
                fileBlockerView$6$2$12.Z$1 = booleanValue4;
                return fileBlockerView$6$2$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                boolean booleanValue5 = bool.booleanValue();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                FileBlockerView$6$2$1 fileBlockerView$6$2$13 = new FileBlockerView$6$2$1(i, (Continuation) obj3, 2);
                fileBlockerView$6$2$13.Z$0 = booleanValue5;
                fileBlockerView$6$2$13.Z$1 = booleanValue6;
                return fileBlockerView$6$2$13.invokeSuspend(Unit.INSTANCE);
            case 3:
                boolean booleanValue7 = bool.booleanValue();
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                FileBlockerView$6$2$1 fileBlockerView$6$2$14 = new FileBlockerView$6$2$1(i, (Continuation) obj3, i);
                fileBlockerView$6$2$14.Z$0 = booleanValue7;
                fileBlockerView$6$2$14.Z$1 = booleanValue8;
                return fileBlockerView$6$2$14.invokeSuspend(Unit.INSTANCE);
            case 4:
                boolean booleanValue9 = bool.booleanValue();
                boolean booleanValue10 = ((Boolean) obj2).booleanValue();
                FileBlockerView$6$2$1 fileBlockerView$6$2$15 = new FileBlockerView$6$2$1(i, (Continuation) obj3, 4);
                fileBlockerView$6$2$15.Z$0 = booleanValue9;
                fileBlockerView$6$2$15.Z$1 = booleanValue10;
                return fileBlockerView$6$2$15.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue11 = bool.booleanValue();
                boolean booleanValue12 = ((Boolean) obj2).booleanValue();
                FileBlockerView$6$2$1 fileBlockerView$6$2$16 = new FileBlockerView$6$2$1(i, (Continuation) obj3, 5);
                fileBlockerView$6$2$16.Z$0 = booleanValue11;
                fileBlockerView$6$2$16.Z$1 = booleanValue12;
                return fileBlockerView$6$2$16.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new Pair(Boolean.valueOf(z), Boolean.valueOf(z2));
            case 1:
                boolean z3 = this.Z$0;
                boolean z4 = this.Z$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(z4 && !z3);
            case 2:
                boolean z5 = this.Z$0;
                boolean z6 = this.Z$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(z6 && z5);
            case 3:
                boolean z7 = this.Z$0;
                boolean z8 = this.Z$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z7 && !z8) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            case 4:
                boolean z9 = this.Z$0;
                boolean z10 = this.Z$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(z9 && z10);
            default:
                boolean z11 = this.Z$0;
                boolean z12 = this.Z$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z11 && !z12) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileBlockerView$6$2$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
