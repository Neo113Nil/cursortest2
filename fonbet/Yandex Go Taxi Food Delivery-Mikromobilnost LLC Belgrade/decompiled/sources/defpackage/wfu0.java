package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wfu0 implements ygu0 {
    public final String a;
    public final SpannableStringBuilder b;
    public final String c;
    public final eiy d;
    public final eiy e;
    public final String f;

    public wfu0(String str, SpannableStringBuilder spannableStringBuilder, String str2, eiy eiyVar, eiy eiyVar2, String str3) {
        this.a = str;
        this.b = spannableStringBuilder;
        this.c = str2;
        this.d = eiyVar;
        this.e = eiyVar2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfu0)) {
            return false;
        }
        wfu0 wfu0Var = (wfu0) obj;
        return jl40.l(this.a, wfu0Var.a) && this.b.equals(wfu0Var.b) && jl40.l(this.c, wfu0Var.c) && jl40.l(this.d, wfu0Var.d) && jl40.l(this.e, wfu0Var.e) && jl40.l(this.f, wfu0Var.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StopGroupSection(id=" + this.a + ", title=" + ((Object) this.b) + ", actionDescription=" + this.c + ", prevLineType=" + this.d + ", lineType=" + this.e + ", contentDescription=" + this.f + Extension.C_BRAKE;
    }
}
