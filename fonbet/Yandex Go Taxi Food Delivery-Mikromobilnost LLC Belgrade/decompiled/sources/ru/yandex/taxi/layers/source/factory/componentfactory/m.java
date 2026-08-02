package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.TypedValue;
import com.yandex.go.layers.api.model.MapObjectComponentType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.an00;
import defpackage.bxu0;
import defpackage.f0k;
import defpackage.f4c0;
import defpackage.fkp;
import defpackage.g8e;
import defpackage.hxu0;
import defpackage.if61;
import defpackage.jl40;
import defpackage.jmp;
import defpackage.m7x0;
import defpackage.mzz;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.r76;
import defpackage.rol0;
import defpackage.sxx;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.vm00;
import defpackage.w76;
import defpackage.zlp;
import defpackage.zm00;
import defpackage.zzs;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes9.dex */
public final class m implements zm00 {
    public static final Bitmap j = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public final Context a;
    public final tt2 b;
    public final ru.yandex.taxi.map_common.map.utils.a c;
    public final sxx d;
    public final w76 e;
    public final pwy0 f;
    public final mzz g = new mzz(50);
    public final boolean h = true;
    public final float i;

    public m(Context context, tt2 tt2Var, ru.yandex.taxi.map_common.map.utils.a aVar, sxx sxxVar, w76 w76Var, pwy0 pwy0Var) {
        this.a = context;
        this.b = tt2Var;
        this.c = aVar;
        this.d = sxxVar;
        this.e = w76Var;
        this.f = pwy0Var;
        this.i = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()) / 3.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.Set] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(m mVar, fkp fkpVar, LinkedHashSet linkedHashSet, vm00 vm00Var, ContinuationImpl continuationImpl) {
        BodyComponentFactory$createBody$1 bodyComponentFactory$createBody$1;
        int i;
        zzs zzsVar;
        vm00 vm00Var2;
        f0k f0kVar;
        fkp fkpVar2;
        Point point;
        String str;
        if61 if61Var;
        String str2;
        LinkedHashSet linkedHashSet2;
        f4c0 f4c0Var;
        mVar.getClass();
        if (continuationImpl instanceof BodyComponentFactory$createBody$1) {
            bodyComponentFactory$createBody$1 = (BodyComponentFactory$createBody$1) continuationImpl;
            int i2 = bodyComponentFactory$createBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bodyComponentFactory$createBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bodyComponentFactory$createBody$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bodyComponentFactory$createBody$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zlp c = fkpVar.getC();
                    if (c == null || (zzsVar = c.getA()) == null) {
                        zzsVar = zzs.f;
                    }
                    Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
                    jmp b = fkpVar.getB();
                    f0k j2 = b != null ? b.getJ() : null;
                    if (j2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    MapObjectComponentType mapObjectComponentType = MapObjectComponentType.BODY;
                    String a = fkpVar.getA();
                    if (a == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    String str3 = mapObjectComponentType + "-" + ((Object) a) + "-" + mVar.f.getThemeType().getWireName();
                    Float[] c2 = j2.getC();
                    if (c2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    if61 l = ru.yandex.taxi.layers.source.factory.a.l(c2);
                    String a2 = fkpVar.getA();
                    if (a2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    ru.yandex.taxi.map_common.map.utils.a aVar = mVar.c;
                    bodyComponentFactory$createBody$1.L$0 = fkpVar;
                    bodyComponentFactory$createBody$1.L$1 = linkedHashSet;
                    vm00Var2 = vm00Var;
                    bodyComponentFactory$createBody$1.L$2 = vm00Var2;
                    bodyComponentFactory$createBody$1.L$3 = F;
                    bodyComponentFactory$createBody$1.L$4 = j2;
                    bodyComponentFactory$createBody$1.L$5 = str3;
                    bodyComponentFactory$createBody$1.L$6 = l;
                    bodyComponentFactory$createBody$1.L$7 = a2;
                    bodyComponentFactory$createBody$1.label = 1;
                    Object b2 = aVar.b(F, bodyComponentFactory$createBody$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f0kVar = j2;
                    fkpVar2 = fkpVar;
                    obj = b2;
                    point = F;
                    str = str3;
                    if61Var = l;
                    str2 = a2;
                    linkedHashSet2 = linkedHashSet;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) bodyComponentFactory$createBody$1.L$7;
                    if61 if61Var2 = (if61) bodyComponentFactory$createBody$1.L$6;
                    String str5 = (String) bodyComponentFactory$createBody$1.L$5;
                    f0kVar = (f0k) bodyComponentFactory$createBody$1.L$4;
                    Point point2 = (Point) bodyComponentFactory$createBody$1.L$3;
                    vm00 vm00Var3 = (vm00) bodyComponentFactory$createBody$1.L$2;
                    ?? r9 = (Set) bodyComponentFactory$createBody$1.L$1;
                    fkpVar2 = (fkp) bodyComponentFactory$createBody$1.L$0;
                    kotlin.b.b(obj);
                    vm00Var2 = vm00Var3;
                    linkedHashSet2 = r9;
                    str2 = str4;
                    if61Var = if61Var2;
                    point = point2;
                    str = str5;
                }
                XYPoint xYPoint = (XYPoint) obj;
                f4c0Var = new f4c0(point, null, 6);
                if (fkpVar2.getB().getK() == MapObjectType.ADVERT && f0kVar.getA() != null) {
                    f4c0Var.k(f0kVar.getA().floatValue());
                }
                f4c0Var.i(false);
                return new r76(str, if61Var, str2, linkedHashSet2, xYPoint, vm00Var2, f0kVar.getF(), f4c0Var);
            }
        }
        bodyComponentFactory$createBody$1 = new BodyComponentFactory$createBody$1(mVar, continuationImpl);
        Object obj2 = bodyComponentFactory$createBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bodyComponentFactory$createBody$1.label;
        if (i != 0) {
        }
        XYPoint xYPoint2 = (XYPoint) obj2;
        f4c0Var = new f4c0(point, null, 6);
        if (fkpVar2.getB().getK() == MapObjectType.ADVERT) {
            f4c0Var.k(f0kVar.getA().floatValue());
        }
        f4c0Var.i(false);
        return new r76(str, if61Var, str2, linkedHashSet2, xYPoint2, vm00Var2, f0kVar.getF(), f4c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(m mVar, fkp fkpVar, ContinuationImpl continuationImpl) {
        BodyComponentFactory$requestNormalStateImageProvider$1 bodyComponentFactory$requestNormalStateImageProvider$1;
        int i;
        bxu0 b;
        ImageProvider imageProvider;
        mVar.getClass();
        if (continuationImpl instanceof BodyComponentFactory$requestNormalStateImageProvider$1) {
            bodyComponentFactory$requestNormalStateImageProvider$1 = (BodyComponentFactory$requestNormalStateImageProvider$1) continuationImpl;
            int i2 = bodyComponentFactory$requestNormalStateImageProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bodyComponentFactory$requestNormalStateImageProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bodyComponentFactory$requestNormalStateImageProvider$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bodyComponentFactory$requestNormalStateImageProvider$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jmp b2 = fkpVar.getB();
                    if (b2 != null && (b = b2.getB()) != null) {
                        hxu0 b3 = b.getB();
                        bodyComponentFactory$requestNormalStateImageProvider$1.L$0 = null;
                        bodyComponentFactory$requestNormalStateImageProvider$1.L$1 = null;
                        bodyComponentFactory$requestNormalStateImageProvider$1.label = 1;
                        obj = mVar.h(b3, b, null, bodyComponentFactory$requestNormalStateImageProvider$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    ny61.r("Non of feature images are met. Validation error.");
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                imageProvider = (ImageProvider) obj;
                if (imageProvider != null) {
                    return imageProvider;
                }
                ny61.r("Non of feature images are met. Validation error.");
                return null;
            }
        }
        bodyComponentFactory$requestNormalStateImageProvider$1 = new BodyComponentFactory$requestNormalStateImageProvider$1(mVar, continuationImpl);
        Object obj3 = bodyComponentFactory$requestNormalStateImageProvider$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bodyComponentFactory$requestNormalStateImageProvider$1.label;
        if (i != 0) {
        }
        imageProvider = (ImageProvider) obj3;
        if (imageProvider != null) {
        }
        ny61.r("Non of feature images are met. Validation error.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(m mVar, fkp fkpVar, ContinuationImpl continuationImpl) {
        BodyComponentFactory$requestSelectedStateImageProvider$1 bodyComponentFactory$requestSelectedStateImageProvider$1;
        int i;
        bxu0 b;
        ImageProvider imageProvider;
        mVar.getClass();
        if (continuationImpl instanceof BodyComponentFactory$requestSelectedStateImageProvider$1) {
            bodyComponentFactory$requestSelectedStateImageProvider$1 = (BodyComponentFactory$requestSelectedStateImageProvider$1) continuationImpl;
            int i2 = bodyComponentFactory$requestSelectedStateImageProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bodyComponentFactory$requestSelectedStateImageProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bodyComponentFactory$requestSelectedStateImageProvider$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bodyComponentFactory$requestSelectedStateImageProvider$1.label;
                Bitmap bitmap = j;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jmp b2 = fkpVar.getB();
                    if (b2 != null && (b = b2.getB()) != null) {
                        hxu0 e = b.getE();
                        bodyComponentFactory$requestSelectedStateImageProvider$1.L$0 = null;
                        bodyComponentFactory$requestSelectedStateImageProvider$1.L$1 = null;
                        bodyComponentFactory$requestSelectedStateImageProvider$1.label = 1;
                        obj = mVar.h(e, b, bitmap, bodyComponentFactory$requestSelectedStateImageProvider$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                imageProvider = (ImageProvider) obj;
                if (imageProvider != null || imageProvider.equals(bitmap)) {
                    return null;
                }
                return imageProvider;
            }
        }
        bodyComponentFactory$requestSelectedStateImageProvider$1 = new BodyComponentFactory$requestSelectedStateImageProvider$1(mVar, continuationImpl);
        Object obj3 = bodyComponentFactory$requestSelectedStateImageProvider$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bodyComponentFactory$requestSelectedStateImageProvider$1.label;
        Bitmap bitmap2 = j;
        if (i != 0) {
        }
        imageProvider = (ImageProvider) obj3;
        if (imageProvider != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(m mVar, fkp fkpVar, ContinuationImpl continuationImpl) {
        BodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1 bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1;
        int i;
        bxu0 c;
        ImageProvider imageProvider;
        mVar.getClass();
        if (continuationImpl instanceof BodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1) {
            bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1 = (BodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1) continuationImpl;
            int i2 = bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.label;
                Bitmap bitmap = j;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jmp b = fkpVar.getB();
                    if (b != null && (c = b.getC()) != null) {
                        hxu0 e = c.getE();
                        bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.L$0 = null;
                        bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.L$1 = null;
                        bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.label = 1;
                        obj = mVar.h(e, c, bitmap, bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                imageProvider = (ImageProvider) obj;
                if (imageProvider != null || jl40.l(imageProvider.get$image(), bitmap)) {
                    return null;
                }
                return imageProvider;
            }
        }
        bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1 = new BodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1(mVar, continuationImpl);
        Object obj3 = bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bodyComponentFactory$requestSimplifiedSelectedStateImageProvider$1.label;
        Bitmap bitmap2 = j;
        if (i != 0) {
        }
        imageProvider = (ImageProvider) obj3;
        if (imageProvider != null) {
        }
        return null;
    }

    @Override // defpackage.zm00
    public final tpr a(an00 an00Var) {
        return new rol0(new BodyComponentFactory$createComponents$1(an00Var, this, null));
    }

    @Override // defpackage.zm00
    public final boolean b() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x011c, code lost:
    
        if (r1 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011f, code lost:
    
        if (r11 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0121, code lost:
    
        r2 = r11.getB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0125, code lost:
    
        if (r2 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0127, code lost:
    
        r2 = r2.getB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012d, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012e, code lost:
    
        if (r2 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0130, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0133, code lost:
    
        if (r11 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0135, code lost:
    
        r5 = r11.getF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013b, code lost:
    
        if (r5 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x013e, code lost:
    
        if (r2 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0140, code lost:
    
        if (r3 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0226, code lost:
    
        if (r9 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x022c, code lost:
    
        return com.yandex.runtime.image.ImageProvider.fromBitmap(r1, true, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x022d, code lost:
    
        r0 = com.yandex.runtime.image.ImageProvider.fromBitmap(r9, true, r4);
        r6.d(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0234, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0144, code lost:
    
        r3 = r17.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
    
        if (r2 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0148, code lost:
    
        r5 = defpackage.tje.u(r11.getB().getB().b(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015d, code lost:
    
        if (r2 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015f, code lost:
    
        r2 = defpackage.tje.u(r11.getB().getB().a(), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0174, code lost:
    
        r3 = r11.getB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0178, code lost:
    
        if (r3 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017a, code lost:
    
        r3 = r3.getF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0180, code lost:
    
        r10 = r11.getF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0184, code lost:
    
        if (r10 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0186, code lost:
    
        r10 = r10.getA();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x018c, code lost:
    
        r11 = r11.getF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0190, code lost:
    
        if (r11 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0192, code lost:
    
        r9 = r11.getB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0196, code lost:
    
        r0 = r17.e;
        r0.getClass();
        r11 = android.graphics.Bitmap.createBitmap(r5, r2, android.graphics.Bitmap.Config.ARGB_8888);
        r12 = new android.graphics.Canvas(r11);
        r5 = r5;
        r2 = r2;
        r13 = java.lang.Math.max(r5 / r1.getWidth(), r2 / r1.getHeight());
        r7 = new android.graphics.Matrix();
        r7.setScale(r13, r13);
        r7.postTranslate((r5 - (r1.getWidth() * r13)) / 2.0f, (r2 - (r1.getHeight() * r13)) / 2.0f);
        r15 = android.graphics.Shader.TileMode.CLAMP;
        r13 = new android.graphics.BitmapShader(r1, r15, r15);
        r13.setLocalMatrix(r7);
        r7 = new android.graphics.Paint(1);
        r7.setShader(r13);
        r14 = r10 / 2.0f;
        r13 = new android.graphics.RectF(r14, r14, r5 - r14, r2 - r14);
        r12.drawRoundRect(r13, r3, r3, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01fb, code lost:
    
        if (r10 <= 0.0f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01fd, code lost:
    
        r2 = new android.graphics.Paint(1);
        r2.setStyle(android.graphics.Paint.Style.STROKE);
        r2.setColor(defpackage.s8o.m(((defpackage.ufu) r0.b).a(new defpackage.bdc(defpackage.xng0.bgFloating), r9), r0.a));
        r2.setStrokeWidth(r10);
        r12.drawRoundRect(r13, r3, r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0225, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018b, code lost:
    
        r10 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017f, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0170, code lost:
    
        r2 = r1.getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0159, code lost:
    
        r5 = r1.getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ec, code lost:
    
        if (r1 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e4, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(hxu0 hxu0Var, bxu0 bxu0Var, Bitmap bitmap, ContinuationImpl continuationImpl) {
        BodyComponentFactory$requestImageProvider$1 bodyComponentFactory$requestImageProvider$1;
        int i;
        String str;
        String str2;
        String p;
        bxu0 bxu0Var2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        String str3;
        bxu0 bxu0Var3;
        Bitmap bitmap4;
        Bitmap bitmap5;
        if (continuationImpl instanceof BodyComponentFactory$requestImageProvider$1) {
            bodyComponentFactory$requestImageProvider$1 = (BodyComponentFactory$requestImageProvider$1) continuationImpl;
            int i2 = bodyComponentFactory$requestImageProvider$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bodyComponentFactory$requestImageProvider$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bodyComponentFactory$requestImageProvider$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bodyComponentFactory$requestImageProvider$1.label;
                sxx sxxVar = this.d;
                mzz mzzVar = this.g;
                String str4 = null;
                Bitmap bitmap6 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = hxu0Var != null ? hxu0Var.getA() : null;
                    if (hxu0Var != null) {
                        String d = hxu0Var.getD();
                        if (d == null) {
                            d = hxu0Var.getC();
                        }
                        str = d;
                    } else {
                        str = null;
                    }
                    if (a == null) {
                        if (str != null) {
                            str2 = str;
                        }
                        return null;
                    }
                    str2 = a;
                    p = g8e.p(str2, "-", this.f.getThemeType().getWireName());
                    ImageProvider imageProvider = (ImageProvider) mzzVar.c(p);
                    if (imageProvider != null) {
                        return imageProvider;
                    }
                    if (a != null) {
                        bodyComponentFactory$requestImageProvider$1.L$0 = null;
                        bxu0Var2 = bxu0Var;
                        bodyComponentFactory$requestImageProvider$1.L$1 = bxu0Var2;
                        bitmap2 = bitmap;
                        bodyComponentFactory$requestImageProvider$1.L$2 = bitmap2;
                        bodyComponentFactory$requestImageProvider$1.L$3 = null;
                        bodyComponentFactory$requestImageProvider$1.L$4 = str;
                        bodyComponentFactory$requestImageProvider$1.L$5 = null;
                        bodyComponentFactory$requestImageProvider$1.L$6 = p;
                        bodyComponentFactory$requestImageProvider$1.L$7 = null;
                        bodyComponentFactory$requestImageProvider$1.label = 1;
                        obj = sxxVar.a(((m7x0) sxxVar.b).a(a), bodyComponentFactory$requestImageProvider$1);
                    } else {
                        bxu0Var2 = bxu0Var;
                        bitmap2 = bitmap;
                        if (str != null) {
                            bodyComponentFactory$requestImageProvider$1.L$0 = null;
                            bodyComponentFactory$requestImageProvider$1.L$1 = bxu0Var2;
                            bodyComponentFactory$requestImageProvider$1.L$2 = bitmap2;
                            bodyComponentFactory$requestImageProvider$1.L$3 = null;
                            bodyComponentFactory$requestImageProvider$1.L$4 = null;
                            bodyComponentFactory$requestImageProvider$1.L$5 = null;
                            bodyComponentFactory$requestImageProvider$1.L$6 = p;
                            bodyComponentFactory$requestImageProvider$1.L$7 = null;
                            bodyComponentFactory$requestImageProvider$1.label = 2;
                            obj = sxxVar.a(str, bodyComponentFactory$requestImageProvider$1);
                            if (obj != coroutineSingletons) {
                                str3 = p;
                                bxu0Var3 = bxu0Var2;
                                bitmap4 = bitmap2;
                                bitmap5 = (Bitmap) obj;
                                if (bitmap5 != null) {
                                }
                                bitmap3 = bitmap4;
                                bxu0Var2 = bxu0Var3;
                                p = str3;
                            }
                            return coroutineSingletons;
                        }
                        bitmap3 = null;
                    }
                } else if (i == 1) {
                    p = (String) bodyComponentFactory$requestImageProvider$1.L$6;
                    str = (String) bodyComponentFactory$requestImageProvider$1.L$4;
                    Bitmap bitmap7 = (Bitmap) bodyComponentFactory$requestImageProvider$1.L$2;
                    bxu0 bxu0Var4 = (bxu0) bodyComponentFactory$requestImageProvider$1.L$1;
                    kotlin.b.b(obj);
                    bitmap2 = bitmap7;
                    bxu0Var2 = bxu0Var4;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) bodyComponentFactory$requestImageProvider$1.L$6;
                    bitmap4 = (Bitmap) bodyComponentFactory$requestImageProvider$1.L$2;
                    bxu0Var3 = (bxu0) bodyComponentFactory$requestImageProvider$1.L$1;
                    kotlin.b.b(obj);
                    bitmap5 = (Bitmap) obj;
                    if (bitmap5 != null) {
                        bitmap4 = bitmap5;
                    }
                    bitmap3 = bitmap4;
                    bxu0Var2 = bxu0Var3;
                    p = str3;
                }
                bitmap3 = (Bitmap) obj;
                if (bitmap3 == null) {
                    bitmap3 = bitmap2;
                }
            }
        }
        bodyComponentFactory$requestImageProvider$1 = new BodyComponentFactory$requestImageProvider$1(this, continuationImpl);
        Object obj2 = bodyComponentFactory$requestImageProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bodyComponentFactory$requestImageProvider$1.label;
        sxx sxxVar2 = this.d;
        mzz mzzVar2 = this.g;
        String str42 = null;
        Bitmap bitmap62 = null;
        if (i != 0) {
        }
        bitmap3 = (Bitmap) obj2;
        if (bitmap3 == null) {
        }
    }
}
