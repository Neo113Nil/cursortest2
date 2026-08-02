package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jzl implements mzl {
    public final zf4 a;
    public final mqs b;

    public jzl(zf4 zf4Var, mqs mqsVar) {
        mqsVar.getClass();
        this.a = zf4Var;
        this.b = mqsVar;
    }

    @Override // defpackage.mzl
    public final mqs a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzl)) {
            return false;
        }
        jzl jzlVar = (jzl) obj;
        return this.a.equals(jzlVar.a) && Intrinsics.d(this.b, jzlVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChartTrack(chartTrackUiData=" + this.a + ", track=" + this.b + ")";
    }
}
