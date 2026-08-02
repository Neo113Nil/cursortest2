package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import defpackage.f6i;
import defpackage.fyc;
import defpackage.i4f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4f;
import defpackage.ps50;
import defpackage.r4f;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lr4f;", "<anonymous>", "(Ltse;)Lr4f;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.CreateDeliveryTask$execute$2", f = "CreateDeliveryTask.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CreateDeliveryTask$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ f6i $draft;
    final /* synthetic */ List<UUID> $localUuids;
    final /* synthetic */ boolean $needValidation;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.CreateDeliveryTask$execute$2$2", f = "CreateDeliveryTask.kt", l = {44}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.CreateDeliveryTask$execute$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ List<UUID> $localUuids;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, List list, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$localUuids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$localUuids, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    fyc b = this.this$0.b.b(null);
                    this.label = 1;
                    if (b.s(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                List<UUID> list = this.$localUuids;
                this = this.this$0;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.d.b((UUID) it.next());
                }
            } catch (Throwable unused) {
                List<UUID> list2 = this.$localUuids;
                d dVar = this.this$0;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dVar.d.b((UUID) it2.next());
                }
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.CreateDeliveryTask$execute$2$3", f = "CreateDeliveryTask.kt", l = {62}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.CreateDeliveryTask$execute$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        final /* synthetic */ ServerRejectedDeliveryException $e;
        final /* synthetic */ List<UUID> $localUuids;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d dVar, ServerRejectedDeliveryException serverRejectedDeliveryException, List list, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$e = serverRejectedDeliveryException;
            this.$localUuids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$e, this.$localUuids, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.d] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    fyc b = this.this$0.b.b(this.$e.getFailureDescription());
                    this.label = 1;
                    if (b.s(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                List<UUID> list = this.$localUuids;
                this = this.this$0;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.d.b((UUID) it.next());
                }
            } catch (Throwable unused) {
                List<UUID> list2 = this.$localUuids;
                d dVar = this.this$0;
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dVar.d.b((UUID) it2.next());
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDeliveryTask$execute$2(List list, d dVar, f6i f6iVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$localUuids = list;
        this.this$0 = dVar;
        this.$draft = f6iVar;
        this.$needValidation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreateDeliveryTask$execute$2 createDeliveryTask$execute$2 = new CreateDeliveryTask$execute$2(this.$localUuids, this.this$0, this.$draft, this.$needValidation, continuation);
        createDeliveryTask$execute$2.L$0 = obj;
        return createDeliveryTask$execute$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateDeliveryTask$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5 A[Catch: all -> 0x0019, TryCatch #10 {all -> 0x0019, blocks: (B:7:0x0015, B:8:0x006f, B:44:0x0089, B:31:0x00eb, B:33:0x00f5, B:34:0x0129, B:42:0x0109, B:23:0x0158, B:13:0x00c1), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        UnknownResponseException e;
        ServerRejectedDeliveryException e2;
        ServerRejectDraftException e3;
        boolean isEmpty;
        d dVar;
        String failureDescription;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.b.b(obj);
                try {
                    isEmpty = this.$localUuids.isEmpty();
                    dVar = this.this$0;
                } catch (DraftInconsistentResponseException unused) {
                    i = 0;
                    d.a(this.this$0, "Draft response is empty or offers.size != deliveryIds.size");
                    if (i == 0) {
                    }
                    return p4f.a;
                } catch (ServerRejectDraftException e4) {
                    i = 0;
                    e3 = e4;
                    c cVar = this.this$0.c;
                    ps50 networkError = e3.getNetworkError();
                    cVar.getClass();
                    cVar.c(c.a(networkError), "Draft: " + networkError.a());
                    tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$localUuids, null), 3);
                    if (i == 0) {
                    }
                    return p4f.a;
                } catch (ServerRejectedDeliveryException e5) {
                    i = 0;
                    e2 = e5;
                    failureDescription = e2.getFailureDescription();
                    ps50 networkError2 = e2.getNetworkError();
                    if (failureDescription == null) {
                    }
                    tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, e2, this.$localUuids, null), 3);
                    if (i == 0) {
                    }
                    return p4f.a;
                } catch (UnknownResponseException e6) {
                    i = 0;
                    e = e6;
                    d.a(this.this$0, "Delivery draft has unknown response: " + e.getResponse());
                    if (i == 0) {
                    }
                    return p4f.a;
                } catch (UserCanceledRetryOfDraft unused2) {
                    i = 0;
                    if (i == 0) {
                    }
                    return p4f.a;
                } catch (Throwable th) {
                    coroutineSingletons = null;
                    th = th;
                    if (coroutineSingletons == null) {
                        d.a(this.this$0, "Delivery draft failed");
                        List<UUID> list = this.$localUuids;
                        d dVar2 = this.this$0;
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            dVar2.a.l((UUID) it.next());
                        }
                    }
                    throw th;
                }
                if (isEmpty) {
                    d.a(dVar, "Delivery draft failed");
                    List<UUID> list2 = this.$localUuids;
                    d dVar3 = this.this$0;
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        dVar3.a.l((UUID) it2.next());
                    }
                    return p4f.a;
                }
                ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.interactor.a aVar = dVar.e;
                f6i f6iVar = this.$draft;
                List<UUID> list3 = this.$localUuids;
                boolean z = this.$needValidation;
                this.L$0 = tseVar;
                this.I$0 = 0;
                this.label = 1;
                Object a = aVar.a(f6iVar, list3, z, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = 0;
                obj = a;
            } else {
                if (i2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                try {
                    kotlin.b.b(obj);
                } catch (DraftInconsistentResponseException unused3) {
                    d.a(this.this$0, "Draft response is empty or offers.size != deliveryIds.size");
                    if (i == 0) {
                        d.a(this.this$0, "Delivery draft failed");
                        List<UUID> list4 = this.$localUuids;
                        d dVar4 = this.this$0;
                        Iterator<T> it3 = list4.iterator();
                        while (it3.hasNext()) {
                            dVar4.a.l((UUID) it3.next());
                        }
                    }
                    return p4f.a;
                } catch (ServerRejectDraftException e7) {
                    e3 = e7;
                    c cVar2 = this.this$0.c;
                    ps50 networkError3 = e3.getNetworkError();
                    cVar2.getClass();
                    cVar2.c(c.a(networkError3), "Draft: " + networkError3.a());
                    tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$localUuids, null), 3);
                    if (i == 0) {
                        d.a(this.this$0, "Delivery draft failed");
                        List<UUID> list5 = this.$localUuids;
                        d dVar5 = this.this$0;
                        Iterator<T> it4 = list5.iterator();
                        while (it4.hasNext()) {
                            dVar5.a.l((UUID) it4.next());
                        }
                    }
                    return p4f.a;
                } catch (ServerRejectedDeliveryException e8) {
                    e2 = e8;
                    failureDescription = e2.getFailureDescription();
                    ps50 networkError22 = e2.getNetworkError();
                    if (failureDescription == null) {
                        c cVar3 = this.this$0.c;
                        cVar3.getClass();
                        cVar3.c(new i4f(failureDescription), "Commit: Delivery events returned failure");
                    } else if (networkError22 != null) {
                        c cVar4 = this.this$0.c;
                        cVar4.getClass();
                        cVar4.c(c.a(networkError22), "Commit: " + networkError22.a());
                    }
                    tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, e2, this.$localUuids, null), 3);
                    if (i == 0) {
                        d.a(this.this$0, "Delivery draft failed");
                        List<UUID> list6 = this.$localUuids;
                        d dVar6 = this.this$0;
                        Iterator<T> it5 = list6.iterator();
                        while (it5.hasNext()) {
                            dVar6.a.l((UUID) it5.next());
                        }
                    }
                    return p4f.a;
                } catch (UnknownResponseException e9) {
                    e = e9;
                    d.a(this.this$0, "Delivery draft has unknown response: " + e.getResponse());
                    if (i == 0) {
                        d.a(this.this$0, "Delivery draft failed");
                        List<UUID> list7 = this.$localUuids;
                        d dVar7 = this.this$0;
                        Iterator<T> it6 = list7.iterator();
                        while (it6.hasNext()) {
                            dVar7.a.l((UUID) it6.next());
                        }
                    }
                    return p4f.a;
                } catch (UserCanceledRetryOfDraft unused4) {
                    if (i == 0) {
                        d.a(this.this$0, "Delivery draft failed");
                        List<UUID> list8 = this.$localUuids;
                        d dVar8 = this.this$0;
                        Iterator<T> it7 = list8.iterator();
                        while (it7.hasNext()) {
                            dVar8.a.l((UUID) it7.next());
                        }
                    }
                    return p4f.a;
                }
            }
            return (r4f) obj;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
