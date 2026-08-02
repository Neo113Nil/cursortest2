package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zmq0 {
    public final nbv a;
    public final Text.Resource b;

    public zmq0(nbv nbvVar, Text.Resource resource) {
        this.a = nbvVar;
        this.b = resource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmq0)) {
            return false;
        }
        zmq0 zmq0Var = (zmq0) obj;
        return this.a.equals(zmq0Var.a) && this.b.equals(zmq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoItem(image=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }
}
