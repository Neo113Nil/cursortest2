package ru.yandex.taxi.widgets.data.repository;

import com.yandex.go.dto.response.OrderDto;
import defpackage.ae7;
import defpackage.bvf0;
import defpackage.c551;
import defpackage.cb80;
import defpackage.g050;
import defpackage.jl40;
import defpackage.kv6;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o801;
import defpackage.pi1;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vez0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x251;
import defpackage.y451;
import defpackage.yaf0;
import defpackage.ycc;
import defpackage.zls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lvpr;", "", "Lo801;", "", "Lx251;", "Lc551;", "requestDto", "Lzy11;", "<anonymous>", "(Lvpr;Lc551;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widgets.data.repository.WidgetsDtoRepository$createWidgetsFlow$2", f = "WidgetsDtoRepository.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN, 174}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class WidgetsDtoRepository$createWidgetsFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ pi1 $affectPolicy;
    final /* synthetic */ AtomicReference<Map<o801, List<x251>>> $lastWidgetsResponseReference;
    final /* synthetic */ yaf0 $screenType;
    final /* synthetic */ boolean $useAggregationApi;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ t this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.widgets.data.repository.WidgetsDtoRepository$createWidgetsFlow$2$1", f = "WidgetsDtoRepository.kt", l = {324, 185, 193, 202}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.widgets.data.repository.WidgetsDtoRepository$createWidgetsFlow$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$transformLatest;
        final /* synthetic */ Map<o801, List<x251>> $lastWidgetsResponse;
        final /* synthetic */ AtomicReference<Map<o801, List<x251>>> $lastWidgetsResponseReference;
        final /* synthetic */ c551 $requestDto;
        final /* synthetic */ yaf0 $screenType;
        final /* synthetic */ boolean $useAggregationApi;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        final /* synthetic */ t this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(t tVar, yaf0 yaf0Var, AtomicReference atomicReference, vpr vprVar, Map map, c551 c551Var, boolean z, Continuation continuation) {
            super(2, continuation);
            this.this$0 = tVar;
            this.$screenType = yaf0Var;
            this.$lastWidgetsResponseReference = atomicReference;
            this.$$this$transformLatest = vprVar;
            this.$lastWidgetsResponse = map;
            this.$requestDto = c551Var;
            this.$useAggregationApi = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$screenType, this.$lastWidgetsResponseReference, this.$$this$transformLatest, this.$lastWidgetsResponse, this.$requestDto, this.$useAggregationApi, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0177, code lost:
        
            if (r1.emit(r15, r14) == r0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0095, code lost:
        
            if (r15.a(r14) == r0) goto L50;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
        /* JADX WARN: Type inference failed for: r5v4, types: [g050] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            l8x a;
            t tVar;
            kotlinx.coroutines.sync.a aVar;
            c551 c551Var;
            Map<o801, List<x251>> map;
            boolean z;
            Throwable th;
            g050 g050Var;
            l8x l8xVar;
            Map<o801, List<x251>> map2;
            Map<o801, List<x251>> map3;
            List list;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    a = this.this$0.f.a(tseVar, this.$$this$transformLatest, this.$lastWidgetsResponse, this.$requestDto, this.$useAggregationApi);
                    tVar = this.this$0;
                    aVar = tVar.k;
                    c551Var = this.$requestDto;
                    map = this.$lastWidgetsResponse;
                    z = this.$useAggregationApi;
                    this.L$0 = null;
                    this.L$1 = a;
                    this.L$2 = aVar;
                    this.L$3 = tVar;
                    this.L$4 = c551Var;
                    this.L$5 = map;
                    this.Z$0 = z;
                    this.label = 1;
                } else if (i == 1) {
                    z = this.Z$0;
                    map = (Map) this.L$5;
                    c551Var = (c551) this.L$4;
                    tVar = (t) this.L$3;
                    ?? r5 = (g050) this.L$2;
                    a = (l8x) this.L$1;
                    kotlin.b.b(obj);
                    aVar = r5;
                } else if (i == 2) {
                    g050Var = (g050) this.L$2;
                    l8xVar = (l8x) this.L$1;
                    try {
                        kotlin.b.b(obj);
                        map2 = (Map) obj;
                        g050Var.d(null);
                        if (jl40.l(this.$screenType, yaf0.c)) {
                            y451 y451Var = this.this$0.e;
                            o801 o801Var = new o801(vez0.D(this.$screenType));
                            EmptyList emptyList = EmptyList.a;
                            List<x251> orDefault = map2.getOrDefault(o801Var, emptyList);
                            t tVar2 = this.this$0;
                            ArrayList arrayList = new ArrayList();
                            for (x251 x251Var : orDefault) {
                                tVar2.getClass();
                                if (x251Var instanceof cb80) {
                                    list = Collections.singletonList(new ae7(((cb80) x251Var).getA().getC()));
                                } else if (x251Var instanceof kv6) {
                                    List c = ((kv6) x251Var).getA().getC();
                                    ArrayList arrayList2 = new ArrayList(tcc.n(c, 10));
                                    Iterator it = c.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new ae7(((OrderDto) it.next()).getC()));
                                    }
                                    list = arrayList2;
                                } else {
                                    list = emptyList;
                                }
                                ycc.r(list, arrayList);
                            }
                            this.L$0 = null;
                            this.L$1 = l8xVar;
                            this.L$2 = map2;
                            this.label = 3;
                            if (y451Var.a.d(arrayList, this) != coroutineSingletons) {
                                map3 = map2;
                                map2 = map3;
                            }
                            return coroutineSingletons;
                        }
                        l8xVar.a(null);
                        this.$lastWidgetsResponseReference.set(map2);
                        vpr vprVar = this.$$this$transformLatest;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var.d(null);
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    map3 = (Map) this.L$2;
                    l8xVar = (l8x) this.L$1;
                    kotlin.b.b(obj);
                    map2 = map3;
                    l8xVar.a(null);
                    this.$lastWidgetsResponseReference.set(map2);
                    vpr vprVar2 = this.$$this$transformLatest;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
                ru.yandex.taxi.widgets.data.repository.widgets.a aVar2 = tVar.d;
                this.L$0 = null;
                this.L$1 = a;
                this.L$2 = aVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                Serializable b = aVar2.b(c551Var, map, z, this);
                if (b != coroutineSingletons) {
                    g050Var = aVar;
                    obj = b;
                    l8xVar = a;
                    map2 = (Map) obj;
                    g050Var.d(null);
                    if (jl40.l(this.$screenType, yaf0.c)) {
                    }
                    l8xVar.a(null);
                    this.$lastWidgetsResponseReference.set(map2);
                    vpr vprVar22 = this.$$this$transformLatest;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                th = th3;
                g050Var = aVar;
                g050Var.d(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsDtoRepository$createWidgetsFlow$2(t tVar, boolean z, AtomicReference atomicReference, pi1 pi1Var, yaf0 yaf0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = tVar;
        this.$useAggregationApi = z;
        this.$lastWidgetsResponseReference = atomicReference;
        this.$affectPolicy = pi1Var;
        this.$screenType = yaf0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WidgetsDtoRepository$createWidgetsFlow$2 widgetsDtoRepository$createWidgetsFlow$2 = new WidgetsDtoRepository$createWidgetsFlow$2(this.this$0, this.$useAggregationApi, this.$lastWidgetsResponseReference, this.$affectPolicy, this.$screenType, (Continuation) obj3);
        widgetsDtoRepository$createWidgetsFlow$2.L$0 = (vpr) obj;
        widgetsDtoRepository$createWidgetsFlow$2.L$1 = (c551) obj2;
        return widgetsDtoRepository$createWidgetsFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (defpackage.jl40.l(r14.m.get(), r2.b) != false) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WidgetsDtoRepository$createWidgetsFlow$2 widgetsDtoRepository$createWidgetsFlow$2;
        Map<o801, List<x251>> map;
        vpr vprVar = (vpr) this.L$0;
        c551 c551Var = (c551) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            t tVar = this.this$0;
            if (!this.$useAggregationApi) {
                tVar.getClass();
            } else if (!((Map) tVar.i.a.getValue()).isEmpty()) {
            }
            Map<o801, List<x251>> map2 = this.$lastWidgetsResponseReference.get();
            pi1 pi1Var = this.$affectPolicy;
            boolean z = this.$useAggregationApi;
            this.L$0 = vprVar;
            this.L$1 = c551Var;
            this.L$2 = map2;
            this.label = 1;
            Object b = pi1Var.b(c551Var, map2, vprVar, z, this);
            widgetsDtoRepository$createWidgetsFlow$2 = this;
            if (b != coroutineSingletons) {
                map = map2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        Map<o801, List<x251>> map3 = (Map) this.L$2;
        kotlin.b.b(obj);
        widgetsDtoRepository$createWidgetsFlow$2 = this;
        map = map3;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(widgetsDtoRepository$createWidgetsFlow$2.this$0, widgetsDtoRepository$createWidgetsFlow$2.$screenType, widgetsDtoRepository$createWidgetsFlow$2.$lastWidgetsResponseReference, vprVar, map, c551Var, widgetsDtoRepository$createWidgetsFlow$2.$useAggregationApi, null);
        widgetsDtoRepository$createWidgetsFlow$2.L$0 = null;
        widgetsDtoRepository$createWidgetsFlow$2.L$1 = null;
        widgetsDtoRepository$createWidgetsFlow$2.L$2 = null;
        widgetsDtoRepository$createWidgetsFlow$2.label = 2;
        return bvf0.n(anonymousClass1, widgetsDtoRepository$createWidgetsFlow$2) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
