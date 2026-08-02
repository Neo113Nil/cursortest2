package defpackage;

import com.ybsdk.core.stories.StoriesComponentView;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wmu0 {
    public final String a;
    public final int b;
    public final StoriesComponentView.a c;
    public final List d;
    public final boolean e;

    public wmu0(String str, int i, StoriesComponentView.a aVar, List list, boolean z) {
        this.a = str;
        this.b = i;
        this.c = aVar;
        this.d = list;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmu0)) {
            return false;
        }
        wmu0 wmu0Var = (wmu0) obj;
        return jl40.l(this.a, wmu0Var.a) && this.b == wmu0Var.b && this.c.equals(wmu0Var.c) && jl40.l(this.d, wmu0Var.d) && this.e == wmu0Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        List list = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "State(id=", this.a, ", pageIndex=", ", stories=");
        u.append(this.c);
        u.append(", gradientBackground=");
        u.append(this.d);
        u.append(", isFocused=");
        return x4e.i(u, this.e, Extension.C_BRAKE);
    }
}
