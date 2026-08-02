package defpackage;

import com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragmentTabs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class zcy0 extends ady0 {
    public final TeleMessengerMainFragmentTabs a;
    public final String b;
    public final gu21 c;

    public zcy0(TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs, String str, gu21 gu21Var) {
        this.a = teleMessengerMainFragmentTabs;
        this.b = str;
        this.c = gu21Var;
    }

    @Override // defpackage.ady0
    public final TeleMessengerMainFragmentTabs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcy0)) {
            return false;
        }
        zcy0 zcy0Var = (zcy0) obj;
        return this.a == zcy0Var.a && this.b.equals(zcy0Var.b) && jl40.l(this.c, zcy0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        gu21 gu21Var = this.c;
        return b + (gu21Var == null ? 0 : gu21Var.hashCode());
    }

    public final String toString() {
        return "ProfileTab(type=" + this.a + ", avatarUrl=" + this.b + ", status=" + this.c + Extension.C_BRAKE;
    }
}
