package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ewu implements kwu {
    public final iwu a;
    public final String b;

    public ewu(iwu iwuVar, String str) {
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
        if (!(obj instanceof ewu)) {
            return false;
        }
        ewu ewuVar = (ewu) obj;
        return this.a.equals(ewuVar.a) && Intrinsics.d(this.b, ewuVar.b);
    }

    @Override // defpackage.kwu
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Playing(waveInfo=" + this.a + ", name=" + this.b + ")";
    }
}
