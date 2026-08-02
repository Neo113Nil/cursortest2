package com.squareup.cash.clientrouting.routers.account;

import app.cash.badging.backend.Badger$collect$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientrouting.routers.account.RoutableAccount;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAccounts;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RoutableAccountsProvider$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RoutableAccountsProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoutableAccountsProvider$setup$1$1(RoutableAccountsProvider routableAccountsProvider, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = routableAccountsProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RoutableAccountsProvider routableAccountsProvider = this.this$0;
        switch (i) {
            case 0:
                return new RoutableAccountsProvider$setup$1$1(routableAccountsProvider, continuation, 0);
            case 1:
                return new RoutableAccountsProvider$setup$1$1(routableAccountsProvider, continuation, 1);
            default:
                return new RoutableAccountsProvider$setup$1$1(routableAccountsProvider, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                ((RoutableAccountsProvider$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                break;
        }
        return ((RoutableAccountsProvider$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RoutableAccountsProvider routableAccountsProvider = this.this$0;
        int i2 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow singleValue = routableAccountsProvider.syncValueReader.getSingleValue(AndroidSyncValueSpecs.Accounts);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(routableAccountsProvider, 0);
                    this.label = 1;
                    if (singleValue.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow allValues = routableAccountsProvider.syncValueReader.getAllValues(AndroidSyncValueSpecs.FamilyAccount, new Matcher$$ExternalSyntheticLambda9(1));
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(routableAccountsProvider, i2);
                    this.label = 1;
                    Object collect = allValues.collect(new Badger$collect$$inlined$map$1.AnonymousClass2(anonymousClass12, 10), this);
                    if (collect != coroutineSingletons2) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow observe = routableAccountsProvider.principalAccountToken.observe();
                    AnonymousClass1 anonymousClass13 = new AnonymousClass1(routableAccountsProvider, 2);
                    this.label = 1;
                    if (observe.collect(anonymousClass13, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.squareup.cash.clientrouting.routers.account.RoutableAccountsProvider$setup$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ RoutableAccountsProvider this$0;

        public /* synthetic */ AnonymousClass1(RoutableAccountsProvider routableAccountsProvider, int i) {
            this.$r8$classId = i;
            this.this$0 = routableAccountsProvider;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(SyncValueAccounts syncValueAccounts, Continuation continuation) {
            RoutableAccountsProvider$setup$1$1$1$emit$1 routableAccountsProvider$setup$1$1$1$emit$1;
            int i;
            List list;
            RoutableAccountsProvider routableAccountsProvider;
            MutexImpl mutexImpl;
            List list2;
            try {
                if (continuation instanceof RoutableAccountsProvider$setup$1$1$1$emit$1) {
                    routableAccountsProvider$setup$1$1$1$emit$1 = (RoutableAccountsProvider$setup$1$1$1$emit$1) continuation;
                    int i2 = routableAccountsProvider$setup$1$1$1$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        routableAccountsProvider$setup$1$1$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = routableAccountsProvider$setup$1$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = routableAccountsProvider$setup$1$1$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (syncValueAccounts == null || (list2 = syncValueAccounts.accounts) == null) {
                                list = EmptyList.INSTANCE;
                            } else {
                                List<FullAccount> list3 = list2;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                for (FullAccount fullAccount : list3) {
                                    RoutableAccount.Account.m3469constructorimpl(fullAccount);
                                    arrayList.add(RoutableAccount.Account.m3468boximpl(fullAccount));
                                }
                                list = arrayList;
                            }
                            RoutableAccountsProvider routableAccountsProvider2 = this.this$0;
                            MutexImpl mutexImpl2 = routableAccountsProvider2.mutex;
                            routableAccountsProvider$setup$1$1$1$emit$1.L$1 = routableAccountsProvider2;
                            routableAccountsProvider$setup$1$1$1$emit$1.L$2 = list;
                            routableAccountsProvider$setup$1$1$1$emit$1.L$3 = mutexImpl2;
                            routableAccountsProvider$setup$1$1$1$emit$1.label = 1;
                            if (mutexImpl2.lock(routableAccountsProvider$setup$1$1$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            routableAccountsProvider = routableAccountsProvider2;
                            mutexImpl = mutexImpl2;
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutexImpl = routableAccountsProvider$setup$1$1$1$emit$1.L$3;
                            list = (List) routableAccountsProvider$setup$1$1$1$emit$1.L$2;
                            routableAccountsProvider = routableAccountsProvider$setup$1$1$1$emit$1.L$1;
                            SafeTrace.throwOnFailure(obj);
                        }
                        CollectionsKt__MutableCollectionsKt.removeAll(routableAccountsProvider.allAvailableAccounts, RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1.INSTANCE);
                        routableAccountsProvider.allAvailableAccounts.addAll(list);
                        mutexImpl.unlock(null);
                        return Unit.INSTANCE;
                    }
                }
                CollectionsKt__MutableCollectionsKt.removeAll(routableAccountsProvider.allAvailableAccounts, RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1.INSTANCE);
                routableAccountsProvider.allAvailableAccounts.addAll(list);
                mutexImpl.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutexImpl.unlock(null);
                throw th;
            }
            routableAccountsProvider$setup$1$1$1$emit$1 = new RoutableAccountsProvider$setup$1$1$1$emit$1(this, continuation);
            Object obj2 = routableAccountsProvider$setup$1$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = routableAccountsProvider$setup$1$1$1$emit$1.label;
            if (i != 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(PrincipalAccountToken principalAccountToken, Continuation continuation) {
            RoutableAccountsProvider$setup$1$3$1$emit$1 routableAccountsProvider$setup$1$3$1$emit$1;
            int i;
            List listOfNotNull;
            RoutableAccountsProvider routableAccountsProvider;
            MutexImpl mutexImpl;
            try {
                if (continuation instanceof RoutableAccountsProvider$setup$1$3$1$emit$1) {
                    routableAccountsProvider$setup$1$3$1$emit$1 = (RoutableAccountsProvider$setup$1$3$1$emit$1) continuation;
                    int i2 = routableAccountsProvider$setup$1$3$1$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        routableAccountsProvider$setup$1$3$1$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = routableAccountsProvider$setup$1$3$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = routableAccountsProvider$setup$1$3$1$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            PrincipalAccountToken.Some some = principalAccountToken instanceof PrincipalAccountToken.Some ? (PrincipalAccountToken.Some) principalAccountToken : null;
                            if (some == null) {
                                some = null;
                            }
                            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(some != null ? RoutableAccount.Sponsor.m3473boximpl(some) : null);
                            RoutableAccountsProvider routableAccountsProvider2 = this.this$0;
                            MutexImpl mutexImpl2 = routableAccountsProvider2.mutex;
                            routableAccountsProvider$setup$1$3$1$emit$1.L$1 = routableAccountsProvider2;
                            routableAccountsProvider$setup$1$3$1$emit$1.L$2 = listOfNotNull;
                            routableAccountsProvider$setup$1$3$1$emit$1.L$3 = mutexImpl2;
                            routableAccountsProvider$setup$1$3$1$emit$1.label = 1;
                            if (mutexImpl2.lock(routableAccountsProvider$setup$1$3$1$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            routableAccountsProvider = routableAccountsProvider2;
                            mutexImpl = mutexImpl2;
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutexImpl = routableAccountsProvider$setup$1$3$1$emit$1.L$3;
                            listOfNotNull = routableAccountsProvider$setup$1$3$1$emit$1.L$2;
                            routableAccountsProvider = routableAccountsProvider$setup$1$3$1$emit$1.L$1;
                            SafeTrace.throwOnFailure(obj);
                        }
                        CollectionsKt__MutableCollectionsKt.removeAll(routableAccountsProvider.allAvailableAccounts, RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1.INSTANCE$2);
                        routableAccountsProvider.allAvailableAccounts.addAll(listOfNotNull);
                        mutexImpl.unlock(null);
                        return Unit.INSTANCE;
                    }
                }
                CollectionsKt__MutableCollectionsKt.removeAll(routableAccountsProvider.allAvailableAccounts, RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1.INSTANCE$2);
                routableAccountsProvider.allAvailableAccounts.addAll(listOfNotNull);
                mutexImpl.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutexImpl.unlock(null);
                throw th;
            }
            routableAccountsProvider$setup$1$3$1$emit$1 = new RoutableAccountsProvider$setup$1$3$1$emit$1(this, continuation);
            Object obj2 = routableAccountsProvider$setup$1$3$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = routableAccountsProvider$setup$1$3$1$emit$1.label;
            if (i != 0) {
            }
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return emit((SyncValueAccounts) obj, continuation);
                case 1:
                    return emit((List) obj, continuation);
                default:
                    return emit((PrincipalAccountToken) obj, continuation);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(List list, Continuation continuation) {
            RoutableAccountsProvider$setup$1$2$3$emit$1 routableAccountsProvider$setup$1$2$3$emit$1;
            int i;
            RoutableAccountsProvider routableAccountsProvider;
            MutexImpl mutexImpl;
            try {
                if (continuation instanceof RoutableAccountsProvider$setup$1$2$3$emit$1) {
                    routableAccountsProvider$setup$1$2$3$emit$1 = (RoutableAccountsProvider$setup$1$2$3$emit$1) continuation;
                    int i2 = routableAccountsProvider$setup$1$2$3$emit$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        routableAccountsProvider$setup$1$2$3$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = routableAccountsProvider$setup$1$2$3$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = routableAccountsProvider$setup$1$2$3$emit$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            RoutableAccountsProvider routableAccountsProvider2 = this.this$0;
                            MutexImpl mutexImpl2 = routableAccountsProvider2.mutex;
                            routableAccountsProvider$setup$1$2$3$emit$1.L$1 = routableAccountsProvider2;
                            routableAccountsProvider$setup$1$2$3$emit$1.L$2 = list;
                            routableAccountsProvider$setup$1$2$3$emit$1.L$3 = mutexImpl2;
                            routableAccountsProvider$setup$1$2$3$emit$1.label = 1;
                            if (mutexImpl2.lock(routableAccountsProvider$setup$1$2$3$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            routableAccountsProvider = routableAccountsProvider2;
                            mutexImpl = mutexImpl2;
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutexImpl = routableAccountsProvider$setup$1$2$3$emit$1.L$3;
                            list = routableAccountsProvider$setup$1$2$3$emit$1.L$2;
                            routableAccountsProvider = routableAccountsProvider$setup$1$2$3$emit$1.L$1;
                            SafeTrace.throwOnFailure(obj);
                        }
                        CollectionsKt__MutableCollectionsKt.removeAll(routableAccountsProvider.allAvailableAccounts, RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1.INSTANCE$1);
                        routableAccountsProvider.allAvailableAccounts.addAll(list);
                        mutexImpl.unlock(null);
                        return Unit.INSTANCE;
                    }
                }
                CollectionsKt__MutableCollectionsKt.removeAll(routableAccountsProvider.allAvailableAccounts, RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1.INSTANCE$1);
                routableAccountsProvider.allAvailableAccounts.addAll(list);
                mutexImpl.unlock(null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutexImpl.unlock(null);
                throw th;
            }
            routableAccountsProvider$setup$1$2$3$emit$1 = new RoutableAccountsProvider$setup$1$2$3$emit$1(this, continuation);
            Object obj2 = routableAccountsProvider$setup$1$2$3$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = routableAccountsProvider$setup$1$2$3$emit$1.label;
            if (i != 0) {
            }
        }
    }
}
