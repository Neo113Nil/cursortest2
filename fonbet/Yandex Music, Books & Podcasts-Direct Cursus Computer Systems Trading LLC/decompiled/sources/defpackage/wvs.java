package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final /* synthetic */ class wvs implements myc, u9t, nn5, jpj {
    public static final wvs b = new wvs(4);
    public static final wvs c = new wvs(5);
    public static final wvs d = new wvs(6);
    public static final wvs e = new wvs(7);
    public static final wvs f = new wvs(8);
    public final /* synthetic */ int a;

    public /* synthetic */ wvs(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b() {
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void e(int i, Exception exc, String str) {
        throw new wxt(i, exc, str);
    }

    public static /* synthetic */ void f(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void h(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void j(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void n() {
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void o(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void p(String str) {
        throw new RuntimeException(str);
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        o9t lambda$getComponents$0;
        o9t lambda$getComponents$1;
        o9t lambda$getComponents$2;
        switch (this.a) {
            case 10:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(rdkVar);
                return lambda$getComponents$0;
            case 11:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(rdkVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(rdkVar);
                return lambda$getComponents$2;
        }
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        hqv hqvVar = kqvVar.a;
        kqv n = hqvVar.n(0, hqvVar.g(1).b, 0, 0);
        n.getClass();
        return wdu.l(view, n);
    }

    @Override // defpackage.u9t
    public void a(Exception exc) {
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        qsn f2;
        int i = 0;
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                dsc dscVar = dsc.O;
                bsc bscVar = new bsc();
                if (bundle != null) {
                    ClassLoader classLoader = sk3.class.getClassLoader();
                    int i2 = dvt.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(dsc.P);
                String str = dscVar.a;
                if (string == null) {
                    string = str;
                }
                bscVar.a = string;
                String string2 = bundle.getString(dsc.Q);
                String str2 = dscVar.b;
                if (string2 == null) {
                    string2 = str2;
                }
                bscVar.b = string2;
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(dsc.u0);
                if (parcelableArrayList == null) {
                    f2 = qsn.e;
                } else {
                    tde u = yde.u();
                    for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                        bundle2.getClass();
                        String string3 = bundle2.getString(rif.c);
                        String string4 = bundle2.getString(rif.d);
                        string4.getClass();
                        u.a(new rif(string3, string4));
                    }
                    f2 = u.f();
                }
                bscVar.c = yde.v(f2);
                String string5 = bundle.getString(dsc.R);
                String str3 = dscVar.d;
                if (string5 == null) {
                    string5 = str3;
                }
                bscVar.d = string5;
                bscVar.e = bundle.getInt(dsc.S, dscVar.e);
                bscVar.f = bundle.getInt(dsc.T, dscVar.f);
                bscVar.g = bundle.getInt(dsc.v0, dscVar.g);
                bscVar.h = bundle.getInt(dsc.U, dscVar.h);
                bscVar.i = bundle.getInt(dsc.V, dscVar.i);
                String string6 = bundle.getString(dsc.W);
                String str4 = dscVar.k;
                if (string6 == null) {
                    string6 = str4;
                }
                bscVar.j = string6;
                String string7 = bundle.getString(dsc.X);
                String str5 = dscVar.m;
                if (string7 == null) {
                    string7 = str5;
                }
                bscVar.l = l5i.p(string7);
                String string8 = bundle.getString(dsc.Y);
                String str6 = dscVar.n;
                if (string8 == null) {
                    string8 = str6;
                }
                bscVar.m = l5i.p(string8);
                bscVar.n = bundle.getInt(dsc.Z, dscVar.o);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(dsc.a0 + "_" + Integer.toString(i, 36));
                    if (byteArray == null) {
                        bscVar.p = arrayList;
                        bscVar.q = (pqa) bundle.getParcelable(dsc.b0);
                        bscVar.r = bundle.getLong(dsc.c0, dscVar.s);
                        bscVar.t = bundle.getInt(dsc.d0, dscVar.u);
                        bscVar.u = bundle.getInt(dsc.e0, dscVar.v);
                        bscVar.v = bundle.getFloat(dsc.f0, dscVar.w);
                        bscVar.w = bundle.getInt(dsc.g0, dscVar.x);
                        bscVar.x = bundle.getFloat(dsc.h0, dscVar.y);
                        bscVar.y = bundle.getByteArray(dsc.i0);
                        bscVar.z = bundle.getInt(dsc.j0, dscVar.A);
                        bscVar.B = bundle.getInt(dsc.w0, dscVar.C);
                        Bundle bundle3 = bundle.getBundle(dsc.k0);
                        if (bundle3 != null) {
                            bscVar.A = new q85(bundle3.getInt(q85.i, -1), bundle3.getInt(q85.j, -1), bundle3.getInt(q85.k, -1), bundle3.getInt(q85.m, -1), bundle3.getInt(q85.n, -1), bundle3.getByteArray(q85.l));
                        }
                        bscVar.C = bundle.getInt(dsc.l0, dscVar.D);
                        bscVar.D = bundle.getInt(dsc.m0, dscVar.E);
                        bscVar.E = bundle.getInt(dsc.n0, dscVar.F);
                        bscVar.F = bundle.getInt(dsc.o0, dscVar.G);
                        bscVar.G = bundle.getInt(dsc.p0, dscVar.H);
                        bscVar.H = bundle.getInt(dsc.q0, dscVar.I);
                        bscVar.J = bundle.getInt(dsc.s0, dscVar.K);
                        bscVar.K = bundle.getInt(dsc.t0, dscVar.L);
                        bscVar.L = bundle.getInt(dsc.r0, dscVar.M);
                        return new dsc(bscVar);
                    }
                    arrayList.add(byteArray);
                    i++;
                }
            case 1:
                return Integer.valueOf(((xvs) obj).c);
            case 2:
                d3t d3tVar = (d3t) obj;
                d3tVar.getClass();
                Bundle bundle4 = new Bundle();
                bundle4.putBundle(d3t.f, d3tVar.b.d());
                bundle4.putIntArray(d3t.g, d3tVar.d);
                bundle4.putBooleanArray(d3t.h, d3tVar.e);
                bundle4.putBoolean(d3t.i, d3tVar.c);
                return bundle4;
            default:
                Bundle bundle5 = (Bundle) obj;
                Bundle bundle6 = bundle5.getBundle(d3t.f);
                bundle6.getClass();
                xvs a = xvs.a(bundle6);
                int[] intArray = bundle5.getIntArray(d3t.g);
                int i4 = a.a;
                return new d3t(a, bundle5.getBoolean(d3t.i, false), (int[]) ezf.A(intArray, new int[i4]), (boolean[]) ezf.A(bundle5.getBooleanArray(d3t.h), new boolean[i4]));
        }
    }
}
