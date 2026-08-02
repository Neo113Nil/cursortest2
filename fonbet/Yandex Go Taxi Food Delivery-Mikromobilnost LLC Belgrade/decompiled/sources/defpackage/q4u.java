package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q4u {
    public final Text a;
    public final ArrayList b;

    public q4u(Text text, ArrayList arrayList) {
        this.a = text;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4u)) {
            return false;
        }
        q4u q4uVar = (q4u) obj;
        return jl40.l(this.a, q4uVar.a) && this.b.equals(q4uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(title=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }
}
