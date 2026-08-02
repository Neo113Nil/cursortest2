package ru.yandex.logistics.sdk.cargo_form.core.impl.order;

import com.yandex.delivery.utils.dialogmanager.ErrorDialogInteractor$requestUnknownErrorDialog$2;
import defpackage.a0t;
import defpackage.c6f;
import defpackage.e0l0;
import defpackage.f6i;
import defpackage.g8e;
import defpackage.j5s;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.jwh;
import defpackage.mea0;
import defpackage.ny61;
import defpackage.o5s;
import defpackage.sr60;
import defpackage.w511;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.management.j;

/* loaded from: classes5.dex */
public final class a {
    public final f a;
    public final j b;
    public final c c;
    public final o5s d;
    public final g e;
    public final ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.c f;
    public final com.yandex.delivery.utils.dialogmanager.a g;
    public final jwh h;
    public final b i;

    public a(f fVar, j jVar, c cVar, o5s o5sVar, g gVar, ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.c cVar2, com.yandex.delivery.utils.dialogmanager.a aVar, jwh jwhVar, b bVar) {
        this.a = fVar;
        this.b = jVar;
        this.c = cVar;
        this.d = o5sVar;
        this.e = gVar;
        this.f = cVar2;
        this.g = aVar;
        this.h = jwhVar;
        this.i = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(e0l0 e0l0Var, c6f c6fVar, boolean z, ContinuationImpl continuationImpl) {
        FormCreateDeliveryInteractorImpl$launchCreateDelivery$1 formCreateDeliveryInteractorImpl$launchCreateDelivery$1;
        int i;
        f6i f6iVar;
        if (continuationImpl instanceof FormCreateDeliveryInteractorImpl$launchCreateDelivery$1) {
            formCreateDeliveryInteractorImpl$launchCreateDelivery$1 = (FormCreateDeliveryInteractorImpl$launchCreateDelivery$1) continuationImpl;
            int i2 = formCreateDeliveryInteractorImpl$launchCreateDelivery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formCreateDeliveryInteractorImpl$launchCreateDelivery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = formCreateDeliveryInteractorImpl$launchCreateDelivery$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formCreateDeliveryInteractorImpl$launchCreateDelivery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    formCreateDeliveryInteractorImpl$launchCreateDelivery$1.L$0 = null;
                    formCreateDeliveryInteractorImpl$launchCreateDelivery$1.L$1 = null;
                    formCreateDeliveryInteractorImpl$launchCreateDelivery$1.Z$0 = z;
                    formCreateDeliveryInteractorImpl$launchCreateDelivery$1.label = 1;
                    obj = c(e0l0Var, c6fVar, formCreateDeliveryInteractorImpl$launchCreateDelivery$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = formCreateDeliveryInteractorImpl$launchCreateDelivery$1.Z$0;
                    kotlin.b.b(obj);
                }
                Pair pair = (Pair) obj;
                f6iVar = (f6i) pair.getFirst();
                List list = (List) pair.getSecond();
                if (f6iVar != null) {
                    return EmptyList.a;
                }
                this.a.c(f6iVar, list, z);
                return list;
            }
        }
        formCreateDeliveryInteractorImpl$launchCreateDelivery$1 = new FormCreateDeliveryInteractorImpl$launchCreateDelivery$1(this, continuationImpl);
        Object obj3 = formCreateDeliveryInteractorImpl$launchCreateDelivery$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formCreateDeliveryInteractorImpl$launchCreateDelivery$1.label;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj3;
        f6iVar = (f6i) pair2.getFirst();
        List list2 = (List) pair2.getSecond();
        if (f6iVar != null) {
        }
    }

    public final Object b(sr60 sr60Var, mea0 mea0Var, Continuation continuation) {
        Object c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CRLReasonCodeExtension.REASON, sr60Var == null ? "offer" : mea0Var == null ? "payment" : "address");
        this.h.a.o("Delivery.OrderForm.Failed.CannotCreateOrder", null, linkedHashMap);
        c = this.g.c(new ErrorDialogInteractor$requestUnknownErrorDialog$2(), continuation);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x019e, code lost:
    
