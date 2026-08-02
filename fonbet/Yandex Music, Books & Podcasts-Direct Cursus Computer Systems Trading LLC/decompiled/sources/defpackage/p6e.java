package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p6e extends IOException {
    private static final long serialVersionUID = 1;

    public p6e(String str, int i, IOException iOException) {
        super(str + ", status code: " + i, iOException);
    }
}
