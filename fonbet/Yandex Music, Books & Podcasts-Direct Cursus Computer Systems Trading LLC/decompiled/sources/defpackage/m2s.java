package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m2s implements drf {
    public final nrf a;
    public final int b;
    public final ArrayList c;
    public final onq d;
    public final boolean e;

    public m2s(nrf nrfVar, int i, ArrayList arrayList, onq onqVar) {
        this.a = nrfVar;
        this.b = i;
        this.c = arrayList;
        this.d = onqVar;
        this.e = onqVar == null;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2s)) {
            return false;
        }
        m2s m2sVar = (m2s) obj;
        return this.a.equals(m2sVar.a) && this.b == m2sVar.b && this.c.equals(m2sVar.c) && Intrinsics.d(this.d, m2sVar.d);
    }

    public final int hashCode() {
        int b = dfi.b(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
        onq onqVar = this.d;
        return b + (onqVar == null ? 0 : onqVar.hashCode());
    }

    public final String toString() {
        return "TabsBlock(meta=" + this.a + ", selectedTabIndex=" + this.b + ", tabs=" + this.c + ", source=" + this.d + ")";
    }
}
