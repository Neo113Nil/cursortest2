package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3096dR extends W4 {

    /* renamed from: v, reason: collision with root package name */
    public final UB f30060v;

    public C3096dR(String str, C3675oC c3675oC) {
        super(str, null, false, 1);
        this.f30060v = UB.n(c3675oC);
    }

    @Override // com.google.android.gms.internal.ads.W4, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        UB ub = this.f30060v;
        if (ub.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(ub);
        return D.y.o(new StringBuilder(length + 17 + valueOf.length()), message, "\nsniff failures: ", valueOf);
    }
}
