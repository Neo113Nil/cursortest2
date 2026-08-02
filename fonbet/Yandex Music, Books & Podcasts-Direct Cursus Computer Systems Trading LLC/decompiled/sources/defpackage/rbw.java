package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.m0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class rbw {
    public final a0 a;
    public final m0 b;
    public final boolean c;
    public final boolean d;

    public rbw(a0 a0Var, m0 m0Var, boolean z, boolean z2) {
        a0Var.getClass();
        m0Var.getClass();
        this.a = a0Var;
        this.b = m0Var;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbw)) {
            return false;
        }
        rbw rbwVar = (rbw) obj;
        return Intrinsics.d(this.a, rbwVar.a) && Intrinsics.d(this.b, rbwVar.b) && this.c == rbwVar.c && this.d == rbwVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + k5r.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullState(playerState=");
        sb.append(this.a);
        sb.append(", updateDevice=");
        sb.append(this.b);
        sb.append(", active=");
        return v3w.g(sb, this.c, ", interceptIfNoOneActive=", this.d, ")");
    }
}
