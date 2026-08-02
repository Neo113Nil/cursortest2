package ru.yandex.taxi.preorder.source;

import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.cqe0;
import defpackage.d0l0;
import defpackage.d6z;
import defpackage.fnx0;
import defpackage.h5l0;
import defpackage.in91;
import defpackage.iqz0;
import defpackage.iv70;
import defpackage.j73;
import defpackage.jst;
import defpackage.jv70;
import defpackage.kt00;
import defpackage.ktj0;
import defpackage.kv70;
import defpackage.leh;
import defpackage.mtj0;
import defpackage.mvg;
import defpackage.noe;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.ooe;
import defpackage.pex0;
import defpackage.q6l0;
import defpackage.soz0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xpe0;
import defpackage.ylm;
import defpackage.zlm;
import defpackage.zls;
import defpackage.zpe0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$3", f = "PreorderDrivingRouteProvider.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ cqe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$3(cqe0 cqe0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cqe0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$3 preorderDrivingRouteProvider$initFlow$$inlined$combine$1$3 = new PreorderDrivingRouteProvider$initFlow$$inlined$combine$1$3(this.this$0, (Continuation) obj3);
        preorderDrivingRouteProvider$initFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        preorderDrivingRouteProvider$initFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return preorderDrivingRouteProvider$initFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xpe0 xpe0Var;
        Object obj2;
        Object obj3;
        Object obj4;
        zlm zlmVar;
        Object obj5;
        Object obj6;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = false;
            Object obj7 = objArr[0];
            Object obj8 = objArr[1];
            Object obj9 = objArr[2];
            Object obj10 = objArr[3];
            Object obj11 = objArr[4];
            boolean booleanValue = ((Boolean) objArr[5]).booleanValue();
            q6l0 q6l0Var = (q6l0) obj11;
            RoadRestriction roadRestriction = (RoadRestriction) obj10;
            boolean booleanValue2 = ((Boolean) obj9).booleanValue();
            fnx0 fnx0Var = (fnx0) obj8;
            zpe0 zpe0Var = (zpe0) obj7;
            d0l0 d0l0Var = zpe0Var.a;
            ntj0 ntj0Var = zpe0Var.b;
            EmptyList emptyList = EmptyList.a;
            if (!booleanValue) {
                iv70 iv70Var = this.this$0.l;
                pex0 pex0Var = fnx0Var.c;
                ((kv70) iv70Var).getClass();
                switch (jv70.a[pex0Var.u0.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        d0l0.Companion.getClass();
                        xpe0Var = new xpe0(new zlm(h5l0.a, emptyList, false), d0l0Var, ntj0Var);
                        obj2 = null;
                        this.L$0 = obj2;
                        this.L$1 = obj2;
                        this.label = 1;
                        if (vprVar.emit(xpe0Var, this) == coroutineSingletons) {
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                        if (this.this$0.k.a(pex0Var)) {
                            xpe0Var = new xpe0(new zlm(d0l0Var.k(new ArrayList()), emptyList, false), d0l0Var, ntj0Var);
                            break;
                        } else {
                            ntj0Var.getClass();
                            if (ntj0Var instanceof ktj0) {
                                Object obj12 = ((ktj0) ntj0Var).b;
                                if (!((Collection) obj12).isEmpty()) {
                                    cqe0 cqe0Var = this.this$0;
                                    List list = (List) obj12;
                                    iqz0 iqz0Var = cqe0Var.o;
                                    if (!cqe0Var.b() && !((Boolean) cqe0Var.s.b()).booleanValue() && !list.isEmpty()) {
                                        list = Collections.singletonList(kotlin.collections.a.P(list));
                                    }
                                    List list2 = list;
                                    Iterator it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj3 = it.next();
                                            if (((DrivingRoute) obj3).getMetadata().getFlags().getHasTolls()) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    DrivingRoute drivingRoute = (DrivingRoute) obj3;
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj4 = it2.next();
                                            if (!((DrivingRoute) obj4).getMetadata().getFlags().getHasTolls()) {
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    List<DrivingRoute> A = j73.A(new DrivingRoute[]{(DrivingRoute) obj4, drivingRoute});
                                    ArrayList arrayList = (ArrayList) A;
                                    if (arrayList.isEmpty()) {
                                        zlmVar = new zlm(d0l0Var, emptyList, false);
                                    } else if (q6l0Var != null) {
                                        List singletonList = Collections.singletonList(new ylm(true, (DrivingRoute) kotlin.collections.a.P(A), DrivingRoutes$Type.OVERRIDE_MONOCHROME, "", cqe0Var.b(), iqz0Var.a(), q6l0Var));
                                        noe noeVar = cqe0Var.d;
                                        int size = d0l0Var.b.size();
                                        if (((ooe) noeVar).b(pex0Var) && size == 2) {
                                            z = true;
                                        }
                                        zlmVar = new zlm(d0l0Var, singletonList, z);
                                    } else if (arrayList.size() == 1 || !cqe0Var.b()) {
                                        zlmVar = new zlm(d0l0Var, Collections.singletonList(new ylm(true, (DrivingRoute) kotlin.collections.a.P(A), cqe0Var.a(true, false), "", true, iqz0Var.a(), null)), false);
                                    } else if (!pex0Var.X) {
                                        Iterator it3 = A.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj6 = it3.next();
                                                if (in91.d((DrivingRoute) obj6)) {
                                                }
                                            } else {
                                                obj6 = null;
                                            }
                                        }
                                        DrivingRoute drivingRoute2 = (DrivingRoute) obj6;
                                        if (drivingRoute2 == null) {
                                            jst.e.w(new IllegalStateException("freeway route expected but wasn't found"));
                                            zlmVar = new zlm(d0l0Var, emptyList, false);
                                        } else {
                                            zlmVar = new zlm(d0l0Var, Collections.singletonList(new ylm(true, drivingRoute2, cqe0Var.a(true, false), "", cqe0Var.b(), iqz0Var.a(), null)), false);
                                        }
                                    } else if (roadRestriction == RoadRestriction.TOLL_ONLY) {
                                        Iterator it4 = A.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                obj5 = it4.next();
                                                if (in91.e((DrivingRoute) obj5)) {
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        DrivingRoute drivingRoute3 = (DrivingRoute) obj5;
                                        if (drivingRoute3 == null) {
                                            jst.e.w(new IllegalStateException("route with restriction expected but wasn't found"));
                                            zlmVar = new zlm(d0l0Var, emptyList, false);
                                        } else {
                                            zlmVar = new zlm(d0l0Var, Collections.singletonList(new ylm(true, drivingRoute3, cqe0Var.a(true, false), "", cqe0Var.b(), iqz0Var.a(), null)), false);
                                        }
                                    } else {
                                        soz0 d = cqe0Var.n.d();
                                        ArrayList arrayList2 = new ArrayList(tcc.n(A, 10));
                                        for (DrivingRoute drivingRoute4 : A) {
                                            boolean z2 = drivingRoute4.getMetadata().getFlags().getHasTolls() == booleanValue2;
                                            arrayList2.add(new ylm(z2, drivingRoute4, cqe0Var.a(z2, true), d6z.Y(d, z2 ? d.d.a.b : d.d.a.a), true, iqz0Var.a(), null));
                                        }
                                        zlmVar = new zlm(d0l0Var, arrayList2, false);
                                    }
                                    cqe0 cqe0Var2 = this.this$0;
                                    kt00 kt00Var = cqe0Var2.i;
                                    leh lehVar = cqe0Var2.e;
                                    o oVar = cqe0Var2.f;
                                    lehVar.getClass();
                                    kt00Var.c = leh.a(oVar);
                                    kt00Var.a();
                                    mtj0 mtj0Var = ntj0.a;
                                    ArrayList b = zlmVar.b();
                                    ArrayList arrayList3 = new ArrayList(tcc.n(b, 10));
                                    Iterator it5 = b.iterator();
                                    while (it5.hasNext()) {
                                        arrayList3.add(((ylm) it5.next()).b);
                                    }
                                    xpe0Var = new xpe0(zlmVar, d0l0Var, new ktj0(arrayList3));
                                    obj2 = null;
                                    this.L$0 = obj2;
                                    this.L$1 = obj2;
                                    this.label = 1;
                                    if (vprVar.emit(xpe0Var, this) == coroutineSingletons) {
                                    }
                                }
                            }
                            kt00 kt00Var2 = this.this$0.i;
                            kt00Var2.c = false;
                            kt00Var2.a();
                            xpe0Var = new xpe0(new zlm(d0l0Var, emptyList, false), d0l0Var, ntj0Var);
                            obj2 = null;
                            this.L$0 = obj2;
                            this.L$1 = obj2;
                            this.label = 1;
                            if (vprVar.emit(xpe0Var, this) == coroutineSingletons) {
                            }
                        }
                        break;
                    default:
                        w511.b();
                        break;
                }
                return null;
            }
            d0l0.Companion.getClass();
            xpe0Var = new xpe0(new zlm(h5l0.a, emptyList, false), d0l0Var, ntj0Var);
            obj2 = null;
            this.L$0 = obj2;
            this.L$1 = obj2;
            this.label = 1;
            if (vprVar.emit(xpe0Var, this) == coroutineSingletons) {
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
