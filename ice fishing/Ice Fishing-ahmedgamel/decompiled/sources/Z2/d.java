package Z2;

import G3.i;
import O.L;
import O.X;
import O.f0;
import Q7.q;
import S0.j;
import S0.p;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import i1.C4585b;
import i1.C4586c;
import i8.s;
import java.net.ProtocolException;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import v7.AbstractC5114e;
import w7.C5155c;
import z3.C5232a;

/* loaded from: classes.dex */
public abstract class d implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f4134a;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f4135b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C4586c f4136c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile C4585b f4137d;

    public static Object d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final boolean e(Object[] objArr, int i, int i4, List list) {
        if (i4 == list.size()) {
            for (int i6 = 0; i6 < i4; i6++) {
                if (kotlin.jvm.internal.h.a(objArr[i + i6], list.get(i6))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String f(Object[] objArr, int i, int i4, AbstractC5114e abstractC5114e) {
        StringBuilder sb = new StringBuilder((i4 * 3) + 2);
        sb.append("[");
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i6];
            if (obj == abstractC5114e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static C5155c g(C5155c c5155c) {
        c5155c.g();
        c5155c.f41726v = true;
        return c5155c.f41725u > 0 ? c5155c : C5155c.f41723w;
    }

    public static X2.a h(int i) {
        return i != 0 ? i != 1 ? new i() : new G3.d() : new i();
    }

    public static void i(String str, String str2, Object obj) {
        String l9 = l(str);
        if (Log.isLoggable(l9, 3)) {
            Log.d(l9, String.format(str2, obj));
        }
    }

    public static void j(String str, String str2, Exception exc) {
        String l9 = l(str);
        if (Log.isLoggable(l9, 6)) {
            Log.e(l9, str2, exc);
        }
    }

    public static final j k(p pVar) {
        kotlin.jvm.internal.h.e(pVar, "<this>");
        return new j(pVar.f2937a, pVar.f2955t);
    }

    public static String l(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static boolean m(String str) {
        return ("Connection".equalsIgnoreCase(str) || com.anythink.expressad.foundation.g.f.g.b.f20127c.equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static List n(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static F.d o(String statusLine) {
        s sVar;
        int i;
        String str;
        kotlin.jvm.internal.h.e(statusLine, "statusLine");
        if (q.h0(statusLine, "HTTP/1.")) {
            i = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt == 0) {
                sVar = s.f38343v;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                sVar = s.f38344w;
            }
        } else if (q.h0(statusLine, "ICY ")) {
            sVar = s.f38343v;
            i = 4;
        } else {
            if (!q.h0(statusLine, "SOURCETABLE ")) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            sVar = s.f38344w;
            i = 12;
        }
        int i4 = i + 3;
        if (statusLine.length() < i4) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String substring = statusLine.substring(i, i4);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        Integer i02 = q.i0(substring);
        if (i02 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int intValue = i02.intValue();
        if (statusLine.length() <= i4) {
            str = "";
        } else {
            if (statusLine.charAt(i4) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            str = statusLine.substring(i + 4);
            kotlin.jvm.internal.h.d(str, "substring(...)");
        }
        return new F.d(sVar, intValue, str);
    }

    public static final void p(Object[] objArr, int i, int i4) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        while (i < i4) {
            objArr[i] = null;
            i++;
        }
    }

    public static void q(View view, G3.g gVar) {
        C5232a c5232a = gVar.f1108n.f1079b;
        if (c5232a == null || !c5232a.f42231a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = X.f2142a;
            f2 += L.i((View) parent);
        }
        G3.f fVar = gVar.f1108n;
        if (fVar.f1088l != f2) {
            fVar.f1088l = f2;
            gVar.m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader r() {
        ClassLoader classLoader;
        SecurityException e9;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (d.class) {
            if (f4134a == null) {
                Thread thread2 = f4135b;
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
                                    int i = 0;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i4];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i4++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i++;
                                    }
                                    if (thread == null) {
                                        try {
                                            c cVar = new c(threadGroup, "GmsDynamite");
                                            try {
                                                cVar.setContextClassLoader(null);
                                                cVar.start();
                                                thread = cVar;
                                            } catch (SecurityException e10) {
                                                e9 = e10;
                                                thread = cVar;
                                                String message = e9.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb.append("Failed to enumerate thread/threadgroup ");
                                                sb.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb.toString());
                                                thread2 = thread;
                                                f4135b = thread2;
                                            }
                                        } catch (SecurityException e11) {
                                            e9 = e11;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e12) {
                                e9 = e12;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f4135b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f4135b.getContextClassLoader();
                    } catch (SecurityException e13) {
                        String message2 = e13.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb2.append("Failed to get thread context classloader ");
                        sb2.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb2.toString());
                    }
                }
                f4134a = classLoader2;
            }
            classLoader = f4134a;
        }
        return classLoader;
    }

    @Override // O.f0
    public void a() {
    }

    @Override // O.f0
    public void b() {
    }
}
