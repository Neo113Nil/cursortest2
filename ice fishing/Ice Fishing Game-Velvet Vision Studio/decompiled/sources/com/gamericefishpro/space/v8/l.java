package com.gamericefishpro.space.v8;

import android.content.Context;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.c9;
import com.gamericefishpro.space.i9.d7;
import com.gamericefishpro.space.i9.e7;
import com.gamericefishpro.space.i9.g7;
import com.gamericefishpro.space.i9.o8;
import com.gamericefishpro.space.i9.q8;
import com.gamericefishpro.space.i9.s7;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.gamericefishpro.space.d9.c, com.gamericefishpro.space.d9.e, com.gamericefishpro.space.a2.a, com.gamericefishpro.space.e8.b, com.gamericefishpro.space.l8.a, com.gamericefishpro.space.n9.f, com.gamericefishpro.space.n9.v {
    public static l e;
    public final /* synthetic */ int d;
    public static final /* synthetic */ l i = new l(10);
    public static final /* synthetic */ l v = new l(11);
    public static final /* synthetic */ l w = new l(12);
    public static final /* synthetic */ l y = new l(13);
    public static final /* synthetic */ l z = new l(14);
    public static final /* synthetic */ l A = new l(15);
    public static final /* synthetic */ l B = new l(16);
    public static final /* synthetic */ l C = new l(17);
    public static final /* synthetic */ l D = new l(18);
    public static final /* synthetic */ l E = new l(19);
    public static final /* synthetic */ l F = new l(20);
    public static final /* synthetic */ l G = new l(21);
    public static final /* synthetic */ l H = new l(22);
    public static final /* synthetic */ l I = new l(23);
    public static final /* synthetic */ l J = new l(24);
    public static final /* synthetic */ l K = new l(25);
    public static final /* synthetic */ l L = new l(26);
    public static final /* synthetic */ l M = new l(27);
    public static final /* synthetic */ l N = new l(28);
    public static final /* synthetic */ l O = new l(29);

    public /* synthetic */ l(int i2) {
        this.d = i2;
    }

    public static final float g(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        int i3 = i2 - 1;
        if (i3 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i3 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i3];
            float f10 = fArr[i2];
            f2 = fArr2[i3];
            f3 = f9;
            f4 = fArr2[i2];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    @Override // com.gamericefishpro.space.n9.v
    public Object a() {
        switch (this.d) {
            case RequestError.STOP_TRACKING /* 11 */:
                return new Boolean(((Boolean) s7.a.b()).booleanValue());
            case 12:
                List list = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l = (Long) g7.b.b();
                l.getClass();
                return l;
            case 13:
                List list2 = com.gamericefishpro.space.n9.e0.a;
                Boolean bool = (Boolean) c9.a.b();
                bool.getClass();
                return bool;
            case 14:
                List list3 = com.gamericefishpro.space.n9.e0.a;
                Boolean bool2 = (Boolean) d7.a.b();
                bool2.getClass();
                return bool2;
            case 15:
                List list4 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.k0.b()).longValue());
            case 16:
                List list5 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                return (String) g7.u0.b();
            case 17:
                List list6 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                return (String) g7.N.b();
            case 18:
                List list7 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l2 = (Long) g7.U.b();
                l2.getClass();
                return l2;
            case 19:
                List list8 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.K.b()).longValue());
            case 20:
                List list9 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l3 = (Long) g7.S.b();
                l3.getClass();
                return l3;
            case 21:
                List list10 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l4 = (Long) g7.I.b();
                l4.getClass();
                return l4;
            case 22:
                List list11 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l5 = (Long) g7.v0.b();
                l5.getClass();
                return l5;
            case 23:
                List list12 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l6 = (Long) g7.i.b();
                l6.getClass();
                return l6;
            case 24:
                List list13 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l7 = (Long) g7.V.b();
                l7.getClass();
                return l7;
            case 25:
                List list14 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                return (String) g7.h.b();
            case 26:
                List list15 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                Long l8 = (Long) g7.p0.b();
                l8.getClass();
                return l8;
            case 27:
                List list16 = com.gamericefishpro.space.n9.e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.t.b()).longValue());
            case 28:
                List list17 = com.gamericefishpro.space.n9.e0.a;
                o8.e.get();
                Boolean bool3 = (Boolean) q8.a.b();
                bool3.getClass();
                return bool3;
            default:
                List list18 = com.gamericefishpro.space.n9.e0.a;
                o8.e.get();
                Long l9 = (Long) q8.e.b();
                l9.getClass();
                return l9;
        }
    }

    @Override // com.gamericefishpro.space.n9.f
    public /* synthetic */ String b(String str, String str2) {
        return null;
    }

    @Override // com.gamericefishpro.space.d9.c
    public int c(Context context, String str) {
        return com.gamericefishpro.space.d9.f.a(context, str);
    }

    @Override // com.gamericefishpro.space.l8.a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // com.gamericefishpro.space.d9.e
    public com.gamericefishpro.space.d9.d e(Context context, String str, com.gamericefishpro.space.d9.c cVar) {
        int iF;
        com.gamericefishpro.space.d9.d dVar = new com.gamericefishpro.space.d9.d();
        int iC = cVar.c(context, str);
        dVar.a = iC;
        int i2 = 1;
        int i3 = 0;
        if (iC != 0) {
            iF = cVar.f(str, false, context);
            dVar.b = iF;
        } else {
            iF = cVar.f(str, true, context);
            dVar.b = iF;
        }
        int i4 = dVar.a;
        if (i4 == 0) {
            if (iF == 0) {
                i2 = 0;
            }
            dVar.c = i2;
            return dVar;
        }
        i3 = i4;
        if (i3 >= iF) {
            i2 = -1;
        }
        dVar.c = i2;
        return dVar;
    }

    @Override // com.gamericefishpro.space.d9.c
    public int f(String str, boolean z2, Context context) {
        return com.gamericefishpro.space.d9.f.d(str, z2, context);
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        l lVar = new l(8);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(com.gamericefishpro.space.z7.d.d, new com.gamericefishpro.space.i8.b(30000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(com.gamericefishpro.space.z7.d.i, new com.gamericefishpro.space.i8.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.gamericefishpro.space.i8.c.e)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(com.gamericefishpro.space.z7.d.e, new com.gamericefishpro.space.i8.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < com.gamericefishpro.space.z7.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new com.gamericefishpro.space.i8.a(lVar, map);
    }
}
