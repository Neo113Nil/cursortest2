package defpackage;

import com.yandex.go.vault.analytics.VaultButtonAction;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x331 {
    public final VaultRarity a;
    public final VaultRarity b;
    public final int c;
    public final VaultButtonAction d;

    public x331(VaultRarity vaultRarity, VaultRarity vaultRarity2, int i, VaultButtonAction vaultButtonAction) {
        this.a = vaultRarity;
        this.b = vaultRarity2;
        this.c = i;
        this.d = vaultButtonAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x331)) {
            return false;
        }
        x331 x331Var = (x331) obj;
        return this.a == x331Var.a && this.b == x331Var.b && this.c == x331Var.c && this.d == x331Var.d;
    }

    public final int hashCode() {
        VaultRarity vaultRarity = this.a;
        int hashCode = (vaultRarity == null ? 0 : vaultRarity.hashCode()) * 31;
        VaultRarity vaultRarity2 = this.b;
        return this.d.hashCode() + oyr.b(this.c, (hashCode + (vaultRarity2 != null ? vaultRarity2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "VaultTappedPayload(previousVaultRarity=" + this.a + ", nextVaultRarity=" + this.b + ", keyAmount=" + this.c + ", buttonAction=" + this.d + Extension.C_BRAKE;
    }
}
