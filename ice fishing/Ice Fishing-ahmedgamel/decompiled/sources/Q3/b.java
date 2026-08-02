package Q3;

import D.x;
import I7.l;
import Q7.q;
import X.C0414c;
import X.C0416e;
import X.v;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import b0.C0516b;
import f1.C4515a;
import f1.C4516b;
import j1.p;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k1.AbstractC4640b;
import k1.C4641c;
import kotlin.jvm.internal.r;
import m1.C4739a;
import u7.C5082h;
import u7.C5089o;
import u7.C5091q;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f2651a;

    public b() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(List list, v vVar, B7.c cVar) {
        C0414c c0414c;
        int i;
        List list2;
        r rVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0414c) {
            c0414c = (C0414c) cVar;
            int i4 = c0414c.f3659w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0414c.f3659w = i4 - Integer.MIN_VALUE;
                Object obj = c0414c.f3658v;
                Object obj2 = A7.a.f215n;
                i = c0414c.f3659w;
                if (i != 0) {
                    s(obj);
                    ArrayList arrayList = new ArrayList();
                    C0416e c0416e = new C0416e(list, arrayList, null);
                    c0414c.f3656n = arrayList;
                    c0414c.f3659w = 1;
                    if (vVar.a(c0416e, c0414c) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0414c.f3657u;
                        rVar = (r) c0414c.f3656n;
                        try {
                            s(obj);
                        } catch (Throwable th2) {
                            Object obj3 = rVar.f38644n;
                            if (obj3 == null) {
                                rVar.f38644n = th2;
                            } else {
                                A8.b.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            l lVar = (l) it.next();
                            c0414c.f3656n = rVar;
                            c0414c.f3657u = it;
                            c0414c.f3659w = 2;
                            if (lVar.invoke(c0414c) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) rVar.f38644n;
                        if (th == null) {
                            return u7.v.f41073a;
                        }
                        throw th;
                    }
                    list2 = (List) c0414c.f3656n;
                    s(obj);
                }
                rVar = new r();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) rVar.f38644n;
                if (th == null) {
                }
            }
        }
        c0414c = new C0414c(cVar);
        Object obj4 = c0414c.f3658v;
        Object obj22 = A7.a.f215n;
        i = c0414c.f3659w;
        if (i != 0) {
        }
        rVar = new r();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) rVar.f38644n;
        if (th == null) {
        }
    }

    public static final C5082h b(Throwable exception) {
        kotlin.jvm.internal.h.e(exception, "exception");
        return new C5082h(exception);
    }

    public static int h(int i, View view) {
        Context context = view.getContext();
        TypedValue h3 = com.bumptech.glide.e.h(view.getContext(), view.getClass().getCanonicalName(), i);
        int i4 = h3.resourceId;
        return i4 != 0 ? E.b.a(context, i4) : h3.data;
    }

    public static int i(Context context, int i, int i4) {
        Integer num;
        TypedValue f2 = com.bumptech.glide.e.f(context, i);
        if (f2 != null) {
            int i6 = f2.resourceId;
            num = Integer.valueOf(i6 != 0 ? E.b.a(context, i6) : f2.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i4;
    }

    public static boolean j(int i) {
        if (i == 0) {
            return false;
        }
        ThreadLocal threadLocal = G.c.f1029a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d9 = red / 255.0d;
        double pow = d9 < 0.04045d ? d9 / 12.92d : Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
        double d10 = green / 255.0d;
        double pow2 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = blue / 255.0d;
        double pow3 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d12 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d12;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d12 / 100.0d > 0.5d;
    }

    public static final boolean k(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.h.d(className, "getClassName(...)");
            if (q.h0(className, "com.onesignal")) {
                return true;
            }
        }
        return false;
    }

    public static int l(int i, int i4, float f2) {
        return G.c.b(G.c.d(i4, Math.round(Color.alpha(i4) * f2)), i);
    }

    public static C4515a m(C4641c c4641c, Z0.i iVar) {
        return new C4515a(p.a(c4641c, iVar, 1.0f, j1.f.f38428u, false), 0);
    }

    public static C4516b n(AbstractC4640b abstractC4640b, Z0.i iVar, boolean z6) {
        return new C4516b(2, p.a(abstractC4640b, iVar, z6 ? l1.i.c() : 1.0f, j1.f.f38429v, false));
    }

    public static C4515a o(C4641c c4641c, Z0.i iVar, int i) {
        N6.i iVar2 = new N6.i(11);
        iVar2.f2062u = i;
        ArrayList a9 = p.a(c4641c, iVar, 1.0f, iVar2, false);
        for (int i4 = 0; i4 < a9.size(); i4++) {
            C4739a c4739a = (C4739a) a9.get(i4);
            g1.c cVar = (g1.c) c4739a.f39341b;
            g1.c cVar2 = (g1.c) c4739a.f39342c;
            if (cVar != null && cVar2 != null) {
                float[] fArr = cVar.f37585a;
                int length = fArr.length;
                float[] fArr2 = cVar2.f37585a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i6 = 0;
                    for (int i9 = 0; i9 < length2; i9++) {
                        float f9 = fArr3[i9];
                        if (f9 != f2) {
                            fArr3[i6] = f9;
                            i6++;
                            f2 = fArr3[i9];
                        }
                    }
                    float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i6);
                    c4739a = new C4739a(cVar.b(copyOfRange), cVar2.b(copyOfRange));
                }
            }
            a9.set(i4, c4739a);
        }
        return new C4515a(a9, 1);
    }

    public static C4515a p(AbstractC4640b abstractC4640b, Z0.i iVar) {
        return new C4515a(p.a(abstractC4640b, iVar, 1.0f, j1.f.f38430w, false), 2);
    }

    public static C4515a q(C4641c c4641c, Z0.i iVar) {
        return new C4515a(p.a(c4641c, iVar, l1.i.c(), j1.f.f38432y, true), 3);
    }

    public static C0516b r(MappedByteBuffer mappedByteBuffer) {
        long j6;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i) {
                j6 = -1;
                break;
            }
            int i6 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j6 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i4++;
        }
        if (j6 != -1) {
            duplicate.position(duplicate.position() + ((int) (j6 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j9 = duplicate.getInt() & 4294967295L;
            for (int i9 = 0; i9 < j9; i9++) {
                int i10 = duplicate.getInt();
                long j10 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i10 || 1701669481 == i10) {
                    duplicate.position((int) (j10 + j6));
                    C0516b c0516b = new C0516b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0516b.f2133w = duplicate;
                    c0516b.f2130n = position;
                    int i11 = position - duplicate.getInt(position);
                    c0516b.f2131u = i11;
                    c0516b.f2132v = ((ByteBuffer) c0516b.f2133w).getShort(i11);
                    return c0516b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final void s(Object obj) {
        if (obj instanceof C5082h) {
            throw ((C5082h) obj).f41054n;
        }
    }

    public static final C5089o t(String str) {
        int i;
        A8.b.f(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i6 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i9 = i4 ^ Integer.MIN_VALUE;
            if (Integer.compare(i9, i6 ^ Integer.MIN_VALUE) > 0) {
                if (i6 != 119304647) {
                    return null;
                }
                i6 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i9, i6 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i10 = i4 * 10;
            int i11 = digit + i10;
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i4 = i11;
        }
        return new C5089o(i4);
    }

    public static final C5091q u(String str) {
        int i;
        long j6;
        kotlin.jvm.internal.h.e(str, "<this>");
        int i4 = 10;
        A8.b.f(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i6 = 1;
        if (kotlin.jvm.internal.h.f(charAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i = 1;
        }
        long j9 = 10;
        long j10 = 0;
        long j11 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), i4);
            if (digit < 0) {
                return null;
            }
            int i9 = length;
            long j12 = j10 ^ Long.MIN_VALUE;
            int i10 = i;
            if (Long.compare(j12, j11 ^ Long.MIN_VALUE) <= 0) {
                j6 = j9;
            } else {
                if (j11 != 512409557603043100L) {
                    return null;
                }
                if (j9 >= 0) {
                    long j13 = (Long.MAX_VALUE / j9) << i6;
                    j6 = j9;
                    j11 = j13 + ((((-1) - (j13 * j9)) ^ Long.MIN_VALUE) >= (j9 ^ Long.MIN_VALUE) ? i6 : 0);
                } else if (Long.MAX_VALUE < (j9 ^ Long.MIN_VALUE)) {
                    j6 = j9;
                    j11 = 0;
                } else {
                    j11 = 1;
                    j6 = j9;
                }
                if (Long.compare(j12, j11 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j14 = j10 * j6;
            long j15 = (digit & 4294967295L) + j14;
            if (Long.compare(j15 ^ Long.MIN_VALUE, j14 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i10 + 1;
            j10 = j15;
            length = i9;
            j9 = j6;
            i4 = 10;
            i6 = 1;
        }
        return new C5091q(j10);
    }

    public static Intent v(String str, String str2, HashMap hashMap) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                if (!str3.equals("id") && !str3.equals("referrer")) {
                    appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
                }
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        return intent;
    }

    public static void w(Object[] objArr, int i) {
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(x.k(i4, "at index ", new StringBuilder(String.valueOf(i4).length() + 9)));
            }
        }
    }

    public static Intent x(String str, String str2, String str3, HashMap hashMap) {
        Intent intent = new Intent("android.intent.action.VIEW", y(str, str2, hashMap));
        intent.setPackage("com.android.vending");
        intent.putExtra("overlay", true);
        intent.putExtra("callerId", str3);
        intent.putExtra("hsdp_caller_source", "hpoa");
        return intent;
    }

    public static Uri y(String str, String str2, HashMap hashMap) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("play.google.com").path("d").appendQueryParameter("id", str).appendQueryParameter("referrer", str2);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            if (!str3.equals("id") && !str3.equals("referrer")) {
                appendQueryParameter.appendQueryParameter(str3, (String) entry.getValue());
            }
        }
        return appendQueryParameter.build();
    }

    public abstract Typeface c(Context context, F.g gVar, Resources resources, int i);

    public abstract Typeface d(Context context, L.h[] hVarArr, int i);

    public Typeface e(Context context, InputStream inputStream) {
        File n9 = S0.f.n(context);
        if (n9 == null) {
            return null;
        }
        try {
            if (S0.f.h(n9, inputStream)) {
                return Typeface.createFromFile(n9.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            n9.delete();
        }
    }

    public Typeface f(Context context, Resources resources, int i, String str, int i4) {
        File n9 = S0.f.n(context);
        if (n9 == null) {
            return null;
        }
        try {
            if (S0.f.g(n9, resources, i)) {
                return Typeface.createFromFile(n9.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            n9.delete();
        }
    }

    public L.h g(L.h[] hVarArr, int i) {
        new O2.i(4);
        int i4 = (i & 1) == 0 ? 400 : com.anythink.core.common.m.a.f15187n;
        boolean z6 = (i & 2) != 0;
        L.h hVar = null;
        int i6 = Integer.MAX_VALUE;
        for (L.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.f1709c - i4) * 2) + (hVar2.f1710d == z6 ? 0 : 1);
            if (hVar == null || i6 > abs) {
                hVar = hVar2;
                i6 = abs;
            }
        }
        return hVar;
    }
}
