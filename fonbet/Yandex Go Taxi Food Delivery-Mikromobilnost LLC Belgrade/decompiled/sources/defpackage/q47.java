package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;

/* loaded from: classes6.dex */
public final class q47 {
    public final ButtonOrientation a;
    public final List b;

    public /* synthetic */ q47(List list, int i) {
        this(ButtonOrientation.VERTICAL, (i & 2) != 0 ? EmptyList.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q47)) {
            return false;
        }
        q47 q47Var = (q47) obj;
        return this.a == q47Var.a && jl40.l(this.b, q47Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Buttons(orientation=" + this.a + ", items=" + this.b + Extension.C_BRAKE;
    }

    public q47(ButtonOrientation buttonOrientation, List list) {
        this.a = buttonOrientation;
        this.b = list;
    }

    public q47() {
        this((List) null, 3);
    }
}
