package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tn extends nr {
    public final String a;
    public final ArrayList b;
    public final List c;
    public final fsx d;

    public tn(String str, ArrayList arrayList, ArrayList arrayList2, fsx fsxVar) {
        this.a = str;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = fsxVar;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn)) {
            return false;
        }
        tn tnVar = (tn) obj;
        return jl40.l(this.a, tnVar.a) && this.b.equals(tnVar.b) && jl40.l(this.c, tnVar.c) && jl40.l(this.d, tnVar.d);
    }

    public final int hashCode() {
        int b = ly3.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        fsx fsxVar = this.d;
        return hashCode + (fsxVar != null ? fsxVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = x4e.m("ActionFeedback(title=", this.a, ", subtitles=", ", reasons=", this.b);
        m.append(this.c);
        m.append(", lastFeedback=");
        m.append(this.d);
        m.append(Extension.C_BRAKE);
        return m.toString();
    }
}
