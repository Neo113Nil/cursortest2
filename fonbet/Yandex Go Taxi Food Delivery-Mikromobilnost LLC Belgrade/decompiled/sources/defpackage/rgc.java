package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class rgc implements tgc {
    public static final qgc Companion = new qgc();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(9)), null};
    public final List a;
    public final ogc b;

    public /* synthetic */ rgc(int i, List list, ogc ogcVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, pgc.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = ogcVar;
    }

    public static final /* synthetic */ void d(rgc rgcVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.e(serialDescriptor, 0, (KSerializer) c[0].getValue(), rgcVar.a);
        yjdVar.e(serialDescriptor, 1, mgc.a, rgcVar.b);
    }

    public final ogc b() {
        return this.b;
    }

    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgc)) {
            return false;
        }
        rgc rgcVar = (rgc) obj;
        return jl40.l(this.a, rgcVar.a) && jl40.l(this.b, rgcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RadialGradient(colors=" + this.a + ", centralPoint=" + this.b + ')';
    }

    public rgc(ArrayList arrayList, ogc ogcVar) {
        this.a = arrayList;
        this.b = ogcVar;
    }
}
