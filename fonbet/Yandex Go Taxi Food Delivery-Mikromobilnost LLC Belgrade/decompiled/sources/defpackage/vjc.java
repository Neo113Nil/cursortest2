package defpackage;

import com.ybsdk.core.navigation.cicerone.Screen;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vjc implements dlc {
    public final Screen a;

    public vjc(Screen screen) {
        this.a = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjc) && jl40.l(this.a, ((vjc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Forward(", this.a.getScreenKey(), Extension.C_BRAKE);
    }
}
