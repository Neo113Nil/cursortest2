package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class qdo {
    public static final pdo Companion = new pdo();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new cao(3))};
    public final String a;
    public final png b;

    public /* synthetic */ qdo(int i, String str, png pngVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, odo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = pngVar;
    }

    public final png a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdo)) {
            return false;
        }
        qdo qdoVar = (qdo) obj;
        return jl40.l(this.a, qdoVar.a) && jl40.l(this.b, qdoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(directiveName=" + this.a + ", directiveData=" + this.b + Extension.C_BRAKE;
    }
}
