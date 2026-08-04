package com.gamericefishpro.space.lb;

import android.content.Context;
import android.graphics.Path;
import android.os.Looper;
import android.os.SystemClock;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.c8.p;
import com.gamericefishpro.space.data.db.IceFishingDatabase;
import com.gamericefishpro.space.i9.e7;
import com.gamericefishpro.space.i9.e8;
import com.gamericefishpro.space.i9.g7;
import com.gamericefishpro.space.i9.m7;
import com.gamericefishpro.space.i9.o9;
import com.gamericefishpro.space.n9.e0;
import com.gamericefishpro.space.n9.v;
import com.gamericefishpro.space.s5.q;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.e8.b, com.gamericefishpro.space.d9.e, com.gamericefishpro.space.d6.e, kotlin.coroutines.f, com.gamericefishpro.space.l8.a, v {
    public final /* synthetic */ int d;
    public static final /* synthetic */ e e = new e(11);
    public static final /* synthetic */ e i = new e(12);
    public static final /* synthetic */ e v = new e(13);
    public static final /* synthetic */ e w = new e(14);
    public static final /* synthetic */ e y = new e(15);
    public static final /* synthetic */ e z = new e(16);
    public static final /* synthetic */ e A = new e(17);
    public static final /* synthetic */ e B = new e(18);
    public static final /* synthetic */ e C = new e(19);
    public static final /* synthetic */ e D = new e(20);
    public static final /* synthetic */ e E = new e(21);
    public static final /* synthetic */ e F = new e(22);
    public static final /* synthetic */ e G = new e(23);
    public static final /* synthetic */ e H = new e(24);
    public static final /* synthetic */ e I = new e(25);
    public static final /* synthetic */ e J = new e(26);
    public static final /* synthetic */ e K = new e(27);
    public static final /* synthetic */ e L = new e(28);
    public static final /* synthetic */ e M = new e(29);

    public /* synthetic */ e(int i2) {
        this.d = i2;
    }

    public static Path f(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public static final boolean g() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.gamericefishpro.space.n9.v
    public Object a() {
        switch (this.d) {
            case RequestError.STOP_TRACKING /* 11 */:
                return new Boolean(((Boolean) m7.b.b()).booleanValue());
            case 12:
                return new Boolean(((Boolean) e8.a.b()).booleanValue());
            case 13:
                List list = e0.a;
                Boolean bool = (Boolean) o9.a.b();
                bool.getClass();
                return bool;
            case 14:
                List list2 = e0.a;
                e7.e.get();
                return (String) g7.l.b();
            case 15:
                List list3 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.o0.b()).longValue());
            case 16:
                List list4 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.r.b()).longValue());
            case 17:
                List list5 = e0.a;
                e7.e.get();
                return (String) g7.M.b();
            case 18:
                List list6 = e0.a;
                e7.e.get();
                Long l = (Long) g7.A.b();
                l.getClass();
                return l;
            case 19:
                List list7 = e0.a;
                e7.e.get();
                Long l2 = (Long) g7.L.b();
                l2.getClass();
                return l2;
            case 20:
                List list8 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.O.b()).longValue());
            case 21:
                List list9 = e0.a;
                e7.e.get();
                Long l3 = (Long) g7.Q.b();
                l3.getClass();
                return l3;
            case 22:
                List list10 = e0.a;
                e7.e.get();
                Long l4 = (Long) g7.f0.b();
                l4.getClass();
                return l4;
            case 23:
                List list11 = e0.a;
                e7.e.get();
                Long l5 = (Long) g7.E.b();
                l5.getClass();
                return l5;
            case 24:
                List list12 = e0.a;
                e7.e.get();
                Long l6 = (Long) g7.y.b();
                l6.getClass();
                return l6;
            case 25:
                List list13 = e0.a;
                e7.e.get();
                Long l7 = (Long) g7.g0.b();
                l7.getClass();
                return l7;
            case 26:
                List list14 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.s0.b()).longValue());
            case 27:
                List list15 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.o.b()).longValue());
            case 28:
                List list16 = e0.a;
                e7.e.get();
                Long l8 = (Long) g7.H.b();
                l8.getClass();
                return l8;
            default:
                List list17 = e0.a;
                e7.e.get();
                return (String) g7.g.b();
        }
    }

    public IceFishingDatabase b(Context context) {
        IceFishingDatabase iceFishingDatabase;
        Intrinsics.checkNotNullParameter(context, "context");
        IceFishingDatabase iceFishingDatabase2 = IceFishingDatabase.m;
        if (iceFishingDatabase2 != null) {
            return iceFishingDatabase2;
        }
        synchronized (this) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            q qVarO = com.gamericefishpro.space.b9.a.o(applicationContext, IceFishingDatabase.class, "ice_fishing_db");
            qVarO.p = false;
            qVarO.q = true;
            com.gamericefishpro.space.d7.h callback = new com.gamericefishpro.space.d7.h(0, context);
            Intrinsics.checkNotNullParameter(callback, "callback");
            qVarO.d.add(callback);
            iceFishingDatabase = (IceFishingDatabase) qVarO.b();
            IceFishingDatabase.m = iceFishingDatabase;
        }
        return iceFishingDatabase;
    }

    @Override // com.gamericefishpro.space.d6.e
    public com.gamericefishpro.space.d6.f c(com.gamericefishpro.space.d6.d configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new com.gamericefishpro.space.e6.h(configuration.a, configuration.b, configuration.c, configuration.d, configuration.e);
    }

    @Override // com.gamericefishpro.space.l8.a
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.gamericefishpro.space.d9.e
    public com.gamericefishpro.space.d9.d e(Context context, String str, com.gamericefishpro.space.d9.c cVar) {
        com.gamericefishpro.space.d9.d dVar = new com.gamericefishpro.space.d9.d();
        dVar.a = cVar.c(context, str);
        int i2 = 1;
        int iF = cVar.f(str, true, context);
        dVar.b = iF;
        int i3 = dVar.a;
        if (i3 == 0) {
            i3 = 0;
            if (iF == 0) {
                i2 = 0;
            } else if (i3 >= iF) {
                i2 = -1;
            }
        } else if (i3 >= iF) {
            i2 = -1;
        }
        dVar.c = i2;
        return dVar;
    }

    @Override // com.gamericefishpro.space.nh.a
    public Object get() {
        return new p(0, Executors.newSingleThreadExecutor());
    }

    public String toString() {
        switch (this.d) {
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
