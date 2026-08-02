package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class ysy implements SerialDescriptor {
    public final SerialDescriptor a;

    public ysy(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Integer l = bvu0.l(10, str);
        if (l != null) {
            return l.intValue();
        }
        ny61.g(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        if (i >= 0) {
            return this.a;
        }
        vg10.m(b64.t(i, "Illegal index ", Extension.FIX_SPACE), h(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysy)) {
            return false;
        }
        ysy ysyVar = (ysy) obj;
        return jl40.l(this.a, ysyVar.a) && jl40.l(h(), ysyVar.h());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        if (i >= 0) {
            return EmptyList.a;
        }
        vg10.m(b64.t(i, "Illegal index ", Extension.FIX_SPACE), h(), " expects only non-negative indices");
        return null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final jl40 getKind() {
        return ovu0.h;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        vg10.m(b64.t(i, "Illegal index ", Extension.FIX_SPACE), h(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }
}
