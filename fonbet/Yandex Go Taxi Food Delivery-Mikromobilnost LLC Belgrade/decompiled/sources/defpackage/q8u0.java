package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q8u0 {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final ActionButtonEntity d;

    public q8u0(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, ActionButtonEntity actionButtonEntity) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = actionButtonEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8u0)) {
            return false;
        }
        q8u0 q8u0Var = (q8u0) obj;
        return jl40.l(this.a, q8u0Var.a) && jl40.l(this.b, q8u0Var.b) && jl40.l(this.c, q8u0Var.c) && jl40.l(this.d, q8u0Var.d);
    }

    public final int hashCode() {
        ThemedImageUrlEntity themedImageUrlEntity = this.a;
        int b = unr0.b(unr0.b((themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode()) * 31, 31, this.b), 31, this.c);
        ActionButtonEntity actionButtonEntity = this.d;
        return b + (actionButtonEntity != null ? actionButtonEntity.hashCode() : 0);
    }

    public final String toString() {
        return "StatusInfoEntity(image=" + this.a + ", title=" + this.b + ", description=" + this.c + ", button=" + this.d + Extension.C_BRAKE;
    }
}
