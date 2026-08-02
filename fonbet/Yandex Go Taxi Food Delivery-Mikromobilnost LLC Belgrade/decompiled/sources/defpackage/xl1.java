package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class xl1 implements zl1 {
    public static final xl1 d = new xl1(0);
    public final String a;
    public final boolean b;
    public final boolean c;

    public xl1(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl1)) {
            return false;
        }
        xl1 xl1Var = (xl1) obj;
        return jl40.l(this.a, xl1Var.a) && this.b == xl1Var.b && this.c == xl1Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("Native(title=", this.a, ", allowShowingChatHistoryButton=", ", allowShowingNewChatsButton=", this.b), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ xl1(int i) {
        this(null, true, true);
    }

    public xl1() {
        this(0);
    }
}
