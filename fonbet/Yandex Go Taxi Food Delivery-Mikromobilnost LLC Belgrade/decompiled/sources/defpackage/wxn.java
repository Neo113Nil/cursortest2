package defpackage;

import com.yandex.xplat.payment.sdk.AvailableMethods;

/* loaded from: classes2.dex */
public final class wxn implements y9a0 {
    public final boolean a;

    public wxn(boolean z) {
        this.a = z;
    }

    @Override // defpackage.y9a0
    public final md51 a(AvailableMethods availableMethods) {
        ra4 builder = availableMethods.builder();
        builder.f = this.a;
        return zmx.d(builder.a());
    }
}
