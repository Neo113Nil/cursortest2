package ru.yandex.taxi.masstransit.threadschedule;

import androidx.lifecycle.Lifecycle;
import defpackage.a640;
import defpackage.avj0;
import defpackage.b640;
import defpackage.hj40;
import defpackage.hnm0;
import defpackage.jgy;
import defpackage.kne0;
import defpackage.kyh0;
import defpackage.mz30;
import defpackage.n940;
import defpackage.ny61;
import defpackage.pi00;
import defpackage.sy30;
import defpackage.tcc;
import defpackage.tdu;
import defpackage.ty30;
import defpackage.uy30;
import defpackage.vy30;
import defpackage.w511;
import defpackage.wy30;
import defpackage.y540;
import defpackage.z540;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.domain.q;
import ru.yandex.taxi.masstransit.experiment.d0;

/* loaded from: classes6.dex */
public final class e {
    public final Lifecycle a;
    public final d0 b;
    public final a640 c;
    public final q d;

    public e(Lifecycle lifecycle, d0 d0Var, a640 a640Var, q qVar) {
        this.a = lifecycle;
        this.b = d0Var;
        this.c = a640Var;
        this.d = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if (((defpackage.ty30) r10).c.isEmpty() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:
    
        if (((defpackage.vy30) r10).c.isEmpty() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c2, code lost:
    
        if (((defpackage.sy30) r10).c().isEmpty() == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, y540 y540Var, mz30 mz30Var, ContinuationImpl continuationImpl) {
        MtThreadScheduleRefreshInteractor$mapUiState$1 mtThreadScheduleRefreshInteractor$mapUiState$1;
        int i;
        String str;
        wy30 wy30Var;
        ?? arrayList;
        a640 a640Var = eVar.c;
        if (continuationImpl instanceof MtThreadScheduleRefreshInteractor$mapUiState$1) {
            mtThreadScheduleRefreshInteractor$mapUiState$1 = (MtThreadScheduleRefreshInteractor$mapUiState$1) continuationImpl;
            int i2 = mtThreadScheduleRefreshInteractor$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtThreadScheduleRefreshInteractor$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtThreadScheduleRefreshInteractor$mapUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtThreadScheduleRefreshInteractor$mapUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hj40 hj40Var = y540Var.a;
                    if (hj40Var != null && (str = hj40Var.c) != null) {
                        if (str.length() == 0) {
                            str = null;
                        }
                        if (str != null) {
                            hnm0 hnm0Var = new hnm0(str, y540Var.b.f);
                            q qVar = eVar.d;
                            mtThreadScheduleRefreshInteractor$mapUiState$1.L$0 = y540Var;
                            mtThreadScheduleRefreshInteractor$mapUiState$1.L$1 = mz30Var;
                            mtThreadScheduleRefreshInteractor$mapUiState$1.L$2 = null;
                            mtThreadScheduleRefreshInteractor$mapUiState$1.L$3 = null;
                            mtThreadScheduleRefreshInteractor$mapUiState$1.label = 1;
                            obj = qVar.a(hnm0Var, mtThreadScheduleRefreshInteractor$mapUiState$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return a640Var.e(y540Var);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mz30Var = (mz30) mtThreadScheduleRefreshInteractor$mapUiState$1.L$1;
                y540Var = (y540) mtThreadScheduleRefreshInteractor$mapUiState$1.L$0;
                kotlin.b.b(obj);
                wy30Var = (wy30) obj;
                if (wy30Var != null) {
                    String d = jgy.d(wy30Var);
                    r0 r0Var = mz30Var.a;
                    r0Var.getClass();
                    r0Var.m(null, d);
                }
                if (wy30Var != null) {
                    boolean z = wy30Var instanceof ty30;
                    if (!z) {
                        if (!(wy30Var instanceof vy30)) {
                            if (!(wy30Var instanceof uy30)) {
                                if (!(wy30Var instanceof sy30)) {
                                    w511.b();
                                    return null;
                                }
                            }
                            avj0 avj0Var = (avj0) a640Var.b;
                            tdu f = a640Var.f(avj0Var.h(kyh0.mt_schedule_header), y540Var.a);
                            if (z) {
                                List list = ((ty30) wy30Var).c;
                                arrayList = new ArrayList(tcc.n(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(a640Var.g(y540Var, ((n940) it.next()).b));
                                }
                            } else if (wy30Var instanceof uy30) {
                                arrayList = Collections.singletonList(a640Var.g(y540Var, avj0Var.i(kyh0.mt_interval, ((uy30) wy30Var).c)));
                            } else if (wy30Var instanceof vy30) {
                                List list2 = ((vy30) wy30Var).c;
                                arrayList = new ArrayList(tcc.n(list2, 10));
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(a640Var.g(y540Var, ((n940) it2.next()).b));
                                }
                            } else {
                                if (!(wy30Var instanceof sy30)) {
                                    w511.b();
                                    return null;
                                }
                                List c = ((sy30) wy30Var).c();
                                arrayList = new ArrayList(tcc.n(c, 10));
                                Iterator it3 = c.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(a640Var.g(y540Var, ((n940) it3.next()).b));
                                }
                            }
                            return new z540(f, (List) arrayList, (kne0) null);
                        }
                    }
                }
                return a640Var.e(y540Var);
            }
        }
        mtThreadScheduleRefreshInteractor$mapUiState$1 = new MtThreadScheduleRefreshInteractor$mapUiState$1(eVar, continuationImpl);
        Object obj2 = mtThreadScheduleRefreshInteractor$mapUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtThreadScheduleRefreshInteractor$mapUiState$1.label;
        if (i != 0) {
        }
        wy30Var = (wy30) obj2;
        if (wy30Var != null) {
        }
        if (wy30Var != null) {
        }
        return a640Var.e(y540Var);
    }

    public final Object b(y540 y540Var, b640 b640Var, mz30 mz30Var, Continuation continuation) {
        return new o(new o(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.X(this.b.b(), new MtThreadScheduleRefreshInteractor$refreshUiState$$inlined$flatMapLatest$1(null, this, b640Var)), new MtThreadScheduleRefreshInteractor$refreshUiState$3(this, y540Var, mz30Var, null)), new MtThreadScheduleRefreshInteractor$refreshUiState$4(this, y540Var, null)), new MtThreadScheduleRefreshInteractor$refreshUiState$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new pi00(27, b640Var), continuation);
    }
}
