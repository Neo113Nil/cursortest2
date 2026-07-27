package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public class AL extends NH {

    /* renamed from: u, reason: collision with root package name */
    public final int f23863u;

    public AL() {
        this.f23863u = 1;
    }

    public static AL a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i4 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC3035cL.f(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i4 == 2007 ? new C3522lL("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new AL(iOException, i4, i);
    }

    public AL(IOException iOException, int i, int i4) {
        super(i == 2000 ? i4 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i, iOException);
        this.f23863u = i4;
    }

    public AL(String str, int i, int i4) {
        super(str, i == 2000 ? i4 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f23863u = i4;
    }

    public AL(String str, IOException iOException, int i, int i4) {
        super(str, iOException, i == 2000 ? i4 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f23863u = i4;
    }
}
