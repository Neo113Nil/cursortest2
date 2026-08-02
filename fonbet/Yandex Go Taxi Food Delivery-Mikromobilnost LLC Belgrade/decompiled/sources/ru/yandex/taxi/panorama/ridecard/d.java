package ru.yandex.taxi.panorama.ridecard;

import android.graphics.Bitmap;
import defpackage.a8y0;
import defpackage.a9y0;
import defpackage.ac20;
import defpackage.b9y0;
import defpackage.c4v;
import defpackage.c9y0;
import defpackage.dlk0;
import defpackage.e8y0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.g92;
import defpackage.i3y;
import defpackage.i8y0;
import defpackage.iik0;
import defpackage.jl40;
import defpackage.jok0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.ohk0;
import defpackage.pfv;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tb90;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.vyx0;
import defpackage.yvf0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.analytics.q;

/* loaded from: classes6.dex */
public final class d implements jok0 {
    public final tt2 a;
    public final a8y0 b;
    public final ru.yandex.taxi.utils.d c;
    public final i8y0 d;
    public final c9y0 e;
    public final yvf0 f;
    public final e8y0 g;
    public final oep0 h;
    public final pwy0 i;
    public final ac20 j;
    public final vyx0 k;
    public final i3y l = kotlin.a.a(new iik0(3, this));

    public d(tt2 tt2Var, a8y0 a8y0Var, ru.yandex.taxi.utils.d dVar, i8y0 i8y0Var, c9y0 c9y0Var, yvf0 yvf0Var, e8y0 e8y0Var, oep0 oep0Var, pwy0 pwy0Var, ac20 ac20Var, vyx0 vyx0Var) {
        this.a = tt2Var;
        this.b = a8y0Var;
        this.c = dVar;
        this.d = i8y0Var;
        this.e = c9y0Var;
        this.f = yvf0Var;
        this.g = e8y0Var;
        this.h = oep0Var;
        this.i = pwy0Var;
        this.j = ac20Var;
        this.k = vyx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, ru.yandex.taxi.panorama.d dVar2, String str, ContinuationImpl continuationImpl) {
        RideCardTaxiPanoramaInteractorImpl$getPinBitmap$1 rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1;
        int i;
        String str2;
        Bitmap bitmap;
        dVar.getClass();
        if (continuationImpl instanceof RideCardTaxiPanoramaInteractorImpl$getPinBitmap$1) {
            rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1 = (RideCardTaxiPanoramaInteractorImpl$getPinBitmap$1) continuationImpl;
            int i2 = rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    str2 = jl40.l(str, "a") ? dVar2.g : dVar2.h;
                    dVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    RideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1 rideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1 = new RideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1(dVar, str2, null);
                    rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.L$2 = str2;
                    rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.label = 1;
                    obj = tje.k0(mdhVar, rideCardTaxiPanoramaInteractorImpl$getPinBitmap$pinIcon$1, rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.L$2;
                    kotlin.b.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    return bitmap;
                }
                String o = g8e.o("error empty when load icon: ", str2);
                i8y0 i8y0Var = dVar.d;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(o);
                i8y0Var.getClass();
                i8y0.a(illegalArgumentException, o);
                return null;
            }
        }
        rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1 = new RideCardTaxiPanoramaInteractorImpl$getPinBitmap$1(dVar, continuationImpl);
        Object obj2 = rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardTaxiPanoramaInteractorImpl$getPinBitmap$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d5, code lost:
    
        if (r11 != r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, ru.yandex.taxi.panorama.d dVar2, tb90 tb90Var, ContinuationImpl continuationImpl) {
        RideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1 rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1;
        int i;
        String str;
        Object obj;
        String str2;
        Object a;
        Throwable a2;
        i8y0 i8y0Var = dVar.d;
        ru.yandex.taxi.utils.d dVar3 = dVar.c;
        if (continuationImpl instanceof RideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1) {
            rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1 = (RideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1) continuationImpl;
            int i2 = rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.label;
                pfv pfvVar = pfv.a;
                int i3 = 2;
                int i4 = 1;
                String str3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str4 = dVar2.n.d;
                    if (str4.length() == 0) {
                        return null;
                    }
                    if (!evu0.J(tb90Var.d) && dVar2.f.contains("ride_card")) {
                        c4v c4vVar = new c4v(str3, tb90Var.d, i4);
                        rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$0 = null;
                        rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$1 = tb90Var;
                        rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$2 = str4;
                        rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.label = 1;
                        Object a3 = dVar3.a(c4vVar, pfvVar, rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1);
                        if (a3 != coroutineSingletons) {
                            obj = a3;
                            str2 = str4;
                        }
                        return coroutineSingletons;
                    }
                    str = str4;
                    c4v c4vVar2 = new c4v(str, str3, i3);
                    rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$2 = str;
                    rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.label = 2;
                    a = dVar3.a(c4vVar2, pfvVar, rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$2;
                        kotlin.b.b(obj2);
                        a = ((Result) obj2).getValue();
                        Throwable a4 = Result.a(a);
                        if (a4 != null) {
                            i8y0Var.getClass();
                            i8y0.a(a4, "error when load expanded icon: " + str);
                            return null;
                        }
                        if (a instanceof Result.Failure) {
                            a = null;
                        }
                        Bitmap bitmap = (Bitmap) a;
                        if (bitmap != null || str.length() <= 0) {
                            return bitmap;
                        }
                        String concat = "error empty when load expanded icon: ".concat(str);
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(concat);
                        i8y0Var.getClass();
                        i8y0.a(illegalArgumentException, concat);
                        return null;
                    }
                    str2 = (String) rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$2;
                    tb90Var = (tb90) rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$1;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                a2 = Result.a(obj);
                if (a2 != null) {
                    String concat2 = "error when load photo expanded icon: ".concat(tb90Var.d);
                    i8y0Var.getClass();
                    i8y0.a(a2, concat2);
                }
                if (obj instanceof Result.Failure) {
                    Bitmap bitmap2 = (Bitmap) obj;
                    ((q) dVar.j).h("Panorama.SuccessLoad.BeautyEntryPoint.ride_card", kotlin.collections.b.f());
                    return bitmap2;
                }
                str = str2;
                c4v c4vVar22 = new c4v(str, str3, i3);
                rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$0 = null;
                rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$1 = null;
                rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.L$2 = str;
                rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.label = 2;
                a = dVar3.a(c4vVar22, pfvVar, rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1);
            }
        }
        rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1 = new RideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1(dVar, continuationImpl);
        Object obj22 = rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardTaxiPanoramaInteractorImpl$getPinRideExpandedBitmap$1.label;
        pfv pfvVar2 = pfv.a;
        int i32 = 2;
        int i42 = 1;
        String str32 = null;
        if (i != 0) {
        }
        a2 = Result.a(obj);
        if (a2 != null) {
        }
        if (obj instanceof Result.Failure) {
        }
    }

    public final tpr c(o2y0 o2y0Var) {
        if (!((b9y0) ((a9y0) this.l.getValue())).H.b()) {
            return new o(new k(com.yandex.go.coroutines.b.d(new c(vng.l(new m0(o2y0Var.a(), this.i.a(), new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$1(3, null)), new ohk0(6, this), vng.c), this), new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$4(this, null)), new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$5(this, null)), new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$6(this, null));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("WTF:we can't create panorama");
        this.d.getClass();
        i8y0.a(illegalArgumentException, "WTF:we can't create panorama");
        return new g92(2, dlk0.a);
    }
}
