package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class qhv extends n351 {
    public final ldc c;
    public final float d;
    public final CharSequence e;
    public final ContentAlignment f;
    public final lvi0 g;
    public final ContentAlignment h;
    public final l690 i;
    public final String j;

    public qhv(ldc ldcVar, float f, CharSequence charSequence, ContentAlignment contentAlignment, lvi0 lvi0Var, ContentAlignment contentAlignment2, l690 l690Var, String str) {
        super("image", false, 14);
        this.c = ldcVar;
        this.d = f;
        this.e = charSequence;
        this.f = contentAlignment;
        this.g = lvi0Var;
        this.h = contentAlignment2;
        this.i = l690Var;
        this.j = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhv)) {
            return false;
        }
        qhv qhvVar = (qhv) obj;
        return jl40.l(this.c, qhvVar.c) && y7m.b(this.d, qhvVar.d) && jl40.l(this.e, qhvVar.e) && this.f == qhvVar.f && this.g.equals(qhvVar.g) && this.h == qhvVar.h && this.i.equals(qhvVar.i) && jl40.l(this.j, qhvVar.j);
    }

    public final int hashCode() {
        ldc ldcVar = this.c;
        int c = g8e.c(this.d, (ldcVar == null ? 0 : Long.hashCode(ldcVar.a)) * 31, 31);
        CharSequence charSequence = this.e;
        int hashCode = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((c + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ImageWidgetModel(backgroundColor=" + this.c + ", height=" + y7m.c(this.d) + ", text=" + ((Object) this.e) + ", textAlign=" + this.f + ", image=" + this.g + ", imageAlign=" + this.h + ", paddings=" + this.i + ", id=" + this.j + Extension.C_BRAKE;
    }
}
