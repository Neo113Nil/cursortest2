package defpackage;

import com.connectsdk.service.airplay.PListParser;
import com.google.gson.stream.JsonReader;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class g2a extends ngg {
    public static final Logger t;
    public static final Set u;
    public static final boolean v;
    public static final boolean w;
    public static final boolean x;
    public static String y;
    public final xzm b;
    public final String e;
    public final String f;
    public final int g;
    public final c8q h;
    public final long i;
    public final vq6 j;
    public final hhr k;
    public boolean l;
    public boolean m;
    public Executor n;
    public final boolean o;
    public final krd p;
    public boolean q;
    public bfg r;
    public final Random c = new Random();
    public volatile int s = 1;
    public final AtomicReference d = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(g2a.class.getName());
        t = logger;
        u = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", PListParser.TAG_TRUE);
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", PListParser.TAG_FALSE);
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", PListParser.TAG_FALSE);
        v = Boolean.parseBoolean(property);
        w = Boolean.parseBoolean(property2);
        x = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("q2f", true, g2a.class.getClassLoader()).asSubclass(q2f.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
    }

    public g2a(String str, rd2 rd2Var, c8q c8qVar, hhr hhrVar, boolean z) {
        o2g.O(rd2Var, "args");
        this.h = c8qVar;
        URI create = URI.create("//".concat(str));
        o2g.H(str, "Invalid DNS name: %s", create.getHost() != null);
        String authority = create.getAuthority();
        if (authority == null) {
            jj4.j(zwf.R("nameUri (%s) doesn't have an authority", create));
            throw null;
        }
        this.e = authority;
        this.f = create.getHost();
        if (create.getPort() == -1) {
            this.g = rd2Var.b;
        } else {
            this.g = create.getPort();
        }
        xzm xzmVar = (xzm) rd2Var.c;
        o2g.O(xzmVar, "proxyDetector");
        this.b = xzmVar;
        long j = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    t.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            j = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.i = j;
        this.k = hhrVar;
        vq6 vq6Var = (vq6) rd2Var.d;
        o2g.O(vq6Var, "syncContext");
        this.j = vq6Var;
        z7h z7hVar = (z7h) rd2Var.h;
        this.n = z7hVar;
        this.o = z7hVar == null;
        krd krdVar = (krd) rd2Var.e;
        o2g.O(krdVar, "serviceConfigParser");
        this.p = krdVar;
    }

    public static Map U(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            szf.v0(entry, "Bad key: %s", u.contains(entry.getKey()));
        }
        List S = qwp.S("clientLanguage", map);
        if (S != null && !S.isEmpty()) {
            Iterator it = S.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double T = qwp.T("percentage", map);
        if (T != null) {
            int intValue = T.intValue();
            szf.v0(T, "Bad percentage: %s", intValue >= 0 && intValue <= 100);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List S2 = qwp.S("clientHostname", map);
        if (S2 != null && !S2.isEmpty()) {
            Iterator it2 = S2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map V = qwp.V("serviceConfig", map);
        if (V != null) {
            return V;
        }
        throw new wp3(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    public static ArrayList V() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                String substring = str.substring(12);
                Logger logger = w5f.a;
                JsonReader jsonReader = new JsonReader(new StringReader(substring));
                try {
                    Object a = w5f.a(jsonReader);
                    if (!(a instanceof List)) {
                        throw new ClassCastException(hrg.n(a, "wrong type "));
                    }
                    List list2 = (List) a;
                    qwp.F(list2);
                    arrayList.addAll(list2);
                } finally {
                    try {
                        jsonReader.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                }
            } else {
                t.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // defpackage.ngg
    public final void B() {
        o2g.U("not started", this.r != null);
        W();
    }

    @Override // defpackage.ngg
    public final void I() {
        if (this.m) {
            return;
        }
        this.m = true;
        Executor executor = this.n;
        if (executor == null || !this.o) {
            return;
        }
        d8q.b(this.h, executor);
        this.n = null;
    }

    @Override // defpackage.ngg
    public final void K(bfg bfgVar) {
        o2g.U("already started", this.r == null);
        if (this.o) {
            this.n = (Executor) d8q.a(this.h);
        }
        this.r = bfgVar;
        W();
    }

    public final es6 T() {
        lwi lwiVar;
        lwi lwiVar2;
        List u0;
        lwi lwiVar3;
        String str = this.f;
        es6 es6Var = new es6();
        try {
            es6Var.b = X();
            if (!x) {
                return es6Var;
            }
            List list = Collections.EMPTY_LIST;
            boolean z = false;
            if (v) {
                if ("localhost".equalsIgnoreCase(str)) {
                    z = w;
                } else if (!str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                    boolean z2 = true;
                    for (int i = 0; i < str.length(); i++) {
                        char charAt = str.charAt(i);
                        if (charAt != '.') {
                            z2 &= charAt >= '0' && charAt <= '9';
                        }
                    }
                    z = !z2;
                }
            }
            if (z && this.d.get() != null) {
                l1j.f();
                return null;
            }
            Object obj = null;
            if (list.isEmpty()) {
                t.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
            } else {
                Random random = this.c;
                if (y == null) {
                    try {
                        y = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException e) {
                        b6e.q(e);
                        return null;
                    }
                }
                String str2 = y;
                try {
                    Iterator it = V().iterator();
                    Map map = null;
                    while (it.hasNext()) {
                        try {
                            map = U((Map) it.next(), random, str2);
                            if (map != null) {
                                break;
                            }
                        } catch (RuntimeException e2) {
                            lwiVar = new lwi(sgr.g.i("failed to pick service config choice").h(e2));
                        }
                    }
                    lwiVar = map == null ? null : new lwi(map);
                } catch (IOException | RuntimeException e3) {
                    lwiVar = new lwi(sgr.g.i("failed to parse TXT records").h(e3));
                }
                if (lwiVar != null) {
                    sgr sgrVar = lwiVar.a;
                    if (sgrVar != null) {
                        obj = new lwi(sgrVar);
                    } else {
                        Map map2 = (Map) lwiVar.b;
                        krd krdVar = this.p;
                        krdVar.getClass();
                        try {
                            nnk nnkVar = (nnk) krdVar.d;
                            nnkVar.getClass();
                            if (map2 != null) {
                                try {
                                    u0 = bkp.u0(bkp.h0(map2));
                                } catch (RuntimeException e4) {
                                    lwiVar3 = new lwi(sgr.g.i("can't parse load balancer configuration").h(e4));
                                }
                            } else {
                                u0 = null;
                            }
                            lwiVar3 = (u0 == null || u0.isEmpty()) ? null : bkp.p0(u0, (eeg) nnkVar.a);
                            if (lwiVar3 != null) {
                                sgr sgrVar2 = lwiVar3.a;
                                if (sgrVar2 != null) {
                                    obj = new lwi(sgrVar2);
                                } else {
                                    obj = lwiVar3.b;
                                }
                            }
                            lwiVar2 = new lwi(q8h.a(map2, krdVar.c, krdVar.a, krdVar.b, obj));
                        } catch (RuntimeException e5) {
                            lwiVar2 = new lwi(sgr.g.i("failed to parse service config").h(e5));
                        }
                        obj = lwiVar2;
                    }
                }
            }
            es6Var.c = obj;
            return es6Var;
        } catch (Exception e6) {
            es6Var.a = sgr.o.i("Unable to resolve host " + str).h(e6);
            return es6Var;
        }
    }

    public final void W() {
        if (this.q || this.m) {
            return;
        }
        if (this.l) {
            long j = this.i;
            if (j != 0 && (j <= 0 || this.k.a() <= j)) {
                return;
            }
        }
        this.q = true;
        this.n.execute(new pv7(this, this.r));
    }

    public final List X() {
        try {
            try {
                int i = this.s;
                String str = this.f;
                if (i == 0) {
                    throw null;
                }
                List unmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(unmodifiableList.size());
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new reb(new InetSocketAddress((InetAddress) it.next(), this.g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                fgs.a(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                t.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }

    @Override // defpackage.ngg
    public final String v() {
        return this.e;
    }
}
