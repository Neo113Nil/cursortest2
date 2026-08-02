package com.bumptech.glide.load;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class HttpException extends IOException {
    public HttpException(int i, IOException iOException, String str) {
        super(Boxes$$ExternalSyntheticOutline1.m(i, str, ", status code: "), iOException);
    }
}
