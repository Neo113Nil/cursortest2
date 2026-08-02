package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vnq {
    public final Text.Constant a;
    public final String b;

    public vnq(Text.Constant constant, String str) {
        this.a = constant;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final Text b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnq)) {
            return false;
        }
        vnq vnqVar = (vnq) obj;
        return this.a.equals(vnqVar.a) && jl40.l(this.b, vnqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FeeState(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
