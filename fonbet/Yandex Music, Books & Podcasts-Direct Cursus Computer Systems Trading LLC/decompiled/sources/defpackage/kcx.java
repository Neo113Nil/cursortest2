package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class kcx extends IOException {
    public kcx(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
