package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.sL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3886sL extends NH {

    /* renamed from: u, reason: collision with root package name */
    public final int f33970u;

    public C3886sL() {
        this.f33970u = 1;
    }

    public static C3886sL a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i6 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC3043cl.f(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i6 == 2007 ? new C3133eL("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new C3886sL(iOException, i6, i);
    }

    public C3886sL(IOException iOException, int i, int i6) {
        super(i == 2000 ? i6 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i, iOException);
        this.f33970u = i6;
    }

    public C3886sL(String str, int i, int i6) {
        super(str, i == 2000 ? i6 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f33970u = i6;
    }

    public C3886sL(String str, IOException iOException, int i, int i6) {
        super(str, iOException, i == 2000 ? i6 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i);
        this.f33970u = i6;
    }
}
