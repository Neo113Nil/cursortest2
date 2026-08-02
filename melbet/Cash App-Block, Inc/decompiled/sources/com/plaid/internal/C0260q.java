package com.plaid.internal;

/* renamed from: com.plaid.internal.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0260q extends Exception {
    public final T0 a;

    public C0260q(T0 t0) {
        this.a = t0;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder("errorCode=");
        sb.append(this.a);
        if (super.getMessage() == null) {
            str = "";
        } else {
            str = "; " + super.getMessage();
        }
        sb.append(str);
        return sb.toString();
    }

    public C0260q(T0 t0, String str) {
        super(str);
        this.a = t0;
    }

    public C0260q(T0 t0, Exception exc) {
        super(exc);
        this.a = t0;
    }
}
