package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import defpackage.jdv;
import defpackage.ny61;
import defpackage.scc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.w9n0;
import defpackage.x43;
import defpackage.x9n0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$LongRef;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionFrameResult;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionState;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Ref$LongRef b;
    public final /* synthetic */ c c;
    public final /* synthetic */ x9n0 w;
    public final /* synthetic */ ScootersVehicleDetectionOnPhotoExperiment.b x;

    public b(vpr vprVar, Ref$LongRef ref$LongRef, c cVar, x9n0 x9n0Var, ScootersVehicleDetectionOnPhotoExperiment.b bVar) {
        this.b = ref$LongRef;
        this.c = cVar;
        this.w = x9n0Var;
        this.x = bVar;
        this.a = vprVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(8:17|18|19|20|21|22|(1:24)(11:28|(1:30)|31|(1:33)(3:82|(3:85|(1:94)(3:90|91|92)|83)|96)|34|(1:36)(3:67|(3:70|(1:79)(3:75|76|77)|68)|81)|37|(2:38|(2:40|(1:43)(1:42))(2:65|66))|44|(1:(2:47|(1:(1:50)(1:52))(2:53|54))(2:55|(1:57)(1:58)))(1:(1:60)(2:61|(1:63)(1:64)))|51)|25))(2:101|(3:103|12|13)(8:104|105|(2:107|27)|20|21|22|(0)(0)|25))))|112|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0181, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x009b, code lost:
    
        defpackage.zgz.a("Completion photo vehicle detection frame processing failed", r0);
        r0 = ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionFrameResult.Unavailable;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0179, code lost:
    
        if (r4.emit(r0, r2) != r3) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [vpr] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, vpr] */
    /* JADX WARN: Type inference failed for: r4v6, types: [vpr] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1 scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1;
        int i;
        ScootersCompletionPhotoVehicleDetectionFrameResult scootersCompletionPhotoVehicleDetectionFrameResult;
        ScootersCompletionPhotoVehicleDetectionFrameResult scootersCompletionPhotoVehicleDetectionFrameResult2;
        int i2;
        int i3;
        Object obj2;
        ScootersCompletionPhotoVehicleDetectionState scootersCompletionPhotoVehicleDetectionState;
        Object obj3;
        jdv jdvVar;
        long nanoTime;
        if (continuation instanceof ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1) {
            scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1 = (ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1) continuation;
            int i4 = scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.label = i4 - Integer.MIN_VALUE;
                Object obj4 = scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.result;
                Object obj5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.label;
                c cVar = this.c;
                Object obj6 = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    ?? r4 = this.a;
                    jdvVar = (jdv) obj;
                    nanoTime = System.nanoTime();
                    Ref$LongRef ref$LongRef = this.b;
                    if (nanoTime < ref$LongRef.element) {
                        return zy11.a;
                    }
                    ref$LongRef.element = 100000000 + nanoTime;
                    ScootersVehicleDetectionOnPhotoExperiment.b bVar = this.x;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$0 = null;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$1 = null;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$2 = jdvVar;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$3 = r4;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.J$0 = nanoTime;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.label = 1;
                    obj4 = c.c(cVar, jdvVar, bVar, scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1);
                    i = r4;
                    if (obj4 == obj5) {
                        return obj5;
                    }
                    scootersCompletionPhotoVehicleDetectionFrameResult = (ScootersCompletionPhotoVehicleDetectionFrameResult) obj4;
                    ?? r42 = i;
                    x9n0 x9n0Var = this.w;
                    int i5 = x9n0Var.b;
                    scootersCompletionPhotoVehicleDetectionFrameResult2 = ScootersCompletionPhotoVehicleDetectionFrameResult.Unavailable;
                    x43 x43Var = x9n0Var.e;
                    if (scootersCompletionPhotoVehicleDetectionFrameResult != scootersCompletionPhotoVehicleDetectionFrameResult2) {
                    }
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$0 = obj3;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$1 = obj3;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$2 = obj3;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$3 = obj3;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$4 = obj3;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.J$0 = nanoTime;
                    scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj4);
                        return zy11.a;
                    }
                    nanoTime = scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.J$0;
                    ?? r43 = (vpr) scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$3;
                    jdvVar = (jdv) scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$2;
                    try {
                        kotlin.b.b(obj4);
                        i = r43;
                        scootersCompletionPhotoVehicleDetectionFrameResult = (ScootersCompletionPhotoVehicleDetectionFrameResult) obj4;
                        ?? r422 = i;
                        x9n0 x9n0Var2 = this.w;
                        int i52 = x9n0Var2.b;
                        scootersCompletionPhotoVehicleDetectionFrameResult2 = ScootersCompletionPhotoVehicleDetectionFrameResult.Unavailable;
                        x43 x43Var2 = x9n0Var2.e;
                        if (scootersCompletionPhotoVehicleDetectionFrameResult != scootersCompletionPhotoVehicleDetectionFrameResult2) {
                            x43Var2.clear();
                            scootersCompletionPhotoVehicleDetectionState = ScootersCompletionPhotoVehicleDetectionState.Idle;
                            x9n0Var2.f = scootersCompletionPhotoVehicleDetectionState;
                            obj3 = null;
                        } else {
                            if (x43Var2.size() == x9n0Var2.a) {
                                x43Var2.removeFirst();
                            }
                            x43Var2.addLast(scootersCompletionPhotoVehicleDetectionFrameResult);
                            if (x43Var2.isEmpty()) {
                                i2 = 0;
                            } else {
                                Iterator it = x43Var2.iterator();
                                i2 = 0;
                                while (it.hasNext()) {
                                    if (((ScootersCompletionPhotoVehicleDetectionFrameResult) it.next()) == ScootersCompletionPhotoVehicleDetectionFrameResult.VehicleDetected && (i2 = i2 + 1) < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                }
                            }
                            if (x43Var2.isEmpty()) {
                                i3 = 0;
                            } else {
                                Iterator it2 = x43Var2.iterator();
                                i3 = 0;
                                while (it2.hasNext()) {
                                    if (((ScootersCompletionPhotoVehicleDetectionFrameResult) it2.next()) == ScootersCompletionPhotoVehicleDetectionFrameResult.VehicleNotDetected && (i3 = i3 + 1) < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                }
                            }
                            int size = x43Var2.size() - 1;
                            int i6 = 0;
                            while (true) {
                                if (-1 >= size) {
                                    obj2 = obj6;
                                    break;
                                }
                                obj2 = obj6;
                                if (x43Var2.get(size) != ScootersCompletionPhotoVehicleDetectionFrameResult.VehicleNotDetected) {
                                    break;
                                }
                                i6++;
                                size--;
                                obj6 = obj2;
                            }
                            int i7 = w9n0.a[x9n0Var2.f.ordinal()];
                            if (i7 == 1) {
                                scootersCompletionPhotoVehicleDetectionState = i2 >= i52 ? ScootersCompletionPhotoVehicleDetectionState.VehicleDetected : i3 >= x9n0Var2.c ? ScootersCompletionPhotoVehicleDetectionState.VehicleNotDetected : ScootersCompletionPhotoVehicleDetectionState.Idle;
                            } else if (i7 == 2) {
                                scootersCompletionPhotoVehicleDetectionState = i6 >= x9n0Var2.d ? ScootersCompletionPhotoVehicleDetectionState.VehicleNotDetected : ScootersCompletionPhotoVehicleDetectionState.VehicleDetected;
                            } else {
                                if (i7 != 3) {
                                    w511.b();
                                    return obj2;
                                }
                                scootersCompletionPhotoVehicleDetectionState = i2 >= i52 ? ScootersCompletionPhotoVehicleDetectionState.VehicleDetected : ScootersCompletionPhotoVehicleDetectionState.VehicleNotDetected;
                            }
                            x9n0Var2.f = scootersCompletionPhotoVehicleDetectionState;
                            obj3 = obj2;
                        }
                        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$0 = obj3;
                        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$1 = obj3;
                        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$2 = obj3;
                        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$3 = obj3;
                        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.L$4 = obj3;
                        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.J$0 = nanoTime;
                        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.label = 2;
                    } finally {
                        c.b(cVar, jdvVar);
                    }
                }
            }
        }
        scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1 = new ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1(this, continuation);
        Object obj42 = scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.result;
        Object obj52 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1$invokeSuspend$$inlined$transform$1$1$1.label;
        c cVar2 = this.c;
        Object obj62 = null;
        if (i != 0) {
        }
    }
}
