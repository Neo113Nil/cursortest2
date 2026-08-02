package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wj1 {
    public final String a;
    public final String b;
    public final ThemedImageUrlEntity c;
    public final List d;

    public wj1(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, List list) {
        this.a = str;
        this.b = str2;
        this.c = themedImageUrlEntity;
        this.d = list;
    }

    public static wj1 a(wj1 wj1Var, ArrayList arrayList) {
        return new wj1(wj1Var.a, wj1Var.b, wj1Var.c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj1)) {
            return false;
        }
        wj1 wj1Var = (wj1) obj;
        return jl40.l(this.a, wj1Var.a) && jl40.l(this.b, wj1Var.b) && this.c.equals(wj1Var.c) && this.d.equals(wj1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xvz.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("AgreementEntity(id=", this.a, ", title=", this.b, ", logo=");
        v.append(this.c);
        v.append(", subscriptions=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
