package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ufn {
    public final xgn a;
    public final boolean b;

    public ufn(xgn xgnVar, boolean z) {
        xgnVar.getClass();
        this.a = xgnVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufn)) {
            return false;
        }
        ufn ufnVar = (ufn) obj;
        return Intrinsics.d(this.a, ufnVar.a) && this.b == ufnVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RadioLangSettingWithSelection(langSetting=" + this.a + ", selected=" + this.b + ")";
    }
}
