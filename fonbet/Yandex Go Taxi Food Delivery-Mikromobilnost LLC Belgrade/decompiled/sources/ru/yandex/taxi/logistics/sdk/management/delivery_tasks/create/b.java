package ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create;

import defpackage.bvf0;
import defpackage.cot;
import defpackage.csb1;
import defpackage.go2;
import defpackage.h3y;
import defpackage.ho2;
import defpackage.io2;
import defpackage.ny61;
import defpackage.ps50;
import defpackage.rzh;
import defpackage.szh;
import defpackage.tcc;
import defpackage.tzh;
import defpackage.u7i;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import ru.yandex.taxi.logistics.sdk.delivery.create.OrderCommitApi;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2CommitDeliveryDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.api.form.V2CommitRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycommit.DeliveryCommitRequestDto;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscriptionImpl;

/* loaded from: classes9.dex */
public final class b {
    public final AppVisibilitySubscriptionImpl a;
    public final u7i b;
    public final cot c;

    public b(AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, u7i u7iVar, cot cotVar) {
        this.a = appVisibilitySubscriptionImpl;
        this.b = u7iVar;
        this.c = cotVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0129, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r0) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.ui.a.a(r15, r0) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x013a -> B:12:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, tzh tzhVar, ContinuationImpl continuationImpl) {
        CommitTask$commitUntilSuccess$1 commitTask$commitUntilSuccess$1;
        int i;
        Ref$LongRef ref$LongRef;
        Ref$LongRef ref$LongRef2;
        tzh tzhVar2;
        io2 io2Var;
        Object a;
        bVar.getClass();
        if (continuationImpl instanceof CommitTask$commitUntilSuccess$1) {
            commitTask$commitUntilSuccess$1 = (CommitTask$commitUntilSuccess$1) continuationImpl;
            int i2 = commitTask$commitUntilSuccess$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commitTask$commitUntilSuccess$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commitTask$commitUntilSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commitTask$commitUntilSuccess$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = 60000L;
                    if (kotlinx.coroutines.a.p(commitTask$commitUntilSuccess$1.get_context())) {
                    }
                    return zy11.a;
                }
                if (i == 1) {
                    ref$LongRef2 = (Ref$LongRef) commitTask$commitUntilSuccess$1.L$1;
                    tzhVar2 = (tzh) commitTask$commitUntilSuccess$1.L$0;
                    kotlin.b.b(obj);
                    io2Var = (io2) obj;
                    if (!(io2Var instanceof ho2)) {
                    }
                    return zy11.a;
                }
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$LongRef2 = (Ref$LongRef) commitTask$commitUntilSuccess$1.L$1;
                    tzhVar2 = (tzh) commitTask$commitUntilSuccess$1.L$0;
                    kotlin.b.b(obj);
                    ref$LongRef = ref$LongRef2;
                    tzhVar = tzhVar2;
                    if (kotlinx.coroutines.a.p(commitTask$commitUntilSuccess$1.get_context())) {
                        h3y h3yVar = (h3y) bVar.c.b;
                        List a2 = tzhVar.a();
                        int b = tzhVar.b();
                        if (a2.isEmpty()) {
                            throw new DraftInconsistentResponseException();
                        }
                        if (tzhVar instanceof rzh) {
                            a = ((OrderCommitApi) h3yVar.get()).b(new DeliveryCommitRequestDto((String) a2.get(0), b));
                        } else {
                            if (!(tzhVar instanceof szh)) {
                                w511.b();
                                return null;
                            }
                            OrderCommitApi orderCommitApi = (OrderCommitApi) h3yVar.get();
                            List list = a2;
                            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new V2CommitDeliveryDto((String) it.next()));
                            }
                            a = orderCommitApi.a(new V2CommitRequestDto(arrayList));
                        }
                        commitTask$commitUntilSuccess$1.L$0 = tzhVar;
                        commitTask$commitUntilSuccess$1.L$1 = ref$LongRef;
                        commitTask$commitUntilSuccess$1.L$2 = null;
                        commitTask$commitUntilSuccess$1.label = 1;
                        ru.yandex.taxi.logistics.sdk.network.b bVar2 = (ru.yandex.taxi.logistics.sdk.network.b) a;
                        Object e = bVar2.e(bVar2.a, commitTask$commitUntilSuccess$1);
                        if (e != coroutineSingletons) {
                            tzhVar2 = tzhVar;
                            ref$LongRef2 = ref$LongRef;
                            obj = e;
                            io2Var = (io2) obj;
                            if (!(io2Var instanceof ho2)) {
                                if (!(io2Var instanceof go2)) {
                                    w511.b();
                                    return null;
                                }
                                go2 go2Var = (go2) io2Var;
                                ps50 ps50Var = go2Var.a;
                                if (csb1.g(ps50Var)) {
                                    throw new ServerRejectedDeliveryException(ps50Var, null, 2);
                                }
                                Long l = go2Var.b.a;
                                if (l != null) {
                                    ref$LongRef2.element = l.longValue();
                                }
                                long j = ref$LongRef2.element;
                                commitTask$commitUntilSuccess$1.L$0 = tzhVar2;
                                commitTask$commitUntilSuccess$1.L$1 = ref$LongRef2;
                                commitTask$commitUntilSuccess$1.L$2 = null;
                                commitTask$commitUntilSuccess$1.label = 2;
                            }
                        }
                        return coroutineSingletons;
                    }
                    return zy11.a;
                }
                ref$LongRef2 = (Ref$LongRef) commitTask$commitUntilSuccess$1.L$1;
                tzhVar2 = (tzh) commitTask$commitUntilSuccess$1.L$0;
                kotlin.b.b(obj);
                AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl = bVar.a;
                commitTask$commitUntilSuccess$1.L$0 = tzhVar2;
                commitTask$commitUntilSuccess$1.L$1 = ref$LongRef2;
                commitTask$commitUntilSuccess$1.L$2 = null;
                commitTask$commitUntilSuccess$1.label = 3;
            }
        }
        commitTask$commitUntilSuccess$1 = new CommitTask$commitUntilSuccess$1(bVar, continuationImpl);
        Object obj2 = commitTask$commitUntilSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commitTask$commitUntilSuccess$1.label;
        if (i != 0) {
        }
    }

    public final Object b(tzh tzhVar, ContinuationImpl continuationImpl) {
        return bvf0.n(new CommitTask$execute$2(this, tzhVar, null), continuationImpl);
    }
}
