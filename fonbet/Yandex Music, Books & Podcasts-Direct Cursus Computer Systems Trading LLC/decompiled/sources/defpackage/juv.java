package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class juv {
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;

    public juv(String str, String str2, List list, boolean z) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juv)) {
            return false;
        }
        juv juvVar = (juv) obj;
        return Intrinsics.d(this.a, juvVar.a) && Intrinsics.d(this.b, juvVar.b) && this.c == juvVar.c && Intrinsics.d(this.d, juvVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WizardEntryBlock(title=", this.a, ", subtitle=", this.b, ", needToPassWizard=");
        m.append(this.c);
        m.append(", artists=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
