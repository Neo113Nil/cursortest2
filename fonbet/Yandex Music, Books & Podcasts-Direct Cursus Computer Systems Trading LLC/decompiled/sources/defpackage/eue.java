package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class eue extends zte {
    public final IOException a;

    public eue(IOException iOException) {
        super(null);
        this.a = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
