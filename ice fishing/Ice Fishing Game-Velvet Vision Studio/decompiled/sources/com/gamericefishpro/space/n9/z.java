package com.gamericefishpro.space.n9;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.e7;
import com.gamericefishpro.space.i9.g7;
import com.gamericefishpro.space.i9.h8;
import com.gamericefishpro.space.i9.i9;
import com.gamericefishpro.space.i9.l9;
import com.gamericefishpro.space.i9.o8;
import com.gamericefishpro.space.i9.p7;
import com.gamericefishpro.space.i9.q8;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.i9.r9;
import com.gamericefishpro.space.i9.t8;
import com.gamericefishpro.space.i9.v7;
import com.gamericefishpro.space.i9.z8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements v, com.gamericefishpro.space.p5.c, kotlin.coroutines.f, com.gamericefishpro.space.u2.o {
    public final /* synthetic */ int d;
    public static final /* synthetic */ z e = new z(0);
    public static final /* synthetic */ z i = new z(1);
    public static final /* synthetic */ z v = new z(2);
    public static final /* synthetic */ z w = new z(3);
    public static final /* synthetic */ z y = new z(4);
    public static final /* synthetic */ z z = new z(5);
    public static final /* synthetic */ z A = new z(6);
    public static final /* synthetic */ z B = new z(7);
    public static final /* synthetic */ z C = new z(8);
    public static final /* synthetic */ z D = new z(9);
    public static final /* synthetic */ z E = new z(10);
    public static final /* synthetic */ z F = new z(11);
    public static final /* synthetic */ z G = new z(12);
    public static final /* synthetic */ z H = new z(13);
    public static final /* synthetic */ z I = new z(14);
    public static final /* synthetic */ z J = new z(15);
    public static final /* synthetic */ z K = new z(16);
    public static final /* synthetic */ z L = new z(17);
    public static final /* synthetic */ z M = new z(18);
    public static final /* synthetic */ z N = new z(19);

    public /* synthetic */ z(int i2) {
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.n9.v
    public Object a() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                List list = e0.a;
                o8.e.get();
                return Integer.valueOf((int) ((Long) q8.d.b()).longValue());
            case 1:
                List list2 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.u.b()).longValue());
            case 2:
                List list3 = e0.a;
                e7.e.get();
                Long l = (Long) g7.d0.b();
                l.getClass();
                return l;
            case 3:
                List list4 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.x.b()).longValue());
            case 4:
                List list5 = e0.a;
                e7.e.get();
                return (String) g7.Y.b();
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                List list6 = e0.a;
                e7.e.get();
                return (String) g7.D.b();
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = e0.a;
                e7.e.get();
                return (String) g7.b0.b();
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.W.b()).longValue());
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.v.b()).longValue());
            case 9:
                List list10 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.B.b()).longValue());
            case 10:
                List list11 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.i0.b()).longValue());
            case RequestError.STOP_TRACKING /* 11 */:
                List list12 = e0.a;
                Boolean bool = (Boolean) r9.a.b();
                bool.getClass();
                return bool;
            case 12:
                List list13 = e0.a;
                Boolean bool2 = (Boolean) v7.a.b();
                bool2.getClass();
                return bool2;
            case 13:
                List list14 = e0.a;
                Boolean bool3 = (Boolean) l9.a.b();
                bool3.getClass();
                return bool3;
            case 14:
                List list15 = e0.a;
                r8.e.get();
                Boolean bool4 = (Boolean) t8.a.b();
                bool4.getClass();
                return bool4;
            case 15:
                List list16 = e0.a;
                r8.e.get();
                Boolean bool5 = (Boolean) t8.b.b();
                bool5.getClass();
                return bool5;
            case 16:
                List list17 = e0.a;
                Boolean bool6 = (Boolean) p7.a.b();
                bool6.getClass();
                return bool6;
            case 17:
                List list18 = e0.a;
                Boolean bool7 = (Boolean) z8.a.b();
                bool7.getClass();
                return bool7;
            case 18:
                return new Boolean(((Boolean) h8.a.b()).booleanValue());
            default:
                return new Boolean(((Boolean) i9.a.b()).booleanValue());
        }
    }

    @Override // com.gamericefishpro.space.u2.o
    public Typeface b(com.gamericefishpro.space.u2.k kVar, int i2) {
        if (i2 == 0 && Intrinsics.a(kVar, com.gamericefishpro.space.u2.k.i)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(Typeface.DEFAULT, kVar.d, i2 == 1);
    }

    public void c(com.gamericefishpro.space.u6.e eVar, float f) {
        com.gamericefishpro.space.s.b bVar = (com.gamericefishpro.space.s.b) ((Drawable) eVar.b);
        com.gamericefishpro.space.s.a aVar = (com.gamericefishpro.space.s.a) eVar.c;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f != bVar.e || bVar.f != useCompatPadding || bVar.g != preventCornerOverlap) {
            bVar.e = f;
            bVar.f = useCompatPadding;
            bVar.g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            eVar.k(0, 0, 0, 0);
            return;
        }
        com.gamericefishpro.space.s.b bVar2 = (com.gamericefishpro.space.s.b) ((Drawable) eVar.b);
        float f2 = bVar2.e;
        float f3 = bVar2.a;
        int iCeil = (int) Math.ceil(com.gamericefishpro.space.s.c.a(f2, f3, aVar.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(com.gamericefishpro.space.s.c.b(f2, f3, aVar.getPreventCornerOverlap()));
        eVar.k(iCeil, iCeil2, iCeil, iCeil2);
    }

    public /* synthetic */ z(RecyclerView recyclerView, int i2) {
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.p5.c
    public void g(int i2, Object obj) {
    }
}
