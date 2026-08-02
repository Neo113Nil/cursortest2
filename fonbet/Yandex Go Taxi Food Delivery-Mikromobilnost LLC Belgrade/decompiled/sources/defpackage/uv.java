package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class uv implements wv {
    public static final tv Companion = new tv();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new du(10))};
    public final String a;
    public final Map b;

    public /* synthetic */ uv(int i, String str, Map map) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, sv.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
    }

    public static final /* synthetic */ void d(uv uvVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, uvVar.a);
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), uvVar.b);
    }

    public final Map b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv)) {
            return false;
        }
        uv uvVar = (uv) obj;
        return jl40.l(this.a, uvVar.a) && jl40.l(this.b, uvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSpecific(type=");
        sb.append(this.a);
        sb.append(", params=");
        return smw0.n(sb, this.b, ')');
    }

    public uv(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }
}
