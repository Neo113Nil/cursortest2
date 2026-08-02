package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.dxu0;
import defpackage.f0k;
import defpackage.f4c0;
import defpackage.if61;
import defpackage.jl40;
import defpackage.lz2;
import defpackage.mbb1;
import defpackage.mz2;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.rl6;
import defpackage.sl6;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.y2b1;
import defpackage.ym00;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.layers.domain.model.Bubble$BubbleKind;

/* loaded from: classes5.dex */
public final class p implements vpr {
    public final /* synthetic */ String A;
    public final /* synthetic */ Point B;
    public final /* synthetic */ vm00 C;
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f0k w;
    public final /* synthetic */ PointF x;
    public final /* synthetic */ PointF y;
    public final /* synthetic */ ym00 z;

    public p(vpr vprVar, r rVar, int i, f0k f0kVar, PointF pointF, PointF pointF2, ym00 ym00Var, String str, Point point, vm00 vm00Var) {
        this.a = vprVar;
        this.b = rVar;
        this.c = i;
        this.w = f0kVar;
        this.x = pointF;
        this.y = pointF2;
        this.z = ym00Var;
        this.A = str;
        this.B = point;
        this.C = vm00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x021b, code lost:
    
        if (r10.emit(r17, r4) != r5) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BubbleComponentFactory$createBubbles$$inlined$map$2$2$1 bubbleComponentFactory$createBubbles$$inlined$map$2$2$1;
        int i;
        rl6 rl6Var;
        lz2 lz2Var;
        ImageProvider imageProvider;
        r rVar;
        PointF d;
        ImageProvider imageProvider2;
        Bitmap bitmap;
        lz2 lz2Var2;
        String str;
        int intValue;
        boolean l;
        int intValue2;
        vpr vprVar;
        boolean z;
        if61 if61Var;
        Object obj2;
        String str2;
        int i2;
        ImageProvider imageProvider3;
        lz2 lz2Var3;
        f0k f0kVar = this.w;
        Float f = f0kVar.a;
        if (continuation instanceof BubbleComponentFactory$createBubbles$$inlined$map$2$2$1) {
            bubbleComponentFactory$createBubbles$$inlined$map$2$2$1 = (BubbleComponentFactory$createBubbles$$inlined$map$2$2$1) continuation;
            int i3 = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.label;
                Point point = this.B;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Triple triple = (Triple) obj;
                    ImageProvider imageProvider4 = (ImageProvider) triple.getFirst();
                    ImageProvider imageProvider5 = (ImageProvider) triple.getSecond();
                    rl6Var = (rl6) triple.getThird();
                    dxu0 dxu0Var = rl6Var.k;
                    dxu0 dxu0Var2 = rl6Var.l;
                    Bitmap bitmap2 = r.n;
                    Set a = this.z.a();
                    if (a != null) {
                        Iterator it = a.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                lz2Var3 = 0;
                                break;
                            }
                            lz2Var3 = it.next();
                            if (((lz2) lz2Var3).g == AppearanceType.NORMAL) {
                                break;
                            }
                        }
                        lz2Var = lz2Var3;
                    } else {
                        lz2Var = null;
                    }
                    float floatValue = f.floatValue() + 1.0f;
                    Bitmap bitmap3 = imageProvider4.get$image();
                    Bitmap bitmap4 = (lz2Var == null || (imageProvider3 = lz2Var.a) == null) ? null : imageProvider3.get$image();
                    r rVar2 = this.b;
                    int i4 = this.c;
                    PointF d2 = rVar2.d(i4, this.x, bitmap3, bitmap4, dxu0Var);
                    if (imageProvider5 == null) {
                        d = mz2.a;
                        rVar = rVar2;
                    } else {
                        Bitmap bitmap5 = imageProvider5.get$image();
                        Bitmap bitmap6 = (lz2Var == null || (imageProvider2 = lz2Var.i) == null || (bitmap = imageProvider2.get$image()) == null) ? (lz2Var == null || (imageProvider = lz2Var.a) == null) ? null : imageProvider.get$image() : bitmap;
                        rVar = rVar2;
                        d = rVar2.d(i4, this.y, bitmap5, bitmap6, dxu0Var2);
                    }
                    lz2Var2 = new lz2(imageProvider4, floatValue, (y2b1) null, 0.0f, (pt3) null, (AppearanceType) null, d2, imageProvider5, d, HProv.PP_SAME_MEDIA);
                    str = rl6Var.e;
                    Integer num = rl6Var.h;
                    intValue = num != null ? num.intValue() : -1;
                    l = jl40.l(rl6Var.d, Boolean.TRUE);
                    Integer num2 = rl6Var.g;
                    intValue2 = num2 != null ? num2.intValue() : -1;
                    if61 l2 = ru.yandex.taxi.layers.source.factory.a.l(rl6Var.j);
                    ru.yandex.taxi.map_common.map.utils.a aVar = rVar.c;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$0 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$1 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$2 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$3 = null;
                    vprVar = this.a;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$4 = vprVar;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$5 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$6 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$7 = null;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$8 = rl6Var;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$9 = lz2Var2;
                    String str3 = this.A;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$10 = str3;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$11 = l2;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$12 = str;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.I$0 = intValue2;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.Z$0 = l;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.I$1 = intValue;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.I$2 = 0;
                    z = true;
                    bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.label = 1;
                    Object b = aVar.b(point, bubbleComponentFactory$createBubbles$$inlined$map$2$2$1);
                    if (b != coroutineSingletons) {
                        if61Var = l2;
                        obj2 = b;
                        str2 = str3;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                    return zy11.a;
                }
                i2 = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.I$2;
                intValue = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.I$1;
                l = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.Z$0;
                intValue2 = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.I$0;
                str = (String) bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$12;
                if61 if61Var2 = (if61) bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$11;
                String str4 = (String) bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$10;
                lz2Var2 = (lz2) bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$9;
                rl6Var = (rl6) bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$8;
                obj2 = obj3;
                vpr vprVar2 = (vpr) bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$4;
                kotlin.b.b(obj2);
                if61Var = if61Var2;
                str2 = str4;
                z = true;
                vprVar = vprVar2;
                int i5 = intValue;
                boolean z2 = l;
                int i6 = intValue2;
                String str5 = str;
                XYPoint xYPoint = (XYPoint) obj2;
                Set singleton = Collections.singleton(lz2Var2);
                float f2 = f0kVar.f;
                f4c0 f4c0Var = new f4c0(point, null, 6);
                if (f != null) {
                    f4c0Var.k(f.floatValue());
                }
                f4c0Var.i(false);
                sl6 sl6Var = new sl6(str5, i2 == 0 ? z : false, i5, z2, i6, if61Var, str2, xYPoint, singleton, this.C, f2, f4c0Var, mbb1.e(rl6Var), Bubble$BubbleKind.NORMAL);
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$0 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$1 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$2 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$3 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$4 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$5 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$6 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$7 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$8 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$9 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$10 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$11 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$12 = null;
                bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.label = 2;
            }
        }
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1 = new BubbleComponentFactory$createBubbles$$inlined$map$2$2$1(this, continuation);
        Object obj32 = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.label;
        Point point2 = this.B;
        if (i != 0) {
        }
        int i52 = intValue;
        boolean z22 = l;
        int i62 = intValue2;
        String str52 = str;
        XYPoint xYPoint2 = (XYPoint) obj2;
        Set singleton2 = Collections.singleton(lz2Var2);
        float f22 = f0kVar.f;
        f4c0 f4c0Var2 = new f4c0(point2, null, 6);
        if (f != null) {
        }
        f4c0Var2.i(false);
        sl6 sl6Var2 = new sl6(str52, i2 == 0 ? z : false, i52, z22, i62, if61Var, str2, xYPoint2, singleton2, this.C, f22, f4c0Var2, mbb1.e(rl6Var), Bubble$BubbleKind.NORMAL);
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$0 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$1 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$2 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$3 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$4 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$5 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$6 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$7 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$8 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$9 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$10 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$11 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.L$12 = null;
        bubbleComponentFactory$createBubbles$$inlined$map$2$2$1.label = 2;
    }
}
