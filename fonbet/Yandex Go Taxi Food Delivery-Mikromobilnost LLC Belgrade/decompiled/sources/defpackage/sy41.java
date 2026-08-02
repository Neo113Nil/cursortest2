package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class sy41 {
    public final Screen a;

    public sy41(Screen screen) {
        this.a = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy41) && this.a == ((sy41) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Payload(originScreen=" + this.a + Extension.C_BRAKE;
    }
}
