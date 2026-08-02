package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class lmn {
    public final boolean a;
    public final kmn b;
    public final jmn c;
    public final tln d;
    public final tln e;

    public lmn(boolean z, kmn kmnVar, jmn jmnVar) {
        tln tlnVar = mmn.a;
        tln tlnVar2 = mmn.b;
        tlnVar.getClass();
        tlnVar2.getClass();
        this.a = z;
        this.b = kmnVar;
        this.c = jmnVar;
        this.d = tlnVar;
        this.e = tlnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmn)) {
            return false;
        }
        lmn lmnVar = (lmn) obj;
        return this.a == lmnVar.a && Intrinsics.d(this.b, lmnVar.b) && Intrinsics.d(this.c, lmnVar.c) && Intrinsics.d(this.d, lmnVar.d) && Intrinsics.d(this.e, lmnVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RecognitionUiConfig(isDarkTheme=" + this.a + ", typography=" + this.b + ", stringResources=" + this.c + ", lightColor=" + this.d + ", darkColor=" + this.e + ")";
    }
}
