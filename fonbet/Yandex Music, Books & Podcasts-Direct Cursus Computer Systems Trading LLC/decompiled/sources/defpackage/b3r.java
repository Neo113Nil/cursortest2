package defpackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class b3r extends Thread {
    public static final Logger b = Logger.getLogger(b3r.class.getName());
    public final p2f a;

    public b3r(p2f p2fVar) {
        super(su4.o(new StringBuilder("SocketListener("), p2fVar.q, ")"));
        setDaemon(true);
        this.a = p2fVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z;
        InetAddress address;
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.a.L0() && !this.a.K0()) {
                datagramPacket.setLength(8972);
                this.a.b.receive(datagramPacket);
                if (this.a.L0() || this.a.K0()) {
                    break;
                }
                if (this.a.i.d.c.b == 6) {
                    break;
                }
                if (this.a.i.d.c.b == 7) {
                    break;
                }
                try {
                    InetAddress inetAddress = this.a.i.b;
                    if (inetAddress == null || (address = datagramPacket.getAddress()) == null) {
                        z = false;
                    } else {
                        z = (inetAddress.isLinkLocalAddress() || inetAddress.isMCLinkLocal()) && !address.isLinkLocalAddress();
                        if (address.isLoopbackAddress() && !inetAddress.isLoopbackAddress()) {
                            z = true;
                        }
                    }
                    if (!z) {
                        l67 l67Var = new l67(datagramPacket);
                        if ((l67Var.c & 15) == 0) {
                            Logger logger = b;
                            if (logger.isLoggable(Level.FINEST)) {
                                logger.finest(getName() + ".run() JmDNS in:" + l67Var.h());
                            }
                            if (l67Var.d()) {
                                int port = datagramPacket.getPort();
                                int i = i67.a;
                                if (port != i) {
                                    this.a.H0(l67Var, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                p2f p2fVar = this.a;
                                p2fVar.H0(l67Var, p2fVar.a, i);
                            } else {
                                this.a.J0(l67Var);
                            }
                        } else {
                            Logger logger2 = b;
                            if (logger2.isLoggable(Level.FINE)) {
                                logger2.fine(getName() + ".run() JmDNS in message with error code:" + l67Var.h());
                            }
                        }
                    }
                } catch (IOException e) {
                    b.log(Level.WARNING, getName() + ".run() exception ", (Throwable) e);
                }
            }
        } catch (IOException e2) {
            if (!this.a.L0() && !this.a.K0()) {
                if (!(this.a.i.d.c.b == 6)) {
                    if (!(this.a.i.d.c.b == 7)) {
                        b.log(Level.WARNING, getName() + ".run() exception ", (Throwable) e2);
                        this.a.O0();
                    }
                }
            }
        }
        Logger logger3 = b;
        if (logger3.isLoggable(Level.FINEST)) {
            logger3.finest(getName() + ".run() exiting.");
        }
    }
}
