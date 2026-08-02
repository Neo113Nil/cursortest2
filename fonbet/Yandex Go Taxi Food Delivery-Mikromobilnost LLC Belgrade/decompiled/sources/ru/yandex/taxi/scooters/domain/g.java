package ru.yandex.taxi.scooters.domain;

import com.yandex.go.coroutines.CoroutinesCompatKt$ignore$$inlined$transform$1;
import com.yandex.mapkit.geometry.BoundingBox;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.dvw;
import defpackage.euo0;
import defpackage.gh00;
import defpackage.j18;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.qfn0;
import defpackage.rfn0;
import defpackage.rol0;
import defpackage.sfn0;
import defpackage.vfn0;
import defpackage.w511;
import defpackage.wnj;
import defpackage.x950;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class g {
    public final ah00 a;
    public final a3v b;
    public final c c;
    public final euo0 d;
    public final vfn0 e;
    public final sfn0 f;

    public g(ah00 ah00Var, a3v a3vVar, c cVar, euo0 euo0Var, vfn0 vfn0Var, sfn0 sfn0Var) {
        this.a = ah00Var;
        this.b = a3vVar;
        this.c = cVar;
        this.d = euo0Var;
        this.e = vfn0Var;
        this.f = sfn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if ((r10 == null ? r4 : c(r10, r0)) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r8.c.a(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderFocusInteractor$handleFocus$1 scootersDetailedOrderFocusInteractor$handleFocus$1;
        int i;
        if (continuationImpl instanceof ScootersDetailedOrderFocusInteractor$handleFocus$1) {
            scootersDetailedOrderFocusInteractor$handleFocus$1 = (ScootersDetailedOrderFocusInteractor$handleFocus$1) continuationImpl;
            int i2 = scootersDetailedOrderFocusInteractor$handleFocus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderFocusInteractor$handleFocus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderFocusInteractor$handleFocus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderFocusInteractor$handleFocus$1.label;
                Object obj3 = zy11.a;
                vfn0 vfn0Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = qfn0.a[((ScootersDetailedOrderFocusInteractor$FocusType) vfn0Var.a.getValue()).ordinal()];
                    euo0 euo0Var = this.d;
                    if (i3 == 1) {
                        if (((x950) euo0Var.a.getValue()) instanceof wnj) {
                            scootersDetailedOrderFocusInteractor$handleFocus$1.Z$0 = z;
                            scootersDetailedOrderFocusInteractor$handleFocus$1.label = 1;
                        }
                        if (z) {
                        }
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        if (((x950) euo0Var.a.getValue()) instanceof wnj) {
                            scootersDetailedOrderFocusInteractor$handleFocus$1.Z$0 = z;
                            scootersDetailedOrderFocusInteractor$handleFocus$1.label = 2;
                            BoundingBox boundingBox = this.f.a;
                        }
                        if (z) {
                        }
                    }
                    return obj2;
                }
                if (i == 1) {
                    z = scootersDetailedOrderFocusInteractor$handleFocus$1.Z$0;
                    kotlin.b.b(obj);
                    if (z) {
                        vfn0Var.a(ScootersDetailedOrderFocusInteractor$FocusType.FOCUS_ON_ROUTE);
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = scootersDetailedOrderFocusInteractor$handleFocus$1.Z$0;
                    kotlin.b.b(obj);
                    if (z) {
                        vfn0Var.a(ScootersDetailedOrderFocusInteractor$FocusType.FOCUS_ON_USER);
                    }
                }
                return obj3;
            }
        }
        scootersDetailedOrderFocusInteractor$handleFocus$1 = new ScootersDetailedOrderFocusInteractor$handleFocus$1(this, continuationImpl);
        Object obj4 = scootersDetailedOrderFocusInteractor$handleFocus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderFocusInteractor$handleFocus$1.label;
        Object obj32 = zy11.a;
        vfn0 vfn0Var2 = this.e;
        if (i != 0) {
        }
        return obj32;
    }

    public final kotlinx.coroutines.flow.internal.h b() {
        return kotlinx.coroutines.flow.e.K(this.e.a, new rol0(new CoroutinesCompatKt$ignore$$inlined$transform$1(new jqr(this.b.m1(), new ScootersDetailedOrderFocusInteractor$handleFocusRectChange$1(this, null), 3), null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(BoundingBox boundingBox, ContinuationImpl continuationImpl) {
        ScootersDetailedOrderFocusInteractor$positionOnBoundingBox$1 scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1;
        int i;
        if (continuationImpl instanceof ScootersDetailedOrderFocusInteractor$positionOnBoundingBox$1) {
            scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1 = (ScootersDetailedOrderFocusInteractor$positionOnBoundingBox$1) continuationImpl;
            int i2 = scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.L$0 = boundingBox;
                    scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1));
                    j18Var.u();
                    ((gh00) this.a).A(boundingBox, new rfn0(j18Var));
                    if (j18Var.s() == coroutineSingletons) {
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
        scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1 = new ScootersDetailedOrderFocusInteractor$positionOnBoundingBox$1(this, continuationImpl);
        Object obj2 = scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderFocusInteractor$positionOnBoundingBox$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
