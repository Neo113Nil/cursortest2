package ru.yandex.taxi.panorama;

import android.graphics.Bitmap;
import defpackage.a8y0;
import defpackage.a9y0;
import defpackage.ac20;
import defpackage.b9y0;
import defpackage.c9y0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.g16;
import defpackage.g8e;
import defpackage.g8y0;
import defpackage.i3y;
import defpackage.i8y0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.obv;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.qbv;
import defpackage.rol0;
import defpackage.rpb0;
import defpackage.sls;
import defpackage.tb90;
import defpackage.tls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.analytics.q;
import ru.yandex.taxi.panorama.l;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final class l {
    public final a8y0 a;
    public final pav b;
    public final rpb0 c;
    public final i8y0 d;
    public final c9y0 e;
    public final zuj0 f;
    public final ac20 g;
    public final pwy0 h;
    public final i3y i;
    public final i3y j;
    public final i3y k;

    public l(a8y0 a8y0Var, pav pavVar, rpb0 rpb0Var, i8y0 i8y0Var, c9y0 c9y0Var, zuj0 zuj0Var, ac20 ac20Var, pwy0 pwy0Var) {
        this.a = a8y0Var;
        this.b = pavVar;
        this.c = rpb0Var;
        this.d = i8y0Var;
        this.e = c9y0Var;
        this.f = zuj0Var;
        this.g = ac20Var;
        this.h = pwy0Var;
        final int i = 0;
        this.i = kotlin.a.a(new sls(this) { // from class: f8y0
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i2 = i;
                l lVar = this.b;
                switch (i2) {
                    case 0:
                        c = ((avj0) lVar.f).c(erg0.expand_panorama_entry_point_width);
                        break;
                    case 1:
                        c = ((avj0) lVar.f).c(erg0.panorama_entry_point_height);
                        break;
                    default:
                        c = ((avj0) lVar.f).c(erg0.expand_panorama_entry_point_radius);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i2 = 1;
        this.j = kotlin.a.a(new sls(this) { // from class: f8y0
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i2;
                l lVar = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) lVar.f).c(erg0.expand_panorama_entry_point_width);
                        break;
                    case 1:
                        c = ((avj0) lVar.f).c(erg0.panorama_entry_point_height);
                        break;
                    default:
                        c = ((avj0) lVar.f).c(erg0.expand_panorama_entry_point_radius);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i3 = 2;
        this.k = kotlin.a.a(new sls(this) { // from class: f8y0
            public final /* synthetic */ l b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i3;
                l lVar = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) lVar.f).c(erg0.expand_panorama_entry_point_width);
                        break;
                    case 1:
                        c = ((avj0) lVar.f).c(erg0.panorama_entry_point_height);
                        break;
                    default:
                        c = ((avj0) lVar.f).c(erg0.expand_panorama_entry_point_radius);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r12 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, String str, tb90 tb90Var, String str2, d dVar, ContinuationImpl continuationImpl) {
        TaxiPanoramaInteractor$loadExpandedIcon$1 taxiPanoramaInteractor$loadExpandedIcon$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Bitmap bitmap;
        pav pavVar = lVar.b;
        if (continuationImpl instanceof TaxiPanoramaInteractor$loadExpandedIcon$1) {
            taxiPanoramaInteractor$loadExpandedIcon$1 = (TaxiPanoramaInteractor$loadExpandedIcon$1) continuationImpl;
            int i2 = taxiPanoramaInteractor$loadExpandedIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPanoramaInteractor$loadExpandedIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiPanoramaInteractor$loadExpandedIcon$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPanoramaInteractor$loadExpandedIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str.length() == 0) {
                        return null;
                    }
                    if (!evu0.J(tb90Var.d) && dVar.f.contains(str2)) {
                        g16 i3 = pavVar.b().i(new qbv(tb90Var.d));
                        taxiPanoramaInteractor$loadExpandedIcon$1.L$0 = str;
                        taxiPanoramaInteractor$loadExpandedIcon$1.L$1 = null;
                        taxiPanoramaInteractor$loadExpandedIcon$1.L$2 = str2;
                        taxiPanoramaInteractor$loadExpandedIcon$1.L$3 = null;
                        taxiPanoramaInteractor$loadExpandedIcon$1.label = 1;
                        obj = ru.yandex.taxi.utils.a.b(i3, taxiPanoramaInteractor$loadExpandedIcon$1);
                    }
                    g16 i4 = pavVar.b().i(new obv(str, null, 6, 0));
                    taxiPanoramaInteractor$loadExpandedIcon$1.L$0 = null;
                    taxiPanoramaInteractor$loadExpandedIcon$1.L$1 = null;
                    taxiPanoramaInteractor$loadExpandedIcon$1.L$2 = null;
                    taxiPanoramaInteractor$loadExpandedIcon$1.L$3 = null;
                    taxiPanoramaInteractor$loadExpandedIcon$1.label = 2;
                    Object b = ru.yandex.taxi.utils.a.b(i4, taxiPanoramaInteractor$loadExpandedIcon$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                str2 = (String) taxiPanoramaInteractor$loadExpandedIcon$1.L$2;
                str = (String) taxiPanoramaInteractor$loadExpandedIcon$1.L$0;
                kotlin.b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    ((q) lVar.g).h(g8e.o("Panorama.SuccessLoad.BeautyEntryPoint.", str2), kotlin.collections.b.f());
                    return bitmap;
                }
                g16 i42 = pavVar.b().i(new obv(str, null, 6, 0));
                taxiPanoramaInteractor$loadExpandedIcon$1.L$0 = null;
                taxiPanoramaInteractor$loadExpandedIcon$1.L$1 = null;
                taxiPanoramaInteractor$loadExpandedIcon$1.L$2 = null;
                taxiPanoramaInteractor$loadExpandedIcon$1.L$3 = null;
                taxiPanoramaInteractor$loadExpandedIcon$1.label = 2;
                Object b2 = ru.yandex.taxi.utils.a.b(i42, taxiPanoramaInteractor$loadExpandedIcon$1);
                if (b2 == coroutineSingletons) {
                }
            }
        }
        taxiPanoramaInteractor$loadExpandedIcon$1 = new TaxiPanoramaInteractor$loadExpandedIcon$1(lVar, continuationImpl);
        Object obj2 = taxiPanoramaInteractor$loadExpandedIcon$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPanoramaInteractor$loadExpandedIcon$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        g16 i422 = pavVar.b().i(new obv(str, null, 6, 0));
        taxiPanoramaInteractor$loadExpandedIcon$1.L$0 = null;
        taxiPanoramaInteractor$loadExpandedIcon$1.L$1 = null;
        taxiPanoramaInteractor$loadExpandedIcon$1.L$2 = null;
        taxiPanoramaInteractor$loadExpandedIcon$1.L$3 = null;
        taxiPanoramaInteractor$loadExpandedIcon$1.label = 2;
        Object b22 = ru.yandex.taxi.utils.a.b(i422, taxiPanoramaInteractor$loadExpandedIcon$1);
        if (b22 == coroutineSingletons) {
        }
    }

    public final o b(String str, tb90 tb90Var, String str2, d dVar, String str3) {
        return new o(new rol0(new TaxiPanoramaInteractor$buildIconStateFlow$$inlined$transform$1(new kotlinx.coroutines.flow.k(com.yandex.go.coroutines.b.d(this.h.a(), new TaxiPanoramaInteractor$buildIconStateFlow$1(this, null)), new TaxiPanoramaInteractor$buildIconStateFlow$2(this, null)), null, this, str3, tb90Var, str2, dVar, str)), new TaxiPanoramaInteractor$buildIconStateFlow$4(this, null));
    }

    public final Object c(RotatableFloatButton rotatableFloatButton, String str, tb90 tb90Var, String str2, d dVar, String str3, a9y0 a9y0Var, oep0 oep0Var, tls tlsVar, Continuation continuation) {
        String str4 = jl40.l(str, "a") ? dVar.m.d : dVar.m.e;
        String Y = jl40.l(str, "a") ? d6z.Y(dVar, dVar.m.b) : d6z.Y(dVar, dVar.m.c);
        b9y0 b9y0Var = (b9y0) a9y0Var;
        if (!b9y0Var.H.b()) {
            return new o(new o(new jqr(b(str, tb90Var, str2, dVar, str3), new TaxiPanoramaInteractor$process$2(rotatableFloatButton, this, tb90Var, str2, str, oep0Var, b9y0Var, dVar, Y, str4, tlsVar, null), 3), new TaxiPanoramaInteractor$process$3(this, null)), new TaxiPanoramaInteractor$process$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null)).collect(new g8y0(), continuation);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("WTF:we can't create panorama");
        this.d.getClass();
        i8y0.a(illegalArgumentException, "WTF:we can't create panorama");
        return zy11.a;
    }
}
