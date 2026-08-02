package ru.yandex.taxi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.dot0;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.k7x0;
import defpackage.mdh;
import defpackage.pav;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.sp2;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v48;
import defpackage.xby;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final pav b;
    public final k7x0 c;
    public final sp2 d;
    public final ru.yandex.taxi.preorder.source.cars.a e;
    public final tt2 f;
    public final Bitmap g = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public final qqo h;

    public a(Context context, pav pavVar, k7x0 k7x0Var, sp2 sp2Var, ru.yandex.taxi.preorder.source.cars.a aVar, tt2 tt2Var, rqo rqoVar) {
        this.a = context;
        this.b = pavVar;
        this.c = k7x0Var;
        this.d = sp2Var;
        this.e = aVar;
        this.f = tt2Var;
        dot0.Companion.getClass();
        this.h = ((jbh) rqoVar).c(dot0.k);
    }

    public final Object a(v48 v48Var, ContinuationImpl continuationImpl) {
        this.f.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new CarOnMapInOrderIconsProviderImpl$carIcon$2(v48Var, this, null), continuationImpl);
    }

    public final Bitmap b(int i, v48 v48Var) {
        Bitmap decodeResource = BitmapFactory.decodeResource(this.a.getResources(), i);
        if (decodeResource == null) {
            decodeResource = this.g;
        }
        Bitmap bitmap = decodeResource;
        this.d.getClass();
        String str = v48Var.a;
        int i2 = 16572416;
        if (str != null && !evu0.J(str) && !str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.charAt(0) != '#') {
                try {
                    i2 = Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
                } catch (IllegalArgumentException unused) {
                }
            }
            try {
                i2 = Color.parseColor(upperCase);
            } catch (IllegalArgumentException e) {
                xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            }
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i2, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        for (int i3 = 0; i3 < height; i3++) {
            int i4 = iArr[i3];
            Color.colorToHSV(i4, fArr);
            float f4 = fArr[0];
            if (75.0f <= f4 && f4 <= 165.0f) {
                fArr[0] = f;
                fArr[1] = (fArr[1] / 0.86f) * f2;
                fArr[2] = (fArr[2] / 0.82f) * f3;
                iArr[i3] = Color.HSVToColor(Color.alpha(i4), fArr);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return createBitmap;
    }
}
