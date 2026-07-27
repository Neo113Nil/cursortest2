package W2;

import D.y;
import N3.j;
import N3.k;
import N3.r;
import O.L;
import O.X;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import b0.C0522b;
import b6.C0530a;
import com.bumptech.glide.manager.n;
import com.google.android.gms.internal.ads.C3722p5;
import com.google.android.gms.internal.ads.CL;
import com.google.android.gms.internal.ads.T4;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import m1.C4774a;
import m1.C4776c;
import u.AbstractC5088e;
import v3.C5125a;
import y7.C5256b;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f3438a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f3439b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f3440c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3441d;

    /* renamed from: e, reason: collision with root package name */
    public static Class f3442e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3443f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f3444g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3445h;
    public static Field i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f3446j;

    public static final LinkedHashSet a(byte[] bytes) {
        ObjectInputStream objectInputStream;
        kotlin.jvm.internal.h.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i4 = 0; i4 < readInt; i4++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        kotlin.jvm.internal.h.d(uri, "uri");
                        linkedHashSet.add(new J0.c(uri, readBoolean));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        }
        return linkedHashSet;
    }

    public static U2.a b(int i4) {
        return i4 != 0 ? i4 != 1 ? new C3.i() : new C3.d() : new C3.i();
    }

    public static void c(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (N3.h hVar : (Set) it2.next()) {
                        for (j jVar : hVar.f2172a.f2156c) {
                            if (jVar.f2179c == 0) {
                                Set<N3.h> set = (Set) hashMap.get(new N3.i(jVar.f2177a, jVar.f2178b == 2));
                                if (set != null) {
                                    for (N3.h hVar2 : set) {
                                        hVar.f2173b.add(hVar2);
                                        hVar2.f2174c.add(hVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    N3.h hVar3 = (N3.h) it4.next();
                    if (hVar3.f2174c.isEmpty()) {
                        hashSet2.add(hVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    N3.h hVar4 = (N3.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar4);
                    i4++;
                    Iterator it5 = hVar4.f2173b.iterator();
                    while (it5.hasNext()) {
                        N3.h hVar5 = (N3.h) it5.next();
                        hVar5.f2174c.remove(hVar4);
                        if (hVar5.f2174c.isEmpty()) {
                            hashSet2.add(hVar5);
                        }
                    }
                }
                if (i4 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    N3.h hVar6 = (N3.h) it6.next();
                    if (!hVar6.f2174c.isEmpty() && !hVar6.f2173b.isEmpty()) {
                        arrayList2.add(hVar6.f2172a);
                    }
                }
                throw new k("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            N3.b bVar = (N3.b) it.next();
            N3.h hVar7 = new N3.h(bVar);
            for (r rVar : bVar.f2155b) {
                boolean z8 = bVar.f2158e == 0;
                N3.i iVar = new N3.i(rVar, !z8);
                if (!hashMap.containsKey(iVar)) {
                    hashMap.put(iVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(iVar);
                if (!set2.isEmpty() && z8) {
                    throw new IllegalArgumentException("Multiple components provide " + rVar + com.anythink.core.common.d.j.f12535z);
                }
                set2.add(hVar7);
            }
        }
    }

    public static final C5256b d(Enum[] entries) {
        kotlin.jvm.internal.h.e(entries, "entries");
        return new C5256b(entries);
    }

    public static n e(C4776c c4776c, List list) {
        T4 t42 = c4776c.f39558D;
        if (t42 == null) {
            return new n(null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((l1.d) it.next()).f39030a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = t42.f27716h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (l1.d dVar : t42.f27716h) {
                    if (!treeSet.contains(dVar.f39030a)) {
                        arrayList.add(dVar);
                    }
                }
            }
        } else if (!t42.f27715g.isEmpty()) {
            for (Map.Entry entry : t42.f27715g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new l1.d((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new n(t42.f27709a, true, arrayList);
    }

    public static String f(String tableName, String triggerType) {
        kotlin.jvm.internal.h.e(tableName, "tableName");
        kotlin.jvm.internal.h.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static byte[] g(InputStream inputStream, int i4, C4774a c4774a) {
        byte[] bArr;
        C3722p5 c3722p5 = new C3722p5(c4774a, i4);
        try {
            bArr = c4774a.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    c3722p5.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        l1.j.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    c4774a.b(bArr);
                    c3722p5.close();
                    throw th;
                }
            }
            byte[] byteArray = c3722p5.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                l1.j.d("Error occurred when closing InputStream", new Object[0]);
            }
            c4774a.b(bArr);
            c3722p5.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static final int h(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(y.i(i4, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int i(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i4 != 5) {
            throw new IllegalArgumentException(y.i(i4, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int j(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(y.i(i4, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int k(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 == 4) {
            return 5;
        }
        if (i4 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(y.i(i4, "Could not convert ", " to State"));
    }

    public static boolean l(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static String m(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            sb.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb.append(str2.charAt(i4));
            }
        }
        return sb.toString();
    }

    public static C0530a n(List list) {
        I1.f fVar = new I1.f(2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D6.j jVar = (D6.j) it.next();
            String str = jVar.f726v;
            D6.b bVar = jVar.f727w;
            String str2 = bVar.f708v;
            b6.b bVar2 = b6.b.f5560n;
            if (str2 != null) {
                fVar.d(g6.e.a(bVar2, str), bVar.f708v);
            } else {
                Boolean bool = bVar.f709w;
                if (bool != null) {
                    fVar.d(g6.e.a(b6.b.f5561u, str), bool);
                } else {
                    Long l9 = bVar.f710x;
                    if (l9 != null) {
                        fVar.d(g6.e.a(b6.b.f5562v, str), l9);
                    } else {
                        Double d2 = bVar.f711y;
                        if (d2 != null) {
                            fVar.d(g6.e.a(b6.b.f5563w, str), d2);
                        } else {
                            D6.d dVar = bVar.f712z;
                            if (dVar != null) {
                                List list2 = dVar.f714v;
                                D6.b bVar3 = (D6.b) list2.get(0);
                                if (bVar3.f708v != null) {
                                    g6.e a9 = g6.e.a(b6.b.f5564x, str);
                                    ArrayList arrayList = new ArrayList(list2.size());
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((D6.b) it2.next()).f708v);
                                    }
                                    fVar.d(a9, arrayList);
                                } else if (bVar3.f709w != null) {
                                    g6.e a10 = g6.e.a(b6.b.f5565y, str);
                                    ArrayList arrayList2 = new ArrayList(list2.size());
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(((D6.b) it3.next()).f709w);
                                    }
                                    fVar.d(a10, arrayList2);
                                } else if (bVar3.f710x != null) {
                                    g6.e a11 = g6.e.a(b6.b.f5566z, str);
                                    ArrayList arrayList3 = new ArrayList(list2.size());
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList3.add(((D6.b) it4.next()).f710x);
                                    }
                                    fVar.d(a11, arrayList3);
                                } else {
                                    if (bVar3.f711y == null) {
                                        throw new UnsupportedOperationException();
                                    }
                                    g6.e a12 = g6.e.a(b6.b.f5558A, str);
                                    ArrayList arrayList4 = new ArrayList(list2.size());
                                    Iterator it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        arrayList4.add(((D6.b) it5.next()).f711y);
                                    }
                                    fVar.d(a12, arrayList4);
                                }
                            } else {
                                fVar.d(g6.e.a(bVar2, str), "");
                            }
                        }
                    }
                }
            }
        }
        return fVar.b();
    }

    public static C0522b o(MappedByteBuffer mappedByteBuffer) {
        long j9;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i4 = duplicate.getShort() & 65535;
        if (i4 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i9 = 0;
        while (true) {
            if (i9 >= i4) {
                j9 = -1;
                break;
            }
            int i10 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j9 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i10) {
                break;
            }
            i9++;
        }
        if (j9 != -1) {
            duplicate.position(duplicate.position() + ((int) (j9 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j10 = duplicate.getInt() & 4294967295L;
            for (int i11 = 0; i11 < j10; i11++) {
                int i12 = duplicate.getInt();
                long j11 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i12 || 1701669481 == i12) {
                    duplicate.position((int) (j11 + j9));
                    C0522b c0522b = new C0522b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0522b.f2231w = duplicate;
                    c0522b.f2228n = position;
                    int i13 = position - duplicate.getInt(position);
                    c0522b.f2229u = i13;
                    c0522b.f2230v = ((ByteBuffer) c0522b.f2231w).getShort(i13);
                    return c0522b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void p(View view, C3.g gVar) {
        C5125a c5125a = gVar.f413n.f384b;
        if (c5125a == null || !c5125a.f41362a) {
            return;
        }
        float f6 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = X.f2240a;
            f6 += L.i((View) parent);
        }
        C3.f fVar = gVar.f413n;
        if (fVar.f393l != f6) {
            fVar.f393l = f6;
            gVar.m();
        }
    }

    public static final int q(int i4) {
        CL.o(i4, com.anythink.core.express.b.a.f17684b);
        int d2 = AbstractC5088e.d(i4);
        if (d2 == 0) {
            return 0;
        }
        int i9 = 1;
        if (d2 != 1) {
            i9 = 2;
            if (d2 != 2) {
                i9 = 3;
                if (d2 != 3) {
                    i9 = 4;
                    if (d2 != 4) {
                        if (d2 == 5) {
                            return 5;
                        }
                        throw new B0.c();
                    }
                }
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader r() {
        ClassLoader classLoader;
        SecurityException e6;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (e.class) {
            if (f3438a == null) {
                Thread thread2 = f3439b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i4 = 0;
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i9];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i4 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i4];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i4++;
                                    }
                                    if (thread == null) {
                                        try {
                                            d dVar = new d(threadGroup, "GmsDynamite");
                                            try {
                                                dVar.setContextClassLoader(null);
                                                dVar.start();
                                                thread = dVar;
                                            } catch (SecurityException e9) {
                                                e6 = e9;
                                                thread = dVar;
                                                String message = e6.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb.append("Failed to enumerate thread/threadgroup ");
                                                sb.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb.toString());
                                                thread2 = thread;
                                                f3439b = thread2;
                                            }
                                        } catch (SecurityException e10) {
                                            e6 = e10;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e11) {
                                e6 = e11;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f3439b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f3439b.getContextClassLoader();
                    } catch (SecurityException e12) {
                        String message2 = e12.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f3438a = classLoader2;
            }
            classLoader = f3438a;
        }
        return classLoader;
    }
}
