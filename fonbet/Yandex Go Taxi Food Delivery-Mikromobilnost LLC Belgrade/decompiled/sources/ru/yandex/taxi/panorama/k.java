package ru.yandex.taxi.panorama;

import android.graphics.Bitmap;
import defpackage.g16;
import defpackage.jl40;
import defpackage.myy;
import defpackage.ny61;
import defpackage.obv;
import defpackage.tb90;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;
    public final /* synthetic */ String c;
    public final /* synthetic */ tb90 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ d y;
    public final /* synthetic */ String z;

    public k(vpr vprVar, l lVar, String str, tb90 tb90Var, String str2, d dVar, String str3) {
        this.b = lVar;
        this.c = str;
        this.w = tb90Var;
        this.x = str2;
        this.y = dVar;
        this.z = str3;
        this.a = vprVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ef, code lost:
    
        if (r12.emit(r1, r6) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        if (r13 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1 taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1;
        TaxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1 taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        vpr vprVar;
        Bitmap bitmap;
        Object b;
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (continuation instanceof TaxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1) {
            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1 = (TaxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1) continuation;
            int i2 = taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1.label = i2 - Integer.MIN_VALUE;
                taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12 = taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1;
                Object obj2 = taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$0 = null;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$1 = null;
                    vprVar = this.a;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$2 = vprVar;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.label = 1;
                    obj2 = l.a(this.b, this.c, this.w, this.x, this.y, taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return zy11.a;
                        }
                        bitmap2 = (Bitmap) taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$3;
                        vprVar = (vpr) taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$2;
                        kotlin.b.b(obj2);
                        bitmap3 = (Bitmap) obj2;
                        if (bitmap3 != null) {
                            myy myyVar = new myy(bitmap3, bitmap2);
                            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$0 = null;
                            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$1 = null;
                            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$2 = null;
                            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$3 = null;
                            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$4 = null;
                            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$5 = null;
                            taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.label = 3;
                        }
                        return zy11.a;
                    }
                    vprVar = (vpr) taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$2;
                    kotlin.b.b(obj2);
                }
                bitmap = (Bitmap) obj2;
                if (bitmap == null || this.c.length() <= 0) {
                    boolean l = jl40.l(this.z, "a");
                    d dVar = this.y;
                    g16 i3 = this.b.b.b().i(new obv(!l ? dVar.g : dVar.h, null, 6, 0));
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$0 = null;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$1 = null;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$2 = vprVar;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$3 = bitmap;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$4 = null;
                    taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.label = 2;
                    b = ru.yandex.taxi.utils.a.b(i3, taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12);
                    if (b != coroutineSingletons) {
                        obj2 = b;
                        bitmap2 = bitmap;
                        bitmap3 = (Bitmap) obj2;
                        if (bitmap3 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
        }
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1 = new TaxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1(this, continuation);
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12 = taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$1;
        Object obj22 = taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj22;
        if (bitmap == null) {
        }
        boolean l2 = jl40.l(this.z, "a");
        d dVar2 = this.y;
        g16 i32 = this.b.b.b().i(new obv(!l2 ? dVar2.g : dVar2.h, null, 6, 0));
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$0 = null;
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$1 = null;
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$2 = vprVar;
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$3 = bitmap;
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.L$4 = null;
        taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12.label = 2;
        b = ru.yandex.taxi.utils.a.b(i32, taxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1$1$12);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
