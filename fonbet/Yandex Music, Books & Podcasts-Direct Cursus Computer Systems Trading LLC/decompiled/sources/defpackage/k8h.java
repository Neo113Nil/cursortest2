package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class k8h extends f8g {
    public static final Method D;
    public xhj a;
    public xhj b;
    public final ArrayList c;
    public final owi d;
    public final String e;
    public final String f;
    public final ch7 g;
    public final ms5 h;
    public final long i;
    public final int j;
    public final int k;
    public final long l;
    public final long m;
    public final boolean n;
    public final lte o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final h4b v;
    public final mka w;
    public static final Logger x = Logger.getLogger(k8h.class.getName());
    public static final long y = 1800000;
    public static final long z = 1000;
    public static final gao A = new gao(xqd.r);
    public static final ch7 B = ch7.d;
    public static final ms5 C = ms5.b;

    static {
        Method method;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            method = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            x.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            method = null;
            D = method;
        } catch (NoSuchMethodException e2) {
            x.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            method = null;
            D = method;
        }
        D = method;
    }

    public k8h(String str, h4b h4bVar, mka mkaVar) {
        owi owiVar;
        gao gaoVar = A;
        this.a = gaoVar;
        this.b = gaoVar;
        this.c = new ArrayList();
        Logger logger = owi.d;
        synchronized (owi.class) {
            try {
                if (owi.e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z2 = h2a.a;
                        arrayList.add(h2a.class);
                    } catch (ClassNotFoundException e) {
                        owi.d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<nwi> D2 = wxf.D(nwi.class, Collections.unmodifiableList(arrayList), nwi.class.getClassLoader(), new ofc(28));
                    if (D2.isEmpty()) {
                        owi.d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    owi.e = new owi();
                    for (nwi nwiVar : D2) {
                        owi.d.fine("Service loader found " + nwiVar);
                        owi owiVar2 = owi.e;
                        synchronized (owiVar2) {
                            nwiVar.getClass();
                            owiVar2.b.add(nwiVar);
                        }
                    }
                    owi.e.a();
                }
                owiVar = owi.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = owiVar;
        this.f = "pick_first";
        this.g = B;
        this.h = C;
        this.i = y;
        this.j = 5;
        this.k = 5;
        this.l = 16777216L;
        this.m = 1048576L;
        this.n = true;
        this.o = lte.g;
        this.p = true;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        o2g.O(str, "target");
        this.e = str;
        this.v = h4bVar;
        this.w = mkaVar;
    }

    @Override // defpackage.f8g
    public final f8g C(Executor executor) {
        this.a = new cib(2, executor);
        return this;
    }

    @Override // defpackage.f8g
    public final f8g I(List list) {
        this.c.addAll(list);
        return this;
    }

    @Override // defpackage.f8g
    public final f8g L(Executor executor) {
        this.b = new cib(2, executor);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d1  */
    @Override // defpackage.f8g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t7h k() {
        SSLSocketFactory sSLSocketFactory;
        ho4 ho4Var;
        hoj hojVar = (hoj) this.v.a;
        boolean z2 = hojVar.h != Long.MAX_VALUE;
        gao gaoVar = hojVar.c;
        gao gaoVar2 = hojVar.d;
        int D2 = ouj.D(hojVar.g);
        ho4 ho4Var2 = null;
        if (D2 == 0) {
            try {
                if (hojVar.e == null) {
                    hojVar.e = SSLContext.getInstance("Default", ntk.d.a).getSocketFactory();
                }
                sSLSocketFactory = hojVar.e;
            } catch (GeneralSecurityException e) {
                kac.k("TLS Provider failure", e);
                return null;
            }
        } else {
            if (D2 != 1) {
                wvs.p("Unknown negotiation type: ".concat(dfi.v(hojVar.g)));
                return null;
            }
            sSLSocketFactory = null;
        }
        goj gojVar = new goj(gaoVar, gaoVar2, sSLSocketFactory, hojVar.f, hojVar.k, z2, hojVar.h, hojVar.i, hojVar.j, hojVar.l, hojVar.b);
        wvo wvoVar = new wvo(22);
        gao gaoVar3 = new gao(xqd.r);
        vqd vqdVar = xqd.t;
        ArrayList arrayList = new ArrayList(this.c);
        synchronized (qld.class) {
        }
        if (this.q) {
            Method method = D;
            if (method != null) {
                try {
                    ho4Var = (ho4) method.invoke(null, Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.FALSE, Boolean.valueOf(this.t));
                } catch (IllegalAccessException e2) {
                    x.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
                } catch (InvocationTargetException e3) {
                    x.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
                }
                if (ho4Var != null) {
                    arrayList.add(0, ho4Var);
                }
            }
            ho4Var = null;
            if (ho4Var != null) {
            }
        }
        if (this.u) {
            try {
                ho4Var2 = (ho4) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
            } catch (ClassNotFoundException e4) {
                x.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
            } catch (IllegalAccessException e5) {
                x.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (NoSuchMethodException e6) {
                x.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (InvocationTargetException e7) {
                x.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            }
            if (ho4Var2 != null) {
                arrayList.add(0, ho4Var2);
            }
        }
        return new m8h(new j8h(this, gojVar, wvoVar, gaoVar3, vqdVar, arrayList));
    }
}
