package defpackage;

import android.os.Handler;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bjo implements Closeable {
    public static final Charset g = StandardCharsets.UTF_8;
    public final atn a;
    public final osh b = new osh("ExoPlayer:RtspMessageChannel:ReceiverLoader");
    public final Map c = Collections.synchronizedMap(new HashMap());
    public zp4 d;
    public Socket e;
    public volatile boolean f;

    public bjo(atn atnVar) {
        this.a = atnVar;
    }

    public final void a(Socket socket) {
        this.e = socket;
        this.d = new zp4(this, socket.getOutputStream());
        this.b.X(new ajo(this, socket.getInputStream()), new dml(), 0);
    }

    public final void b(qsn qsnVar) {
        vq1.B(this.d);
        zp4 zp4Var = this.d;
        zp4Var.getClass();
        ((Handler) zp4Var.d).post(new zvh(zp4Var, new jpc(cjo.h, 2).e(qsnVar).getBytes(g), qsnVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            return;
        }
        try {
            zp4 zp4Var = this.d;
            if (zp4Var != null) {
                zp4Var.close();
            }
            this.b.P(null);
            Socket socket = this.e;
            if (socket != null) {
                socket.close();
            }
            this.f = true;
        } catch (Throwable th) {
            this.f = true;
            throw th;
        }
    }
}
