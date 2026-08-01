package a;

import I6.f;
import O.f0;
import Q7.j;
import R7.b;
import R7.c;
import X2.e;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.InputFilter;
import android.util.Log;
import com.bumptech.glide.d;
import d1.C4445c;
import f6.C4512a;
import f6.g;
import g8.p;
import g8.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k6.C4636a;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import l6.i;
import n6.AbstractC4759a;
import n6.C4760b;
import n6.C4763e;
import p7.C4853a;
import u7.C5092j;
import u7.C5093k;
import u7.C5101s;
import u7.EnumC5088f;
import u7.InterfaceC5087e;
import u7.w;
import y6.C5243a;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0422a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public static long f4229a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f4230b;

    public static final long d(String str) {
        c cVar;
        long j6;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = R7.a.f2760w;
        char charAt2 = str.charAt(0);
        int i6 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z3 = (i6 > 0) && j.m0('-', str);
        if (length <= i6) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i6) != 'P') {
            throw new IllegalArgumentException();
        }
        int i9 = i6 + 1;
        if (i9 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long j9 = 0;
        boolean z6 = false;
        while (i9 < length) {
            if (str.charAt(i9) != 'T') {
                int i10 = i9;
                while (i10 < str.length() && (('0' <= (charAt = str.charAt(i10)) && charAt < ':') || j.V("+-.", charAt))) {
                    i10++;
                }
                String substring = str.substring(i9, i10);
                h.d(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i9;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i11 = length2 + 1;
                if (z6) {
                    if (charAt3 == 'H') {
                        cVar = c.f2768y;
                    } else if (charAt3 == 'M') {
                        cVar = c.f2767x;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        cVar = c.f2766w;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    cVar = c.f2769z;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int Z8 = j.Z(substring, '.', 0, 6);
                if (cVar != c.f2766w || Z8 <= 0) {
                    j9 = R7.a.e(j9, w(r(substring), cVar));
                } else {
                    String substring2 = substring.substring(0, Z8);
                    h.d(substring2, "substring(...)");
                    long e9 = R7.a.e(j9, w(r(substring2), cVar));
                    String substring3 = substring.substring(Z8);
                    h.d(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double d2 = d.d(parseDouble, cVar, c.f2764u);
                    if (Double.isNaN(d2)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    if (Double.isNaN(d2)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    long round = Math.round(d2);
                    if (-4611686018426999999L > round || round >= 4611686018427000000L) {
                        double d9 = d.d(parseDouble, cVar, c.f2765v);
                        if (Double.isNaN(d9)) {
                            throw new IllegalArgumentException("Cannot round NaN value.");
                        }
                        j6 = j(Math.round(d9));
                    } else {
                        j6 = k(round);
                    }
                    j9 = R7.a.e(e9, j6);
                }
                cVar2 = cVar;
                i9 = i11;
            } else {
                if (z6 || (i9 = i9 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z6 = true;
            }
        }
        if (!z3) {
            return j9;
        }
        long j10 = ((-(j9 >> 1)) << 1) + (((int) j9) & 1);
        int i12 = b.f2762a;
        return j10;
    }

    public static final void e(q qVar) {
        h.e(qVar, "<this>");
        if ((qVar instanceof q ? qVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + s.a(qVar.getClass()));
    }

    public static Object f(int i, Object obj) {
        if (i != Integer.MAX_VALUE) {
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(f(i, it.next()));
                }
                return arrayList;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                return str.length() < i ? obj : str.substring(0, i);
            }
        }
        return obj;
    }

    public static final p g(d8.b bVar) {
        h.e(bVar, "<this>");
        p pVar = bVar instanceof p ? (p) bVar : null;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + s.a(bVar.getClass()));
    }

    public static int h(int i, int i6, int i9) {
        return i < i6 ? i6 : i > i9 ? i9 : i;
    }

    public static final long i(long j6) {
        long j9 = (j6 << 1) + 1;
        int i = R7.a.f2760w;
        int i6 = b.f2762a;
        return j9;
    }

    public static final long j(long j6) {
        return (-4611686018426L > j6 || j6 >= 4611686018427L) ? i(V2.a.b(j6)) : k(j6 * 1000000);
    }

    public static final long k(long j6) {
        long j9 = j6 << 1;
        int i = R7.a.f2760w;
        int i6 = b.f2762a;
        return j9;
    }

    public static ArrayList l(G6.b bVar) {
        C4636a c4636a;
        int i = 1;
        ArrayList arrayList = new ArrayList();
        for (I6.d dVar : bVar.f1081v) {
            J6.b bVar2 = dVar.f1327v;
            String str = dVar.f1329x;
            if (str.isEmpty()) {
                str = null;
            }
            C4853a c4853a = C4853a.f39800c;
            C4445c c4445c = new C4445c();
            if (str == null) {
                str = null;
            }
            c4445c.g(e.N(bVar2.f1472v));
            C4853a a9 = C4853a.a(c4445c.d(), str);
            for (f fVar : dVar.f1328w) {
                H6.h hVar = fVar.f1331v;
                String str2 = hVar.f1242v;
                int i6 = Y6.a.f3965e;
                C4512a N8 = e.N(hVar.f1244x);
                String str3 = hVar.f1243w;
                if (str3.isEmpty()) {
                    str3 = null;
                }
                String str4 = fVar.f1333x;
                if (str4 == null) {
                    str4 = null;
                }
                Y6.a a10 = Y6.a.a(str2, str3, str4, N8);
                for (I6.b bVar3 : fVar.f1332w) {
                    long j6 = bVar3.f1321v;
                    byte b9 = (byte) (((byte) i) | 2);
                    i[] values = i.values();
                    int length = values.length;
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = i;
                        i iVar = values[i9];
                        if (iVar.f38932n == bVar3.f1323x.f1360n) {
                            H6.b bVar4 = bVar3.f1325z;
                            g a11 = bVar4 != null ? com.bumptech.glide.g.a(bVar4) : null;
                            C4512a N9 = e.N(bVar3.f1315A);
                            String c9 = bVar3.f1318D.c();
                            String c10 = bVar3.f1319E.c();
                            C4763e c4763e = C4763e.f39495c[((byte) (bVar3.f1317C & com.anythink.basead.exoplayer.k.p.f8473b)) & 255];
                            C4760b c4760b = AbstractC4759a.f39492a;
                            if (c10 != null) {
                                C4636a c4636a2 = C4636a.f38674f;
                                if (c10.length() == 16 && !"0000000000000000".contentEquals(c10)) {
                                    char[] cArr = k6.f.f38689a;
                                    int length2 = c10.length();
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length2) {
                                            if (!k6.f.f38691c[c10.charAt(i11)]) {
                                                break;
                                            }
                                            i11++;
                                        } else if (c9 != null && c9.length() == 32 && !"00000000000000000000000000000000".contentEquals(c9)) {
                                            int length3 = c9.length();
                                            for (int i12 = 0; i12 < length3; i12++) {
                                                if (k6.f.f38691c[c9.charAt(i12)]) {
                                                }
                                            }
                                            c4636a = new C4636a(c9, c10, c4763e, c4760b, true);
                                        }
                                    }
                                }
                            }
                            c4636a = new C4636a("00000000000000000000000000000000", "0000000000000000", c4763e, c4760b, false);
                            C4636a c4636a3 = c4636a;
                            int size = N9.size() + bVar3.f1316B;
                            byte b10 = (byte) (b9 | 4);
                            if (b10 != 7) {
                                StringBuilder sb = new StringBuilder();
                                if ((b10 & 1) == 0) {
                                    sb.append(" timestampEpochNanos");
                                }
                                if ((b10 & 2) == 0) {
                                    sb.append(" observedTimestampEpochNanos");
                                }
                                if ((b10 & 4) == 0) {
                                    sb.append(" totalAttributeCount");
                                }
                                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
                            }
                            arrayList.add(new C5243a(a9, a10, j6, bVar3.f1322w, c4636a3, iVar, bVar3.f1324y, size, N9, a11, bVar3.f1320F));
                            i = i10;
                        } else {
                            i9++;
                            i = i10;
                        }
                    }
                    throw new IllegalArgumentException();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void n(final Context context) {
        final boolean z3;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (d.g(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z3 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (Build.VERSION.SDK_INT >= 29) {
                S0.f.i(null);
                return;
            } else {
                final j3.h hVar = new j3.h();
                new Runnable() { // from class: j4.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        String notificationDelegate;
                        Context context2 = context;
                        j3.h hVar2 = hVar;
                        try {
                            if (!(Binder.getCallingUid() == context2.getApplicationInfo().uid)) {
                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                return;
                            }
                            SharedPreferences.Editor edit = com.bumptech.glide.d.g(context2).edit();
                            edit.putBoolean("proxy_notification_initialized", true);
                            edit.apply();
                            NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                            if (z3) {
                                notificationManager.setNotificationDelegate("com.google.android.gms");
                            } else {
                                notificationDelegate = notificationManager.getNotificationDelegate();
                                if ("com.google.android.gms".equals(notificationDelegate)) {
                                    notificationManager.setNotificationDelegate(null);
                                }
                            }
                        } finally {
                            hVar2.d(null);
                        }
                    }
                }.run();
                return;
            }
        }
        z3 = true;
        if (Build.VERSION.SDK_INT >= 29) {
        }
    }

    public static boolean o() {
        boolean isEnabled;
        try {
            if (f4230b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f4230b == null) {
                f4229a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f4230b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f4230b.invoke(null, Long.valueOf(f4229a))).booleanValue();
        } catch (Exception e9) {
            if (!(e9 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e9);
                return false;
            }
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static InterfaceC5087e p(EnumC5088f enumC5088f, I7.a aVar) {
        int ordinal = enumC5088f.ordinal();
        if (ordinal == 0) {
            return new C5093k(aVar);
        }
        C5101s c5101s = C5101s.f41350a;
        if (ordinal == 1) {
            C5092j c5092j = new C5092j();
            c5092j.f41336n = aVar;
            c5092j.f41337u = c5101s;
            return c5092j;
        }
        if (ordinal != 2) {
            throw new B0.c();
        }
        w wVar = new w();
        wVar.f41354n = aVar;
        wVar.f41355u = c5101s;
        return wVar;
    }

    public static C5093k q(I7.a initializer) {
        h.e(initializer, "initializer");
        return new C5093k(initializer);
    }

    public static final long r(String str) {
        char charAt;
        int length = str.length();
        int i = (length <= 0 || !j.V("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i6 = i;
            while (true) {
                if (i < length) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i6 == i) {
                        i6++;
                    }
                    i++;
                } else if (length - i6 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!Q7.q.R(str, "+") || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(j.W(1, str));
    }

    public static final boolean s(String method) {
        h.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static final void t(LinkedHashMap linkedHashMap, String str, String str2) {
        if (str2 != null) {
            linkedHashMap.put(str, str2);
        }
    }

    public static final long w(long j6, c unit) {
        h.e(unit, "unit");
        c cVar = c.f2764u;
        long e9 = d.e(4611686018426999999L, cVar, unit);
        if ((-e9) <= j6 && j6 <= e9) {
            return k(d.e(j6, unit, cVar));
        }
        c targetUnit = c.f2765v;
        h.e(targetUnit, "targetUnit");
        return i(V2.a.b(targetUnit.f2770n.convert(j6, unit.f2770n)));
    }

    public abstract InputFilter[] m(InputFilter[] inputFilterArr);

    public abstract void u(boolean z3);

    public abstract void v(boolean z3);

    @Override // O.f0
    public void a() {
    }

    @Override // O.f0
    public void b() {
    }
}
