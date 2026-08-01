package S0;

import D.y;
import L3.F;
import P2.w;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC2667Ma;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.C2931ag;
import com.google.android.gms.internal.ads.C3816r5;
import com.google.android.gms.internal.ads.MA;
import com.google.android.gms.internal.ads.RunnableC3191fP;
import com.google.android.gms.internal.ads.W4;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m1.C4727b;
import m1.C4729d;
import u2.z;
import u7.C5097o;
import u7.C5099q;
import v7.AbstractC5129j;
import w7.C5156c;
import z0.C5247c;

/* loaded from: classes.dex */
public abstract class f {
    public static Object b(j3.m mVar) {
        w.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        w.i(mVar, "Task must not be null");
        if (mVar.h()) {
            return x(mVar);
        }
        F1.a aVar = new F1.a(21);
        N1.f fVar = j3.i.f38360b;
        mVar.c(fVar, aVar);
        mVar.b(fVar, aVar);
        mVar.f38370b.f(new j3.k(fVar, (j3.b) aVar));
        mVar.o();
        ((CountDownLatch) aVar.f903u).await();
        return x(mVar);
    }

    public static Object c(j3.m mVar, long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        w.i(mVar, "Task must not be null");
        w.i(timeUnit, "TimeUnit must not be null");
        if (mVar.h()) {
            return x(mVar);
        }
        F1.a aVar = new F1.a(21);
        N1.f fVar = j3.i.f38360b;
        mVar.c(fVar, aVar);
        mVar.b(fVar, aVar);
        mVar.f38370b.f(new j3.k(fVar, (j3.b) aVar));
        mVar.o();
        if (((CountDownLatch) aVar.f903u).await(j6, timeUnit)) {
            return x(mVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static j3.m d(Callable callable, Executor executor) {
        w.i(executor, "Executor must not be null");
        j3.m mVar = new j3.m();
        executor.execute(new RunnableC3191fP(11, mVar, callable));
        return mVar;
    }

    public static float[] e(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static G.i[] f(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        int i9 = 0;
        int i10 = 1;
        while (i10 < str.length()) {
            while (i10 < str.length()) {
                char charAt = str.charAt(i10);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i10++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i9, i10).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i6) == 'z' || trim.charAt(i6) == 'Z') {
                            fArr = new float[i6];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i11 = i6;
                                int i12 = 1;
                                while (i12 < length) {
                                    int i13 = i6;
                                    int i14 = i13;
                                    int i15 = i14;
                                    int i16 = i15;
                                    for (int i17 = i12; i17 < trim.length(); i17++) {
                                        char charAt2 = trim.charAt(i17);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case com.anythink.basead.b.b.j.f5812S /* 44 */:
                                                        break;
                                                    case com.anythink.basead.b.b.j.f5813T /* 45 */:
                                                        if (i17 != i12 && i13 == 0) {
                                                            i13 = 0;
                                                            i15 = 1;
                                                            i16 = 1;
                                                            break;
                                                        }
                                                        i13 = 0;
                                                        break;
                                                    case '.':
                                                        if (i14 == 0) {
                                                            i13 = 0;
                                                            i14 = 1;
                                                            break;
                                                        }
                                                        i13 = 0;
                                                        i15 = 1;
                                                        i16 = 1;
                                                        break;
                                                    default:
                                                        i13 = 0;
                                                        break;
                                                }
                                            } else {
                                                i13 = 1;
                                            }
                                            if (i15 == 0) {
                                                if (i12 < i17) {
                                                    fArr2[i11] = Float.parseFloat(trim.substring(i12, i17));
                                                    i11++;
                                                }
                                                i12 = i16 == 0 ? i17 : i17 + 1;
                                                i6 = 0;
                                            }
                                        }
                                        i13 = 0;
                                        i15 = 1;
                                        if (i15 == 0) {
                                        }
                                    }
                                    if (i12 < i17) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    i6 = 0;
                                }
                                fArr = e(fArr2, i11);
                                i6 = 0;
                            } catch (NumberFormatException e9) {
                                throw new RuntimeException(y.o("error in parsing \"", trim, "\""), e9);
                            }
                        }
                        arrayList.add(new G.i(trim.charAt(i6), fArr));
                    }
                    i9 = i10;
                    i10++;
                    i6 = 0;
                }
                i10++;
            }
            trim = str.substring(i9, i10).trim();
            if (!trim.isEmpty()) {
            }
            i9 = i10;
            i10++;
            i6 = 0;
        }
        if (i10 - i9 != 1 || i9 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new G.i(str.charAt(i9), new float[0]));
        }
        return (G.i[]) arrayList.toArray(new G.i[i]);
    }

    public static G.i[] g(G.i[] iVarArr) {
        G.i[] iVarArr2 = new G.i[iVarArr.length];
        for (int i = 0; i < iVarArr.length; i++) {
            iVarArr2[i] = new G.i(iVarArr[i]);
        }
        return iVarArr2;
    }

    public static j3.m h(Exception exc) {
        j3.m mVar = new j3.m();
        mVar.k(exc);
        return mVar;
    }

    public static j3.m i(Object obj) {
        j3.m mVar = new j3.m();
        mVar.l(obj);
        return mVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class j(O7.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        Class a9 = ((kotlin.jvm.internal.c) cVar).a();
        if (a9.isPrimitive()) {
            String name = a9.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a9;
    }

    public static com.bumptech.glide.manager.o k(C4729d c4729d, List list) {
        W4 w42 = c4729d.f39290D;
        if (w42 == null) {
            return new com.bumptech.glide.manager.o(null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((l1.d) it.next()).f38888a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = w42.f28320h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (l1.d dVar : w42.f28320h) {
                    if (!treeSet.contains(dVar.f38888a)) {
                        arrayList.add(dVar);
                    }
                }
            }
        } else if (!w42.f28319g.isEmpty()) {
            for (Map.Entry entry : w42.f28319g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new l1.d((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new com.bumptech.glide.manager.o(w42.f28313a, true, arrayList);
    }

    public static String l(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return y.m(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static byte[] m(InputStream inputStream, int i, C4727b c4727b) {
        byte[] bArr;
        C3816r5 c3816r5 = new C3816r5(c4727b, i);
        try {
            bArr = c4727b.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    c3816r5.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        l1.j.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    c4727b.b(bArr);
                    c3816r5.close();
                    throw th;
                }
            }
            byte[] byteArray = c3816r5.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                l1.j.d("Error occurred when closing InputStream", new Object[0]);
            }
            c4727b.b(bArr);
            c3816r5.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static String n(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final List s(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C5156c c5156c = new C5156c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i6 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            kotlin.jvm.internal.h.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            kotlin.jvm.internal.h.d(string2, "cursor.getString(toColumnIndex)");
            c5156c.add(new w0.c(i, i6, string, string2));
        }
        return AbstractC5129j.J(d6.c.b(c5156c));
    }

    public static final w0.d t(C5247c c5247c, String str, boolean z3) {
        Cursor E8 = c5247c.E("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = E8.getColumnIndex("seqno");
            int columnIndex2 = E8.getColumnIndex("cid");
            int columnIndex3 = E8.getColumnIndex("name");
            int columnIndex4 = E8.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (E8.moveToNext()) {
                    if (E8.getInt(columnIndex2) >= 0) {
                        int i = E8.getInt(columnIndex);
                        String columnName = E8.getString(columnIndex3);
                        String str2 = E8.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        kotlin.jvm.internal.h.d(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                kotlin.jvm.internal.h.d(values, "columnsMap.values");
                List L6 = AbstractC5129j.L(values);
                Collection values2 = treeMap2.values();
                kotlin.jvm.internal.h.d(values2, "ordersMap.values");
                w0.d dVar = new w0.d(str, L6, AbstractC5129j.L(values2), z3);
                E8.close();
                return dVar;
            }
            E8.close();
            return null;
        } finally {
        }
    }

    public static final C5097o u(String str) {
        int i;
        F.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i9 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            int i10 = i6 ^ Integer.MIN_VALUE;
            if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                if (i9 != 119304647) {
                    return null;
                }
                i9 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i10, i9 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i11 = i6 * 10;
            int i12 = digit + i11;
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i6 = i12;
        }
        return new C5097o(i6);
    }

    public static final C5099q v(String str) {
        int i;
        long j6;
        kotlin.jvm.internal.h.e(str, "<this>");
        int i6 = 10;
        F.g(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i9 = 1;
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
            int digit = Character.digit((int) str.charAt(i), i6);
            if (digit < 0) {
                return null;
            }
            int i10 = length;
            long j12 = j10 ^ Long.MIN_VALUE;
            int i11 = i;
            if (Long.compare(j12, j11 ^ Long.MIN_VALUE) <= 0) {
                j6 = j9;
            } else {
                if (j11 != 512409557603043100L) {
                    return null;
                }
                if (j9 >= 0) {
                    long j13 = (Long.MAX_VALUE / j9) << i9;
                    j6 = j9;
                    j11 = j13 + ((((-1) - (j13 * j9)) ^ Long.MIN_VALUE) >= (j9 ^ Long.MIN_VALUE) ? i9 : 0);
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
            i = i11 + 1;
            j10 = j15;
            length = i10;
            j9 = j6;
            i6 = 10;
            i9 = 1;
        }
        return new C5099q(j10);
    }

    public static d3.c w(d3.c cVar) {
        return !(cVar instanceof d3.e) ? cVar instanceof d3.d ? cVar : cVar instanceof Serializable ? new d3.d(cVar) : new d3.e(cVar) : cVar;
    }

    public static Object x(j3.m mVar) {
        if (mVar.i()) {
            return mVar.g();
        }
        if (mVar.f38372d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(mVar.f());
    }

    public static void y(Context context) {
        boolean z3;
        Object obj = v2.f.f41405b;
        if (((Boolean) AbstractC2667Ma.f26298a.r()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (v2.f.f41405b) {
                        z3 = v2.f.f41406c;
                    }
                    if (z3) {
                        return;
                    }
                    N3.a l9 = new C2931ag(context).l();
                    int i = z.f41322b;
                    v2.i.e("Updating ad debug logging enablement.");
                    MA.f(l9, "AdDebugLogUpdater.updateEnablement", AbstractC3413jg.f31275h);
                }
            } catch (Exception e9) {
                v2.i.g("Fail to determine debug setting.", e9);
            }
        }
    }

    public abstract View o(int i);

    public abstract void p(int i);

    public abstract void q(Typeface typeface, boolean z3);

    public abstract boolean r();
}
