package defpackage;

import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ujc implements dlc {
    public final Screen a;
    public final List b;
    public final boolean c;

    public ujc(Screen screen, List list, boolean z) {
        this.a = screen;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujc)) {
            return false;
        }
        ujc ujcVar = (ujc) obj;
        return jl40.l(this.a, ujcVar.a) && jl40.l(this.b, ujcVar.b) && this.c == ujcVar.c;
    }

    public final int hashCode() {
        Screen screen = this.a;
        int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
        List list = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Screen screen = this.a;
        String screenKey = screen != null ? screen.getScreenKey() : null;
        List list = this.b;
        return unr0.p("BackTo(", screenKey, ", newRootChainScreens=", list != null ? a.X(list, null, null, null, new teb(25), 31) : null, Extension.C_BRAKE);
    }

    public /* synthetic */ ujc(FragmentScreen fragmentScreen, int i) {
        this(fragmentScreen, null, false);
    }
}
