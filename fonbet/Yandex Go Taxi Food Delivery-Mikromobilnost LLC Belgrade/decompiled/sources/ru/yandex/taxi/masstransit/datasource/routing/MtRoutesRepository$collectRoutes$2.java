package ru.yandex.taxi.masstransit.datasource.routing;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.dms;
import defpackage.ey30;
import defpackage.g6u;
import defpackage.g92;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pd01;
import defpackage.py30;
import defpackage.sjh;
import defpackage.sk91;
import defpackage.su30;
import defpackage.tje;
import defpackage.tse;
import defpackage.uu30;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2", f = "MtRoutesRepository.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRoutesRepository$collectRoutes$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Luu30;", "route", "Lru/yandex/taxi/masstransit/experiment/f;", "summaryConfig", "Lpd01;", "trainsFlowConfig", "", "syncInProgress", "Ley30;", "<anonymous>", "(Luu30;Lru/yandex/taxi/masstransit/experiment/f;Lpd01;Z)Ley30;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2$1", f = "MtRoutesRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements dms {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ boolean Z$0;
        int label;

        @Override // defpackage.dms
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(5, (Continuation) obj5);
            anonymousClass1.L$0 = (uu30) obj;
            anonymousClass1.L$1 = (ru.yandex.taxi.masstransit.experiment.f) obj2;
            anonymousClass1.L$2 = (pd01) obj3;
            anonymousClass1.Z$0 = booleanValue;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            uu30 uu30Var = (uu30) this.L$0;
            ru.yandex.taxi.masstransit.experiment.f fVar = (ru.yandex.taxi.masstransit.experiment.f) this.L$1;
            pd01 pd01Var = (pd01) this.L$2;
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new ey30(uu30Var, fVar, pd01Var, z);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ley30;", "configs", "Lzy11;", "<anonymous>", "(Ley30;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2$2", f = "MtRoutesRepository.kt", l = {81}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f fVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((ey30) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            ArrayList arrayList;
            ArrayList e;
            su30 su30Var;
            Object obj2;
            ey30 ey30Var = (ey30) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                boolean z = ey30Var.d;
                uu30 uu30Var = ey30Var.a;
                f fVar = this.this$0;
                if (z) {
                    r0 r0Var = fVar.i;
                    do {
                        value2 = r0Var.getValue();
                    } while (!r0Var.k(value2, py30.a((py30) value2, null, uu30Var, HProv.PP_SET_PIN)));
                    return zy11Var;
                }
                r0 r0Var2 = fVar.i;
                do {
                    value = r0Var2.getValue();
                } while (!r0Var2.k(value, py30.a((py30) value, null, uu30Var, 99)));
                this.this$0.c.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                MtRoutesRepository$collectRoutes$2$2$mtRoutes$1 mtRoutesRepository$collectRoutes$2$2$mtRoutes$1 = new MtRoutesRepository$collectRoutes$2$2$mtRoutes$1(this.this$0, ey30Var, null);
                this.L$0 = ey30Var;
                this.label = 1;
                obj = tje.k0(g6uVar, mtRoutesRepository$collectRoutes$2$2$mtRoutes$1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            Object value3 = ((Result) obj).getValue();
            f fVar2 = this.this$0;
            Throwable a = Result.a(value3);
            if (a != null) {
                jst.e.k(a, "Error during getting masstransit routes from router");
                r0 r0Var3 = fVar2.i;
                py30 py30Var = new py30((ArrayList) null, (su30) null, a, ey30Var.a, ey30Var.b, ey30Var.c, 7);
                r0Var3.getClass();
                r0Var3.m(null, py30Var);
                return zy11Var;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((List) value3).iterator();
            while (it.hasNext()) {
                su30 j = fVar2.b.j((Route) it.next(), ey30Var.a.a(), ey30Var.b, ey30Var.c, 0L);
                if (j != null) {
                    arrayList2.add(j);
                }
            }
            if (ey30Var.c.a) {
                fVar2.getClass();
                arrayList = f.c(arrayList2);
            } else {
                arrayList = arrayList2;
            }
            r0 r0Var4 = fVar2.i;
            TransportOnSummaryExperiment.g gVar = ey30Var.b.j;
            boolean z2 = gVar.a;
            Integer num = gVar.c;
            if (!z2 || num == null) {
                e = f.e(arrayList);
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    su30 su30Var2 = (su30) obj2;
                    if (sk91.a(su30Var2) && su30Var2.c.a <= num.intValue()) {
                        break;
                    }
                }
                su30 su30Var3 = (su30) obj2;
                if (su30Var3 == null) {
                    e = f.e(arrayList);
                } else {
                    int indexOf = arrayList.indexOf(su30Var3) + 1;
                    e = kotlin.collections.a.m0(f.e(arrayList.subList(indexOf, arrayList.size())), arrayList.subList(0, indexOf));
                }
            }
            ArrayList arrayList3 = e;
            ArrayList c = f.c(arrayList2);
            if (c.isEmpty()) {
                su30Var = (su30) kotlin.collections.a.R(arrayList2);
            } else {
                su30Var = (su30) kotlin.collections.a.R(c);
                if (su30Var == null) {
                    su30Var = (su30) kotlin.collections.a.R(arrayList2);
                }
            }
            py30 py30Var2 = new py30(arrayList3, su30Var, (Throwable) null, ey30Var.a, ey30Var.b, ey30Var.c, 12);
            r0Var4.getClass();
            r0Var4.m(null, py30Var2);
            return zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lzy11;", "", "throwable", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2$3", f = "MtRoutesRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.datasource.routing.MtRoutesRepository$collectRoutes$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(f fVar, Continuation continuation) {
            super(3, continuation);
            this.this$0 = fVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, (Continuation) obj3);
            anonymousClass3.L$0 = (Throwable) obj2;
            zy11 zy11Var = zy11.a;
            anonymousClass3.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th = (Throwable) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.i;
            py30 py30Var = new py30((ArrayList) null, (su30) null, th, this.this$0.g.a(), (ru.yandex.taxi.masstransit.experiment.f) null, (pd01) null, 103);
            r0Var.getClass();
            r0Var.m(null, py30Var);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRoutesRepository$collectRoutes$2(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRoutesRepository$collectRoutes$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtRoutesRepository$collectRoutes$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = new o(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.m(kotlinx.coroutines.flow.e.d(this.this$0.g.b), this.this$0.e.b(), new g92(2, this.this$0.f.b()), kotlinx.coroutines.flow.e.d(this.this$0.h.a), new AnonymousClass1(5, null)), new AnonymousClass2(this.this$0, null)), new AnonymousClass3(this.this$0, null));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.j(oVar, this) == coroutineSingletons) {
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
