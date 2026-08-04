package com.gamericefishpro.space.n9;

import android.graphics.Typeface;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.i9.a7;
import com.gamericefishpro.space.i9.e7;
import com.gamericefishpro.space.i9.g7;
import com.gamericefishpro.space.i9.k8;
import com.gamericefishpro.space.i9.o8;
import com.gamericefishpro.space.i9.q8;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.i9.t8;
import com.gamericefishpro.space.i9.u9;
import com.gamericefishpro.space.i9.v7;
import com.gamericefishpro.space.i9.y7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements v, com.gamericefishpro.space.p5.c, com.gamericefishpro.space.u2.o {
    public final /* synthetic */ int d;
    public static final /* synthetic */ a0 e = new a0(0);
    public static final /* synthetic */ a0 i = new a0(1);
    public static final /* synthetic */ a0 v = new a0(2);
    public static final /* synthetic */ a0 w = new a0(3);
    public static final /* synthetic */ a0 y = new a0(4);
    public static final /* synthetic */ a0 z = new a0(5);
    public static final /* synthetic */ a0 A = new a0(6);
    public static final /* synthetic */ a0 B = new a0(7);
    public static final /* synthetic */ a0 C = new a0(8);
    public static final /* synthetic */ a0 D = new a0(9);
    public static final /* synthetic */ a0 E = new a0(10);
    public static final /* synthetic */ a0 F = new a0(11);
    public static final /* synthetic */ a0 G = new a0(12);
    public static final /* synthetic */ a0 H = new a0(13);
    public static final /* synthetic */ a0 I = new a0(14);
    public static final /* synthetic */ a0 J = new a0(15);
    public static final /* synthetic */ a0 K = new a0(16);
    public static final /* synthetic */ a0 L = new a0(17);
    public static final /* synthetic */ a0 M = new a0(18);

    public /* synthetic */ a0(int i2) {
        this.d = i2;
    }

    public static com.gamericefishpro.space.o1.a0 c(List list, float f, float f2, int i2) {
        return new com.gamericefishpro.space.o1.a0(list, null, (((long) Float.floatToRawIntBits((i2 & 2) != 0 ? 0.0f : f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static com.gamericefishpro.space.o1.f0 d(int i2, List list) {
        return new com.gamericefishpro.space.o1.f0(list, (i2 & 4) != 0 ? Float.POSITIVE_INFINITY : 900.0f);
    }

    public static com.gamericefishpro.space.o1.a0 e(List list, float f, int i2) {
        return new com.gamericefishpro.space.o1.a0(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f)) & 4294967295L));
    }

    public static com.gamericefishpro.space.o1.a0 f(Pair[] pairArr) {
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L);
        ArrayList arrayList = new ArrayList(pairArr2.length);
        for (Pair pair : pairArr2) {
            arrayList.add(new com.gamericefishpro.space.o1.s(((com.gamericefishpro.space.o1.s) pair.e).a));
        }
        ArrayList arrayList2 = new ArrayList(pairArr2.length);
        for (Pair pair2 : pairArr2) {
            arrayList2.add(Float.valueOf(((Number) pair2.d).floatValue()));
        }
        return new com.gamericefishpro.space.o1.a0(arrayList, arrayList2, jFloatToRawIntBits, jFloatToRawIntBits2);
    }

    @Override // com.gamericefishpro.space.n9.v
    public Object a() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                List list = e0.a;
                o8.e.get();
                Double d = (Double) q8.c.b();
                d.getClass();
                return d;
            case 1:
                List list2 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.q.b()).longValue());
            case 2:
                List list3 = e0.a;
                e7.e.get();
                Long l = (Long) g7.e0.b();
                l.getClass();
                return l;
            case 3:
                List list4 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.p.b()).longValue());
            case 4:
                List list5 = e0.a;
                e7.e.get();
                return (String) g7.a0.b();
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                List list6 = e0.a;
                e7.e.get();
                return (String) g7.w0.b();
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.r0.b()).longValue());
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.X.b()).longValue());
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = e0.a;
                e7.e.get();
                Boolean bool = (Boolean) g7.c.b();
                bool.getClass();
                return bool;
            case 9:
                List list10 = e0.a;
                Boolean bool2 = (Boolean) y7.b.b();
                bool2.getClass();
                return bool2;
            case 10:
                List list11 = e0.a;
                Boolean bool3 = (Boolean) y7.c.b();
                bool3.getClass();
                return bool3;
            case RequestError.STOP_TRACKING /* 11 */:
                List list12 = e0.a;
                Boolean bool4 = (Boolean) u9.a.b();
                bool4.getClass();
                return bool4;
            case 12:
                List list13 = e0.a;
                Boolean bool5 = (Boolean) v7.b.b();
                bool5.getClass();
                return bool5;
            case 13:
                List list14 = e0.a;
                r8.e.get();
                Boolean bool6 = (Boolean) t8.f.b();
                bool6.getClass();
                return bool6;
            case 14:
                List list15 = e0.a;
                r8.e.get();
                Boolean bool7 = (Boolean) t8.h.b();
                bool7.getClass();
                return bool7;
            case 15:
                List list16 = e0.a;
                r8.e.get();
                Boolean bool8 = (Boolean) t8.e.b();
                bool8.getClass();
                return bool8;
            case 16:
                List list17 = e0.a;
                Boolean bool9 = (Boolean) a7.a.b();
                bool9.getClass();
                return bool9;
            case 17:
                List list18 = e0.a;
                e7.e.get();
                return Integer.valueOf((int) ((Long) g7.n0.b()).longValue());
            default:
                return new Boolean(((Boolean) k8.a.b()).booleanValue());
        }
    }

    @Override // com.gamericefishpro.space.u2.o
    public Typeface b(com.gamericefishpro.space.u2.k kVar, int i2) {
        if (i2 == 0 && Intrinsics.a(kVar, com.gamericefishpro.space.u2.k.i)) {
            return Typeface.DEFAULT;
        }
        int i3 = 0;
        boolean z2 = Intrinsics.d(kVar.d, com.gamericefishpro.space.u2.k.e.d) >= 0;
        boolean z3 = i2 == 1;
        if (z3 && z2) {
            i3 = 3;
        } else if (z2) {
            i3 = 1;
        } else if (z3) {
            i3 = 2;
        }
        return Typeface.defaultFromStyle(i3);
    }

    @Override // com.gamericefishpro.space.p5.c
    public void g(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case RequestError.STOP_TRACKING /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    public a0() {
        this.d = 28;
        new com.gamericefishpro.space.r5.s0(16);
        long[] jArr = com.gamericefishpro.space.t.p0.a;
        new com.gamericefishpro.space.t.h0();
    }

    public a0(RecyclerView recyclerView) {
        this.d = 22;
    }

    public a0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.d = 23;
    }
}
