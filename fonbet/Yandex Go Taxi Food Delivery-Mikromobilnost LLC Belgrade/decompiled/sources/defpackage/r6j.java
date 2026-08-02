package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.details.v1.ui.DetailsCardListItem;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r6j extends t6j {
    public final CharSequence a;
    public final CharSequence b;
    public final DetailsCardListItem.a c;
    public final Drawable d;
    public final sls e;

    public r6j() {
        this("", "", DetailsCardListItem.a.g, null, new bgc(12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6j)) {
            return false;
        }
        r6j r6jVar = (r6j) obj;
        return jl40.l(this.a, r6jVar.a) && jl40.l(this.b, r6jVar.b) && jl40.l(this.c, r6jVar.c) && jl40.l(this.d, r6jVar.d) && jl40.l(this.e, r6jVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        Drawable drawable = this.d;
        return this.e.hashCode() + ((hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Content(title=", ", subtitle=", ", style=");
        r.append(this.c);
        r.append(", icon=");
        r.append(this.d);
        r.append(", onClick=");
        return ly3.r(r, this.e, Extension.C_BRAKE);
    }

    public r6j(CharSequence charSequence, CharSequence charSequence2, DetailsCardListItem.a aVar, Drawable drawable, sls slsVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = aVar;
        this.d = drawable;
        this.e = slsVar;
    }
}
