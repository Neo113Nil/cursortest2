package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tb6 {
    public final String a;
    public final Text b;
    public final Integer c;
    public final boolean d;
    public final sh6 e;
    public final String f;

    public tb6(String str, Text text, Integer num, boolean z, sh6 sh6Var, String str2) {
        this.a = str;
        this.b = text;
        this.c = num;
        this.d = z;
        this.e = sh6Var;
        this.f = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb6)) {
            return false;
        }
        tb6 tb6Var = (tb6) obj;
        return jl40.l(this.a, tb6Var.a) && jl40.l(this.b, tb6Var.b) && jl40.l(this.c, tb6Var.c) && this.d == tb6Var.d && this.e.equals(tb6Var.e) && this.f.equals(tb6Var.f);
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.e(unr0.e((c + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, true)) * 31);
    }

    public final String toString() {
        return "BottomBarTabState(id=" + this.a + ", text=" + this.b + ", iconId=" + this.c + ", isTabSelected=" + this.d + ", shouldChangeTabColor=true, action=" + this.e + ", educationViewTag=" + this.f + Extension.C_BRAKE;
    }
}
