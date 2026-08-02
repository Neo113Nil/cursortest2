package com.google.crypto.tink.shaded.protobuf;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class CodedOutputStream$OutOfSpaceException extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CodedOutputStream$OutOfSpaceException(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r0.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(i, "Pos: ", ", limit: ");
        m1149m.append(i2);
        m1149m.append(", len: ");
        m1149m.append(i3);
    }

    public CodedOutputStream$OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
