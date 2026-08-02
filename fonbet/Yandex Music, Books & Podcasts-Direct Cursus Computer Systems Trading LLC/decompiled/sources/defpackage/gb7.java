package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class gb7 implements p33 {
    public static final yqr c = o5g.L(new eb7(0));
    public final wdi a;
    public final int b;

    public gb7(Context context) {
        wdi wdiVar = (wdi) c.get();
        vq1.B(wdiVar);
        new hl5(context);
        this.a = wdiVar;
        this.b = -1;
    }

    @Override // defpackage.p33
    public final lcg d(byte[] bArr) {
        return this.a.a(new fb7(0, this, bArr));
    }
}
