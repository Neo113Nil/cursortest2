package defpackage;

import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionOperationState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class zc8 {
    public final String a;
    public final String b;
    public final CardDeletionOperationState c;
    public final rbv d;
    public final String e;

    public zc8(String str, String str2, CardDeletionOperationState cardDeletionOperationState, rbv rbvVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = cardDeletionOperationState;
        this.d = rbvVar;
        this.e = str3;
    }

    public static zc8 a(zc8 zc8Var, CardDeletionOperationState cardDeletionOperationState, String str, int i) {
        String str2 = zc8Var.a;
        String str3 = zc8Var.b;
        rbv rbvVar = zc8Var.d;
        if ((i & 16) != 0) {
            str = zc8Var.e;
        }
        zc8Var.getClass();
        return new zc8(str2, str3, cardDeletionOperationState, rbvVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc8)) {
            return false;
        }
        zc8 zc8Var = (zc8) obj;
        return jl40.l(this.a, zc8Var.a) && jl40.l(this.b, zc8Var.b) && this.c == zc8Var.c && this.d.equals(zc8Var.d) && jl40.l(this.e, zc8Var.e);
    }

    public final int hashCode() {
        int c = ly3.c(this.d, (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        String str = this.e;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("CardDeletionState(cardId=", this.a, ", lastPanDigits=", this.b, ", deletionOperationState=");
        v.append(this.c);
        v.append(", headerImageModel=");
        v.append(this.d);
        v.append(", supportUrl=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }
}
