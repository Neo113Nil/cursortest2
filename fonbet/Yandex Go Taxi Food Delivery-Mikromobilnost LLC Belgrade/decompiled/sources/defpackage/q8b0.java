package defpackage;

import com.ybsdk.widgets.common.bottomsheet.h;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q8b0 implements s8b0 {
    public final String a;
    public final h b;
    public final gab0 c;

    public q8b0(String str, h hVar, gab0 gab0Var) {
        this.a = str;
        this.b = hVar;
        this.c = gab0Var;
    }

    @Override // defpackage.s8b0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.s8b0
    public final h b() {
        return this.b;
    }

    public final gab0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8b0)) {
            return false;
        }
        q8b0 q8b0Var = (q8b0) obj;
        return this.a.equals(q8b0Var.a) && this.b.equals(q8b0Var.b) && this.c.equals(q8b0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SelectOption(associatedFilterId=" + tab0.a(this.a) + ", toolbarState=" + this.b + ", selectOptionViewState=" + this.c + Extension.C_BRAKE;
    }
}
