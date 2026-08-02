package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qsz0 extends gc5 {
    public final TopButtonTag c;
    public final String d;
    public final rbv e;
    public final Text f;

    public qsz0(TopButtonTag topButtonTag, String str, rbv rbvVar, Text.Resource resource) {
        super(topButtonTag.name(), 2);
        this.c = topButtonTag;
        this.d = str;
        this.e = rbvVar;
        this.f = resource;
    }

    public final String c() {
        return this.d;
    }

    public final TopButtonTag d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsz0)) {
            return false;
        }
        qsz0 qsz0Var = (qsz0) obj;
        return this.c == qsz0Var.c && jl40.l(this.d, qsz0Var.d) && jl40.l(this.e, qsz0Var.e) && jl40.l(this.f, qsz0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.c.hashCode() * 31, 31, this.d);
        rbv rbvVar = this.e;
        int hashCode = (b + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        Text text = this.f;
        return hashCode + (text != null ? text.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarButtonViewItem(tag=" + this.c + ", action=" + this.d + ", image=" + this.e + ", contentDescription=" + this.f + Extension.C_BRAKE;
    }
}
