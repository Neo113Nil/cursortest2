package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzdl extends IOException {
    public zzdl(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }

    public zzdl(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
