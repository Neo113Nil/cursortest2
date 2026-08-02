package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.fa90;
import defpackage.g8e;
import defpackage.g92;
import defpackage.h8n;
import defpackage.i8n;
import defpackage.j8n;
import defpackage.lqi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vng;
import defpackage.vpr;
import defpackage.y8n;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.DynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1", f = "DynamicHeaderInfoInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class DynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ j8n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1(Continuation continuation, j8n j8nVar) {
        super(3, continuation);
        this.this$0 = j8nVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1 dynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1 = new DynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        dynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        dynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return dynamicHeaderInfoInteractor$getTitleSubtitleFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr rol0Var;
        Long l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            h8n h8nVar = (h8n) this.L$1;
            String str = h8nVar.a;
            String str2 = h8nVar.b;
            fa90 fa90Var = h8nVar.c;
            lqi lqiVar = h8nVar.d;
            long I = (lqiVar == null || (l = lqiVar.a) == null) ? vng.I() : l.longValue();
            List<y8n> list = lqiVar != null ? lqiVar.c : null;
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                this.this$0.getClass();
                int I2 = (int) ((vng.I() - I) / 1000);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (y8n y8nVar : list) {
                    int i3 = y8nVar.a;
                    i2 += i3;
                    y8n y8nVar2 = i2 > I2 ? new y8n(Math.min(i2 - I2, i3), y8nVar.b, y8nVar.c) : null;
                    if (y8nVar2 != null) {
                        arrayList.add(y8nVar2);
                    }
                }
                boolean isEmpty = arrayList.isEmpty();
                Collection collection = arrayList;
                if (isEmpty) {
                    collection = Collections.singletonList(kotlin.collections.a.Z(list));
                }
                rol0Var = new rol0(new DynamicHeaderInfoInteractor$getDynamicStringFlow$1((List) collection, null));
            } else if (fa90Var == null) {
                rol0Var = new g92(2, new i8n(str, str2, g8e.p(str, " ", str2), g8e.p(str, " ", str2)));
            } else {
                Ref$LongRef ref$LongRef = new Ref$LongRef();
                ref$LongRef.element = TimeUnit.SECONDS.toMillis(fa90Var.a) - vng.I();
                rol0Var = new rol0(new DynamicHeaderInfoInteractor$getTitleSubtitleFlow$1$1(ref$LongRef, this.this$0, str, str2, fa90Var, null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(rol0Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
