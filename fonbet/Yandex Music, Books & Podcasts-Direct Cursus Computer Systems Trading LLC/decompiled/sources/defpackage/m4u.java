package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m4u {
    public final z9u a;
    public final x1u b;
    public final boolean c;

    public m4u(z9u z9uVar, x1u x1uVar, boolean z) {
        x1uVar.getClass();
        this.a = z9uVar;
        this.b = x1uVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4u)) {
            return false;
        }
        m4u m4uVar = (m4u) obj;
        return this.a.equals(m4uVar.a) && Intrinsics.d(this.b, m4uVar.b) && this.c == m4uVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoClipItem(uiData=");
        sb.append(this.a);
        sb.append(", videoClip=");
        sb.append(this.b);
        sb.append(", isLiked=");
        return ouj.r(sb, this.c, ")");
    }
}
