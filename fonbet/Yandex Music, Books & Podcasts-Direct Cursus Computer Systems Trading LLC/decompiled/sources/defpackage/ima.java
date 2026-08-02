package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class ima extends hma {
    public final nsg c;
    public fm7 d;
    public final fm7 e;
    public final ArrayList f;
    public fm7 g;
    public p9e h;
    public final ArrayList i;
    public svc j;
    public final ArrayList k;
    public ByteBuffer l;
    public final SecureRandom m;
    public final int n;

    public ima(int i, List list, List list2) {
        boolean z = false;
        this.a = 0;
        this.b = null;
        this.c = rsg.b(ima.class);
        this.d = new fm7();
        this.e = new fm7();
        this.m = new SecureRandom();
        if (list == null || list2 == null || i < 1) {
            e7o.e();
            throw null;
        }
        this.f = new ArrayList(list.size());
        this.i = new ArrayList(list2.size());
        this.k = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((fm7) it.next()).getClass().equals(fm7.class)) {
                z = true;
            }
        }
        this.f.addAll(list);
        if (!z) {
            ArrayList arrayList = this.f;
            arrayList.add(arrayList.size(), this.d);
        }
        this.i.addAll(list2);
        this.n = i;
        this.g = null;
    }

    @Override // defpackage.hma
    public final void b() {
        this.l = null;
        fm7 fm7Var = this.d;
        if (fm7Var != null) {
            fm7Var.getClass();
        }
        this.d = new fm7();
        this.h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int d(isd isdVar, cjp cjpVar) {
        String str;
        boolean z;
        p9 p9Var = (p9) cjpVar;
        boolean equalsIgnoreCase = p9Var.t("Upgrade").equalsIgnoreCase("websocket");
        nsg nsgVar = this.c;
        if (!equalsIgnoreCase || !p9Var.t("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            nsgVar.k("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return 2;
        }
        if (!((TreeMap) isdVar.a).containsKey("Sec-WebSocket-Key") || !((TreeMap) p9Var.a).containsKey("Sec-WebSocket-Accept")) {
            nsgVar.k("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return 2;
        }
        String t = p9Var.t("Sec-WebSocket-Accept");
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(ouj.n(isdVar.t("Sec-WebSocket-Key").trim(), "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes());
            try {
                str = xv7.w(digest.length, digest);
            } catch (IOException unused) {
                str = null;
            }
            if (!str.equals(t)) {
                nsgVar.k("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return 2;
            }
            p9Var.t("Sec-WebSocket-Extensions");
            Iterator it = this.f.iterator();
            if (it.hasNext()) {
                fm7 fm7Var = (fm7) it.next();
                fm7Var.getClass();
                this.d = fm7Var;
                nsgVar.i(fm7Var, "acceptHandshakeAsClient - Matching extension found: {}");
                z = true;
            } else {
                z = 2;
            }
            if (h(p9Var.t("Sec-WebSocket-Protocol")) == 1 && z) {
                return 1;
            }
            nsgVar.k("acceptHandshakeAsClient - No matching extension or protocol found.");
            return 2;
        } catch (NoSuchAlgorithmException e) {
            wvs.m(e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int e(eo4 eo4Var) {
        boolean z;
        p9 p9Var = (p9) eo4Var;
        String t = p9Var.t("Sec-WebSocket-Version");
        int i = -1;
        if (t.length() > 0) {
            try {
                i = Integer.parseInt(t.trim());
            } catch (NumberFormatException unused) {
            }
        }
        nsg nsgVar = this.c;
        if (i != 13) {
            nsgVar.k("acceptHandshakeAsServer - Wrong websocket version.");
            return 2;
        }
        p9Var.t("Sec-WebSocket-Extensions");
        Iterator it = this.f.iterator();
        if (it.hasNext()) {
            fm7 fm7Var = (fm7) it.next();
            fm7Var.getClass();
            this.d = fm7Var;
            nsgVar.i(fm7Var, "acceptHandshakeAsServer - Matching extension found: {}");
            z = true;
        } else {
            z = 2;
        }
        if (h(p9Var.t("Sec-WebSocket-Protocol")) == 1 && z) {
            return 1;
        }
        nsgVar.k("acceptHandshakeAsServer - No matching extension or protocol found.");
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ima.class != obj.getClass()) {
            return false;
        }
        ima imaVar = (ima) obj;
        if (this.n != imaVar.n) {
            return false;
        }
        fm7 fm7Var = this.d;
        fm7 fm7Var2 = imaVar.d;
        if (fm7Var != null) {
            if (!fm7Var.equals(fm7Var2)) {
                return false;
            }
        } else if (fm7Var2 != null) {
            return false;
        }
        p9e p9eVar = this.h;
        p9e p9eVar2 = imaVar.h;
        return p9eVar != null ? p9eVar.equals(p9eVar2) : p9eVar2 == null;
    }

    public final void f(ByteBuffer byteBuffer) {
        synchronized (this.k) {
            this.k.add(byteBuffer);
        }
    }

    public final void g() {
        long j;
        synchronized (this.k) {
            try {
                j = 0;
                while (this.k.iterator().hasNext()) {
                    j += ((ByteBuffer) r1.next()).limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j <= this.n) {
            return;
        }
        synchronized (this.k) {
            this.k.clear();
        }
        this.c.g("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.n), Long.valueOf(j));
        throw new m5g(this.n);
    }

    public final int h(String str) {
        Iterator it = this.i.iterator();
        if (!it.hasNext()) {
            return 2;
        }
        p9e p9eVar = (p9e) it.next();
        ((jzm) p9eVar).getClass();
        this.h = p9eVar;
        this.c.i(p9eVar, "acceptHandshake - Matching protocol found: {}");
        return 1;
    }

    public final int hashCode() {
        int hashCode = this.d != null ? fm7.class.hashCode() : 0;
        int i = this.n;
        return (hashCode * 961) + (i ^ (i >>> 32));
    }

    public final ByteBuffer i() {
        ByteBuffer allocate;
        synchronized (this.k) {
            try {
                long j = 0;
                while (this.k.iterator().hasNext()) {
                    j += ((ByteBuffer) r1.next()).limit();
                }
                g();
                allocate = ByteBuffer.allocate((int) j);
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    allocate.put((ByteBuffer) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        allocate.flip();
        return allocate;
    }

    public final void j(tcv tcvVar, RuntimeException runtimeException) {
        this.c.h("Runtime exception during onWebsocketMessage", runtimeException);
        tcvVar.c.onWebsocketError(tcvVar, runtimeException);
    }

    public final void k(tcv tcvVar, svc svcVar) {
        int i;
        String str;
        dsj dsjVar = dsj.c;
        dsj dsjVar2 = dsj.b;
        dsj dsjVar3 = dsj.a;
        mi6 mi6Var = (mi6) svcVar;
        dsj dsjVar4 = mi6Var.b;
        if (dsjVar4 == dsj.f) {
            if (svcVar instanceof aq4) {
                aq4 aq4Var = (aq4) svcVar;
                i = aq4Var.i;
                str = aq4Var.j;
            } else {
                i = 1005;
                str = "";
            }
            if (tcvVar.e == gkn.c) {
                tcvVar.b(i, str, true);
                return;
            } else {
                tcvVar.a(i, str, true);
                return;
            }
        }
        if (dsjVar4 == dsj.d) {
            tcvVar.c.onWebsocketPing(tcvVar, svcVar);
            return;
        }
        if (dsjVar4 == dsj.e) {
            tcvVar.m = System.nanoTime();
            tcvVar.c.onWebsocketPong(tcvVar, svcVar);
            return;
        }
        boolean z = mi6Var.a;
        if (z && dsjVar4 != dsjVar3) {
            if (this.j != null) {
                this.c.d("Protocol error: Continuous frame sequence not completed.");
                throw new uxe(1002, "Continuous frame sequence not completed.");
            }
            if (dsjVar4 == dsjVar2) {
                try {
                    tcvVar.c.onWebsocketMessage(tcvVar, me4.b(svcVar.a()));
                    return;
                } catch (RuntimeException e) {
                    j(tcvVar, e);
                    return;
                }
            }
            if (dsjVar4 != dsjVar) {
                this.c.d("non control or continious frame expected");
                throw new uxe(1002, "non control or continious frame expected");
            }
            try {
                tcvVar.c.onWebsocketMessage(tcvVar, svcVar.a());
                return;
            } catch (RuntimeException e2) {
                j(tcvVar, e2);
                return;
            }
        }
        nsg nsgVar = this.c;
        svc svcVar2 = this.j;
        if (dsjVar4 != dsjVar3) {
            if (svcVar2 != null) {
                nsgVar.k("Protocol error: Previous continuous frame sequence not completed.");
                throw new uxe(1002, "Previous continuous frame sequence not completed.");
            }
            this.j = svcVar;
            f(svcVar.a());
            g();
        } else if (z) {
            if (svcVar2 == null) {
                nsgVar.k("Protocol error: Previous continuous frame sequence not completed.");
                throw new uxe(1002, "Continuous frame sequence was not started.");
            }
            f(svcVar.a());
            g();
            svc svcVar3 = this.j;
            dsj dsjVar5 = ((mi6) svcVar3).b;
            if (dsjVar5 == dsjVar2) {
                ((mi6) svcVar3).d(i());
                ((mi6) this.j).b();
                try {
                    tcvVar.c.onWebsocketMessage(tcvVar, me4.b(this.j.a()));
                } catch (RuntimeException e3) {
                    j(tcvVar, e3);
                }
            } else if (dsjVar5 == dsjVar) {
                ((mi6) svcVar3).d(i());
                ((mi6) this.j).b();
                try {
                    tcvVar.c.onWebsocketMessage(tcvVar, this.j.a());
                } catch (RuntimeException e4) {
                    j(tcvVar, e4);
                }
            }
            this.j = null;
            synchronized (this.k) {
                this.k.clear();
            }
        } else if (svcVar2 == null) {
            nsgVar.d("Protocol error: Continuous frame sequence was not started.");
            throw new uxe(1002, "Continuous frame sequence was not started.");
        }
        if (dsjVar4 == dsjVar2 && !me4.a(svcVar.a())) {
            nsgVar.d("Protocol error: Payload is not UTF8");
            throw new uxe(1007);
        }
        if (dsjVar4 != dsjVar3 || this.j == null) {
            return;
        }
        f(svcVar.a());
    }

    public final List l(ByteBuffer byteBuffer) {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.l == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.l.remaining();
                ByteBuffer byteBuffer2 = this.l;
                if (remaining2 > remaining) {
                    byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.EMPTY_LIST;
                }
                byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(m((ByteBuffer) this.l.duplicate().position(0)));
                this.l = null;
            } catch (jie e) {
                int i = e.a;
                if (i < 0) {
                    throw new uxe(1002, "Negative count");
                }
                ByteBuffer allocate = ByteBuffer.allocate(i);
                this.l.rewind();
                allocate.put(this.l);
                this.l = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m(byteBuffer));
            } catch (jie e2) {
                byteBuffer.reset();
                int i2 = e2.a;
                if (i2 < 0) {
                    throw new uxe(1002, "Negative count");
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                this.l = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public final mi6 m(ByteBuffer byteBuffer) {
        int i;
        dsj dsjVar;
        int i2;
        mi6 l03Var;
        if (byteBuffer == null) {
            e7o.e();
            return null;
        }
        int remaining = byteBuffer.remaining();
        o(remaining, 2);
        byte b = byteBuffer.get();
        boolean z = (b >> 8) != 0;
        boolean z2 = (b & 64) != 0;
        boolean z3 = (b & 32) != 0;
        boolean z4 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z5 = (b2 & Byte.MIN_VALUE) != 0;
        int i3 = (byte) (b2 & Byte.MAX_VALUE);
        byte b3 = (byte) (b & 15);
        dsj dsjVar2 = dsj.a;
        dsj dsjVar3 = dsj.f;
        dsj dsjVar4 = dsj.d;
        dsj dsjVar5 = dsj.e;
        if (b3 != 0) {
            if (b3 == 1) {
                dsjVar = dsj.b;
            } else if (b3 != 2) {
                switch (b3) {
                    case 8:
                        i = 2;
                        dsjVar = dsjVar3;
                        break;
                    case 9:
                        i = 2;
                        dsjVar = dsjVar4;
                        break;
                    case 10:
                        i = 2;
                        dsjVar = dsjVar5;
                        break;
                    default:
                        throw new vxe("Unknown opcode " + ((int) b3));
                }
            } else {
                dsjVar = dsj.c;
            }
            i = 2;
        } else {
            i = 2;
            dsjVar = dsjVar2;
        }
        nsg nsgVar = this.c;
        if (i3 >= 0 && i3 <= 125) {
            i2 = i;
        } else {
            if (dsjVar == dsjVar4 || dsjVar == dsjVar5 || dsjVar == dsjVar3) {
                nsgVar.k("Invalid frame: more than 125 octets");
                throw new vxe("more than 125 octets");
            }
            if (i3 == 126) {
                o(remaining, 4);
                byte[] bArr = new byte[3];
                bArr[1] = byteBuffer.get();
                bArr[i] = byteBuffer.get();
                i3 = new BigInteger(bArr).intValue();
                i2 = 4;
            } else {
                i2 = 10;
                o(remaining, 10);
                byte[] bArr2 = new byte[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    bArr2[i4] = byteBuffer.get();
                }
                long longValue = new BigInteger(bArr2).longValue();
                n(longValue);
                i3 = (int) longValue;
            }
        }
        n(i3);
        o(remaining, i2 + (z5 ? 4 : 0) + i3);
        if (i3 < 0) {
            throw new uxe(1002, "Negative count");
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        if (z5) {
            byte[] bArr3 = new byte[4];
            byteBuffer.get(bArr3);
            for (int i5 = 0; i5 < i3; i5++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr3[i5 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(allocate.limit() + byteBuffer.position());
        }
        int ordinal = dsjVar.ordinal();
        if (ordinal == 0) {
            l03Var = new l03(1);
        } else if (ordinal == 1) {
            l03Var = new l03(2);
        } else if (ordinal == i) {
            l03Var = new l03(0);
        } else if (ordinal == 3) {
            l03Var = new gsk();
        } else if (ordinal == 4) {
            l03Var = new ogm(dsjVar5, 0);
        } else {
            if (ordinal != 5) {
                xq0.x("Supplied opcode is invalid");
                return null;
            }
            l03Var = new aq4();
        }
        l03Var.a = z;
        l03Var.e = z2;
        l03Var.f = z3;
        l03Var.g = z4;
        allocate.flip();
        l03Var.d(allocate);
        dsj dsjVar6 = l03Var.b;
        fm7 fm7Var = this.e;
        if (dsjVar6 != dsjVar2) {
            if (l03Var.e || l03Var.f || l03Var.g) {
                this.g = this.d;
            } else {
                this.g = fm7Var;
            }
        }
        if (this.g == null) {
            this.g = fm7Var;
        }
        this.g.getClass();
        if (!l03Var.e && !l03Var.f && !l03Var.g) {
            this.g.getClass();
            if (nsgVar.f()) {
                nsgVar.g("afterDecoding({}): {}", Integer.valueOf(l03Var.a().remaining()), l03Var.a().remaining() > 1000 ? "too big to display" : new String(l03Var.a().array()));
            }
            l03Var.b();
            return l03Var;
        }
        throw new vxe("bad rsv RSV1: " + l03Var.e + " RSV2: " + l03Var.f + " RSV3: " + l03Var.g);
    }

    public final void n(long j) {
        nsg nsgVar = this.c;
        if (j > 2147483647L) {
            nsgVar.k("Limit exedeed: Payloadsize is to big...");
            throw new m5g("Payloadsize is to big...");
        }
        int i = this.n;
        if (j > i) {
            nsgVar.g("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new m5g("Payload limit reached.", i);
        }
        if (j >= 0) {
            return;
        }
        nsgVar.k("Limit underflow: Payloadsize is to little...");
        throw new m5g("Payloadsize is to little...");
    }

    public final void o(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.c.k("Incomplete frame: maxpacketsize < realpacketsize");
        throw new jie(i2);
    }

    @Override // defpackage.hma
    public final String toString() {
        String hmaVar = super.toString();
        if (this.d != null) {
            StringBuilder m = tlm.m(hmaVar, " extension: ");
            this.d.getClass();
            m.append(fm7.class.getSimpleName());
            hmaVar = m.toString();
        }
        p9e p9eVar = this.h;
        if (p9eVar != null) {
            ((jzm) p9eVar).getClass();
            hmaVar = hmaVar.concat(" protocol: ");
        }
        StringBuilder m2 = tlm.m(hmaVar, " max frame size: ");
        m2.append(this.n);
        return m2.toString();
    }
}
