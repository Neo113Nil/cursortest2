package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.go.layers.api.model.params.AutoScale;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.an00;
import defpackage.bxu0;
import defpackage.ec4;
import defpackage.f0k;
import defpackage.f4c0;
import defpackage.fc4;
import defpackage.fkp;
import defpackage.hxu0;
import defpackage.if61;
import defpackage.jmp;
import defpackage.lcv;
import defpackage.lz2;
import defpackage.m7x0;
import defpackage.mcv;
import defpackage.mz2;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.pvn;
import defpackage.sxx;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.vm00;
import defpackage.w1b1;
import defpackage.y2b1;
import defpackage.ytb1;
import defpackage.zlp;
import defpackage.zm00;
import defpackage.zzs;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class w implements zm00 {
    public static final Bitmap d = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public final tt2 a;
    public final sxx b;
    public final ru.yandex.taxi.map_common.map.utils.a c;

    public w(tt2 tt2Var, sxx sxxVar, ru.yandex.taxi.map_common.map.utils.a aVar) {
        this.a = tt2Var;
        this.b = sxxVar;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(w wVar, mcv mcvVar, fkp fkpVar, LinkedHashSet linkedHashSet, vm00 vm00Var, ContinuationImpl continuationImpl) {
        ImageOverlayComponentFactory$createImageOverlay$1 imageOverlayComponentFactory$createImageOverlay$1;
        int i;
        zzs zzsVar;
        String a;
        Point point;
        LinkedHashSet linkedHashSet2;
        if61 if61Var;
        String str;
        vm00 vm00Var2;
        wVar.getClass();
        if (continuationImpl instanceof ImageOverlayComponentFactory$createImageOverlay$1) {
            imageOverlayComponentFactory$createImageOverlay$1 = (ImageOverlayComponentFactory$createImageOverlay$1) continuationImpl;
            int i2 = imageOverlayComponentFactory$createImageOverlay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageOverlayComponentFactory$createImageOverlay$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imageOverlayComponentFactory$createImageOverlay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageOverlayComponentFactory$createImageOverlay$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zlp c = fkpVar.getC();
                    if (c == null || (zzsVar = c.getA()) == null) {
                        zzsVar = zzs.f;
                    }
                    Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
                    a = mcvVar.getA();
                    if (a == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    Float[] b = mcvVar.getB();
                    if (b == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    if61 l = ru.yandex.taxi.layers.source.factory.a.l(b);
                    String a2 = fkpVar.getA();
                    if (a2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    ru.yandex.taxi.map_common.map.utils.a aVar = wVar.c;
                    imageOverlayComponentFactory$createImageOverlay$1.L$0 = null;
                    imageOverlayComponentFactory$createImageOverlay$1.L$1 = null;
                    imageOverlayComponentFactory$createImageOverlay$1.L$2 = linkedHashSet;
                    imageOverlayComponentFactory$createImageOverlay$1.L$3 = vm00Var;
                    imageOverlayComponentFactory$createImageOverlay$1.L$4 = F;
                    imageOverlayComponentFactory$createImageOverlay$1.L$5 = a;
                    imageOverlayComponentFactory$createImageOverlay$1.L$6 = l;
                    imageOverlayComponentFactory$createImageOverlay$1.L$7 = a2;
                    imageOverlayComponentFactory$createImageOverlay$1.label = 1;
                    Object b2 = aVar.b(F, imageOverlayComponentFactory$createImageOverlay$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    point = F;
                    linkedHashSet2 = linkedHashSet;
                    if61Var = l;
                    str = a2;
                    vm00Var2 = vm00Var;
                    obj = b2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str2 = (String) imageOverlayComponentFactory$createImageOverlay$1.L$7;
                    if61 if61Var2 = (if61) imageOverlayComponentFactory$createImageOverlay$1.L$6;
                    a = (String) imageOverlayComponentFactory$createImageOverlay$1.L$5;
                    point = (Point) imageOverlayComponentFactory$createImageOverlay$1.L$4;
                    vm00 vm00Var3 = (vm00) imageOverlayComponentFactory$createImageOverlay$1.L$3;
                    ?? r8 = (Set) imageOverlayComponentFactory$createImageOverlay$1.L$2;
                    kotlin.b.b(obj);
                    str = str2;
                    if61Var = if61Var2;
                    vm00Var2 = vm00Var3;
                    linkedHashSet2 = r8;
                }
                String str3 = a;
                f4c0 f4c0Var = new f4c0(point, null, 6);
                f4c0Var.i(false);
                return new lcv(str3, if61Var, str, linkedHashSet2, (XYPoint) obj, vm00Var2, f4c0Var);
            }
        }
        imageOverlayComponentFactory$createImageOverlay$1 = new ImageOverlayComponentFactory$createImageOverlay$1(wVar, continuationImpl);
        Object obj2 = imageOverlayComponentFactory$createImageOverlay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageOverlayComponentFactory$createImageOverlay$1.label;
        if (i != 0) {
        }
        String str32 = a;
        f4c0 f4c0Var2 = new f4c0(point, null, 6);
        f4c0Var2.i(false);
        return new lcv(str32, if61Var, str, linkedHashSet2, (XYPoint) obj2, vm00Var2, f4c0Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        if (r7 == r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        if (r7 == r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
    
        if (r7 == r9) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(w wVar, bxu0 bxu0Var, ContinuationImpl continuationImpl) {
        ImageOverlayComponentFactory$requestImageBitmap$1 imageOverlayComponentFactory$requestImageBitmap$1;
        int i;
        hxu0 b;
        String a;
        Bitmap bitmap;
        hxu0 b2;
        String d2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        hxu0 b3;
        String c;
        sxx sxxVar = wVar.b;
        if (continuationImpl instanceof ImageOverlayComponentFactory$requestImageBitmap$1) {
            imageOverlayComponentFactory$requestImageBitmap$1 = (ImageOverlayComponentFactory$requestImageBitmap$1) continuationImpl;
            int i2 = imageOverlayComponentFactory$requestImageBitmap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageOverlayComponentFactory$requestImageBitmap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = imageOverlayComponentFactory$requestImageBitmap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = imageOverlayComponentFactory$requestImageBitmap$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bxu0Var != null && (b = bxu0Var.getB()) != null && (a = b.getA()) != null) {
                        imageOverlayComponentFactory$requestImageBitmap$1.L$0 = bxu0Var;
                        imageOverlayComponentFactory$requestImageBitmap$1.L$1 = null;
                        imageOverlayComponentFactory$requestImageBitmap$1.label = 1;
                        obj = sxxVar.a(((m7x0) sxxVar.b).a(a), imageOverlayComponentFactory$requestImageBitmap$1);
                    }
                    if (bxu0Var != null || (b2 = bxu0Var.getB()) == null || (d2 = b2.getD()) == null) {
                        bitmap = null;
                        if (bitmap == null) {
                        }
                    } else {
                        imageOverlayComponentFactory$requestImageBitmap$1.L$0 = bxu0Var;
                        imageOverlayComponentFactory$requestImageBitmap$1.L$1 = null;
                        imageOverlayComponentFactory$requestImageBitmap$1.label = 2;
                        obj = sxxVar.a(d2, imageOverlayComponentFactory$requestImageBitmap$1);
                    }
                } else if (i == 1) {
                    bxu0Var = (bxu0) imageOverlayComponentFactory$requestImageBitmap$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        bitmap3 = (Bitmap) obj;
                        if (bitmap3 == null) {
                            return bitmap3;
                        }
                        ny61.r("Non of image overlays are met. Validation error.");
                        return null;
                    }
                    bxu0Var = (bxu0) imageOverlayComponentFactory$requestImageBitmap$1.L$0;
                    kotlin.b.b(obj);
                    bitmap = (Bitmap) obj;
                    if (bitmap == null) {
                        return bitmap;
                    }
                    if (bxu0Var == null || (b3 = bxu0Var.getB()) == null || (c = b3.getC()) == null) {
                        bitmap3 = null;
                        if (bitmap3 == null) {
                        }
                    } else {
                        imageOverlayComponentFactory$requestImageBitmap$1.L$0 = null;
                        imageOverlayComponentFactory$requestImageBitmap$1.L$1 = null;
                        imageOverlayComponentFactory$requestImageBitmap$1.label = 3;
                        obj = sxxVar.a(c, imageOverlayComponentFactory$requestImageBitmap$1);
                    }
                }
                bitmap2 = (Bitmap) obj;
                if (bitmap2 != null) {
                    return bitmap2;
                }
                if (bxu0Var != null) {
                }
                bitmap = null;
                if (bitmap == null) {
                }
            }
        }
        imageOverlayComponentFactory$requestImageBitmap$1 = new ImageOverlayComponentFactory$requestImageBitmap$1(wVar, continuationImpl);
        Object obj2 = imageOverlayComponentFactory$requestImageBitmap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = imageOverlayComponentFactory$requestImageBitmap$1.label;
        if (i != 0) {
        }
        bitmap2 = (Bitmap) obj2;
        if (bitmap2 != null) {
        }
        if (bxu0Var != null) {
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }

    public static lz2 f(AppearanceType appearanceType, Bitmap bitmap, f0k f0kVar, bxu0 bxu0Var) {
        String d2;
        hxu0 b;
        hxu0 b2;
        hxu0 b3;
        Float[] e;
        AutoScale d3;
        Float c;
        Integer a;
        hxu0 b4;
        pt3 pt3Var = null;
        if (bxu0Var == null || (b4 = bxu0Var.getB()) == null || (d2 = b4.getA()) == null) {
            d2 = (bxu0Var == null || (b2 = bxu0Var.getB()) == null) ? null : b2.getD();
            if (d2 == null) {
                d2 = (bxu0Var == null || (b = bxu0Var.getB()) == null) ? null : b.getC();
                if (d2 == null) {
                    d2 = UUID.randomUUID().toString();
                }
            }
        }
        ImageProvider fromBitmap = ImageProvider.fromBitmap(bitmap, false, d2);
        float floatValue = f0kVar.getA().floatValue();
        y2b1 ec4Var = (bxu0Var == null || (a = bxu0Var.getA()) == null) ? fc4.a : new ec4(a.intValue());
        float floatValue2 = (bxu0Var == null || (c = bxu0Var.getC()) == null) ? 1.0f : c.floatValue();
        if (bxu0Var != null && (d3 = bxu0Var.getD()) != null) {
            pt3Var = w1b1.b(d3);
        }
        return new lz2(fromBitmap, floatValue, ec4Var, floatValue2, pt3Var, appearanceType, (bxu0Var == null || (b3 = bxu0Var.getB()) == null || (e = b3.getE()) == null) ? mz2.a() : new PointF(ytb1.b(e), ytb1.c(e)), (ImageProvider) null, (PointF) null, 800);
    }

    @Override // defpackage.zm00
    public final tpr a(an00 an00Var) {
        fkp d2 = an00Var.d();
        vm00 b = an00Var.b();
        jmp b2 = d2.getB();
        return (b2 != null ? b2.getG() : null) == null ? pvn.a : new v(new t(new kotlinx.coroutines.flow.g(d2.getB().getG())), this, d2, b);
    }
}
