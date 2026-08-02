package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.NinePatchDrawable;
import android.util.LruCache;
import com.yandex.go.layers.api.model.AppearanceType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.geo.XYPoint;
import com.yandex.runtime.image.ImageProvider;
import defpackage.a190;
import defpackage.an00;
import defpackage.b64;
import defpackage.f4c0;
import defpackage.fkp;
import defpackage.if61;
import defpackage.jmp;
import defpackage.kzg0;
import defpackage.lz2;
import defpackage.ny61;
import defpackage.pt3;
import defpackage.pvn;
import defpackage.s090;
import defpackage.sb2;
import defpackage.t090;
import defpackage.tje;
import defpackage.tpr;
import defpackage.vm00;
import defpackage.wa60;
import defpackage.xw31;
import defpackage.y2b1;
import defpackage.ytb1;
import defpackage.zlp;
import defpackage.zm00;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes9.dex */
public final class a0 implements zm00 {
    public static final wa60 f = new wa60(0.3f, 0.7f, 0.13f, 0.87f);
    public static final wa60 g = new wa60(0.4f, 0.6f, 0.49f, 0.51f);
    public static final ImageProvider h = ImageProvider.fromBitmap(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888));
    public final Context a;
    public final ru.yandex.taxi.map_common.map.utils.a b;
    public final ru.yandex.taxi.widget.c c;
    public final NinePatchDrawable d;
    public final LruCache e = new LruCache(50);

    public a0(Context context, ru.yandex.taxi.map_common.map.utils.a aVar, ru.yandex.taxi.widget.c cVar) {
        this.a = context;
        this.b = aVar;
        this.c = cVar;
        this.d = sb2.l(new Canvas(), context, tje.y(kzg0.overlay_bg, context), f, g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
    
        if (r0 == r2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a0 a0Var, fkp fkpVar, s090 s090Var, vm00 vm00Var, ContinuationImpl continuationImpl) {
        OverlayComponentFactory$prepareOverlay$1 overlayComponentFactory$prepareOverlay$1;
        int i;
        fkp fkpVar2;
        s090 s090Var2;
        vm00 vm00Var2;
        if61 l;
        lz2 lz2Var;
        fkp fkpVar3;
        String str;
        String str2;
        vm00 vm00Var3;
        Set set;
        a0Var.getClass();
        if (continuationImpl instanceof OverlayComponentFactory$prepareOverlay$1) {
            overlayComponentFactory$prepareOverlay$1 = (OverlayComponentFactory$prepareOverlay$1) continuationImpl;
            int i2 = overlayComponentFactory$prepareOverlay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                overlayComponentFactory$prepareOverlay$1.label = i2 - Integer.MIN_VALUE;
                OverlayComponentFactory$prepareOverlay$1 overlayComponentFactory$prepareOverlay$12 = overlayComponentFactory$prepareOverlay$1;
                Object obj = overlayComponentFactory$prepareOverlay$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = overlayComponentFactory$prepareOverlay$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.widget.c cVar = a0Var.c;
                    FormattedText d = s090Var.getD();
                    fkpVar2 = fkpVar;
                    overlayComponentFactory$prepareOverlay$12.L$0 = fkpVar2;
                    s090Var2 = s090Var;
                    overlayComponentFactory$prepareOverlay$12.L$1 = s090Var2;
                    vm00Var2 = vm00Var;
                    overlayComponentFactory$prepareOverlay$12.L$2 = vm00Var2;
                    overlayComponentFactory$prepareOverlay$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, d, null, false, overlayComponentFactory$prepareOverlay$12, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Set set2 = (Set) overlayComponentFactory$prepareOverlay$12.L$7;
                        String str3 = (String) overlayComponentFactory$prepareOverlay$12.L$6;
                        l = (if61) overlayComponentFactory$prepareOverlay$12.L$5;
                        String str4 = (String) overlayComponentFactory$prepareOverlay$12.L$4;
                        vm00 vm00Var4 = (vm00) overlayComponentFactory$prepareOverlay$12.L$2;
                        fkpVar3 = (fkp) overlayComponentFactory$prepareOverlay$12.L$0;
                        kotlin.b.b(obj);
                        str2 = str3;
                        str = str4;
                        vm00Var3 = vm00Var4;
                        set = set2;
                        f4c0 f4c0Var = new f4c0(ru.yandex.taxi.map.utils.a.F(fkpVar3.getC().getA()), null, 6);
                        f4c0Var.i(false);
                        return new t090(str, l, str2, set, (XYPoint) obj, vm00Var3, f4c0Var);
                    }
                    vm00 vm00Var5 = (vm00) overlayComponentFactory$prepareOverlay$12.L$2;
                    s090 s090Var3 = (s090) overlayComponentFactory$prepareOverlay$12.L$1;
                    fkp fkpVar4 = (fkp) overlayComponentFactory$prepareOverlay$12.L$0;
                    kotlin.b.b(obj);
                    vm00Var2 = vm00Var5;
                    s090Var2 = s090Var3;
                    fkpVar2 = fkpVar4;
                }
                CharSequence charSequence = (CharSequence) obj;
                a190 f2 = s090Var2.getF();
                String a = f2 == null ? f2.getA() : null;
                String str5 = a + s090Var2.e() + s090Var2.getA() + ((Object) charSequence);
                l = ru.yandex.taxi.layers.source.factory.a.l(s090Var2.getB());
                String a2 = fkpVar2.getA();
                synchronized (a0Var) {
                    try {
                        a190 f3 = s090Var2.getF();
                        ImageProvider e = a0Var.e(charSequence, f3 != null ? f3.getA() : null);
                        ImageProvider imageProvider = s090Var2.e().contains("unselected") ? e : h;
                        jmp b = fkpVar2.getB();
                        float nextUp = Math.nextUp((b != null ? b.getJ() : null).getA().floatValue());
                        PointF pointF = new PointF(ytb1.b(s090Var2.getC()), ytb1.c(s090Var2.getC()));
                        if (!s090Var2.e().contains("selected")) {
                            e = h;
                        }
                        lz2Var = new lz2(imageProvider, nextUp, (y2b1) null, 0.0f, (pt3) null, (AppearanceType) null, pointF, e, new PointF(ytb1.b(s090Var2.getC()), ytb1.c(s090Var2.getC())), HProv.PP_SAME_MEDIA);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Set singleton = Collections.singleton(lz2Var);
                ru.yandex.taxi.map_common.map.utils.a aVar = a0Var.b;
                zlp c = fkpVar2.getC();
                zzs a3 = c != null ? c.getA() : null;
                overlayComponentFactory$prepareOverlay$12.L$0 = fkpVar2;
                overlayComponentFactory$prepareOverlay$12.L$1 = null;
                overlayComponentFactory$prepareOverlay$12.L$2 = vm00Var2;
                overlayComponentFactory$prepareOverlay$12.L$3 = null;
                overlayComponentFactory$prepareOverlay$12.L$4 = str5;
                overlayComponentFactory$prepareOverlay$12.L$5 = l;
                overlayComponentFactory$prepareOverlay$12.L$6 = a2;
                overlayComponentFactory$prepareOverlay$12.L$7 = singleton;
                overlayComponentFactory$prepareOverlay$12.label = 2;
                aVar.getClass();
                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                fkp fkpVar5 = fkpVar2;
                Object b2 = aVar.b(new Point(a3.a, a3.b), overlayComponentFactory$prepareOverlay$12);
                if (b2 != coroutineSingletons) {
                    fkpVar3 = fkpVar5;
                    str = str5;
                    str2 = a2;
                    vm00Var3 = vm00Var2;
                    set = singleton;
                    obj = b2;
                    f4c0 f4c0Var2 = new f4c0(ru.yandex.taxi.map.utils.a.F(fkpVar3.getC().getA()), null, 6);
                    f4c0Var2.i(false);
                    return new t090(str, l, str2, set, (XYPoint) obj, vm00Var3, f4c0Var2);
                }
                return coroutineSingletons;
            }
        }
        overlayComponentFactory$prepareOverlay$1 = new OverlayComponentFactory$prepareOverlay$1(a0Var, continuationImpl);
        OverlayComponentFactory$prepareOverlay$1 overlayComponentFactory$prepareOverlay$122 = overlayComponentFactory$prepareOverlay$1;
        Object obj2 = overlayComponentFactory$prepareOverlay$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = overlayComponentFactory$prepareOverlay$122.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        a190 f22 = s090Var2.getF();
        if (f22 == null) {
        }
        String str52 = a + s090Var2.e() + s090Var2.getA() + ((Object) charSequence2);
        l = ru.yandex.taxi.layers.source.factory.a.l(s090Var2.getB());
        String a22 = fkpVar2.getA();
        synchronized (a0Var) {
        }
    }

    @Override // defpackage.zm00
    public final tpr a(an00 an00Var) {
        fkp d = an00Var.d();
        vm00 b = an00Var.b();
        jmp b2 = d.getB();
        List list = null;
        List f2 = b2 != null ? b2.getF() : null;
        List list2 = f2;
        if (list2 != null && !list2.isEmpty()) {
            list = f2;
        }
        if (list == null) {
            return pvn.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            s090 s090Var = (s090) obj;
            if (s090Var.getD() != null && s090Var.getC() != null && s090Var.getB() != null && !s090Var.e().isEmpty()) {
                arrayList.add(obj);
            }
        }
        return new z(new kotlinx.coroutines.flow.g(arrayList), this, d, b);
    }

    public final ImageProvider e(CharSequence charSequence, String str) {
        String h2 = b64.h(charSequence, "overlay_", str);
        LruCache lruCache = this.e;
        ImageProvider imageProvider = (ImageProvider) lruCache.get(h2);
        if (imageProvider != null) {
            return imageProvider;
        }
        RobotoTextView robotoTextView = new RobotoTextView(this.a, null, 0, 6, null);
        robotoTextView.setBackground(this.d);
        robotoTextView.setText(charSequence);
        robotoTextView.setGravity(17);
        if (str != null) {
            robotoTextView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str)));
        }
        xw31.r(robotoTextView);
        ImageProvider fromBitmap = ImageProvider.fromBitmap(xw31.t(robotoTextView), true, h2);
        lruCache.put(h2, fromBitmap);
        return fromBitmap;
    }
}
