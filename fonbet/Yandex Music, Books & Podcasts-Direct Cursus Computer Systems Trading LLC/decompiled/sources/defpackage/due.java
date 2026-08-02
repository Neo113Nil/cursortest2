package defpackage;

import java.io.IOException;

/* loaded from: classes4.dex */
public class due extends ste {
    public final IOException a;

    public due(IOException iOException) {
        super(null);
        this.a = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
