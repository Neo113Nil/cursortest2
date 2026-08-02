package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class t9 extends pcv {
    private ScheduledFuture<?> connectionLostCheckerFuture;
    private ScheduledExecutorService connectionLostCheckerService;
    private boolean reuseAddr;
    private boolean tcpNoDelay;
    private final nsg log = rsg.b(t9.class);
    private long connectionLostTimeout = 60000000000L;
    private boolean websocketRunning = false;
    private final Object syncConnectionLost = new Object();

    public static void access$200(t9 t9Var, ocv ocvVar, long j) {
        t9Var.getClass();
        if (ocvVar instanceof tcv) {
            tcv tcvVar = (tcv) ocvVar;
            if (tcvVar.m < j) {
                t9Var.log.i(tcvVar, "Closing connection due to no pong received: {}");
                tcvVar.b(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", false);
            } else {
                if (!tcvVar.g()) {
                    t9Var.log.i(tcvVar, "Trying to ping a non open connection: {}");
                    return;
                }
                gsk onPreparePing = tcvVar.c.onPreparePing(tcvVar);
                if (onPreparePing != null) {
                    tcvVar.sendFrame(onPreparePing);
                } else {
                    jj4.j("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
                }
            }
        }
    }

    public final void a() {
        ScheduledExecutorService scheduledExecutorService = this.connectionLostCheckerService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.connectionLostCheckerService = null;
        }
        ScheduledFuture<?> scheduledFuture = this.connectionLostCheckerFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.connectionLostCheckerFuture = null;
        }
    }

    public final void b() {
        a();
        this.connectionLostCheckerService = Executors.newSingleThreadScheduledExecutor(new rwi(0));
        x8x x8xVar = new x8x(this);
        ScheduledExecutorService scheduledExecutorService = this.connectionLostCheckerService;
        long j = this.connectionLostTimeout;
        this.connectionLostCheckerFuture = scheduledExecutorService.scheduleAtFixedRate(x8xVar, j, j, TimeUnit.NANOSECONDS);
    }

    public int getConnectionLostTimeout() {
        int i;
        synchronized (this.syncConnectionLost) {
            i = (int) (this.connectionLostTimeout / 1000000000);
        }
        return i;
    }

    public abstract Collection getConnections();

    public boolean isReuseAddr() {
        return this.reuseAddr;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public void setConnectionLostTimeout(int i) {
        synchronized (this.syncConnectionLost) {
            try {
                long nanos = TimeUnit.SECONDS.toNanos(i);
                this.connectionLostTimeout = nanos;
                if (nanos <= 0) {
                    this.log.k("Connection lost timer stopped");
                    a();
                    return;
                }
                if (this.websocketRunning) {
                    this.log.k("Connection lost timer restarted");
                    try {
                        Iterator it = new ArrayList(getConnections()).iterator();
                        while (it.hasNext()) {
                            ocv ocvVar = (ocv) it.next();
                            if (ocvVar instanceof tcv) {
                                ((tcv) ocvVar).m = System.nanoTime();
                            }
                        }
                    } catch (Exception e) {
                        this.log.h("Exception during connection lost restart", e);
                    }
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setReuseAddr(boolean z) {
        this.reuseAddr = z;
    }

    public void setTcpNoDelay(boolean z) {
        this.tcpNoDelay = z;
    }

    public void startConnectionLostTimer() {
        synchronized (this.syncConnectionLost) {
            try {
                long j = this.connectionLostTimeout;
                nsg nsgVar = this.log;
                if (j <= 0) {
                    nsgVar.k("Connection lost timer deactivated");
                    return;
                }
                nsgVar.k("Connection lost timer started");
                this.websocketRunning = true;
                b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopConnectionLostTimer() {
        synchronized (this.syncConnectionLost) {
            try {
                if (this.connectionLostCheckerService == null) {
                    if (this.connectionLostCheckerFuture != null) {
                    }
                }
                this.websocketRunning = false;
                this.log.k("Connection lost timer stopped");
                a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
