package com.bumptech.glide;

import D.x;
import D0.z;
import R2.w;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.ads.C3839r5;
import com.google.android.gms.internal.ads.RunnableC3214fP;
import com.google.android.gms.internal.ads.W4;
import com.google.android.gms.internal.ads.Wv;
import g8.q;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.s;
import o1.C4798b;
import o1.C4800d;
import v7.AbstractC5119j;
import v7.r;
import v7.t;
import w.AbstractC5128c;
import w7.C5158f;
import w7.C5161i;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f24166a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f24167b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f24168c;

    public static IBinder A(Parcel parcel, int i) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + D8);
        return readStrongBinder;
    }

    public static int B(Parcel parcel, int i) {
        N(parcel, i, 4);
        return parcel.readInt();
    }

    public static long C(Parcel parcel, int i) {
        N(parcel, i, 8);
        return parcel.readLong();
    }

    public static int D(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static Set G(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return r.f41223n;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.h.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.t(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void J(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + D(parcel, i));
    }

    public static void K(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static int L(Parcel parcel) {
        int readInt = parcel.readInt();
        int D8 = D(parcel, readInt);
        char c9 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c9 != 20293) {
            throw new B0.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = D8 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new B0.c(x.o(new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length()), "Size read is invalid start=", dataPosition, " end=", i), parcel);
    }

    public static Object M(l3.m mVar) {
        if (mVar.i()) {
            return mVar.g();
        }
        if (mVar.f38884d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(mVar.f());
    }

    public static void N(Parcel parcel, int i, int i4) {
        int D8 = D(parcel, i);
        if (D8 == i4) {
            return;
        }
        String hexString = Integer.toHexString(D8);
        int length = String.valueOf(i4).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(D8).length() + 4 + 1);
        AbstractC5128c.g(sb, "Expected size ", i4, " got ", D8);
        throw new B0.c(x.p(sb, " (0x", hexString, ")"), parcel);
    }

    public static boolean O(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !O((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!w.l(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static HashMap P(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    public static final void a(q qVar) {
        kotlin.jvm.internal.h.e(qVar, "<this>");
        if ((qVar instanceof q ? qVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + s.a(qVar.getClass()));
    }

    public static Object b(int i, Object obj) {
        if (i != Integer.MAX_VALUE) {
            if (obj instanceof List) {
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(b(i, it.next()));
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

    public static final g8.p c(d8.b bVar) {
        kotlin.jvm.internal.h.e(bVar, "<this>");
        g8.p pVar = bVar instanceof g8.p ? (g8.p) bVar : null;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + s.a(bVar.getClass()));
    }

    public static Object d(l3.m mVar) {
        w.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        w.i(mVar, "Task must not be null");
        if (mVar.h()) {
            return M(mVar);
        }
        N2.i iVar = new N2.i();
        P1.f fVar = l3.i.f38872b;
        mVar.c(fVar, iVar);
        mVar.b(fVar, iVar);
        mVar.f38882b.f(new l3.k(fVar, (l3.b) iVar));
        mVar.o();
        iVar.f1929n.await();
        return M(mVar);
    }

    public static Object e(l3.m mVar, long j6) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        w.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        w.i(mVar, "Task must not be null");
        w.i(timeUnit, "TimeUnit must not be null");
        if (mVar.h()) {
            return M(mVar);
        }
        N2.i iVar = new N2.i();
        P1.f fVar = l3.i.f38872b;
        mVar.c(fVar, iVar);
        mVar.b(fVar, iVar);
        mVar.f38882b.f(new l3.k(fVar, (l3.b) iVar));
        mVar.o();
        if (iVar.f1929n.await(j6, timeUnit)) {
            return M(mVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static C5161i f(C5161i c5161i) {
        C5158f c5158f = c5161i.f41749n;
        c5158f.c();
        return c5158f.f41733B > 0 ? c5161i : C5161i.f41748u;
    }

    public static l3.m g(Callable callable, Executor executor) {
        w.i(executor, "Executor must not be null");
        l3.m mVar = new l3.m();
        executor.execute(new RunnableC3214fP(11, mVar, callable));
        return mVar;
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                A8.b.a(th, th2);
            }
        }
    }

    public static Bundle i(Parcel parcel, int i) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + D8);
        return readBundle;
    }

    public static byte[] j(Parcel parcel, int i) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + D8);
        return createByteArray;
    }

    public static Parcelable k(Parcel parcel, int i, Parcelable.Creator creator) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + D8);
        return parcelable;
    }

    public static String l(Parcel parcel, int i) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + D8);
        return readString;
    }

    public static String[] m(Parcel parcel, int i) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + D8);
        return createStringArray;
    }

    public static ArrayList n(Parcel parcel, int i) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + D8);
        return createStringArrayList;
    }

    public static Object[] o(Parcel parcel, int i, Parcelable.Creator creator) {
        int D8 = D(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (D8 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + D8);
        return createTypedArray;
    }

    public static void p(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new B0.c(x.k(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static l3.m q(Exception exc) {
        l3.m mVar = new l3.m();
        mVar.k(exc);
        return mVar;
    }

    public static l3.m r(Object obj) {
        l3.m mVar = new l3.m();
        mVar.l(obj);
        return mVar;
    }

    public static com.bumptech.glide.manager.n t(C4800d c4800d, List list) {
        W4 w42 = c4800d.f39733D;
        if (w42 == null) {
            return new com.bumptech.glide.manager.n(null, true, list);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((n1.d) it.next()).f39626a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = w42.f29118h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (n1.d dVar : w42.f29118h) {
                    if (!treeSet.contains(dVar.f39626a)) {
                        arrayList.add(dVar);
                    }
                }
            }
        } else if (!w42.f29117g.isEmpty()) {
            for (Map.Entry entry : w42.f29117g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new n1.d((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new com.bumptech.glide.manager.n(w42.f29111a, true, arrayList);
    }

    public static int v(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(Wv.f(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static byte[] w(InputStream inputStream, int i, C4798b c4798b) {
        byte[] bArr;
        C3839r5 c3839r5 = new C3839r5(c4798b, i);
        try {
            bArr = c4798b.a(1024);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    c3839r5.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        n1.j.d("Error occurred when closing InputStream", new Object[0]);
                    }
                    c4798b.b(bArr);
                    c3839r5.close();
                    throw th;
                }
            }
            byte[] byteArray = c3839r5.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                n1.j.d("Error occurred when closing InputStream", new Object[0]);
            }
            c4798b.b(bArr);
            c3839r5.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    public static Set x(Set set, Set elements) {
        kotlin.jvm.internal.h.e(set, "<this>");
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements.isEmpty()) {
            return AbstractC5119j.N(set);
        }
        if (!(elements instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(elements);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!elements.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static void y(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (IllegalAccessException e9) {
                K(cls, e9);
                throw null;
            } catch (InstantiationException e10) {
                K(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                K(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                K(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    public static boolean z(Parcel parcel, int i) {
        N(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public abstract void E(boolean z6);

    public abstract void F(boolean z6);

    public void H(View view, float f2) {
        if (f24166a) {
            try {
                z.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f24166a = false;
            }
        }
        view.setAlpha(f2);
    }

    public void I(View view, int i) {
        if (!f24168c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f24167b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f24168c = true;
        }
        Field field = f24167b;
        if (field != null) {
            try {
                f24167b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract InputFilter[] s(InputFilter[] inputFilterArr);

    public float u(View view) {
        if (f24166a) {
            try {
                return z.a(view);
            } catch (NoSuchMethodError unused) {
                f24166a = false;
            }
        }
        return view.getAlpha();
    }
}
