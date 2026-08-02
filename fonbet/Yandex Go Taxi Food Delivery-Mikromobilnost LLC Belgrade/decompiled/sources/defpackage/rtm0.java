package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rtm0 implements ttm0 {
    public final wtm0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof rtm0) {
            return this.a.equals(((rtm0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectRenewItem(settingsElement=" + this.a + Extension.C_BRAKE;
    }
}
