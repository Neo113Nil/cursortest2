package defpackage;

import com.yandex.go.vault.analytics.VaultErrorNotificationType;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes14.dex */
public final class z231 {
    public final o7r0 a;
    public final pho b;
    public boolean c;

    public z231(o7r0 o7r0Var, pho phoVar) {
        this.a = o7r0Var;
        this.b = phoVar;
    }

    public final void a(VaultErrorNotificationType vaultErrorNotificationType, String str) {
        String lowerCase = vaultErrorNotificationType.toString().toLowerCase(Locale.ROOT);
        o7r0 o7r0Var = this.a;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("text", str);
        }
        o7r0Var.a.a("Vault.ErrorNotification.Shown", hashMap, 1, tse0.r("type", hashMap, lowerCase));
    }
}
