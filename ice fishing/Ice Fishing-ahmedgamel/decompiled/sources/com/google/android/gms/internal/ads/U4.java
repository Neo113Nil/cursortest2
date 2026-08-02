package com.google.android.gms.internal.ads;

import java.io.IOException;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public class U4 extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f28682n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28683u;

    public U4(String str, RuntimeException runtimeException, boolean z6, int i) {
        super(str, runtimeException);
        this.f28682n = z6;
        this.f28683u = i;
    }

    public static U4 a(RuntimeException runtimeException, String str) {
        return new U4(str, runtimeException, true, 1);
    }

    public static U4 c(String str) {
        return new U4(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String concat = message != null ? message.concat(" ") : "";
        int length = concat.length();
        boolean z6 = this.f28682n;
        int length2 = String.valueOf(z6).length() + length + 20;
        int i = this.f28683u;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(concat);
        sb.append("{contentIsMalformed=");
        sb.append(z6);
        sb.append(", dataType=");
        return AbstractC5128c.e(i, "}", sb);
    }
}
