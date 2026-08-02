package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ghb extends jhb {
    public final gns d;
    public final jhb e;
    public final String f;
    public final List g;
    public final List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghb(gns gnsVar, jhb jhbVar, String str) {
        super(str);
        jhbVar.getClass();
        str.getClass();
        this.d = gnsVar;
        this.e = jhbVar;
        this.f = str;
        this.g = jhbVar.c();
        this.h = jhbVar.b();
    }

    @Override // defpackage.jhb
    public final Object a(h4b h4bVar) {
        jhb jhbVar = this.e;
        Object h = h4bVar.h(jhbVar);
        d(jhbVar.b);
        gns gnsVar = this.d;
        if (gnsVar instanceof ens) {
            if (h instanceof Long) {
                return Long.valueOf(((Number) h).longValue());
            }
            if (h instanceof Double) {
                return Double.valueOf(((Number) h).doubleValue());
            }
            ghh.I("+" + h, "A Number is expected after a unary plus.", null);
            throw null;
        }
        if (gnsVar instanceof cns) {
            if (h instanceof Long) {
                return Long.valueOf(-((Number) h).longValue());
            }
            if (h instanceof Double) {
                return Double.valueOf(-((Number) h).doubleValue());
            }
            ghh.I("-" + h, "A Number is expected after a unary minus.", null);
            throw null;
        }
        if (!Intrinsics.d(gnsVar, dns.a)) {
            throw new khb(gnsVar + " was incorrectly parsed as a unary operator.", (Throwable) null);
        }
        if (h instanceof Boolean) {
            return Boolean.valueOf(!((Boolean) h).booleanValue());
        }
        String str = h instanceof String ? "'" : "";
        ghh.I("!" + str + h + str, "A Boolean is expected after a unary not.", null);
        throw null;
    }

    @Override // defpackage.jhb
    public final List b() {
        return this.h;
    }

    @Override // defpackage.jhb
    public final List c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghb)) {
            return false;
        }
        ghb ghbVar = (ghb) obj;
        return Intrinsics.d(this.d, ghbVar.d) && Intrinsics.d(this.e, ghbVar.e) && Intrinsics.d(this.f, ghbVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(this.e);
        return sb.toString();
    }
}
