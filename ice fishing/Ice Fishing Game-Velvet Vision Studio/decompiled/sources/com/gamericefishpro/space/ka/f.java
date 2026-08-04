package com.gamericefishpro.space.ka;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.b8;
import com.gamericefishpro.space.i9.e7;
import com.gamericefishpro.space.i9.g7;
import com.gamericefishpro.space.i9.m7;
import com.gamericefishpro.space.i9.o8;
import com.gamericefishpro.space.i9.q8;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.i9.t8;
import com.gamericefishpro.space.n9.e0;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class f implements com.gamericefishpro.space.d4.t, com.gamericefishpro.space.d9.e, com.gamericefishpro.space.l4.c, com.gamericefishpro.space.m.n, com.gamericefishpro.space.n9.v {
    public final /* synthetic */ int d;
    public static final /* synthetic */ f e = new f(11);
    public static final /* synthetic */ f i = new f(12);
    public static final /* synthetic */ f v = new f(13);
    public static final /* synthetic */ f w = new f(14);
    public static final /* synthetic */ f y = new f(15);
    public static final /* synthetic */ f z = new f(16);
    public static final /* synthetic */ f A = new f(17);
    public static final /* synthetic */ f B = new f(18);
    public static final /* synthetic */ f C = new f(19);
    public static final /* synthetic */ f D = new f(20);
    public static final /* synthetic */ f E = new f(21);
    public static final /* synthetic */ f F = new f(22);
    public static final /* synthetic */ f G = new f(23);
    public static final /* synthetic */ f H = new f(24);
    public static final /* synthetic */ f I = new f(25);
    public static final /* synthetic */ f J = new f(26);
    public static final /* synthetic */ f K = new f(27);
    public static final /* synthetic */ f L = new f(28);
    public static final /* synthetic */ f M = new f(29);

    public /* synthetic */ f(int i2) {
        this.d = i2;
    }

    public static com.gamericefishpro.space.f5.k f(com.gamericefishpro.space.b9.b bVar, com.gamericefishpro.space.f5.x destination, Bundle bundle, com.gamericefishpro.space.z4.p hostLifecycleState, com.gamericefishpro.space.f5.p pVar) {
        String id = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id, "toString(...)");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id, "id");
        return new com.gamericefishpro.space.f5.k(bVar, destination, bundle, hostLifecycleState, pVar, id, null);
    }

    @Override // com.gamericefishpro.space.n9.v
    public Object a() {
        switch (this.d) {
            case RequestError.STOP_TRACKING /* 11 */:
                return new Boolean(((Boolean) m7.a.b()).booleanValue());
            case 12:
                return new Boolean(((Boolean) b8.a.b()).booleanValue());
            case 13:
                List list = e0.a;
                r8.e.get();
                Boolean bool = (Boolean) t8.c.b();
                bool.getClass();
                return bool;
            case 14:
                List list2 = e0.a;
                e7.e.get();
                return (String) g7.e.b();
            case 15:
                List list3 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.l0.b()).longValue());
            case 16:
                List list4 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.q0.b()).longValue());
            case 17:
                List list5 = e0.a;
                e7.e.get();
                return (String) g7.n.b();
            case 18:
                List list6 = e0.a;
                e7.e.get();
                Long l = (Long) g7.T.b();
                l.getClass();
                return l;
            case 19:
                List list7 = e0.a;
                e7.e.get();
                Long l2 = (Long) g7.J.b();
                l2.getClass();
                return l2;
            case 20:
                List list8 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.P.b()).longValue());
            case 21:
                List list9 = e0.a;
                e7.e.get();
                Long l3 = (Long) g7.R.b();
                l3.getClass();
                return l3;
            case 22:
                List list10 = e0.a;
                e7.e.get();
                Long l4 = (Long) g7.f.b();
                l4.getClass();
                return l4;
            case 23:
                List list11 = e0.a;
                e7.e.get();
                Long l5 = (Long) g7.h0.b();
                l5.getClass();
                return l5;
            case 24:
                List list12 = e0.a;
                e7.e.get();
                Long l6 = (Long) g7.z.b();
                l6.getClass();
                return l6;
            case 25:
                List list13 = e0.a;
                e7.e.get();
                Long l7 = (Long) g7.F.b();
                l7.getClass();
                return l7;
            case 26:
                List list14 = e0.a;
                e7.e.get();
                Long l8 = (Long) g7.t0.b();
                l8.getClass();
                return l8;
            case 27:
                List list15 = e0.a;
                e7.e.get();
                Long l9 = (Long) g7.m.b();
                l9.getClass();
                return l9;
            case 28:
                List list16 = e0.a;
                e7.e.get();
                Long l10 = (Long) g7.G.b();
                l10.getClass();
                return l10;
            default:
                List list17 = e0.a;
                o8.e.get();
                return (String) q8.f.b();
        }
    }

    @Override // com.gamericefishpro.space.m.n
    public boolean c(com.gamericefishpro.space.m.i iVar) {
        return false;
    }

    @Override // com.gamericefishpro.space.d9.e
    public com.gamericefishpro.space.d9.d e(Context context, String str, com.gamericefishpro.space.d9.c cVar) {
        com.gamericefishpro.space.d9.d dVar = new com.gamericefishpro.space.d9.d();
        int iC = cVar.c(context, str);
        dVar.a = iC;
        if (iC != 0) {
            dVar.c = -1;
            return dVar;
        }
        int iF = cVar.f(str, true, context);
        dVar.b = iF;
        if (iF != 0) {
            dVar.c = 1;
        }
        return dVar;
    }

    @Override // com.gamericefishpro.space.l4.c
    public Object d(com.gamericefishpro.space.l4.b bVar) throws com.gamericefishpro.space.l4.b {
        throw bVar;
    }

    @Override // com.gamericefishpro.space.m.n
    public void b(com.gamericefishpro.space.m.i iVar, boolean z2) {
    }

    @Override // com.gamericefishpro.space.d4.t
    public void onScrollLimit(int i2, int i3, int i4, boolean z2) {
    }

    @Override // com.gamericefishpro.space.d4.t
    public void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
