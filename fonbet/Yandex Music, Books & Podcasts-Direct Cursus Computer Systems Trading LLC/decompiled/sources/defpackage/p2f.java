package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;
import kotlin.KotlinVersion;

/* loaded from: classes5.dex */
public final class p2f extends j2f implements d77, i77 {
    public static final Logger s = Logger.getLogger(p2f.class.getName());
    public static final Random t = new Random();
    public volatile InetAddress a;
    public volatile MulticastSocket b;
    public final List c;
    public final ConcurrentHashMap d;
    public final Set e;
    public final h67 f;
    public final ConcurrentHashMap g;
    public final ConcurrentHashMap h;
    public final a4e i;
    public b3r j;
    public int k;
    public long l;
    public l67 o;
    public final ConcurrentHashMap p;
    public final String q;
    public final ExecutorService m = Executors.newSingleThreadExecutor(new wob());
    public final ReentrantLock n = new ReentrantLock();
    public final Object r = new Object();

    public p2f(String str, InetAddress inetAddress) {
        InetAddress inetAddress2;
        String str2;
        Logger logger = s;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("JmDNS instance created");
        }
        this.f = new h67(100);
        this.c = Collections.synchronizedList(new ArrayList());
        this.d = new ConcurrentHashMap();
        this.e = Collections.synchronizedSet(new HashSet());
        this.p = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap(20);
        this.h = new ConcurrentHashMap(20);
        Logger logger2 = a4e.e;
        String str3 = str != null ? str : "";
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    inetAddress2 = InetAddress.getByName(property);
                } else {
                    inetAddress2 = InetAddress.getLocalHost();
                    if (inetAddress2.isLoopbackAddress()) {
                        if (b2j.a == null) {
                            synchronized (b2j.class) {
                                try {
                                    if (b2j.a == null) {
                                        if (b2j.b.get() != null) {
                                            throw new ClassCastException();
                                        }
                                        b2j.a = new c2j();
                                    }
                                } finally {
                                }
                            }
                        }
                        InetAddress[] a = b2j.a.a();
                        if (a.length > 0) {
                            inetAddress2 = a[0];
                        }
                    }
                }
                if (inetAddress2.isLoopbackAddress()) {
                    a4e.e.warning("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                a4e.e.log(Level.WARNING, "Could not intialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), (Throwable) e);
                InetAddress inetAddress3 = null;
                try {
                    inetAddress3 = InetAddress.getByName(null);
                } catch (UnknownHostException unused) {
                }
                inetAddress2 = inetAddress3;
                str2 = (str == null || str.length() <= 0) ? "computer" : str2;
            }
        } else {
            inetAddress2 = inetAddress;
        }
        str3 = str3.length() == 0 ? inetAddress2.getHostName() : str3;
        if (str3.contains("in-addr.arpa") || str3.equals(inetAddress2.getHostAddress())) {
            if (str == null || str.length() <= 0) {
                str2 = inetAddress2.getHostAddress();
                str3 = str2;
            }
            str3 = str;
        }
        int indexOf = str3.indexOf(".local");
        a4e a4eVar = new a4e(inetAddress2, ouj.n((indexOf > 0 ? str3.substring(0, indexOf) : str3).replace('.', '-'), ".local."), this);
        this.i = a4eVar;
        this.q = str == null ? a4eVar.a : str;
        N0(a4eVar);
        T0(this.g.values());
        N();
    }

    public static String U0(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    public static void X0(a aVar, long j) {
        synchronized (aVar) {
            long j2 = j / 200;
            if (j2 < 1) {
                j2 = 1;
            }
            for (int i = 0; i < j2 && !aVar.j(); i++) {
                try {
                    aVar.wait(200L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // defpackage.i77
    public final void D(a aVar) {
        h77.a().b(this).D(aVar);
    }

    public final void F0() {
        Level level = Level.FINER;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.finer("disposeServiceCollectors()");
        }
        ConcurrentHashMap concurrentHashMap = this.p;
        for (String str : concurrentHashMap.keySet()) {
            m2f m2fVar = (m2f) concurrentHashMap.get(str);
            if (m2fVar != null) {
                X(str, m2fVar);
                concurrentHashMap.remove(str, m2fVar);
            }
        }
    }

    public final a G0(String str, String str2, String str3, boolean z) {
        String str4;
        byte[] bArr;
        HashMap n = a.n(str);
        n.put(ekp.d, str2);
        n.put(ekp.e, str3);
        a aVar = new a(a.l(n), 0, 0, 0, z, null);
        x67 x67Var = x67.CLASS_ANY;
        t67 t67Var = new t67(str, x67Var, false, 0, aVar.f());
        h67 h67Var = this.f;
        j67 c = h67Var.c(t67Var);
        if (c instanceof w67) {
            a q = ((w67) c).q(z);
            HashMap s2 = q.s();
            j67 d = h67Var.d(aVar.f(), y67.TYPE_SRV, x67Var);
            if (d instanceof w67) {
                a q2 = ((w67) d).q(z);
                q = new a(s2, q2.h, q2.i, q2.j, z, null);
                bArr = q2.h();
                str4 = q2.t();
            } else {
                str4 = "";
                bArr = null;
            }
            Iterator it = h67Var.f(str4, y67.TYPE_A, x67Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j67 j67Var = (j67) it.next();
                if (j67Var instanceof w67) {
                    a q3 = ((w67) j67Var).q(z);
                    for (Inet4Address inet4Address : q3.c()) {
                        q.m.add(inet4Address);
                    }
                    q.k = q3.h();
                    q.l = null;
                }
            }
            for (j67 j67Var2 : h67Var.f(str4, y67.TYPE_AAAA, x67.CLASS_ANY)) {
                if (j67Var2 instanceof w67) {
                    a q4 = ((w67) j67Var2).q(z);
                    for (Inet6Address inet6Address : q4.d()) {
                        q.n.add(inet6Address);
                    }
                    q.k = q4.h();
                    q.l = null;
                }
            }
            j67 d2 = h67Var.d(q.f(), y67.TYPE_TXT, x67.CLASS_ANY);
            if (d2 instanceof w67) {
                q.k = ((w67) d2).q(z).h();
                q.l = null;
            }
            if (q.h().length == 0) {
                q.k = bArr;
                q.l = null;
            }
            if (q.j()) {
                return q;
            }
        }
        return aVar;
    }

    @Override // defpackage.i77
    public final void H() {
        h77.a().b(this).H();
    }

    public final void H0(l67 l67Var, InetAddress inetAddress, int i) {
        Level level = Level.FINE;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.fine(this.q + ".handle query: " + l67Var);
        }
        System.currentTimeMillis();
        Iterator it = l67Var.a().iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((w67) it.next()).r(this);
        }
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            l67 l67Var2 = this.o;
            if (l67Var2 != null) {
                l67Var2.f(l67Var);
            } else {
                l67 clone = l67Var.clone();
                if ((l67Var.c & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                    this.o = clone;
                }
                P(clone, inetAddress, i);
            }
            reentrantLock.unlock();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = l67Var.e.iterator();
            while (it2.hasNext()) {
                I0((w67) it2.next(), currentTimeMillis);
            }
            if (z) {
                o();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.i77
    public final void I() {
        h77.a().b(this).I();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I0(w67 w67Var, long j) {
        int i;
        boolean h = w67Var.h(j);
        Logger logger = s;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            logger.fine(this.q + " handle response: " + w67Var);
        }
        if (!w67Var.k() && !w67Var.g()) {
            boolean z = w67Var.f;
            w67 w67Var2 = (w67) this.f.c(w67Var);
            if (logger.isLoggable(level)) {
                logger.fine(this.q + " handle response cached record: " + w67Var2);
            }
            i = 1;
            if (z) {
                for (j67 j67Var : this.f.e(w67Var.b())) {
                    if (w67Var.e().equals(j67Var.e()) && w67Var.d().equals(j67Var.d()) && j67Var != w67Var2) {
                        w67 w67Var3 = (w67) j67Var;
                        w67Var3.i = j;
                        w67Var3.h = 1;
                    }
                }
            }
            if (w67Var2 != null) {
                if (h) {
                    if (w67Var.h == 0) {
                        w67Var2.i = j;
                        w67Var2.h = 1;
                    } else {
                        h67 h67Var = this.f;
                        h67Var.getClass();
                        List list = (List) h67Var.get(w67Var2.b());
                        if (list != null) {
                            synchronized (list) {
                                list.remove(w67Var2);
                            }
                        }
                    }
                } else if (!w67Var.u(w67Var2) || (!w67Var.f().equals(w67Var2.f()) && w67Var.f().length() > 0)) {
                    boolean t2 = w67Var.t();
                    h67 h67Var2 = this.f;
                    if (t2) {
                        h67Var2.getClass();
                        if (w67Var.b().equals(w67Var2.b())) {
                            List list2 = (List) h67Var2.get(w67Var.b());
                            if (list2 == null) {
                                h67Var2.putIfAbsent(w67Var.b(), new ArrayList());
                                list2 = (List) h67Var2.get(w67Var.b());
                            }
                            synchronized (list2) {
                                list2.remove(w67Var2);
                                list2.add(w67Var);
                            }
                        }
                        i = 2;
                    } else {
                        h67Var2.b(w67Var);
                        i = 3;
                    }
                } else {
                    w67Var2.i = w67Var.i;
                    w67Var2.h = w67Var.h;
                    i = 5;
                    w67Var = w67Var2;
                }
            } else if (!h) {
                this.f.b(w67Var);
                i = 3;
            }
            if (w67Var.e() == y67.TYPE_PTR) {
                if (w67Var.k()) {
                    if (h) {
                        return;
                    }
                    Q0(((t67) w67Var).m);
                    return;
                } else if (Q0(w67Var.c()) && i == 5) {
                    i = 4;
                }
            }
            if (i == 5) {
                W0(j, w67Var, i);
                return;
            }
            return;
        }
        i = 5;
        if (w67Var.e() == y67.TYPE_PTR) {
        }
        if (i == 5) {
        }
    }

    public final void J0(l67 l67Var) {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = l67Var.a().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            w67 w67Var = (w67) it.next();
            I0(w67Var, currentTimeMillis);
            if (y67.TYPE_A.equals(w67Var.e()) || y67.TYPE_AAAA.equals(w67Var.e())) {
                z |= w67Var.s(this);
            } else {
                z2 |= w67Var.s(this);
            }
        }
        if (z || z2) {
            o();
        }
    }

    public final boolean K0() {
        return this.i.d.c.c();
    }

    public final boolean L0() {
        return this.i.d.c.b == 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r3 = java.util.logging.Level.FINER;
        r9 = defpackage.p2f.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r9.isLoggable(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r9.finer("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:" + r4 + " s.server=" + r10 + com.connectsdk.service.webos.lgcast.common.utils.StringUtil.SPACE + r8.a + " equals:" + r10.equals(r8.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        r3 = defpackage.neg.p();
        r4 = r8.b;
        r13.e = r3.y(2, r13.e());
        r13.o = null;
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(a aVar) {
        boolean z;
        a4e a4eVar;
        boolean z2;
        String p = aVar.p();
        long currentTimeMillis = System.currentTimeMillis();
        do {
            Iterator it = this.f.e(aVar.p()).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                z = true;
                a4eVar = this.i;
                if (!hasNext) {
                    z2 = false;
                    break;
                }
                j67 j67Var = (j67) it.next();
                if (y67.TYPE_SRV.equals(j67Var.e()) && !j67Var.h(currentTimeMillis)) {
                    u67 u67Var = (u67) j67Var;
                    String str = u67Var.p;
                    if (u67Var.o != aVar.h || !str.equals(a4eVar.a)) {
                        break;
                    }
                }
            }
            fkp fkpVar = (fkp) this.g.get(aVar.p());
            if (fkpVar == null || fkpVar == aVar) {
                z = z2;
            } else {
                o6c p2 = neg.p();
                InetAddress inetAddress = a4eVar.b;
                aVar.e = p2.y(2, aVar.e());
                aVar.o = null;
            }
        } while (z);
        p.equals(aVar.p());
    }

    @Override // defpackage.i77
    public final void N() {
        h77.a().b(this).N();
    }

    public final void N0(a4e a4eVar) {
        if (this.a == null) {
            if (a4eVar.b instanceof Inet6Address) {
                this.a = InetAddress.getByName("FF02::FB");
            } else {
                this.a = InetAddress.getByName("224.0.0.251");
            }
        }
        if (this.b != null) {
            l0();
        }
        this.b = new MulticastSocket(i67.a);
        if (a4eVar != null && a4eVar.c != null) {
            try {
                this.b.setNetworkInterface(a4eVar.c);
            } catch (SocketException e) {
                Logger logger = s;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine("openMulticastSocket() Set network interface exception: " + e.getMessage());
                }
            }
        }
        this.b.setTimeToLive(KotlinVersion.MAX_COMPONENT_VALUE);
        this.b.joinGroup(this.a);
    }

    public final void O0() {
        Logger logger = s;
        logger.finer(this.q + "recover()");
        if (this.i.d.c.b == 6 || this.i.d.c.b == 7 || L0() || K0()) {
            return;
        }
        synchronized (this.r) {
            try {
                if (this.i.d.b()) {
                    logger.finer(this.q + "recover() thread " + Thread.currentThread().getName());
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.q);
                    sb.append(".recover()");
                    new l2f(this, sb.toString()).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.i77
    public final void P(l67 l67Var, InetAddress inetAddress, int i) {
        h77.a().b(this).P(l67Var, inetAddress, i);
    }

    public final void P0(a aVar) {
        if (this.i.d.c.b == 6 || this.i.d.c.b == 7) {
            xq0.q("This DNS is closed.");
            return;
        }
        if (aVar.q.a != null) {
            if (aVar.q.a != this) {
                xq0.q("A service information can only be registered with a single instamce of JmDNS.");
                return;
            } else if (this.g.get(aVar.p()) != null) {
                xq0.q("A service information can only be registered once.");
                return;
            }
        }
        aVar.q.a = this;
        Q0(aVar.u());
        gkp gkpVar = aVar.q;
        gkpVar.lock();
        try {
            gkpVar.e(z67.c);
            gkpVar.f(null);
            gkpVar.unlock();
            a4e a4eVar = this.i;
            aVar.g = a4eVar.a;
            InetAddress inetAddress = a4eVar.b;
            aVar.m.add(inetAddress instanceof Inet4Address ? (Inet4Address) inetAddress : null);
            InetAddress inetAddress2 = this.i.b;
            aVar.n.add(inetAddress2 instanceof Inet6Address ? (Inet6Address) inetAddress2 : null);
            this.i.d.g();
            M0(aVar);
            while (this.g.putIfAbsent(aVar.p(), aVar) != null) {
                M0(aVar);
            }
            o();
            aVar.q.g();
            Logger logger = s;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("registerService() JmDNS registered service as " + aVar);
            }
        } catch (Throwable th) {
            gkpVar.unlock();
            throw th;
        }
    }

    @Override // defpackage.i77
    public final void Q() {
        h77.a().b(this).Q();
    }

    public final boolean Q0(String str) {
        boolean z;
        o2f o2fVar;
        HashMap n = a.n(str);
        String str2 = (String) n.get(ekp.a);
        String str3 = (String) n.get(ekp.b);
        String str4 = (String) n.get(ekp.c);
        String str5 = (String) n.get(ekp.e);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? hrg.q("_", str4, ".") : "");
        String s2 = vz1.s(sb, str3.length() > 0 ? hrg.q("_", str3, ".") : "", str2, ".");
        String lowerCase = s2.toLowerCase();
        Logger logger = s;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder sb2 = new StringBuilder();
            su4.v(sb2, this.q, ".registering service type: ", str, " as: ");
            sb2.append(s2);
            sb2.append(str5.length() > 0 ? " subtype: ".concat(str5) : "");
            logger.fine(sb2.toString());
        }
        boolean z2 = true;
        if (this.h.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.h.putIfAbsent(lowerCase, new o2f(s2)) == null;
            if (z) {
                Set set = this.e;
                ddg[] ddgVarArr = (ddg[]) set.toArray(new ddg[set.size()]);
                dkp dkpVar = new dkp(this, s2, "", null);
                for (ddg ddgVar : ddgVarArr) {
                    this.m.submit(new q(dkpVar, 20));
                }
            }
        }
        if (str5.length() <= 0 || (o2fVar = (o2f) this.h.get(lowerCase)) == null) {
            return z;
        }
        if (o2fVar.containsKey(str5.toLowerCase())) {
            return z;
        }
        synchronized (o2fVar) {
            try {
                if (o2fVar.containsKey(str5.toLowerCase())) {
                    z2 = z;
                } else {
                    if (!o2fVar.containsKey(str5.toLowerCase())) {
                        o2fVar.a.add(new n2f(str5));
                    }
                    Set set2 = this.e;
                    ddg[] ddgVarArr2 = (ddg[]) set2.toArray(new ddg[set2.size()]);
                    dkp dkpVar2 = new dkp(this, "_" + str5 + "._sub." + s2, "", null);
                    for (ddg ddgVar2 : ddgVarArr2) {
                        this.m.submit(new q(dkpVar2, 21));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // defpackage.i77
    public final void R() {
        h77.a().b(this).R();
    }

    public final a R0(String str, String str2, String str3, boolean z) {
        j0();
        String lowerCase = str.toLowerCase();
        Q0(str);
        m2f m2fVar = new m2f(str);
        ConcurrentHashMap concurrentHashMap = this.p;
        if (concurrentHashMap.putIfAbsent(lowerCase, m2fVar) == null) {
            Y(lowerCase, (ikp) concurrentHashMap.get(lowerCase), true);
        }
        a G0 = G0(str, str2, str3, z);
        D(G0);
        return G0;
    }

    @Override // defpackage.d77
    public final void S(e77 e77Var) {
        this.i.S(e77Var);
    }

    public final void S0(o67 o67Var) {
        InetAddress inetAddress;
        int i;
        if (o67Var.c()) {
            return;
        }
        InetSocketAddress inetSocketAddress = o67Var.n;
        if (inetSocketAddress != null) {
            inetAddress = inetSocketAddress.getAddress();
            i = o67Var.n.getPort();
        } else {
            inetAddress = this.a;
            i = i67.a;
        }
        List list = o67Var.g;
        List list2 = o67Var.f;
        List list3 = o67Var.e;
        List<q67> list4 = o67Var.d;
        long currentTimeMillis = System.currentTimeMillis();
        o67Var.h.clear();
        n67 n67Var = new n67(o67Var.i, o67Var, 0);
        n67Var.z(o67Var.b ? 0 : o67Var.b());
        n67Var.z(o67Var.c);
        n67Var.z(list4.size());
        n67Var.z(list3.size());
        n67Var.z(list2.size());
        n67Var.z(list.size());
        for (q67 q67Var : list4) {
            n67Var.g(q67Var.c());
            n67Var.z(q67Var.e().a);
            n67Var.z(q67Var.d().a);
        }
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            n67Var.o((w67) it.next(), currentTimeMillis);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            n67Var.o((w67) it2.next(), currentTimeMillis);
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            n67Var.o((w67) it3.next(), currentTimeMillis);
        }
        byte[] byteArray = n67Var.toByteArray();
        try {
            n67Var.close();
        } catch (IOException unused) {
        }
        DatagramPacket datagramPacket = new DatagramPacket(byteArray, byteArray.length, inetAddress, i);
        Logger logger = s;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            try {
                l67 l67Var = new l67(datagramPacket);
                if (logger.isLoggable(level)) {
                    logger.finest("send(" + this.q + ") JmDNS out:" + l67Var.h());
                }
            } catch (IOException e) {
                s.throwing(p2f.class.toString(), su4.o(new StringBuilder("send("), this.q, ") - JmDNS can not parse what it sends!!!"), e);
            }
        }
        MulticastSocket multicastSocket = this.b;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    public final void T0(Collection collection) {
        if (this.j == null) {
            b3r b3rVar = new b3r(this);
            this.j = b3rVar;
            b3rVar.start();
        }
        o();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            try {
                P0(new a((fkp) it.next()));
            } catch (Exception e) {
                s.log(Level.WARNING, "start() Registration exception ", (Throwable) e);
            }
        }
    }

    public final void V0() {
        Level level = Level.FINER;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.finer("unregisterAllServices()");
        }
        ConcurrentHashMap concurrentHashMap = this.g;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            a aVar = (a) concurrentHashMap.get((String) it.next());
            if (aVar != null) {
                if (logger.isLoggable(Level.FINER)) {
                    logger.finer("Cancelling service info: " + aVar);
                }
                aVar.q.b();
            }
        }
        I();
        for (String str : concurrentHashMap.keySet()) {
            a aVar2 = (a) concurrentHashMap.get(str);
            if (aVar2 != null) {
                if (logger.isLoggable(Level.FINER)) {
                    logger.finer("Wait for service info cancel: " + aVar2);
                }
                aVar2.q.h();
                concurrentHashMap.remove(str, aVar2);
            }
        }
    }

    public final void W0(long j, w67 w67Var, int i) {
        ArrayList arrayList;
        List<cdg> list;
        synchronized (this.c) {
            arrayList = new ArrayList(this.c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).x(this.f, j, w67Var);
        }
        if (y67.TYPE_PTR.equals(w67Var.e())) {
            dkp p = w67Var.p(this);
            fkp fkpVar = p.c;
            if (fkpVar == null || !fkpVar.j()) {
                a G0 = G0(p.a, p.b, "", false);
                if (G0.j()) {
                    p = new dkp(this, p.a, p.b, G0);
                }
            }
            List list2 = (List) this.d.get(p.a.toLowerCase());
            if (list2 != null) {
                synchronized (list2) {
                    list = new ArrayList(list2);
                }
            } else {
                list = Collections.EMPTY_LIST;
            }
            Logger logger = s;
            if (logger.isLoggable(Level.FINEST)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.q);
                sb.append(".updating record for event: ");
                sb.append(p);
                sb.append(" list ");
                sb.append(list);
                sb.append(" operation: ");
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Noop" : "RegisterServiceType" : "Add" : "Update" : "Remove");
                logger.finest(sb.toString());
            }
            if (list.isEmpty()) {
                return;
            }
            int D = ouj.D(i);
            if (D == 0) {
                for (cdg cdgVar : list) {
                    if (cdgVar.b) {
                        cdgVar.b(p);
                    } else {
                        this.m.submit(new k2f(cdgVar, p, 1));
                    }
                }
                return;
            }
            if (D != 2) {
                return;
            }
            for (cdg cdgVar2 : list) {
                if (cdgVar2.b) {
                    cdgVar2.a(p);
                } else {
                    this.m.submit(new k2f(cdgVar2, p, 0));
                }
            }
        }
    }

    @Override // defpackage.j2f
    public final void X(String str, ikp ikpVar) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.d.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                try {
                    list.remove(new cdg(ikpVar, false));
                    if (list.isEmpty()) {
                        this.d.remove(lowerCase, list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void Y(String str, ikp ikpVar, boolean z) {
        cdg cdgVar = new cdg(ikpVar, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.d.get(lowerCase);
        if (list == null) {
            if (this.d.putIfAbsent(lowerCase, new LinkedList()) == null && this.p.putIfAbsent(lowerCase, new m2f(str)) == null) {
                Y(lowerCase, (ikp) this.p.get(lowerCase), true);
            }
            list = (List) this.d.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                try {
                    if (!list.contains(ikpVar)) {
                        list.add(cdgVar);
                    }
                } finally {
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        h67 h67Var = this.f;
        h67Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (V v : h67Var.values()) {
            if (v != null) {
                arrayList2.addAll(v);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            w67 w67Var = (w67) ((j67) it.next());
            if (w67Var.e() == y67.TYPE_SRV && w67Var.b().endsWith(lowerCase)) {
                String str2 = w67Var.c;
                String str3 = str2 != null ? str2 : "";
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new dkp(this, str3, U0(str2, w67Var.c()), w67Var.q(false)));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            cdgVar.a((ckp) it2.next());
        }
        b(str);
    }

    @Override // defpackage.i77
    public final void a() {
        h77.a().b(this).a();
    }

    @Override // defpackage.i77
    public final void b(String str) {
        h77.a().b(this).b(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i.d.c.b == 6) {
            return;
        }
        Logger logger = s;
        Level level = Level.FINER;
        if (logger.isLoggable(level)) {
            logger.finer("Cancelling JmDNS: " + this);
        }
        z3e z3eVar = this.i.d;
        boolean z = false;
        if (!z3eVar.j()) {
            z3eVar.lock();
            try {
                if (!z3eVar.j()) {
                    z3eVar.e(z67.m);
                    z3eVar.b = null;
                    z = true;
                }
            } finally {
                z3eVar.unlock();
            }
        }
        if (z) {
            logger.finer("Canceling the timer");
            g();
            V0();
            F0();
            if (logger.isLoggable(level)) {
                logger.finer("Wait for JmDNS cancel: " + this);
            }
            a4e a4eVar = this.i;
            if (a4eVar.b != null) {
                a4eVar.d.h();
            }
            logger.finer("Canceling the state timer");
            a();
            this.m.shutdown();
            l0();
            h77.a().a.remove(this);
            if (logger.isLoggable(level)) {
                logger.finer("JmDNS closed.");
            }
        }
        S(null);
    }

    @Override // defpackage.i77
    public final void g() {
        h77.a().b(this).g();
    }

    public final void j0() {
        long currentTimeMillis = System.currentTimeMillis();
        h67 h67Var = this.f;
        h67Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (V v : h67Var.values()) {
            if (v != null) {
                arrayList.addAll(v);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j67 j67Var = (j67) it.next();
            try {
                w67 w67Var = (w67) j67Var;
                boolean z = true;
                if (w67Var.h(currentTimeMillis)) {
                    W0(currentTimeMillis, w67Var, 1);
                    List list = (List) h67Var.get(w67Var.b());
                    if (list != null) {
                        synchronized (list) {
                            list.remove(w67Var);
                        }
                    } else {
                        continue;
                    }
                } else {
                    if ((50 * w67Var.h * 10) + w67Var.i > currentTimeMillis) {
                        z = false;
                    }
                    if (z) {
                        a q = w67Var.q(false);
                        if (this.p.containsKey(q.i().toLowerCase())) {
                            b(q.i());
                        }
                    }
                }
            } catch (Exception e) {
                Logger logger = s;
                logger.log(Level.SEVERE, this.q + ".Error while reaping records: " + j67Var, (Throwable) e);
                logger.severe(toString());
            }
        }
    }

    public final void l0() {
        Logger logger = s;
        if (logger.isLoggable(Level.FINER)) {
            logger.finer("closeMulticastSocket()");
        }
        if (this.b != null) {
            try {
                try {
                    this.b.leaveGroup(this.a);
                } catch (Exception e) {
                    s.log(Level.WARNING, "closeMulticastSocket() Close socket exception ", (Throwable) e);
                }
            } catch (SocketException unused) {
            }
            this.b.close();
            while (true) {
                b3r b3rVar = this.j;
                if (b3rVar == null || !b3rVar.isAlive()) {
                    break;
                }
                synchronized (this) {
                    try {
                        try {
                            b3r b3rVar2 = this.j;
                            if (b3rVar2 != null && b3rVar2.isAlive()) {
                                Logger logger2 = s;
                                if (logger2.isLoggable(Level.FINER)) {
                                    logger2.finer("closeMulticastSocket(): waiting for jmDNS monitor");
                                }
                                wait(1000L);
                            }
                        } catch (InterruptedException unused2) {
                        }
                    } finally {
                    }
                }
            }
            this.j = null;
            this.b = null;
        }
    }

    @Override // defpackage.i77
    public final void o() {
        h77.a().b(this).o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.AbstractMap, o2f] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.String] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(2048);
        sb.append("\n\t---- Local Host -----\n\t");
        sb.append(this.i);
        sb.append("\n\t---- Services -----");
        ConcurrentHashMap concurrentHashMap = this.g;
        for (String str : concurrentHashMap.keySet()) {
            sb.append("\n\t\tService: ");
            sb.append(str);
            sb.append(": ");
            sb.append(concurrentHashMap.get(str));
        }
        sb.append("\n\t---- Types ----");
        ConcurrentHashMap concurrentHashMap2 = this.h;
        Iterator it = concurrentHashMap2.keySet().iterator();
        while (it.hasNext()) {
            Object obj = (o2f) concurrentHashMap2.get((String) it.next());
            sb.append("\n\t\tType: ");
            sb.append(obj.b);
            sb.append(": ");
            if (obj.isEmpty()) {
                obj = "no subtypes";
            }
            sb.append(obj);
        }
        sb.append(StringUtil.LF);
        sb.append(this.f.toString());
        sb.append("\n\t---- Service Collectors ----");
        ConcurrentHashMap concurrentHashMap3 = this.p;
        for (String str2 : concurrentHashMap3.keySet()) {
            sb.append("\n\t\tService Collector: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(concurrentHashMap3.get(str2));
        }
        sb.append("\n\t---- Service Listeners ----");
        ConcurrentHashMap concurrentHashMap4 = this.d;
        for (String str3 : concurrentHashMap4.keySet()) {
            sb.append("\n\t\tService Listener: ");
            sb.append(str3);
            sb.append(": ");
            sb.append(concurrentHashMap4.get(str3));
        }
        return sb.toString();
    }

    @Override // defpackage.i77
    public final void z() {
        h77.a().b(this).z();
    }
}
