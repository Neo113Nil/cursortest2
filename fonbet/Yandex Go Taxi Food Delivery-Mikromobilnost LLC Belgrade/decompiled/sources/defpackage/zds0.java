package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class zds0 extends bes0 {
    public final Text a;

    public zds0(Text text) {
        this.a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zds0) && jl40.l(this.a, ((zds0) obj).a);
    }

    public final int hashCode() {
        Text text = this.a;
        if (text == null) {
            return 0;
        }
        return text.hashCode();
    }

    public final String toString() {
        return "Error(message=" + this.a + Extension.C_BRAKE;
    }
}