        if (b(r0, r10, r13) != r14) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(e0l0 e0l0Var, c6f c6fVar, ContinuationImpl continuationImpl) {
        FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$1 formCreateDeliveryInteractorImpl$prepareDeliveryDraft$1;
        int i;
        j6s b;
        List<sr60> list;
        List list2;
        Collection collection;
        List list3;
        mea0 mea0Var;
        e0l0 e0l0Var2;
        c6f c6fVar2;
        sr60 sr60Var;
        Collection collection2;
        if (continuationImpl instanceof FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$1) {
            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$1 = (FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$1) continuationImpl;
            int i2 = formCreateDeliveryInteractorImpl$prepareDeliveryDraft$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$1.label = i2 - Integer.MIN_VALUE;
                FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$1 formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12 = formCreateDeliveryInteractorImpl$prepareDeliveryDraft$1;
                Object obj = formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return new Pair(null, EmptyList.a);
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        collection2 = (List) formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2;
                        kotlin.b.b(obj);
                        return new Pair((f6i) obj, collection2);
                    }
                    mea0 mea0Var2 = (mea0) formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5;
                    List list4 = (List) formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4;
                    b = (j6s) formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3;
                    Collection collection3 = (List) formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2;
                    c6f c6fVar3 = (c6f) formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1;
                    e0l0 e0l0Var3 = (e0l0) formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0;
                    kotlin.b.b(obj);
                    mea0Var = mea0Var2;
                    list3 = list4;
                    collection = collection3;
                    e0l0Var2 = e0l0Var3;
                    c6fVar2 = c6fVar3;
                    j6s j6sVar = b;
                    FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$1 formCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$1 = new FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$1(3, this, a.class, "onOrderCreateFailed", "onOrderCreateFailed(Lru/yandex/logistics/sdk/cargo_form/core/api/models/Offer;Lcom/yandex/delivery/mapper/model/PaymentModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2 = collection;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$6 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label = 3;
                    obj = this.i.a(c6fVar2, list3, (a0t) obj, mea0Var, e0l0Var2, j6sVar, formCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$1, formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12);
                    if (obj != coroutineSingletons) {
                        collection2 = collection;
                        return new Pair((f6i) obj, collection2);
                    }
                    return coroutineSingletons;
                }
                ArrayList t = g8e.t(obj);
                b = this.c.b();
                boolean l = jl40.l(c6fVar, c6f.a);
                o5s o5sVar = this.d;
                if (l) {
                    j5s j5sVar = (j5s) o5sVar.c.a.getValue();
                    if (j5sVar != null && (sr60Var = j5sVar.a) != null) {
                        list = Collections.singletonList(sr60Var);
                        mea0 mea0Var3 = b == null ? b.b : null;
                        list2 = list;
                        if (list2 != null || list2.isEmpty() || e0l0Var.a.isEmpty()) {
                            sr60 sr60Var2 = list == null ? (sr60) kotlin.collections.a.R(list) : null;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0 = null;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1 = null;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2 = null;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3 = null;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4 = null;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5 = null;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label = 1;
                        } else {
                            for (sr60 sr60Var3 : list) {
                                UUID randomUUID = UUID.randomUUID();
                                t.add(randomUUID);
                                this.b.a(sr60Var3.a);
                                if (b != null) {
                                    this.f.a(b, randomUUID.toString());
                                }
                            }
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0 = e0l0Var;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1 = c6fVar;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2 = t;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3 = b;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4 = list;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5 = mea0Var3;
                            formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label = 2;
                            Object a = this.e.a(formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12);
                            if (a != coroutineSingletons) {
                                collection = t;
                                obj = a;
                                list3 = list;
                                mea0Var = mea0Var3;
                                e0l0Var2 = e0l0Var;
                                c6fVar2 = c6fVar;
                                j6s j6sVar2 = b;
                                FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$1 formCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$12 = new FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$1(3, this, a.class, "onOrderCreateFailed", "onOrderCreateFailed(Lru/yandex/logistics/sdk/cargo_form/core/api/models/Offer;Lcom/yandex/delivery/mapper/model/PaymentModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0 = null;
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1 = null;
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2 = collection;
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3 = null;
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4 = null;
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5 = null;
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$6 = null;
                                formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label = 3;
                                obj = this.i.a(c6fVar2, list3, (a0t) obj, mea0Var, e0l0Var2, j6sVar2, formCreateDeliveryInteractorImpl$prepareDeliveryDraft$deliveryDraft$12, formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12);
                                if (obj != coroutineSingletons) {
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    list = null;
                    if (b == null) {
                    }
                    list2 = list;
                    if (list2 != null) {
                    }
                    if (list == null) {
                    }
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label = 1;
                } else {
                    if (!jl40.l(c6fVar, c6f.b)) {
                        w511.b();
                        return null;
                    }
                    j5s j5sVar2 = (j5s) o5sVar.c.a.getValue();
                    if (j5sVar2 != null) {
                        list = j5sVar2.b;
                        if (b == null) {
                        }
                        list2 = list;
                        if (list2 != null) {
                        }
                        if (list == null) {
                        }
                        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0 = null;
                        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1 = null;
                        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2 = null;
                        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3 = null;
                        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4 = null;
                        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5 = null;
                        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label = 1;
                    }
                    list = null;
                    if (b == null) {
                    }
                    list2 = list;
                    if (list2 != null) {
                    }
                    if (list == null) {
                    }
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$0 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$1 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$2 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$3 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$4 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.L$5 = null;
                    formCreateDeliveryInteractorImpl$prepareDeliveryDraft$12.label = 1;
                }
                return new Pair((f6i) obj, collection2);
            }
        }
        formCreateDeliveryInteractorImpl$prepareDeliveryDraft$1 = new FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$1(this, continuationImpl);
        FormCreateDeliveryInteractorImpl$prepareDeliveryDraft$1 formCreateDeliveryInteractorImpl$prepareDeliveryDraft$122 = formCreateDeliveryInteractorImpl$prepareDeliveryDraft$1;
        Object obj2 = formCreateDeliveryInteractorImpl$prepareDeliveryDraft$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formCreateDeliveryInteractorImpl$prepareDeliveryDraft$122.label;
        if (i == 0) {
        }
    }
}
