package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
/* loaded from: classes2.dex */
public final class qv implements wv {
    public static final pv Companion = new pv();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new du(9))};
    public final String a;
    public final String b;
    public final Map c;

    public /* synthetic */ qv(int i, String str, String str2, Map map) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ov.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public static final /* synthetic */ void e(qv qvVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        yjdVar.o(serialDescriptor, 0, qvVar.a);
        yjdVar.o(serialDescriptor, 1, qvVar.b);
        yjdVar.e(serialDescriptor, 2, (KSerializer) d[2].getValue(), qvVar.c);
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        return jl40.l(this.a, qvVar.a) && jl40.l(this.b, qvVar.b) && jl40.l(this.c, qvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformAction(actionId=");
        sb.append(this.a);
        sb.append(", actionToken=");
        sb.append(this.b);
        sb.append(", actionMeta=");
        return smw0.n(sb, this.c, ')');
    }

    public qv(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }
}
