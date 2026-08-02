package defpackage;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class wv60 extends rvj0 {
    public final rvj0 a;
    public final jci0 b;
    public IOException c;

    public wv60(rvj0 rvj0Var) {
        this.a = rvj0Var;
        this.b = new jci0(new h06(this, rvj0Var.source()));
    }

    @Override // defpackage.rvj0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.rvj0
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // defpackage.rvj0
    public final wg10 contentType() {
        return this.a.contentType();
    }

    @Override // defpackage.rvj0
    public final qq6 source() {
        return this.b;
    }
}
