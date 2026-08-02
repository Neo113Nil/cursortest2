package defpackage;

import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class yt01 implements bu01 {
    public final boolean a;
    public final rtz0 b;

    public yt01(boolean z, rtz0 rtz0Var) {
        this.a = z;
        this.b = rtz0Var;
    }

    @Override // defpackage.bu01
    public final rtz0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt01)) {
            return false;
        }
        yt01 yt01Var = (yt01) obj;
        EmptyList emptyList = EmptyList.a;
        return emptyList.equals(emptyList) && this.a == yt01Var.a && this.b.equals(yt01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + unr0.e(31, 31, this.a);
    }

    @Override // defpackage.bu01
    public final boolean isBackButtonVisible() {
        return this.a;
    }

    public final String toString() {
        return "Error(recyclerItems=" + EmptyList.a + ", isBackButtonVisible=" + this.a + ", toolbarRightPart=" + this.b + Extension.C_BRAKE;
    }
}
