package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class vr4 extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public vr4(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
