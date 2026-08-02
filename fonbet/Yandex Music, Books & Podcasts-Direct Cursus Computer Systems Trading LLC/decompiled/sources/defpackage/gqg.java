package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gqg {
    public final List a;
    public final String b;
    public final jyr c;

    public gqg(List list, String str, jyr jyrVar) {
        list.getClass();
        str.getClass();
        this.a = list;
        this.b = str;
        this.c = jyrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqg)) {
            return false;
        }
        gqg gqgVar = (gqg) obj;
        return Intrinsics.d(this.a, gqgVar.a) && Intrinsics.d(this.b, gqgVar.b) && this.c.equals(gqgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 961, 31, this.b);
    }

    public final String toString() {
        return "LocalizationConfig(supportedLanguages=" + this.a + ", forceLanguage=null, fallbackFavoritePlaylistTitle=" + this.b + ", newDisclaimersEnabled=" + this.c + ")";
    }
}
