package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class TQ extends U4 {

    /* renamed from: v, reason: collision with root package name */
    public final RB f28526v;

    public TQ(String str, C3523lC c3523lC) {
        super(str, null, false, 1);
        this.f28526v = RB.n(c3523lC);
    }

    @Override // com.google.android.gms.internal.ads.U4, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        RB rb = this.f28526v;
        if (rb.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(rb);
        return D.x.p(new StringBuilder(length + 17 + valueOf.length()), message, "\nsniff failures: ", valueOf);
    }
}
