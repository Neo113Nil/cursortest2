package defpackage;

import com.yandex.go.vault.flexsdk.descriptors.widget.actions.VaultStoreErrorScreenPayload;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class w331 {
    public final String a;
    public final VaultStoreErrorScreenPayload b;

    public w331(String str, VaultStoreErrorScreenPayload vaultStoreErrorScreenPayload) {
        this.a = str;
        this.b = vaultStoreErrorScreenPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w331)) {
            return false;
        }
        w331 w331Var = (w331) obj;
        return jl40.l(this.a, w331Var.a) && jl40.l(this.b, w331Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VaultStorePayload(url=" + this.a + ", errorScreenConfig=" + this.b + Extension.C_BRAKE;
    }
}
