package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m3r {
    public final boolean a;
    public final zsq b;

    public m3r(boolean z, zsq zsqVar) {
        zsqVar.getClass();
        this.a = z;
        this.b = zsqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3r)) {
            return false;
        }
        m3r m3rVar = (m3r) obj;
        return this.a == m3rVar.a && Intrinsics.d(this.b, m3rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SoundEvent(soundIsOn=" + this.a + ", analyticsInfo=" + this.b + ")";
    }
}
