package com.squareup.cash.integration.contacts;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.sequences.SequenceBuilderIterator;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealContactBook$contacts$4 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Throwable L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealContactBook$contacts$4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowCollector flowCollector = (FlowCollector) obj;
        Throwable th = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                RealContactBook$contacts$4 realContactBook$contacts$4 = new RealContactBook$contacts$4(3, continuation, 0);
                realContactBook$contacts$4.L$0 = flowCollector;
                realContactBook$contacts$4.L$1 = th;
                return realContactBook$contacts$4.invokeSuspend(Unit.INSTANCE);
            case 1:
                RealContactBook$contacts$4 realContactBook$contacts$42 = new RealContactBook$contacts$4(3, continuation, 1);
                realContactBook$contacts$42.L$0 = flowCollector;
                realContactBook$contacts$42.L$1 = th;
                return realContactBook$contacts$42.invokeSuspend(Unit.INSTANCE);
            default:
                RealContactBook$contacts$4 realContactBook$contacts$43 = new RealContactBook$contacts$4(3, continuation, 2);
                realContactBook$contacts$43.L$0 = flowCollector;
                realContactBook$contacts$43.L$1 = th;
                return realContactBook$contacts$43.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = this.L$0;
                Throwable th = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(th instanceof SecurityException)) {
                        throw th;
                    }
                    ContactBook$ContactsQuery contactBook$ContactsQuery = new ContactBook$ContactsQuery() { // from class: com.squareup.cash.integration.contacts.RealContactBook$contacts$4$$ExternalSyntheticLambda0
                        @Override // com.squareup.cash.integration.contacts.ContactBook$ContactsQuery
                        public final SequenceBuilderIterator execute() {
                            return SequencesKt__SequenceBuilderKt.iterator(new RealContactBook$contacts$4$1$1(2, null));
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector.emit(contactBook$ContactsQuery, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                FlowCollector flowCollector2 = this.L$0;
                Throwable th2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(th2 instanceof SecurityException)) {
                        throw th2;
                    }
                    ContactBook$ContactAccountDetailsQuery contactBook$ContactAccountDetailsQuery = new ContactBook$ContactAccountDetailsQuery() { // from class: com.squareup.cash.integration.contacts.RealContactBook$contactAccounts$4$$ExternalSyntheticLambda0
                        @Override // com.squareup.cash.integration.contacts.ContactBook$ContactAccountDetailsQuery
                        public final List execute() {
                            return EmptyList.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector2.emit(contactBook$ContactAccountDetailsQuery, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                FlowCollector flowCollector3 = this.L$0;
                Throwable th3 = this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!(th3 instanceof SecurityException)) {
                        throw th3;
                    }
                    ContactBook$DetailedContactQuery contactBook$DetailedContactQuery = new ContactBook$DetailedContactQuery() { // from class: com.squareup.cash.integration.contacts.RealContactBook$detailedContacts$4$$ExternalSyntheticLambda0
                        @Override // com.squareup.cash.integration.contacts.ContactBook$DetailedContactQuery
                        public final List execute() {
                            return EmptyList.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector3.emit(contactBook$DetailedContactQuery, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
