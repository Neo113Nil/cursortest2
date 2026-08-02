package defpackage;

import android.graphics.drawable.ShapeDrawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vir {
    public final boolean a;
    public final ShapeDrawable b;
    public final ywl c;
    public final u1m d;
    public final Integer e;

    public vir(boolean z, ShapeDrawable shapeDrawable, ywl ywlVar, u1m u1mVar, Integer num) {
        this.a = z;
        this.b = shapeDrawable;
        this.c = ywlVar;
        this.d = u1mVar;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vir)) {
            return false;
        }
        vir virVar = (vir) obj;
        return this.a == virVar.a && this.b.equals(virVar.b) && jl40.l(this.c, virVar.c) && jl40.l(this.d, virVar.d) && this.e.equals(virVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        ywl ywlVar = this.c;
        int hashCode2 = (hashCode + (ywlVar == null ? 0 : ywlVar.hashCode())) * 31;
        u1m u1mVar = this.d;
        return this.e.hashCode() + ((hashCode2 + (u1mVar != null ? u1mVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlexFullscreenPopupConfiguration(closeOnSlideDown=");
        sb.append(this.a);
        sb.append(", backgroundDrawable=");
        sb.append(this.b);
        sb.append(", document=");
        sb.append(this.c);
        sb.append(", query=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        return oo31.j(sb, this.e, Extension.C_BRAKE);
    }
}
