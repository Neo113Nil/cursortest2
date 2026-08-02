package defpackage;

import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* loaded from: classes9.dex */
public final class wun implements iqv {
    public final boolean a;

    public wun(boolean z) {
        this.a = z;
    }

    @Override // defpackage.iqv
    public final de60 b() {
        return null;
    }

    @Override // defpackage.iqv
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        return b64.p(new StringBuilder("Empty{"), this.a ? CA20Status.STATUS_USER_DESCRIPTION_A : "New", '}');
    }
}
