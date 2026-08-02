package defpackage;

import com.yandex.messaging.ui.main.telemessenger.TeleMessengerMainFragmentTabs;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vcy0 {
    public final TeleMessengerMainFragmentTabs a;
    public final List b;

    public vcy0(TeleMessengerMainFragmentTabs teleMessengerMainFragmentTabs, List list) {
        this.a = teleMessengerMainFragmentTabs;
        this.b = list;
        Iterator it = list.iterator();
        while (it.hasNext() && ((ady0) it.next()).a() != this.a) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcy0)) {
            return false;
        }
        vcy0 vcy0Var = (vcy0) obj;
        return this.a == vcy0Var.a && this.b.equals(vcy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TeleMessengerNavBarState(currentTab=" + this.a + ", tabs=" + this.b + Extension.C_BRAKE;
    }
}
