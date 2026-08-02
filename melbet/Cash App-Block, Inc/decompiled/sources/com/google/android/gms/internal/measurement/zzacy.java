package com.google.android.gms.internal.measurement;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzacy extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzacy(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r3.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "Pos: ", ", limit: ");
        m1149m.append(j2);
        m1149m.append(", len: ");
        m1149m.append(i);
    }

    public zzacy(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
