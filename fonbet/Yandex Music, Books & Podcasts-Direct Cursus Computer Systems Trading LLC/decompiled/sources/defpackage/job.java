package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class job {
    public final fpa a;
    public final mn b;
    public final mkn c;
    public final jib d;
    public c11 e;
    public gn7 f;
    public int g;
    public int h;
    public int i;
    public bho j;

    public job(fpa fpaVar, mn mnVar, mkn mknVar, jib jibVar) {
        fpaVar.getClass();
        jibVar.getClass();
        this.a = fpaVar;
        this.b = mnVar;
        this.c = mknVar;
        this.d = jibVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x039d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x033e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okn a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        List l;
        vtm vtmVar;
        boolean z3;
        Socket i5;
        while (!this.c.p) {
            okn oknVar = this.c.j;
            if (oknVar != null) {
                synchronized (oknVar) {
                    try {
                        if (!oknVar.j) {
                            u7e u7eVar = oknVar.b.a.h;
                            u7eVar.getClass();
                            u7e u7eVar2 = this.b.h;
                            if (u7eVar.e == u7eVar2.e && Intrinsics.d(u7eVar.d, u7eVar2.d)) {
                                i5 = null;
                            }
                        }
                        i5 = this.c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.j != null) {
                    if (i5 != null) {
                        xq0.q("Check failed.");
                        return null;
                    }
                    z3 = z2;
                    if (oknVar.i(z3)) {
                        return oknVar;
                    }
                    oknVar.k();
                    if (this.j == null) {
                        c11 c11Var = this.e;
                        if (c11Var != null ? c11Var.b() : true) {
                            continue;
                        } else {
                            gn7 gn7Var = this.f;
                            if (!(gn7Var != null ? gn7Var.b() : true)) {
                                kac.f("exhausted all routes");
                                return null;
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        cvt.e(i5);
                    }
                    this.d.h(this.c, oknVar);
                }
            }
            this.g = 0;
            this.h = 0;
            this.i = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                oknVar = this.c.j;
                oknVar.getClass();
                this.d.g(this.c, oknVar);
            } else {
                bho bhoVar = this.j;
                try {
                    if (bhoVar != null) {
                        this.j = null;
                    } else {
                        c11 c11Var2 = this.e;
                        if (c11Var2 == null || !c11Var2.b()) {
                            gn7 gn7Var2 = this.f;
                            if (gn7Var2 == null) {
                                mn mnVar = this.b;
                                mkn mknVar = this.c;
                                vtm vtmVar2 = mknVar.a.B;
                                jib jibVar = this.d;
                                vtmVar2.getClass();
                                jibVar.getClass();
                                gn7Var2 = new gn7();
                                gn7Var2.c = mnVar;
                                gn7Var2.d = vtmVar2;
                                gn7Var2.e = mknVar;
                                gn7Var2.f = jibVar;
                                c5b c5bVar = c5b.a;
                                gn7Var2.g = c5bVar;
                                gn7Var2.h = c5bVar;
                                gn7Var2.b = new ArrayList();
                                u7e u7eVar3 = mnVar.h;
                                u7eVar3.getClass();
                                URI j = u7eVar3.j();
                                if (j.getHost() == null) {
                                    l = cvt.l(Proxy.NO_PROXY);
                                } else {
                                    List<Proxy> select = mnVar.g.select(j);
                                    List<Proxy> list2 = select;
                                    if (list2 == null || list2.isEmpty()) {
                                        l = cvt.l(Proxy.NO_PROXY);
                                    } else {
                                        select.getClass();
                                        l = cvt.x(select);
                                    }
                                }
                                gn7Var2.g = l;
                                gn7Var2.a = 0;
                                this.f = gn7Var2;
                            }
                            if (!gn7Var2.b()) {
                                wvs.n();
                                return null;
                            }
                            arrayList = new ArrayList();
                            while (gn7Var2.a < ((List) gn7Var2.g).size()) {
                                mn mnVar2 = (mn) gn7Var2.c;
                                if (gn7Var2.a >= ((List) gn7Var2.g).size()) {
                                    throw new SocketException("No route to " + mnVar2.h.d + "; exhausted proxy configurations: " + ((List) gn7Var2.g));
                                }
                                List list3 = (List) gn7Var2.g;
                                int i6 = gn7Var2.a;
                                gn7Var2.a = i6 + 1;
                                Proxy proxy = (Proxy) list3.get(i6);
                                es3 es3Var = (es3) gn7Var2.e;
                                jib jibVar2 = (jib) gn7Var2.f;
                                ArrayList arrayList2 = new ArrayList();
                                gn7Var2.h = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    u7e u7eVar4 = mnVar2.h;
                                    str = u7eVar4.d;
                                    i4 = u7eVar4.e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        l1j.p(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                        return null;
                                    }
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        str.getClass();
                                    } else {
                                        str = address2.getHostAddress();
                                        str.getClass();
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = cvt.a;
                                    str.getClass();
                                    if (cvt.f.e(str)) {
                                        list = t75.c(InetAddress.getByName(str));
                                    } else {
                                        jibVar2.j(es3Var, str);
                                        mnVar2.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            allByName.getClass();
                                            List X = xz0.X(allByName);
                                            if (X.isEmpty()) {
                                                throw new UnknownHostException(mnVar2.a + " returned no addresses for " + str);
                                            }
                                            jibVar2.i(es3Var, str, X);
                                            list = X;
                                        } catch (NullPointerException e) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i4));
                                    }
                                }
                                Iterator it2 = gn7Var2.h.iterator();
                                while (it2.hasNext()) {
                                    bho bhoVar2 = new bho((mn) gn7Var2.c, proxy, (InetSocketAddress) it2.next());
                                    vtm vtmVar3 = (vtm) gn7Var2.d;
                                    synchronized (vtmVar3) {
                                        contains = ((LinkedHashSet) vtmVar3.a).contains(bhoVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) gn7Var2.b).add(bhoVar2);
                                    } else {
                                        arrayList.add(bhoVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                z75.t(arrayList, (ArrayList) gn7Var2.b);
                                ((ArrayList) gn7Var2.b).clear();
                            }
                            c11 c11Var3 = new c11();
                            c11Var3.a = arrayList;
                            this.e = c11Var3;
                            if (this.c.p) {
                                kac.f("Canceled");
                                return null;
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                oknVar = this.c.j;
                                oknVar.getClass();
                                this.d.g(this.c, oknVar);
                            } else {
                                if (!c11Var3.b()) {
                                    wvs.n();
                                    return null;
                                }
                                int i7 = c11Var3.b;
                                c11Var3.b = i7 + 1;
                                bhoVar = (bho) arrayList.get(i7);
                                okn oknVar2 = new okn(this.a, bhoVar);
                                this.c.r = oknVar2;
                                oknVar2.c(i, i2, i3, z, this.c, this.d);
                                this.c.r = null;
                                vtmVar = this.c.a.B;
                                synchronized (vtmVar) {
                                    ((LinkedHashSet) vtmVar.a).remove(bhoVar);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    okn oknVar3 = this.c.j;
                                    oknVar3.getClass();
                                    this.j = bhoVar;
                                    Socket socket = oknVar2.d;
                                    socket.getClass();
                                    cvt.e(socket);
                                    this.d.g(this.c, oknVar3);
                                    oknVar = oknVar3;
                                } else {
                                    synchronized (oknVar2) {
                                        fpa fpaVar = this.a;
                                        fpaVar.getClass();
                                        byte[] bArr2 = cvt.a;
                                        ((ConcurrentLinkedQueue) fpaVar.e).add(oknVar2);
                                        ((l8s) fpaVar.c).c((h78) fpaVar.d, 0L);
                                        this.c.c(oknVar2);
                                    }
                                    this.d.g(this.c, oknVar2);
                                    z3 = z2;
                                    oknVar = oknVar2;
                                    if (oknVar.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            c11 c11Var4 = this.e;
                            c11Var4.getClass();
                            if (!c11Var4.b()) {
                                wvs.n();
                                return null;
                            }
                            ArrayList arrayList3 = c11Var4.a;
                            int i8 = c11Var4.b;
                            c11Var4.b = i8 + 1;
                            bhoVar = (bho) arrayList3.get(i8);
                        }
                    }
                    oknVar2.c(i, i2, i3, z, this.c, this.d);
                    this.c.r = null;
                    vtmVar = this.c.a.B;
                    synchronized (vtmVar) {
                    }
                } catch (Throwable th2) {
                    this.c.r = null;
                    throw th2;
                }
                arrayList = null;
                okn oknVar22 = new okn(this.a, bhoVar);
                this.c.r = oknVar22;
            }
            z3 = z2;
            if (oknVar.i(z3)) {
            }
        }
        kac.f("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.j = null;
        if ((iOException instanceof sjr) && ((sjr) iOException).a == 8) {
            this.g++;
        } else if (iOException instanceof i66) {
            this.h++;
        } else {
            this.i++;
        }
    }
}
