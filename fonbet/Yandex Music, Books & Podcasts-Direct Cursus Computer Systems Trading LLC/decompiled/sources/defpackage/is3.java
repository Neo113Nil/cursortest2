package defpackage;

import java.net.SocketAddress;

/* loaded from: classes5.dex */
public final class is3 implements to4 {
    public final goj a;

    public is3(goj gojVar, z7h z7hVar) {
        this.a = gojVar;
    }

    @Override // defpackage.to4
    public final u56 b0(SocketAddress socketAddress, so4 so4Var, nwe nweVar) {
        return new hs3(this, this.a.b0(socketAddress, so4Var, nweVar), so4Var.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
