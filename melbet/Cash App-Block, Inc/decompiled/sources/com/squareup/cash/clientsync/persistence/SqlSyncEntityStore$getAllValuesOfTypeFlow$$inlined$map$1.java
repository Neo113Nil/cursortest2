package com.squareup.cash.clientsync.persistence;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.Sync_entity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class SqlSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1 implements Flow {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowQuery$mapToList$$inlined$map$1 $this_unsafeTransform$inlined;
    public final /* synthetic */ SqlSyncEntityStore this$0;

    /* renamed from: com.squareup.cash.clientsync.persistence.SqlSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;
        public final /* synthetic */ SqlSyncEntityStore this$0;

        /* renamed from: com.squareup.cash.clientsync.persistence.SqlSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, SqlSyncEntityStore sqlSyncEntityStore, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.this$0 = sqlSyncEntityStore;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            SqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1;
            int i2;
            int i3 = this.$r8$classId;
            SqlSyncEntityStore sqlSyncEntityStore = this.this$0;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i3) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i4 = anonymousClass1.label;
                        if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(sqlSyncEntityStore.toSyncEntity((Sync_entity) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                default:
                    if (continuation instanceof SqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) {
                        sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = (SqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) continuation;
                        int i5 = sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                        if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                            sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                            Object obj3 = sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                List list2 = (List) obj;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(sqlSyncEntityStore.toSyncEntity((Sync_entity) it2.next()));
                                }
                                sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList2, sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1) == coroutineSingletons3) {
                                    break;
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1 = new SqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1(this, continuation);
                    Object obj32 = sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = sqlSyncEntityStore$getAllEntitiesOfTypeFlow$$inlined$map$1$2$1.label;
                    if (i2 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SqlSyncEntityStore$getAllValuesOfTypeFlow$$inlined$map$1(FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1, SqlSyncEntityStore sqlSyncEntityStore, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flowQuery$mapToList$$inlined$map$1;
        this.this$0 = sqlSyncEntityStore;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        SqlSyncEntityStore sqlSyncEntityStore = this.this$0;
        FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1 = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, sqlSyncEntityStore, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flowQuery$mapToList$$inlined$map$1.collect(new AnonymousClass2(flowCollector, sqlSyncEntityStore, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
