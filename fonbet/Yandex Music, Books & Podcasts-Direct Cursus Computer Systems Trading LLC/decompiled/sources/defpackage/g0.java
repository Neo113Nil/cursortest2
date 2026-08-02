package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class g0 extends IOException {
    public final IllegalArgumentException a;

    public g0(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.a = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
