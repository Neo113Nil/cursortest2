package defpackage;

import java.net.SocketTimeoutException;

/* loaded from: classes4.dex */
public final class yte extends ste {
    public final SocketTimeoutException a;

    public yte(SocketTimeoutException socketTimeoutException) {
        super(null);
        this.a = socketTimeoutException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
