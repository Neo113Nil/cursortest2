package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class tcv implements ocv {
    public final LinkedBlockingQueue b;
    public final qcv c;
    public final ima f;
    public final int g;
    public Object o;
    public final nsg a = rsg.b(tcv.class);
    public boolean d = false;
    public volatile gkn e = gkn.a;
    public ByteBuffer h = ByteBuffer.allocate(0);
    public isd i = null;
    public String j = null;
    public Integer k = null;
    public Boolean l = null;
    public long m = System.nanoTime();
    public final Object n = new Object();

    public tcv(qcv qcvVar, hma hmaVar) {
        this.f = null;
        if (hmaVar == null && this.g == 2) {
            xq0.x("parameters must not be null");
            throw null;
        }
        this.b = new LinkedBlockingQueue();
        new LinkedBlockingQueue();
        this.c = qcvVar;
        this.g = 1;
        if (hmaVar != null) {
            ima imaVar = (ima) hmaVar;
            ArrayList arrayList = new ArrayList();
            Iterator it = imaVar.f.iterator();
            while (it.hasNext()) {
                ((fm7) it.next()).getClass();
                arrayList.add(new fm7());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = imaVar.i.iterator();
            while (it2.hasNext()) {
                ((jzm) ((p9e) it2.next())).getClass();
                arrayList2.add(new jzm());
            }
            this.f = new ima(imaVar.n, arrayList, arrayList2);
        }
    }

    public final synchronized void a(int i, String str, boolean z) {
        gkn gknVar = this.e;
        gkn gknVar2 = gkn.c;
        if (gknVar == gknVar2 || this.e == gkn.d) {
            return;
        }
        if (this.e == gkn.b) {
            if (i == 1006) {
                this.e = gknVar2;
                f(i, str, false);
                return;
            }
            this.f.getClass();
            if (!z) {
                try {
                    try {
                        this.c.onWebsocketCloseInitiated(this, i, str);
                    } catch (RuntimeException e) {
                        this.c.onWebsocketError(this, e);
                    }
                } catch (uxe e2) {
                    this.a.h("generated frame is invalid", e2);
                    this.c.onWebsocketError(this, e2);
                    f(1006, "generated frame is invalid", false);
                }
            }
            if (g()) {
                aq4 aq4Var = new aq4();
                aq4Var.j = str == null ? "" : str;
                aq4Var.e();
                aq4Var.i = i;
                if (i == 1015) {
                    aq4Var.i = 1005;
                    aq4Var.j = "";
                }
                aq4Var.e();
                aq4Var.b();
                sendFrame(aq4Var);
            }
            f(i, str, z);
        } else if (i == -3) {
            f(-3, str, true);
        } else if (i == 1002) {
            f(i, str, z);
        } else {
            f(-1, str, false);
        }
        this.e = gkn.c;
        this.h = null;
    }

    public final synchronized void b(int i, String str, boolean z) {
        if (this.e == gkn.d) {
            return;
        }
        if (this.e == gkn.b && i == 1006) {
            this.e = gkn.c;
        }
        try {
            this.c.onWebsocketClose(this, i, str, z);
        } catch (RuntimeException e) {
            this.c.onWebsocketError(this, e);
        }
        ima imaVar = this.f;
        if (imaVar != null) {
            imaVar.b();
        }
        this.i = null;
        this.e = gkn.d;
    }

    public final void c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.a.f()) {
            this.a.g("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        }
        if (this.e != gkn.a) {
            if (this.e == gkn.b) {
                d(byteBuffer);
                return;
            }
            return;
        }
        qcv qcvVar = this.c;
        nsg nsgVar = this.a;
        if (this.h.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.h.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + this.h.capacity());
                this.h.flip();
                allocate.put(this.h);
                this.h = allocate;
            }
            this.h.put(byteBuffer);
            this.h.flip();
            byteBuffer2 = this.h;
        }
        byteBuffer2.mark();
        try {
            try {
                int i = this.g;
                if (i == 2) {
                    this.f.getClass();
                    lci c = this.f.c(byteBuffer2);
                    if (!(c instanceof eo4)) {
                        nsgVar.k("Closing due to protocol error: wrong http function");
                        f(1002, "wrong http function", false);
                        return;
                    }
                    eo4 eo4Var = (eo4) c;
                    if (this.f.e(eo4Var) != 1) {
                        nsgVar.k("Closing due to protocol error: the handshake did finally not match");
                        a(1002, "the handshake did finally not match", false);
                        return;
                    }
                    h(eo4Var);
                } else {
                    if (i != 1) {
                        return;
                    }
                    ima imaVar = this.f;
                    imaVar.a = i;
                    lci c2 = imaVar.c(byteBuffer2);
                    if (!(c2 instanceof cjp)) {
                        nsgVar.k("Closing due to protocol error: wrong http function");
                        f(1002, "wrong http function", false);
                        return;
                    }
                    cjp cjpVar = (cjp) c2;
                    if (this.f.d(this.i, cjpVar) != 1) {
                        nsgVar.i(this.f, "Closing due to protocol error: draft {} refuses handshake");
                        a(1002, "draft " + this.f + " refuses handshake", false);
                        return;
                    }
                    try {
                        qcvVar.onWebsocketHandshakeReceivedAsClient(this, this.i, cjpVar);
                        h(cjpVar);
                    } catch (RuntimeException e) {
                        nsgVar.h("Closing since client was never connected", e);
                        qcvVar.onWebsocketError(this, e);
                        f(-1, e.getMessage(), false);
                        return;
                    } catch (uxe e2) {
                        nsgVar.a("Closing due to invalid data exception. Possible handshake rejection", e2);
                        f(e2.a, e2.getMessage(), false);
                        return;
                    }
                }
                if (this.e == gkn.c || this.e == gkn.d) {
                    return;
                }
                if (byteBuffer.hasRemaining()) {
                    d(byteBuffer);
                } else if (this.h.hasRemaining()) {
                    d(this.h);
                }
            } catch (wxe e3) {
                nsgVar.a("Closing due to invalid handshake", e3);
                a(e3.a, e3.getMessage(), false);
            }
        } catch (kie e4) {
            if (this.h.capacity() != 0) {
                ByteBuffer byteBuffer3 = this.h;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.h;
                byteBuffer4.limit(byteBuffer4.capacity());
                return;
            }
            byteBuffer2.reset();
            int i2 = e4.a;
            if (i2 == 0) {
                i2 = byteBuffer2.capacity() + 16;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
            this.h = allocate2;
            allocate2.put(byteBuffer);
        }
    }

    public final void d(ByteBuffer byteBuffer) {
        qcv qcvVar = this.c;
        nsg nsgVar = this.a;
        try {
            for (svc svcVar : this.f.l(byteBuffer)) {
                nsgVar.i(svcVar, "matched frame: {}");
                this.f.k(this, svcVar);
            }
        } catch (LinkageError e) {
            e = e;
            nsgVar.d("Got fatal error during frame processing");
            throw e;
        } catch (ThreadDeath e2) {
            e = e2;
            nsgVar.d("Got fatal error during frame processing");
            throw e;
        } catch (VirtualMachineError e3) {
            e = e3;
            nsgVar.d("Got fatal error during frame processing");
            throw e;
        } catch (Error e4) {
            nsgVar.d("Closing web socket due to an error during frame processing");
            qcvVar.onWebsocketError(this, new Exception(e4));
            a(1011, "Got error ".concat(e4.getClass().getName()), false);
        } catch (m5g e5) {
            if (e5.b == Integer.MAX_VALUE) {
                nsgVar.h("Closing due to invalid size of frame", e5);
                qcvVar.onWebsocketError(this, e5);
            }
            a(e5.a, e5.getMessage(), false);
        } catch (uxe e6) {
            nsgVar.h("Closing due to invalid data in frame", e6);
            qcvVar.onWebsocketError(this, e6);
            a(e6.a, e6.getMessage(), false);
        }
    }

    public final void e() {
        if (this.e == gkn.a) {
            b(-1, "", true);
        } else {
            if (this.d) {
                b(this.k.intValue(), this.j, this.l.booleanValue());
                return;
            }
            this.f.getClass();
            this.f.getClass();
            b(1006, "", true);
        }
    }

    public final synchronized void f(int i, String str, boolean z) {
        if (this.d) {
            return;
        }
        this.k = Integer.valueOf(i);
        this.j = str;
        this.l = Boolean.valueOf(z);
        this.d = true;
        this.c.onWriteDemand(this);
        try {
            this.c.onWebsocketClosing(this, i, str, z);
        } catch (RuntimeException e) {
            this.a.h("Exception in onWebsocketClosing", e);
            this.c.onWebsocketError(this, e);
        }
        ima imaVar = this.f;
        if (imaVar != null) {
            imaVar.b();
        }
        this.i = null;
    }

    public final boolean g() {
        return this.e == gkn.b;
    }

    public final void h(ksd ksdVar) {
        this.a.i(this.f, "open using draft: {}");
        this.e = gkn.b;
        this.m = System.nanoTime();
        try {
            this.c.onWebsocketOpen(this, ksdVar);
        } catch (RuntimeException e) {
            this.c.onWebsocketError(this, e);
        }
    }

    public final void i(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            xq0.x("Cannot send 'null' data to a WebSocketImpl.");
            return;
        }
        boolean z = this.g == 1;
        this.f.getClass();
        l03 l03Var = new l03(0);
        l03Var.c = byteBuffer;
        l03Var.d = z;
        j(Collections.singletonList(l03Var));
    }

    public final void j(Collection collection) {
        byte b;
        if (!g()) {
            throw new rgv();
        }
        if (collection == null) {
            e7o.e();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            svc svcVar = (svc) it.next();
            this.a.i(svcVar, "send frame: {}");
            ima imaVar = this.f;
            imaVar.d.getClass();
            nsg nsgVar = imaVar.c;
            if (nsgVar.f()) {
                nsgVar.g("afterEnconding({}): {}", Integer.valueOf(svcVar.a().remaining()), svcVar.a().remaining() > 1000 ? "too big to display" : new String(svcVar.a().array()));
            }
            ByteBuffer a = svcVar.a();
            boolean z = imaVar.a == 1;
            int i = a.remaining() <= 125 ? 1 : a.remaining() <= 65535 ? 2 : 8;
            ByteBuffer allocate = ByteBuffer.allocate(a.remaining() + (i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0));
            mi6 mi6Var = (mi6) svcVar;
            dsj dsjVar = mi6Var.b;
            if (dsjVar == dsj.a) {
                b = 0;
            } else if (dsjVar == dsj.b) {
                b = 1;
            } else if (dsjVar == dsj.c) {
                b = 2;
            } else if (dsjVar == dsj.f) {
                b = 8;
            } else if (dsjVar == dsj.d) {
                b = 9;
            } else {
                if (dsjVar != dsj.e) {
                    tiu.h(dsjVar, "Don't know how to handle ");
                    return;
                }
                b = 10;
            }
            byte b2 = (byte) (b | ((byte) (mi6Var.a ? -128 : 0)));
            if (mi6Var.e) {
                b2 = (byte) (b2 | 64);
            }
            if (mi6Var.f) {
                b2 = (byte) (b2 | 32);
            }
            if (mi6Var.g) {
                b2 = (byte) (b2 | 16);
            }
            allocate.put(b2);
            long remaining = a.remaining();
            byte[] bArr = new byte[i];
            int i2 = (i * 8) - 8;
            int i3 = 0;
            while (i3 < i) {
                bArr[i3] = (byte) (r20 >>> (i2 - (i3 * 8)));
                i3++;
                remaining = remaining;
            }
            if (i == 1) {
                allocate.put((byte) (bArr[0] | (z ? Byte.MIN_VALUE : (byte) 0)));
            } else if (i == 2) {
                allocate.put((byte) ((z ? Byte.MIN_VALUE : (byte) 0) | 126));
                allocate.put(bArr);
            } else if (i != 8) {
                xq0.q("Size representation not supported/specified");
                return;
            } else {
                allocate.put((byte) ((z ? Byte.MIN_VALUE : (byte) 0) | Byte.MAX_VALUE));
                allocate.put(bArr);
            }
            if (z) {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(imaVar.m.nextInt());
                allocate.put(allocate2.array());
                int i4 = 0;
                while (a.hasRemaining()) {
                    allocate.put((byte) (a.get() ^ allocate2.get(i4 % 4)));
                    i4++;
                }
            } else {
                allocate.put(a);
                a.flip();
            }
            allocate.flip();
            arrayList.add(allocate);
        }
        k(arrayList);
    }

    public final void k(List list) {
        synchronized (this.n) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    this.a.g("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
                    this.b.add(byteBuffer);
                    this.c.onWriteDemand(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ocv
    public final void sendFrame(svc svcVar) {
        j(Collections.singletonList(svcVar));
    }
}
