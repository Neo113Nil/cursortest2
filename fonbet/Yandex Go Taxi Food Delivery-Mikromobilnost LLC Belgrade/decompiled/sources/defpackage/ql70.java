package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes14.dex */
public final class ql70 {
    public final Orientation a;
    public final List b;

    public ql70(Orientation orientation, List list) {
        this.a = orientation;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql70)) {
            return false;
        }
        ql70 ql70Var = (ql70) obj;
        return this.a == ql70Var.a && jl40.l(this.b, ql70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Buttons(orientation=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }

    public ql70() {
        this(Orientation.VERTICAL, EmptyList.a);
    }
}
