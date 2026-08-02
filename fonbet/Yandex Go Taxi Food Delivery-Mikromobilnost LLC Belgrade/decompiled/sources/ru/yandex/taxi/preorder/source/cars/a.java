package ru.yandex.taxi.preorder.source.cars;

import android.content.Context;
import android.graphics.Bitmap;
import com.yandex.go.navigation.screen.c;
import com.yandex.runtime.image.ImageProvider;
import defpackage.avj0;
import defpackage.d0h0;
import defpackage.dot0;
import defpackage.f1h0;
import defpackage.jbh;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.u8b1;
import defpackage.unr0;
import defpackage.zuj0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes9.dex */
public final class a {
    public static final int f;
    public static final HashMap g;
    public final Context a;
    public final zuj0 b;
    public final k7x0 c;
    public final c d;
    public final qqo e;

    static {
        int i = f1h0.map_car_econom;
        f = i;
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("econom", Integer.valueOf(i));
        hashMap.put("business", Integer.valueOf(d0h0.map_car_business));
        hashMap.put("vip", Integer.valueOf(d0h0.map_car_ultima));
        hashMap.put("ultimate", Integer.valueOf(d0h0.map_car_ultima));
        hashMap.put("maybach", Integer.valueOf(d0h0.map_car_ultima));
        hashMap.put("premium_van", Integer.valueOf(d0h0.map_car_ultima));
        hashMap.put("personal_driver", Integer.valueOf(d0h0.map_car_ultima));
    }

    public a(Context context, zuj0 zuj0Var, k7x0 k7x0Var, rqo rqoVar, c cVar) {
        this.a = context;
        this.b = zuj0Var;
        this.c = k7x0Var;
        this.d = cVar;
        dot0.Companion.getClass();
        this.e = ((jbh) rqoVar).c(dot0.k);
    }

    public final ImageProvider a(String str) {
        Integer num = (Integer) g.get(str);
        return ImageProvider.fromResource(this.a, num != null ? num.intValue() : f);
    }

    public final String b(String str) {
        dot0 dot0Var = (dot0) this.e.b();
        String str2 = null;
        if (!dot0Var.equals(dot0.k)) {
            c cVar = this.d;
            if (cVar.h()) {
                str2 = (String) dot0Var.f.get(str);
            } else if (cVar.g()) {
                str2 = (String) dot0Var.g.get(str);
            } else if (cVar.f()) {
                str2 = (String) dot0Var.h.get(str);
            }
        }
        if (str2 == null) {
            str2 = String.format(Locale.US, "class_%s_poi", Arrays.copyOf(new Object[]{str}, 1));
        }
        return ((m7x0) this.c).a(str2);
    }

    public final Bitmap c(Bitmap bitmap, String str) {
        if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            return bitmap;
        }
        unr0.D(new Object[]{String.valueOf(bitmap.getConfig()), str, Integer.valueOf(((avj0) this.b).j())}, 3, "Have car image config %s for tariff %s with size_hint %d", jst.e, new IllegalStateException("Wrong car image config"));
        return u8b1.f(bitmap);
    }

    public final m0 d() {
        return new m0(this.e.a(), this.d.c(), new CarsImageResourceProvider$registerForInfoUpdates$1());
    }
}
