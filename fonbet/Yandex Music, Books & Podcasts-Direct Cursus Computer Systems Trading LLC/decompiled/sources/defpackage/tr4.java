package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class tr4 extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public tr4(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }

    public tr4(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
