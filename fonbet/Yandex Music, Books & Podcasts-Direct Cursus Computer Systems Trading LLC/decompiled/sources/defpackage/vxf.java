package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class vxf {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final znh e;
    public final qlp f;

    static {
        int i2 = dvt.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public vxf(int i2, long j2, znh znhVar, qlp qlpVar, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = znhVar;
        this.f = qlpVar;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vxf a(Bundle bundle) {
        qlp qlpVar;
        qlp qlpVar2;
        int i2;
        int i3 = bundle.getInt(g, 0);
        long j2 = bundle.getLong(h, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(i);
        Object obj = null;
        znh a = bundle2 == null ? null : znh.a(bundle2);
        Bundle bundle3 = bundle.getBundle(l);
        if (bundle3 != null) {
            qlpVar2 = qlp.a(bundle3);
        } else {
            if (i3 == 0) {
                qlpVar = null;
                i2 = bundle.getInt(k);
                if (i2 != 1) {
                    String str = j;
                    if (i2 == 2) {
                        Bundle bundle4 = bundle.getBundle(str);
                        if (bundle4 != null) {
                            obj = onh.b(bundle4);
                        }
                    } else if (i2 == 3) {
                        IBinder binder = bundle.getBinder(str);
                        if (binder != null) {
                            yde a2 = vk3.a(binder);
                            tde u = yde.u();
                            for (int i4 = 0; i4 < a2.size(); i4++) {
                                Bundle bundle5 = (Bundle) a2.get(i4);
                                bundle5.getClass();
                                u.a(onh.b(bundle5));
                            }
                            obj = u.f();
                        }
                    } else if (i2 != 4) {
                        e7o.n();
                        return null;
                    }
                }
                return new vxf(i3, j2, a, qlpVar, obj, i2);
            }
            qlpVar2 = new qlp(i3);
        }
        qlpVar = qlpVar2;
        i2 = bundle.getInt(k);
        if (i2 != 1) {
        }
        return new vxf(i3, j2, a, qlpVar, obj, i2);
    }
}
