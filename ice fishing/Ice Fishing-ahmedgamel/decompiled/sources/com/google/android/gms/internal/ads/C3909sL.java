package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.sL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3909sL extends NH {

    /* renamed from: u, reason: collision with root package name */
    public final int f34738u;

    public C3909sL() {
        this.f34738u = 1;
    }

    public static C3909sL a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i4 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC3066cl.f(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i4 == 2007 ? new C3156eL("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new C3909sL(iOException, i4, i);
    }

    public C3909sL(IOException iOException, int i, int i4) {
        super(i == 2000 ? i4 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i, iOException);
        this.f34738u = i4;
    }

    public C3909sL(String str, int i, int i4) {
        super(str, i == 2000 ? i4 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f34738u = i4;
    }

    public C3909sL(String str, IOException iOException, int i, int i4) {
        super(str, iOException, i == 2000 ? i4 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f34738u = i4;
    }
}
