package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.go.zone.dto.objects.VerticalType;
import com.yandex.go.zone.dto.objects.ZoneVertical;
import com.yandex.go.zone.model.Zone;
import defpackage.a440;
import defpackage.b440;
import defpackage.e2r;
import defpackage.h73;
import defpackage.igu0;
import defpackage.j5y;
import defpackage.jl40;
import defpackage.k110;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o140;
import defpackage.pi00;
import defpackage.s5r;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v340;
import defpackage.vpr;
import defpackage.w211;
import defpackage.w340;
import defpackage.w511;
import defpackage.wls;
import defpackage.wy30;
import defpackage.x340;
import defpackage.y340;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzs;
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
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;
import ru.yandex.taxi.masstransit.utils.RefreshState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$updateStopState$2", f = "MtStopStateInteractor.kt", l = {257}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtStopStateInteractor$updateStopState$2 extends SuspendLambda implements wls {
    final /* synthetic */ igu0 $stopModel;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Lz340;", "Lkotlin/Pair;", "Lk110;", "Lru/yandex/taxi/masstransit/utils/RefreshState;", "<destruct>", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$updateStopState$2$2", f = "MtStopStateInteractor.kt", l = {160, 161, 169, HProv.PP_EXPORT_CSP, 174, 179, 181}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.masstransit.stop.interactor.MtStopStateInteractor$updateStopState$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        final /* synthetic */ igu0 $stopModel;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(igu0 igu0Var, Continuation continuation, g gVar) {
            super(3, continuation);
            this.$stopModel = igu0Var;
            this.this$0 = gVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$stopModel, (Continuation) obj3, this.this$0);
            anonymousClass2.L$0 = (vpr) obj;
            anonymousClass2.L$1 = (Pair) obj2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0116, code lost:
        
            if (r2 != r3) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x00c1, code lost:
        
            if (r10 == r3) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x00df, code lost:
        
            if (r10 == r3) goto L98;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0259 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0258 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
        /* JADX WARN: Type inference failed for: r2v51, types: [java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            k110 k110Var;
            RefreshState refreshState;
            Object emit;
            Object emit2;
            k110 k110Var2;
            Object b;
            Object a;
            o140 o140Var;
            k110 k110Var3;
            LinkedHashMap linkedHashMap;
            Zone zone;
            g gVar;
            x340 x340Var;
            List list;
            int i;
            vpr vprVar = (vpr) this.L$0;
            Pair pair = (Pair) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            zy11 zy11Var = zy11.a;
            int i3 = 3;
            boolean z = true;
            switch (i2) {
                case 0:
                    kotlin.b.b(obj);
                    k110Var = (k110) pair.getFirst();
                    refreshState = (RefreshState) pair.getSecond();
                    int i4 = b440.a[refreshState.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                w511.b();
                                return null;
                            }
                            if (refreshState == RefreshState.ERROR_LOADING) {
                                long j = k110Var.n;
                                this.L$0 = vprVar;
                                this.L$1 = null;
                                this.L$2 = k110Var;
                                this.L$3 = null;
                                this.label = 3;
                                if (kotlinx.coroutines.a.i(j, this) != coroutineSingletons) {
                                    k110Var2 = k110Var;
                                    k110Var = k110Var2;
                                }
                            }
                            ru.yandex.taxi.masstransit.datasource.schedule.b bVar = this.this$0.b;
                            String str = this.$stopModel.a;
                            this.L$0 = vprVar;
                            this.L$1 = null;
                            this.L$2 = k110Var;
                            this.L$3 = null;
                            this.label = 4;
                            b = bVar.b(str, this);
                            break;
                        } else {
                            w340 w340Var = new w340(this.$stopModel.c);
                            this.L$0 = vprVar;
                            this.L$1 = null;
                            this.L$2 = k110Var;
                            this.L$3 = refreshState;
                            this.label = 2;
                            emit2 = vprVar.emit(w340Var, this);
                            break;
                        }
                    } else {
                        y340 y340Var = new y340(this.$stopModel.c);
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.L$2 = k110Var;
                        this.L$3 = refreshState;
                        this.label = 1;
                        emit = vprVar.emit(y340Var, this);
                        break;
                    }
                    return coroutineSingletons;
                case 1:
                    refreshState = (RefreshState) this.L$3;
                    k110Var = (k110) this.L$2;
                    kotlin.b.b(obj);
                    emit = obj;
                    if (refreshState == RefreshState.ERROR_LOADING) {
                    }
                    ru.yandex.taxi.masstransit.datasource.schedule.b bVar2 = this.this$0.b;
                    String str2 = this.$stopModel.a;
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = k110Var;
                    this.L$3 = null;
                    this.label = 4;
                    b = bVar2.b(str2, this);
                    break;
                case 2:
                    refreshState = (RefreshState) this.L$3;
                    k110Var = (k110) this.L$2;
                    kotlin.b.b(obj);
                    emit2 = obj;
                    if (refreshState == RefreshState.ERROR_LOADING) {
                    }
                    ru.yandex.taxi.masstransit.datasource.schedule.b bVar22 = this.this$0.b;
                    String str22 = this.$stopModel.a;
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = k110Var;
                    this.L$3 = null;
                    this.label = 4;
                    b = bVar22.b(str22, this);
                    break;
                case 3:
                    k110Var2 = (k110) this.L$2;
                    kotlin.b.b(obj);
                    k110Var = k110Var2;
                    ru.yandex.taxi.masstransit.datasource.schedule.b bVar222 = this.this$0.b;
                    String str222 = this.$stopModel.a;
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = k110Var;
                    this.L$3 = null;
                    this.label = 4;
                    b = bVar222.b(str222, this);
                    break;
                case 4:
                    k110 k110Var4 = (k110) this.L$2;
                    kotlin.b.b(obj);
                    k110Var = k110Var4;
                    b = obj;
                    o140 o140Var2 = (o140) b;
                    if (o140Var2 != null) {
                        List list2 = o140Var2.b;
                        if (!list2.isEmpty()) {
                            g gVar2 = this.this$0;
                            e2r k = kotlin.sequences.b.k(new h73(1, list2), new j5y(gVar2, gVar2.e.d(), i3));
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            s5r s5rVar = new s5r(k);
                            while (s5rVar.hasNext()) {
                                Object next = s5rVar.next();
                                wy30 wy30Var = (wy30) next;
                                linkedHashMap2.put(new w211(wy30Var.a(), wy30Var.b()), next);
                            }
                            g gVar3 = this.this$0;
                            zzs zzsVar = this.$stopModel.b;
                            this.L$0 = vprVar;
                            this.L$1 = null;
                            this.L$2 = k110Var;
                            this.L$3 = null;
                            this.L$4 = o140Var2;
                            this.L$5 = linkedHashMap2;
                            this.label = 6;
                            a = g.a(gVar3, zzsVar, this);
                            if (a != coroutineSingletons) {
                                o140Var = o140Var2;
                                k110Var3 = k110Var;
                                linkedHashMap = linkedHashMap2;
                                zone = (Zone) a;
                                gVar = this.this$0;
                                gVar.getClass();
                                if (zone != null && (list = zone.w) != null) {
                                    i = a440.a[((MtMainRedirectExperiment) gVar.r.b()).b.ordinal()];
                                    if (i != 1) {
                                        List list3 = list;
                                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                            Iterator it = list3.iterator();
                                            while (it.hasNext()) {
                                                if (((ZoneVertical) it.next()).c == VerticalType.MIXED) {
                                                    boolean z2 = z;
                                                    x340Var = new x340(o140Var, linkedHashMap, k110Var3, z2, zone == null ? zone.a : null, this.$stopModel.b);
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.L$3 = null;
                                                    this.L$4 = null;
                                                    this.L$5 = null;
                                                    this.L$6 = null;
                                                    this.Z$0 = z2;
                                                    this.label = 7;
                                                    if (vprVar.emit(x340Var, this) == coroutineSingletons) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (i != 2) {
                                            w511.b();
                                            return null;
                                        }
                                        List<ZoneVertical> list4 = list;
                                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                            for (ZoneVertical zoneVertical : list4) {
                                                VerticalType verticalType = zoneVertical.c;
                                                if (verticalType != VerticalType.TRANSPORT && (verticalType != VerticalType.MIXED || !jl40.l(zoneVertical.a, "transport"))) {
                                                }
                                                boolean z22 = z;
                                                x340Var = new x340(o140Var, linkedHashMap, k110Var3, z22, zone == null ? zone.a : null, this.$stopModel.b);
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.L$4 = null;
                                                this.L$5 = null;
                                                this.L$6 = null;
                                                this.Z$0 = z22;
                                                this.label = 7;
                                                if (vprVar.emit(x340Var, this) == coroutineSingletons) {
                                                    return zy11Var;
                                                }
                                            }
                                        }
                                    }
                                }
                                z = false;
                                boolean z222 = z;
                                x340Var = new x340(o140Var, linkedHashMap, k110Var3, z222, zone == null ? zone.a : null, this.$stopModel.b);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.Z$0 = z222;
                                this.label = 7;
                                if (vprVar.emit(x340Var, this) == coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    v340 v340Var = new v340(this.$stopModel.c);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                    if (vprVar.emit(v340Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 5:
                    kotlin.b.b(obj);
                    return zy11Var;
                case 6:
                    ?? r2 = (Map) this.L$5;
                    o140 o140Var3 = (o140) this.L$4;
                    k110 k110Var5 = (k110) this.L$2;
                    kotlin.b.b(obj);
                    linkedHashMap = r2;
                    o140Var = o140Var3;
                    k110Var3 = k110Var5;
                    a = obj;
                    zone = (Zone) a;
                    gVar = this.this$0;
                    gVar.getClass();
                    if (zone != null) {
                        i = a440.a[((MtMainRedirectExperiment) gVar.r.b()).b.ordinal()];
                        if (i != 1) {
                        }
                        break;
                    }
                    z = false;
                    boolean z2222 = z;
                    x340Var = new x340(o140Var, linkedHashMap, k110Var3, z2222, zone == null ? zone.a : null, this.$stopModel.b);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.Z$0 = z2222;
                    this.label = 7;
                    if (vprVar.emit(x340Var, this) == coroutineSingletons) {
                    }
                    break;
                case 7:
                    kotlin.b.b(obj);
                    return zy11Var;
                default:
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtStopStateInteractor$updateStopState$2(igu0 igu0Var, Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$stopModel = igu0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtStopStateInteractor$updateStopState$2(this.$stopModel, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtStopStateInteractor$updateStopState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr d = com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.X(ru.yandex.taxi.experiments.d.b(this.this$0.d.a), new MtStopStateInteractor$updateStopState$2$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0)), new AnonymousClass2(this.$stopModel, null, this.this$0)), new MtStopStateInteractor$updateStopState$2$invokeSuspend$$inlined$start$1(new y340(this.$stopModel.c), null));
            tt2 tt2Var = this.this$0.f;
            sjh sjhVar = uyj.a;
            tpr F = kotlinx.coroutines.flow.e.F(d, mdh.b);
            g gVar = this.this$0;
            o oVar = new o(F, new MtStopStateInteractor$updateStopState$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            pi00 pi00Var = new pi00(26, gVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(pi00Var, this) == coroutineSingletons) {
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
