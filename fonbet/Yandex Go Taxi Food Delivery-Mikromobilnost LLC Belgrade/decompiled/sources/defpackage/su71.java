package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.zzhr;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import io.appmetrica.analytics.impl.C0710sg;
import io.appmetrica.analytics.impl.Cg;
import io.appmetrica.analytics.impl.InterfaceC0892yo;
import io.appmetrica.analytics.impl.W0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import yads.aa2;
import yads.cs1;
import yads.kk0;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final /* synthetic */ class su71 implements pn71, re71, bz61, n281, Cg {
    public final /* synthetic */ int a;

    public static /* synthetic */ void b(int i, String str) {
        throw new aa2(str + i, null, true, 1);
    }

    public static /* synthetic */ void d(String str) {
        throw new zzhr(str);
    }

    public static /* synthetic */ void e(Throwable th) {
        throw new RuntimeRemoteException(th);
    }

    @Override // defpackage.pn71
    public kq71 a(Bundle bundle) {
        wk2 j;
        wk2 j2;
        kq71 th71Var;
        kq71 gv71Var;
        switch (this.a) {
            case 0:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    p481 p481Var = t31.b;
                    j = wk2.x;
                } else {
                    j = mt71.j(qd81.c0, parcelableArrayList);
                }
                return new tu71(bundle.getString(Integer.toString(1, 36), ""), (qd81[]) j.toArray(new qd81[0]));
            case 1:
                if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
                    float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                    return f == -1.0f ? new gv71() : new gv71(f);
                }
                w511.q();
                return null;
            case 2:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                return parcelableArrayList2 == null ? new wx71(new tu71[0]) : new wx71((tu71[]) mt71.j(tu71.y, parcelableArrayList2).toArray(new tu71[0]));
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            default:
                return new hw81(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
            case 8:
                return new q581(bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f), bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L));
            case 12:
                qd81 qd81Var = qd81.b0;
                da81 da81Var = new da81();
                ClassLoader classLoader = mt71.class.getClassLoader();
                int i = rf71.a;
                bundle.setClassLoader(classLoader);
                String string = bundle.getString(Integer.toString(0, 36));
                String str = qd81Var.a;
                if (string == null) {
                    string = str;
                }
                da81Var.a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                String str2 = qd81Var.b;
                if (string2 == null) {
                    string2 = str2;
                }
                da81Var.b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                String str3 = qd81Var.c;
                if (string3 == null) {
                    string3 = str3;
                }
                da81Var.c = string3;
                da81Var.d = bundle.getInt(Integer.toString(3, 36), qd81Var.w);
                da81Var.e = bundle.getInt(Integer.toString(4, 36), qd81Var.x);
                da81Var.f = bundle.getInt(Integer.toString(5, 36), qd81Var.y);
                da81Var.g = bundle.getInt(Integer.toString(6, 36), qd81Var.z);
                String string4 = bundle.getString(Integer.toString(7, 36));
                String str4 = qd81Var.B;
                if (string4 == null) {
                    string4 = str4;
                }
                da81Var.h = string4;
                cs1 cs1Var = (cs1) bundle.getParcelable(Integer.toString(8, 36));
                cs1 cs1Var2 = qd81Var.C;
                if (cs1Var == null) {
                    cs1Var = cs1Var2;
                }
                da81Var.i = cs1Var;
                String string5 = bundle.getString(Integer.toString(9, 36));
                String str5 = qd81Var.D;
                if (string5 == null) {
                    string5 = str5;
                }
                da81Var.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                String str6 = qd81Var.E;
                if (string6 == null) {
                    string6 = str6;
                }
                da81Var.k = string6;
                da81Var.l = bundle.getInt(Integer.toString(11, 36), qd81Var.F);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    byte[] byteArray = bundle.getByteArray(Integer.toString(12, 36) + "_" + Integer.toString(i2, 36));
                    if (byteArray == null) {
                        da81Var.m = arrayList;
                        da81Var.n = (kk0) bundle.getParcelable(Integer.toString(13, 36));
                        da81Var.o = bundle.getLong(Integer.toString(14, 36), qd81Var.I);
                        da81Var.p = bundle.getInt(Integer.toString(15, 36), qd81Var.J);
                        da81Var.q = bundle.getInt(Integer.toString(16, 36), qd81Var.K);
                        da81Var.r = bundle.getFloat(Integer.toString(17, 36), qd81Var.L);
                        da81Var.s = bundle.getInt(Integer.toString(18, 36), qd81Var.M);
                        da81Var.t = bundle.getFloat(Integer.toString(19, 36), qd81Var.N);
                        da81Var.u = bundle.getByteArray(Integer.toString(20, 36));
                        da81Var.v = bundle.getInt(Integer.toString(21, 36), qd81Var.P);
                        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
                        if (bundle2 != null) {
                            da81Var.w = new hw81(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
                        }
                        da81Var.x = bundle.getInt(Integer.toString(23, 36), qd81Var.R);
                        da81Var.y = bundle.getInt(Integer.toString(24, 36), qd81Var.S);
                        da81Var.z = bundle.getInt(Integer.toString(25, 36), qd81Var.T);
                        da81Var.A = bundle.getInt(Integer.toString(26, 36), qd81Var.U);
                        da81Var.B = bundle.getInt(Integer.toString(27, 36), qd81Var.V);
                        da81Var.C = bundle.getInt(Integer.toString(28, 36), qd81Var.W);
                        da81Var.D = bundle.getInt(Integer.toString(29, 36), qd81Var.Z);
                        return new qd81(da81Var);
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
            case 13:
                int i3 = bundle.getInt(Integer.toString(0, 36), 0);
                long j3 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
                long j4 = bundle.getLong(Integer.toString(2, 36), 0L);
                boolean z = bundle.getBoolean(Integer.toString(3, 36));
                Bundle bundle3 = bundle.getBundle(Integer.toString(4, 36));
                uu71 uu71Var = bundle3 != null ? (uu71) uu71.A.a(bundle3) : uu71.y;
                ie81 ie81Var = new ie81();
                ie81Var.d(null, null, i3, j3, j4, uu71Var, z);
                return ie81Var;
            case 14:
                Bundle bundle4 = bundle.getBundle(Integer.toString(0, 36));
                bundle4.getClass();
                ArrayList parcelableArrayList3 = bundle4.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList3 == null) {
                    p481 p481Var2 = t31.b;
                    j2 = wk2.x;
                } else {
                    j2 = mt71.j(qd81.c0, parcelableArrayList3);
                }
                tu71 tu71Var = new tu71(bundle4.getString(Integer.toString(1, 36), ""), (qd81[]) j2.toArray(new qd81[0]));
                int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
                int i4 = tu71Var.a;
                int[] iArr = new int[i4];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
                boolean[] zArr = new boolean[i4];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new le81(tu71Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
            case 15:
                nc81 nc81Var = new nc81();
                nc81Var.a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
                nc81Var.b = bundle.getString(Integer.toString(1, 36));
                bundle.getBundle(Integer.toString(2, 36));
                return new qf81(nc81Var);
            case 16:
                int i5 = bundle.getInt(Integer.toString(0, 36), -1);
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                ny61.g(q8a1.c(i5, "Unknown RatingType: "));
                                return null;
                            }
                            if (bundle.getInt(Integer.toString(0, 36), -1) != 3) {
                                w511.q();
                                return null;
                            }
                            if (!bundle.getBoolean(Integer.toString(1, 36), false)) {
                                return new if71();
                            }
                            th71Var = new if71(bundle.getBoolean(Integer.toString(2, 36), false));
                        } else {
                            if (bundle.getInt(Integer.toString(0, 36), -1) != 2) {
                                w511.q();
                                return null;
                            }
                            int i6 = bundle.getInt(Integer.toString(1, 36), 5);
                            float f2 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                            if (f2 != -1.0f) {
                                return new ju71(i6, f2);
                            }
                            gv71Var = new ju71(i6);
                        }
                    } else {
                        if (bundle.getInt(Integer.toString(0, 36), -1) != 1) {
                            w511.q();
                            return null;
                        }
                        float f3 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                        if (f3 == -1.0f) {
                            return new gv71();
                        }
                        gv71Var = new gv71(f3);
                    }
                    return gv71Var;
                }
                if (bundle.getInt(Integer.toString(0, 36), -1) != 0) {
                    w511.q();
                    return null;
                }
                if (!bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new th71();
                }
                th71Var = new th71(bundle.getBoolean(Integer.toString(2, 36), false));
                return th71Var;
            case 17:
                Object obj = uk81.J;
                Bundle bundle5 = bundle.getBundle(Integer.toString(1, 36));
                op81 op81Var = bundle5 != null ? (op81) op81.z.a(bundle5) : null;
                long j5 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
                long j6 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
                long j7 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
                boolean z2 = bundle.getBoolean(Integer.toString(5, 36), false);
                boolean z3 = bundle.getBoolean(Integer.toString(6, 36), false);
                Bundle bundle6 = bundle.getBundle(Integer.toString(7, 36));
                q581 q581Var = bundle6 != null ? new q581(bundle6.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle6.getFloat(Integer.toString(4, 36), -3.4028235E38f), bundle6.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle6.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle6.getLong(Integer.toString(2, 36), -9223372036854775807L)) : null;
                boolean z4 = bundle.getBoolean(Integer.toString(8, 36), false);
                long j8 = bundle.getLong(Integer.toString(9, 36), 0L);
                long j9 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
                int i7 = bundle.getInt(Integer.toString(11, 36), 0);
                int i8 = bundle.getInt(Integer.toString(12, 36), 0);
                long j10 = bundle.getLong(Integer.toString(13, 36), 0L);
                uk81 uk81Var = new uk81();
                uk81Var.a(uk81.K, op81Var, null, j5, j6, j7, z2, z3, q581Var, j8, j9, i7, i8, j10);
                uk81Var.D = z4;
                return uk81Var;
            case 18:
                String string7 = bundle.getString(Integer.toString(0, 36), "");
                string7.getClass();
                Bundle bundle7 = bundle.getBundle(Integer.toString(1, 36));
                q581 q581Var2 = bundle7 == null ? q581.y : new q581(bundle7.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle7.getFloat(Integer.toString(4, 36), -3.4028235E38f), bundle7.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle7.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle7.getLong(Integer.toString(2, 36), -9223372036854775807L));
                Bundle bundle8 = bundle.getBundle(Integer.toString(2, 36));
                oi61 oi61Var = bundle8 == null ? oi61.b0 : (oi61) oi61.c0.a(bundle8);
                Bundle bundle9 = bundle.getBundle(Integer.toString(3, 36));
                dw71 dw71Var = bundle9 == null ? dw71.z : (dw71) ys71.y.a(bundle9);
                Bundle bundle10 = bundle.getBundle(Integer.toString(4, 36));
                return new op81(string7, dw71Var, null, q581Var2, oi61Var, bundle10 == null ? qf81.c : (qf81) qf81.w.a(bundle10));
        }
    }

    @Override // defpackage.re71
    public Object c(wl71 wl71Var) {
        switch (this.a) {
            case 4:
                int i = zz71.w;
                break;
        }
        return wl71Var;
    }

    @Override // defpackage.bz61
    public void onInitializationCompleted() {
    }

    public /* synthetic */ su71(int i) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.Cg
    public InterfaceC0892yo a(W0 w0) {
        return C0710sg.b(w0);
    }

    @Override // defpackage.n281
    public int a(Object obj) {
        aq61 aq61Var = (aq61) obj;
        switch (this.a) {
            case 6:
                String str = aq61Var.a;
                mf81.e.getClass();
                byte[] decode = Base64.decode("T01YLmdvb2dsZQ==", 0);
                Charset charset = uza.a;
                if (str.startsWith(new String(decode, charset)) || str.startsWith("c2.android")) {
                    return 1;
                }
                return (rf71.a >= 26 || !str.equals(new String(Base64.decode("T01YLk1USy5BVURJTy5ERUNPREVSLlJBVw==", 0), charset))) ? 0 : -1;
            default:
                String str2 = aq61Var.a;
                mf81.e.getClass();
                return str2.startsWith(new String(Base64.decode("T01YLmdvb2dsZQ==", 0), uza.a)) ? 1 : 0;
        }
    }
}
