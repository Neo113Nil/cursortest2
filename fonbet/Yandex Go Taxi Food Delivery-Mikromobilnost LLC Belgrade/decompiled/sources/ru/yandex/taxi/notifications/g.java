package ru.yandex.taxi.notifications;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import defpackage.a280;
import defpackage.b280;
import defpackage.cug;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.fxo;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.k7x0;
import defpackage.mdh;
import defpackage.mxo;
import defpackage.ohf0;
import defpackage.pav;
import defpackage.q5z;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zuj0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class g {
    public final pav a;
    public final k7x0 b;
    public final hit c;
    public final tt2 d;
    public final ohf0 e;
    public final zuj0 f;
    public final mxo g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final n0 i;
    public final eci0 j;

    public g(pav pavVar, k7x0 k7x0Var, hit hitVar, tt2 tt2Var, ohf0 ohf0Var, zuj0 zuj0Var, mxo mxoVar) {
        this.a = pavVar;
        this.b = k7x0Var;
        this.c = hitVar;
        this.d = tt2Var;
        this.e = ohf0Var;
        this.f = zuj0Var;
        this.g = mxoVar;
        n0 c = ffx.c(0, 1, null, 5);
        this.i = c;
        this.j = kotlinx.coroutines.flow.e.c(c);
    }

    public final Bitmap a(fxo fxoVar, String str) {
        Integer S = q5z.S(str);
        if (S != null && fxoVar.a() != null && fxoVar.c() != null) {
            Bitmap a = b(fxoVar.c()).a();
            Bitmap a2 = b(fxoVar.a()).a();
            String d = fxoVar.d();
            Bitmap a3 = d != null ? b(d).a() : null;
            if (a != null && a2 != null) {
                int intValue = S.intValue();
                Bitmap createBitmap = Bitmap.createBitmap(a2.getWidth(), a2.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setColorFilter(new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(a2, 0.0f, 0.0f, paint);
                if (a3 != null) {
                    Paint paint2 = new Paint();
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
                    canvas.drawBitmap(a3, 0.0f, 0.0f, paint2);
                }
                canvas.drawBitmap(a, 0.0f, 0.0f, (Paint) null);
                return createBitmap;
            }
        }
        Bitmap a4 = b(fxoVar.b()).a();
        if (a4 == null) {
            return null;
        }
        String b = fxoVar.b();
        cug cugVar = this.g.a;
        cugVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("imageTag", b);
        cugVar.a.a("ExtendedNotification.Default", hashMap, 1, new HashMap());
        return a4;
    }

    public final b280 b(String str) {
        ConcurrentHashMap concurrentHashMap = this.h;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            obj = a280.a;
            concurrentHashMap.put(str, obj);
            hbp0 hbp0Var = this.c.a;
            this.d.getClass();
            sjh sjhVar = uyj.a;
            tje.N(hbp0Var, mdh.b, null, new OrderNotificationImageRepository$requestImage$1$1(this, str, null), 2);
        }
        return (b280) obj;
    }
}
