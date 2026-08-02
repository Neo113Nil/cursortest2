package ru.yandex.taxi.combo.factory;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.hgr0;
import defpackage.ny61;
import defpackage.pj6;
import defpackage.s8o;
import defpackage.tje;
import defpackage.ufu;
import defpackage.xng0;
import defpackage.xw31;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.combo.ui.ComboInnerBubble;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes5.dex */
public final class a {
    public final Context a;
    public final b b;
    public final e c;

    public a(Context context, b bVar, e eVar) {
        this.a = context;
        this.b = bVar;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(pj6 pj6Var, ContinuationImpl continuationImpl) {
        ComboInnerPinMapKitImageFactoryImpl$create$1 comboInnerPinMapKitImageFactoryImpl$create$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        pj6 pj6Var2;
        Object f;
        int i2;
        pj6 pj6Var3;
        Drawable drawable;
        Integer num;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof ComboInnerPinMapKitImageFactoryImpl$create$1) {
            comboInnerPinMapKitImageFactoryImpl$create$1 = (ComboInnerPinMapKitImageFactoryImpl$create$1) continuationImpl;
            int i3 = comboInnerPinMapKitImageFactoryImpl$create$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                comboInnerPinMapKitImageFactoryImpl$create$1.label = i3 - Integer.MIN_VALUE;
                ComboInnerPinMapKitImageFactoryImpl$create$1 comboInnerPinMapKitImageFactoryImpl$create$12 = comboInnerPinMapKitImageFactoryImpl$create$1;
                Object obj = comboInnerPinMapKitImageFactoryImpl$create$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = comboInnerPinMapKitImageFactoryImpl$create$12.label;
                BitmapDrawable bitmapDrawable2 = null;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int u = tje.u(14, context);
                    comboInnerPinMapKitImageFactoryImpl$create$12.L$0 = pj6Var;
                    comboInnerPinMapKitImageFactoryImpl$create$12.label = 1;
                    obj = b.e(this.b, u, hgr0.e, false, comboInnerPinMapKitImageFactoryImpl$create$12, 12);
                    if (obj != coroutineSingletons) {
                        pj6Var2 = pj6Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = comboInnerPinMapKitImageFactoryImpl$create$12.I$0;
                    num = (Integer) comboInnerPinMapKitImageFactoryImpl$create$12.L$2;
                    drawable = (Drawable) comboInnerPinMapKitImageFactoryImpl$create$12.L$1;
                    pj6Var3 = (pj6) comboInnerPinMapKitImageFactoryImpl$create$12.L$0;
                    kotlin.b.b(obj);
                    bitmapDrawable = (BitmapDrawable) obj;
                    if (bitmapDrawable != null) {
                        bitmapDrawable.mutate();
                        bitmapDrawable.setTint(i2);
                        bitmapDrawable2 = bitmapDrawable;
                    }
                    ComboInnerBubble comboInnerBubble = new ComboInnerBubble(context);
                    comboInnerBubble.setShadow(drawable);
                    if (num != null) {
                        comboInnerBubble.setBgColor(num.intValue());
                    }
                    comboInnerBubble.setTitle(pj6Var3.a);
                    comboInnerBubble.setSubtitle(pj6Var3.b);
                    comboInnerBubble.setIcon(bitmapDrawable2);
                    IconStyle iconStyle = new IconStyle(new PointF(0.5f, 1.12f), null, null, null, null, null, null);
                    xw31.r(comboInnerBubble);
                    return new bl00(ImageProvider.fromBitmap(xw31.t(comboInnerBubble)), iconStyle);
                }
                pj6Var2 = (pj6) comboInnerPinMapKitImageFactoryImpl$create$12.L$0;
                kotlin.b.b(obj);
                Drawable drawable2 = (Drawable) obj;
                String str = pj6Var2.d;
                int i4 = xng0.textInvert;
                e eVar = this.c;
                int m = s8o.m(((ufu) eVar.c).f(new bdc(i4), str), eVar.a);
                Integer c = eVar.c(pj6Var2.e);
                String str2 = pj6Var2.c;
                comboInnerPinMapKitImageFactoryImpl$create$12.L$0 = pj6Var2;
                comboInnerPinMapKitImageFactoryImpl$create$12.L$1 = drawable2;
                comboInnerPinMapKitImageFactoryImpl$create$12.L$2 = c;
                comboInnerPinMapKitImageFactoryImpl$create$12.I$0 = m;
                comboInnerPinMapKitImageFactoryImpl$create$12.label = 2;
                f = e.f(eVar, str2, null, comboInnerPinMapKitImageFactoryImpl$create$12, 6);
                if (f != coroutineSingletons) {
                    obj = f;
                    i2 = m;
                    pj6Var3 = pj6Var2;
                    drawable = drawable2;
                    num = c;
                    bitmapDrawable = (BitmapDrawable) obj;
                    if (bitmapDrawable != null) {
                    }
                    ComboInnerBubble comboInnerBubble2 = new ComboInnerBubble(context);
                    comboInnerBubble2.setShadow(drawable);
                    if (num != null) {
                    }
                    comboInnerBubble2.setTitle(pj6Var3.a);
                    comboInnerBubble2.setSubtitle(pj6Var3.b);
                    comboInnerBubble2.setIcon(bitmapDrawable2);
                    IconStyle iconStyle2 = new IconStyle(new PointF(0.5f, 1.12f), null, null, null, null, null, null);
                    xw31.r(comboInnerBubble2);
                    return new bl00(ImageProvider.fromBitmap(xw31.t(comboInnerBubble2)), iconStyle2);
                }
                return coroutineSingletons;
            }
        }
        comboInnerPinMapKitImageFactoryImpl$create$1 = new ComboInnerPinMapKitImageFactoryImpl$create$1(this, continuationImpl);
        ComboInnerPinMapKitImageFactoryImpl$create$1 comboInnerPinMapKitImageFactoryImpl$create$122 = comboInnerPinMapKitImageFactoryImpl$create$1;
        Object obj2 = comboInnerPinMapKitImageFactoryImpl$create$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = comboInnerPinMapKitImageFactoryImpl$create$122.label;
        BitmapDrawable bitmapDrawable22 = null;
        Context context2 = this.a;
        if (i != 0) {
        }
        Drawable drawable22 = (Drawable) obj2;
        String str3 = pj6Var2.d;
        int i42 = xng0.textInvert;
        e eVar2 = this.c;
        int m2 = s8o.m(((ufu) eVar2.c).f(new bdc(i42), str3), eVar2.a);
        Integer c2 = eVar2.c(pj6Var2.e);
        String str22 = pj6Var2.c;
        comboInnerPinMapKitImageFactoryImpl$create$122.L$0 = pj6Var2;
        comboInnerPinMapKitImageFactoryImpl$create$122.L$1 = drawable22;
        comboInnerPinMapKitImageFactoryImpl$create$122.L$2 = c2;
        comboInnerPinMapKitImageFactoryImpl$create$122.I$0 = m2;
        comboInnerPinMapKitImageFactoryImpl$create$122.label = 2;
        f = e.f(eVar2, str22, null, comboInnerPinMapKitImageFactoryImpl$create$122, 6);
        if (f != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
