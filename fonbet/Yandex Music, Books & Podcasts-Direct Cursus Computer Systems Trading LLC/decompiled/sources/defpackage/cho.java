package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class cho extends RuntimeException {
    public final IOException a;
    public IOException b;

    public cho(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}
