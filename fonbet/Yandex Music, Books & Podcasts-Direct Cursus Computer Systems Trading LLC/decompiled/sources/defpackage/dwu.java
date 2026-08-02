package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dwu implements kwu {
    public final iwu a;
    public final String b;

    public dwu(iwu iwuVar, String str) {
        str.getClass();
        this.a = iwuVar;
        this.b = str;
    }

    @Override // defpackage.jwu
    public final iwu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwu)) {
            return false;
        }
        dwu dwuVar = (dwu) obj;
        return this.a.equals(dwuVar.a) && Intrinsics.d(this.b, dwuVar.b);
    }

    @Override // defpackage.kwu
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Pause(waveInfo=" + this.a + ", name=" + this.b + ")";
    }
}
