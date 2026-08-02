package defpackage;

import com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragmentTabs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ycy0 extends ady0 {
    public final TeleMessengerMainFragmentTabs a;
    public final int b;

    public ycy0(TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs, int i) {
        this.a = teleMessengerMainFragmentTabs;
        this.b = i;
    }

    @Override // defpackage.ady0
    public final TeleMessengerMainFragmentTabs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycy0)) {
            return false;
        }
        ycy0 ycy0Var = (ycy0) obj;
        return this.a == ycy0Var.a && this.b == ycy0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IconTab(type=" + this.a + ", badgeCount=" + this.b + Extension.C_BRAKE;
    }
}
