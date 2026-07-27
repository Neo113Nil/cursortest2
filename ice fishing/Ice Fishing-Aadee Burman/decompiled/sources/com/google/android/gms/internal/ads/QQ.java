package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class QQ extends U4 {

    /* renamed from: v, reason: collision with root package name */
    public final RB f27031v;

    public QQ(String str, C3500lC c3500lC) {
        super(str, null, false, 1);
        this.f27031v = RB.n(c3500lC);
    }

    @Override // com.google.android.gms.internal.ads.U4, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        RB rb = this.f27031v;
        if (rb.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(rb);
        return D.y.s(new StringBuilder(length + 17 + valueOf.length()), message, "\nsniff failures: ", valueOf);
    }
}
