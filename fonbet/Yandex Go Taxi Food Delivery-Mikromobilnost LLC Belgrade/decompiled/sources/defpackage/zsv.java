package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zsv {
    public final String a;
    public final ThemedImageUrlEntity b;

    public zsv(String str, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsv)) {
            return false;
        }
        zsv zsvVar = (zsv) obj;
        return jl40.l(this.a, zsvVar.a) && this.b.equals(zsvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoButtonEntity(action=" + this.a + ", icon=" + this.b + Extension.C_BRAKE;
    }
}
