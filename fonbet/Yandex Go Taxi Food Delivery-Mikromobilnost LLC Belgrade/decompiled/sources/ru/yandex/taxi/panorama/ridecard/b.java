package ru.yandex.taxi.panorama.ridecard;

import android.graphics.Bitmap;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.c9y0;
import defpackage.d6z;
import defpackage.dlk0;
import defpackage.e8y0;
import defpackage.elk0;
import defpackage.flk0;
import defpackage.g6u;
import defpackage.i8y0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tb90;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.vyx0;
import defpackage.zy11;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x02e6, code lost:
    
        if (r14.emit(r2, r3) == r4) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e5  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1 rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1;
        int i;
        TaxiOrder taxiOrder;
        vpr vprVar;
        TaxiOrder taxiOrder2;
        ru.yandex.taxi.panorama.d dVar;
        String str;
        ru.yandex.taxi.panorama.d dVar2;
        TaxiOrder taxiOrder3;
        String str2;
        ru.yandex.taxi.panorama.d dVar3;
        Bitmap bitmap;
        tb90 panoramaData;
        String str3;
        tb90 tb90Var;
        vpr vprVar2;
        Bitmap bitmap2;
        String str4;
        String str5;
        Object obj2 = dlk0.a;
        if (continuation instanceof RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1) {
            rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1 = (RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1) continuation;
            int i2 = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    vpr vprVar3 = this.a;
                    taxiOrder = (TaxiOrder) obj;
                    e8y0 e8y0Var = this.b.g;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = vprVar3;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = taxiOrder;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 1;
                    Object b = e8y0Var.a.b(rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        vprVar = vprVar3;
                        obj3 = b;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    taxiOrder = (TaxiOrder) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6;
                    vpr vprVar4 = (vpr) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                    vprVar = vprVar4;
                } else if (i == 2) {
                    str = (String) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8;
                    dVar2 = (ru.yandex.taxi.panorama.d) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7;
                    taxiOrder2 = (TaxiOrder) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6;
                    vprVar = (vpr) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                    dVar = dVar2;
                    taxiOrder3 = taxiOrder2;
                    d dVar4 = this.b;
                    dVar4.e.c = str;
                    if (!dVar.b) {
                        dVar4.d.getClass();
                    } else if (dVar.e.contains("ride_card")) {
                        boolean contains = dVar.n.a.contains(taxiOrder3.x());
                        i8y0 i8y0Var = this.b.d;
                        if (contains) {
                            i8y0Var.getClass();
                            String lowerCase = taxiOrder3.h.b.toString().toLowerCase(Locale.ROOT);
                            str2 = dVar.n.b.contains(lowerCase) ? "a" : dVar.n.c.contains(lowerCase) ? "b" : null;
                            if (str2 != null) {
                                d dVar5 = this.b;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = vprVar;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = taxiOrder3;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = dVar;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = null;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$9 = null;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10 = str2;
                                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 3;
                                Object a = d.a(dVar5, dVar, str2, rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1);
                                if (a != coroutineSingletons) {
                                    dVar3 = dVar;
                                    obj3 = a;
                                    bitmap = (Bitmap) obj3;
                                    if (bitmap != null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                        } else {
                            i8y0Var.getClass();
                        }
                    } else {
                        this.b.d.getClass();
                    }
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$9 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$11 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$12 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 5;
                } else if (i == 3) {
                    str2 = (String) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10;
                    dVar3 = (ru.yandex.taxi.panorama.d) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7;
                    taxiOrder3 = (TaxiOrder) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6;
                    vpr vprVar5 = (vpr) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                    vprVar = vprVar5;
                    bitmap = (Bitmap) obj3;
                    if (bitmap != null) {
                        d dVar6 = this.b;
                        if (jl40.l(str2, "a")) {
                            Address u = taxiOrder3.u();
                            if (u == null) {
                                panoramaData = null;
                            } else {
                                panoramaData = u.getPanoramaData();
                                if (panoramaData == null) {
                                    panoramaData = (tb90) dVar6.k.a.c(vyx0.a(u, taxiOrder3.a));
                                }
                            }
                            if (panoramaData != null) {
                                Address u2 = taxiOrder3.u();
                                if (u2 != null) {
                                    u2.W(panoramaData);
                                }
                                if (panoramaData != null) {
                                    d dVar7 = this.b;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = vprVar;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = dVar3;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$9 = null;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10 = bitmap;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$11 = str2;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$12 = panoramaData;
                                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 4;
                                    obj3 = d.b(dVar7, dVar3, panoramaData, rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1);
                                    if (obj3 != coroutineSingletons) {
                                        str3 = str2;
                                        tb90Var = panoramaData;
                                        vprVar2 = vprVar;
                                        Bitmap bitmap3 = bitmap;
                                        bitmap2 = (Bitmap) obj3;
                                        String str6 = dVar3.n.d;
                                        if (bitmap2 == null) {
                                        }
                                        d dVar8 = this.b;
                                        c9y0 c9y0Var = dVar8.e;
                                        str4 = c9y0Var.a;
                                        str5 = tb90Var.a;
                                        if (jl40.l(str4, str5)) {
                                        }
                                        dVar8.b.c(str5, "ride_card", str3, tb90Var.c);
                                        c9y0Var.a = str5;
                                        c9y0Var.b = "ride_card";
                                        RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1 rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1 = new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1(this.b, dVar3, tb90Var, str3, bitmap3, null);
                                        String str7 = dVar3.d;
                                        if (bitmap2 == null) {
                                        }
                                        vprVar = vprVar2;
                                    }
                                    return coroutineSingletons;
                                }
                            }
                            panoramaData = null;
                            if (panoramaData != null) {
                            }
                        } else {
                            Address l = taxiOrder3.l();
                            if (l != null) {
                                panoramaData = l.getPanoramaData();
                                if (panoramaData != null) {
                                }
                            }
                            panoramaData = null;
                            if (panoramaData != null) {
                            }
                        }
                        return zy11.a;
                    }
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$9 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$11 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$12 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 5;
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    tb90Var = (tb90) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$12;
                    str3 = (String) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$11;
                    bitmap = (Bitmap) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10;
                    dVar3 = (ru.yandex.taxi.panorama.d) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7;
                    vprVar2 = (vpr) rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                    Bitmap bitmap32 = bitmap;
                    bitmap2 = (Bitmap) obj3;
                    String str62 = dVar3.n.d;
                    if (bitmap2 == null || str62.length() <= 0) {
                        d dVar82 = this.b;
                        c9y0 c9y0Var2 = dVar82.e;
                        str4 = c9y0Var2.a;
                        str5 = tb90Var.a;
                        if (jl40.l(str4, str5) || !jl40.l(c9y0Var2.b, "ride_card")) {
                            dVar82.b.c(str5, "ride_card", str3, tb90Var.c);
                        }
                        c9y0Var2.a = str5;
                        c9y0Var2.b = "ride_card";
                        RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1 rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$12 = new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1(this.b, dVar3, tb90Var, str3, bitmap32, null);
                        String str72 = dVar3.d;
                        obj2 = bitmap2 == null ? new elk0(rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$12, bitmap2, d6z.Y(dVar3, str72)) : new flk0(rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$12, d6z.Y(dVar3, str72));
                    } else {
                        this.b.d.getClass();
                    }
                    vprVar = vprVar2;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$9 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$11 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$12 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 5;
                }
                taxiOrder2 = taxiOrder;
                dVar = (ru.yandex.taxi.panorama.d) obj3;
                str = taxiOrder2.h.b + taxiOrder2.a;
                if (!jl40.l(this.b.e.c, str)) {
                    this.b.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$1 rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$1 = new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$1(this.b, null);
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = taxiOrder2;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = dVar;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = str;
                    rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 2;
                    if (tje.k0(g6uVar, rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$1, rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1) != coroutineSingletons) {
                        dVar2 = dVar;
                        dVar = dVar2;
                    }
                    return coroutineSingletons;
                }
                taxiOrder3 = taxiOrder2;
                d dVar42 = this.b;
                dVar42.e.c = str;
                if (!dVar.b) {
                }
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$9 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$11 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$12 = null;
                rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 5;
            }
        }
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1 = new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        taxiOrder2 = taxiOrder;
        dVar = (ru.yandex.taxi.panorama.d) obj32;
        str = taxiOrder2.h.b + taxiOrder2.a;
        if (!jl40.l(this.b.e.c, str)) {
        }
        taxiOrder3 = taxiOrder2;
        d dVar422 = this.b;
        dVar422.e.c = str;
        if (!dVar.b) {
        }
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$0 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$1 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$2 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$3 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$4 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$5 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$6 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$7 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$8 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$9 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$10 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$11 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.L$12 = null;
        rideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$$inlined$map$1$2$1.label = 5;
    }
}
