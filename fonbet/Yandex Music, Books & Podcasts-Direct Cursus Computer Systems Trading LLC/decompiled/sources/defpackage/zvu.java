package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zvu implements jwu {
    public final iwu a;
    public final boolean b;
    public final String c;

    public zvu(iwu iwuVar, boolean z, String str) {
        this.a = iwuVar;
        this.b = z;
        this.c = str;
    }

    @Override // defpackage.jwu
    public final iwu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvu)) {
            return false;
        }
        zvu zvuVar = (zvu) obj;
        return this.a.equals(zvuVar.a) && this.b == zvuVar.b && Intrinsics.d(this.c, zvuVar.c);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Launching(waveInfo=");
        sb.append(this.a);
        sb.append(", playWhenReady=");
        sb.append(this.b);
        sb.append(", name=");
        return su4.o(sb, this.c, ")");
    }
}
