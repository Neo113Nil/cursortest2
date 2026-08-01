package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class U4 extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f27885n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27886u;

    public U4(String str, RuntimeException runtimeException, boolean z3, int i) {
        super(str, runtimeException);
        this.f27885n = z3;
        this.f27886u = i;
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
        boolean z3 = this.f27885n;
        int length2 = String.valueOf(z3).length() + length + 20;
        int i = this.f27886u;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(concat);
        sb.append("{contentIsMalformed=");
        sb.append(z3);
        sb.append(", dataType=");
        return u1.h.e(i, "}", sb);
    }
}
