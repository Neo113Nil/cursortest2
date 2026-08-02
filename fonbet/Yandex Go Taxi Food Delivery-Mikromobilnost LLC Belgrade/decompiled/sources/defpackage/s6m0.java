package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s6m0 {
    public final Text.Resource a;

    public s6m0(Text.Resource resource) {
        this.a = resource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6m0) && this.a.equals(((s6m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FieldError(text=" + this.a + Extension.C_BRAKE;
    }
}
