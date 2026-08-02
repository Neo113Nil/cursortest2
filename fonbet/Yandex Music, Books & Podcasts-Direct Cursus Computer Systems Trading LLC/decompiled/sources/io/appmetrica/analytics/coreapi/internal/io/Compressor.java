package io.appmetrica.analytics.coreapi.internal.io;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface Compressor {
    byte[] compress(@NonNull byte[] bArr) throws IOException;

    byte[] uncompress(@NonNull byte[] bArr) throws IOException;
}
