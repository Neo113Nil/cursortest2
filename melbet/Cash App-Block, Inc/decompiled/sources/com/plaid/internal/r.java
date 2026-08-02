package com.plaid.internal;

/* loaded from: classes5.dex */
public final class r extends Exception {
    public final EnumC0223l7 a;

    public r(EnumC0223l7 enumC0223l7, Throwable th) {
        super(th.getMessage(), th);
        this.a = enumC0223l7;
    }

    public final T0 a() {
        return getCause() instanceof C0260q ? ((C0260q) getCause()).a : T0.GENERIC_UNKNOWN_REASON;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "step=" + this.a + "; " + super.getMessage();
    }

    public r(EnumC0223l7 enumC0223l7) {
        super("device descriptor contains an error");
        this.a = enumC0223l7;
    }
}
