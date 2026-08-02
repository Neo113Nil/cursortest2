package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m4q implements u3q {
    public final w6u a;
    public final gxc b;

    public m4q(w6u w6uVar, gxc gxcVar) {
        gxcVar.getClass();
        this.a = w6uVar;
        this.b = gxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4q)) {
            return false;
        }
        m4q m4qVar = (m4q) obj;
        return this.a.equals(m4qVar.a) && Intrinsics.d(this.b, m4qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedPlaybackVideoClipRadioEntity(id=" + this.a + ", fromData=" + this.b + ")";
    }
}
