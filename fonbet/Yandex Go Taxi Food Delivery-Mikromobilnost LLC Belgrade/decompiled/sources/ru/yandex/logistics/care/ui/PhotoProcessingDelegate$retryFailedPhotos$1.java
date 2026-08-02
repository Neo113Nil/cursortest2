package ru.yandex.logistics.care.ui;

import defpackage.fzd;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.vhb0;
import defpackage.whb0;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.PhotoProcessingDelegate$retryFailedPhotos$1", f = "PhotoProcessingDelegate.kt", l = {177}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class PhotoProcessingDelegate$retryFailedPhotos$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ n this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.logistics.care.ui.PhotoProcessingDelegate$retryFailedPhotos$1$2", f = "PhotoProcessingDelegate.kt", l = {174}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.logistics.care.ui.PhotoProcessingDelegate$retryFailedPhotos$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ List<vhb0> $failedPhotos;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List list, n nVar, Continuation continuation) {
            super(2, continuation);
            this.$failedPhotos = list;
            this.this$0 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$failedPhotos, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            n nVar;
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.b.b(obj);
                List<vhb0> list = this.$failedPhotos;
                n nVar2 = this.this$0;
                it = list.iterator();
                nVar = nVar2;
                i = 0;
            } else {
                if (i2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.I$0;
                it = (Iterator) this.L$2;
                nVar = (n) this.L$1;
                kotlin.b.b(obj);
            }
            while (it.hasNext()) {
                vhb0 vhb0Var = (vhb0) it.next();
                File file = vhb0Var.a;
                fzd fzdVar = vhb0Var.b;
                this.L$0 = null;
                this.L$1 = nVar;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 1;
                if (n.b(nVar, file, fzdVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoProcessingDelegate$retryFailedPhotos$1(n nVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PhotoProcessingDelegate$retryFailedPhotos$1 photoProcessingDelegate$retryFailedPhotos$1 = new PhotoProcessingDelegate$retryFailedPhotos$1(this.this$0, continuation);
        photoProcessingDelegate$retryFailedPhotos$1.L$0 = obj;
        return photoProcessingDelegate$retryFailedPhotos$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotoProcessingDelegate$retryFailedPhotos$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Map map;
        LinkedHashMap linkedHashMap;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Collection values = ((Map) this.this$0.f.getValue()).values();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : values) {
                if (obj2 instanceof vhb0) {
                    arrayList.add(obj2);
                }
            }
            r0 r0Var = this.this$0.f;
            do {
                value = r0Var.getValue();
                map = (Map) value;
                int d = gw00.d(tcc.n(arrayList, 10));
                if (d < 16) {
                    d = 16;
                }
                linkedHashMap = new LinkedHashMap(d);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    vhb0 vhb0Var = (vhb0) it.next();
                    Pair pair = new Pair(vhb0Var.b.c, new whb0(vhb0Var.a));
                    linkedHashMap.put(pair.c(), pair.f());
                }
            } while (!r0Var.k(value, kotlin.collections.b.n(map, linkedHashMap)));
            tje.N(tseVar, null, null, new AnonymousClass2(arrayList, this.this$0, null), 3);
            n nVar = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (n.c(nVar, this) == coroutineSingletons) {
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
