package A8;

import A7.e;
import F.j;
import F.q;
import I7.p;
import N7.c;
import S0.n;
import S7.AbstractC0387a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.View;
import c6.l;
import com.bumptech.glide.g;
import com.google.android.gms.internal.ads.C2521Ce;
import com.google.android.gms.internal.ads.Wv;
import d6.C4464a;
import i8.f;
import i8.k;
import i8.z;
import j8.d;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import k.C4627d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.u;
import m.Z0;
import m.b1;
import v7.C5125p;
import x2.i;
import z7.C5238b;
import z7.C5246j;
import z7.InterfaceC5240d;
import z7.InterfaceC5243g;
import z7.InterfaceC5244h;
import z7.InterfaceC5245i;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f227a = true;

    public static void a(Throwable th, Throwable exception) {
        h.e(th, "<this>");
        h.e(exception, "exception");
        if (th != exception) {
            Integer num = E7.a.f901a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = D7.a.f629a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void c(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(int i) {
        if (2 > i || i >= 37) {
            StringBuilder k9 = Wv.k(i, "radix ", " was not in valid range ");
            k9.append(new c(2, 36, 1));
            throw new IllegalArgumentException(k9.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5240d g(p pVar, AbstractC0387a abstractC0387a, AbstractC0387a abstractC0387a2) {
        h.e(pVar, "<this>");
        if (pVar instanceof B7.a) {
            return ((B7.a) pVar).create(abstractC0387a, abstractC0387a2);
        }
        C5246j c5246j = C5246j.f42241n;
        InterfaceC5245i interfaceC5245i = abstractC0387a2.f3025v;
        return interfaceC5245i == c5246j ? new A7.b(pVar, abstractC0387a2, abstractC0387a) : new A7.c(abstractC0387a2, interfaceC5245i, pVar, abstractC0387a);
    }

    public static final boolean h(char c9, char c10, boolean z6) {
        if (c9 == c10) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c9);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static k j(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        f b9 = f.f38214b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        z.f38385u.getClass();
        z c9 = i8.b.c(protocol);
        try {
            obj = d.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = C5125p.f41221n;
        }
        return new k(c9, b9, d.k(sSLSession.getLocalCertificates()), new l(2, obj));
    }

    public static Drawable k(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f227a) {
                return p(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e9) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e9;
            }
            return E.a.b(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f227a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = q.f942a;
        return j.a(resources, i, theme);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class l(O7.c cVar) {
        h.e(cVar, "<this>");
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final List m(String str, List list) {
        h.e(list, "list");
        boolean z6 = list instanceof d6.d;
        List list2 = list;
        if (z6) {
            list2 = ((d6.d) list).f37185u;
        }
        if (list2 == C5125p.f41221n || (list2 instanceof C4464a)) {
            return list2;
        }
        C4464a c4464a = new C4464a(list2);
        if (c4464a.contains(null)) {
            throw new IllegalArgumentException(str.concat(".contains(null)").toString());
        }
        return c4464a;
    }

    public static InterfaceC5240d n(InterfaceC5240d interfaceC5240d) {
        InterfaceC5240d intercepted;
        h.e(interfaceC5240d, "<this>");
        B7.c cVar = interfaceC5240d instanceof B7.c ? (B7.c) interfaceC5240d : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? interfaceC5240d : intercepted;
    }

    public static final boolean o(char c9) {
        return Character.isWhitespace(c9) || Character.isSpaceChar(c9);
    }

    public static Drawable p(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            C4627d c4627d = new C4627d(context);
            c4627d.f38501b = theme;
            c4627d.a(theme.getResources().getConfiguration());
            context = c4627d;
        }
        return g.h(context, i);
    }

    public static InterfaceC5245i q(InterfaceC5243g interfaceC5243g, InterfaceC5244h key) {
        h.e(key, "key");
        return h.a(interfaceC5243g.getKey(), key) ? C5246j.f42241n : interfaceC5243g;
    }

    public static InterfaceC5245i t(InterfaceC5243g interfaceC5243g, InterfaceC5245i context) {
        h.e(context, "context");
        return context == C5246j.f42241n ? interfaceC5243g : (InterfaceC5245i) context.l(interfaceC5243g, new C5238b(1));
    }

    public static final String u(String value) {
        h.e(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        for (int i = 0; i < value.length(); i++) {
            char charAt = value.charAt(i);
            if (Q7.j.l0(",[]{}\\", charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        h.d(sb2, "toString(...)");
        return sb2;
    }

    public static void v(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Z0.a(view, charSequence);
            return;
        }
        b1 b1Var = b1.f39178D;
        if (b1Var != null && b1Var.f39183n == view) {
            b1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new b1(view, charSequence);
            return;
        }
        b1 b1Var2 = b1.f39179E;
        if (b1Var2 != null && b1Var2.f39183n == view) {
            b1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static String w(Throwable th) {
        h.e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        h.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static Object x(p pVar, Object obj, InterfaceC5240d interfaceC5240d) {
        h.e(pVar, "<this>");
        InterfaceC5245i context = interfaceC5240d.getContext();
        Object dVar = context == C5246j.f42241n ? new A7.d(interfaceC5240d) : new e(interfaceC5240d, context);
        u.b(2, pVar);
        return pVar.invoke(obj, dVar);
    }

    public static Object y(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            i.d("Unexpected exception.", th);
            C2521Ce.a(context).e("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public abstract void r(Throwable th);

    public abstract void s(n nVar);
}
