package defpackage;

import android.os.Bundle;
import com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragmentTabs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class scy0 extends s120 {
    public final g720 a;
    public final boolean b;
    public final TeleMessengerMainFragmentTabs c;

    public scy0(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        boolean z = bundle.getBoolean("invalidate_user", false);
        TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs = (TeleMessengerMainFragmentTabs) vng.u(bundle, TeleMessengerMainFragmentTabs.class, "current_screen");
        teleMessengerMainFragmentTabs = teleMessengerMainFragmentTabs == null ? TeleMessengerMainFragmentTabs.CALLS : teleMessengerMainFragmentTabs;
        this.a = b;
        this.b = z;
        this.c = teleMessengerMainFragmentTabs;
    }

    @Override // defpackage.s120
    public final String a() {
        return "Messaging.Arguments.Key.TeleMessengerMainFragment";
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scy0)) {
            return false;
        }
        scy0 scy0Var = (scy0) obj;
        return jl40.l(this.a, scy0Var.a) && this.b == scy0Var.b && this.c == scy0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TeleMessengerMainFragmentArguments(source=" + this.a + ", invalidateUser=" + this.b + ", targetScreen=" + this.c + Extension.C_BRAKE;
    }
}
