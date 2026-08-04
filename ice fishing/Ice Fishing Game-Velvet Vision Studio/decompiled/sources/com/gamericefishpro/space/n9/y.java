package com.gamericefishpro.space.n9;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.e7;
import com.gamericefishpro.space.i9.f9;
import com.gamericefishpro.space.i9.g7;
import com.gamericefishpro.space.i9.j7;
import com.gamericefishpro.space.i9.n8;
import com.gamericefishpro.space.i9.o8;
import com.gamericefishpro.space.i9.p7;
import com.gamericefishpro.space.i9.q8;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.i9.t8;
import com.gamericefishpro.space.i9.w8;
import com.gamericefishpro.space.i9.y7;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class y implements v, com.gamericefishpro.space.u2.n {
    public static y O;
    public static y P;
    public final /* synthetic */ int d;
    public static final /* synthetic */ y e = new y(0);
    public static final /* synthetic */ y i = new y(1);
    public static final /* synthetic */ y v = new y(2);
    public static final /* synthetic */ y w = new y(3);
    public static final /* synthetic */ y y = new y(4);
    public static final /* synthetic */ y z = new y(5);
    public static final /* synthetic */ y A = new y(6);
    public static final /* synthetic */ y B = new y(7);
    public static final /* synthetic */ y C = new y(8);
    public static final /* synthetic */ y D = new y(9);
    public static final /* synthetic */ y E = new y(10);
    public static final /* synthetic */ y F = new y(11);
    public static final /* synthetic */ y G = new y(12);
    public static final /* synthetic */ y H = new y(13);
    public static final /* synthetic */ y I = new y(14);
    public static final /* synthetic */ y J = new y(15);
    public static final /* synthetic */ y K = new y(16);
    public static final /* synthetic */ y L = new y(17);
    public static final /* synthetic */ y M = new y(18);
    public static final /* synthetic */ y N = new y(19);

    public /* synthetic */ y(int i2) {
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.n9.v
    public Object a() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                List list = e0.a;
                o8.e.get();
                Long l = (Long) q8.b.b();
                l.getClass();
                return l;
            case 1:
                List list2 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.s.b()).longValue());
            case 2:
                List list3 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.d.b()).longValue());
            case 3:
                List list4 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.j0.b()).longValue());
            case 4:
                List list5 = e0.a;
                e7.e.get();
                return (String) g7.c0.b();
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                List list6 = e0.a;
                e7.e.get();
                Long l2 = (Long) g7.j.b();
                l2.getClass();
                return l2;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = e0.a;
                e7.e.get();
                return (String) g7.k.b();
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = e0.a;
                e7.e.get();
                Long l3 = (Long) g7.Z.b();
                l3.getClass();
                return l3;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.w.b()).longValue());
            case 9:
                List list10 = e0.a;
                e7.e.get();
                Boolean bool = (Boolean) g7.C.b();
                bool.getClass();
                return bool;
            case 10:
                List list11 = e0.a;
                Boolean bool2 = (Boolean) y7.a.b();
                bool2.getClass();
                return bool2;
            case RequestError.STOP_TRACKING /* 11 */:
                List list12 = e0.a;
                Boolean bool3 = (Boolean) n8.a.b();
                bool3.getClass();
                return bool3;
            case 12:
                List list13 = e0.a;
                return Integer.valueOf((int) ((Long) j7.a.b()).longValue());
            case 13:
                List list14 = e0.a;
                Boolean bool4 = (Boolean) f9.a.b();
                bool4.getClass();
                return bool4;
            case 14:
                List list15 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.m0.b()).longValue());
            case 15:
                List list16 = e0.a;
                r8.e.get();
                Boolean bool5 = (Boolean) t8.g.b();
                bool5.getClass();
                return bool5;
            case 16:
                List list17 = e0.a;
                Boolean bool6 = (Boolean) p7.b.b();
                bool6.getClass();
                return bool6;
            case 17:
                List list18 = e0.a;
                r8.e.get();
                Boolean bool7 = (Boolean) t8.d.b();
                bool7.getClass();
                return bool7;
            case 18:
                List list19 = e0.a;
                e7.e.get();
                Long l4 = (Long) g7.a.b();
                l4.getClass();
                return l4;
            default:
                return new Boolean(((Boolean) w8.a.b()).booleanValue());
        }
    }

    public Signature[] b(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean c(CharSequence charSequence) {
        return false;
    }

    public y(com.gamericefishpro.space.a8.c cVar) {
        this.d = 22;
    }
}
