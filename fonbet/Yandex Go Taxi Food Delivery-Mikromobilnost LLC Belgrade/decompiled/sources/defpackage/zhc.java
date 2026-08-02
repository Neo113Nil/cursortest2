package defpackage;

import com.ybsdk.core.common.data.network.dto.Themes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zhc {
    public final String a;
    public final Themes b;

    public zhc(String str, Themes themes) {
        this.a = str;
        this.b = themes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhc)) {
            return false;
        }
        zhc zhcVar = (zhc) obj;
        return jl40.l(this.a, zhcVar.a) && jl40.l(this.b, zhcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ColoredTextEntity(text=" + this.a + ", themedColor=" + this.b + Extension.C_BRAKE;
    }
}
