package N1;

import J1.A;
import J1.C0050a;
import Q1.C0078a;
import Q1.E;
import Q1.EnumC0079b;
import a.AbstractC0083a;
import i1.AbstractC0251h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final l f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final C0050a f1173b;

    /* renamed from: c, reason: collision with root package name */
    public final i f1174c;

    /* renamed from: d, reason: collision with root package name */
    public n f1175d;

    /* renamed from: e, reason: collision with root package name */
    public o f1176e;

    /* renamed from: f, reason: collision with root package name */
    public int f1177f;

    /* renamed from: g, reason: collision with root package name */
    public int f1178g;

    /* renamed from: h, reason: collision with root package name */
    public int f1179h;

    /* renamed from: i, reason: collision with root package name */
    public A f1180i;

    public f(l connectionPool, C0050a c0050a, i call) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(call, "call");
        this.f1172a = connectionPool;
        this.f1173b = c0050a;
        this.f1174c = call;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k a(int i2, int i3, int i4, boolean z2, boolean z3) {
        ArrayList arrayList;
        String hostName;
        int i5;
        List list;
        boolean contains;
        C.j jVar;
        Socket h2;
        while (!this.f1174c.f1195m) {
            k kVar = this.f1174c.f1190h;
            if (kVar != null) {
                synchronized (kVar) {
                    try {
                        if (!kVar.f1207j && b(kVar.f1199b.f803a.f820h)) {
                            h2 = null;
                        }
                        h2 = this.f1174c.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f1174c.f1190h != null) {
                    if (h2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!kVar.i(z3)) {
                        return kVar;
                    }
                    kVar.k();
                    if (this.f1180i == null) {
                        n nVar = this.f1175d;
                        if (nVar == null ? true : nVar.a()) {
                            continue;
                        } else {
                            o oVar = this.f1176e;
                            if (!(oVar == null ? true : oVar.i())) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (h2 != null) {
                        K1.b.e(h2);
                    }
                    i call = this.f1174c;
                    kotlin.jvm.internal.i.e(call, "call");
                }
            }
            this.f1177f = 0;
            this.f1178g = 0;
            this.f1179h = 0;
            if (this.f1172a.a(this.f1173b, this.f1174c, null, false)) {
                kVar = this.f1174c.f1190h;
                kotlin.jvm.internal.i.b(kVar);
                i call2 = this.f1174c;
                kotlin.jvm.internal.i.e(call2, "call");
            } else {
                A a2 = this.f1180i;
                try {
                    if (a2 != null) {
                        this.f1180i = null;
                    } else {
                        n nVar2 = this.f1175d;
                        if (nVar2 == null || !nVar2.a()) {
                            o oVar2 = this.f1176e;
                            if (oVar2 == null) {
                                C0050a c0050a = this.f1173b;
                                i iVar = this.f1174c;
                                oVar2 = new o(c0050a, iVar.f1183a.f962y, iVar);
                                this.f1176e = oVar2;
                            }
                            if (!oVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (oVar2.f1225a < ((List) oVar2.f1229e).size()) {
                                boolean z4 = oVar2.f1225a < ((List) oVar2.f1229e).size();
                                C0050a c0050a2 = (C0050a) oVar2.f1226b;
                                if (!z4) {
                                    throw new SocketException("No route to " + c0050a2.f820h.f907d + "; exhausted proxy configurations: " + ((List) oVar2.f1229e));
                                }
                                List list2 = (List) oVar2.f1229e;
                                int i6 = oVar2.f1225a;
                                oVar2.f1225a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                oVar2.f1230f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    J1.o oVar3 = c0050a2.f820h;
                                    hostName = oVar3.f907d;
                                    i5 = oVar3.f908e;
                                } else {
                                    SocketAddress proxyAddress = proxy.address();
                                    if (!(proxyAddress instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(kotlin.jvm.internal.i.h(proxyAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                                    }
                                    kotlin.jvm.internal.i.d(proxyAddress, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                    kotlin.jvm.internal.i.e(inetSocketAddress, "<this>");
                                    InetAddress address = inetSocketAddress.getAddress();
                                    if (address == null) {
                                        hostName = inetSocketAddress.getHostName();
                                        kotlin.jvm.internal.i.d(hostName, "hostName");
                                    } else {
                                        hostName = address.getHostAddress();
                                        kotlin.jvm.internal.i.d(hostName, "address.hostAddress");
                                    }
                                    i5 = inetSocketAddress.getPort();
                                }
                                if (1 > i5 || i5 >= 65536) {
                                    throw new SocketException("No route to " + hostName + ':' + i5 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(hostName, i5));
                                } else {
                                    byte[] bArr = K1.b.f1051a;
                                    kotlin.jvm.internal.i.e(hostName, "<this>");
                                    z1.f fVar = K1.b.f1055e;
                                    fVar.getClass();
                                    if (fVar.f8637a.matcher(hostName).matches()) {
                                        list = AbstractC0083a.m(InetAddress.getByName(hostName));
                                    } else {
                                        i call3 = (i) oVar2.f1228d;
                                        kotlin.jvm.internal.i.e(call3, "call");
                                        c0050a2.f813a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(hostName);
                                            kotlin.jvm.internal.i.d(allByName, "getAllByName(hostname)");
                                            List U2 = AbstractC0251h.U(allByName);
                                            if (U2.isEmpty()) {
                                                throw new UnknownHostException(c0050a2.f813a + " returned no addresses for " + hostName);
                                            }
                                            list = U2;
                                        } catch (NullPointerException e2) {
                                            UnknownHostException unknownHostException = new UnknownHostException(kotlin.jvm.internal.i.h(hostName, "Broken system behaviour for dns lookup of "));
                                            unknownHostException.initCause(e2);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i5));
                                    }
                                }
                                Iterator it2 = oVar2.f1230f.iterator();
                                while (it2.hasNext()) {
                                    A a3 = new A((C0050a) oVar2.f1226b, proxy, (InetSocketAddress) it2.next());
                                    C.j jVar2 = (C.j) oVar2.f1227c;
                                    synchronized (jVar2) {
                                        contains = ((LinkedHashSet) jVar2.f124b).contains(a3);
                                    }
                                    if (contains) {
                                        ((ArrayList) oVar2.f1231g).add(a3);
                                    } else {
                                        arrayList.add(a3);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                ArrayList elements = (ArrayList) oVar2.f1231g;
                                kotlin.jvm.internal.i.e(elements, "elements");
                                arrayList.addAll(elements);
                                ((ArrayList) oVar2.f1231g).clear();
                            }
                            n nVar3 = new n(arrayList);
                            this.f1175d = nVar3;
                            if (this.f1174c.f1195m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f1172a.a(this.f1173b, this.f1174c, arrayList, false)) {
                                kVar = this.f1174c.f1190h;
                                kotlin.jvm.internal.i.b(kVar);
                                i call4 = this.f1174c;
                                kotlin.jvm.internal.i.e(call4, "call");
                            } else {
                                if (!nVar3.a()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = nVar3.f1223a;
                                nVar3.f1223a = i7 + 1;
                                a2 = (A) arrayList.get(i7);
                                kVar = new k(this.f1172a, a2);
                                this.f1174c.f1197o = kVar;
                                kVar.c(i2, i3, i4, z2, this.f1174c);
                                this.f1174c.f1197o = null;
                                jVar = this.f1174c.f1183a.f962y;
                                synchronized (jVar) {
                                    ((LinkedHashSet) jVar.f124b).remove(a2);
                                }
                                if (this.f1172a.a(this.f1173b, this.f1174c, arrayList, true)) {
                                    k kVar2 = this.f1174c.f1190h;
                                    kotlin.jvm.internal.i.b(kVar2);
                                    this.f1180i = a2;
                                    Socket socket = kVar.f1201d;
                                    kotlin.jvm.internal.i.b(socket);
                                    K1.b.e(socket);
                                    i call5 = this.f1174c;
                                    kotlin.jvm.internal.i.e(call5, "call");
                                    kVar = kVar2;
                                } else {
                                    synchronized (kVar) {
                                        l lVar = this.f1172a;
                                        lVar.getClass();
                                        byte[] bArr2 = K1.b.f1051a;
                                        ((ConcurrentLinkedQueue) lVar.f1220d).add(kVar);
                                        ((M1.c) lVar.f1218b).c((M1.b) lVar.f1219c, 0L);
                                        this.f1174c.a(kVar);
                                    }
                                    i call6 = this.f1174c;
                                    kotlin.jvm.internal.i.e(call6, "call");
                                }
                            }
                        } else {
                            n nVar4 = this.f1175d;
                            kotlin.jvm.internal.i.b(nVar4);
                            if (!nVar4.a()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = nVar4.f1223a;
                            nVar4.f1223a = i8 + 1;
                            a2 = (A) ((ArrayList) nVar4.f1224b).get(i8);
                        }
                    }
                    kVar.c(i2, i3, i4, z2, this.f1174c);
                    this.f1174c.f1197o = null;
                    jVar = this.f1174c.f1183a.f962y;
                    synchronized (jVar) {
                    }
                } catch (Throwable th2) {
                    this.f1174c.f1197o = null;
                    throw th2;
                }
                arrayList = null;
                kVar = new k(this.f1172a, a2);
                this.f1174c.f1197o = kVar;
            }
            if (!kVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(J1.o url) {
        kotlin.jvm.internal.i.e(url, "url");
        J1.o oVar = this.f1173b.f820h;
        return url.f908e == oVar.f908e && kotlin.jvm.internal.i.a(url.f907d, oVar.f907d);
    }

    public final void c(IOException e2) {
        kotlin.jvm.internal.i.e(e2, "e");
        this.f1180i = null;
        if (e2 instanceof E) {
            if (((E) e2).f1563a == EnumC0079b.REFUSED_STREAM) {
                this.f1177f++;
                return;
            }
        }
        if (e2 instanceof C0078a) {
            this.f1178g++;
        } else {
            this.f1179h++;
        }
    }
}
