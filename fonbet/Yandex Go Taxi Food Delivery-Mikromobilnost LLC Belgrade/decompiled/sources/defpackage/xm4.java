package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class xm4 extends zm4 {
    public final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xm4(int i) {
        super(r1);
        int i2 = oyh0.badge_guests_chat;
        this.f = i2;
    }

    @Override // defpackage.wm4
    public final int d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm4) && this.f == ((xm4) obj).f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f);
    }

    public final String toString() {
        return oyr.j(this.f, "ChatGuestBadge(badgeText=", Extension.C_BRAKE);
    }

    public xm4() {
        this(0);
    }
}
