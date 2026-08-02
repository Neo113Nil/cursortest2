package defpackage;

import java.io.DataOutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class s67 extends w67 {
    public static final Logger o = Logger.getLogger(s67.class.getName());
    public final InetAddress m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s67(String str, y67 y67Var, x67 x67Var, boolean z, int i, byte[] bArr, int i2) {
        super(str, y67Var, x67Var, z, i);
        this.n = i2;
        try {
            this.m = InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e) {
            o.log(Level.WARNING, "Address() exception ", (Throwable) e);
        }
    }

    @Override // defpackage.j67
    public final void m(DataOutputStream dataOutputStream) {
        super.m(dataOutputStream);
        for (byte b : this.m.getAddress()) {
            dataOutputStream.writeByte(b);
        }
    }

    @Override // defpackage.w67, defpackage.j67
    public final void o(StringBuilder sb) {
        super.o(sb);
        StringBuilder sb2 = new StringBuilder(" address: '");
        InetAddress inetAddress = this.m;
        sb2.append(inetAddress != null ? inetAddress.getHostAddress() : "null");
        sb2.append("'");
        sb.append(sb2.toString());
    }

    @Override // defpackage.w67
    public final dkp p(p2f p2fVar) {
        a q = q(false);
        q.q.a = p2fVar;
        return new dkp(p2fVar, q.i(), q.e(), q);
    }

    @Override // defpackage.w67
    public final a q(boolean z) {
        switch (this.n) {
            case 0:
                a aVar = new a(Collections.unmodifiableMap(this.g), 0, 0, 0, z, null);
                aVar.m.add((Inet4Address) this.m);
                return aVar;
            default:
                a aVar2 = new a(Collections.unmodifiableMap(this.g), 0, 0, 0, z, null);
                aVar2.n.add((Inet6Address) this.m);
                return aVar2;
        }
    }

    @Override // defpackage.w67
    public final boolean r(p2f p2fVar) {
        s67 c;
        Logger logger = o;
        a4e a4eVar = p2fVar.i;
        boolean z = false;
        if (a4eVar.b(this) && (c = a4eVar.c(e(), this.f)) != null) {
            int a = a(c);
            if (a == 0) {
                logger.finer("handleQuery() Ignoring an identical address query");
                return false;
            }
            logger.finer("handleQuery() Conflicting query detected.");
            z = true;
            if (p2fVar.i.d.c.b == 1 && a > 0) {
                a4eVar.e();
                p2fVar.f.clear();
                Iterator it = p2fVar.g.values().iterator();
                while (it.hasNext()) {
                    ((a) ((fkp) it.next())).q.d();
                }
            }
            p2fVar.i.d.d();
        }
        return z;
    }

    @Override // defpackage.w67
    public final boolean s(p2f p2fVar) {
        if (!p2fVar.i.b(this)) {
            return false;
        }
        o.finer("handleResponse() Denial detected");
        if (p2fVar.i.d.c.b == 1) {
            p2fVar.i.e();
            p2fVar.f.clear();
            Iterator it = p2fVar.g.values().iterator();
            while (it.hasNext()) {
                ((a) ((fkp) it.next())).q.d();
            }
        }
        p2fVar.i.d.d();
        return true;
    }

    @Override // defpackage.w67
    public final boolean t() {
        return false;
    }

    @Override // defpackage.w67
    public final boolean u(w67 w67Var) {
        if (!(w67Var instanceof s67)) {
            return false;
        }
        InetAddress inetAddress = ((s67) w67Var).m;
        InetAddress inetAddress2 = this.m;
        if (inetAddress2 != null || inetAddress == null) {
            return inetAddress2.equals(inetAddress);
        }
        return false;
    }

    @Override // defpackage.w67
    public final void v(n67 n67Var) {
        switch (this.n) {
            case 0:
                InetAddress inetAddress = this.m;
                if (inetAddress != null) {
                    byte[] address = inetAddress.getAddress();
                    if (!(inetAddress instanceof Inet4Address)) {
                        byte[] bArr = new byte[4];
                        System.arraycopy(address, 12, bArr, 0, 4);
                        address = bArr;
                    }
                    n67Var.b(address.length, address);
                    break;
                }
                break;
            default:
                InetAddress inetAddress2 = this.m;
                if (inetAddress2 != null) {
                    byte[] address2 = inetAddress2.getAddress();
                    if (inetAddress2 instanceof Inet4Address) {
                        byte[] bArr2 = new byte[16];
                        for (int i = 0; i < 16; i++) {
                            if (i < 11) {
                                bArr2[i] = address2[i - 12];
                            } else {
                                bArr2[i] = 0;
                            }
                        }
                        address2 = bArr2;
                    }
                    n67Var.b(address2.length, address2);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s67(String str, y67 y67Var, boolean z, int i, InetAddress inetAddress, int i2) {
        super(str, y67Var, x67.CLASS_IN, z, i);
        this.n = i2;
        this.m = inetAddress;
    }
}
