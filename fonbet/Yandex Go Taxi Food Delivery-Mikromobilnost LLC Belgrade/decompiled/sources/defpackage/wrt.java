package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wrt {
    public final Text.Resource a;
    public final Text b;
    public final Text.Resource c;
    public final rbv d;

    public wrt(Text.Resource resource, Text text, Text.Resource resource2, nbv nbvVar) {
        this.a = resource;
        this.b = text;
        this.c = resource2;
        this.d = nbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrt)) {
            return false;
        }
        wrt wrtVar = (wrt) obj;
        return jl40.l(this.a, wrtVar.a) && jl40.l(this.b, wrtVar.b) && jl40.l(this.c, wrtVar.c) && jl40.l(this.d, wrtVar.d);
    }

    public final int hashCode() {
        int b = uw51.b(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31);
        rbv rbvVar = this.d;
        return b + (rbvVar == null ? 0 : rbvVar.hashCode());
    }

    public final String toString() {
        return "GoToSettingsDialog(title=" + this.a + ", description=" + this.b + ", settingsButtonText=" + this.c + ", image=" + this.d + Extension.C_BRAKE;
    }

    public /* synthetic */ wrt(Text.Resource resource, Text.Resource resource2, Text.Resource resource3) {
        this(resource, resource2, resource3, null);
    }
}
