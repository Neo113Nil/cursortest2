package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sy3 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final ActionButtonEntity d;

    public sy3(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, ActionButtonEntity actionButtonEntity) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = actionButtonEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy3)) {
            return false;
        }
        sy3 sy3Var = (sy3) obj;
        return this.a.equals(sy3Var.a) && jl40.l(this.b, sy3Var.b) && jl40.l(this.c, sy3Var.c) && this.d.equals(sy3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "SaveAutoTopupResultScreen(image=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", primaryButton=" + this.d + Extension.C_BRAKE;
    }
}
