package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.model.GroupType;

/* loaded from: classes5.dex */
public final class v2u {
    public final Set a;
    public final GroupType b;

    public v2u(Set set, GroupType groupType) {
        this.a = set;
        this.b = groupType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2u)) {
            return false;
        }
        v2u v2uVar = (v2u) obj;
        return jl40.l(this.a, v2uVar.a) && this.b == v2uVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupKey(sources=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
