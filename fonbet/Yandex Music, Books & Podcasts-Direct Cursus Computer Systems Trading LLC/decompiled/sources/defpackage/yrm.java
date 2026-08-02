package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yrm implements df5 {
    public final Function0 a;
    public final int b;
    public final int c;
    public final String d;

    public yrm(int i, int i2, String str, Function0 function0) {
        function0.getClass();
        this.a = function0;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // defpackage.cf5
    public final int c() {
        return this.b;
    }

    @Override // defpackage.cf5
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrm)) {
            return false;
        }
        yrm yrmVar = (yrm) obj;
        return Intrinsics.d(this.a, yrmVar.a) && this.b == yrmVar.b && this.c == yrmVar.c && this.d.equals(yrmVar.d);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return this.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "PrimarySheetActionUiData(action=" + this.a + ", iconDrawable=" + this.b + ", text=" + this.c + ", testTag=" + this.d + ")";
    }
}
