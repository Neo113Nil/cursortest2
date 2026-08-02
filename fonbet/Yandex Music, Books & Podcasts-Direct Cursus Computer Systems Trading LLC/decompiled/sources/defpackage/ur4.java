package defpackage;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ur4 extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ur4(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r0.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder l = tlm.l(i, "Pos: ", ", limit: ");
        l.append(i2);
        l.append(", len: ");
        l.append(i3);
    }

    public ur4(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
