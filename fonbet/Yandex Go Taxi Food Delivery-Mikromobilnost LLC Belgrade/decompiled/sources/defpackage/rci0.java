package defpackage;

import java.io.Closeable;

/* loaded from: classes10.dex */
public final class rci0 implements Closeable {
    public final wxj a;

    public rci0(wxj wxjVar) {
        this.a = wxjVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
