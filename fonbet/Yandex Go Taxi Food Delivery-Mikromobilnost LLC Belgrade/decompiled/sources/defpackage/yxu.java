package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yxu implements e6v {
    public final String a;
    public final String b;
    public final kdc c;
    public final Drawable d;
    public final kdc e;
    public final kdc f;
    public final uxu g;
    public final List h;

    public yxu(String str, String str2, kdc kdcVar, BitmapDrawable bitmapDrawable, kdc kdcVar2, kdc kdcVar3, uxu uxuVar, List list) {
        this.a = str;
        this.b = str2;
        this.c = kdcVar;
        this.d = bitmapDrawable;
        this.e = kdcVar2;
        this.f = kdcVar3;
        this.g = uxuVar;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxu)) {
            return false;
        }
        yxu yxuVar = (yxu) obj;
        return jl40.l(this.a, yxuVar.a) && jl40.l(this.b, yxuVar.b) && jl40.l(this.c, yxuVar.c) && jl40.l(this.d, yxuVar.d) && jl40.l(this.e, yxuVar.e) && jl40.l(this.f, yxuVar.f) && jl40.l(this.g, yxuVar.g) && jl40.l(this.h, yxuVar.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int d = smw0.d(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
        Drawable drawable = this.d;
        int hashCode = (d + (drawable == null ? 0 : drawable.hashCode())) * 31;
        kdc kdcVar = this.e;
        int d2 = smw0.d(this.f, (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31);
        uxu uxuVar = this.g;
        return this.h.hashCode() + ((d2 + (uxuVar != null ? uxuVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("HubFilterUiState(id=", this.a, ", text=", this.b, ", textColor=");
        v.append(this.c);
        v.append(", icon=");
        v.append(this.d);
        v.append(", iconColor=");
        v.append(this.e);
        v.append(", bgColor=");
        v.append(this.f);
        v.append(", action=");
        v.append(this.g);
        v.append(", availableFilters=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
