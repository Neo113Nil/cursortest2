package com.squareup.cash.initialscreenloader.backend;

import androidx.room.RoomDatabase$performClear$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealColdStartIntegrityChecker$retryChecks$2$optionalChecksRetry$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List $optionalChecks;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealColdStartIntegrityChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealColdStartIntegrityChecker$retryChecks$2$optionalChecksRetry$1(RealColdStartIntegrityChecker realColdStartIntegrityChecker, List list, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realColdStartIntegrityChecker;
        this.$optionalChecks = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        List list = this.$optionalChecks;
        RealColdStartIntegrityChecker realColdStartIntegrityChecker = this.this$0;
        switch (i) {
            case 0:
                return new RealColdStartIntegrityChecker$retryChecks$2$optionalChecksRetry$1(realColdStartIntegrityChecker, list, continuation, 0);
            default:
                return new RealColdStartIntegrityChecker$retryChecks$2$optionalChecksRetry$1(realColdStartIntegrityChecker, list, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealColdStartIntegrityChecker$retryChecks$2$optionalChecksRetry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        List list = this.$optionalChecks;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RealColdStartIntegrityChecker.IntegrityCheckItem) it.next()).integrityCheck);
                }
                this.label = 1;
                Object coroutineScope = JobKt.coroutineScope(new RoomDatabase$performClear$1.AnonymousClass1((List) arrayList, false, (Continuation) null), this);
                return coroutineScope == coroutineSingletons ? coroutineSingletons : coroutineScope;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((RealColdStartIntegrityChecker.IntegrityCheckItem) it2.next()).integrityCheck);
                }
                this.label = 1;
                Object coroutineScope2 = JobKt.coroutineScope(new RoomDatabase$performClear$1.AnonymousClass1((List) arrayList2, true, (Continuation) null), this);
                return coroutineScope2 == coroutineSingletons2 ? coroutineSingletons2 : coroutineScope2;
        }
    }
}
