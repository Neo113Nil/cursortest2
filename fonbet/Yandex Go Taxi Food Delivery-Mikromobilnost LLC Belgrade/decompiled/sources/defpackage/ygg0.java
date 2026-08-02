package defpackage;

import com.yandex.go.quark.api.router.QuarkDynamicFeatureRouter$Payload$DisplayMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ygg0 {
    public final QuarkDynamicFeatureRouter$Payload$DisplayMode a;

    public ygg0(QuarkDynamicFeatureRouter$Payload$DisplayMode quarkDynamicFeatureRouter$Payload$DisplayMode) {
        this.a = quarkDynamicFeatureRouter$Payload$DisplayMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygg0) && this.a == ((ygg0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QuarkApiParams(displayMode=" + this.a + Extension.C_BRAKE;
    }
}
